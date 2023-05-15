// Generated from TL.g4 by ANTLR 4.12.0
package TL.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, FUNCTIONS=2, FUNC=3, BEGIN=4, END=5, BOOLEAN=6, NUMBER=7, TEXT=8, 
		PRINT=9, LIST=10, WHILE=11, REPEAT=12, REPEAT_UNTIL=13, IF=14, ELSE=15, 
		ELSE_IF=16, THEN=17, DO=18, TIMES=19, RETURN=20, ASK=21, RUN=22, ALWAYS=23, 
		ANSWER=24, LPAREN=25, RPAREN=26, LBRACE=27, RBRACE=28, LBRACK=29, RBRACK=30, 
		SEMI=31, COMMA=32, DOT=33, QUOTE=34, ASSIGN=35, GT=36, LT=37, EQUAL=38, 
		LE=39, GE=40, NOTEQUAL=41, AND=42, OR=43, INC=44, DEC=45, ADD=46, SUB=47, 
		MUL=48, DIV=49, CARET=50, MOD=51, BOOL_LITERAL=52, ADD_ASSIGN=53, SUB_ASSIGN=54, 
		MUL_ASSIGN=55, DIV_ASSIGN=56, AND_ASSIGN=57, OR_ASSIGN=58, XOR_ASSIGN=59, 
		MOD_ASSIGN=60, TEXT_VAL=61, NUMBER_VAL_INT=62, NUMBER_VAL_DOUBLE=63, WS=64, 
		NEWLINE=65, COMMENT=66, LINE_COMMENT=67, ID=68;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"START", "FUNCTIONS", "FUNC", "BEGIN", "END", "BOOLEAN", "NUMBER", "TEXT", 
			"PRINT", "LIST", "WHILE", "REPEAT", "REPEAT_UNTIL", "IF", "ELSE", "ELSE_IF", 
			"THEN", "DO", "TIMES", "RETURN", "ASK", "RUN", "ALWAYS", "ANSWER", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"QUOTE", "ASSIGN", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", "BOOL_LITERAL", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "Letter", "LetterOrDigit", "HexDigit", 
			"OctalDigit", "SingleCharacter", "StringCharacters", "StringCharacter", 
			"EscapeSequence", "OctalEscape", "ZeroToThree", "UnicodeEscape", "TEXT_VAL", 
			"NUMBER_VAL_INT", "NUMBER_VAL_DOUBLE", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT", 
			"ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'functions'", "'function'", "'begin'", "'end'", "'truthvalue'", 
			"'number'", "'text'", "'print'", "'list'", "'while'", "'repeat'", "'repeat until'", 
			"'if'", "'else'", "'else if'", "'then'", "'do'", "'times'", "'return'", 
			"'ask'", "'run'", "'always'", "'answer'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", "'.'", "'\"'", "'='", "'>'", "'<'", null, 
			null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'^'", "'%'", null, "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
			"'%='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "FUNCTIONS", "FUNC", "BEGIN", "END", "BOOLEAN", "NUMBER", 
			"TEXT", "PRINT", "LIST", "WHILE", "REPEAT", "REPEAT_UNTIL", "IF", "ELSE", 
			"ELSE_IF", "THEN", "DO", "TIMES", "RETURN", "ASK", "RUN", "ALWAYS", "ANSWER", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "QUOTE", "ASSIGN", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", 
			"BOOL_LITERAL", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "TEXT_VAL", "NUMBER_VAL_INT", 
			"NUMBER_VAL_DOUBLE", "WS", "NEWLINE", "COMMENT", "LINE_COMMENT", "ID"
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


	public TLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TL.g4"; }

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
		"\u0004\u0000D\u0296\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0002J\u0007J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007"+
		"N\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u0158\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u016c\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0183\b\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u018d\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u0194\b)\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u019a\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01ad"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u01c0\b,\u0001"+
		"-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00033\u01d7\b3\u00014\u00014\u00014\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00018\u00018\u00018\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0003=\u01f6\b=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001"+
		"A\u0004A\u01ff\bA\u000bA\fA\u0200\u0001B\u0001B\u0003B\u0205\bB\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u020d\bC\u0001C\u0001C\u0001"+
		"C\u0003C\u0212\bC\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u021a"+
		"\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0223\bD\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u022e"+
		"\bD\u0001D\u0001D\u0001D\u0001D\u0003D\u0234\bD\u0001E\u0001E\u0001F\u0001"+
		"F\u0004F\u023a\bF\u000bF\fF\u023b\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"G\u0001G\u0003G\u0245\bG\u0001G\u0001G\u0001H\u0003H\u024a\bH\u0001H\u0004"+
		"H\u024d\bH\u000bH\fH\u024e\u0001I\u0003I\u0252\bI\u0001I\u0001I\u0001"+
		"I\u0005I\u0257\bI\nI\fI\u025a\tI\u0003I\u025c\bI\u0001I\u0001I\u0004I"+
		"\u0260\bI\u000bI\fI\u0261\u0003I\u0264\bI\u0001J\u0001J\u0004J\u0268\b"+
		"J\u000bJ\fJ\u0269\u0001J\u0001J\u0001K\u0001K\u0001K\u0003K\u0271\bK\u0001"+
		"L\u0001L\u0001L\u0001L\u0005L\u0277\bL\nL\fL\u027a\tL\u0001L\u0001L\u0001"+
		"L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0005M\u0285\bM\nM\fM\u0288"+
		"\tM\u0001M\u0001M\u0001N\u0001N\u0005N\u028e\bN\nN\fN\u0291\tN\u0004N"+
		"\u0293\bN\u000bN\fN\u0294\u0001\u0278\u0000O\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e"+
		"3g4i5k6m7o8q9s:u;w<y\u0000{\u0000}\u0000\u007f\u0000\u0081\u0000\u0083"+
		"\u0000\u0085\u0000\u0087\u0000\u0089\u0000\u008b\u0000\u008d\u0000\u008f"+
		"=\u0091>\u0093?\u0095@\u0097A\u0099B\u009bC\u009dD\u0001\u0000\f\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0003\u000009AFaf\u0001\u000007\u0004"+
		"\u0000\n\n\r\r\'\'\\\\\u0004\u0000\n\n\r\r\"\"\\\\\b\u0000\"\"\'\'\\\\"+
		"bbffnnrrtt\u0001\u000003\u0001\u000009\u0001\u000019\u0002\u0000\t\t "+
		" \u0002\u0000\n\n\r\r\u02af\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000"+
		"\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000"+
		"\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I"+
		"\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000"+
		"\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000"+
		"\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W"+
		"\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000"+
		"\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000"+
		"\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e"+
		"\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000"+
		"\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000"+
		"\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s"+
		"\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000"+
		"\u0000\u0000\u0000\u008f\u0001\u0000\u0000\u0000\u0000\u0091\u0001\u0000"+
		"\u0000\u0000\u0000\u0093\u0001\u0000\u0000\u0000\u0000\u0095\u0001\u0000"+
		"\u0000\u0000\u0000\u0097\u0001\u0000\u0000\u0000\u0000\u0099\u0001\u0000"+
		"\u0000\u0000\u0000\u009b\u0001\u0000\u0000\u0000\u0000\u009d\u0001\u0000"+
		"\u0000\u0000\u0001\u009f\u0001\u0000\u0000\u0000\u0003\u00a5\u0001\u0000"+
		"\u0000\u0000\u0005\u00af\u0001\u0000\u0000\u0000\u0007\u00b8\u0001\u0000"+
		"\u0000\u0000\t\u00be\u0001\u0000\u0000\u0000\u000b\u00c2\u0001\u0000\u0000"+
		"\u0000\r\u00cd\u0001\u0000\u0000\u0000\u000f\u00d4\u0001\u0000\u0000\u0000"+
		"\u0011\u00d9\u0001\u0000\u0000\u0000\u0013\u00df\u0001\u0000\u0000\u0000"+
		"\u0015\u00e4\u0001\u0000\u0000\u0000\u0017\u00ea\u0001\u0000\u0000\u0000"+
		"\u0019\u00f1\u0001\u0000\u0000\u0000\u001b\u00fe\u0001\u0000\u0000\u0000"+
		"\u001d\u0101\u0001\u0000\u0000\u0000\u001f\u0106\u0001\u0000\u0000\u0000"+
		"!\u010e\u0001\u0000\u0000\u0000#\u0113\u0001\u0000\u0000\u0000%\u0116"+
		"\u0001\u0000\u0000\u0000\'\u011c\u0001\u0000\u0000\u0000)\u0123\u0001"+
		"\u0000\u0000\u0000+\u0127\u0001\u0000\u0000\u0000-\u012b\u0001\u0000\u0000"+
		"\u0000/\u0132\u0001\u0000\u0000\u00001\u0139\u0001\u0000\u0000\u00003"+
		"\u013b\u0001\u0000\u0000\u00005\u013d\u0001\u0000\u0000\u00007\u013f\u0001"+
		"\u0000\u0000\u00009\u0141\u0001\u0000\u0000\u0000;\u0143\u0001\u0000\u0000"+
		"\u0000=\u0145\u0001\u0000\u0000\u0000?\u0147\u0001\u0000\u0000\u0000A"+
		"\u0149\u0001\u0000\u0000\u0000C\u014b\u0001\u0000\u0000\u0000E\u014d\u0001"+
		"\u0000\u0000\u0000G\u014f\u0001\u0000\u0000\u0000I\u0151\u0001\u0000\u0000"+
		"\u0000K\u0157\u0001\u0000\u0000\u0000M\u016b\u0001\u0000\u0000\u0000O"+
		"\u0182\u0001\u0000\u0000\u0000Q\u018c\u0001\u0000\u0000\u0000S\u0193\u0001"+
		"\u0000\u0000\u0000U\u0199\u0001\u0000\u0000\u0000W\u01ac\u0001\u0000\u0000"+
		"\u0000Y\u01bf\u0001\u0000\u0000\u0000[\u01c1\u0001\u0000\u0000\u0000]"+
		"\u01c3\u0001\u0000\u0000\u0000_\u01c5\u0001\u0000\u0000\u0000a\u01c7\u0001"+
		"\u0000\u0000\u0000c\u01c9\u0001\u0000\u0000\u0000e\u01cb\u0001\u0000\u0000"+
		"\u0000g\u01d6\u0001\u0000\u0000\u0000i\u01d8\u0001\u0000\u0000\u0000k"+
		"\u01db\u0001\u0000\u0000\u0000m\u01de\u0001\u0000\u0000\u0000o\u01e1\u0001"+
		"\u0000\u0000\u0000q\u01e4\u0001\u0000\u0000\u0000s\u01e7\u0001\u0000\u0000"+
		"\u0000u\u01ea\u0001\u0000\u0000\u0000w\u01ed\u0001\u0000\u0000\u0000y"+
		"\u01f0\u0001\u0000\u0000\u0000{\u01f5\u0001\u0000\u0000\u0000}\u01f7\u0001"+
		"\u0000\u0000\u0000\u007f\u01f9\u0001\u0000\u0000\u0000\u0081\u01fb\u0001"+
		"\u0000\u0000\u0000\u0083\u01fe\u0001\u0000\u0000\u0000\u0085\u0204\u0001"+
		"\u0000\u0000\u0000\u0087\u0211\u0001\u0000\u0000\u0000\u0089\u0233\u0001"+
		"\u0000\u0000\u0000\u008b\u0235\u0001\u0000\u0000\u0000\u008d\u0237\u0001"+
		"\u0000\u0000\u0000\u008f\u0242\u0001\u0000\u0000\u0000\u0091\u0249\u0001"+
		"\u0000\u0000\u0000\u0093\u0251\u0001\u0000\u0000\u0000\u0095\u0267\u0001"+
		"\u0000\u0000\u0000\u0097\u0270\u0001\u0000\u0000\u0000\u0099\u0272\u0001"+
		"\u0000\u0000\u0000\u009b\u0280\u0001\u0000\u0000\u0000\u009d\u0292\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005s\u0000\u0000\u00a0\u00a1\u0005t\u0000"+
		"\u0000\u00a1\u00a2\u0005a\u0000\u0000\u00a2\u00a3\u0005r\u0000\u0000\u00a3"+
		"\u00a4\u0005t\u0000\u0000\u00a4\u0002\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0005f\u0000\u0000\u00a6\u00a7\u0005u\u0000\u0000\u00a7\u00a8\u0005n"+
		"\u0000\u0000\u00a8\u00a9\u0005c\u0000\u0000\u00a9\u00aa\u0005t\u0000\u0000"+
		"\u00aa\u00ab\u0005i\u0000\u0000\u00ab\u00ac\u0005o\u0000\u0000\u00ac\u00ad"+
		"\u0005n\u0000\u0000\u00ad\u00ae\u0005s\u0000\u0000\u00ae\u0004\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005f\u0000\u0000\u00b0\u00b1\u0005u\u0000\u0000"+
		"\u00b1\u00b2\u0005n\u0000\u0000\u00b2\u00b3\u0005c\u0000\u0000\u00b3\u00b4"+
		"\u0005t\u0000\u0000\u00b4\u00b5\u0005i\u0000\u0000\u00b5\u00b6\u0005o"+
		"\u0000\u0000\u00b6\u00b7\u0005n\u0000\u0000\u00b7\u0006\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0005b\u0000\u0000\u00b9\u00ba\u0005e\u0000\u0000\u00ba"+
		"\u00bb\u0005g\u0000\u0000\u00bb\u00bc\u0005i\u0000\u0000\u00bc\u00bd\u0005"+
		"n\u0000\u0000\u00bd\b\u0001\u0000\u0000\u0000\u00be\u00bf\u0005e\u0000"+
		"\u0000\u00bf\u00c0\u0005n\u0000\u0000\u00c0\u00c1\u0005d\u0000\u0000\u00c1"+
		"\n\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005t\u0000\u0000\u00c3\u00c4"+
		"\u0005r\u0000\u0000\u00c4\u00c5\u0005u\u0000\u0000\u00c5\u00c6\u0005t"+
		"\u0000\u0000\u00c6\u00c7\u0005h\u0000\u0000\u00c7\u00c8\u0005v\u0000\u0000"+
		"\u00c8\u00c9\u0005a\u0000\u0000\u00c9\u00ca\u0005l\u0000\u0000\u00ca\u00cb"+
		"\u0005u\u0000\u0000\u00cb\u00cc\u0005e\u0000\u0000\u00cc\f\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0005n\u0000\u0000\u00ce\u00cf\u0005u\u0000\u0000"+
		"\u00cf\u00d0\u0005m\u0000\u0000\u00d0\u00d1\u0005b\u0000\u0000\u00d1\u00d2"+
		"\u0005e\u0000\u0000\u00d2\u00d3\u0005r\u0000\u0000\u00d3\u000e\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0005t\u0000\u0000\u00d5\u00d6\u0005e\u0000\u0000"+
		"\u00d6\u00d7\u0005x\u0000\u0000\u00d7\u00d8\u0005t\u0000\u0000\u00d8\u0010"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0005p\u0000\u0000\u00da\u00db\u0005"+
		"r\u0000\u0000\u00db\u00dc\u0005i\u0000\u0000\u00dc\u00dd\u0005n\u0000"+
		"\u0000\u00dd\u00de\u0005t\u0000\u0000\u00de\u0012\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0005l\u0000\u0000\u00e0\u00e1\u0005i\u0000\u0000\u00e1\u00e2"+
		"\u0005s\u0000\u0000\u00e2\u00e3\u0005t\u0000\u0000\u00e3\u0014\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0005w\u0000\u0000\u00e5\u00e6\u0005h\u0000\u0000"+
		"\u00e6\u00e7\u0005i\u0000\u0000\u00e7\u00e8\u0005l\u0000\u0000\u00e8\u00e9"+
		"\u0005e\u0000\u0000\u00e9\u0016\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		"r\u0000\u0000\u00eb\u00ec\u0005e\u0000\u0000\u00ec\u00ed\u0005p\u0000"+
		"\u0000\u00ed\u00ee\u0005e\u0000\u0000\u00ee\u00ef\u0005a\u0000\u0000\u00ef"+
		"\u00f0\u0005t\u0000\u0000\u00f0\u0018\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0005r\u0000\u0000\u00f2\u00f3\u0005e\u0000\u0000\u00f3\u00f4\u0005p"+
		"\u0000\u0000\u00f4\u00f5\u0005e\u0000\u0000\u00f5\u00f6\u0005a\u0000\u0000"+
		"\u00f6\u00f7\u0005t\u0000\u0000\u00f7\u00f8\u0005 \u0000\u0000\u00f8\u00f9"+
		"\u0005u\u0000\u0000\u00f9\u00fa\u0005n\u0000\u0000\u00fa\u00fb\u0005t"+
		"\u0000\u0000\u00fb\u00fc\u0005i\u0000\u0000\u00fc\u00fd\u0005l\u0000\u0000"+
		"\u00fd\u001a\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005i\u0000\u0000\u00ff"+
		"\u0100\u0005f\u0000\u0000\u0100\u001c\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0005e\u0000\u0000\u0102\u0103\u0005l\u0000\u0000\u0103\u0104\u0005s"+
		"\u0000\u0000\u0104\u0105\u0005e\u0000\u0000\u0105\u001e\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005e\u0000\u0000\u0107\u0108\u0005l\u0000\u0000\u0108"+
		"\u0109\u0005s\u0000\u0000\u0109\u010a\u0005e\u0000\u0000\u010a\u010b\u0005"+
		" \u0000\u0000\u010b\u010c\u0005i\u0000\u0000\u010c\u010d\u0005f\u0000"+
		"\u0000\u010d \u0001\u0000\u0000\u0000\u010e\u010f\u0005t\u0000\u0000\u010f"+
		"\u0110\u0005h\u0000\u0000\u0110\u0111\u0005e\u0000\u0000\u0111\u0112\u0005"+
		"n\u0000\u0000\u0112\"\u0001\u0000\u0000\u0000\u0113\u0114\u0005d\u0000"+
		"\u0000\u0114\u0115\u0005o\u0000\u0000\u0115$\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0005t\u0000\u0000\u0117\u0118\u0005i\u0000\u0000\u0118\u0119\u0005"+
		"m\u0000\u0000\u0119\u011a\u0005e\u0000\u0000\u011a\u011b\u0005s\u0000"+
		"\u0000\u011b&\u0001\u0000\u0000\u0000\u011c\u011d\u0005r\u0000\u0000\u011d"+
		"\u011e\u0005e\u0000\u0000\u011e\u011f\u0005t\u0000\u0000\u011f\u0120\u0005"+
		"u\u0000\u0000\u0120\u0121\u0005r\u0000\u0000\u0121\u0122\u0005n\u0000"+
		"\u0000\u0122(\u0001\u0000\u0000\u0000\u0123\u0124\u0005a\u0000\u0000\u0124"+
		"\u0125\u0005s\u0000\u0000\u0125\u0126\u0005k\u0000\u0000\u0126*\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0005r\u0000\u0000\u0128\u0129\u0005u\u0000"+
		"\u0000\u0129\u012a\u0005n\u0000\u0000\u012a,\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0005a\u0000\u0000\u012c\u012d\u0005l\u0000\u0000\u012d\u012e\u0005"+
		"w\u0000\u0000\u012e\u012f\u0005a\u0000\u0000\u012f\u0130\u0005y\u0000"+
		"\u0000\u0130\u0131\u0005s\u0000\u0000\u0131.\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0005a\u0000\u0000\u0133\u0134\u0005n\u0000\u0000\u0134\u0135\u0005"+
		"s\u0000\u0000\u0135\u0136\u0005w\u0000\u0000\u0136\u0137\u0005e\u0000"+
		"\u0000\u0137\u0138\u0005r\u0000\u0000\u01380\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0005(\u0000\u0000\u013a2\u0001\u0000\u0000\u0000\u013b\u013c\u0005"+
		")\u0000\u0000\u013c4\u0001\u0000\u0000\u0000\u013d\u013e\u0005{\u0000"+
		"\u0000\u013e6\u0001\u0000\u0000\u0000\u013f\u0140\u0005}\u0000\u0000\u0140"+
		"8\u0001\u0000\u0000\u0000\u0141\u0142\u0005[\u0000\u0000\u0142:\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005]\u0000\u0000\u0144<\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0005;\u0000\u0000\u0146>\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005,\u0000\u0000\u0148@\u0001\u0000\u0000\u0000\u0149\u014a\u0005"+
		".\u0000\u0000\u014aB\u0001\u0000\u0000\u0000\u014b\u014c\u0005\"\u0000"+
		"\u0000\u014cD\u0001\u0000\u0000\u0000\u014d\u014e\u0005=\u0000\u0000\u014e"+
		"F\u0001\u0000\u0000\u0000\u014f\u0150\u0005>\u0000\u0000\u0150H\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0005<\u0000\u0000\u0152J\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0005=\u0000\u0000\u0154\u0158\u0005=\u0000\u0000\u0155"+
		"\u0156\u0005=\u0000\u0000\u0156\u0158\u0005?\u0000\u0000\u0157\u0153\u0001"+
		"\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158L\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0005<\u0000\u0000\u015a\u016c\u0005=\u0000\u0000"+
		"\u015b\u015c\u0005l\u0000\u0000\u015c\u015d\u0005e\u0000\u0000\u015d\u015e"+
		"\u0005s\u0000\u0000\u015e\u015f\u0005s\u0000\u0000\u015f\u0160\u0005 "+
		"\u0000\u0000\u0160\u0161\u0005o\u0000\u0000\u0161\u0162\u0005r\u0000\u0000"+
		"\u0162\u0163\u0005 \u0000\u0000\u0163\u0164\u0005e\u0000\u0000\u0164\u0165"+
		"\u0005q\u0000\u0000\u0165\u0166\u0005u\u0000\u0000\u0166\u0167\u0005a"+
		"\u0000\u0000\u0167\u0168\u0005l\u0000\u0000\u0168\u0169\u0005 \u0000\u0000"+
		"\u0169\u016a\u0005t\u0000\u0000\u016a\u016c\u0005o\u0000\u0000\u016b\u0159"+
		"\u0001\u0000\u0000\u0000\u016b\u015b\u0001\u0000\u0000\u0000\u016cN\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0005>\u0000\u0000\u016e\u0183\u0005=\u0000"+
		"\u0000\u016f\u0170\u0005g\u0000\u0000\u0170\u0171\u0005r\u0000\u0000\u0171"+
		"\u0172\u0005e\u0000\u0000\u0172\u0173\u0005a\u0000\u0000\u0173\u0174\u0005"+
		"t\u0000\u0000\u0174\u0175\u0005e\u0000\u0000\u0175\u0176\u0005r\u0000"+
		"\u0000\u0176\u0177\u0005 \u0000\u0000\u0177\u0178\u0005o\u0000\u0000\u0178"+
		"\u0179\u0005r\u0000\u0000\u0179\u017a\u0005 \u0000\u0000\u017a\u017b\u0005"+
		"e\u0000\u0000\u017b\u017c\u0005q\u0000\u0000\u017c\u017d\u0005u\u0000"+
		"\u0000\u017d\u017e\u0005a\u0000\u0000\u017e\u017f\u0005l\u0000\u0000\u017f"+
		"\u0180\u0005 \u0000\u0000\u0180\u0181\u0005t\u0000\u0000\u0181\u0183\u0005"+
		"o\u0000\u0000\u0182\u016d\u0001\u0000\u0000\u0000\u0182\u016f\u0001\u0000"+
		"\u0000\u0000\u0183P\u0001\u0000\u0000\u0000\u0184\u0185\u0005!\u0000\u0000"+
		"\u0185\u018d\u0005=\u0000\u0000\u0186\u0187\u0005i\u0000\u0000\u0187\u0188"+
		"\u0005s\u0000\u0000\u0188\u0189\u0005 \u0000\u0000\u0189\u018a\u0005n"+
		"\u0000\u0000\u018a\u018b\u0005o\u0000\u0000\u018b\u018d\u0005t\u0000\u0000"+
		"\u018c\u0184\u0001\u0000\u0000\u0000\u018c\u0186\u0001\u0000\u0000\u0000"+
		"\u018dR\u0001\u0000\u0000\u0000\u018e\u018f\u0005&\u0000\u0000\u018f\u0194"+
		"\u0005&\u0000\u0000\u0190\u0191\u0005a\u0000\u0000\u0191\u0192\u0005n"+
		"\u0000\u0000\u0192\u0194\u0005d\u0000\u0000\u0193\u018e\u0001\u0000\u0000"+
		"\u0000\u0193\u0190\u0001\u0000\u0000\u0000\u0194T\u0001\u0000\u0000\u0000"+
		"\u0195\u0196\u0005|\u0000\u0000\u0196\u019a\u0005|\u0000\u0000\u0197\u0198"+
		"\u0005o\u0000\u0000\u0198\u019a\u0005r\u0000\u0000\u0199\u0195\u0001\u0000"+
		"\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019aV\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0005+\u0000\u0000\u019c\u01ad\u0005+\u0000\u0000\u019d"+
		"\u019e\u0005i\u0000\u0000\u019e\u019f\u0005n\u0000\u0000\u019f\u01a0\u0005"+
		"c\u0000\u0000\u01a0\u01a1\u0005r\u0000\u0000\u01a1\u01a2\u0005e\u0000"+
		"\u0000\u01a2\u01a3\u0005a\u0000\u0000\u01a3\u01a4\u0005s\u0000\u0000\u01a4"+
		"\u01a5\u0005e\u0000\u0000\u01a5\u01a6\u0005 \u0000\u0000\u01a6\u01a7\u0005"+
		"b\u0000\u0000\u01a7\u01a8\u0005y\u0000\u0000\u01a8\u01a9\u0005 \u0000"+
		"\u0000\u01a9\u01aa\u0005o\u0000\u0000\u01aa\u01ab\u0005n\u0000\u0000\u01ab"+
		"\u01ad\u0005e\u0000\u0000\u01ac\u019b\u0001\u0000\u0000\u0000\u01ac\u019d"+
		"\u0001\u0000\u0000\u0000\u01adX\u0001\u0000\u0000\u0000\u01ae\u01af\u0005"+
		"-\u0000\u0000\u01af\u01c0\u0005-\u0000\u0000\u01b0\u01b1\u0005d\u0000"+
		"\u0000\u01b1\u01b2\u0005e\u0000\u0000\u01b2\u01b3\u0005c\u0000\u0000\u01b3"+
		"\u01b4\u0005r\u0000\u0000\u01b4\u01b5\u0005e\u0000\u0000\u01b5\u01b6\u0005"+
		"a\u0000\u0000\u01b6\u01b7\u0005s\u0000\u0000\u01b7\u01b8\u0005e\u0000"+
		"\u0000\u01b8\u01b9\u0005 \u0000\u0000\u01b9\u01ba\u0005b\u0000\u0000\u01ba"+
		"\u01bb\u0005y\u0000\u0000\u01bb\u01bc\u0005 \u0000\u0000\u01bc\u01bd\u0005"+
		"o\u0000\u0000\u01bd\u01be\u0005n\u0000\u0000\u01be\u01c0\u0005e\u0000"+
		"\u0000\u01bf\u01ae\u0001\u0000\u0000\u0000\u01bf\u01b0\u0001\u0000\u0000"+
		"\u0000\u01c0Z\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005+\u0000\u0000\u01c2"+
		"\\\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005-\u0000\u0000\u01c4^\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0005*\u0000\u0000\u01c6`\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0005/\u0000\u0000\u01c8b\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0005^\u0000\u0000\u01cad\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005"+
		"%\u0000\u0000\u01ccf\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005t\u0000"+
		"\u0000\u01ce\u01cf\u0005r\u0000\u0000\u01cf\u01d0\u0005u\u0000\u0000\u01d0"+
		"\u01d7\u0005e\u0000\u0000\u01d1\u01d2\u0005f\u0000\u0000\u01d2\u01d3\u0005"+
		"a\u0000\u0000\u01d3\u01d4\u0005l\u0000\u0000\u01d4\u01d5\u0005s\u0000"+
		"\u0000\u01d5\u01d7\u0005e\u0000\u0000\u01d6\u01cd\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d1\u0001\u0000\u0000\u0000\u01d7h\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0005+\u0000\u0000\u01d9\u01da\u0005=\u0000\u0000\u01daj\u0001"+
		"\u0000\u0000\u0000\u01db\u01dc\u0005-\u0000\u0000\u01dc\u01dd\u0005=\u0000"+
		"\u0000\u01ddl\u0001\u0000\u0000\u0000\u01de\u01df\u0005*\u0000\u0000\u01df"+
		"\u01e0\u0005=\u0000\u0000\u01e0n\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005"+
		"/\u0000\u0000\u01e2\u01e3\u0005=\u0000\u0000\u01e3p\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0005&\u0000\u0000\u01e5\u01e6\u0005=\u0000\u0000\u01e6"+
		"r\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005|\u0000\u0000\u01e8\u01e9\u0005"+
		"=\u0000\u0000\u01e9t\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005^\u0000"+
		"\u0000\u01eb\u01ec\u0005=\u0000\u0000\u01ecv\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0005%\u0000\u0000\u01ee\u01ef\u0005=\u0000\u0000\u01efx\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f1\u0007\u0000\u0000\u0000\u01f1z\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f6\u0007\u0001\u0000\u0000\u01f3\u01f6\u0003\u0093"+
		"I\u0000\u01f4\u01f6\u0003\u0091H\u0000\u01f5\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f6|\u0001\u0000\u0000\u0000\u01f7\u01f8\u0007\u0002\u0000\u0000\u01f8"+
		"~\u0001\u0000\u0000\u0000\u01f9\u01fa\u0007\u0003\u0000\u0000\u01fa\u0080"+
		"\u0001\u0000\u0000\u0000\u01fb\u01fc\b\u0004\u0000\u0000\u01fc\u0082\u0001"+
		"\u0000\u0000\u0000\u01fd\u01ff\u0003\u0085B\u0000\u01fe\u01fd\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0084\u0001\u0000"+
		"\u0000\u0000\u0202\u0205\b\u0005\u0000\u0000\u0203\u0205\u0003\u0087C"+
		"\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0203\u0001\u0000\u0000"+
		"\u0000\u0205\u0086\u0001\u0000\u0000\u0000\u0206\u020c\u0005\\\u0000\u0000"+
		"\u0207\u0208\u0005u\u0000\u0000\u0208\u0209\u00050\u0000\u0000\u0209\u020a"+
		"\u00050\u0000\u0000\u020a\u020b\u00055\u0000\u0000\u020b\u020d\u0005c"+
		"\u0000\u0000\u020c\u0207\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u0212\u0007\u0006"+
		"\u0000\u0000\u020f\u0212\u0003\u0089D\u0000\u0210\u0212\u0003\u008dF\u0000"+
		"\u0211\u0206\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0211\u0210\u0001\u0000\u0000\u0000\u0212\u0088\u0001\u0000\u0000\u0000"+
		"\u0213\u0219\u0005\\\u0000\u0000\u0214\u0215\u0005u\u0000\u0000\u0215"+
		"\u0216\u00050\u0000\u0000\u0216\u0217\u00050\u0000\u0000\u0217\u0218\u0005"+
		"5\u0000\u0000\u0218\u021a\u0005c\u0000\u0000\u0219\u0214\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000"+
		"\u0000\u021b\u0234\u0003\u007f?\u0000\u021c\u0222\u0005\\\u0000\u0000"+
		"\u021d\u021e\u0005u\u0000\u0000\u021e\u021f\u00050\u0000\u0000\u021f\u0220"+
		"\u00050\u0000\u0000\u0220\u0221\u00055\u0000\u0000\u0221\u0223\u0005c"+
		"\u0000\u0000\u0222\u021d\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000"+
		"\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0225\u0003\u007f"+
		"?\u0000\u0225\u0226\u0003\u007f?\u0000\u0226\u0234\u0001\u0000\u0000\u0000"+
		"\u0227\u022d\u0005\\\u0000\u0000\u0228\u0229\u0005u\u0000\u0000\u0229"+
		"\u022a\u00050\u0000\u0000\u022a\u022b\u00050\u0000\u0000\u022b\u022c\u0005"+
		"5\u0000\u0000\u022c\u022e\u0005c\u0000\u0000\u022d\u0228\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0003\u008bE\u0000\u0230\u0231\u0003\u007f?\u0000\u0231"+
		"\u0232\u0003\u007f?\u0000\u0232\u0234\u0001\u0000\u0000\u0000\u0233\u0213"+
		"\u0001\u0000\u0000\u0000\u0233\u021c\u0001\u0000\u0000\u0000\u0233\u0227"+
		"\u0001\u0000\u0000\u0000\u0234\u008a\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0007\u0007\u0000\u0000\u0236\u008c\u0001\u0000\u0000\u0000\u0237\u0239"+
		"\u0005\\\u0000\u0000\u0238\u023a\u0005u\u0000\u0000\u0239\u0238\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u0239\u0001"+
		"\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u0001"+
		"\u0000\u0000\u0000\u023d\u023e\u0003}>\u0000\u023e\u023f\u0003}>\u0000"+
		"\u023f\u0240\u0003}>\u0000\u0240\u0241\u0003}>\u0000\u0241\u008e\u0001"+
		"\u0000\u0000\u0000\u0242\u0244\u0005\"\u0000\u0000\u0243\u0245\u0003\u0083"+
		"A\u0000\u0244\u0243\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000"+
		"\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0005\"\u0000\u0000"+
		"\u0247\u0090\u0001\u0000\u0000\u0000\u0248\u024a\u0005-\u0000\u0000\u0249"+
		"\u0248\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a"+
		"\u024c\u0001\u0000\u0000\u0000\u024b\u024d\u0007\b\u0000\u0000\u024c\u024b"+
		"\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u024c"+
		"\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0092"+
		"\u0001\u0000\u0000\u0000\u0250\u0252\u0005-\u0000\u0000\u0251\u0250\u0001"+
		"\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u025b\u0001"+
		"\u0000\u0000\u0000\u0253\u025c\u00050\u0000\u0000\u0254\u0258\u0007\t"+
		"\u0000\u0000\u0255\u0257\u0007\b\u0000\u0000\u0256\u0255\u0001\u0000\u0000"+
		"\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000"+
		"\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025b\u0253\u0001\u0000\u0000"+
		"\u0000\u025b\u0254\u0001\u0000\u0000\u0000\u025c\u0263\u0001\u0000\u0000"+
		"\u0000\u025d\u025f\u0005.\u0000\u0000\u025e\u0260\u0007\b\u0000\u0000"+
		"\u025f\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000"+
		"\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000"+
		"\u0262\u0264\u0001\u0000\u0000\u0000\u0263\u025d\u0001\u0000\u0000\u0000"+
		"\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0094\u0001\u0000\u0000\u0000"+
		"\u0265\u0268\u0007\n\u0000\u0000\u0266\u0268\u0003\u0097K\u0000\u0267"+
		"\u0265\u0001\u0000\u0000\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0268"+
		"\u0269\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269"+
		"\u026a\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b"+
		"\u026c\u0006J\u0000\u0000\u026c\u0096\u0001\u0000\u0000\u0000\u026d\u026e"+
		"\u0005\r\u0000\u0000\u026e\u0271\u0005\n\u0000\u0000\u026f\u0271\u0007"+
		"\u000b\u0000\u0000\u0270\u026d\u0001\u0000\u0000\u0000\u0270\u026f\u0001"+
		"\u0000\u0000\u0000\u0271\u0098\u0001\u0000\u0000\u0000\u0272\u0273\u0005"+
		"/\u0000\u0000\u0273\u0274\u0005*\u0000\u0000\u0274\u0278\u0001\u0000\u0000"+
		"\u0000\u0275\u0277\t\u0000\u0000\u0000\u0276\u0275\u0001\u0000\u0000\u0000"+
		"\u0277\u027a\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000"+
		"\u0278\u0276\u0001\u0000\u0000\u0000\u0279\u027b\u0001\u0000\u0000\u0000"+
		"\u027a\u0278\u0001\u0000\u0000\u0000\u027b\u027c\u0005*\u0000\u0000\u027c"+
		"\u027d\u0005/\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u027f"+
		"\u0006L\u0000\u0000\u027f\u009a\u0001\u0000\u0000\u0000\u0280\u0281\u0005"+
		"/\u0000\u0000\u0281\u0282\u0005/\u0000\u0000\u0282\u0286\u0001\u0000\u0000"+
		"\u0000\u0283\u0285\b\u000b\u0000\u0000\u0284\u0283\u0001\u0000\u0000\u0000"+
		"\u0285\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000"+
		"\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0289\u0001\u0000\u0000\u0000"+
		"\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u028a\u0006M\u0000\u0000\u028a"+
		"\u009c\u0001\u0000\u0000\u0000\u028b\u028f\u0003y<\u0000\u028c\u028e\u0003"+
		"{=\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000"+
		"\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000"+
		"\u0000\u0290\u0293\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000"+
		"\u0000\u0292\u028b\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000"+
		"\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000"+
		"\u0000\u0295\u009e\u0001\u0000\u0000\u0000#\u0000\u0157\u016b\u0182\u018c"+
		"\u0193\u0199\u01ac\u01bf\u01d6\u01f5\u0200\u0204\u020c\u0211\u0219\u0222"+
		"\u022d\u0233\u023b\u0244\u0249\u024e\u0251\u0258\u025b\u0261\u0263\u0267"+
		"\u0269\u0270\u0278\u0286\u028f\u0294\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}