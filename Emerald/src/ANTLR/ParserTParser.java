package ANTLR;
// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, VAR=3, CONS=4, IF=5, WHILE=6, FOR=7, SCAN=8, PRINTLN=9, 
		SUMA=10, SIN=11, COS=12, OP_MOD=13, OP_SUM=14, OP_RES=15, OP_MUL=16, OP_DIV=17, 
		OP_MAY=18, OP_MEN=19, OP_MAYI=20, OP_MENI=21, OP_IGU=22, OP_DIS=23, OP_ASI=24, 
		INT=25, STRING=26, BOOL=27, CONST=28, BRACKET_OPEN=29, BRACKET_CLOSE=30, 
		PARENTHESIS_OPEN=31, PARENTHESIS_CLOSE=32, AND=33, OR=34, NOT=35, NOMBRE=36, 
		NUMERO=37, BOOLEAN=38, PUNTOCOMA=39, COMA=40, WS=41;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_var = 2, RULE_cons = 3, RULE_type = 4, 
		RULE_operadores = 5, RULE_condicion = 6, RULE_paso = 7, RULE_var_asignacion = 8, 
		RULE_var_declaracion = 9, RULE_cons_declaration = 10, RULE_println = 11, 
		RULE_scan = 12, RULE_repetir = 13, RULE_para = 14, RULE_suma = 15, RULE_sin = 16, 
		RULE_cos = 17, RULE_control = 18;
	public static final String[] ruleNames = {
		"program", "statement", "var", "cons", "type", "operadores", "condicion", 
		"paso", "var_asignacion", "var_declaracion", "cons_declaration", "println", 
		"scan", "repetir", "para", "suma", "sin", "cos", "control"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<Emerald>'", "'</Emerald>'", "'var'", "'cons'", "'if'", "'while'", 
		"'for'", "'scan'", "'println'", "'suma'", "'sin'", "'cos'", "'%'", "'+'", 
		"'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'='", 
		"'int'", "'String'", "'bool'", "'const'", "'{'", "'}'", "'('", "')'", 
		"'&&'", "'||'", "'!'", null, null, null, "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "VAR", "CONS", "IF", "WHILE", "FOR", "SCAN", "PRINTLN", 
		"SUMA", "SIN", "COS", "OP_MOD", "OP_SUM", "OP_RES", "OP_MUL", "OP_DIV", 
		"OP_MAY", "OP_MEN", "OP_MAYI", "OP_MENI", "OP_IGU", "OP_DIS", "OP_ASI", 
		"INT", "STRING", "BOOL", "CONST", "BRACKET_OPEN", "BRACKET_CLOSE", "PARENTHESIS_OPEN", 
		"PARENTHESIS_CLOSE", "AND", "OR", "NOT", "NOMBRE", "NUMERO", "BOOLEAN", 
		"PUNTOCOMA", "COMA", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(BEGIN);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SCAN) | (1L << PRINTLN) | (1L << SUMA) | (1L << SIN) | (1L << COS) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(39);
				statement();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public Var_declaracionContext var_declaracion() {
			return getRuleContext(Var_declaracionContext.class,0);
		}
		public Var_asignacionContext var_asignacion() {
			return getRuleContext(Var_asignacionContext.class,0);
		}
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public ControlContext control() {
			return getRuleContext(ControlContext.class,0);
		}
		public SinContext sin() {
			return getRuleContext(SinContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				var_declaracion();
				}
				break;
			case NOMBRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				var_asignacion();
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				println();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				repetir();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				para();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				control();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				sin();
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				cos();
				}
				break;
			case SUMA:
				enterOuterAlt(_localctx, 9);
				{
				setState(55);
				suma();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 10);
				{
				setState(56);
				scan();
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

	public static class VarContext extends ParserRuleContext {
		public List<TerminalNode> NOMBRE() { return getTokens(ParserTParser.NOMBRE); }
		public TerminalNode NOMBRE(int i) {
			return getToken(ParserTParser.NOMBRE, i);
		}
		public TerminalNode BOOLEAN() { return getToken(ParserTParser.BOOLEAN, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(ParserTParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ParserTParser.NUMERO, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			int _alt;
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOMBRE:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(59);
						match(NOMBRE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(62); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(BOOLEAN);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(65);
						match(NUMERO);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(68); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ConsContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(ParserTParser.NOMBRE, 0); }
		public TerminalNode BOOLEAN() { return getToken(ParserTParser.BOOLEAN, 0); }
		public TerminalNode NUMERO() { return getToken(ParserTParser.NUMERO, 0); }
		public ConsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterCons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitCons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsContext cons() throws RecognitionException {
		ConsContext _localctx = new ConsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cons);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOMBRE) | (1L << NUMERO) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode STRING() { return getToken(ParserTParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(ParserTParser.BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class OperadoresContext extends ParserRuleContext {
		public TerminalNode OP_SUM() { return getToken(ParserTParser.OP_SUM, 0); }
		public TerminalNode OP_MOD() { return getToken(ParserTParser.OP_MOD, 0); }
		public TerminalNode OP_RES() { return getToken(ParserTParser.OP_RES, 0); }
		public TerminalNode OP_MUL() { return getToken(ParserTParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(ParserTParser.OP_DIV, 0); }
		public TerminalNode OP_MAY() { return getToken(ParserTParser.OP_MAY, 0); }
		public TerminalNode OP_MEN() { return getToken(ParserTParser.OP_MEN, 0); }
		public TerminalNode OP_MAYI() { return getToken(ParserTParser.OP_MAYI, 0); }
		public TerminalNode OP_MENI() { return getToken(ParserTParser.OP_MENI, 0); }
		public TerminalNode OP_IGU() { return getToken(ParserTParser.OP_IGU, 0); }
		public TerminalNode OP_DIS() { return getToken(ParserTParser.OP_DIS, 0); }
		public TerminalNode OP_ASI() { return getToken(ParserTParser.OP_ASI, 0); }
		public OperadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterOperadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitOperadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitOperadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadoresContext operadores() throws RecognitionException {
		OperadoresContext _localctx = new OperadoresContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MOD) | (1L << OP_SUM) | (1L << OP_RES) | (1L << OP_MUL) | (1L << OP_DIV) | (1L << OP_MAY) | (1L << OP_MEN) | (1L << OP_MAYI) | (1L << OP_MENI) | (1L << OP_IGU) | (1L << OP_DIS) | (1L << OP_ASI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CondicionContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<OperadoresContext> operadores() {
			return getRuleContexts(OperadoresContext.class);
		}
		public OperadoresContext operadores(int i) {
			return getRuleContext(OperadoresContext.class,i);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			var();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MOD) | (1L << OP_SUM) | (1L << OP_RES) | (1L << OP_MUL) | (1L << OP_DIV) | (1L << OP_MAY) | (1L << OP_MEN) | (1L << OP_MAYI) | (1L << OP_MENI) | (1L << OP_IGU) | (1L << OP_DIS) | (1L << OP_ASI))) != 0)) {
				{
				{
				setState(79);
				operadores();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			var();
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

	public static class PasoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TerminalNode> OP_SUM() { return getTokens(ParserTParser.OP_SUM); }
		public TerminalNode OP_SUM(int i) {
			return getToken(ParserTParser.OP_SUM, i);
		}
		public List<TerminalNode> OP_RES() { return getTokens(ParserTParser.OP_RES); }
		public TerminalNode OP_RES(int i) {
			return getToken(ParserTParser.OP_RES, i);
		}
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterPaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitPaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paso);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				var();
				setState(88);
				match(OP_SUM);
				setState(89);
				match(OP_SUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				var();
				setState(92);
				match(OP_RES);
				setState(93);
				match(OP_RES);
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

	public static class Var_asignacionContext extends ParserRuleContext {
		public TerminalNode NOMBRE() { return getToken(ParserTParser.NOMBRE, 0); }
		public TerminalNode OP_ASI() { return getToken(ParserTParser.OP_ASI, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public Var_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterVar_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitVar_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVar_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_asignacionContext var_asignacion() throws RecognitionException {
		Var_asignacionContext _localctx = new Var_asignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(NOMBRE);
			setState(98);
			match(OP_ASI);
			setState(99);
			var();
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(100);
				match(PUNTOCOMA);
				}
				break;
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

	public static class Var_declaracionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOMBRE() { return getToken(ParserTParser.NOMBRE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public Var_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterVar_declaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitVar_declaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitVar_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declaracionContext var_declaracion() throws RecognitionException {
		Var_declaracionContext _localctx = new Var_declaracionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			type();
			setState(104);
			match(NOMBRE);
			setState(105);
			match(PUNTOCOMA);
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

	public static class Cons_declarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ParserTParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOMBRE() { return getToken(ParserTParser.NOMBRE, 0); }
		public TerminalNode OP_ASI() { return getToken(ParserTParser.OP_ASI, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public Cons_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterCons_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitCons_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCons_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cons_declarationContext cons_declaration() throws RecognitionException {
		Cons_declarationContext _localctx = new Cons_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cons_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CONST);
			setState(108);
			type();
			setState(109);
			match(NOMBRE);
			setState(110);
			match(OP_ASI);
			setState(111);
			var();
			setState(112);
			match(PUNTOCOMA);
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(ParserTParser.PRINTLN, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(ParserTParser.PARENTHESIS_OPEN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(ParserTParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(PRINTLN);
			setState(115);
			match(PARENTHESIS_OPEN);
			setState(116);
			var();
			setState(117);
			match(PARENTHESIS_CLOSE);
			setState(118);
			match(PUNTOCOMA);
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(ParserTParser.SCAN, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(ParserTParser.PARENTHESIS_OPEN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(ParserTParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(SCAN);
			setState(121);
			match(PARENTHESIS_OPEN);
			setState(122);
			var();
			setState(123);
			match(PARENTHESIS_CLOSE);
			setState(124);
			match(PUNTOCOMA);
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

	public static class RepetirContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserTParser.WHILE, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(ParserTParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(ParserTParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(ParserTParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(ParserTParser.BRACKET_CLOSE, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(WHILE);
			setState(127);
			match(PARENTHESIS_OPEN);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOMBRE) | (1L << NUMERO) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(128);
				condicion();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(PARENTHESIS_CLOSE);
			setState(135);
			match(BRACKET_OPEN);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SCAN) | (1L << PRINTLN) | (1L << SUMA) | (1L << SIN) | (1L << COS) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(136);
				statement();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(BRACKET_CLOSE);
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ParserTParser.FOR, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(ParserTParser.PARENTHESIS_OPEN, 0); }
		public Var_asignacionContext var_asignacion() {
			return getRuleContext(Var_asignacionContext.class,0);
		}
		public List<TerminalNode> PUNTOCOMA() { return getTokens(ParserTParser.PUNTOCOMA); }
		public TerminalNode PUNTOCOMA(int i) {
			return getToken(ParserTParser.PUNTOCOMA, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(ParserTParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(ParserTParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(ParserTParser.BRACKET_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FOR);
			setState(145);
			match(PARENTHESIS_OPEN);
			setState(146);
			var_asignacion();
			setState(147);
			match(PUNTOCOMA);
			setState(148);
			condicion();
			setState(149);
			match(PUNTOCOMA);
			setState(150);
			paso();
			setState(151);
			match(PARENTHESIS_CLOSE);
			setState(152);
			match(BRACKET_OPEN);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SCAN) | (1L << PRINTLN) | (1L << SUMA) | (1L << SIN) | (1L << COS) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(153);
				statement();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(BRACKET_CLOSE);
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

	public static class SumaContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(ParserTParser.SUMA, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(ParserTParser.PARENTHESIS_OPEN, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(ParserTParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(ParserTParser.NUMERO, i);
		}
		public TerminalNode COMA() { return getToken(ParserTParser.COMA, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(ParserTParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(SUMA);
			setState(162);
			match(PARENTHESIS_OPEN);
			setState(163);
			match(NUMERO);
			setState(164);
			match(COMA);
			setState(165);
			match(NUMERO);
			setState(166);
			match(PARENTHESIS_CLOSE);
			setState(167);
			match(PUNTOCOMA);
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

	public static class SinContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(ParserTParser.SIN, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(ParserTParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode NUMERO() { return getToken(ParserTParser.NUMERO, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(ParserTParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public SinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinContext sin() throws RecognitionException {
		SinContext _localctx = new SinContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(SIN);
			setState(170);
			match(PARENTHESIS_OPEN);
			setState(171);
			match(NUMERO);
			setState(172);
			match(PARENTHESIS_CLOSE);
			setState(173);
			match(PUNTOCOMA);
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

	public static class CosContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(ParserTParser.COS, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(ParserTParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode NUMERO() { return getToken(ParserTParser.NUMERO, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(ParserTParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(ParserTParser.PUNTOCOMA, 0); }
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(COS);
			setState(176);
			match(PARENTHESIS_OPEN);
			setState(177);
			match(NUMERO);
			setState(178);
			match(PARENTHESIS_CLOSE);
			setState(179);
			match(PUNTOCOMA);
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

	public static class ControlContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserTParser.IF, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(ParserTParser.PARENTHESIS_OPEN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(ParserTParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(ParserTParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(ParserTParser.BRACKET_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlContext control() throws RecognitionException {
		ControlContext _localctx = new ControlContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IF);
			setState(182);
			match(PARENTHESIS_OPEN);
			setState(183);
			condicion();
			setState(184);
			match(PARENTHESIS_CLOSE);
			setState(185);
			match(BRACKET_OPEN);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SCAN) | (1L << PRINTLN) | (1L << SUMA) | (1L << SIN) | (1L << COS) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(186);
				statement();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(BRACKET_CLOSE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\6\4?\n\4\r\4\16\4@\3\4\3\4"+
		"\6\4E\n\4\r\4\16\4F\5\4I\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\bS\n\b"+
		"\f\b\16\bV\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3"+
		"\n\3\n\3\n\5\nh\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7"+
		"\17\u0084\n\17\f\17\16\17\u0087\13\17\3\17\3\17\3\17\7\17\u008c\n\17\f"+
		"\17\16\17\u008f\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u009d\n\20\f\20\16\20\u00a0\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00be\n\24\f\24"+
		"\16\24\u00c1\13\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\5\3\2&(\3\2\33\35\3\2\17\32\2\u00c6\2(\3\2\2\2\4;\3\2"+
		"\2\2\6H\3\2\2\2\bJ\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2\20a\3\2\2"+
		"\2\22c\3\2\2\2\24i\3\2\2\2\26m\3\2\2\2\30t\3\2\2\2\32z\3\2\2\2\34\u0080"+
		"\3\2\2\2\36\u0092\3\2\2\2 \u00a3\3\2\2\2\"\u00ab\3\2\2\2$\u00b1\3\2\2"+
		"\2&\u00b7\3\2\2\2(,\7\3\2\2)+\5\4\3\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-"+
		"\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\4\2\2\60\3\3\2\2\2\61<\5\24\13\2\62"+
		"<\5\22\n\2\63<\5\30\r\2\64<\5\34\17\2\65<\5\36\20\2\66<\5&\24\2\67<\5"+
		"\"\22\28<\5$\23\29<\5 \21\2:<\5\32\16\2;\61\3\2\2\2;\62\3\2\2\2;\63\3"+
		"\2\2\2;\64\3\2\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2"+
		"\2\2;:\3\2\2\2<\5\3\2\2\2=?\7&\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2AI\3\2\2\2BI\7(\2\2CE\7\'\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2"+
		"\2\2GI\3\2\2\2H>\3\2\2\2HB\3\2\2\2HD\3\2\2\2I\7\3\2\2\2JK\t\2\2\2K\t\3"+
		"\2\2\2LM\t\3\2\2M\13\3\2\2\2NO\t\4\2\2O\r\3\2\2\2PT\5\6\4\2QS\5\f\7\2"+
		"RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\5\6\4\2"+
		"X\17\3\2\2\2YZ\5\6\4\2Z[\7\20\2\2[\\\7\20\2\2\\b\3\2\2\2]^\5\6\4\2^_\7"+
		"\21\2\2_`\7\21\2\2`b\3\2\2\2aY\3\2\2\2a]\3\2\2\2b\21\3\2\2\2cd\7&\2\2"+
		"de\7\32\2\2eg\5\6\4\2fh\7)\2\2gf\3\2\2\2gh\3\2\2\2h\23\3\2\2\2ij\5\n\6"+
		"\2jk\7&\2\2kl\7)\2\2l\25\3\2\2\2mn\7\36\2\2no\5\n\6\2op\7&\2\2pq\7\32"+
		"\2\2qr\5\6\4\2rs\7)\2\2s\27\3\2\2\2tu\7\13\2\2uv\7!\2\2vw\5\6\4\2wx\7"+
		"\"\2\2xy\7)\2\2y\31\3\2\2\2z{\7\n\2\2{|\7!\2\2|}\5\6\4\2}~\7\"\2\2~\177"+
		"\7)\2\2\177\33\3\2\2\2\u0080\u0081\7\b\2\2\u0081\u0085\7!\2\2\u0082\u0084"+
		"\5\16\b\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089"+
		"\7\"\2\2\u0089\u008d\7\37\2\2\u008a\u008c\5\4\3\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7 \2\2\u0091\35\3\2\2\2\u0092"+
		"\u0093\7\t\2\2\u0093\u0094\7!\2\2\u0094\u0095\5\22\n\2\u0095\u0096\7)"+
		"\2\2\u0096\u0097\5\16\b\2\u0097\u0098\7)\2\2\u0098\u0099\5\20\t\2\u0099"+
		"\u009a\7\"\2\2\u009a\u009e\7\37\2\2\u009b\u009d\5\4\3\2\u009c\u009b\3"+
		"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7 \2\2\u00a2\37\3\2\2\2"+
		"\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7!\2\2\u00a5\u00a6\7\'\2\2\u00a6\u00a7"+
		"\7*\2\2\u00a7\u00a8\7\'\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa\7)\2\2\u00aa"+
		"!\3\2\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad\7!\2\2\u00ad\u00ae\7\'\2\2\u00ae"+
		"\u00af\7\"\2\2\u00af\u00b0\7)\2\2\u00b0#\3\2\2\2\u00b1\u00b2\7\16\2\2"+
		"\u00b2\u00b3\7!\2\2\u00b3\u00b4\7\'\2\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6"+
		"\7)\2\2\u00b6%\3\2\2\2\u00b7\u00b8\7\7\2\2\u00b8\u00b9\7!\2\2\u00b9\u00ba"+
		"\5\16\b\2\u00ba\u00bb\7\"\2\2\u00bb\u00bf\7\37\2\2\u00bc\u00be\5\4\3\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7 \2\2\u00c3"+
		"\'\3\2\2\2\16,;@FHTag\u0085\u008d\u009e\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}