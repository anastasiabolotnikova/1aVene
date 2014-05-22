grammar aVene;

CYRILLIC_RANGE : '\u0400'..'\u04FF' ;

programm
    :   lauseteJada
    ;

lauseteJada
    :   lause (';' lause)*
    ;

lause
    :   ifLause
    |   whileLause
    |   forLause
    |   omistamine
    |   muutujaDeklaratsioon
    |   avaldis
    |   array
    |   list
    |   mixTypeArray
    ;

ifLause
    :   ('ежели'|'ЕЖЕЛИ'|'Ежели') '('avaldis')' ('тогда'|'ТОГДА'|'Тогда') '{'lauseteJada'}' ('иначе'|'ИНАЧЕ'|'Иначе') '{'lauseteJada'}'
    ;

whileLause
    :   ('доколе'|'ДОКОЛЕ'|'Доколе') '('avaldis')' '{'lauseteJada'}'
    ;

forLause
    :   ('покаместъ'|'ПОКАМЕСТЪ'|'Покаместъ') '(' muutujaDeklaratsioon ';' avaldis ';' avaldis')' '{'lauseteJada'}'
    ;

omistamine
    :   MuutujaNimi '=' avaldis
//	|	array '=' '[' ((Soneliteraal (',' Soneliteraal)*)| (Arvuliteraal (',' Arvuliteraal)*)| (MuutujaNimi (',' MuutujaNimi)*))? ']'
//	|	list '=' '[|' ((Soneliteraal (',' Soneliteraal)*)| (Arvuliteraal (',' Arvuliteraal)*)| (MuutujaNimi (',' MuutujaNimi)*))? '|]'
//	|	mixTypeArray '=' '[' (Soneliteraal|Arvuliteraal|MuutujaNimi)? (',' Soneliteraal|',' Arvuliteraal|',' MuutujaNimi)* ']'
    ;

muutujaDeklaratsioon
    :   ('аргумент'|'АРГУМЕНТ'|'Аргумент') MuutujaNimi ('=' avaldis)?
    ;

array
    :   ('сборище'|'СБОРИЩЕ'|'Сборище') MuutujaNimi ('=' '[' ((Soneliteraal (',' Soneliteraal)*)| (Arvuliteraal (',' Arvuliteraal)*)| (MuutujaNimi (',' MuutujaNimi)*))? ']')?
    ;

list
    :   ('перечень'|'ПЕРЕЧЕНЬ'|'Перечень') MuutujaNimi ('=' '[|' ((Soneliteraal (',' Soneliteraal)*)| (Arvuliteraal (',' Arvuliteraal)*)| (MuutujaNimi (',' MuutujaNimi)*))? '|]')?
    ;

mixTypeArray
    :   ('скопище'|'СКОПИЩЕ'|'Скопище') MuutujaNimi ('=' '[' (Soneliteraal|Arvuliteraal|MuutujaNimi)? (',' Soneliteraal|',' Arvuliteraal|',' MuutujaNimi)* ']')?
    ;

avaldis
    :   avaldis6
    ;

avaldis6
    :   avaldis5 ('>'|'<'|'>='|'<='|'=='|'!=') avaldis5 # Vordlemine
    |   avaldis5                                        # TriviaalneAvaldis6
    ;

avaldis5
    :   avaldis5 ('+='|'-=') avaldis4                   # LiitLahOmistamisega
    |   avaldis4                                        # TriviaalneAvaldis5
    ;

avaldis4
    :   avaldis4 ('+'|'-') avaldis3                     # LiitmineLahutamine
    |   avaldis3                                        # TriviaalneAvaldis4
    ;

avaldis3
    :   avaldis3 ('*'|'/') avaldis2                     # KorrutamineJagamine
	|	avaldis3 '%' avaldis2							# JagamineJagatisega
    |   avaldis2                                        # TriviaalneAvaldis3
    ;

avaldis2
    :   '-' avaldis2                                    # UnaarneMiinus
    |   avaldis1                                        # TriviaalneAvaldis2
    ;

avaldis1
    :   MuutujaNimi '(' (avaldis (',' avaldis)*)? ')'   # FunktsiooniValjakutse
    |   avaldis0                                        # TriviaalneAvaldis1
    ;

avaldis0
    :   MuutujaNimi     # MuutujaNimiR      // Lisasin nende margendite nimede
    |   Arvuliteraal    # ArvuliteraalR     // loppu R, et need ei langeks kokku
    |   Soneliteraal    # SoneliteraalR     // lekseri reeglite nimedega.
    |   Boolean         # BooleanR
    |   '(' avaldis ')' # Suluavaldis
    ;

MuutujaNimi
    :   [а-яА-Я][а-яА-Я0-9_]*
    ;

Boolean
    :    'истина'
    |    'ложь'
    ;
Arvuliteraal
    :   ('0'|[1-9][0-9]*)('.'[0-9]+)?
    ;

Soneliteraal
    :   '"' ~["\n\r]* '"' // Tildega saab valjendada eitust.
    ;                     // Siin ~["\n\r] tahistab suvalist tahte
                          // mis pole jutumark ega reavahetuse sumbol.

Kommentaar
    :   '/*' .*? '*/' -> skip
    ;

Whitespace
    :   [ \t\r\n]+ -> skip
    ;