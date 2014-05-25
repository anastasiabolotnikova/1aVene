import ee.ut.cs.akt.aktk.ast.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.plaf.nimbus.State;
import java.util.*;

public class Interpretator {

    static HashMap<String, Double> doubleMap = new HashMap<String, Double>();
    static HashMap<String, String> stringMap = new HashMap<String, String>();
    static HashMap<String, Boolean> boolMap = new HashMap<String, Boolean>();

    static HashMap<String, ArrayList<Double>> doubleArrayListMap  = new HashMap<String, ArrayList<Double>>();
    static HashMap<String, ArrayList<String>> stringArrayListMap = new HashMap<String, ArrayList<String>>();
    static HashMap<String, ArrayList<Boolean>> booleanArrayListMap = new HashMap<String, ArrayList<Boolean>>();
    static HashMap<String, ArrayList<Object>> mixedArrayListMap = new HashMap<String, ArrayList<Object>>();

    static HashMap<String, List<Double>> doubleListMap = new HashMap<String, List<Double>>();
    static HashMap<String, List<String>> stringListMap = new HashMap<String, List<String>>();
    static HashMap<String, List<Boolean>> booleanListMap = new HashMap<String, List<Boolean>>();

    public static AstNode createAst(String program) {
        List<Statement> laused = new ArrayList<Statement>();
        String[] statements = program.split(";");
        for (int i=0;i<statements.length;i++){
            ParseTree tree = createParseTree(statements[i]);
            AstNode ast = parseTreeToAst(tree);
            laused.add((Statement) ast);
        }

        return new Block(laused);
    }

