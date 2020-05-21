// Generated from C:/Users/iliy-/IntelliJIDEAProjects/HelloLang/src\Hello.g4 by ANTLR 4.8
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
		T__9=10, BEGIN=11, END=12, VAR=13, PROCEDURE=14, WHILE=15, DO=16, IF=17, 
		THEN=18, ASSIGN=19, DENIAL=20, COMPARE=21, CALL=22, CONST=23, PRINT=24, 
		BREAK=25, CONTINUE=26, AND=27, OR=28, BOOL=29, IDENT=30, ERROR_IDENT=31, 
		FLOAT=32, INTEGER=33, STRING=34, NUMBER=35, LETTERS=36, MANY_COMMENT=37, 
		LINE_COMMENT=38, WS=39;
	public static final int
		RULE_programm = 0, RULE_block = 1, RULE_procedure = 2, RULE_vars = 3, 
		RULE_consts = 4, RULE_statement = 5, RULE_region = 6, RULE_call = 7, RULE_assign = 8, 
		RULE_while_ = 9, RULE_if_ = 10, RULE_print = 11, RULE_break_ = 12, RULE_continue_ = 13, 
		RULE_condition = 14, RULE_term_cond = 15, RULE_factor_cond = 16, RULE_expr = 17, 
		RULE_term = 18, RULE_factor = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "block", "procedure", "vars", "consts", "statement", "region", 
			"call", "assign", "while_", "if_", "print", "break_", "continue_", "condition", 
			"term_cond", "factor_cond", "expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'='", "','", "'('", "')'", "'+'", "'-'", "'/'", 
			"'*'", "'BEGIN'", "'END'", "'VAR'", "'PROCEDURE'", "'WHILE'", "'DO'", 
			"'IF'", "'THEN'", "':='", "'!'", null, "'CALL'", "'CONST'", "'PRINT'", 
			"'BREAK'", "'CONTINUE'", "'AND'", "'OR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "BEGIN", 
			"END", "VAR", "PROCEDURE", "WHILE", "DO", "IF", "THEN", "ASSIGN", "DENIAL", 
			"COMPARE", "CALL", "CONST", "PRINT", "BREAK", "CONTINUE", "AND", "OR", 
			"BOOL", "IDENT", "ERROR_IDENT", "FLOAT", "INTEGER", "STRING", "NUMBER", 
			"LETTERS", "MANY_COMMENT", "LINE_COMMENT", "WS"
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
			setState(40);
			block();
			setState(41);
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
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				{
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(43);
					consts();
					}
				}

				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(46);
					vars();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(49);
					vars();
					}
				}

				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONST) {
					{
					setState(52);
					consts();
					}
				}

				}
				}
				break;
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCEDURE) {
				{
				{
				setState(57);
				procedure();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			statement();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(64);
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
			setState(67);
			match(PROCEDURE);
			setState(68);
			match(IDENT);
			setState(69);
			match(T__1);
			setState(70);
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
		public TerminalNode VAR() { return getToken(HelloParser.VAR, 0); }
		public List<TerminalNode> IDENT() { return getTokens(HelloParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(HelloParser.IDENT, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(HelloParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(HelloParser.INTEGER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(HelloParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(HelloParser.FLOAT, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(HelloParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(HelloParser.BOOL, i);
		}
		public List<TerminalNode> STRING() { return getTokens(HelloParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HelloParser.STRING, i);
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
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(VAR);
			setState(73);
			match(IDENT);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(74);
				match(T__2);
				setState(75);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << FLOAT) | (1L << INTEGER) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(78);
				match(T__3);
				setState(79);
				match(IDENT);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(80);
					match(T__2);
					setState(81);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << FLOAT) | (1L << INTEGER) | (1L << STRING))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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

	public static class ConstsContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(HelloParser.CONST, 0); }
		public List<TerminalNode> IDENT() { return getTokens(HelloParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(HelloParser.IDENT, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(HelloParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(HelloParser.INTEGER, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(HelloParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(HelloParser.FLOAT, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(HelloParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(HelloParser.BOOL, i);
		}
		public List<TerminalNode> STRING() { return getTokens(HelloParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HelloParser.STRING, i);
		}
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitConsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_consts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(CONST);
			setState(92);
			match(IDENT);
			setState(93);
			match(T__2);
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << FLOAT) | (1L << INTEGER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(95);
				match(T__3);
				setState(96);
				match(IDENT);
				setState(97);
				match(T__2);
				setState(98);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << FLOAT) | (1L << INTEGER) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
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
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				region();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				call();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				assign();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				while_();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				if_();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				print();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				break_();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
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
			setState(116);
			match(BEGIN);
			setState(117);
			statement();
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					match(T__1);
					setState(119);
					statement();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(125);
				match(T__1);
				}
			}

			setState(128);
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
			setState(130);
			match(CALL);
			setState(131);
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
			setState(133);
			match(IDENT);
			setState(134);
			match(ASSIGN);
			setState(135);
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
			setState(137);
			match(WHILE);
			setState(138);
			condition(0);
			setState(139);
			match(DO);
			setState(140);
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
			setState(142);
			match(IF);
			setState(143);
			condition(0);
			setState(144);
			match(THEN);
			setState(145);
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
		public TerminalNode PRINT() { return getToken(HelloParser.PRINT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(PRINT);
			setState(148);
			match(T__4);
			setState(149);
			expr(0);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(150);
				match(T__3);
				setState(151);
				expr(0);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(T__5);
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
			setState(159);
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
			setState(161);
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
		public Term_condContext term_cond() {
			return getRuleContext(Term_condContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode DENIAL() { return getToken(HelloParser.DENIAL, 0); }
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCondition(this);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(164);
				term_cond(0);
				}
				break;
			case 2:
				{
				setState(165);
				match(T__4);
				setState(166);
				condition(0);
				setState(167);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(169);
				match(DENIAL);
				setState(170);
				condition(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(173);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(174);
					match(AND);
					setState(175);
					term_cond(0);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public Factor_condContext factor_cond() {
			return getRuleContext(Factor_condContext.class,0);
		}
		public TerminalNode DENIAL() { return getToken(HelloParser.DENIAL, 0); }
		public Term_condContext term_cond() {
			return getRuleContext(Term_condContext.class,0);
		}
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public Term_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm_cond(this);
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(182);
				factor_cond();
				}
				break;
			case 2:
				{
				setState(183);
				match(DENIAL);
				setState(184);
				term_cond(3);
				}
				break;
			case 3:
				{
				setState(185);
				match(T__4);
				setState(186);
				term_cond(0);
				setState(187);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term_condContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term_cond);
					setState(191);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(192);
					match(OR);
					setState(193);
					factor_cond();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(HelloParser.COMPARE, 0); }
		public TerminalNode DENIAL() { return getToken(HelloParser.DENIAL, 0); }
		public Factor_condContext factor_cond() {
			return getRuleContext(Factor_condContext.class,0);
		}
		public Factor_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFactor_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFactor_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_condContext factor_cond() throws RecognitionException {
		Factor_condContext _localctx = new Factor_condContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor_cond);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(T__4);
				setState(200);
				expr(0);
				setState(201);
				match(COMPARE);
				setState(202);
				expr(0);
				setState(203);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__4);
				setState(206);
				expr(0);
				setState(207);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(DENIAL);
				setState(210);
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
	public static class Expr_stringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public Expr_stringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpr_string(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case IDENT:
			case FLOAT:
			case INTEGER:
				{
				_localctx = new Expr_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(214);
				term(0);
				}
				break;
			case BOOL:
				{
				_localctx = new Expr_boolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(BOOL);
				}
				break;
			case STRING:
				{
				_localctx = new Expr_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
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
					setState(219);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(220);
					((Expr_opContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__6 || _la==T__7) ) {
						((Expr_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(221);
					term(0);
					}
					} 
				}
				setState(226);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Term_factorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(228);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
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
					setState(230);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(231);
					((Term_opContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==T__9) ) {
						((Term_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(232);
					factor();
					}
					} 
				}
				setState(237);
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
		enterRule(_localctx, 38, RULE_factor);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new Factor_identContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(IDENT);
				}
				break;
			case INTEGER:
				_localctx = new Factor_integerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new Factor_floatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(FLOAT);
				}
				break;
			case T__4:
				_localctx = new Factor_exprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(T__4);
				setState(242);
				expr(0);
				setState(243);
				match(T__5);
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
		case 14:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 15:
			return term_cond_sempred((Term_condContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 18:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_cond_sempred(Term_condContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\5\3/\n\3\3\3\5\3\62\n\3"+
		"\3\3\5\3\65\n\3\3\3\5\38\n\3\5\3:\n\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\3"+
		"\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5O\n\5\3\5\3\5\3\5"+
		"\3\5\5\5U\n\5\7\5W\n\5\f\5\16\5Z\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7u\n\7\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\5\b\u0081\n\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u009b\n\r\f\r\16\r\u009e\13\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00ae\n\20\3\20\3\20\3\20\7\20\u00b3\n\20\f\20\16\20\u00b6\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c0\n\21\3\21\3\21\3\21\7\21"+
		"\u00c5\n\21\f\21\16\21\u00c8\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00d6\n\22\3\23\3\23\3\23\3\23\5\23\u00dc"+
		"\n\23\3\23\3\23\3\23\7\23\u00e1\n\23\f\23\16\23\u00e4\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u00ec\n\24\f\24\16\24\u00ef\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00f8\n\25\3\25\2\6\36 $&\26\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(\2\5\4\2\37\37\"$\3\2\t\n\3\2\13\f"+
		"\2\u0109\2*\3\2\2\2\49\3\2\2\2\6E\3\2\2\2\bJ\3\2\2\2\n]\3\2\2\2\ft\3\2"+
		"\2\2\16v\3\2\2\2\20\u0084\3\2\2\2\22\u0087\3\2\2\2\24\u008b\3\2\2\2\26"+
		"\u0090\3\2\2\2\30\u0095\3\2\2\2\32\u00a1\3\2\2\2\34\u00a3\3\2\2\2\36\u00ad"+
		"\3\2\2\2 \u00bf\3\2\2\2\"\u00d5\3\2\2\2$\u00db\3\2\2\2&\u00e5\3\2\2\2"+
		"(\u00f7\3\2\2\2*+\5\4\3\2+,\7\3\2\2,\3\3\2\2\2-/\5\n\6\2.-\3\2\2\2./\3"+
		"\2\2\2/\61\3\2\2\2\60\62\5\b\5\2\61\60\3\2\2\2\61\62\3\2\2\2\62:\3\2\2"+
		"\2\63\65\5\b\5\2\64\63\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\668\5\n\6\2"+
		"\67\66\3\2\2\2\678\3\2\2\28:\3\2\2\29.\3\2\2\29\64\3\2\2\2:>\3\2\2\2;"+
		"=\5\6\4\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2"+
		"AC\5\f\7\2BD\7\4\2\2CB\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EF\7\20\2\2FG\7 \2"+
		"\2GH\7\4\2\2HI\5\4\3\2I\7\3\2\2\2JK\7\17\2\2KN\7 \2\2LM\7\5\2\2MO\t\2"+
		"\2\2NL\3\2\2\2NO\3\2\2\2OX\3\2\2\2PQ\7\6\2\2QT\7 \2\2RS\7\5\2\2SU\t\2"+
		"\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VP\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\4\2\2\\\t\3\2\2\2]^\7\31\2\2^_\7 \2\2_`"+
		"\7\5\2\2`g\t\2\2\2ab\7\6\2\2bc\7 \2\2cd\7\5\2\2df\t\2\2\2ea\3\2\2\2fi"+
		"\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\4\2\2k\13\3\2\2\2"+
		"lu\5\16\b\2mu\5\20\t\2nu\5\22\n\2ou\5\24\13\2pu\5\26\f\2qu\5\30\r\2ru"+
		"\5\32\16\2su\5\34\17\2tl\3\2\2\2tm\3\2\2\2tn\3\2\2\2to\3\2\2\2tp\3\2\2"+
		"\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\r\3\2\2\2vw\7\r\2\2w|\5\f\7\2xy\7\4"+
		"\2\2y{\5\f\7\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2"+
		"~|\3\2\2\2\177\u0081\7\4\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7\16\2\2\u0083\17\3\2\2\2\u0084\u0085\7\30"+
		"\2\2\u0085\u0086\7 \2\2\u0086\21\3\2\2\2\u0087\u0088\7 \2\2\u0088\u0089"+
		"\7\25\2\2\u0089\u008a\5$\23\2\u008a\23\3\2\2\2\u008b\u008c\7\21\2\2\u008c"+
		"\u008d\5\36\20\2\u008d\u008e\7\22\2\2\u008e\u008f\5\f\7\2\u008f\25\3\2"+
		"\2\2\u0090\u0091\7\23\2\2\u0091\u0092\5\36\20\2\u0092\u0093\7\24\2\2\u0093"+
		"\u0094\5\f\7\2\u0094\27\3\2\2\2\u0095\u0096\7\32\2\2\u0096\u0097\7\7\2"+
		"\2\u0097\u009c\5$\23\2\u0098\u0099\7\6\2\2\u0099\u009b\5$\23\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\b\2\2\u00a0\31\3\2\2"+
		"\2\u00a1\u00a2\7\33\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\7\34\2\2\u00a4\35"+
		"\3\2\2\2\u00a5\u00a6\b\20\1\2\u00a6\u00ae\5 \21\2\u00a7\u00a8\7\7\2\2"+
		"\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7\b\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ac"+
		"\7\26\2\2\u00ac\u00ae\5\36\20\4\u00ad\u00a5\3\2\2\2\u00ad\u00a7\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ae\u00b4\3\2\2\2\u00af\u00b0\f\3\2\2\u00b0\u00b1"+
		"\7\35\2\2\u00b1\u00b3\5 \21\2\u00b2\u00af\3\2\2\2\u00b3\u00b6\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\37\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00b8\b\21\1\2\u00b8\u00c0\5\"\22\2\u00b9\u00ba\7\26\2"+
		"\2\u00ba\u00c0\5 \21\5\u00bb\u00bc\7\7\2\2\u00bc\u00bd\5 \21\2\u00bd\u00be"+
		"\7\b\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf"+
		"\u00bb\3\2\2\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\f\3\2\2\u00c2\u00c3\7\36"+
		"\2\2\u00c3\u00c5\5\"\22\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7!\3\2\2\2\u00c8\u00c6\3\2\2\2"+
		"\u00c9\u00ca\7\7\2\2\u00ca\u00cb\5$\23\2\u00cb\u00cc\7\27\2\2\u00cc\u00cd"+
		"\5$\23\2\u00cd\u00ce\7\b\2\2\u00ce\u00d6\3\2\2\2\u00cf\u00d0\7\7\2\2\u00d0"+
		"\u00d1\5$\23\2\u00d1\u00d2\7\b\2\2\u00d2\u00d6\3\2\2\2\u00d3\u00d4\7\26"+
		"\2\2\u00d4\u00d6\5\"\22\2\u00d5\u00c9\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6#\3\2\2\2\u00d7\u00d8\b\23\1\2\u00d8\u00dc\5&\24\2"+
		"\u00d9\u00dc\7\37\2\2\u00da\u00dc\7$\2\2\u00db\u00d7\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00e2\3\2\2\2\u00dd\u00de\f\5\2\2\u00de"+
		"\u00df\t\3\2\2\u00df\u00e1\5&\24\2\u00e0\u00dd\3\2\2\2\u00e1\u00e4\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3%\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e5\u00e6\b\24\1\2\u00e6\u00e7\5(\25\2\u00e7\u00ed\3\2\2\2"+
		"\u00e8\u00e9\f\3\2\2\u00e9\u00ea\t\4\2\2\u00ea\u00ec\5(\25\2\u00eb\u00e8"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\'\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f8\7 \2\2\u00f1\u00f8\7#\2\2\u00f2"+
		"\u00f8\7\"\2\2\u00f3\u00f4\7\7\2\2\u00f4\u00f5\5$\23\2\u00f5\u00f6\7\b"+
		"\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7"+
		"\u00f2\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8)\3\2\2\2\32.\61\64\679>CNTXg"+
		"t|\u0080\u009c\u00ad\u00b4\u00bf\u00c6\u00d5\u00db\u00e2\u00ed\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}