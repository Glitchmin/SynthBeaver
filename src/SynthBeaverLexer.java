// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SynthBeaverLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		NUMBER=18, ID=19, OP=20, EXPRESSION=21, WS=22, ANYTHING=23, LINE_COMMENT=24, 
		COMMENT=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"NUMBER", "ID", "OP", "EXPRESSION", "WS", "ANYTHING", "LINE_COMMENT", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'for'", "'('", "')'", "'while'", "':'", "'='", "'val'", 
			"'var'", "'if'", "'else'", "'{'", "'}'", "'->'", "','", "'!!!'", "'def'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NUMBER", "ID", "OP", "EXPRESSION", 
			"WS", "ANYTHING", "LINE_COMMENT", "COMMENT"
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


	public SynthBeaverLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SynthBeaver.g4"; }

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
		"\u0004\u0000\u0019\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0004\u0011j\b\u0011\u000b\u0011\f\u0011"+
		"k\u0001\u0012\u0004\u0012o\b\u0012\u000b\u0012\f\u0012p\u0001\u0013\u0001"+
		"\u0013\u0003\u0013u\b\u0013\u0001\u0014\u0004\u0014x\b\u0014\u000b\u0014"+
		"\f\u0014y\u0001\u0015\u0004\u0015}\b\u0015\u000b\u0015\f\u0015~\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0004\u0016\u0084\b\u0016\u000b\u0016\f"+
		"\u0016\u0085\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u008c\b\u0017\n\u0017\f\u0017\u008f\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0098"+
		"\b\u0018\n\u0018\f\u0018\u009b\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0085\u0000\u0019\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000"+
		"\u0007\u0001\u000009\u0003\u0000..AZaz\u0005\u0000*+--//<>^^\u0001\u0000"+
		"==\u0003\u000009AZaz\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00a9\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000"+
		"\u0000\u0000\u00035\u0001\u0000\u0000\u0000\u00059\u0001\u0000\u0000\u0000"+
		"\u0007;\u0001\u0000\u0000\u0000\t=\u0001\u0000\u0000\u0000\u000bC\u0001"+
		"\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000fG\u0001\u0000\u0000"+
		"\u0000\u0011K\u0001\u0000\u0000\u0000\u0013O\u0001\u0000\u0000\u0000\u0015"+
		"R\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000\u0000\u0019Y\u0001"+
		"\u0000\u0000\u0000\u001b[\u0001\u0000\u0000\u0000\u001d^\u0001\u0000\u0000"+
		"\u0000\u001f`\u0001\u0000\u0000\u0000!d\u0001\u0000\u0000\u0000#i\u0001"+
		"\u0000\u0000\u0000%n\u0001\u0000\u0000\u0000\'r\u0001\u0000\u0000\u0000"+
		")w\u0001\u0000\u0000\u0000+|\u0001\u0000\u0000\u0000-\u0083\u0001\u0000"+
		"\u0000\u0000/\u0087\u0001\u0000\u0000\u00001\u0092\u0001\u0000\u0000\u0000"+
		"34\u0005;\u0000\u00004\u0002\u0001\u0000\u0000\u000056\u0005f\u0000\u0000"+
		"67\u0005o\u0000\u000078\u0005r\u0000\u00008\u0004\u0001\u0000\u0000\u0000"+
		"9:\u0005(\u0000\u0000:\u0006\u0001\u0000\u0000\u0000;<\u0005)\u0000\u0000"+
		"<\b\u0001\u0000\u0000\u0000=>\u0005w\u0000\u0000>?\u0005h\u0000\u0000"+
		"?@\u0005i\u0000\u0000@A\u0005l\u0000\u0000AB\u0005e\u0000\u0000B\n\u0001"+
		"\u0000\u0000\u0000CD\u0005:\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005"+
		"=\u0000\u0000F\u000e\u0001\u0000\u0000\u0000GH\u0005v\u0000\u0000HI\u0005"+
		"a\u0000\u0000IJ\u0005l\u0000\u0000J\u0010\u0001\u0000\u0000\u0000KL\u0005"+
		"v\u0000\u0000LM\u0005a\u0000\u0000MN\u0005r\u0000\u0000N\u0012\u0001\u0000"+
		"\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005f\u0000\u0000Q\u0014\u0001\u0000"+
		"\u0000\u0000RS\u0005e\u0000\u0000ST\u0005l\u0000\u0000TU\u0005s\u0000"+
		"\u0000UV\u0005e\u0000\u0000V\u0016\u0001\u0000\u0000\u0000WX\u0005{\u0000"+
		"\u0000X\u0018\u0001\u0000\u0000\u0000YZ\u0005}\u0000\u0000Z\u001a\u0001"+
		"\u0000\u0000\u0000[\\\u0005-\u0000\u0000\\]\u0005>\u0000\u0000]\u001c"+
		"\u0001\u0000\u0000\u0000^_\u0005,\u0000\u0000_\u001e\u0001\u0000\u0000"+
		"\u0000`a\u0005!\u0000\u0000ab\u0005!\u0000\u0000bc\u0005!\u0000\u0000"+
		"c \u0001\u0000\u0000\u0000de\u0005d\u0000\u0000ef\u0005e\u0000\u0000f"+
		"g\u0005f\u0000\u0000g\"\u0001\u0000\u0000\u0000hj\u0007\u0000\u0000\u0000"+
		"ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000l$\u0001\u0000\u0000\u0000mo\u0007\u0001"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q&\u0001\u0000\u0000\u0000"+
		"rt\u0007\u0002\u0000\u0000su\u0007\u0003\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000u(\u0001\u0000\u0000\u0000vx\u0007\u0004"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z*\u0001\u0000\u0000\u0000"+
		"{}\u0007\u0005\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0006\u0015\u0000\u0000\u0081"+
		",\u0001\u0000\u0000\u0000\u0082\u0084\t\u0000\u0000\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086.\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005/\u0000\u0000\u0088\u0089\u0005/\u0000"+
		"\u0000\u0089\u008d\u0001\u0000\u0000\u0000\u008a\u008c\b\u0006\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0006\u0017\u0000\u0000\u00910\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005/\u0000\u0000\u0093\u0094\u0005*\u0000\u0000\u0094\u0099\u0001"+
		"\u0000\u0000\u0000\u0095\u0098\u00031\u0018\u0000\u0096\u0098\t\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005*\u0000"+
		"\u0000\u009d\u009e\u0005/\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0006\u0018\u0000\u0000\u00a02\u0001\u0000\u0000\u0000\n"+
		"\u0000kpty~\u0085\u008d\u0097\u0099\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}