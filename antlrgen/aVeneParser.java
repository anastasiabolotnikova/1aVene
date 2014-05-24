package antlrgen;// Generated from aVene.g4 by ANTLR 4.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

import antlrgen.aVeneListener;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class aVeneParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__50=1, T__49=2, T__48=3, T__47=4, T__46=5, T__45=6, T__44=7, T__43=8, 
		T__42=9, T__41=10, T__40=11, T__39=12, T__38=13, T__37=14, T__36=15, T__35=16, 
		T__34=17, T__33=18, T__32=19, T__31=20, T__30=21, T__29=22, T__28=23, 
		T__27=24, T__26=25, T__25=26, T__24=27, T__23=28, T__22=29, T__21=30, 
		T__20=31, T__19=32, T__18=33, T__17=34, T__16=35, T__15=36, T__14=37, 
		T__13=38, T__12=39, T__11=40, T__10=41, T__9=42, T__8=43, T__7=44, T__6=45, 
		T__5=46, T__4=47, T__3=48, T__2=49, T__1=50, T__0=51, MuutujaNimi=52, 
		Boolean=53, Arvuliteraal=54, Soneliteraal=55, Kommentaar=56, Whitespace=57;
	public static final String[] tokenNames = {
		"<INVALID>", "'Покаместъ'", "'['", "'*'", "'<'", "'!='", "'<='", "'СБОРИЩЕ'", 
		"'ПОКАМЕСТЪ'", "'сборище'", "'доколе'", "'}'", "'%'", "')'", "'='", "'[|'", 
		"'Иначе'", "'аргумент'", "'ПЕРЕЧЕНЬ'", "'СКОПИЩЕ'", "'Сборище'", "'тогда'", 
		"'перечень'", "']'", "'-='", "','", "'-'", "'('", "'Аргумент'", "'ИНАЧЕ'", 
		"'ДОКОЛЕ'", "'ЕЖЕЛИ'", "'АРГУМЕНТ'", "'|]'", "'{'", "'+='", "'покаместъ'", 
		"'+'", "'иначе'", "'Скопище'", "'Перечень'", "'Доколе'", "';'", "'>'", 
		"'Тогда'", "'скопище'", "'=='", "'ежели'", "'/'", "'>='", "'ТОГДА'", "'Ежели'", 
		"MuutujaNimi", "Boolean", "Arvuliteraal", "Soneliteraal", "Kommentaar", 
		"Whitespace"
	};
	public static final int
		RULE_programm = 0, RULE_lauseteJada = 1, RULE_lause = 2, RULE_ifLause = 3, 
		RULE_whileLause = 4, RULE_forLause = 5, RULE_array = 6, RULE_list = 7, 
		RULE_mixTypeArray = 8, RULE_omistamine = 9, RULE_muutujaDeklaratsioon = 10, 
		RULE_avaldis = 11, RULE_avaldis6 = 12, RULE_avaldis5 = 13, RULE_avaldis4 = 14, 
		RULE_avaldis3 = 15, RULE_avaldis2 = 16, RULE_avaldis1 = 17, RULE_avaldis0 = 18;
	public static final String[] ruleNames = {
		"programm", "lauseteJada", "lause", "ifLause", "whileLause", "forLause", 
		"array", "list", "mixTypeArray", "omistamine", "muutujaDeklaratsioon", 
		"avaldis", "avaldis6", "avaldis5", "avaldis4", "avaldis3", "avaldis2", 
		"avaldis1", "avaldis0"
	};

	@Override
	public String getGrammarFileName() { return "aVene.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public aVeneParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammContext extends ParserRuleContext {
		public LauseteJadaContext lauseteJada() {
			return getRuleContext(LauseteJadaContext.class,0);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitProgramm(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); lauseteJada();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LauseteJadaContext extends ParserRuleContext {
		public LauseContext lause(int i) {
			return getRuleContext(LauseContext.class,i);
		}
		public List<LauseContext> lause() {
			return getRuleContexts(LauseContext.class);
		}
		public LauseteJadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lauseteJada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterLauseteJada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitLauseteJada(this);
		}
	}

	public final LauseteJadaContext lauseteJada() throws RecognitionException {
		LauseteJadaContext _localctx = new LauseteJadaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lauseteJada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); lause();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==42) {
				{
				{
				setState(41); match(42);
				setState(42); lause();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LauseContext extends ParserRuleContext {
		public MuutujaDeklaratsioonContext muutujaDeklaratsioon() {
			return getRuleContext(MuutujaDeklaratsioonContext.class,0);
		}
		public MixTypeArrayContext mixTypeArray() {
			return getRuleContext(MixTypeArrayContext.class,0);
		}
		public WhileLauseContext whileLause() {
			return getRuleContext(WhileLauseContext.class,0);
		}
		public ForLauseContext forLause() {
			return getRuleContext(ForLauseContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public OmistamineContext omistamine() {
			return getRuleContext(OmistamineContext.class,0);
		}
		public IfLauseContext ifLause() {
			return getRuleContext(IfLauseContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public LauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterLause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitLause(this);
		}
	}

	public final LauseContext lause() throws RecognitionException {
		LauseContext _localctx = new LauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lause);
		try {
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); ifLause();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); whileLause();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); forLause();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51); omistamine();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52); muutujaDeklaratsioon();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53); avaldis();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54); array();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(55); list();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(56); mixTypeArray();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfLauseContext extends ParserRuleContext {
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public LauseteJadaContext lauseteJada(int i) {
			return getRuleContext(LauseteJadaContext.class,i);
		}
		public List<LauseteJadaContext> lauseteJada() {
			return getRuleContexts(LauseteJadaContext.class);
		}
		public IfLauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterIfLause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitIfLause(this);
		}
	}

	public final IfLauseContext ifLause() throws RecognitionException {
		IfLauseContext _localctx = new IfLauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifLause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 31) | (1L << 47) | (1L << 51))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(60); match(27);
			setState(61); avaldis();
			setState(62); match(13);
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 44) | (1L << 50))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(64); match(34);
			setState(65); lauseteJada();
			setState(66); match(11);
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 29) | (1L << 38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(68); match(34);
			setState(69); lauseteJada();
			setState(70); match(11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLauseContext extends ParserRuleContext {
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public LauseteJadaContext lauseteJada() {
			return getRuleContext(LauseteJadaContext.class,0);
		}
		public WhileLauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterWhileLause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitWhileLause(this);
		}
	}

	public final WhileLauseContext whileLause() throws RecognitionException {
		WhileLauseContext _localctx = new WhileLauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileLause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 10) | (1L << 30) | (1L << 41))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(73); match(27);
			setState(74); avaldis();
			setState(75); match(13);
			setState(76); match(34);
			setState(77); lauseteJada();
			setState(78); match(11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLauseContext extends ParserRuleContext {
		public MuutujaDeklaratsioonContext muutujaDeklaratsioon() {
			return getRuleContext(MuutujaDeklaratsioonContext.class,0);
		}
		public List<AvaldisContext> avaldis() {
			return getRuleContexts(AvaldisContext.class);
		}
		public LauseteJadaContext lauseteJada() {
			return getRuleContext(LauseteJadaContext.class,0);
		}
		public AvaldisContext avaldis(int i) {
			return getRuleContext(AvaldisContext.class,i);
		}
		public ForLauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterForLause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitForLause(this);
		}
	}

	public final ForLauseContext forLause() throws RecognitionException {
		ForLauseContext _localctx = new ForLauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forLause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 8) | (1L << 36))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(81); match(27);
			setState(82); muutujaDeklaratsioon();
			setState(83); match(42);
			setState(84); avaldis();
			setState(85); match(42);
			setState(86); avaldis();
			setState(87); match(13);
			setState(88); match(34);
			setState(89); lauseteJada();
			setState(90); match(11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> MuutujaNimi() { return getTokens(aVeneParser.MuutujaNimi); }
		public TerminalNode Soneliteraal(int i) {
			return getToken(aVeneParser.Soneliteraal, i);
		}
		public TerminalNode Arvuliteraal(int i) {
			return getToken(aVeneParser.Arvuliteraal, i);
		}
		public TerminalNode MuutujaNimi(int i) {
			return getToken(aVeneParser.MuutujaNimi, i);
		}
		public List<TerminalNode> Arvuliteraal() { return getTokens(aVeneParser.Arvuliteraal); }
		public List<TerminalNode> Soneliteraal() { return getTokens(aVeneParser.Soneliteraal); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 9) | (1L << 20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(93); match(MuutujaNimi);
			setState(123);
			_la = _input.LA(1);
			if (_la==14) {
				{
				setState(94); match(14);
				setState(95); match(2);
				setState(120);
				switch (_input.LA(1)) {
				case Soneliteraal:
					{
					{
					setState(96); match(Soneliteraal);
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(97); match(25);
						setState(98); match(Soneliteraal);
						}
						}
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case Arvuliteraal:
					{
					{
					setState(104); match(Arvuliteraal);
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(105); match(25);
						setState(106); match(Arvuliteraal);
						}
						}
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case MuutujaNimi:
					{
					{
					setState(112); match(MuutujaNimi);
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(113); match(25);
						setState(114); match(MuutujaNimi);
						}
						}
						setState(119);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case 23:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); match(23);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public List<TerminalNode> MuutujaNimi() { return getTokens(aVeneParser.MuutujaNimi); }
		public TerminalNode Soneliteraal(int i) {
			return getToken(aVeneParser.Soneliteraal, i);
		}
		public TerminalNode Arvuliteraal(int i) {
			return getToken(aVeneParser.Arvuliteraal, i);
		}
		public TerminalNode MuutujaNimi(int i) {
			return getToken(aVeneParser.MuutujaNimi, i);
		}
		public List<TerminalNode> Arvuliteraal() { return getTokens(aVeneParser.Arvuliteraal); }
		public List<TerminalNode> Soneliteraal() { return getTokens(aVeneParser.Soneliteraal); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 18) | (1L << 22) | (1L << 40))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(126); match(MuutujaNimi);
			setState(156);
			_la = _input.LA(1);
			if (_la==14) {
				{
				setState(127); match(14);
				setState(128); match(15);
				setState(153);
				switch (_input.LA(1)) {
				case Soneliteraal:
					{
					{
					setState(129); match(Soneliteraal);
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(130); match(25);
						setState(131); match(Soneliteraal);
						}
						}
						setState(136);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case Arvuliteraal:
					{
					{
					setState(137); match(Arvuliteraal);
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(138); match(25);
						setState(139); match(Arvuliteraal);
						}
						}
						setState(144);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case MuutujaNimi:
					{
					{
					setState(145); match(MuutujaNimi);
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(146); match(25);
						setState(147); match(MuutujaNimi);
						}
						}
						setState(152);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case 33:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155); match(33);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixTypeArrayContext extends ParserRuleContext {
		public List<TerminalNode> MuutujaNimi() { return getTokens(aVeneParser.MuutujaNimi); }
		public TerminalNode Soneliteraal(int i) {
			return getToken(aVeneParser.Soneliteraal, i);
		}
		public TerminalNode Arvuliteraal(int i) {
			return getToken(aVeneParser.Arvuliteraal, i);
		}
		public TerminalNode MuutujaNimi(int i) {
			return getToken(aVeneParser.MuutujaNimi, i);
		}
		public List<TerminalNode> Arvuliteraal() { return getTokens(aVeneParser.Arvuliteraal); }
		public List<TerminalNode> Soneliteraal() { return getTokens(aVeneParser.Soneliteraal); }
		public MixTypeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixTypeArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterMixTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitMixTypeArray(this);
		}
	}

	public final MixTypeArrayContext mixTypeArray() throws RecognitionException {
		MixTypeArrayContext _localctx = new MixTypeArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mixTypeArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 19) | (1L << 39) | (1L << 45))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(159); match(MuutujaNimi);
			setState(177);
			_la = _input.LA(1);
			if (_la==14) {
				{
				setState(160); match(14);
				setState(161); match(2);
				setState(163);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MuutujaNimi) | (1L << Arvuliteraal) | (1L << Soneliteraal))) != 0)) {
					{
					setState(162);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MuutujaNimi) | (1L << Arvuliteraal) | (1L << Soneliteraal))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==25) {
					{
					setState(171);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(165); match(25);
						setState(166); match(Soneliteraal);
						}
						break;

					case 2:
						{
						setState(167); match(25);
						setState(168); match(Arvuliteraal);
						}
						break;

					case 3:
						{
						setState(169); match(25);
						setState(170); match(MuutujaNimi);
						}
						break;
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176); match(23);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OmistamineContext extends ParserRuleContext {
		public List<TerminalNode> MuutujaNimi() { return getTokens(aVeneParser.MuutujaNimi); }
		public TerminalNode Soneliteraal(int i) {
			return getToken(aVeneParser.Soneliteraal, i);
		}
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public TerminalNode Arvuliteraal(int i) {
			return getToken(aVeneParser.Arvuliteraal, i);
		}
		public TerminalNode MuutujaNimi(int i) {
			return getToken(aVeneParser.MuutujaNimi, i);
		}
		public List<TerminalNode> Arvuliteraal() { return getTokens(aVeneParser.Arvuliteraal); }
		public List<TerminalNode> Soneliteraal() { return getTokens(aVeneParser.Soneliteraal); }
		public OmistamineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_omistamine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterOmistamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitOmistamine(this);
		}
	}

	public final OmistamineContext omistamine() throws RecognitionException {
		OmistamineContext _localctx = new OmistamineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_omistamine);
		int _la;
		try {
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); match(MuutujaNimi);
				setState(180); match(14);
				setState(181); avaldis();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182); match(MuutujaNimi);
				setState(183); match(14);
				setState(184); match(2);
				setState(209);
				switch (_input.LA(1)) {
				case Soneliteraal:
					{
					{
					setState(185); match(Soneliteraal);
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(186); match(25);
						setState(187); match(Soneliteraal);
						}
						}
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case Arvuliteraal:
					{
					{
					setState(193); match(Arvuliteraal);
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(194); match(25);
						setState(195); match(Arvuliteraal);
						}
						}
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case MuutujaNimi:
					{
					{
					setState(201); match(MuutujaNimi);
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(202); match(25);
						setState(203); match(MuutujaNimi);
						}
						}
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case 23:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(211); match(23);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212); match(MuutujaNimi);
				setState(213); match(14);
				setState(214); match(15);
				setState(239);
				switch (_input.LA(1)) {
				case Soneliteraal:
					{
					{
					setState(215); match(Soneliteraal);
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(216); match(25);
						setState(217); match(Soneliteraal);
						}
						}
						setState(222);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case Arvuliteraal:
					{
					{
					setState(223); match(Arvuliteraal);
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(224); match(25);
						setState(225); match(Arvuliteraal);
						}
						}
						setState(230);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case MuutujaNimi:
					{
					{
					setState(231); match(MuutujaNimi);
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(232); match(25);
						setState(233); match(MuutujaNimi);
						}
						}
						setState(238);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case 33:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(241); match(33);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242); match(MuutujaNimi);
				setState(243); match(14);
				setState(244); match(2);
				setState(246);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MuutujaNimi) | (1L << Arvuliteraal) | (1L << Soneliteraal))) != 0)) {
					{
					setState(245);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MuutujaNimi) | (1L << Arvuliteraal) | (1L << Soneliteraal))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==25) {
					{
					setState(254);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(248); match(25);
						setState(249); match(Soneliteraal);
						}
						break;

					case 2:
						{
						setState(250); match(25);
						setState(251); match(Arvuliteraal);
						}
						break;

					case 3:
						{
						setState(252); match(25);
						setState(253); match(MuutujaNimi);
						}
						break;
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259); match(23);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MuutujaDeklaratsioonContext extends ParserRuleContext {
		public TerminalNode MuutujaNimi() { return getToken(aVeneParser.MuutujaNimi, 0); }
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public MuutujaDeklaratsioonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_muutujaDeklaratsioon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterMuutujaDeklaratsioon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitMuutujaDeklaratsioon(this);
		}
	}

	public final MuutujaDeklaratsioonContext muutujaDeklaratsioon() throws RecognitionException {
		MuutujaDeklaratsioonContext _localctx = new MuutujaDeklaratsioonContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_muutujaDeklaratsioon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 28) | (1L << 32))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(263); match(MuutujaNimi);
			setState(266);
			_la = _input.LA(1);
			if (_la==14) {
				{
				setState(264); match(14);
				setState(265); avaldis();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvaldisContext extends ParserRuleContext {
		public Avaldis6Context avaldis6() {
			return getRuleContext(Avaldis6Context.class,0);
		}
		public AvaldisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterAvaldis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitAvaldis(this);
		}
	}

	public final AvaldisContext avaldis() throws RecognitionException {
		AvaldisContext _localctx = new AvaldisContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_avaldis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); avaldis6();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Avaldis6Context extends ParserRuleContext {
		public Avaldis6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis6; }
	 
		public Avaldis6Context() { }
		public void copyFrom(Avaldis6Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VordlemineContext extends Avaldis6Context {
		public List<Avaldis5Context> avaldis5() {
			return getRuleContexts(Avaldis5Context.class);
		}
		public Avaldis5Context avaldis5(int i) {
			return getRuleContext(Avaldis5Context.class,i);
		}
		public VordlemineContext(Avaldis6Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterVordlemine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitVordlemine(this);
		}
	}
	public static class TriviaalneAvaldis6Context extends Avaldis6Context {
		public Avaldis5Context avaldis5() {
			return getRuleContext(Avaldis5Context.class,0);
		}
		public TriviaalneAvaldis6Context(Avaldis6Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterTriviaalneAvaldis6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitTriviaalneAvaldis6(this);
		}
	}

	public final Avaldis6Context avaldis6() throws RecognitionException {
		Avaldis6Context _localctx = new Avaldis6Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_avaldis6);
		int _la;
		try {
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new VordlemineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270); avaldis5(0);
				setState(271);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 5) | (1L << 6) | (1L << 43) | (1L << 46) | (1L << 49))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(272); avaldis5(0);
				}
				break;

			case 2:
				_localctx = new TriviaalneAvaldis6Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274); avaldis5(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Avaldis5Context extends ParserRuleContext {
		public Avaldis5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis5; }
	 
		public Avaldis5Context() { }
		public void copyFrom(Avaldis5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiitLahOmistamisegaContext extends Avaldis5Context {
		public Avaldis4Context avaldis4() {
			return getRuleContext(Avaldis4Context.class,0);
		}
		public Avaldis5Context avaldis5() {
			return getRuleContext(Avaldis5Context.class,0);
		}
		public LiitLahOmistamisegaContext(Avaldis5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterLiitLahOmistamisega(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitLiitLahOmistamisega(this);
		}
	}
	public static class TriviaalneAvaldis5Context extends Avaldis5Context {
		public Avaldis4Context avaldis4() {
			return getRuleContext(Avaldis4Context.class,0);
		}
		public TriviaalneAvaldis5Context(Avaldis5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterTriviaalneAvaldis5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitTriviaalneAvaldis5(this);
		}
	}

	public final Avaldis5Context avaldis5() throws RecognitionException {
		return avaldis5(0);
	}

	private Avaldis5Context avaldis5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Avaldis5Context _localctx = new Avaldis5Context(_ctx, _parentState);
		Avaldis5Context _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_avaldis5, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneAvaldis5Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(278); avaldis4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LiitLahOmistamisegaContext(new Avaldis5Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_avaldis5);
					setState(280);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(281);
					_la = _input.LA(1);
					if ( !(_la==24 || _la==35) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(282); avaldis4(0);
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Avaldis4Context extends ParserRuleContext {
		public Avaldis4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis4; }
	 
		public Avaldis4Context() { }
		public void copyFrom(Avaldis4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiitmineLahutamineContext extends Avaldis4Context {
		public Avaldis4Context avaldis4() {
			return getRuleContext(Avaldis4Context.class,0);
		}
		public Avaldis3Context avaldis3() {
			return getRuleContext(Avaldis3Context.class,0);
		}
		public LiitmineLahutamineContext(Avaldis4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterLiitmineLahutamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitLiitmineLahutamine(this);
		}
	}
	public static class TriviaalneAvaldis4Context extends Avaldis4Context {
		public Avaldis3Context avaldis3() {
			return getRuleContext(Avaldis3Context.class,0);
		}
		public TriviaalneAvaldis4Context(Avaldis4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterTriviaalneAvaldis4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitTriviaalneAvaldis4(this);
		}
	}

	public final Avaldis4Context avaldis4() throws RecognitionException {
		return avaldis4(0);
	}

	private Avaldis4Context avaldis4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Avaldis4Context _localctx = new Avaldis4Context(_ctx, _parentState);
		Avaldis4Context _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_avaldis4, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneAvaldis4Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(289); avaldis3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LiitmineLahutamineContext(new Avaldis4Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_avaldis4);
					setState(291);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(292);
					_la = _input.LA(1);
					if ( !(_la==26 || _la==37) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(293); avaldis3(0);
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Avaldis3Context extends ParserRuleContext {
		public Avaldis3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis3; }
	 
		public Avaldis3Context() { }
		public void copyFrom(Avaldis3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JagamineJagatisegaContext extends Avaldis3Context {
		public Avaldis3Context avaldis3() {
			return getRuleContext(Avaldis3Context.class,0);
		}
		public Avaldis2Context avaldis2() {
			return getRuleContext(Avaldis2Context.class,0);
		}
		public JagamineJagatisegaContext(Avaldis3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterJagamineJagatisega(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitJagamineJagatisega(this);
		}
	}
	public static class TriviaalneAvaldis3Context extends Avaldis3Context {
		public Avaldis2Context avaldis2() {
			return getRuleContext(Avaldis2Context.class,0);
		}
		public TriviaalneAvaldis3Context(Avaldis3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterTriviaalneAvaldis3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitTriviaalneAvaldis3(this);
		}
	}
	public static class KorrutamineJagamineContext extends Avaldis3Context {
		public Avaldis3Context avaldis3() {
			return getRuleContext(Avaldis3Context.class,0);
		}
		public Avaldis2Context avaldis2() {
			return getRuleContext(Avaldis2Context.class,0);
		}
		public KorrutamineJagamineContext(Avaldis3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterKorrutamineJagamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitKorrutamineJagamine(this);
		}
	}

	public final Avaldis3Context avaldis3() throws RecognitionException {
		return avaldis3(0);
	}

	private Avaldis3Context avaldis3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Avaldis3Context _localctx = new Avaldis3Context(_ctx, _parentState);
		Avaldis3Context _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_avaldis3, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneAvaldis3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(300); avaldis2();
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new KorrutamineJagamineContext(new Avaldis3Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_avaldis3);
						setState(302);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(303);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==48) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(304); avaldis2();
						}
						break;

					case 2:
						{
						_localctx = new JagamineJagatisegaContext(new Avaldis3Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_avaldis3);
						setState(305);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(306); match(12);
						setState(307); avaldis2();
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Avaldis2Context extends ParserRuleContext {
		public Avaldis2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis2; }
	 
		public Avaldis2Context() { }
		public void copyFrom(Avaldis2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaarneMiinusContext extends Avaldis2Context {
		public Avaldis2Context avaldis2() {
			return getRuleContext(Avaldis2Context.class,0);
		}
		public UnaarneMiinusContext(Avaldis2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterUnaarneMiinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitUnaarneMiinus(this);
		}
	}
	public static class TriviaalneAvaldis2Context extends Avaldis2Context {
		public Avaldis1Context avaldis1() {
			return getRuleContext(Avaldis1Context.class,0);
		}
		public TriviaalneAvaldis2Context(Avaldis2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterTriviaalneAvaldis2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitTriviaalneAvaldis2(this);
		}
	}

	public final Avaldis2Context avaldis2() throws RecognitionException {
		Avaldis2Context _localctx = new Avaldis2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_avaldis2);
		try {
			setState(316);
			switch (_input.LA(1)) {
			case 26:
				_localctx = new UnaarneMiinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313); match(26);
				setState(314); avaldis2();
				}
				break;
			case 27:
			case MuutujaNimi:
			case Boolean:
			case Arvuliteraal:
			case Soneliteraal:
				_localctx = new TriviaalneAvaldis2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315); avaldis1();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Avaldis1Context extends ParserRuleContext {
		public Avaldis1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis1; }
	 
		public Avaldis1Context() { }
		public void copyFrom(Avaldis1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MassiiviKasutamineContext extends Avaldis1Context {
		public TerminalNode MuutujaNimi() { return getToken(aVeneParser.MuutujaNimi, 0); }
		public TerminalNode Arvuliteraal() { return getToken(aVeneParser.Arvuliteraal, 0); }
		public MassiiviKasutamineContext(Avaldis1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterMassiiviKasutamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitMassiiviKasutamine(this);
		}
	}
	public static class FunktsiooniValjakutseContext extends Avaldis1Context {
		public TerminalNode MuutujaNimi() { return getToken(aVeneParser.MuutujaNimi, 0); }
		public List<AvaldisContext> avaldis() {
			return getRuleContexts(AvaldisContext.class);
		}
		public AvaldisContext avaldis(int i) {
			return getRuleContext(AvaldisContext.class,i);
		}
		public FunktsiooniValjakutseContext(Avaldis1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterFunktsiooniValjakutse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitFunktsiooniValjakutse(this);
		}
	}
	public static class TriviaalneAvaldis1Context extends Avaldis1Context {
		public Avaldis0Context avaldis0() {
			return getRuleContext(Avaldis0Context.class,0);
		}
		public TriviaalneAvaldis1Context(Avaldis1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterTriviaalneAvaldis1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitTriviaalneAvaldis1(this);
		}
	}

	public final Avaldis1Context avaldis1() throws RecognitionException {
		Avaldis1Context _localctx = new Avaldis1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_avaldis1);
		int _la;
		try {
			setState(336);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new FunktsiooniValjakutseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(318); match(MuutujaNimi);
				setState(319); match(27);
				setState(328);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 26) | (1L << 27) | (1L << MuutujaNimi) | (1L << Boolean) | (1L << Arvuliteraal) | (1L << Soneliteraal))) != 0)) {
					{
					setState(320); avaldis();
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==25) {
						{
						{
						setState(321); match(25);
						setState(322); avaldis();
						}
						}
						setState(327);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(330); match(13);
				}
				break;

			case 2:
				_localctx = new MassiiviKasutamineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331); match(MuutujaNimi);
				setState(332); match(2);
				setState(333); match(Arvuliteraal);
				setState(334); match(23);
				}
				break;

			case 3:
				_localctx = new TriviaalneAvaldis1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(335); avaldis0();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Avaldis0Context extends ParserRuleContext {
		public Avaldis0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis0; }
	 
		public Avaldis0Context() { }
		public void copyFrom(Avaldis0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanRContext extends Avaldis0Context {
		public TerminalNode Boolean() { return getToken(aVeneParser.Boolean, 0); }
		public BooleanRContext(Avaldis0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterBooleanR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitBooleanR(this);
		}
	}
	public static class SuluavaldisContext extends Avaldis0Context {
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public SuluavaldisContext(Avaldis0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterSuluavaldis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitSuluavaldis(this);
		}
	}
	public static class SoneliteraalRContext extends Avaldis0Context {
		public TerminalNode Soneliteraal() { return getToken(aVeneParser.Soneliteraal, 0); }
		public SoneliteraalRContext(Avaldis0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterSoneliteraalR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitSoneliteraalR(this);
		}
	}
	public static class ArvuliteraalRContext extends Avaldis0Context {
		public TerminalNode Arvuliteraal() { return getToken(aVeneParser.Arvuliteraal, 0); }
		public ArvuliteraalRContext(Avaldis0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterArvuliteraalR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitArvuliteraalR(this);
		}
	}
	public static class MuutujaNimiRContext extends Avaldis0Context {
		public TerminalNode MuutujaNimi() { return getToken(aVeneParser.MuutujaNimi, 0); }
		public MuutujaNimiRContext(Avaldis0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).enterMuutujaNimiR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof aVeneListener) ((aVeneListener)listener).exitMuutujaNimiR(this);
		}
	}

	public final Avaldis0Context avaldis0() throws RecognitionException {
		Avaldis0Context _localctx = new Avaldis0Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_avaldis0);
		try {
			setState(346);
			switch (_input.LA(1)) {
			case MuutujaNimi:
				_localctx = new MuutujaNimiRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(338); match(MuutujaNimi);
				}
				break;
			case Arvuliteraal:
				_localctx = new ArvuliteraalRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(339); match(Arvuliteraal);
				}
				break;
			case Soneliteraal:
				_localctx = new SoneliteraalRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(340); match(Soneliteraal);
				}
				break;
			case Boolean:
				_localctx = new BooleanRContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(341); match(Boolean);
				}
				break;
			case 27:
				_localctx = new SuluavaldisContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(342); match(27);
				setState(343); avaldis();
				setState(344); match(13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13: return avaldis5_sempred((Avaldis5Context)_localctx, predIndex);

		case 14: return avaldis4_sempred((Avaldis4Context)_localctx, predIndex);

		case 15: return avaldis3_sempred((Avaldis3Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean avaldis3_sempred(Avaldis3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 3);

		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean avaldis5_sempred(Avaldis5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean avaldis4_sempred(Avaldis4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u015f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bf\n"+
		"\b\f\b\16\bi\13\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\3\b\3\b\7\b"+
		"v\n\b\f\b\16\by\13\b\5\b{\n\b\3\b\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\t\3\t\3\t\7\t\u008f\n\t\f\t\16\t"+
		"\u0092\13\t\3\t\3\t\3\t\7\t\u0097\n\t\f\t\16\t\u009a\13\t\5\t\u009c\n"+
		"\t\3\t\5\t\u009f\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a6\n\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00ae\n\n\f\n\16\n\u00b1\13\n\3\n\5\n\u00b4\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00bf\n\13\f\13\16\13\u00c2\13"+
		"\13\3\13\3\13\3\13\7\13\u00c7\n\13\f\13\16\13\u00ca\13\13\3\13\3\13\3"+
		"\13\7\13\u00cf\n\13\f\13\16\13\u00d2\13\13\5\13\u00d4\n\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\7\13\u00dd\n\13\f\13\16\13\u00e0\13\13\3\13\3"+
		"\13\3\13\7\13\u00e5\n\13\f\13\16\13\u00e8\13\13\3\13\3\13\3\13\7\13\u00ed"+
		"\n\13\f\13\16\13\u00f0\13\13\5\13\u00f2\n\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00f9\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0101\n\13\f\13\16"+
		"\13\u0104\13\13\3\13\5\13\u0107\n\13\3\f\3\f\3\f\3\f\5\f\u010d\n\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0116\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u011e\n\17\f\17\16\17\u0121\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u0129\n\20\f\20\16\20\u012c\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0137\n\21\f\21\16\21\u013a\13\21\3\22\3\22"+
		"\3\22\5\22\u013f\n\22\3\23\3\23\3\23\3\23\3\23\7\23\u0146\n\23\f\23\16"+
		"\23\u0149\13\23\5\23\u014b\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0153"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u015d\n\24\3\24\2\5"+
		"\34\36 \25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\20\5\2!!\61\61"+
		"\65\65\5\2\27\27..\64\64\5\2\22\22\37\37((\5\2\f\f  ++\5\2\3\3\n\n&&\5"+
		"\2\t\t\13\13\26\26\5\2\24\24\30\30**\5\2\25\25))//\4\2\66\6689\5\2\23"+
		"\23\36\36\"\"\6\2\6\b--\60\60\63\63\4\2\32\32%%\4\2\34\34\'\'\4\2\5\5"+
		"\62\62\u0189\2(\3\2\2\2\4*\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nJ\3\2\2\2\f"+
		"R\3\2\2\2\16^\3\2\2\2\20\177\3\2\2\2\22\u00a0\3\2\2\2\24\u0106\3\2\2\2"+
		"\26\u0108\3\2\2\2\30\u010e\3\2\2\2\32\u0115\3\2\2\2\34\u0117\3\2\2\2\36"+
		"\u0122\3\2\2\2 \u012d\3\2\2\2\"\u013e\3\2\2\2$\u0152\3\2\2\2&\u015c\3"+
		"\2\2\2()\5\4\3\2)\3\3\2\2\2*/\5\6\4\2+,\7,\2\2,.\5\6\4\2-+\3\2\2\2.\61"+
		"\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61/\3\2\2\2\62<\5\b\5\2\63"+
		"<\5\n\6\2\64<\5\f\7\2\65<\5\24\13\2\66<\5\26\f\2\67<\5\30\r\28<\5\16\b"+
		"\29<\5\20\t\2:<\5\22\n\2;\62\3\2\2\2;\63\3\2\2\2;\64\3\2\2\2;\65\3\2\2"+
		"\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=>"+
		"\t\2\2\2>?\7\35\2\2?@\5\30\r\2@A\7\17\2\2AB\t\3\2\2BC\7$\2\2CD\5\4\3\2"+
		"DE\7\r\2\2EF\t\4\2\2FG\7$\2\2GH\5\4\3\2HI\7\r\2\2I\t\3\2\2\2JK\t\5\2\2"+
		"KL\7\35\2\2LM\5\30\r\2MN\7\17\2\2NO\7$\2\2OP\5\4\3\2PQ\7\r\2\2Q\13\3\2"+
		"\2\2RS\t\6\2\2ST\7\35\2\2TU\5\26\f\2UV\7,\2\2VW\5\30\r\2WX\7,\2\2XY\5"+
		"\30\r\2YZ\7\17\2\2Z[\7$\2\2[\\\5\4\3\2\\]\7\r\2\2]\r\3\2\2\2^_\t\7\2\2"+
		"_}\7\66\2\2`a\7\20\2\2az\7\4\2\2bg\79\2\2cd\7\33\2\2df\79\2\2ec\3\2\2"+
		"\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h{\3\2\2\2ig\3\2\2\2jo\78\2\2kl\7\33\2"+
		"\2ln\78\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p{\3\2\2\2qo\3\2\2"+
		"\2rw\7\66\2\2st\7\33\2\2tv\7\66\2\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3"+
		"\2\2\2x{\3\2\2\2yw\3\2\2\2zb\3\2\2\2zj\3\2\2\2zr\3\2\2\2z{\3\2\2\2{|\3"+
		"\2\2\2|~\7\31\2\2}`\3\2\2\2}~\3\2\2\2~\17\3\2\2\2\177\u0080\t\b\2\2\u0080"+
		"\u009e\7\66\2\2\u0081\u0082\7\20\2\2\u0082\u009b\7\21\2\2\u0083\u0088"+
		"\79\2\2\u0084\u0085\7\33\2\2\u0085\u0087\79\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u009c\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u0090\78\2\2\u008c\u008d\7\33\2\2\u008d"+
		"\u008f\78\2\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u009c\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0098\7\66\2\2\u0094\u0095\7\33\2\2\u0095\u0097\7\66\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u0083\3\2\2\2\u009b\u008b\3\2"+
		"\2\2\u009b\u0093\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\7#\2\2\u009e\u0081\3\2\2\2\u009e\u009f\3\2\2\2\u009f\21\3\2\2\2"+
		"\u00a0\u00a1\t\t\2\2\u00a1\u00b3\7\66\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a5"+
		"\7\4\2\2\u00a4\u00a6\t\n\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00af\3\2\2\2\u00a7\u00a8\7\33\2\2\u00a8\u00ae\79\2\2\u00a9\u00aa\7\33"+
		"\2\2\u00aa\u00ae\78\2\2\u00ab\u00ac\7\33\2\2\u00ac\u00ae\7\66\2\2\u00ad"+
		"\u00a7\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b4\7\31\2\2\u00b3\u00a2\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\23\3\2\2\2\u00b5\u00b6\7\66\2\2\u00b6\u00b7\7\20\2\2\u00b7"+
		"\u0107\5\30\r\2\u00b8\u00b9\7\66\2\2\u00b9\u00ba\7\20\2\2\u00ba\u00d3"+
		"\7\4\2\2\u00bb\u00c0\79\2\2\u00bc\u00bd\7\33\2\2\u00bd\u00bf\79\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00d4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c8\78\2\2\u00c4"+
		"\u00c5\7\33\2\2\u00c5\u00c7\78\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d4\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00d0\7\66\2\2\u00cc\u00cd\7\33\2\2\u00cd\u00cf\7"+
		"\66\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00bb\3\2"+
		"\2\2\u00d3\u00c3\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u0107\7\31\2\2\u00d6\u00d7\7\66\2\2\u00d7\u00d8\7"+
		"\20\2\2\u00d8\u00f1\7\21\2\2\u00d9\u00de\79\2\2\u00da\u00db\7\33\2\2\u00db"+
		"\u00dd\79\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00f2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e6\78\2\2\u00e2\u00e3\7\33\2\2\u00e3\u00e5\78\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00f2\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ee\7\66\2\2\u00ea\u00eb\7"+
		"\33\2\2\u00eb\u00ed\7\66\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00d9\3\2\2\2\u00f1\u00e1\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u0107\7#\2\2\u00f4\u00f5\7\66"+
		"\2\2\u00f5\u00f6\7\20\2\2\u00f6\u00f8\7\4\2\2\u00f7\u00f9\t\n\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0102\3\2\2\2\u00fa\u00fb\7\33"+
		"\2\2\u00fb\u0101\79\2\2\u00fc\u00fd\7\33\2\2\u00fd\u0101\78\2\2\u00fe"+
		"\u00ff\7\33\2\2\u00ff\u0101\7\66\2\2\u0100\u00fa\3\2\2\2\u0100\u00fc\3"+
		"\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\7\31"+
		"\2\2\u0106\u00b5\3\2\2\2\u0106\u00b8\3\2\2\2\u0106\u00d6\3\2\2\2\u0106"+
		"\u00f4\3\2\2\2\u0107\25\3\2\2\2\u0108\u0109\t\13\2\2\u0109\u010c\7\66"+
		"\2\2\u010a\u010b\7\20\2\2\u010b\u010d\5\30\r\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\27\3\2\2\2\u010e\u010f\5\32\16\2\u010f\31\3\2\2\2"+
		"\u0110\u0111\5\34\17\2\u0111\u0112\t\f\2\2\u0112\u0113\5\34\17\2\u0113"+
		"\u0116\3\2\2\2\u0114\u0116\5\34\17\2\u0115\u0110\3\2\2\2\u0115\u0114\3"+
		"\2\2\2\u0116\33\3\2\2\2\u0117\u0118\b\17\1\2\u0118\u0119\5\36\20\2\u0119"+
		"\u011f\3\2\2\2\u011a\u011b\f\4\2\2\u011b\u011c\t\r\2\2\u011c\u011e\5\36"+
		"\20\2\u011d\u011a\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\35\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\b\20\1"+
		"\2\u0123\u0124\5 \21\2\u0124\u012a\3\2\2\2\u0125\u0126\f\4\2\2\u0126\u0127"+
		"\t\16\2\2\u0127\u0129\5 \21\2\u0128\u0125\3\2\2\2\u0129\u012c\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\37\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012d\u012e\b\21\1\2\u012e\u012f\5\"\22\2\u012f\u0138\3\2\2\2"+
		"\u0130\u0131\f\5\2\2\u0131\u0132\t\17\2\2\u0132\u0137\5\"\22\2\u0133\u0134"+
		"\f\4\2\2\u0134\u0135\7\16\2\2\u0135\u0137\5\"\22\2\u0136\u0130\3\2\2\2"+
		"\u0136\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139!\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\34\2\2\u013c"+
		"\u013f\5\"\22\2\u013d\u013f\5$\23\2\u013e\u013b\3\2\2\2\u013e\u013d\3"+
		"\2\2\2\u013f#\3\2\2\2\u0140\u0141\7\66\2\2\u0141\u014a\7\35\2\2\u0142"+
		"\u0147\5\30\r\2\u0143\u0144\7\33\2\2\u0144\u0146\5\30\r\2\u0145\u0143"+
		"\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u0142\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\u0153\7\17\2\2\u014d\u014e\7\66\2\2\u014e"+
		"\u014f\7\4\2\2\u014f\u0150\78\2\2\u0150\u0153\7\31\2\2\u0151\u0153\5&"+
		"\24\2\u0152\u0140\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"%\3\2\2\2\u0154\u015d\7\66\2\2\u0155\u015d\78\2\2\u0156\u015d\79\2\2\u0157"+
		"\u015d\7\67\2\2\u0158\u0159\7\35\2\2\u0159\u015a\5\30\r\2\u015a\u015b"+
		"\7\17\2\2\u015b\u015d\3\2\2\2\u015c\u0154\3\2\2\2\u015c\u0155\3\2\2\2"+
		"\u015c\u0156\3\2\2\2\u015c\u0157\3\2\2\2\u015c\u0158\3\2\2\2\u015d\'\3"+
		"\2\2\2)/;gowz}\u0088\u0090\u0098\u009b\u009e\u00a5\u00ad\u00af\u00b3\u00c0"+
		"\u00c8\u00d0\u00d3\u00de\u00e6\u00ee\u00f1\u00f8\u0100\u0102\u0106\u010c"+
		"\u0115\u011f\u012a\u0136\u0138\u013e\u0147\u014a\u0152\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}