    public static AstNode parseTreeToAst(ParseTree tree) {
        if (tree instanceof aVeneParser.ArvuliteraalRContext) {
            // tuleb arvestada, et tegemist võib olla täisarvu või murdarvuga
            if (tree.getText().contains(".")) {
                return new FloatingPointLiteral(Double.parseDouble(tree.getText()));
            }
            else {
                return new IntegerLiteral(Integer.parseInt(tree.getText()));
            }
        }
        else if (tree instanceof aVeneParser.MuutujaNimiRContext){
            return new Variable(tree.getText());
        }
        else if (tree instanceof aVeneParser.FunktsiooniValjakutseContext){
            String funkName = tree.getChild(0).getText();
            List<Expression> args = new ArrayList<Expression>();
            if (tree.getChild(2)==null){
                return new FunctionCall(funkName, args);
            }
            else {
                args.add((Expression) parseTreeToAst(tree.getChild(2)));
                return new FunctionCall(funkName, args);
            }
        }
        else if (tree instanceof aVeneParser.SoneliteraalRContext) {
            // arvesta, et sõneliteraalil on ümber jutumärgid, mis ei kuulu sõne sisu hulka
            String sone = tree.getChild(0).getText();
            return new StringLiteral(sone.substring(1,sone.length()-1));
        }
        else if (tree instanceof aVeneParser.SuluavaldisContext) {
            // Selle tipu alluvad on alustav sulg, avaldis ja lõpetav sulg
            // NB! Alluvate nummerdamine algab 0-st

            // töötleme rekursiivselt sulgude sees oleva avaldise ja tagastame selle
            return parseTreeToAst(tree.getChild(1));
        }
        else if (tree instanceof aVeneParser.KorrutamineJagamineContext
                || tree instanceof aVeneParser.LiitmineLahutamineContext
                || tree instanceof aVeneParser.VordlemineContext
                || tree instanceof aVeneParser.JagamineJagatisegaContext) {
            // kõik binaarsed operatsioonid saan käsitleda korraga
            String operaator = tree.getChild(1).getText();
            Expression vasakArgument = (Expression) parseTreeToAst(tree.getChild(0));
            Expression paremArgument = (Expression) parseTreeToAst(tree.getChild(2));

            return new FunctionCall(operaator, Arrays.asList(vasakArgument, paremArgument));
        }
        else if (tree instanceof aVeneParser.IfLauseContext){
            Expression condition = (Expression) parseTreeToAst(tree.getChild(1));
            Statement then = (Statement) parseTreeToAst(tree.getChild(3));
            Statement elsest = (Statement) parseTreeToAst(tree.getChild(5));
            return new IfStatement(condition,then,elsest);
        }

        else if(tree instanceof aVeneParser.WhileLauseContext){
            Expression condition = (Expression) parseTreeToAst(tree.getChild(1));
            Statement body = (Statement) parseTreeToAst(tree.getChild(2));
            return new WhileStatement(condition,body);
        }

        else if(tree instanceof aVeneParser.ForLauseContext){
            Statement declaration = (Statement) parseTreeToAst(tree.getChild(0));
            Expression expression = (Expression) parseTreeToAst(tree.getChild(1));
            Expression update = (Expression) parseTreeToAst(tree.getChild(2));
            Statement body = (Statement) parseTreeToAst(tree.getChild(3));
            //return new ForStatement(0,declaration,expression,update,body);
        }
        else if (tree instanceof aVeneParser.MuutujaDeklaratsioonContext) {
            // Muutuja deklaratsiooni esimene alluv (st. alluv 0) on võtmesõna "var",
            // teine alluv on muutuja nimi

            // Algväärtus võib olla, aga ei pruugi.
            // Kontrolli ANTLRi IntelliJ pluginaga järgi, mitu alluvat
            // on muutuja deklaratsioonil, millel on algväärtus ja mitu
            // alluvat on sellel, millel algväärtust pole.
            Variable muutujanimi = new Variable(tree.getChild(1).getText());
            if (tree.getChild(2)!=null) {
                Expression muutujavaartus = (Expression) parseTreeToAst(tree.getChild(3));
                // String for determining type of new variable
                String type = muutujavaartus.toString();

                if(variableTypeRecognizer(type)==1){
                    doubleMap.put(muutujanimi.toString(),Double.parseDouble(type));
                }
                else if(variableTypeRecognizer(type)==2){
                    stringMap.put(muutujanimi.toString(),type);
                }
                else if(variableTypeRecognizer(type)==3){
                    boolMap.put(muutujanimi.toString(),slavicBool(type));
                }
                else{
                    // handle error
                }
                return new VariableDeclaration(muutujanimi.getName(), muutujavaartus);
            }else{
                return new VariableDeclaration(muutujanimi.getName(), null);
            }
        }
        else if (tree instanceof aVeneParser.OmistamineContext) {
            Variable muutujanimi = new Variable(tree.getChild(0).getText());
            Expression muutujavaartus = (Expression) parseTreeToAst(tree.getChild(2));
            varSearch(muutujanimi,muutujavaartus);
            return new Assignment(muutujanimi.getName(), muutujavaartus);
        }
        else if (tree instanceof aVeneParser.LauseContext) {
            // grammatikast on näha, et lause võib olla ühe alluvaga,
            // (nt. ifLause, whileLause), mis on käsitletud mujal
            if (tree.getChildCount() == 1) {
                AstNode child = parseTreeToAst(tree.getChild(0));
                // ainuke asi mida tuleb jälgida,
                // on see, et kui lause koosneb avaldisest, siis selleks,
                // et temast saaks ikkagi lause,
                // tuleb ta pakendada ExpressionStatement'i sisse
                if (child instanceof Expression) {
                    return new ExpressionStatement((Expression) child);
                }
                else {
                    return child;
                }
            }
            // ... aga lause võib olla ka loogelistes sulgudes olev lausete jada
            else {
                assert tree.getChildCount() == 3;
                return parseTreeToAst(tree.getChild(1));
            }
        }

        else if (tree instanceof aVeneParser.LiitLahOmistamisegaContext){
            String tehe = tree.getChild(1).getText();
            Variable muutujanimi = new Variable(tree.getChild(0).getText());
            Expression vaartus = (Expression) parseTreeToAst(tree.getChild(2));

            if(doubleMap.containsKey(muutujanimi.toString())){
                double value;
                if(tehe.equals("+=")){
                    value = doubleMap.get(muutujanimi.toString()) + Double.parseDouble(vaartus.toString());

                }
                else{
                    value = doubleMap.get(muutujanimi.toString()) - Double.parseDouble(vaartus.toString());
                }

                final double newVal = value;
                doubleMap.remove(muutujanimi.toString());
                doubleMap.put(muutujanimi.toString(),newVal);
                Expression muutujavaartus = new Expression() {
                    @Override
                    public List<Object> getChildren() {
                        List<Object> list = new ArrayList<Object>();
                        list.set(0,newVal);
                        return list;
                    }
                } ;
                return new Assignment(muutujanimi.getName(), muutujavaartus);
            }
            else if(tree instanceof aVeneParser.ArrayContext){
                String arrayName = tree.getChild(1).getText();
                String firstArrayElement = tree.getChild(2).getText();
                arrayOrListFiller(1,arrayName,firstArrayElement,tree);
            }

            else if(tree instanceof aVeneParser.ListContext){
                String arrayName = tree.getChild(1).getText();
                String firstArrayElement = tree.getChild(2).getText();
                arrayOrListFiller(2,arrayName,firstArrayElement,tree);
            }

        }

        else if (tree instanceof aVeneParser.MixTypeArrayContext){
            ArrayList<Object> list = new ArrayList<Object>();
            for(int i = 2;tree.getChild(i)!=null;i++) {
                list.set(i - 2, Double.parseDouble(tree.getChild(i).getText()));
            }
            mixedArrayListMap.put(tree.getChild(1).getText(),list);
        }

        else if(tree instanceof aVeneParser.LauseteJadaContext){
            for(int i=0;tree.getChild(i)!=null;i++){
                return parseTreeToAst(tree.getChild(i));
            }
        }

        else if(tree instanceof aVeneParser.UnaarneMiinusContext){
            if(isDouble(tree.getChild(1).toString())){
             final double oldValue = Double.parseDouble(tree.getChild(1).toString());
             Expression newValue = new Expression() {
                 @Override
                 public List<Object> getChildren() {
                     List<Object> list = new ArrayList<Object>();
                     list.set(0,oldValue*(-1));
                     return list;
                 }
             };
                return new Assignment(tree.getChild(1).toString(), newValue);
            }
            else{
                //not numeric
            }
        }

        else if(tree instanceof aVeneParser.MassiiviKasutamineContext){
            int elementNumber = Integer.parseInt(tree.getChild(2).toString());

            if(doubleListMap.containsKey(tree.getChild(0).toString())){
                double value = doubleListMap.get(tree.getChild(0).toString()).get(elementNumber);
            }
            else if(doubleArrayListMap.containsKey(tree.getChild(0).toString())){
                double value = doubleArrayListMap.get(tree.getChild(0).toString()).get(elementNumber);
            }
            else if(stringListMap.containsKey(tree.getChild(0).toString())){
                String value = stringListMap.get(tree.getChild(0).toString()).get(elementNumber);
            }
            else if(stringArrayListMap.containsKey(tree.getChild(0).toString())) {
                String value = stringArrayListMap.get(tree.getChild(0).toString()).get(elementNumber);
            }
            else if(mixedArrayListMap.containsKey(tree.getChild(0).toString())){
                Object value = mixedArrayListMap.get(tree.getChild(0).toString()).get(elementNumber);
            }
            else if(booleanListMap.containsKey(tree.getChild(0).toString())){
                boolean value = booleanArrayListMap.get(tree.getChild(0).toString()).get(elementNumber);
            }
            else if(booleanArrayListMap.containsKey(tree.getChild(0).toString())){
               boolean value = booleanArrayListMap.get(tree.getChild(0).toString()).get(elementNumber);
            }
          // return value;
        }

        else {
            // Järele peaks olema jäänud (kui sa lisasid ülespoole ka puuduvad olulised juhtumid)
            // ainult need tiputüübid, millel on ainult
            // üks alluv ja mis olid olulised vaid parsimise jaoks.
            // Järelikult meil pole abstraktsesse süntaksipuusse neile vastavaid
            // tippe tarvis ja me liigume kohe nende alluva juurde
            return parseTreeToAst(tree.getChild(0));
        }
        return null;
    }

