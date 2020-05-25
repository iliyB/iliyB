// Generated from /home/iliy/IdeaProjects/HelloLang/src/Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		BEGIN=10, END=11, VAR=12, PROCEDURE=13, WHILE=14, DO=15, IF=16, THEN=17, 
		ASSIGN=18, DENIAL=19, COMPARE=20, CALL=21, CONST=22, PRINT=23, BREAK=24, 
		CONTINUE=25, AND=26, OR=27, DECLARE_INT=28, DECLARE_FLOAT=29, DECLARE_BOOLEAN=30, 
		DECLARE_STRING=31, BOOL=32, IDENT=33, ERROR_IDENT=34, FLOAT=35, INTEGER=36, 
		MINUS=37, STRING=38, NUMBER=39, LETTERS=40, MANY_COMMENT=41, LINE_COMMENT=42, 
		WS=43;
	public static final int
		RULE_programm = 0, RULE_block = 1, RULE_procedure = 2, RULE_vars = 3, 
		RULE_var = 4, RULE_statement = 5, RULE_region = 6, RULE_call = 7, RULE_assign = 8, 
		RULE_while_ = 9, RULE_if_ = 10, RULE_print = 11, RULE_break_ = 12, RULE_continue_ = 13, 
		RULE_condition = 14, RULE_term_cond = 15, RULE_factor_cond = 16, RULE_declare_string = 17, 
		RULE_declare_bool = 18, RULE_declare_float = 19, RULE_declare_int = 20, 
		RULE_expr = 21, RULE_term = 22, RULE_factor = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "block", "procedure", "vars", "var", "statement", "region", 
			"call", "assign", "while_", "if_", "print", "break_", "continue_", "condition", 
			"term_cond", "factor_cond", "declare_string", "declare_bool", "declare_float", 
			"declare_int", "expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "','", "'('", "')'", "'='", "'+'", "'/'", "'*'", 
			"'BEGIN'", "'END'", "'VAR'", "'PROCEDURE'", "'WHILE'", "'DO'", "'IF'", 
			"'THEN'", "':='", "'!'", null, "'CALL'", "'CONST'", "'PRINT'", "'BREAK'", 
			"'CONTINUE'", "'AND'", "'OR'", "'int'", "'double'", "'boolean'", "'string'", 
			null, null, null, null, null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "BEGIN", 
			"END", "VAR", "PROCEDURE", "WHILE", "DO", "IF", "THEN", "ASSIGN", "DENIAL", 
			"COMPARE", "CALL", "CONST", "PRINT", "BREAK", "CONTINUE", "AND", "OR", 
			"DECLARE_INT", "DECLARE_FLOAT", "DECLARE_BOOLEAN", "DECLARE_STRING", 
			"BOOL", "IDENT", "ERROR_IDENT", "FLOAT", "INTEGER", "MINUS", "STRING", 
			"NUMBER", "LETTERS", "MANY_COMMENT", "LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrammContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProgramm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitProgramm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			block();
			setState(49);
			match(T__0);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(51);
				vars(0);
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(54);
				procedure();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			statement();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(61);
				match(T__1);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(HelloParser.PROCEDURE, 0); }
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(PROCEDURE);
			setState(65);
			match(IDENT);
			setState(66);
			match(T__1);
			setState(67);
			block();
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

	public static class VarsContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		return vars(0);
	}

	private VarsContext vars(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarsContext _localctx = new VarsContext(_ctx, _parentState);
		VarsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_vars, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(70);
				var();
				setState(71);
				var();
				}
				break;
			case 2:
				{
				setState(73);
				var();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_vars);
					setState(76);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(77);
					var();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(HelloParser.VAR, 0); }
		public List<Declare_boolContext> declare_bool() {
			return getRuleContexts(Declare_boolContext.class);
		}
		public Declare_boolContext declare_bool(int i) {
			return getRuleContext(Declare_boolContext.class,i);
		}
		public List<Declare_intContext> declare_int() {
			return getRuleContexts(Declare_intContext.class);
		}
		public Declare_intContext declare_int(int i) {
			return getRuleContext(Declare_intContext.class,i);
		}
		public List<Declare_floatContext> declare_float() {
			return getRuleContexts(Declare_floatContext.class);
		}
		public Declare_floatContext declare_float(int i) {
			return getRuleContext(Declare_floatContext.class,i);
		}
		public List<Declare_stringContext> declare_string() {
			return getRuleContexts(Declare_stringContext.class);
		}
		public Declare_stringContext declare_string(int i) {
			return getRuleContext(Declare_stringContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(VAR);
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE_BOOLEAN:
				{
				setState(84);
				declare_bool();
				}
				break;
			case DECLARE_INT:
				{
				setState(85);
				declare_int();
				}
				break;
			case DECLARE_FLOAT:
				{
				setState(86);
				declare_float();
				}
				break;
			case DECLARE_STRING:
				{
				setState(87);
				declare_string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(90);
				match(T__2);
				setState(95);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DECLARE_BOOLEAN:
					{
					setState(91);
					declare_bool();
					}
					break;
				case DECLARE_INT:
					{
					setState(92);
					declare_int();
					}
					break;
				case DECLARE_FLOAT:
					{
					setState(93);
					declare_float();
					}
					break;
				case DECLARE_STRING:
					{
					setState(94);
					declare_string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__1);
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
		public RegionContext region() {
			return getRuleContext(RegionContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Break_Context break_() {
			return getRuleContext(Break_Context.class,0);
		}
		public Continue_Context continue_() {
			return getRuleContext(Continue_Context.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				region();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				call();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				assign();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				while_();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				if_();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				print();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				break_();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				continue_();
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

	public static class RegionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(HelloParser.BEGIN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode END() { return getToken(HelloParser.END, 0); }
		public RegionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_region; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterRegion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitRegion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitRegion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegionContext region() throws RecognitionException {
		RegionContext _localctx = new RegionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_region);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(BEGIN);
			setState(115);
			statement();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(T__1);
					setState(117);
					statement();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(123);
				match(T__1);
				}
			}

			setState(126);
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

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(HelloParser.CALL, 0); }
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(CALL);
			setState(129);
			match(IDENT);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(HelloParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENT);
			setState(132);
			match(ASSIGN);
			setState(133);
			expr(0);
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

	public static class While_Context extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(HelloParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DO() { return getToken(HelloParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitWhile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitWhile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(WHILE);
			setState(136);
			condition(0);
			setState(137);
			match(DO);
			setState(138);
			statement();
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

	public static class If_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HelloParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(HelloParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIf_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IF);
			setState(141);
			condition(0);
			setState(142);
			match(THEN);
			setState(143);
			statement();
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Print_exprContext extends PrintContext {
		public TerminalNode PRINT() { return getToken(HelloParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_exprContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrint_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrint_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPrint_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Print_stringContext extends PrintContext {
		public TerminalNode PRINT() { return getToken(HelloParser.PRINT, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public Print_stringContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrint_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrint_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPrint_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Print_exprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(PRINT);
				setState(146);
				match(T__3);
				setState(147);
				expr(0);
				setState(148);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new Print_stringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(PRINT);
				setState(151);
				match(T__3);
				setState(152);
				match(STRING);
				setState(153);
				match(T__4);
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

	public static class Break_Context extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(HelloParser.BREAK, 0); }
		public Break_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBreak_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBreak_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBreak_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_Context break_() throws RecognitionException {
		Break_Context _localctx = new Break_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_break_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(BREAK);
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

	public static class Continue_Context extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(HelloParser.CONTINUE, 0); }
		public Continue_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterContinue_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitContinue_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitContinue_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_Context continue_() throws RecognitionException {
		Continue_Context _localctx = new Continue_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_continue_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(CONTINUE);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Condition_denialContext extends ConditionContext {
		public TerminalNode DENIAL() { return getToken(HelloParser.DENIAL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Condition_denialContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCondition_denial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCondition_denial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCondition_denial(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Condition_termContext extends ConditionContext {
		public Term_condContext term_cond() {
			return getRuleContext(Term_condContext.class,0);
		}
		public Condition_termContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCondition_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCondition_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCondition_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Condition_andContext extends ConditionContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public Term_condContext term_cond() {
			return getRuleContext(Term_condContext.class,0);
		}
		public Condition_andContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCondition_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCondition_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCondition_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new Condition_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(161);
				term_cond(0);
				}
				break;
			case 2:
				{
				_localctx = new Condition_denialContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(DENIAL);
				setState(163);
				condition(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Condition_andContext(new ConditionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(166);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(167);
					match(AND);
					setState(168);
					term_cond(0);
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Term_condContext extends ParserRuleContext {
		public Term_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_cond; }
	 
		public Term_condContext() { }
		public void copyFrom(Term_condContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Term_cond_denialContext extends Term_condContext {
		public TerminalNode DENIAL() { return getToken(HelloParser.DENIAL, 0); }
		public Term_condContext term_cond() {
			return getRuleContext(Term_condContext.class,0);
		}
		public Term_cond_denialContext(Term_condContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm_cond_denial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm_cond_denial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm_cond_denial(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_cond_factorContext extends Term_condContext {
		public Factor_condContext factor_cond() {
			return getRuleContext(Factor_condContext.class,0);
		}
		public Term_cond_factorContext(Term_condContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm_cond_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm_cond_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm_cond_factor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_cond_orContext extends Term_condContext {
		public Term_condContext term_cond() {
			return getRuleContext(Term_condContext.class,0);
		}
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public Factor_condContext factor_cond() {
			return getRuleContext(Factor_condContext.class,0);
		}
		public Term_cond_orContext(Term_condContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm_cond_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm_cond_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm_cond_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_condContext term_cond() throws RecognitionException {
		return term_cond(0);
	}

	private Term_condContext term_cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term_condContext _localctx = new Term_condContext(_ctx, _parentState);
		Term_condContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_term_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new Term_cond_factorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(175);
				factor_cond();
				}
				break;
			case 2:
				{
				_localctx = new Term_cond_denialContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(DENIAL);
				setState(177);
				term_cond(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term_cond_orContext(new Term_condContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term_cond);
					setState(180);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(181);
					match(OR);
					setState(182);
					factor_cond();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Factor_condContext extends ParserRuleContext {
		public Factor_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_cond; }
	 
		public Factor_condContext() { }
		public void copyFrom(Factor_condContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Factor_conditionContext extends Factor_condContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Factor_conditionContext(Factor_condContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor_condition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Factor_cond_exprContext extends Factor_condContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Factor_cond_exprContext(Factor_condContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor_cond_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor_cond_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor_cond_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Factor_cond_termContext extends Factor_condContext {
		public Term_condContext term_cond() {
			return getRuleContext(Term_condContext.class,0);
		}
		public Factor_cond_termContext(Factor_condContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor_cond_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor_cond_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor_cond_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Factor_cond_denialContext extends Factor_condContext {
		public TerminalNode DENIAL() { return getToken(HelloParser.DENIAL, 0); }
		public Factor_condContext factor_cond() {
			return getRuleContext(Factor_condContext.class,0);
		}
		public Factor_cond_denialContext(Factor_condContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor_cond_denial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor_cond_denial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor_cond_denial(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Factor_cond_compareContext extends Factor_condContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(HelloParser.COMPARE, 0); }
		public Factor_cond_compareContext(Factor_condContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor_cond_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor_cond_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor_cond_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_condContext factor_cond() throws RecognitionException {
		Factor_condContext _localctx = new Factor_condContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor_cond);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new Factor_cond_compareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(T__3);
				setState(189);
				expr(0);
				setState(190);
				((Factor_cond_compareContext)_localctx).op = match(COMPARE);
				setState(191);
				expr(0);
				setState(192);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new Factor_cond_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(T__3);
				setState(195);
				expr(0);
				setState(196);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new Factor_conditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(T__3);
				setState(199);
				condition(0);
				setState(200);
				match(T__4);
				}
				break;
			case 4:
				_localctx = new Factor_cond_termContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(T__3);
				setState(203);
				term_cond(0);
				setState(204);
				match(T__4);
				}
				break;
			case 5:
				_localctx = new Factor_cond_denialContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				match(DENIAL);
				setState(207);
				factor_cond();
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

	public static class Declare_stringContext extends ParserRuleContext {
		public TerminalNode DECLARE_STRING() { return getToken(HelloParser.DECLARE_STRING, 0); }
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public Declare_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclare_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclare_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclare_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stringContext declare_string() throws RecognitionException {
		Declare_stringContext _localctx = new Declare_stringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declare_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(DECLARE_STRING);
			setState(211);
			match(IDENT);
			setState(212);
			match(T__5);
			setState(213);
			match(STRING);
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

	public static class Declare_boolContext extends ParserRuleContext {
		public Declare_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_bool; }
	 
		public Declare_boolContext() { }
		public void copyFrom(Declare_boolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declare_bool_with_valueContext extends Declare_boolContext {
		public TerminalNode DECLARE_BOOLEAN() { return getToken(HelloParser.DECLARE_BOOLEAN, 0); }
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
		public Declare_bool_with_valueContext(Declare_boolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclare_bool_with_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclare_bool_with_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclare_bool_with_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Declare_bool_without_valueContext extends Declare_boolContext {
		public TerminalNode DECLARE_BOOLEAN() { return getToken(HelloParser.DECLARE_BOOLEAN, 0); }
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public Declare_bool_without_valueContext(Declare_boolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclare_bool_without_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclare_bool_without_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclare_bool_without_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_boolContext declare_bool() throws RecognitionException {
		Declare_boolContext _localctx = new Declare_boolContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declare_bool);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Declare_bool_with_valueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(DECLARE_BOOLEAN);
				setState(216);
				match(IDENT);
				setState(217);
				match(T__5);
				setState(218);
				match(BOOL);
				}
				break;
			case 2:
				_localctx = new Declare_bool_without_valueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(DECLARE_BOOLEAN);
				setState(220);
				match(IDENT);
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

	public static class Declare_floatContext extends ParserRuleContext {
		public Declare_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_float; }
	 
		public Declare_floatContext() { }
		public void copyFrom(Declare_floatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declare_float_with_valueContext extends Declare_floatContext {
		public TerminalNode DECLARE_FLOAT() { return getToken(HelloParser.DECLARE_FLOAT, 0); }
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public TerminalNode FLOAT() { return getToken(HelloParser.FLOAT, 0); }
		public Declare_float_with_valueContext(Declare_floatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclare_float_with_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclare_float_with_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclare_float_with_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Declare_float_without_valueContext extends Declare_floatContext {
		public TerminalNode DECLARE_FLOAT() { return getToken(HelloParser.DECLARE_FLOAT, 0); }
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public Declare_float_without_valueContext(Declare_floatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclare_float_without_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclare_float_without_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclare_float_without_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_floatContext declare_float() throws RecognitionException {
		Declare_floatContext _localctx = new Declare_floatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declare_float);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new Declare_float_with_valueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(DECLARE_FLOAT);
				setState(224);
				match(IDENT);
				setState(225);
				match(T__5);
				setState(226);
				match(FLOAT);
				}
				break;
			case 2:
				_localctx = new Declare_float_without_valueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(DECLARE_FLOAT);
				setState(228);
				match(IDENT);
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

	public static class Declare_intContext extends ParserRuleContext {
		public Declare_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_int; }
	 
		public Declare_intContext() { }
		public void copyFrom(Declare_intContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declare_int_without_valueContext extends Declare_intContext {
		public TerminalNode DECLARE_INT() { return getToken(HelloParser.DECLARE_INT, 0); }
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public Declare_int_without_valueContext(Declare_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclare_int_without_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclare_int_without_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclare_int_without_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Declare_int_with_valueContext extends Declare_intContext {
		public TerminalNode DECLARE_INT() { return getToken(HelloParser.DECLARE_INT, 0); }
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public TerminalNode INTEGER() { return getToken(HelloParser.INTEGER, 0); }
		public Declare_int_with_valueContext(Declare_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclare_int_with_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclare_int_with_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclare_int_with_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_intContext declare_int() throws RecognitionException {
		Declare_intContext _localctx = new Declare_intContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declare_int);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Declare_int_with_valueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(DECLARE_INT);
				setState(232);
				match(IDENT);
				setState(233);
				match(T__5);
				setState(234);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new Declare_int_without_valueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(DECLARE_INT);
				setState(236);
				match(IDENT);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr_opContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(HelloParser.MINUS, 0); }
		public Expr_opContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpr_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_termContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_termContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpr_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_boolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
		public Expr_boolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpr_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case IDENT:
			case FLOAT:
			case INTEGER:
				{
				_localctx = new Expr_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(240);
				term(0);
				}
				break;
			case BOOL:
				{
				_localctx = new Expr_boolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_opContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(244);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(245);
					((Expr_opContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__6 || _la==MINUS) ) {
						((Expr_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(246);
					term(0);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Term_opContext extends TermContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_opContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_factorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_factorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Term_factorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(253);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term_opContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(255);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(256);
					((Term_opContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==T__8) ) {
						((Term_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(257);
					factor();
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Factor_integerContext extends FactorContext {
		public TerminalNode INTEGER() { return getToken(HelloParser.INTEGER, 0); }
		public Factor_integerContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor_integer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor_integer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Factor_floatContext extends FactorContext {
		public TerminalNode FLOAT() { return getToken(HelloParser.FLOAT, 0); }
		public Factor_floatContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor_float(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Factor_identContext extends FactorContext {
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public Factor_identContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor_ident(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Factor_exprContext extends FactorContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Factor_exprContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new Factor_identContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(IDENT);
				}
				break;
			case INTEGER:
				_localctx = new Factor_integerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new Factor_floatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(FLOAT);
				}
				break;
			case T__3:
				_localctx = new Factor_exprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(T__3);
				setState(267);
				expr(0);
				setState(268);
				match(T__4);
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
		case 3:
			return vars_sempred((VarsContext)_localctx, predIndex);
		case 14:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 15:
			return term_cond_sempred((Term_condContext)_localctx, predIndex);
		case 21:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 22:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean vars_sempred(VarsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_cond_sempred(Term_condContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\5\3\67\n\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\5\3A\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\5\3\5\7\5Q\n\5\f"+
		"\5\16\5T\13\5\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\6\3\6\3\6\5\6b\n"+
		"\6\7\6d\n\6\f\6\16\6g\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"s\n\7\3\b\3\b\3\b\3\b\7\by\n\b\f\b\16\b|\13\b\3\b\5\b\177\n\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009d\n\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\5\20\u00a7\n\20\3\20\3\20\3\20\7\20\u00ac\n"+
		"\20\f\20\16\20\u00af\13\20\3\21\3\21\3\21\3\21\5\21\u00b5\n\21\3\21\3"+
		"\21\3\21\7\21\u00ba\n\21\f\21\16\21\u00bd\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00d3\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00e0\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e8\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f0\n\26\3\27\3\27\3\27\5\27"+
		"\u00f5\n\27\3\27\3\27\3\27\7\27\u00fa\n\27\f\27\16\27\u00fd\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u0105\n\30\f\30\16\30\u0108\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0111\n\31\3\31\2\7\b\36 ,.\32\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\4\2\t\t\'\'\3\2\n"+
		"\13\2\u0121\2\62\3\2\2\2\4\66\3\2\2\2\6B\3\2\2\2\bL\3\2\2\2\nU\3\2\2\2"+
		"\fr\3\2\2\2\16t\3\2\2\2\20\u0082\3\2\2\2\22\u0085\3\2\2\2\24\u0089\3\2"+
		"\2\2\26\u008e\3\2\2\2\30\u009c\3\2\2\2\32\u009e\3\2\2\2\34\u00a0\3\2\2"+
		"\2\36\u00a6\3\2\2\2 \u00b4\3\2\2\2\"\u00d2\3\2\2\2$\u00d4\3\2\2\2&\u00df"+
		"\3\2\2\2(\u00e7\3\2\2\2*\u00ef\3\2\2\2,\u00f4\3\2\2\2.\u00fe\3\2\2\2\60"+
		"\u0110\3\2\2\2\62\63\5\4\3\2\63\64\7\3\2\2\64\3\3\2\2\2\65\67\5\b\5\2"+
		"\66\65\3\2\2\2\66\67\3\2\2\2\67;\3\2\2\28:\5\6\4\298\3\2\2\2:=\3\2\2\2"+
		";9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>@\5\f\7\2?A\7\4\2\2@?\3\2\2\2"+
		"@A\3\2\2\2A\5\3\2\2\2BC\7\17\2\2CD\7#\2\2DE\7\4\2\2EF\5\4\3\2F\7\3\2\2"+
		"\2GH\b\5\1\2HI\5\n\6\2IJ\5\n\6\2JM\3\2\2\2KM\5\n\6\2LG\3\2\2\2LK\3\2\2"+
		"\2MR\3\2\2\2NO\f\5\2\2OQ\5\n\6\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2S\t\3\2\2\2TR\3\2\2\2UZ\7\16\2\2V[\5&\24\2W[\5*\26\2X[\5(\25\2Y[\5$"+
		"\23\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[e\3\2\2\2\\a\7\5\2\2]b\5"+
		"&\24\2^b\5*\26\2_b\5(\25\2`b\5$\23\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3"+
		"\2\2\2bd\3\2\2\2c\\\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge"+
		"\3\2\2\2hi\7\4\2\2i\13\3\2\2\2js\5\16\b\2ks\5\20\t\2ls\5\22\n\2ms\5\24"+
		"\13\2ns\5\26\f\2os\5\30\r\2ps\5\32\16\2qs\5\34\17\2rj\3\2\2\2rk\3\2\2"+
		"\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\r\3\2"+
		"\2\2tu\7\f\2\2uz\5\f\7\2vw\7\4\2\2wy\5\f\7\2xv\3\2\2\2y|\3\2\2\2zx\3\2"+
		"\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}\177\7\4\2\2~}\3\2\2\2~\177\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\7\r\2\2\u0081\17\3\2\2\2\u0082\u0083\7"+
		"\27\2\2\u0083\u0084\7#\2\2\u0084\21\3\2\2\2\u0085\u0086\7#\2\2\u0086\u0087"+
		"\7\24\2\2\u0087\u0088\5,\27\2\u0088\23\3\2\2\2\u0089\u008a\7\20\2\2\u008a"+
		"\u008b\5\36\20\2\u008b\u008c\7\21\2\2\u008c\u008d\5\f\7\2\u008d\25\3\2"+
		"\2\2\u008e\u008f\7\22\2\2\u008f\u0090\5\36\20\2\u0090\u0091\7\23\2\2\u0091"+
		"\u0092\5\f\7\2\u0092\27\3\2\2\2\u0093\u0094\7\31\2\2\u0094\u0095\7\6\2"+
		"\2\u0095\u0096\5,\27\2\u0096\u0097\7\7\2\2\u0097\u009d\3\2\2\2\u0098\u0099"+
		"\7\31\2\2\u0099\u009a\7\6\2\2\u009a\u009b\7(\2\2\u009b\u009d\7\7\2\2\u009c"+
		"\u0093\3\2\2\2\u009c\u0098\3\2\2\2\u009d\31\3\2\2\2\u009e\u009f\7\32\2"+
		"\2\u009f\33\3\2\2\2\u00a0\u00a1\7\33\2\2\u00a1\35\3\2\2\2\u00a2\u00a3"+
		"\b\20\1\2\u00a3\u00a7\5 \21\2\u00a4\u00a5\7\25\2\2\u00a5\u00a7\5\36\20"+
		"\4\u00a6\u00a2\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9"+
		"\f\3\2\2\u00a9\u00aa\7\34\2\2\u00aa\u00ac\5 \21\2\u00ab\u00a8\3\2\2\2"+
		"\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\37"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\b\21\1\2\u00b1\u00b5\5\"\22\2"+
		"\u00b2\u00b3\7\25\2\2\u00b3\u00b5\5 \21\4\u00b4\u00b0\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00bb\3\2\2\2\u00b6\u00b7\f\3\2\2\u00b7\u00b8\7\35\2\2"+
		"\u00b8\u00ba\5\"\22\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc!\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\7\6\2\2\u00bf\u00c0\5,\27\2\u00c0\u00c1\7\26\2\2\u00c1\u00c2\5"+
		",\27\2\u00c2\u00c3\7\7\2\2\u00c3\u00d3\3\2\2\2\u00c4\u00c5\7\6\2\2\u00c5"+
		"\u00c6\5,\27\2\u00c6\u00c7\7\7\2\2\u00c7\u00d3\3\2\2\2\u00c8\u00c9\7\6"+
		"\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\7\7\2\2\u00cb\u00d3\3\2\2\2\u00cc"+
		"\u00cd\7\6\2\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\7\7\2\2\u00cf\u00d3\3\2"+
		"\2\2\u00d0\u00d1\7\25\2\2\u00d1\u00d3\5\"\22\2\u00d2\u00be\3\2\2\2\u00d2"+
		"\u00c4\3\2\2\2\u00d2\u00c8\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d3#\3\2\2\2\u00d4\u00d5\7!\2\2\u00d5\u00d6\7#\2\2\u00d6\u00d7"+
		"\7\b\2\2\u00d7\u00d8\7(\2\2\u00d8%\3\2\2\2\u00d9\u00da\7 \2\2\u00da\u00db"+
		"\7#\2\2\u00db\u00dc\7\b\2\2\u00dc\u00e0\7\"\2\2\u00dd\u00de\7 \2\2\u00de"+
		"\u00e0\7#\2\2\u00df\u00d9\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\'\3\2\2\2"+
		"\u00e1\u00e2\7\37\2\2\u00e2\u00e3\7#\2\2\u00e3\u00e4\7\b\2\2\u00e4\u00e8"+
		"\7%\2\2\u00e5\u00e6\7\37\2\2\u00e6\u00e8\7#\2\2\u00e7\u00e1\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8)\3\2\2\2\u00e9\u00ea\7\36\2\2\u00ea\u00eb\7#\2\2"+
		"\u00eb\u00ec\7\b\2\2\u00ec\u00f0\7&\2\2\u00ed\u00ee\7\36\2\2\u00ee\u00f0"+
		"\7#\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0+\3\2\2\2\u00f1\u00f2"+
		"\b\27\1\2\u00f2\u00f5\5.\30\2\u00f3\u00f5\7\"\2\2\u00f4\u00f1\3\2\2\2"+
		"\u00f4\u00f3\3\2\2\2\u00f5\u00fb\3\2\2\2\u00f6\u00f7\f\4\2\2\u00f7\u00f8"+
		"\t\2\2\2\u00f8\u00fa\5.\30\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc-\3\2\2\2\u00fd\u00fb\3\2\2\2"+
		"\u00fe\u00ff\b\30\1\2\u00ff\u0100\5\60\31\2\u0100\u0106\3\2\2\2\u0101"+
		"\u0102\f\3\2\2\u0102\u0103\t\3\2\2\u0103\u0105\5\60\31\2\u0104\u0101\3"+
		"\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"/\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0111\7#\2\2\u010a\u0111\7&\2\2\u010b"+
		"\u0111\7%\2\2\u010c\u010d\7\6\2\2\u010d\u010e\5,\27\2\u010e\u010f\7\7"+
		"\2\2\u010f\u0111\3\2\2\2\u0110\u0109\3\2\2\2\u0110\u010a\3\2\2\2\u0110"+
		"\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0111\61\3\2\2\2\32\66;@LRZaerz~\u009c"+
		"\u00a6\u00ad\u00b4\u00bb\u00d2\u00df\u00e7\u00ef\u00f4\u00fb\u0106\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}