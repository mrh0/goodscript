// Generated from C:/Development/goodscript/src/main/antlr4\Goodscript.g4 by ANTLR 4.10.1
package github.mrh0.goodscript.antlr;

  import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoodscriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NL=8, BOOL=9, 
		NAME=10, ATOM=11, INT=12, HEX=13, BIN=14, CHAR=15, STRING=16, WHITESPACE=17, 
		COMMENT=18, BLOCKCOMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NL", "BOOL", 
			"NAME", "ATOM", "INT", "HEX", "BIN", "CHAR", "STRING", "WHITESPACE", 
			"COMMENT", "BLOCKCOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'start'", "'fn'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NL", "BOOL", "NAME", 
			"ATOM", "INT", "HEX", "BIN", "CHAR", "STRING", "WHITESPACE", "COMMENT", 
			"BLOCKCOMMENT"
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


	  private final DenterHelper denter = new DenterHelper(NL,
	                                                       GoodscriptParser.INDENT,
	                                                       GoodscriptParser.DEDENT)
	  {
	    @Override
	    public Token pullToken() {
	      return GoodscriptLexer.super.nextToken();
	    }
	  };

	  @Override
	  public Token nextToken() {
	    return denter.nextToken();
	  }


	public GoodscriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Goodscript.g4"; }

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
		"\u0004\u0000\u0013\u00b0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007<\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007@\b\u0007\n\u0007\f\u0007C\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bN\b\b\u0001\t\u0001\t\u0005\tR\b\t\n\t\f\tU\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0005\nZ\b\n\n\n\f\n]\t\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"a\b\u000b\u0001\u000b\u0001\u000b\u0005\u000be\b\u000b\n\u000b\f\u000b"+
		"h\t\u000b\u0003\u000bj\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f"+
		"p\b\f\n\f\f\fs\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\ry\b\r\n\r\f"+
		"\r|\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0086\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u008a\b\u000f\n\u000f\f\u000f\u008d\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010\u0092\b\u0010\u000b\u0010\f\u0010"+
		"\u0093\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u009c\b\u0011\n\u0011\f\u0011\u009f\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00a7\b\u0012\n\u0012\f\u0012\u00aa\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0002\u008b\u00a8\u0000\u0013\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\n\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0003\u000009AZaz\u0001\u000019\u0001\u000009\u0003\u0000"+
		"09AFaf\u0001\u000001\u0007\u0000\"\"\'\'00\\\\nnrrtt\u0003\u0000\t\n\r"+
		"\r  \u0002\u0000\n\n\r\r\u00be\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000"+
		"\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-"+
		"\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b6\u0001\u0000"+
		"\u0000\u0000\r8\u0001\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000"+
		"\u0011M\u0001\u0000\u0000\u0000\u0013O\u0001\u0000\u0000\u0000\u0015V"+
		"\u0001\u0000\u0000\u0000\u0017i\u0001\u0000\u0000\u0000\u0019k\u0001\u0000"+
		"\u0000\u0000\u001bt\u0001\u0000\u0000\u0000\u001d\u0085\u0001\u0000\u0000"+
		"\u0000\u001f\u0087\u0001\u0000\u0000\u0000!\u0091\u0001\u0000\u0000\u0000"+
		"#\u0097\u0001\u0000\u0000\u0000%\u00a2\u0001\u0000\u0000\u0000\'(\u0005"+
		"=\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005(\u0000\u0000*\u0004"+
		"\u0001\u0000\u0000\u0000+,\u0005)\u0000\u0000,\u0006\u0001\u0000\u0000"+
		"\u0000-.\u0005s\u0000\u0000./\u0005t\u0000\u0000/0\u0005a\u0000\u0000"+
		"01\u0005r\u0000\u000012\u0005t\u0000\u00002\b\u0001\u0000\u0000\u0000"+
		"34\u0005f\u0000\u000045\u0005n\u0000\u00005\n\u0001\u0000\u0000\u0000"+
		"67\u0005,\u0000\u00007\f\u0001\u0000\u0000\u000089\u0005:\u0000\u0000"+
		"9\u000e\u0001\u0000\u0000\u0000:<\u0005\r\u0000\u0000;:\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=A\u0005\n\u0000"+
		"\u0000>@\u0005 \u0000\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0010\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005t\u0000\u0000EF\u0005"+
		"r\u0000\u0000FG\u0005u\u0000\u0000GN\u0005e\u0000\u0000HI\u0005f\u0000"+
		"\u0000IJ\u0005a\u0000\u0000JK\u0005l\u0000\u0000KL\u0005s\u0000\u0000"+
		"LN\u0005e\u0000\u0000MD\u0001\u0000\u0000\u0000MH\u0001\u0000\u0000\u0000"+
		"N\u0012\u0001\u0000\u0000\u0000OS\u0007\u0000\u0000\u0000PR\u0007\u0001"+
		"\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T\u0014\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000VW\u0005:\u0000\u0000W[\u0007\u0002\u0000"+
		"\u0000XZ\u0007\u0001\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0016"+
		"\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^j\u00050\u0000\u0000"+
		"_a\u0005-\u0000\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bf\u0007\u0003\u0000\u0000ce\u0007\u0004\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000i^\u0001\u0000\u0000\u0000i`\u0001\u0000\u0000\u0000"+
		"j\u0018\u0001\u0000\u0000\u0000kl\u00050\u0000\u0000lm\u0005x\u0000\u0000"+
		"mq\u0001\u0000\u0000\u0000np\u0007\u0005\u0000\u0000on\u0001\u0000\u0000"+
		"\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000r\u001a\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"tu\u00050\u0000\u0000uv\u0005b\u0000\u0000vz\u0001\u0000\u0000\u0000w"+
		"y\u0007\u0006\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u001c\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\'\u0000\u0000~\u007f"+
		"\t\u0000\u0000\u0000\u007f\u0086\u0005\'\u0000\u0000\u0080\u0081\u0005"+
		"\'\u0000\u0000\u0081\u0082\u0005\\\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0007\u0007\u0000\u0000\u0084\u0086\u0005\'\u0000"+
		"\u0000\u0085}\u0001\u0000\u0000\u0000\u0085\u0080\u0001\u0000\u0000\u0000"+
		"\u0086\u001e\u0001\u0000\u0000\u0000\u0087\u008b\u0005\"\u0000\u0000\u0088"+
		"\u008a\t\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005\"\u0000\u0000\u008f \u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0007\b\u0000\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0006\u0010\u0000\u0000\u0096\"\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005/\u0000\u0000\u0098\u0099\u0005/\u0000\u0000\u0099"+
		"\u009d\u0001\u0000\u0000\u0000\u009a\u009c\b\t\u0000\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0"+
		"\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0006\u0011\u0000\u0000\u00a1$\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"/\u0000\u0000\u00a3\u00a4\u0005*\u0000\u0000\u00a4\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\t\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005*\u0000\u0000\u00ac"+
		"\u00ad\u0005/\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0006\u0012\u0000\u0000\u00af&\u0001\u0000\u0000\u0000\u0010\u0000;A"+
		"MS[`fiqz\u0085\u008b\u0093\u009d\u00a8\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}