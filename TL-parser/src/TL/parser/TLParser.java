// Generated from TL.g4 by ANTLR 4.12.0
package TL.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TLParser extends Parser {
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
		MOD_ASSIGN=60, TEXT_VAL=61, NUMBER_VAL=62, WS=63, NEWLINE=64, COMMENT=65, 
		LINE_COMMENT=66, ID=67;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_startBlock = 2, RULE_startBody = 3, 
		RULE_functionsBlock = 4, RULE_funcBlockBody = 5, RULE_funcDec = 6, RULE_funcOutputParam = 7, 
		RULE_funcInputParam = 8, RULE_funcName = 9, RULE_funcCall = 10, RULE_declaration = 11, 
		RULE_numberDecl = 12, RULE_textDecl = 13, RULE_boolDecl = 14, RULE_initialization = 15, 
		RULE_funcBody = 16, RULE_statement = 17, RULE_ifThenStatement = 18, RULE_ifThenElseStatement = 19, 
		RULE_repeatStatement = 20, RULE_repeatUntilStatement = 21, RULE_whileStatement = 22, 
		RULE_statementBody = 23, RULE_condition = 24, RULE_rightCondition = 25, 
		RULE_expression = 26, RULE_returnExp = 27, RULE_printExp = 28, RULE_askExp = 29, 
		RULE_answerVal = 30, RULE_mathExp = 31, RULE_textInit = 32, RULE_numberInit = 33, 
		RULE_booleanInit = 34, RULE_assignment = 35, RULE_val = 36, RULE_conditionalOperation = 37, 
		RULE_mathematicalOperation1 = 38, RULE_mathematicalOperation2 = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "startBlock", "startBody", "functionsBlock", "funcBlockBody", 
			"funcDec", "funcOutputParam", "funcInputParam", "funcName", "funcCall", 
			"declaration", "numberDecl", "textDecl", "boolDecl", "initialization", 
			"funcBody", "statement", "ifThenStatement", "ifThenElseStatement", "repeatStatement", 
			"repeatUntilStatement", "whileStatement", "statementBody", "condition", 
			"rightCondition", "expression", "returnExp", "printExp", "askExp", "answerVal", 
			"mathExp", "textInit", "numberInit", "booleanInit", "assignment", "val", 
			"conditionalOperation", "mathematicalOperation1", "mathematicalOperation2"
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
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "TEXT_VAL", "NUMBER_VAL", 
			"WS", "NEWLINE", "COMMENT", "LINE_COMMENT", "ID"
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
	public String getGrammarFileName() { return "TL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TLParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			block();
			setState(81);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public StartBlockContext startBlock() {
			return getRuleContext(StartBlockContext.class,0);
		}
		public FunctionsBlockContext functionsBlock() {
			return getRuleContext(FunctionsBlockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitBlock(this);
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
			setState(83);
			startBlock();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTIONS) {
				{
				setState(84);
				functionsBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartBlockContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(TLParser.START, 0); }
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public List<StartBodyContext> startBody() {
			return getRuleContexts(StartBodyContext.class);
		}
		public StartBodyContext startBody(int i) {
			return getRuleContext(StartBodyContext.class,i);
		}
		public StartBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterStartBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitStartBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitStartBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartBlockContext startBlock() throws RecognitionException {
		StartBlockContext _localctx = new StartBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_startBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(START);
			setState(88);
			match(BEGIN);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6323144L) != 0) || _la==ID) {
				{
				{
				setState(89);
				startBody();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartBodyContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<InitializationContext> initialization() {
			return getRuleContexts(InitializationContext.class);
		}
		public InitializationContext initialization(int i) {
			return getRuleContext(InitializationContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterStartBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitStartBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitStartBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartBodyContext startBody() throws RecognitionException {
		StartBodyContext _localctx = new StartBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_startBody);
		try {
			int _alt;
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(97);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(100); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(102);
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(105); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(107);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(110); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(112);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(115); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsBlockContext extends ParserRuleContext {
		public TerminalNode FUNCTIONS() { return getToken(TLParser.FUNCTIONS, 0); }
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public List<FuncBlockBodyContext> funcBlockBody() {
			return getRuleContexts(FuncBlockBodyContext.class);
		}
		public FuncBlockBodyContext funcBlockBody(int i) {
			return getRuleContext(FuncBlockBodyContext.class,i);
		}
		public FunctionsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFunctionsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFunctionsBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFunctionsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsBlockContext functionsBlock() throws RecognitionException {
		FunctionsBlockContext _localctx = new FunctionsBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(FUNCTIONS);
			setState(120);
			match(BEGIN);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 456L) != 0) || _la==ID) {
				{
				{
				setState(121);
				funcBlockBody();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncBlockBodyContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<InitializationContext> initialization() {
			return getRuleContexts(InitializationContext.class);
		}
		public InitializationContext initialization(int i) {
			return getRuleContext(InitializationContext.class,i);
		}
		public List<FuncDecContext> funcDec() {
			return getRuleContexts(FuncDecContext.class);
		}
		public FuncDecContext funcDec(int i) {
			return getRuleContext(FuncDecContext.class,i);
		}
		public FuncBlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBlockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFuncBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFuncBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFuncBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBlockBodyContext funcBlockBody() throws RecognitionException {
		FuncBlockBodyContext _localctx = new FuncBlockBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcBlockBody);
		try {
			int _alt;
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(129);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(132); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(134);
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(137); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(139);
						funcDec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(142); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDecContext extends ParserRuleContext {
		public FuncNameContext funcID;
		public FuncOutputParamContext param;
		public TerminalNode FUNC() { return getToken(TLParser.FUNC, 0); }
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(TLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TLParser.RPAREN, 0); }
		public List<FuncBodyContext> funcBody() {
			return getRuleContexts(FuncBodyContext.class);
		}
		public FuncBodyContext funcBody(int i) {
			return getRuleContext(FuncBodyContext.class,i);
		}
		public ReturnExpContext returnExp() {
			return getRuleContext(ReturnExpContext.class,0);
		}
		public FuncOutputParamContext funcOutputParam() {
			return getRuleContext(FuncOutputParamContext.class,0);
		}
		public FuncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFuncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFuncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFuncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDecContext funcDec() throws RecognitionException {
		FuncDecContext _localctx = new FuncDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(FUNC);
			setState(147);
			((FuncDecContext)_localctx).funcID = funcName();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(148);
				match(LPAREN);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) {
					{
					setState(149);
					((FuncDecContext)_localctx).param = funcOutputParam();
					}
				}

				setState(152);
				match(RPAREN);
				}
			}

			setState(155);
			match(BEGIN);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6323144L) != 0) || _la==ID) {
				{
				{
				setState(156);
				funcBody();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(162);
				returnExp();
				}
			}

			setState(165);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncOutputParamContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLParser.COMMA, i);
		}
		public FuncOutputParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcOutputParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFuncOutputParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFuncOutputParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFuncOutputParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncOutputParamContext funcOutputParam() throws RecognitionException {
		FuncOutputParamContext _localctx = new FuncOutputParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcOutputParam);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(168);
				declaration();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(169);
					match(COMMA);
					{
					setState(170);
					declaration();
					}
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncInputParamContext extends ParserRuleContext {
		public Token varID;
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLParser.COMMA, i);
		}
		public FuncInputParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInputParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFuncInputParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFuncInputParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFuncInputParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncInputParamContext funcInputParam() throws RecognitionException {
		FuncInputParamContext _localctx = new FuncInputParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcInputParam);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((FuncInputParamContext)_localctx).varID = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(179);
				((FuncInputParamContext)_localctx).varID = match(ID);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(180);
					match(COMMA);
					setState(181);
					match(ID);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends ParserRuleContext {
		public FuncNameContext funcID;
		public FuncInputParamContext param;
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public TerminalNode RUN() { return getToken(TLParser.RUN, 0); }
		public TerminalNode LPAREN() { return getToken(TLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TLParser.RPAREN, 0); }
		public FuncInputParamContext funcInputParam() {
			return getRuleContext(FuncInputParamContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RUN) {
				{
				setState(191);
				match(RUN);
				}
			}

			setState(194);
			((FuncCallContext)_localctx).funcID = funcName();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(195);
				match(LPAREN);
				setState(196);
				((FuncCallContext)_localctx).param = funcInputParam();
				setState(197);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public NumberDeclContext numberDec;
		public TextDeclContext textDec;
		public BoolDeclContext boolDec;
		public NumberDeclContext numberDecl() {
			return getRuleContext(NumberDeclContext.class,0);
		}
		public TextDeclContext textDecl() {
			return getRuleContext(TextDeclContext.class,0);
		}
		public BoolDeclContext boolDecl() {
			return getRuleContext(BoolDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((DeclarationContext)_localctx).numberDec = numberDecl();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				((DeclarationContext)_localctx).textDec = textDecl();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				((DeclarationContext)_localctx).boolDec = boolDecl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberDeclContext extends ParserRuleContext {
		public Token numberID;
		public TerminalNode NUMBER() { return getToken(TLParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public NumberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterNumberDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitNumberDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitNumberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberDeclContext numberDecl() throws RecognitionException {
		NumberDeclContext _localctx = new NumberDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_numberDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(NUMBER);
			setState(207);
			((NumberDeclContext)_localctx).numberID = match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextDeclContext extends ParserRuleContext {
		public Token textID;
		public TerminalNode TEXT() { return getToken(TLParser.TEXT, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TextDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterTextDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitTextDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitTextDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextDeclContext textDecl() throws RecognitionException {
		TextDeclContext _localctx = new TextDeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_textDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(TEXT);
			setState(210);
			((TextDeclContext)_localctx).textID = match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolDeclContext extends ParserRuleContext {
		public Token boolID;
		public TerminalNode BOOLEAN() { return getToken(TLParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public BoolDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterBoolDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitBoolDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitBoolDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolDeclContext boolDecl() throws RecognitionException {
		BoolDeclContext _localctx = new BoolDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(BOOLEAN);
			setState(213);
			((BoolDeclContext)_localctx).boolID = match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationContext extends ParserRuleContext {
		public List<TextInitContext> textInit() {
			return getRuleContexts(TextInitContext.class);
		}
		public TextInitContext textInit(int i) {
			return getRuleContext(TextInitContext.class,i);
		}
		public List<NumberInitContext> numberInit() {
			return getRuleContexts(NumberInitContext.class);
		}
		public NumberInitContext numberInit(int i) {
			return getRuleContext(NumberInitContext.class,i);
		}
		public List<BooleanInitContext> booleanInit() {
			return getRuleContexts(BooleanInitContext.class);
		}
		public BooleanInitContext booleanInit(int i) {
			return getRuleContext(BooleanInitContext.class,i);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_initialization);
		try {
			int _alt;
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(215);
						textInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(218); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(220);
						numberInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(223); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(225);
						booleanInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(228); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<InitializationContext> initialization() {
			return getRuleContexts(InitializationContext.class);
		}
		public InitializationContext initialization(int i) {
			return getRuleContext(InitializationContext.class,i);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFuncBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcBody);
		try {
			int _alt;
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(232);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(235); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(237);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(240); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(242);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(245); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(247);
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(250); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<IfThenStatementContext> ifThenStatement() {
			return getRuleContexts(IfThenStatementContext.class);
		}
		public IfThenStatementContext ifThenStatement(int i) {
			return getRuleContext(IfThenStatementContext.class,i);
		}
		public List<IfThenElseStatementContext> ifThenElseStatement() {
			return getRuleContexts(IfThenElseStatementContext.class);
		}
		public IfThenElseStatementContext ifThenElseStatement(int i) {
			return getRuleContext(IfThenElseStatementContext.class,i);
		}
		public List<RepeatStatementContext> repeatStatement() {
			return getRuleContexts(RepeatStatementContext.class);
		}
		public RepeatStatementContext repeatStatement(int i) {
			return getRuleContext(RepeatStatementContext.class,i);
		}
		public List<RepeatUntilStatementContext> repeatUntilStatement() {
			return getRuleContexts(RepeatUntilStatementContext.class);
		}
		public RepeatUntilStatementContext repeatUntilStatement(int i) {
			return getRuleContext(RepeatUntilStatementContext.class,i);
		}
		public List<WhileStatementContext> whileStatement() {
			return getRuleContexts(WhileStatementContext.class);
		}
		public WhileStatementContext whileStatement(int i) {
			return getRuleContext(WhileStatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			int _alt;
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(254);
						ifThenStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(257); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(259);
						ifThenElseStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(262); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(264);
						repeatStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(267); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(269);
						repeatUntilStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(272); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(275); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(274);
						whileStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(277); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfThenStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TLParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
		public TerminalNode THEN() { return getToken(TLParser.THEN, 0); }
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitIfThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitIfThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifThenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(IF);
			setState(282);
			condition();
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(284);
			statementBody();
			setState(285);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfThenElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TLParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<StatementBodyContext> statementBody() {
			return getRuleContexts(StatementBodyContext.class);
		}
		public StatementBodyContext statementBody(int i) {
			return getRuleContext(StatementBodyContext.class,i);
		}
		public List<TerminalNode> END() { return getTokens(TLParser.END); }
		public TerminalNode END(int i) {
			return getToken(TLParser.END, i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(TLParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(TLParser.BEGIN, i);
		}
		public TerminalNode THEN() { return getToken(TLParser.THEN, 0); }
		public List<TerminalNode> ELSE_IF() { return getTokens(TLParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(TLParser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(TLParser.ELSE, 0); }
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitIfThenElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitIfThenElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifThenElseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(IF);
			setState(288);
			condition();
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(290);
			statementBody();
			setState(291);
			match(END);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(292);
				match(ELSE_IF);
				setState(293);
				condition();
				setState(294);
				match(BEGIN);
				setState(295);
				statementBody();
				setState(296);
				match(END);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(303);
				match(ELSE);
				setState(304);
				match(BEGIN);
				setState(305);
				statementBody();
				setState(306);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(TLParser.REPEAT, 0); }
		public TerminalNode TIMES() { return getToken(TLParser.TIMES, 0); }
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public TerminalNode NUMBER_VAL() { return getToken(TLParser.NUMBER_VAL, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
		public TerminalNode THEN() { return getToken(TLParser.THEN, 0); }
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_repeatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(REPEAT);
			setState(311);
			_la = _input.LA(1);
			if ( !(_la==NUMBER_VAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(312);
			match(TIMES);
			setState(313);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(314);
			statementBody();
			setState(315);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatUntilStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT_UNTIL() { return getToken(TLParser.REPEAT_UNTIL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
		public TerminalNode THEN() { return getToken(TLParser.THEN, 0); }
		public RepeatUntilStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatUntilStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterRepeatUntilStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitRepeatUntilStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitRepeatUntilStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatUntilStatementContext repeatUntilStatement() throws RecognitionException {
		RepeatUntilStatementContext _localctx = new RepeatUntilStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_repeatUntilStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(REPEAT_UNTIL);
			setState(318);
			condition();
			setState(319);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(320);
			statementBody();
			setState(321);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TLParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public TerminalNode DO() { return getToken(TLParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(WHILE);
			setState(324);
			condition();
			setState(325);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==DO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(326);
			statementBody();
			setState(327);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBodyContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<InitializationContext> initialization() {
			return getRuleContexts(InitializationContext.class);
		}
		public InitializationContext initialization(int i) {
			return getRuleContext(InitializationContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnExpContext returnExp() {
			return getRuleContext(ReturnExpContext.class,0);
		}
		public StatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBodyContext statementBody() throws RecognitionException {
		StatementBodyContext _localctx = new StatementBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statementBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(329);
					declaration();
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					initialization();
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6291976L) != 0) || _la==ID) {
				{
				{
				setState(341);
				expression();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) {
				{
				{
				setState(347);
				statement();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(353);
				returnExp();
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class Con1Context extends ConditionContext {
		public ValContext leftConVal;
		public Token leftConVar;
		public ConditionalOperationContext op;
		public ValContext rightConVal;
		public Token rightConVar;
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<ConditionalOperationContext> conditionalOperation() {
			return getRuleContexts(ConditionalOperationContext.class);
		}
		public ConditionalOperationContext conditionalOperation(int i) {
			return getRuleContext(ConditionalOperationContext.class,i);
		}
		public Con1Context(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCon1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCon1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCon1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Con2Context extends ConditionContext {
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public Con2Context(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCon2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCon2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCon2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Con3Context extends ConditionContext {
		public TerminalNode NOTEQUAL() { return getToken(TLParser.NOTEQUAL, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public Con3Context(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCon3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCon3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCon3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condition);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new Con1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL_LITERAL:
				case TEXT_VAL:
				case NUMBER_VAL:
					{
					setState(356);
					((Con1Context)_localctx).leftConVal = val();
					}
					break;
				case ID:
					{
					setState(357);
					((Con1Context)_localctx).leftConVar = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(360);
					((Con1Context)_localctx).op = conditionalOperation();
					setState(363);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BOOL_LITERAL:
					case TEXT_VAL:
					case NUMBER_VAL:
						{
						setState(361);
						((Con1Context)_localctx).rightConVal = val();
						}
						break;
					case ID:
						{
						setState(362);
						((Con1Context)_localctx).rightConVar = match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(367); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0) );
				}
				break;
			case 2:
				_localctx = new Con2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(ID);
				}
				break;
			case 3:
				_localctx = new Con3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(NOTEQUAL);
				setState(371);
				match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RightConditionContext extends ParserRuleContext {
		public ConditionalOperationContext op;
		public ValContext rightConVal;
		public Token rightConVar;
		public List<ConditionalOperationContext> conditionalOperation() {
			return getRuleContexts(ConditionalOperationContext.class);
		}
		public ConditionalOperationContext conditionalOperation(int i) {
			return getRuleContext(ConditionalOperationContext.class,i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public RightConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterRightCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitRightCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitRightCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightConditionContext rightCondition() throws RecognitionException {
		RightConditionContext _localctx = new RightConditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rightCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(374);
				((RightConditionContext)_localctx).op = conditionalOperation();
				setState(377);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL_LITERAL:
				case TEXT_VAL:
				case NUMBER_VAL:
					{
					setState(375);
					((RightConditionContext)_localctx).rightConVal = val();
					}
					break;
				case ID:
					{
					setState(376);
					((RightConditionContext)_localctx).rightConVar = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(381); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<MathExpContext> mathExp() {
			return getRuleContexts(MathExpContext.class);
		}
		public MathExpContext mathExp(int i) {
			return getRuleContext(MathExpContext.class,i);
		}
		public List<FuncCallContext> funcCall() {
			return getRuleContexts(FuncCallContext.class);
		}
		public FuncCallContext funcCall(int i) {
			return getRuleContext(FuncCallContext.class,i);
		}
		public List<FuncDecContext> funcDec() {
			return getRuleContexts(FuncDecContext.class);
		}
		public FuncDecContext funcDec(int i) {
			return getRuleContext(FuncDecContext.class,i);
		}
		public List<PrintExpContext> printExp() {
			return getRuleContexts(PrintExpContext.class);
		}
		public PrintExpContext printExp(int i) {
			return getRuleContext(PrintExpContext.class,i);
		}
		public List<AskExpContext> askExp() {
			return getRuleContexts(AskExpContext.class);
		}
		public AskExpContext askExp(int i) {
			return getRuleContext(AskExpContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		try {
			int _alt;
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(383);
						mathExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(386); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(388);
						funcCall();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(391); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(394); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(393);
						funcDec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(396); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(399); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(398);
						printExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(401); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(404); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(403);
						askExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(406); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(409); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(408);
						assignment();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(411); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnExpContext extends ParserRuleContext {
		public ValContext returnVal;
		public Token returnVar;
		public TerminalNode RETURN() { return getToken(TLParser.RETURN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public ReturnExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterReturnExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitReturnExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitReturnExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExpContext returnExp() throws RecognitionException {
		ReturnExpContext _localctx = new ReturnExpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(RETURN);
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case TEXT_VAL:
			case NUMBER_VAL:
				{
				setState(416);
				((ReturnExpContext)_localctx).returnVal = val();
				}
				break;
			case ID:
				{
				setState(417);
				((ReturnExpContext)_localctx).returnVar = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintExpContext extends ParserRuleContext {
		public ValContext printVal;
		public Token printVar;
		public TerminalNode PRINT() { return getToken(TLParser.PRINT, 0); }
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<TerminalNode> ADD() { return getTokens(TLParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(TLParser.ADD, i);
		}
		public PrintExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterPrintExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitPrintExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitPrintExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExpContext printExp() throws RecognitionException {
		PrintExpContext _localctx = new PrintExpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_printExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(PRINT);
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case TEXT_VAL:
			case NUMBER_VAL:
				{
				setState(421);
				((PrintExpContext)_localctx).printVal = val();
				}
				break;
			case ID:
				{
				setState(422);
				((PrintExpContext)_localctx).printVar = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD) {
				{
				setState(430); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(425);
					match(ADD);
					setState(428);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BOOL_LITERAL:
					case TEXT_VAL:
					case NUMBER_VAL:
						{
						setState(426);
						((PrintExpContext)_localctx).printVal = val();
						}
						break;
					case ID:
						{
						setState(427);
						((PrintExpContext)_localctx).printVar = match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(432); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ADD );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AskExpContext extends ParserRuleContext {
		public Token askID;
		public ValContext printVal;
		public Token printVar;
		public TerminalNode ASK() { return getToken(TLParser.ASK, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(TLParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(TLParser.ADD, i);
		}
		public AskExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_askExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAskExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAskExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAskExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AskExpContext askExp() throws RecognitionException {
		AskExpContext _localctx = new AskExpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_askExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(ASK);
			setState(437);
			((AskExpContext)_localctx).askID = match(ID);
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case TEXT_VAL:
			case NUMBER_VAL:
				{
				setState(438);
				((AskExpContext)_localctx).printVal = val();
				}
				break;
			case ID:
				{
				setState(439);
				((AskExpContext)_localctx).printVar = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD) {
				{
				setState(447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(442);
					match(ADD);
					setState(445);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BOOL_LITERAL:
					case TEXT_VAL:
					case NUMBER_VAL:
						{
						setState(443);
						((AskExpContext)_localctx).printVal = val();
						}
						break;
					case ID:
						{
						setState(444);
						((AskExpContext)_localctx).printVar = match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(449); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ADD );
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnswerValContext extends ParserRuleContext {
		public Token askID;
		public TerminalNode DOT() { return getToken(TLParser.DOT, 0); }
		public TerminalNode ANSWER() { return getToken(TLParser.ANSWER, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public AnswerValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answerVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAnswerVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAnswerVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAnswerVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerValContext answerVal() throws RecognitionException {
		AnswerValContext _localctx = new AnswerValContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_answerVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			((AnswerValContext)_localctx).askID = match(ID);
			setState(454);
			match(DOT);
			setState(455);
			match(ANSWER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MathExpContext extends ParserRuleContext {
		public MathExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExp; }
	 
		public MathExpContext() { }
		public void copyFrom(MathExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathExp2Context extends MathExpContext {
		public Token assignID;
		public MathematicalOperation2Context mathOp;
		public ValContext leftVal;
		public Token leftVar;
		public MathematicalOperation1Context mathOp1;
		public ValContext rightVal;
		public Token rightVar;
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public MathematicalOperation2Context mathematicalOperation2() {
			return getRuleContext(MathematicalOperation2Context.class,0);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<MathematicalOperation1Context> mathematicalOperation1() {
			return getRuleContexts(MathematicalOperation1Context.class);
		}
		public MathematicalOperation1Context mathematicalOperation1(int i) {
			return getRuleContext(MathematicalOperation1Context.class,i);
		}
		public MathExp2Context(MathExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterMathExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitMathExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitMathExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathExp1Context extends MathExpContext {
		public Token assignId;
		public ValContext leftVal;
		public Token leftVar;
		public MathematicalOperation1Context mathOp;
		public ValContext rightVal;
		public Token rightVar;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<MathematicalOperation1Context> mathematicalOperation1() {
			return getRuleContexts(MathematicalOperation1Context.class);
		}
		public MathematicalOperation1Context mathematicalOperation1(int i) {
			return getRuleContext(MathematicalOperation1Context.class,i);
		}
		public MathExp1Context(MathExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterMathExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitMathExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitMathExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExpContext mathExp() throws RecognitionException {
		MathExpContext _localctx = new MathExpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mathExp);
		try {
			int _alt;
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				_localctx = new MathExp1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				((MathExp1Context)_localctx).assignId = match(ID);
				setState(458);
				match(ASSIGN);
				setState(461);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL_LITERAL:
				case TEXT_VAL:
				case NUMBER_VAL:
					{
					setState(459);
					((MathExp1Context)_localctx).leftVal = val();
					}
					break;
				case ID:
					{
					setState(460);
					((MathExp1Context)_localctx).leftVar = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(468); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(463);
						((MathExp1Context)_localctx).mathOp = mathematicalOperation1();
						setState(466);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case BOOL_LITERAL:
						case TEXT_VAL:
						case NUMBER_VAL:
							{
							setState(464);
							((MathExp1Context)_localctx).rightVal = val();
							}
							break;
						case ID:
							{
							setState(465);
							((MathExp1Context)_localctx).rightVar = match(ID);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(470); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new MathExp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				((MathExp2Context)_localctx).assignID = match(ID);
				setState(473);
				((MathExp2Context)_localctx).mathOp = mathematicalOperation2();
				setState(476);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL_LITERAL:
				case TEXT_VAL:
				case NUMBER_VAL:
					{
					setState(474);
					((MathExp2Context)_localctx).leftVal = val();
					}
					break;
				case ID:
					{
					setState(475);
					((MathExp2Context)_localctx).leftVar = match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(478);
						((MathExp2Context)_localctx).mathOp1 = mathematicalOperation1();
						setState(481);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case BOOL_LITERAL:
						case TEXT_VAL:
						case NUMBER_VAL:
							{
							setState(479);
							((MathExp2Context)_localctx).rightVal = val();
							}
							break;
						case ID:
							{
							setState(480);
							((MathExp2Context)_localctx).rightVar = match(ID);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(487);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextInitContext extends ParserRuleContext {
		public Token var1ID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode TEXT_VAL() { return getToken(TLParser.TEXT_VAL, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode TEXT() { return getToken(TLParser.TEXT, 0); }
		public TextInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterTextInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitTextInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitTextInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextInitContext textInit() throws RecognitionException {
		TextInitContext _localctx = new TextInitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_textInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT) {
				{
				setState(490);
				match(TEXT);
				}
			}

			setState(493);
			((TextInitContext)_localctx).var1ID = match(ID);
			setState(494);
			match(ASSIGN);
			setState(495);
			match(TEXT_VAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberInitContext extends ParserRuleContext {
		public Token var1ID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode NUMBER_VAL() { return getToken(TLParser.NUMBER_VAL, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(TLParser.NUMBER, 0); }
		public NumberInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterNumberInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitNumberInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitNumberInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberInitContext numberInit() throws RecognitionException {
		NumberInitContext _localctx = new NumberInitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numberInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(497);
				match(NUMBER);
				}
			}

			setState(500);
			((NumberInitContext)_localctx).var1ID = match(ID);
			setState(501);
			match(ASSIGN);
			setState(502);
			match(NUMBER_VAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanInitContext extends ParserRuleContext {
		public Token var1ID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(TLParser.BOOL_LITERAL, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLParser.BOOLEAN, 0); }
		public BooleanInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterBooleanInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitBooleanInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitBooleanInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanInitContext booleanInit() throws RecognitionException {
		BooleanInitContext _localctx = new BooleanInitContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_booleanInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOLEAN) {
				{
				setState(504);
				match(BOOLEAN);
				}
			}

			setState(507);
			((BooleanInitContext)_localctx).var1ID = match(ID);
			setState(508);
			match(ASSIGN);
			setState(509);
			match(BOOL_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Token var1ID;
		public Token var2ID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			((AssignmentContext)_localctx).var1ID = match(ID);
			setState(512);
			match(ASSIGN);
			setState(513);
			((AssignmentContext)_localctx).var2ID = match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValContext extends ParserRuleContext {
		public Token textVal;
		public Token numberVal;
		public Token boolVal;
		public TerminalNode TEXT_VAL() { return getToken(TLParser.TEXT_VAL, 0); }
		public TerminalNode NUMBER_VAL() { return getToken(TLParser.NUMBER_VAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(TLParser.BOOL_LITERAL, 0); }
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_val);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				((ValContext)_localctx).textVal = match(TEXT_VAL);
				}
				break;
			case NUMBER_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				((ValContext)_localctx).numberVal = match(NUMBER_VAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				((ValContext)_localctx).boolVal = match(BOOL_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalOperationContext extends ParserRuleContext {
		public Token conOpLT;
		public Token conOpGT;
		public Token conOpEQ;
		public Token conOpNEQ;
		public Token conOpLE;
		public Token conOpGE;
		public TerminalNode LT() { return getToken(TLParser.LT, 0); }
		public TerminalNode GT() { return getToken(TLParser.GT, 0); }
		public TerminalNode EQUAL() { return getToken(TLParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(TLParser.NOTEQUAL, 0); }
		public TerminalNode LE() { return getToken(TLParser.LE, 0); }
		public TerminalNode GE() { return getToken(TLParser.GE, 0); }
		public ConditionalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterConditionalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitConditionalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitConditionalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOperationContext conditionalOperation() throws RecognitionException {
		ConditionalOperationContext _localctx = new ConditionalOperationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conditionalOperation);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				((ConditionalOperationContext)_localctx).conOpLT = match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				((ConditionalOperationContext)_localctx).conOpGT = match(GT);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				((ConditionalOperationContext)_localctx).conOpEQ = match(EQUAL);
				}
				break;
			case NOTEQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(523);
				((ConditionalOperationContext)_localctx).conOpNEQ = match(NOTEQUAL);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 5);
				{
				setState(524);
				((ConditionalOperationContext)_localctx).conOpLE = match(LE);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 6);
				{
				setState(525);
				((ConditionalOperationContext)_localctx).conOpGE = match(GE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MathematicalOperation1Context extends ParserRuleContext {
		public Token mathOpADD;
		public Token mathOpSUB;
		public Token mathOpMUL;
		public Token mathOpDIV;
		public TerminalNode ADD() { return getToken(TLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TLParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(TLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TLParser.DIV, 0); }
		public MathematicalOperation1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematicalOperation1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterMathematicalOperation1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitMathematicalOperation1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitMathematicalOperation1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathematicalOperation1Context mathematicalOperation1() throws RecognitionException {
		MathematicalOperation1Context _localctx = new MathematicalOperation1Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_mathematicalOperation1);
		try {
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case TEXT_VAL:
			case NUMBER_VAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				((MathematicalOperation1Context)_localctx).mathOpADD = match(ADD);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				((MathematicalOperation1Context)_localctx).mathOpSUB = match(SUB);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				((MathematicalOperation1Context)_localctx).mathOpMUL = match(MUL);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 5);
				{
				setState(532);
				((MathematicalOperation1Context)_localctx).mathOpDIV = match(DIV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MathematicalOperation2Context extends ParserRuleContext {
		public Token mathOpADD;
		public Token mathOpSUB;
		public Token mathOpMUL;
		public Token mathOpDIV;
		public TerminalNode ADD_ASSIGN() { return getToken(TLParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(TLParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(TLParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(TLParser.DIV_ASSIGN, 0); }
		public MathematicalOperation2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematicalOperation2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterMathematicalOperation2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitMathematicalOperation2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitMathematicalOperation2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathematicalOperation2Context mathematicalOperation2() throws RecognitionException {
		MathematicalOperation2Context _localctx = new MathematicalOperation2Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_mathematicalOperation2);
		try {
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case TEXT_VAL:
			case NUMBER_VAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				((MathematicalOperation2Context)_localctx).mathOpADD = match(ADD_ASSIGN);
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				((MathematicalOperation2Context)_localctx).mathOpSUB = match(SUB_ASSIGN);
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(538);
				((MathematicalOperation2Context)_localctx).mathOpMUL = match(MUL_ASSIGN);
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(539);
				((MathematicalOperation2Context)_localctx).mathOpDIV = match(DIV_ASSIGN);
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

	public static final String _serializedATN =
		"\u0004\u0001C\u021f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001V\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002[\b\u0002\n\u0002"+
		"\f\u0002^\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003c\b\u0003"+
		"\u000b\u0003\f\u0003d\u0001\u0003\u0004\u0003h\b\u0003\u000b\u0003\f\u0003"+
		"i\u0001\u0003\u0004\u0003m\b\u0003\u000b\u0003\f\u0003n\u0001\u0003\u0004"+
		"\u0003r\b\u0003\u000b\u0003\f\u0003s\u0003\u0003v\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004{\b\u0004\n\u0004\f\u0004~\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005\u0083\b\u0005\u000b\u0005"+
		"\f\u0005\u0084\u0001\u0005\u0004\u0005\u0088\b\u0005\u000b\u0005\f\u0005"+
		"\u0089\u0001\u0005\u0004\u0005\u008d\b\u0005\u000b\u0005\f\u0005\u008e"+
		"\u0003\u0005\u0091\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0097\b\u0006\u0001\u0006\u0003\u0006\u009a\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u009e\b\u0006\n\u0006\f\u0006\u00a1\t\u0006"+
		"\u0001\u0006\u0003\u0006\u00a4\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ac\b\u0007\n\u0007"+
		"\f\u0007\u00af\t\u0007\u0003\u0007\u00b1\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00b7\b\b\n\b\f\b\u00ba\t\b\u0003\b\u00bc\b\b\u0001"+
		"\t\u0001\t\u0001\n\u0003\n\u00c1\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00c8\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00cd"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u00d9\b\u000f\u000b\u000f\f"+
		"\u000f\u00da\u0001\u000f\u0004\u000f\u00de\b\u000f\u000b\u000f\f\u000f"+
		"\u00df\u0001\u000f\u0004\u000f\u00e3\b\u000f\u000b\u000f\f\u000f\u00e4"+
		"\u0003\u000f\u00e7\b\u000f\u0001\u0010\u0004\u0010\u00ea\b\u0010\u000b"+
		"\u0010\f\u0010\u00eb\u0001\u0010\u0004\u0010\u00ef\b\u0010\u000b\u0010"+
		"\f\u0010\u00f0\u0001\u0010\u0004\u0010\u00f4\b\u0010\u000b\u0010\f\u0010"+
		"\u00f5\u0001\u0010\u0004\u0010\u00f9\b\u0010\u000b\u0010\f\u0010\u00fa"+
		"\u0003\u0010\u00fd\b\u0010\u0001\u0011\u0004\u0011\u0100\b\u0011\u000b"+
		"\u0011\f\u0011\u0101\u0001\u0011\u0004\u0011\u0105\b\u0011\u000b\u0011"+
		"\f\u0011\u0106\u0001\u0011\u0004\u0011\u010a\b\u0011\u000b\u0011\f\u0011"+
		"\u010b\u0001\u0011\u0004\u0011\u010f\b\u0011\u000b\u0011\f\u0011\u0110"+
		"\u0001\u0011\u0004\u0011\u0114\b\u0011\u000b\u0011\f\u0011\u0115\u0003"+
		"\u0011\u0118\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u012b\b\u0013\n\u0013\f\u0013\u012e\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0135\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0005\u0017\u014b\b\u0017\n\u0017\f\u0017\u014e"+
		"\t\u0017\u0001\u0017\u0005\u0017\u0151\b\u0017\n\u0017\f\u0017\u0154\t"+
		"\u0017\u0001\u0017\u0005\u0017\u0157\b\u0017\n\u0017\f\u0017\u015a\t\u0017"+
		"\u0001\u0017\u0005\u0017\u015d\b\u0017\n\u0017\f\u0017\u0160\t\u0017\u0001"+
		"\u0017\u0003\u0017\u0163\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0167"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u016c\b\u0018"+
		"\u0004\u0018\u016e\b\u0018\u000b\u0018\f\u0018\u016f\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0175\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u017a\b\u0019\u0004\u0019\u017c\b\u0019\u000b\u0019"+
		"\f\u0019\u017d\u0001\u001a\u0004\u001a\u0181\b\u001a\u000b\u001a\f\u001a"+
		"\u0182\u0001\u001a\u0004\u001a\u0186\b\u001a\u000b\u001a\f\u001a\u0187"+
		"\u0001\u001a\u0004\u001a\u018b\b\u001a\u000b\u001a\f\u001a\u018c\u0001"+
		"\u001a\u0004\u001a\u0190\b\u001a\u000b\u001a\f\u001a\u0191\u0001\u001a"+
		"\u0004\u001a\u0195\b\u001a\u000b\u001a\f\u001a\u0196\u0001\u001a\u0004"+
		"\u001a\u019a\b\u001a\u000b\u001a\f\u001a\u019b\u0003\u001a\u019e\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a3\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u01a8\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01ad\b\u001c\u0004\u001c\u01af\b\u001c\u000b"+
		"\u001c\f\u001c\u01b0\u0003\u001c\u01b3\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u01b9\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u01be\b\u001d\u0004\u001d\u01c0\b\u001d\u000b"+
		"\u001d\f\u001d\u01c1\u0003\u001d\u01c4\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u01ce\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u01d3\b\u001f\u0004\u001f\u01d5\b\u001f\u000b\u001f\f\u001f\u01d6\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01dd\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01e2\b\u001f\u0005\u001f\u01e4"+
		"\b\u001f\n\u001f\f\u001f\u01e7\t\u001f\u0003\u001f\u01e9\b\u001f\u0001"+
		" \u0003 \u01ec\b \u0001 \u0001 \u0001 \u0001 \u0001!\u0003!\u01f3\b!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0003\"\u01fa\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u0207"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u020f\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0216\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0003\'\u021d\b\'\u0001\'\u0000\u0000(\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLN\u0000\u0003\u0002\u0000\u0004\u0004\u0011\u0011\u0002"+
		"\u0000>>CC\u0002\u0000\u0004\u0004\u0012\u0012\u0261\u0000P\u0001\u0000"+
		"\u0000\u0000\u0002S\u0001\u0000\u0000\u0000\u0004W\u0001\u0000\u0000\u0000"+
		"\u0006u\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\n\u0090\u0001"+
		"\u0000\u0000\u0000\f\u0092\u0001\u0000\u0000\u0000\u000e\u00b0\u0001\u0000"+
		"\u0000\u0000\u0010\u00bb\u0001\u0000\u0000\u0000\u0012\u00bd\u0001\u0000"+
		"\u0000\u0000\u0014\u00c0\u0001\u0000\u0000\u0000\u0016\u00cc\u0001\u0000"+
		"\u0000\u0000\u0018\u00ce\u0001\u0000\u0000\u0000\u001a\u00d1\u0001\u0000"+
		"\u0000\u0000\u001c\u00d4\u0001\u0000\u0000\u0000\u001e\u00e6\u0001\u0000"+
		"\u0000\u0000 \u00fc\u0001\u0000\u0000\u0000\"\u0117\u0001\u0000\u0000"+
		"\u0000$\u0119\u0001\u0000\u0000\u0000&\u011f\u0001\u0000\u0000\u0000("+
		"\u0136\u0001\u0000\u0000\u0000*\u013d\u0001\u0000\u0000\u0000,\u0143\u0001"+
		"\u0000\u0000\u0000.\u014c\u0001\u0000\u0000\u00000\u0174\u0001\u0000\u0000"+
		"\u00002\u017b\u0001\u0000\u0000\u00004\u019d\u0001\u0000\u0000\u00006"+
		"\u019f\u0001\u0000\u0000\u00008\u01a4\u0001\u0000\u0000\u0000:\u01b4\u0001"+
		"\u0000\u0000\u0000<\u01c5\u0001\u0000\u0000\u0000>\u01e8\u0001\u0000\u0000"+
		"\u0000@\u01eb\u0001\u0000\u0000\u0000B\u01f2\u0001\u0000\u0000\u0000D"+
		"\u01f9\u0001\u0000\u0000\u0000F\u01ff\u0001\u0000\u0000\u0000H\u0206\u0001"+
		"\u0000\u0000\u0000J\u020e\u0001\u0000\u0000\u0000L\u0215\u0001\u0000\u0000"+
		"\u0000N\u021c\u0001\u0000\u0000\u0000PQ\u0003\u0002\u0001\u0000QR\u0005"+
		"\u0000\u0000\u0001R\u0001\u0001\u0000\u0000\u0000SU\u0003\u0004\u0002"+
		"\u0000TV\u0003\b\u0004\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000V\u0003\u0001\u0000\u0000\u0000WX\u0005\u0001\u0000\u0000X\\\u0005"+
		"\u0004\u0000\u0000Y[\u0003\u0006\u0003\u0000ZY\u0001\u0000\u0000\u0000"+
		"[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\u0005"+
		"\u0000\u0000`\u0005\u0001\u0000\u0000\u0000ac\u0003\u0016\u000b\u0000"+
		"ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ev\u0001\u0000\u0000\u0000fh\u0003\u001e"+
		"\u000f\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jv\u0001\u0000\u0000\u0000"+
		"km\u00034\u001a\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000ov\u0001\u0000\u0000"+
		"\u0000pr\u0003\"\u0011\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000"+
		"\u0000\u0000ub\u0001\u0000\u0000\u0000ug\u0001\u0000\u0000\u0000ul\u0001"+
		"\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000v\u0007\u0001\u0000\u0000"+
		"\u0000wx\u0005\u0002\u0000\u0000x|\u0005\u0004\u0000\u0000y{\u0003\n\u0005"+
		"\u0000zy\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0005\u0000\u0000\u0080\t"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u0016\u000b\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0091"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u001e\u000f\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0091"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0003\f\u0006\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001"+
		"\u0000\u0000\u0000\u0090\u0082\u0001\u0000\u0000\u0000\u0090\u0087\u0001"+
		"\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0091\u000b\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u0003\u0000\u0000\u0093\u0099\u0003"+
		"\u0012\t\u0000\u0094\u0096\u0005\u0019\u0000\u0000\u0095\u0097\u0003\u000e"+
		"\u0007\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a\u0005\u001a"+
		"\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009f\u0005\u0004"+
		"\u0000\u0000\u009c\u009e\u0003 \u0010\u0000\u009d\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a4\u00036\u001b\u0000"+
		"\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0005\u0000\u0000"+
		"\u00a6\r\u0001\u0000\u0000\u0000\u00a7\u00b1\u0003\u0016\u000b\u0000\u00a8"+
		"\u00ad\u0003\u0016\u000b\u0000\u00a9\u00aa\u0005 \u0000\u0000\u00aa\u00ac"+
		"\u0003\u0016\u000b\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00af"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0\u00a7\u0001\u0000\u0000\u0000\u00b0\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b1\u000f\u0001\u0000\u0000\u0000\u00b2\u00bc"+
		"\u0005C\u0000\u0000\u00b3\u00b8\u0005C\u0000\u0000\u00b4\u00b5\u0005 "+
		"\u0000\u0000\u00b5\u00b7\u0005C\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00b2\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b3\u0001\u0000\u0000\u0000\u00bc\u0011\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005C\u0000\u0000\u00be\u0013\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c1\u0005\u0016\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c7\u0003\u0012\t\u0000\u00c3\u00c4\u0005\u0019\u0000\u0000\u00c4"+
		"\u00c5\u0003\u0010\b\u0000\u00c5\u00c6\u0005\u001a\u0000\u0000\u00c6\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u0015\u0001\u0000\u0000\u0000\u00c9\u00cd"+
		"\u0003\u0018\f\u0000\u00ca\u00cd\u0003\u001a\r\u0000\u00cb\u00cd\u0003"+
		"\u001c\u000e\u0000\u00cc\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u0017\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0005\u0007\u0000\u0000\u00cf\u00d0\u0005"+
		"C\u0000\u0000\u00d0\u0019\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\b"+
		"\u0000\u0000\u00d2\u00d3\u0005C\u0000\u0000\u00d3\u001b\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005\u0006\u0000\u0000\u00d5\u00d6\u0005C\u0000\u0000"+
		"\u00d6\u001d\u0001\u0000\u0000\u0000\u00d7\u00d9\u0003@ \u0000\u00d8\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00e7"+
		"\u0001\u0000\u0000\u0000\u00dc\u00de\u0003B!\u0000\u00dd\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e3\u0003D\"\u0000\u00e2\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e6\u00d8\u0001\u0000\u0000\u0000\u00e6\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e7\u001f\u0001\u0000\u0000"+
		"\u0000\u00e8\u00ea\u0003\"\u0011\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u00034\u001a\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00fd\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f4\u0003\u0016\u000b\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00fd\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f9\u0003\u001e\u000f\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc"+
		"\u00e9\u0001\u0000\u0000\u0000\u00fc\u00ee\u0001\u0000\u0000\u0000\u00fc"+
		"\u00f3\u0001\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000\u00fd"+
		"!\u0001\u0000\u0000\u0000\u00fe\u0100\u0003$\u0012\u0000\u00ff\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u00ff\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0118\u0001"+
		"\u0000\u0000\u0000\u0103\u0105\u0003&\u0013\u0000\u0104\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0118\u0001\u0000"+
		"\u0000\u0000\u0108\u010a\u0003(\u0014\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0118\u0001\u0000\u0000"+
		"\u0000\u010d\u010f\u0003*\u0015\u0000\u010e\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0118\u0001\u0000\u0000\u0000"+
		"\u0112\u0114\u0003,\u0016\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117"+
		"\u00ff\u0001\u0000\u0000\u0000\u0117\u0104\u0001\u0000\u0000\u0000\u0117"+
		"\u0109\u0001\u0000\u0000\u0000\u0117\u010e\u0001\u0000\u0000\u0000\u0117"+
		"\u0113\u0001\u0000\u0000\u0000\u0118#\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005\u000e\u0000\u0000\u011a\u011b\u00030\u0018\u0000\u011b\u011c\u0007"+
		"\u0000\u0000\u0000\u011c\u011d\u0003.\u0017\u0000\u011d\u011e\u0005\u0005"+
		"\u0000\u0000\u011e%\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u000e\u0000"+
		"\u0000\u0120\u0121\u00030\u0018\u0000\u0121\u0122\u0007\u0000\u0000\u0000"+
		"\u0122\u0123\u0003.\u0017\u0000\u0123\u012c\u0005\u0005\u0000\u0000\u0124"+
		"\u0125\u0005\u0010\u0000\u0000\u0125\u0126\u00030\u0018\u0000\u0126\u0127"+
		"\u0005\u0004\u0000\u0000\u0127\u0128\u0003.\u0017\u0000\u0128\u0129\u0005"+
		"\u0005\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0124\u0001"+
		"\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0134\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"\u000f\u0000\u0000\u0130\u0131\u0005\u0004\u0000\u0000\u0131\u0132\u0003"+
		".\u0017\u0000\u0132\u0133\u0005\u0005\u0000\u0000\u0133\u0135\u0001\u0000"+
		"\u0000\u0000\u0134\u012f\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\'\u0001\u0000\u0000\u0000\u0136\u0137\u0005\f\u0000"+
		"\u0000\u0137\u0138\u0007\u0001\u0000\u0000\u0138\u0139\u0005\u0013\u0000"+
		"\u0000\u0139\u013a\u0007\u0000\u0000\u0000\u013a\u013b\u0003.\u0017\u0000"+
		"\u013b\u013c\u0005\u0005\u0000\u0000\u013c)\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0005\r\u0000\u0000\u013e\u013f\u00030\u0018\u0000\u013f\u0140"+
		"\u0007\u0000\u0000\u0000\u0140\u0141\u0003.\u0017\u0000\u0141\u0142\u0005"+
		"\u0005\u0000\u0000\u0142+\u0001\u0000\u0000\u0000\u0143\u0144\u0005\u000b"+
		"\u0000\u0000\u0144\u0145\u00030\u0018\u0000\u0145\u0146\u0007\u0002\u0000"+
		"\u0000\u0146\u0147\u0003.\u0017\u0000\u0147\u0148\u0005\u0005\u0000\u0000"+
		"\u0148-\u0001\u0000\u0000\u0000\u0149\u014b\u0003\u0016\u000b\u0000\u014a"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"\u0152\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f"+
		"\u0151\u0003\u001e\u000f\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151"+
		"\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0001\u0000\u0000\u0000\u0153\u0158\u0001\u0000\u0000\u0000\u0154"+
		"\u0152\u0001\u0000\u0000\u0000\u0155\u0157\u00034\u001a\u0000\u0156\u0155"+
		"\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015e"+
		"\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015d"+
		"\u0003\"\u0011\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d\u0160\u0001"+
		"\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001"+
		"\u0000\u0000\u0000\u015f\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001"+
		"\u0000\u0000\u0000\u0161\u0163\u00036\u001b\u0000\u0162\u0161\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163/\u0001\u0000\u0000"+
		"\u0000\u0164\u0167\u0003H$\u0000\u0165\u0167\u0005C\u0000\u0000\u0166"+
		"\u0164\u0001\u0000\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u016d\u0001\u0000\u0000\u0000\u0168\u016b\u0003J%\u0000\u0169\u016c\u0003"+
		"H$\u0000\u016a\u016c\u0005C\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000\u0000"+
		"\u0000\u016d\u0168\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000"+
		"\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170\u0175\u0001\u0000\u0000\u0000\u0171\u0175\u0005C\u0000\u0000"+
		"\u0172\u0173\u0005)\u0000\u0000\u0173\u0175\u0005C\u0000\u0000\u0174\u0166"+
		"\u0001\u0000\u0000\u0000\u0174\u0171\u0001\u0000\u0000\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u01751\u0001\u0000\u0000\u0000\u0176\u0179\u0003"+
		"J%\u0000\u0177\u017a\u0003H$\u0000\u0178\u017a\u0005C\u0000\u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a"+
		"\u017c\u0001\u0000\u0000\u0000\u017b\u0176\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d"+
		"\u017e\u0001\u0000\u0000\u0000\u017e3\u0001\u0000\u0000\u0000\u017f\u0181"+
		"\u0003>\u001f\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001"+
		"\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001"+
		"\u0000\u0000\u0000\u0183\u019e\u0001\u0000\u0000\u0000\u0184\u0186\u0003"+
		"\u0014\n\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u019e\u0001\u0000\u0000\u0000\u0189\u018b\u0003\f\u0006"+
		"\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000"+
		"\u0000\u018d\u019e\u0001\u0000\u0000\u0000\u018e\u0190\u00038\u001c\u0000"+
		"\u018f\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000"+
		"\u0192\u019e\u0001\u0000\u0000\u0000\u0193\u0195\u0003:\u001d\u0000\u0194"+
		"\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196"+
		"\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197"+
		"\u019e\u0001\u0000\u0000\u0000\u0198\u019a\u0003F#\u0000\u0199\u0198\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u0199\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001"+
		"\u0000\u0000\u0000\u019d\u0180\u0001\u0000\u0000\u0000\u019d\u0185\u0001"+
		"\u0000\u0000\u0000\u019d\u018a\u0001\u0000\u0000\u0000\u019d\u018f\u0001"+
		"\u0000\u0000\u0000\u019d\u0194\u0001\u0000\u0000\u0000\u019d\u0199\u0001"+
		"\u0000\u0000\u0000\u019e5\u0001\u0000\u0000\u0000\u019f\u01a2\u0005\u0014"+
		"\u0000\u0000\u01a0\u01a3\u0003H$\u0000\u01a1\u01a3\u0005C\u0000\u0000"+
		"\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a37\u0001\u0000\u0000\u0000\u01a4\u01a7\u0005\t\u0000\u0000\u01a5"+
		"\u01a8\u0003H$\u0000\u01a6\u01a8\u0005C\u0000\u0000\u01a7\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8\u01b2\u0001"+
		"\u0000\u0000\u0000\u01a9\u01ac\u0005.\u0000\u0000\u01aa\u01ad\u0003H$"+
		"\u0000\u01ab\u01ad\u0005C\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000\u0000"+
		"\u01ae\u01a9\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b39\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0005\u0015\u0000\u0000\u01b5\u01b8\u0005C\u0000\u0000\u01b6\u01b9"+
		"\u0003H$\u0000\u01b7\u01b9\u0005C\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9\u01c3\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bd\u0005.\u0000\u0000\u01bb\u01be\u0003H$\u0000"+
		"\u01bc\u01be\u0005C\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd"+
		"\u01bc\u0001\u0000\u0000\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf"+
		"\u01ba\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c3\u01bf\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c4;\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0005C\u0000\u0000\u01c6\u01c7\u0005!\u0000\u0000\u01c7\u01c8\u0005\u0018"+
		"\u0000\u0000\u01c8=\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005C\u0000\u0000"+
		"\u01ca\u01cd\u0005#\u0000\u0000\u01cb\u01ce\u0003H$\u0000\u01cc\u01ce"+
		"\u0005C\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ce\u01d4\u0001\u0000\u0000\u0000\u01cf\u01d2\u0003"+
		"L&\u0000\u01d0\u01d3\u0003H$\u0000\u01d1\u01d3\u0005C\u0000\u0000\u01d2"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d5\u0001\u0000\u0000\u0000\u01d4\u01cf\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d7\u01e9\u0001\u0000\u0000\u0000\u01d8"+
		"\u01d9\u0005C\u0000\u0000\u01d9\u01dc\u0003N\'\u0000\u01da\u01dd\u0003"+
		"H$\u0000\u01db\u01dd\u0005C\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dd\u01e5\u0001\u0000\u0000"+
		"\u0000\u01de\u01e1\u0003L&\u0000\u01df\u01e2\u0003H$\u0000\u01e0\u01e2"+
		"\u0005C\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e4\u0001\u0000\u0000\u0000\u01e3\u01de\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e7\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e8\u01c9\u0001"+
		"\u0000\u0000\u0000\u01e8\u01d8\u0001\u0000\u0000\u0000\u01e9?\u0001\u0000"+
		"\u0000\u0000\u01ea\u01ec\u0005\b\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ee\u0005C\u0000\u0000\u01ee\u01ef\u0005#\u0000\u0000\u01ef"+
		"\u01f0\u0005=\u0000\u0000\u01f0A\u0001\u0000\u0000\u0000\u01f1\u01f3\u0005"+
		"\u0007\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005"+
		"C\u0000\u0000\u01f5\u01f6\u0005#\u0000\u0000\u01f6\u01f7\u0005>\u0000"+
		"\u0000\u01f7C\u0001\u0000\u0000\u0000\u01f8\u01fa\u0005\u0006\u0000\u0000"+
		"\u01f9\u01f8\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005C\u0000\u0000\u01fc"+
		"\u01fd\u0005#\u0000\u0000\u01fd\u01fe\u00054\u0000\u0000\u01feE\u0001"+
		"\u0000\u0000\u0000\u01ff\u0200\u0005C\u0000\u0000\u0200\u0201\u0005#\u0000"+
		"\u0000\u0201\u0202\u0005C\u0000\u0000\u0202G\u0001\u0000\u0000\u0000\u0203"+
		"\u0207\u0005=\u0000\u0000\u0204\u0207\u0005>\u0000\u0000\u0205\u0207\u0005"+
		"4\u0000\u0000\u0206\u0203\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000"+
		"\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207I\u0001\u0000\u0000"+
		"\u0000\u0208\u020f\u0005%\u0000\u0000\u0209\u020f\u0005$\u0000\u0000\u020a"+
		"\u020f\u0005&\u0000\u0000\u020b\u020f\u0005)\u0000\u0000\u020c\u020f\u0005"+
		"\'\u0000\u0000\u020d\u020f\u0005(\u0000\u0000\u020e\u0208\u0001\u0000"+
		"\u0000\u0000\u020e\u0209\u0001\u0000\u0000\u0000\u020e\u020a\u0001\u0000"+
		"\u0000\u0000\u020e\u020b\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000"+
		"\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020fK\u0001\u0000\u0000"+
		"\u0000\u0210\u0216\u0001\u0000\u0000\u0000\u0211\u0216\u0005.\u0000\u0000"+
		"\u0212\u0216\u0005/\u0000\u0000\u0213\u0216\u00050\u0000\u0000\u0214\u0216"+
		"\u00051\u0000\u0000\u0215\u0210\u0001\u0000\u0000\u0000\u0215\u0211\u0001"+
		"\u0000\u0000\u0000\u0215\u0212\u0001\u0000\u0000\u0000\u0215\u0213\u0001"+
		"\u0000\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0216M\u0001\u0000"+
		"\u0000\u0000\u0217\u021d\u0001\u0000\u0000\u0000\u0218\u021d\u00055\u0000"+
		"\u0000\u0219\u021d\u00056\u0000\u0000\u021a\u021d\u00057\u0000\u0000\u021b"+
		"\u021d\u00058\u0000\u0000\u021c\u0217\u0001\u0000\u0000\u0000\u021c\u0218"+
		"\u0001\u0000\u0000\u0000\u021c\u0219\u0001\u0000\u0000\u0000\u021c\u021a"+
		"\u0001\u0000\u0000\u0000\u021c\u021b\u0001\u0000\u0000\u0000\u021dO\u0001"+
		"\u0000\u0000\u0000QU\\dinsu|\u0084\u0089\u008e\u0090\u0096\u0099\u009f"+
		"\u00a3\u00ad\u00b0\u00b8\u00bb\u00c0\u00c7\u00cc\u00da\u00df\u00e4\u00e6"+
		"\u00eb\u00f0\u00f5\u00fa\u00fc\u0101\u0106\u010b\u0110\u0115\u0117\u012c"+
		"\u0134\u014c\u0152\u0158\u015e\u0162\u0166\u016b\u016f\u0174\u0179\u017d"+
		"\u0182\u0187\u018c\u0191\u0196\u019b\u019d\u01a2\u01a7\u01ac\u01b0\u01b2"+
		"\u01b8\u01bd\u01c1\u01c3\u01cd\u01d2\u01d6\u01dc\u01e1\u01e5\u01e8\u01eb"+
		"\u01f2\u01f9\u0206\u020e\u0215\u021c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}