    public static ParseTree createParseTree(String program) {
        ANTLRInputStream antlrInput = new ANTLRInputStream(program);
        aVeneLexer lexer = new aVeneLexer(antlrInput);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        aVeneParser parser = new aVeneParser(tokens);
        ParseTree tree = parser.programm();
        //System.out.println(tree.toStringTree(parser));
        return tree;
    }

    static int evaluate(ParseTree tree) {

        // Tipp tüübiga ArvuliteraalRContext vastab grammatikas
        // märgendile ArvuliteraalR.
        // Siin tuleb lihtsalt küsida selle tipu tekst ja teisendada
        // see täisarvuks
        if (tree instanceof aVeneParser.ArvuliteraalRContext) {
            return Integer.parseInt(tree.getText());
        }

        // Järgmise juhtumi mõistmiseks otsi grammatikast üles
        // sildid KorrutamineJagamine ja LiitmineLahutamine --
        // loodetavasti on siis arusaadav, miks siin just nii toimitakse.
        else if (tree instanceof aVeneParser.KorrutamineJagamineContext
                || tree instanceof aVeneParser.LiitmineLahutamineContext
                || tree instanceof aVeneParser.JagamineJagatisegaContext) {

            // küsin tipu alluvad
            ParseTree leftChild = tree.getChild(0);
            Character operator = tree.getChild(1).getText().charAt(0);
            ParseTree rightChild = tree.getChild(2);

            // väärtustan rekursiivselt
            int leftValue = evaluate(leftChild);
            int rightValue = evaluate(rightChild);

            // väärtustan terve operatsiooni
            switch (operator) {
                case '+':
                    return leftValue + rightValue;
                case '-':
                    return leftValue - rightValue;
                case '*':
                    return leftValue * rightValue;
                case '/':
                    return leftValue / rightValue;
                case '%':
                    return leftValue % rightValue;
                default:
                    throw new RuntimeException("Tundmatu operaator");
            }
        }

        // Järgmine juhtum käsitleb vahetippe, mis antud ülesande
        // puhul tähtsat rolli ei mängi. Vaata jälle näidisavaldise
        // parse-puu graafilist esitust -- kui me alustame juurtipust,
        // siis me peame nende vahetippude (lause, avaldis, avaldis5, jne)
        // kaudu jõudma millegi huvitavani. Õnneks on kõigil nendel tiputüüpidel
        // (lihtsate programmide) puhul täpselt 1 alluv ja seetõttu saame
        // kõiki neid käsitleda sama skeemiga.
        else if (tree.getChildCount() == 1) {
            return evaluate(tree.getChild(0));
        }

        // Kui me satume mingi muu tipu juurde, siis anname praegu vea,
        // sest antud ülesandes ei üritagi me toetada kõiki legaalseid
        // AKTK programme.
        else {
            throw new UnsupportedOperationException
                    ("Selle tiputüübi väärtustamine ei ole praegu toetatud");
        }

    }

