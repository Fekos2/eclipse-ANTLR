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
		RULE_operadores = 5, RULE_comparadores = 6, RULE_condicion = 7, RULE_paso = 8, 
		RULE_var_asignacion = 9, RULE_var_declaracion = 10, RULE_cons_declaration = 11, 
		RULE_println = 12, RULE_scan = 13, RULE_repetir = 14, RULE_para = 15, 
		RULE_suma = 16, RULE_sin = 17, RULE_cos = 18, RULE_control = 19;
	public static final String[] ruleNames = {
		"program", "statement", "var", "cons", "type", "operadores", "comparadores", 
		"condicion", "paso", "var_asignacion", "var_declaracion", "cons_declaration", 
		"println", "scan", "repetir", "para", "suma", "sin", "cos", "control"
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
			setState(40);
			match(BEGIN);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SCAN) | (1L << PRINTLN) | (1L << SUMA) | (1L << SIN) | (1L << COS) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(41);
				statement();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				var_declaracion();
				}
				break;
			case NOMBRE:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				var_asignacion();
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				println();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				repetir();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				para();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				control();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				sin();
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				cos();
				}
				break;
			case SUMA:
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				suma();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 10);
				{
				setState(58);
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
		public TerminalNode NOMBRE() { return getToken(ParserTParser.NOMBRE, 0); }
		public TerminalNode BOOLEAN() { return getToken(ParserTParser.BOOLEAN, 0); }
		public TerminalNode NUMERO() { return getToken(ParserTParser.NUMERO, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
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
			setState(63);
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
			setState(65);
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
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MOD) | (1L << OP_SUM) | (1L << OP_RES) | (1L << OP_MUL) | (1L << OP_DIV) | (1L << OP_ASI))) != 0)) ) {
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

	public static class ComparadoresContext extends ParserRuleContext {
		public TerminalNode OP_MAY() { return getToken(ParserTParser.OP_MAY, 0); }
		public TerminalNode OP_MEN() { return getToken(ParserTParser.OP_MEN, 0); }
		public TerminalNode OP_MAYI() { return getToken(ParserTParser.OP_MAYI, 0); }
		public TerminalNode OP_MENI() { return getToken(ParserTParser.OP_MENI, 0); }
		public TerminalNode OP_IGU() { return getToken(ParserTParser.OP_IGU, 0); }
		public TerminalNode OP_DIS() { return getToken(ParserTParser.OP_DIS, 0); }
		public ComparadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterComparadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitComparadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserTVisitor ) return ((ParserTVisitor<? extends T>)visitor).visitComparadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparadoresContext comparadores() throws RecognitionException {
		ComparadoresContext _localctx = new ComparadoresContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAY) | (1L << OP_MEN) | (1L << OP_MAYI) | (1L << OP_MENI) | (1L << OP_IGU) | (1L << OP_DIS))) != 0)) ) {
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
		public List<ComparadoresContext> comparadores() {
			return getRuleContexts(ComparadoresContext.class);
		}
		public ComparadoresContext comparadores(int i) {
			return getRuleContext(ComparadoresContext.class,i);
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
		enterRule(_localctx, 14, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			var();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAY) | (1L << OP_MEN) | (1L << OP_MAYI) | (1L << OP_MENI) | (1L << OP_IGU) | (1L << OP_DIS))) != 0)) {
				{
				{
				setState(72);
				comparadores();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
		enterRule(_localctx, 16, RULE_paso);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				var();
				setState(81);
				match(OP_SUM);
				setState(82);
				match(OP_SUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				var();
				setState(85);
				match(OP_RES);
				setState(86);
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
		enterRule(_localctx, 18, RULE_var_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(NOMBRE);
			setState(91);
			match(OP_ASI);
			setState(92);
			var();
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(93);
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
		enterRule(_localctx, 20, RULE_var_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type();
			setState(97);
			match(NOMBRE);
			setState(98);
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
		enterRule(_localctx, 22, RULE_cons_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(CONST);
			setState(101);
			type();
			setState(102);
			match(NOMBRE);
			setState(103);
			match(OP_ASI);
			setState(104);
			var();
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
		enterRule(_localctx, 24, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(PRINTLN);
			setState(108);
			match(PARENTHESIS_OPEN);
			setState(109);
			var();
			setState(110);
			match(PARENTHESIS_CLOSE);
			setState(111);
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
		enterRule(_localctx, 26, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(SCAN);
			setState(114);
			match(PARENTHESIS_OPEN);
			setState(115);
			var();
			setState(116);
			match(PARENTHESIS_CLOSE);
			setState(117);
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
		enterRule(_localctx, 28, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(WHILE);
			setState(120);
			match(PARENTHESIS_OPEN);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOMBRE) | (1L << NUMERO) | (1L << BOOLEAN))) != 0)) {
				{
				{
				setState(121);
				condicion();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(PARENTHESIS_CLOSE);
			setState(128);
			match(BRACKET_OPEN);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SCAN) | (1L << PRINTLN) | (1L << SUMA) | (1L << SIN) | (1L << COS) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(129);
				statement();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
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
		enterRule(_localctx, 30, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(FOR);
			setState(138);
			match(PARENTHESIS_OPEN);
			setState(139);
			var_asignacion();
			setState(140);
			match(PUNTOCOMA);
			setState(141);
			condicion();
			setState(142);
			match(PUNTOCOMA);
			setState(143);
			paso();
			setState(144);
			match(PARENTHESIS_CLOSE);
			setState(145);
			match(BRACKET_OPEN);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SCAN) | (1L << PRINTLN) | (1L << SUMA) | (1L << SIN) | (1L << COS) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(146);
				statement();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
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
		enterRule(_localctx, 32, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(SUMA);
			setState(155);
			match(PARENTHESIS_OPEN);
			setState(156);
			match(NUMERO);
			setState(157);
			match(COMA);
			setState(158);
			match(NUMERO);
			setState(159);
			match(PARENTHESIS_CLOSE);
			setState(160);
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
		enterRule(_localctx, 34, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(SIN);
			setState(163);
			match(PARENTHESIS_OPEN);
			setState(164);
			match(NUMERO);
			setState(165);
			match(PARENTHESIS_CLOSE);
			setState(166);
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
		enterRule(_localctx, 36, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(COS);
			setState(169);
			match(PARENTHESIS_OPEN);
			setState(170);
			match(NUMERO);
			setState(171);
			match(PARENTHESIS_CLOSE);
			setState(172);
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
		enterRule(_localctx, 38, RULE_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IF);
			setState(175);
			match(PARENTHESIS_OPEN);
			setState(176);
			condicion();
			setState(177);
			match(PARENTHESIS_CLOSE);
			setState(178);
			match(BRACKET_OPEN);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << SCAN) | (1L << PRINTLN) | (1L << SUMA) | (1L << SIN) | (1L << COS) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << NOMBRE))) != 0)) {
				{
				{
				setState(179);
				statement();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\tL\n\t\f\t\16\tO\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n[\n\n\3\13\3\13\3\13\3\13\5\13a\n\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20}\n\20\f\20\16\20\u0080"+
		"\13\20\3\20\3\20\3\20\7\20\u0085\n\20\f\20\16\20\u0088\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0096\n\21\f\21"+
		"\16\21\u0099\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\7\25\u00b7\n\25\f\25\16\25\u00ba\13\25\3\25\3\25\3"+
		"\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2&(\3\2"+
		"\33\35\4\2\17\23\32\32\3\2\24\31\2\u00ba\2*\3\2\2\2\4=\3\2\2\2\6?\3\2"+
		"\2\2\bA\3\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16G\3\2\2\2\20I\3\2\2\2\22Z\3\2"+
		"\2\2\24\\\3\2\2\2\26b\3\2\2\2\30f\3\2\2\2\32m\3\2\2\2\34s\3\2\2\2\36y"+
		"\3\2\2\2 \u008b\3\2\2\2\"\u009c\3\2\2\2$\u00a4\3\2\2\2&\u00aa\3\2\2\2"+
		"(\u00b0\3\2\2\2*.\7\3\2\2+-\5\4\3\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./"+
		"\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\4\2\2\62\3\3\2\2\2\63>\5\26\f"+
		"\2\64>\5\24\13\2\65>\5\32\16\2\66>\5\36\20\2\67>\5 \21\28>\5(\25\29>\5"+
		"$\23\2:>\5&\24\2;>\5\"\22\2<>\5\34\17\2=\63\3\2\2\2=\64\3\2\2\2=\65\3"+
		"\2\2\2=\66\3\2\2\2=\67\3\2\2\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2"+
		"=<\3\2\2\2>\5\3\2\2\2?@\t\2\2\2@\7\3\2\2\2AB\t\2\2\2B\t\3\2\2\2CD\t\3"+
		"\2\2D\13\3\2\2\2EF\t\4\2\2F\r\3\2\2\2GH\t\5\2\2H\17\3\2\2\2IM\5\6\4\2"+
		"JL\5\16\b\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2"+
		"\2PQ\5\6\4\2Q\21\3\2\2\2RS\5\6\4\2ST\7\20\2\2TU\7\20\2\2U[\3\2\2\2VW\5"+
		"\6\4\2WX\7\21\2\2XY\7\21\2\2Y[\3\2\2\2ZR\3\2\2\2ZV\3\2\2\2[\23\3\2\2\2"+
		"\\]\7&\2\2]^\7\32\2\2^`\5\6\4\2_a\7)\2\2`_\3\2\2\2`a\3\2\2\2a\25\3\2\2"+
		"\2bc\5\n\6\2cd\7&\2\2de\7)\2\2e\27\3\2\2\2fg\7\36\2\2gh\5\n\6\2hi\7&\2"+
		"\2ij\7\32\2\2jk\5\6\4\2kl\7)\2\2l\31\3\2\2\2mn\7\13\2\2no\7!\2\2op\5\6"+
		"\4\2pq\7\"\2\2qr\7)\2\2r\33\3\2\2\2st\7\n\2\2tu\7!\2\2uv\5\6\4\2vw\7\""+
		"\2\2wx\7)\2\2x\35\3\2\2\2yz\7\b\2\2z~\7!\2\2{}\5\20\t\2|{\3\2\2\2}\u0080"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u0082\7\"\2\2\u0082\u0086\7\37\2\2\u0083\u0085\5\4\3\2\u0084\u0083\3"+
		"\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7 \2\2\u008a\37\3\2\2\2"+
		"\u008b\u008c\7\t\2\2\u008c\u008d\7!\2\2\u008d\u008e\5\24\13\2\u008e\u008f"+
		"\7)\2\2\u008f\u0090\5\20\t\2\u0090\u0091\7)\2\2\u0091\u0092\5\22\n\2\u0092"+
		"\u0093\7\"\2\2\u0093\u0097\7\37\2\2\u0094\u0096\5\4\3\2\u0095\u0094\3"+
		"\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7 \2\2\u009b!\3\2\2\2\u009c"+
		"\u009d\7\f\2\2\u009d\u009e\7!\2\2\u009e\u009f\7\'\2\2\u009f\u00a0\7*\2"+
		"\2\u00a0\u00a1\7\'\2\2\u00a1\u00a2\7\"\2\2\u00a2\u00a3\7)\2\2\u00a3#\3"+
		"\2\2\2\u00a4\u00a5\7\r\2\2\u00a5\u00a6\7!\2\2\u00a6\u00a7\7\'\2\2\u00a7"+
		"\u00a8\7\"\2\2\u00a8\u00a9\7)\2\2\u00a9%\3\2\2\2\u00aa\u00ab\7\16\2\2"+
		"\u00ab\u00ac\7!\2\2\u00ac\u00ad\7\'\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af"+
		"\7)\2\2\u00af\'\3\2\2\2\u00b0\u00b1\7\7\2\2\u00b1\u00b2\7!\2\2\u00b2\u00b3"+
		"\5\20\t\2\u00b3\u00b4\7\"\2\2\u00b4\u00b8\7\37\2\2\u00b5\u00b7\5\4\3\2"+
		"\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7 \2\2\u00bc"+
		")\3\2\2\2\13.=MZ`~\u0086\u0097\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}