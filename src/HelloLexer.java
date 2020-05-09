// Generated from C:/Users/iliy-/IntelliJIDEAProjects/Hello/src\Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "BEGIN", "END", "VAR", "PROCEDURE", "WHILE", "DO", "IF", "THEN", 
			"ASSIGN", "DENIAL", "COMPARE", "CALL", "CONST", "PRINT", "BREAK", "CONTINUE", 
			"AND", "OR", "BOOL", "IDENT", "ERROR_IDENT", "FLOAT", "INTEGER", "STRING", 
			"NUMBER", "LETTERS", "MANY_COMMENT", "LINE_COMMENT", "WS"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0121\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u009d\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u00cf\n\36\3\37\3\37\3\37\7\37\u00d4\n"+
		"\37\f\37\16\37\u00d7\13\37\3 \3 \3 \3 \7 \u00dd\n \f \16 \u00e0\13 \3"+
		"!\5!\u00e3\n!\3!\3!\3!\3!\3\"\5\"\u00ea\n\"\3\"\3\"\3#\3#\3#\7#\u00f1"+
		"\n#\f#\16#\u00f4\13#\3#\3#\3$\6$\u00f9\n$\r$\16$\u00fa\3%\6%\u00fe\n%"+
		"\r%\16%\u00ff\3&\3&\3&\3&\7&\u0106\n&\f&\16&\u0109\13&\3&\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\7\'\u0114\n\'\f\'\16\'\u0117\13\'\3\'\3\'\3(\6(\u011c"+
		"\n(\r(\16(\u011d\3(\3(\3\u0107\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\7\4\2>>@@\3"+
		"\2\62;\4\2C\\c|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0132\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tW\3"+
		"\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21_\3\2\2\2\23a\3\2\2\2\25c"+
		"\3\2\2\2\27e\3\2\2\2\31k\3\2\2\2\33o\3\2\2\2\35s\3\2\2\2\37}\3\2\2\2!"+
		"\u0083\3\2\2\2#\u0086\3\2\2\2%\u0089\3\2\2\2\'\u008e\3\2\2\2)\u0091\3"+
		"\2\2\2+\u009c\3\2\2\2-\u009e\3\2\2\2/\u00a3\3\2\2\2\61\u00a9\3\2\2\2\63"+
		"\u00af\3\2\2\2\65\u00b5\3\2\2\2\67\u00be\3\2\2\29\u00c2\3\2\2\2;\u00ce"+
		"\3\2\2\2=\u00d0\3\2\2\2?\u00d8\3\2\2\2A\u00e2\3\2\2\2C\u00e9\3\2\2\2E"+
		"\u00ed\3\2\2\2G\u00f8\3\2\2\2I\u00fd\3\2\2\2K\u0101\3\2\2\2M\u010f\3\2"+
		"\2\2O\u011b\3\2\2\2QR\7\60\2\2R\4\3\2\2\2ST\7=\2\2T\6\3\2\2\2UV\7?\2\2"+
		"V\b\3\2\2\2WX\7.\2\2X\n\3\2\2\2YZ\7*\2\2Z\f\3\2\2\2[\\\7+\2\2\\\16\3\2"+
		"\2\2]^\7-\2\2^\20\3\2\2\2_`\7/\2\2`\22\3\2\2\2ab\7\61\2\2b\24\3\2\2\2"+
		"cd\7,\2\2d\26\3\2\2\2ef\7D\2\2fg\7G\2\2gh\7I\2\2hi\7K\2\2ij\7P\2\2j\30"+
		"\3\2\2\2kl\7G\2\2lm\7P\2\2mn\7F\2\2n\32\3\2\2\2op\7X\2\2pq\7C\2\2qr\7"+
		"T\2\2r\34\3\2\2\2st\7R\2\2tu\7T\2\2uv\7Q\2\2vw\7E\2\2wx\7G\2\2xy\7F\2"+
		"\2yz\7W\2\2z{\7T\2\2{|\7G\2\2|\36\3\2\2\2}~\7Y\2\2~\177\7J\2\2\177\u0080"+
		"\7K\2\2\u0080\u0081\7N\2\2\u0081\u0082\7G\2\2\u0082 \3\2\2\2\u0083\u0084"+
		"\7F\2\2\u0084\u0085\7Q\2\2\u0085\"\3\2\2\2\u0086\u0087\7K\2\2\u0087\u0088"+
		"\7H\2\2\u0088$\3\2\2\2\u0089\u008a\7V\2\2\u008a\u008b\7J\2\2\u008b\u008c"+
		"\7G\2\2\u008c\u008d\7P\2\2\u008d&\3\2\2\2\u008e\u008f\7<\2\2\u008f\u0090"+
		"\7?\2\2\u0090(\3\2\2\2\u0091\u0092\7#\2\2\u0092*\3\2\2\2\u0093\u0094\7"+
		"?\2\2\u0094\u009d\7?\2\2\u0095\u0096\7@\2\2\u0096\u009d\7?\2\2\u0097\u0098"+
		"\7>\2\2\u0098\u009d\7?\2\2\u0099\u009d\t\2\2\2\u009a\u009b\7#\2\2\u009b"+
		"\u009d\7?\2\2\u009c\u0093\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0097\3\2"+
		"\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009d,\3\2\2\2\u009e\u009f"+
		"\7E\2\2\u009f\u00a0\7C\2\2\u00a0\u00a1\7N\2\2\u00a1\u00a2\7N\2\2\u00a2"+
		".\3\2\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7Q\2\2\u00a5\u00a6\7P\2\2\u00a6"+
		"\u00a7\7U\2\2\u00a7\u00a8\7V\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\7R\2\2\u00aa"+
		"\u00ab\7T\2\2\u00ab\u00ac\7K\2\2\u00ac\u00ad\7P\2\2\u00ad\u00ae\7V\2\2"+
		"\u00ae\62\3\2\2\2\u00af\u00b0\7D\2\2\u00b0\u00b1\7T\2\2\u00b1\u00b2\7"+
		"G\2\2\u00b2\u00b3\7C\2\2\u00b3\u00b4\7M\2\2\u00b4\64\3\2\2\2\u00b5\u00b6"+
		"\7E\2\2\u00b6\u00b7\7Q\2\2\u00b7\u00b8\7P\2\2\u00b8\u00b9\7V\2\2\u00b9"+
		"\u00ba\7K\2\2\u00ba\u00bb\7P\2\2\u00bb\u00bc\7W\2\2\u00bc\u00bd\7G\2\2"+
		"\u00bd\66\3\2\2\2\u00be\u00bf\7C\2\2\u00bf\u00c0\7P\2\2\u00c0\u00c1\7"+
		"F\2\2\u00c18\3\2\2\2\u00c2\u00c3\7Q\2\2\u00c3\u00c4\7T\2\2\u00c4:\3\2"+
		"\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7w\2\2\u00c8\u00cf"+
		"\7g\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7n\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00cf\7g\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c9\3\2\2"+
		"\2\u00cf<\3\2\2\2\u00d0\u00d5\5I%\2\u00d1\u00d4\5I%\2\u00d2\u00d4\5G$"+
		"\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6>\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00d9\5G$\2\u00d9\u00de\5I%\2\u00da\u00dd\5I%\2\u00db\u00dd\5G$\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df@\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3"+
		"\7/\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\5G$\2\u00e5\u00e6\7\60\2\2\u00e6\u00e7\5G$\2\u00e7B\3\2\2\2\u00e8"+
		"\u00ea\7/\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\5G$\2\u00ecD\3\2\2\2\u00ed\u00f2\7$\2\2\u00ee\u00f1\5"+
		"I%\2\u00ef\u00f1\5G$\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f6\7$\2\2\u00f6F\3\2\2\2\u00f7\u00f9\t\3\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fbH\3\2\2\2\u00fc\u00fe\t\4\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100J\3\2\2\2\u0101"+
		"\u0102\7\61\2\2\u0102\u0103\7,\2\2\u0103\u0107\3\2\2\2\u0104\u0106\13"+
		"\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0108\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7,"+
		"\2\2\u010b\u010c\7\61\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b&\2\2\u010e"+
		"L\3\2\2\2\u010f\u0110\7\61\2\2\u0110\u0111\7\61\2\2\u0111\u0115\3\2\2"+
		"\2\u0112\u0114\n\5\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u0119\b\'\2\2\u0119N\3\2\2\2\u011a\u011c\t\6\2\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0120\b(\2\2\u0120P\3\2\2\2\22\2\u009c\u00ce\u00d3\u00d5"+
		"\u00dc\u00de\u00e2\u00e9\u00f0\u00f2\u00fa\u00ff\u0107\u0115\u011d\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}