    public static boolean isDouble(String string){
        try{
            Double.parseDouble(string);
            return true;
        }
        catch( Exception e){
            return false;
        }
    }

    // This method gets boolean variable value and determines is't true/false
    public static boolean slavicBool(String string){
        if(string.equals("истина")){
            return true;
        }
        else{
            return false;
        }
    }


    public static void varSearch(Variable muutujanimi,Expression muutujavaartus){
        // Search for double variable
        if(doubleMap.containsKey(muutujanimi.toString())){
            doubleMap.remove(muutujanimi.toString());
            doubleMap.put(muutujanimi.toString(), Double.parseDouble(muutujavaartus.toString()));
        }

        // Search for string variable
        else if(stringMap.containsKey(muutujanimi.toString())){
            stringMap.remove(muutujanimi.toString());
            stringMap.put(muutujanimi.toString(),muutujavaartus.toString());
        }

        // Search for boolean variable
        else if(boolMap.containsKey(muutujanimi.toString())){
            boolMap.remove(muutujanimi.toString());
            boolMap.put(muutujanimi.toString(),slavicBool(muutujavaartus.toString()));
        }

    }

    // This method gets variable value and returns integer:
    // 1 - for double
    // 2 - for string
    // 3 - for booolean
    public static int variableTypeRecognizer(String varValue){
        // Check if double
        if(isDouble(varValue)){
            return 1;
        }
        // Check if string
        else if(varValue.charAt(0)=='\"'){
            return 2;
        }
        // Check if boolean
        else if(varValue.equals("истина")||varValue.equals("ложь")){
            return 3;
        }
        else{
            // handle error
            return 0;
        }
    }

    // This method fills array map or list map depending on int:
    // 1 - fills array map
    // 2 - fills list map
    public static void arrayOrListFiller(int type, String arrayName, String firstArrayElement,ParseTree tree){
        if(variableTypeRecognizer(firstArrayElement)==1){
            // Create integer array
            ArrayList<Double> list = new ArrayList<Double>();
            // Fill an array
            for(int i = 2;tree.getChild(i)!=null;i++){
                if(variableTypeRecognizer(tree.getChild(i).getText())!=1){
                    // Given array has not only doubles
                }
                else {
                    list.set(i - 2, Double.parseDouble(tree.getChild(i).getText()));
                }
            }
            if(type==1){
                doubleArrayListMap.put(arrayName,list);
            }
            else {
                doubleListMap.put(arrayName,list);
            }

        }
        else if(variableTypeRecognizer(firstArrayElement)==2){
            // Create string array
            ArrayList<String> list = new ArrayList<String>();
            // Fill an array
            for(int i = 2;tree.getChild(i)!=null;i++){
                if(variableTypeRecognizer(tree.getChild(i).getText())!=2){
                    // Given array has not only strings
                }
                else {
                    list.set(i - 2, tree.getChild(i).getText());
                }
            }
            if(type==1){
                stringArrayListMap.put(arrayName,list);
            }
            else {
                stringListMap.put(arrayName,list);
            }
        }

        else if(variableTypeRecognizer(firstArrayElement)==3){
            // Create boolean array
            ArrayList<Boolean> list = new ArrayList<Boolean>();
            // Fill an array
            for(int i = 2;tree.getChild(i)!=null;i++){
                if(variableTypeRecognizer(tree.getChild(i).getText())!=3){
                    // Given array has not only booleans
                }
                else {
                    list.set(i - 2, slavicBool(tree.getChild(i).getText()));
                }
            }
            if(type==1){
                booleanArrayListMap.put(arrayName,list);
            }
            else {
                booleanListMap.put(arrayName,list);
            }
        }

        else {
            // Create variable array
        }
    }
}
