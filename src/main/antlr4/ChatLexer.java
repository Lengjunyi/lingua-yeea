// Generated from .\src\main\antlr4\Chat.g4 by ANTLR 4.12.0
package main.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ChatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SAYS=7, SHOUTS=8, WORD=9, 
		WHITESPACE=10, NEWLINE=11, TEXT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "A", "S", "Y", "H", "O", 
			"U", "T", "LOWERCASE", "UPPERCASE", "SAYS", "SHOUTS", "WORD", "WHITESPACE", 
			"NEWLINE", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'-'", "')'", "'('", "'/'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "SAYS", "SHOUTS", "WORD", "WHITESPACE", 
			"NEWLINE", "TEXT"
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


	public ChatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Chat.g4"; }

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
		"\u0004\u0000\fr\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011"+
		"Y\b\u0011\u000b\u0011\f\u0011Z\u0001\u0012\u0004\u0012^\b\u0012\u000b"+
		"\u0012\f\u0012_\u0001\u0013\u0003\u0013c\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0004\u0013g\b\u0013\u000b\u0013\f\u0013h\u0001\u0014\u0001\u0014\u0004"+
		"\u0014m\b\u0014\u000b\u0014\f\u0014n\u0001\u0014\u0001\u0014\u0000\u0000"+
		"\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0000\u000f\u0000\u0011\u0000\u0013\u0000\u0015\u0000\u0017\u0000\u0019"+
		"\u0000\u001b\u0000\u001d\u0000\u001f\u0007!\b#\t%\n\'\u000b)\f\u0001\u0000"+
		"\f\u0002\u0000AAaa\u0002\u0000SSss\u0002\u0000YYyy\u0002\u0000HHhh\u0002"+
		"\u0000OOoo\u0002\u0000UUuu\u0002\u0000TTtt\u0001\u0000az\u0001\u0000A"+
		"Z\u0002\u0000\t\t  \u0002\u0000(([[\u0002\u0000))]]p\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u0003-\u0001"+
		"\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000"+
		"\u0000\t3\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r7\u0001"+
		"\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000\u0011;\u0001\u0000\u0000"+
		"\u0000\u0013=\u0001\u0000\u0000\u0000\u0015?\u0001\u0000\u0000\u0000\u0017"+
		"A\u0001\u0000\u0000\u0000\u0019C\u0001\u0000\u0000\u0000\u001bE\u0001"+
		"\u0000\u0000\u0000\u001dG\u0001\u0000\u0000\u0000\u001fI\u0001\u0000\u0000"+
		"\u0000!N\u0001\u0000\u0000\u0000#X\u0001\u0000\u0000\u0000%]\u0001\u0000"+
		"\u0000\u0000\'f\u0001\u0000\u0000\u0000)j\u0001\u0000\u0000\u0000+,\u0005"+
		":\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-.\u0005-\u0000\u0000.\u0004"+
		"\u0001\u0000\u0000\u0000/0\u0005)\u0000\u00000\u0006\u0001\u0000\u0000"+
		"\u000012\u0005(\u0000\u00002\b\u0001\u0000\u0000\u000034\u0005/\u0000"+
		"\u00004\n\u0001\u0000\u0000\u000056\u0005@\u0000\u00006\f\u0001\u0000"+
		"\u0000\u000078\u0007\u0000\u0000\u00008\u000e\u0001\u0000\u0000\u0000"+
		"9:\u0007\u0001\u0000\u0000:\u0010\u0001\u0000\u0000\u0000;<\u0007\u0002"+
		"\u0000\u0000<\u0012\u0001\u0000\u0000\u0000=>\u0007\u0003\u0000\u0000"+
		">\u0014\u0001\u0000\u0000\u0000?@\u0007\u0004\u0000\u0000@\u0016\u0001"+
		"\u0000\u0000\u0000AB\u0007\u0005\u0000\u0000B\u0018\u0001\u0000\u0000"+
		"\u0000CD\u0007\u0006\u0000\u0000D\u001a\u0001\u0000\u0000\u0000EF\u0007"+
		"\u0007\u0000\u0000F\u001c\u0001\u0000\u0000\u0000GH\u0007\b\u0000\u0000"+
		"H\u001e\u0001\u0000\u0000\u0000IJ\u0003\u000f\u0007\u0000JK\u0003\r\u0006"+
		"\u0000KL\u0003\u0011\b\u0000LM\u0003\u000f\u0007\u0000M \u0001\u0000\u0000"+
		"\u0000NO\u0003\u000f\u0007\u0000OP\u0003\u0013\t\u0000PQ\u0003\u0015\n"+
		"\u0000QR\u0003\u0017\u000b\u0000RS\u0003\u0019\f\u0000ST\u0003\u000f\u0007"+
		"\u0000T\"\u0001\u0000\u0000\u0000UY\u0003\u001b\r\u0000VY\u0003\u001d"+
		"\u000e\u0000WY\u0005_\u0000\u0000XU\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[$\u0001\u0000\u0000\u0000"+
		"\\^\u0007\t\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`&\u0001\u0000"+
		"\u0000\u0000ac\u0005\r\u0000\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000dg\u0005\n\u0000\u0000eg\u0005\r"+
		"\u0000\u0000fb\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i(\u0001\u0000\u0000\u0000jl\u0007\n\u0000\u0000km\b\u000b\u0000\u0000"+
		"lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0007\u000b"+
		"\u0000\u0000q*\u0001\u0000\u0000\u0000\b\u0000XZ_bfhn\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}