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
		START=1, FUNCTIONS=2, FUNC=3, BOOLEAN=4, NUMBER=5, TEXT=6, PRINT=7, LIST=8, 
		WHILE=9, REPEAT=10, REPEAT_UNTIL=11, IF=12, ELSE=13, ELSE_IF=14, THEN=15, 
		DO=16, TIMES=17, RETURN=18, ASK=19, RUN=20, ALWAYS=21, LPAREN=22, RPAREN=23, 
		LBRACE=24, RBRACE=25, LBRACK=26, RBRACK=27, SEMI=28, COMMA=29, DOT=30, 
		QUOTE=31, ASSIGN=32, GT=33, LT=34, EQUAL=35, LE=36, GE=37, NOTEQUAL=38, 
		AND=39, OR=40, INC=41, DEC=42, ADD=43, SUB=44, MUL=45, DIV=46, CARET=47, 
		MOD=48, BOOL_LITERAL=49, ADD_ASSIGN=50, SUB_ASSIGN=51, MUL_ASSIGN=52, 
		DIV_ASSIGN=53, AND_ASSIGN=54, OR_ASSIGN=55, XOR_ASSIGN=56, MOD_ASSIGN=57, 
		TEXT_VAL=58, NUMBER_VAL=59, WS=60, NEWLINE=61, COMMENT=62, LINE_COMMENT=63, 
		ID=64;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_startBlock = 2, RULE_startBody = 3, 
		RULE_functionsBlock = 4, RULE_funcBlockBody = 5, RULE_funcDec = 6, RULE_funcName = 7, 
		RULE_funcOutputParam = 8, RULE_funcInputParam = 9, RULE_funcCall = 10, 
		RULE_declaration = 11, RULE_initialization = 12, RULE_dataType = 13, RULE_funcBody = 14, 
		RULE_statement = 15, RULE_ifThenStatement = 16, RULE_ifThenElseStatement = 17, 
		RULE_repeatStatement = 18, RULE_repeatUntilStatement = 19, RULE_whileStatement = 20, 
		RULE_statementBody = 21, RULE_condition = 22, RULE_expression = 23, RULE_operation = 24, 
		RULE_returnExp = 25, RULE_printExp = 26, RULE_askExp = 27, RULE_mathExpr = 28, 
		RULE_value = 29, RULE_textInit = 30, RULE_numberInit = 31, RULE_booleanInit = 32, 
		RULE_var = 33, RULE_val = 34, RULE_conditionalOperation = 35, RULE_mathematicalOperation = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "startBlock", "startBody", "functionsBlock", "funcBlockBody", 
			"funcDec", "funcName", "funcOutputParam", "funcInputParam", "funcCall", 
			"declaration", "initialization", "dataType", "funcBody", "statement", 
			"ifThenStatement", "ifThenElseStatement", "repeatStatement", "repeatUntilStatement", 
			"whileStatement", "statementBody", "condition", "expression", "operation", 
			"returnExp", "printExp", "askExp", "mathExpr", "value", "textInit", "numberInit", 
			"booleanInit", "var", "val", "conditionalOperation", "mathematicalOperation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'functions'", "'function'", "'truthvalue'", "'number'", 
			"'text'", "'print'", "'list'", "'while'", "'repeat'", "'repeat until'", 
			"'if'", "'else'", "'else if'", "'then'", "'do'", "'times'", "'return'", 
			"'ask'", "'run'", "'always'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'\"'", "'='", "'>'", "'<'", null, null, null, null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", null, 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "FUNCTIONS", "FUNC", "BOOLEAN", "NUMBER", "TEXT", "PRINT", 
			"LIST", "WHILE", "REPEAT", "REPEAT_UNTIL", "IF", "ELSE", "ELSE_IF", "THEN", 
			"DO", "TIMES", "RETURN", "ASK", "RUN", "ALWAYS", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "QUOTE", 
			"ASSIGN", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
			"DEC", "ADD", "SUB", "MUL", "DIV", "CARET", "MOD", "BOOL_LITERAL", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "TEXT_VAL", "NUMBER_VAL", "WS", "NEWLINE", 
			"COMMENT", "LINE_COMMENT", "ID"
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
			setState(74);
			block();
			setState(75);
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
			setState(77);
			startBlock();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTIONS) {
				{
				setState(78);
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
		public TerminalNode LBRACE() { return getToken(TLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLParser.RBRACE, 0); }
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
			setState(81);
			match(START);
			setState(82);
			match(LBRACE);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 2377900603251852255L) != 0)) {
				{
				{
				setState(83);
				startBody();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(RBRACE);
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(91);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(94); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(96);
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(99); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(101);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(104); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(106);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(109); 
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
		public TerminalNode LBRACE() { return getToken(TLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLParser.RBRACE, 0); }
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
			setState(113);
			match(FUNCTIONS);
			setState(114);
			match(LBRACE);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 2305843009213693967L) != 0)) {
				{
				{
				setState(115);
				funcBlockBody();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(RBRACE);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(123);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(126); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(128);
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(131); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(133);
						funcDec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(136); 
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
		public TerminalNode FUNC() { return getToken(TLParser.FUNC, 0); }
		public TerminalNode LBRACE() { return getToken(TLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TLParser.RBRACE, 0); }
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public FuncOutputParamContext funcOutputParam() {
			return getRuleContext(FuncOutputParamContext.class,0);
		}
		public List<FuncBodyContext> funcBody() {
			return getRuleContexts(FuncBodyContext.class);
		}
		public FuncBodyContext funcBody(int i) {
			return getRuleContext(FuncBodyContext.class,i);
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
			setState(140);
			match(FUNC);
			setState(141);
			((FuncDecContext)_localctx).funcID = funcName();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(142);
				funcOutputParam();
				}
			}

			setState(145);
			match(LBRACE);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 2377900603251852255L) != 0)) {
				{
				{
				setState(146);
				funcBody();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(RBRACE);
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
		enterRule(_localctx, 14, RULE_funcName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
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
	public static class FuncOutputParamContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TLParser.RPAREN, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
		enterRule(_localctx, 16, RULE_funcOutputParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LPAREN);
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case NUMBER:
				case TEXT:
					{
					setState(157);
					declaration();
					}
					break;
				case ID:
					{
					setState(158);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & 1152921504606846983L) != 0)) {
					{
					{
					setState(163);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BOOLEAN:
					case NUMBER:
					case TEXT:
						{
						setState(161);
						declaration();
						}
						break;
					case ID:
						{
						setState(162);
						var();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(165);
					match(COMMA);
					setState(168);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BOOLEAN:
					case NUMBER:
					case TEXT:
						{
						setState(166);
						declaration();
						}
						break;
					case ID:
						{
						setState(167);
						var();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(177);
			match(RPAREN);
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
		public TerminalNode LPAREN() { return getToken(TLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TLParser.RPAREN, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
		enterRule(_localctx, 18, RULE_funcInputParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LPAREN);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(180);
				var();
				}
				break;
			case 2:
				{
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(181);
					var();
					setState(182);
					match(COMMA);
					setState(183);
					var();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(192);
			match(RPAREN);
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
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public TerminalNode RUN() { return getToken(TLParser.RUN, 0); }
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
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RUN) {
				{
				setState(194);
				match(RUN);
				}
			}

			setState(197);
			((FuncCallContext)_localctx).funcID = funcName();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(198);
				funcInputParam();
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
		public DataTypeContext dt;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((DeclarationContext)_localctx).dt = dataType();
			setState(202);
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
		enterRule(_localctx, 24, RULE_initialization);
		try {
			int _alt;
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(204);
						textInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(207); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(209);
						numberInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(212); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(214);
						booleanInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(217); 
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
	public static class DataTypeContext extends ParserRuleContext {
		public Token dtNumber;
		public Token dtText;
		public Token dtBoolean;
		public TerminalNode NUMBER() { return getToken(TLParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(TLParser.TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLParser.BOOLEAN, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataType);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				((DataTypeContext)_localctx).dtNumber = match(NUMBER);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				((DataTypeContext)_localctx).dtText = match(TEXT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				((DataTypeContext)_localctx).dtBoolean = match(BOOLEAN);
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
		enterRule(_localctx, 28, RULE_funcBody);
		try {
			int _alt;
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(226);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(229); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(231);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(234); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(236);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(239); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(241);
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(244); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 30, RULE_statement);
		try {
			int _alt;
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(248);
						ifThenStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(251); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(253);
						ifThenElseStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(256); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(258);
						repeatStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(261); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(263);
						repeatUntilStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(266); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(269); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(268);
						whileStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(271); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		public TerminalNode THEN() { return getToken(TLParser.THEN, 0); }
		public List<StatementBodyContext> statementBody() {
			return getRuleContexts(StatementBodyContext.class);
		}
		public StatementBodyContext statementBody(int i) {
			return getRuleContext(StatementBodyContext.class,i);
		}
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
		enterRule(_localctx, 32, RULE_ifThenStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(IF);
			setState(276);
			condition();
			setState(277);
			match(THEN);
			setState(279); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(278);
					statementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(281); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(TLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(TLParser.ELSE, 0); }
		public List<StatementBodyContext> statementBody() {
			return getRuleContexts(StatementBodyContext.class);
		}
		public StatementBodyContext statementBody(int i) {
			return getRuleContext(StatementBodyContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(TLParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(TLParser.ELSE_IF, i);
		}
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
		enterRule(_localctx, 34, RULE_ifThenElseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(IF);
			setState(284);
			condition();
			setState(285);
			match(THEN);
			setState(287); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(286);
					statementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(289); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(291);
				match(ELSE_IF);
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & 2377900603251851295L) != 0)) {
				{
				{
				setState(297);
				statementBody();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(ELSE);
			setState(304);
			statementBody();
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
		public TerminalNode NUMBER_VAL() { return getToken(TLParser.NUMBER_VAL, 0); }
		public TerminalNode TIMES() { return getToken(TLParser.TIMES, 0); }
		public List<StatementBodyContext> statementBody() {
			return getRuleContexts(StatementBodyContext.class);
		}
		public StatementBodyContext statementBody(int i) {
			return getRuleContext(StatementBodyContext.class,i);
		}
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
		enterRule(_localctx, 36, RULE_repeatStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(REPEAT);
			setState(307);
			match(NUMBER_VAL);
			setState(308);
			match(TIMES);
			setState(310); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(309);
					statementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(312); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public List<StatementBodyContext> statementBody() {
			return getRuleContexts(StatementBodyContext.class);
		}
		public StatementBodyContext statementBody(int i) {
			return getRuleContext(StatementBodyContext.class,i);
		}
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
		enterRule(_localctx, 38, RULE_repeatUntilStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(REPEAT_UNTIL);
			setState(315);
			condition();
			setState(317); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(316);
					statementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(319); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode DO() { return getToken(TLParser.DO, 0); }
		public List<StatementBodyContext> statementBody() {
			return getRuleContexts(StatementBodyContext.class);
		}
		public StatementBodyContext statementBody(int i) {
			return getRuleContext(StatementBodyContext.class,i);
		}
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
		enterRule(_localctx, 40, RULE_whileStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(WHILE);
			setState(322);
			condition();
			setState(323);
			match(DO);
			setState(325); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(324);
					statementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(327); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 42, RULE_statementBody);
		try {
			int _alt;
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case PRINT:
			case RETURN:
			case ASK:
			case RUN:
			case NUMBER_VAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(330); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(329);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(332); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case BOOLEAN:
			case NUMBER:
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(335); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(334);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(337); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public List<TerminalNode> AND() { return getTokens(TLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TLParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(TLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TLParser.OR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(341);
				var();
				}
				break;
			case BOOL_LITERAL:
			case TEXT_VAL:
			case NUMBER_VAL:
				{
				setState(342);
				val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(345);
			operation();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(350);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(346);
					match(AND);
					setState(347);
					operation();
					}
					break;
				case OR:
					{
					setState(348);
					match(OR);
					setState(349);
					operation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ExpressionContext extends ParserRuleContext {
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
		public List<ReturnExpContext> returnExp() {
			return getRuleContexts(ReturnExpContext.class);
		}
		public ReturnExpContext returnExp(int i) {
			return getRuleContext(ReturnExpContext.class,i);
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
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
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
		enterRule(_localctx, 46, RULE_expression);
		try {
			int _alt;
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(355);
						funcCall();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(358); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(360);
						funcDec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(363); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(365);
						returnExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(368); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(370);
						printExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(373); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(376); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(375);
						askExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(378); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(381); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(380);
						mathExpr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(383); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
	public static class OperationContext extends ParserRuleContext {
		public ConditionalOperationContext conditionalOperation() {
			return getRuleContext(ConditionalOperationContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(387);
			conditionalOperation();
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case TEXT_VAL:
			case NUMBER_VAL:
				{
				setState(388);
				val();
				}
				break;
			case ID:
				{
				setState(389);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ReturnExpContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(TLParser.RETURN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_returnExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(RETURN);
			setState(393);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintExpContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(TLParser.PRINT, 0); }
		public List<TerminalNode> TEXT_VAL() { return getTokens(TLParser.TEXT_VAL); }
		public TerminalNode TEXT_VAL(int i) {
			return getToken(TLParser.TEXT_VAL, i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> NUMBER_VAL() { return getTokens(TLParser.NUMBER_VAL); }
		public TerminalNode NUMBER_VAL(int i) {
			return getToken(TLParser.NUMBER_VAL, i);
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
		enterRule(_localctx, 52, RULE_printExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(PRINT);
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_VAL:
				{
				setState(396);
				match(TEXT_VAL);
				}
				break;
			case ID:
				{
				setState(397);
				var();
				}
				break;
			case NUMBER_VAL:
				{
				setState(398);
				match(NUMBER_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD) {
				{
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(401);
					match(ADD);
					setState(405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXT_VAL:
						{
						setState(402);
						match(TEXT_VAL);
						}
						break;
					case ID:
						{
						setState(403);
						var();
						}
						break;
					case NUMBER_VAL:
						{
						setState(404);
						match(NUMBER_VAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(409); 
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
		public VarContext askID;
		public TerminalNode ASK() { return getToken(TLParser.ASK, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> TEXT_VAL() { return getTokens(TLParser.TEXT_VAL); }
		public TerminalNode TEXT_VAL(int i) {
			return getToken(TLParser.TEXT_VAL, i);
		}
		public List<TerminalNode> NUMBER_VAL() { return getTokens(TLParser.NUMBER_VAL); }
		public TerminalNode NUMBER_VAL(int i) {
			return getToken(TLParser.NUMBER_VAL, i);
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
		enterRule(_localctx, 54, RULE_askExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(ASK);
			setState(414);
			((AskExpContext)_localctx).askID = var();
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_VAL:
				{
				setState(415);
				match(TEXT_VAL);
				}
				break;
			case ID:
				{
				setState(416);
				var();
				}
				break;
			case NUMBER_VAL:
				{
				setState(417);
				match(NUMBER_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD) {
				{
				setState(426); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(420);
					match(ADD);
					setState(424);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXT_VAL:
						{
						setState(421);
						match(TEXT_VAL);
						}
						break;
					case ID:
						{
						setState(422);
						var();
						}
						break;
					case NUMBER_VAL:
						{
						setState(423);
						match(NUMBER_VAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(428); 
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
	public static class MathExprContext extends ParserRuleContext {
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
	 
		public MathExprContext() { }
		public void copyFrom(MathExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathExpContext extends MathExprContext {
		public ValueContext left;
		public MathematicalOperationContext op;
		public ValueContext right;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<MathematicalOperationContext> mathematicalOperation() {
			return getRuleContexts(MathematicalOperationContext.class);
		}
		public MathematicalOperationContext mathematicalOperation(int i) {
			return getRuleContext(MathematicalOperationContext.class,i);
		}
		public MathExpContext(MathExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterMathExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitMathExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitMathExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mathExpr);
		int _la;
		try {
			int _alt;
			_localctx = new MathExpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			((MathExpContext)_localctx).left = value();
			setState(439); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(433);
				((MathExpContext)_localctx).op = mathematicalOperation();
				}
				setState(435); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(434);
						((MathExpContext)_localctx).right = value();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(437); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131945690300416L) != 0) );
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
	public static class ValueContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode NUMBER_VAL() { return getToken(TLParser.NUMBER_VAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_value);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				var();
				}
				break;
			case NUMBER_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(NUMBER_VAL);
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
	public static class TextInitContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode TEXT_VAL() { return getToken(TLParser.TEXT_VAL, 0); }
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
		enterRule(_localctx, 60, RULE_textInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT) {
				{
				setState(447);
				match(TEXT);
				}
			}

			setState(450);
			var();
			setState(451);
			match(ASSIGN);
			setState(452);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode NUMBER_VAL() { return getToken(TLParser.NUMBER_VAL, 0); }
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
		enterRule(_localctx, 62, RULE_numberInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(454);
				match(NUMBER);
				}
			}

			setState(457);
			var();
			setState(458);
			match(ASSIGN);
			setState(459);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(TLParser.BOOL_LITERAL, 0); }
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
		enterRule(_localctx, 64, RULE_booleanInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOLEAN) {
				{
				setState(461);
				match(BOOLEAN);
				}
			}

			setState(464);
			var();
			setState(465);
			match(ASSIGN);
			setState(466);
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
	public static class VarContext extends ParserRuleContext {
		public Token varID;
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			((VarContext)_localctx).varID = match(ID);
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
		enterRule(_localctx, 68, RULE_val);
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				((ValContext)_localctx).textVal = match(TEXT_VAL);
				}
				break;
			case NUMBER_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				((ValContext)_localctx).numberVal = match(NUMBER_VAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
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
		public Token conOp;
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
		enterRule(_localctx, 70, RULE_conditionalOperation);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				((ConditionalOperationContext)_localctx).conOp = match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				((ConditionalOperationContext)_localctx).conOp = match(GT);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				((ConditionalOperationContext)_localctx).conOp = match(EQUAL);
				}
				break;
			case NOTEQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(478);
				((ConditionalOperationContext)_localctx).conOp = match(NOTEQUAL);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 5);
				{
				setState(479);
				((ConditionalOperationContext)_localctx).conOp = match(LE);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 6);
				{
				setState(480);
				((ConditionalOperationContext)_localctx).conOp = match(GE);
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
	public static class MathematicalOperationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode ADD() { return getToken(TLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TLParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(TLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TLParser.DIV, 0); }
		public MathematicalOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathematicalOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterMathematicalOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitMathematicalOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitMathematicalOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathematicalOperationContext mathematicalOperation() throws RecognitionException {
		MathematicalOperationContext _localctx = new MathematicalOperationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mathematicalOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 131945690300416L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001@\u01e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001P\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002U\b\u0002\n\u0002\f\u0002X\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0004\u0003]\b\u0003\u000b\u0003\f\u0003^\u0001\u0003\u0004"+
		"\u0003b\b\u0003\u000b\u0003\f\u0003c\u0001\u0003\u0004\u0003g\b\u0003"+
		"\u000b\u0003\f\u0003h\u0001\u0003\u0004\u0003l\b\u0003\u000b\u0003\f\u0003"+
		"m\u0003\u0003p\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"u\b\u0004\n\u0004\f\u0004x\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0004\u0005}\b\u0005\u000b\u0005\f\u0005~\u0001\u0005\u0004\u0005\u0082"+
		"\b\u0005\u000b\u0005\f\u0005\u0083\u0001\u0005\u0004\u0005\u0087\b\u0005"+
		"\u000b\u0005\f\u0005\u0088\u0003\u0005\u008b\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0090\b\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0094\b\u0006\n\u0006\f\u0006\u0097\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00a0\b\b\u0001"+
		"\b\u0001\b\u0003\b\u00a4\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a9\b\b"+
		"\u0005\b\u00ab\b\b\n\b\f\b\u00ae\t\b\u0003\b\u00b0\b\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ba\b\t\n\t"+
		"\f\t\u00bd\t\t\u0003\t\u00bf\b\t\u0001\t\u0001\t\u0001\n\u0003\n\u00c4"+
		"\b\n\u0001\n\u0001\n\u0003\n\u00c8\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0004\f\u00ce\b\f\u000b\f\f\f\u00cf\u0001\f\u0004\f\u00d3\b\f"+
		"\u000b\f\f\f\u00d4\u0001\f\u0004\f\u00d8\b\f\u000b\f\f\f\u00d9\u0003\f"+
		"\u00dc\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00e1\b\r\u0001\u000e\u0004"+
		"\u000e\u00e4\b\u000e\u000b\u000e\f\u000e\u00e5\u0001\u000e\u0004\u000e"+
		"\u00e9\b\u000e\u000b\u000e\f\u000e\u00ea\u0001\u000e\u0004\u000e\u00ee"+
		"\b\u000e\u000b\u000e\f\u000e\u00ef\u0001\u000e\u0004\u000e\u00f3\b\u000e"+
		"\u000b\u000e\f\u000e\u00f4\u0003\u000e\u00f7\b\u000e\u0001\u000f\u0004"+
		"\u000f\u00fa\b\u000f\u000b\u000f\f\u000f\u00fb\u0001\u000f\u0004\u000f"+
		"\u00ff\b\u000f\u000b\u000f\f\u000f\u0100\u0001\u000f\u0004\u000f\u0104"+
		"\b\u000f\u000b\u000f\f\u000f\u0105\u0001\u000f\u0004\u000f\u0109\b\u000f"+
		"\u000b\u000f\f\u000f\u010a\u0001\u000f\u0004\u000f\u010e\b\u000f\u000b"+
		"\u000f\f\u000f\u010f\u0003\u000f\u0112\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u0118\b\u0010\u000b\u0010\f\u0010"+
		"\u0119\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u0120"+
		"\b\u0011\u000b\u0011\f\u0011\u0121\u0001\u0011\u0005\u0011\u0125\b\u0011"+
		"\n\u0011\f\u0011\u0128\t\u0011\u0001\u0011\u0005\u0011\u012b\b\u0011\n"+
		"\u0011\f\u0011\u012e\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u0137\b\u0012\u000b"+
		"\u0012\f\u0012\u0138\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013\u013e"+
		"\b\u0013\u000b\u0013\f\u0013\u013f\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0004\u0014\u0146\b\u0014\u000b\u0014\f\u0014\u0147\u0001"+
		"\u0015\u0004\u0015\u014b\b\u0015\u000b\u0015\f\u0015\u014c\u0001\u0015"+
		"\u0004\u0015\u0150\b\u0015\u000b\u0015\f\u0015\u0151\u0003\u0015\u0154"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0158\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u015f\b\u0016"+
		"\n\u0016\f\u0016\u0162\t\u0016\u0001\u0017\u0004\u0017\u0165\b\u0017\u000b"+
		"\u0017\f\u0017\u0166\u0001\u0017\u0004\u0017\u016a\b\u0017\u000b\u0017"+
		"\f\u0017\u016b\u0001\u0017\u0004\u0017\u016f\b\u0017\u000b\u0017\f\u0017"+
		"\u0170\u0001\u0017\u0004\u0017\u0174\b\u0017\u000b\u0017\f\u0017\u0175"+
		"\u0001\u0017\u0004\u0017\u0179\b\u0017\u000b\u0017\f\u0017\u017a\u0001"+
		"\u0017\u0004\u0017\u017e\b\u0017\u000b\u0017\f\u0017\u017f\u0003\u0017"+
		"\u0182\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0187\b"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0190\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0196\b\u001a\u0004\u001a\u0198\b\u001a"+
		"\u000b\u001a\f\u001a\u0199\u0003\u001a\u019c\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a3\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a9\b\u001b\u0004"+
		"\u001b\u01ab\b\u001b\u000b\u001b\f\u001b\u01ac\u0003\u001b\u01af\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0004\u001c\u01b4\b\u001c\u000b\u001c"+
		"\f\u001c\u01b5\u0004\u001c\u01b8\b\u001c\u000b\u001c\f\u001c\u01b9\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01be\b\u001d\u0001\u001e\u0003\u001e\u01c1"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0003"+
		"\u001f\u01c8\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0003 \u01cf\b \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01da\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u01e2\b#\u0001$\u0001$\u0001$\u0000\u0000%\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFH\u0000\u0001\u0002\u0000  +.\u0223\u0000J\u0001\u0000"+
		"\u0000\u0000\u0002M\u0001\u0000\u0000\u0000\u0004Q\u0001\u0000\u0000\u0000"+
		"\u0006o\u0001\u0000\u0000\u0000\bq\u0001\u0000\u0000\u0000\n\u008a\u0001"+
		"\u0000\u0000\u0000\f\u008c\u0001\u0000\u0000\u0000\u000e\u009a\u0001\u0000"+
		"\u0000\u0000\u0010\u009c\u0001\u0000\u0000\u0000\u0012\u00b3\u0001\u0000"+
		"\u0000\u0000\u0014\u00c3\u0001\u0000\u0000\u0000\u0016\u00c9\u0001\u0000"+
		"\u0000\u0000\u0018\u00db\u0001\u0000\u0000\u0000\u001a\u00e0\u0001\u0000"+
		"\u0000\u0000\u001c\u00f6\u0001\u0000\u0000\u0000\u001e\u0111\u0001\u0000"+
		"\u0000\u0000 \u0113\u0001\u0000\u0000\u0000\"\u011b\u0001\u0000\u0000"+
		"\u0000$\u0132\u0001\u0000\u0000\u0000&\u013a\u0001\u0000\u0000\u0000("+
		"\u0141\u0001\u0000\u0000\u0000*\u0153\u0001\u0000\u0000\u0000,\u0157\u0001"+
		"\u0000\u0000\u0000.\u0181\u0001\u0000\u0000\u00000\u0183\u0001\u0000\u0000"+
		"\u00002\u0188\u0001\u0000\u0000\u00004\u018b\u0001\u0000\u0000\u00006"+
		"\u019d\u0001\u0000\u0000\u00008\u01b0\u0001\u0000\u0000\u0000:\u01bd\u0001"+
		"\u0000\u0000\u0000<\u01c0\u0001\u0000\u0000\u0000>\u01c7\u0001\u0000\u0000"+
		"\u0000@\u01ce\u0001\u0000\u0000\u0000B\u01d4\u0001\u0000\u0000\u0000D"+
		"\u01d9\u0001\u0000\u0000\u0000F\u01e1\u0001\u0000\u0000\u0000H\u01e3\u0001"+
		"\u0000\u0000\u0000JK\u0003\u0002\u0001\u0000KL\u0005\u0000\u0000\u0001"+
		"L\u0001\u0001\u0000\u0000\u0000MO\u0003\u0004\u0002\u0000NP\u0003\b\u0004"+
		"\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0003\u0001"+
		"\u0000\u0000\u0000QR\u0005\u0001\u0000\u0000RV\u0005\u0018\u0000\u0000"+
		"SU\u0003\u0006\u0003\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0019\u0000\u0000Z\u0005"+
		"\u0001\u0000\u0000\u0000[]\u0003\u0016\u000b\u0000\\[\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_p\u0001\u0000\u0000\u0000`b\u0003\u0018\f\u0000a`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000dp\u0001\u0000\u0000\u0000eg\u0003.\u0017\u0000fe\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ip\u0001\u0000\u0000\u0000jl\u0003\u001e\u000f"+
		"\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000o\\\u0001"+
		"\u0000\u0000\u0000oa\u0001\u0000\u0000\u0000of\u0001\u0000\u0000\u0000"+
		"ok\u0001\u0000\u0000\u0000p\u0007\u0001\u0000\u0000\u0000qr\u0005\u0002"+
		"\u0000\u0000rv\u0005\u0018\u0000\u0000su\u0003\n\u0005\u0000ts\u0001\u0000"+
		"\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"yz\u0005\u0019\u0000\u0000z\t\u0001\u0000\u0000\u0000{}\u0003\u0016\u000b"+
		"\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u008b\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0003\u0018\f\u0000\u0081\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u008b\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0003\f\u0006\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a"+
		"|\u0001\u0000\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008a\u0086"+
		"\u0001\u0000\u0000\u0000\u008b\u000b\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u0003\u0000\u0000\u008d\u008f\u0003\u000e\u0007\u0000\u008e\u0090"+
		"\u0003\u0010\b\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0095\u0005"+
		"\u0018\u0000\u0000\u0092\u0094\u0003\u001c\u000e\u0000\u0093\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"\u0019\u0000\u0000\u0099\r\u0001\u0000\u0000\u0000\u009a\u009b\u0005@"+
		"\u0000\u0000\u009b\u000f\u0001\u0000\u0000\u0000\u009c\u00af\u0005\u0016"+
		"\u0000\u0000\u009d\u00a0\u0003\u0016\u000b\u0000\u009e\u00a0\u0003B!\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00b0\u0001\u0000\u0000\u0000\u00a1\u00a4\u0003\u0016\u000b\u0000"+
		"\u00a2\u00a4\u0003B!\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0005\u001d\u0000\u0000\u00a6\u00a9\u0003\u0016\u000b\u0000\u00a7\u00a9"+
		"\u0003B!\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a3\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u009f\u0001\u0000"+
		"\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\u0017\u0000\u0000\u00b2\u0011\u0001\u0000"+
		"\u0000\u0000\u00b3\u00be\u0005\u0016\u0000\u0000\u00b4\u00bf\u0003B!\u0000"+
		"\u00b5\u00b6\u0003B!\u0000\u00b6\u00b7\u0005\u001d\u0000\u0000\u00b7\u00b8"+
		"\u0003B!\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b5\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00b4\u0001\u0000"+
		"\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\u0017\u0000\u0000\u00c1\u0013\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c4\u0005\u0014\u0000\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c7\u0003\u000e\u0007\u0000\u00c6\u00c8\u0003\u0012"+
		"\t\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u0015\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003\u001a\r\u0000"+
		"\u00ca\u00cb\u0003B!\u0000\u00cb\u0017\u0001\u0000\u0000\u0000\u00cc\u00ce"+
		"\u0003<\u001e\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00dc\u0001\u0000\u0000\u0000\u00d1\u00d3\u0003"+
		">\u001f\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u00dc\u0001\u0000\u0000\u0000\u00d6\u00d8\u0003@ \u0000"+
		"\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00cd\u0001\u0000\u0000\u0000"+
		"\u00db\u00d2\u0001\u0000\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000"+
		"\u00dc\u0019\u0001\u0000\u0000\u0000\u00dd\u00e1\u0005\u0005\u0000\u0000"+
		"\u00de\u00e1\u0005\u0006\u0000\u0000\u00df\u00e1\u0005\u0004\u0000\u0000"+
		"\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u001b\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e4\u0003\u001e\u000f\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e9\u0003.\u0017\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00f7\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ee\u0003\u0016\u000b\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f7\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f3\u0003\u0018\f\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6\u00e3"+
		"\u0001\u0000\u0000\u0000\u00f6\u00e8\u0001\u0000\u0000\u0000\u00f6\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f7\u001d"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003 \u0010\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u0112\u0001"+
		"\u0000\u0000\u0000\u00fd\u00ff\u0003\"\u0011\u0000\u00fe\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0112\u0001\u0000"+
		"\u0000\u0000\u0102\u0104\u0003$\u0012\u0000\u0103\u0102\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0112\u0001\u0000\u0000"+
		"\u0000\u0107\u0109\u0003&\u0013\u0000\u0108\u0107\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0112\u0001\u0000\u0000\u0000"+
		"\u010c\u010e\u0003(\u0014\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111"+
		"\u00f9\u0001\u0000\u0000\u0000\u0111\u00fe\u0001\u0000\u0000\u0000\u0111"+
		"\u0103\u0001\u0000\u0000\u0000\u0111\u0108\u0001\u0000\u0000\u0000\u0111"+
		"\u010d\u0001\u0000\u0000\u0000\u0112\u001f\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0005\f\u0000\u0000\u0114\u0115\u0003,\u0016\u0000\u0115\u0117"+
		"\u0005\u000f\u0000\u0000\u0116\u0118\u0003*\u0015\u0000\u0117\u0116\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a!\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0005\f\u0000\u0000\u011c\u011d\u0003,\u0016"+
		"\u0000\u011d\u011f\u0005\u000f\u0000\u0000\u011e\u0120\u0003*\u0015\u0000"+
		"\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000"+
		"\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000"+
		"\u0122\u0126\u0001\u0000\u0000\u0000\u0123\u0125\u0005\u000e\u0000\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u0127\u012c\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000"+
		"\u0129\u012b\u0003*\u0015\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b"+
		"\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e"+
		"\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0005\r\u0000\u0000\u0130\u0131"+
		"\u0003*\u0015\u0000\u0131#\u0001\u0000\u0000\u0000\u0132\u0133\u0005\n"+
		"\u0000\u0000\u0133\u0134\u0005;\u0000\u0000\u0134\u0136\u0005\u0011\u0000"+
		"\u0000\u0135\u0137\u0003*\u0015\u0000\u0136\u0135\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0001\u0000\u0000\u0000\u0139%\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0005\u000b\u0000\u0000\u013b\u013d\u0003,\u0016\u0000\u013c\u013e"+
		"\u0003*\u0015\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\'\u0001\u0000\u0000\u0000\u0141\u0142\u0005\t"+
		"\u0000\u0000\u0142\u0143\u0003,\u0016\u0000\u0143\u0145\u0005\u0010\u0000"+
		"\u0000\u0144\u0146\u0003*\u0015\u0000\u0145\u0144\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0001\u0000\u0000\u0000\u0148)\u0001\u0000\u0000\u0000\u0149"+
		"\u014b\u0003.\u0017\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0001\u0000\u0000\u0000\u014d\u0154\u0001\u0000\u0000\u0000\u014e\u0150"+
		"\u0003\u0016\u000b\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000\u0153\u014a"+
		"\u0001\u0000\u0000\u0000\u0153\u014f\u0001\u0000\u0000\u0000\u0154+\u0001"+
		"\u0000\u0000\u0000\u0155\u0158\u0003B!\u0000\u0156\u0158\u0003D\"\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u0160\u00030\u0018\u0000\u015a"+
		"\u015b\u0005\'\u0000\u0000\u015b\u015f\u00030\u0018\u0000\u015c\u015d"+
		"\u0005(\u0000\u0000\u015d\u015f\u00030\u0018\u0000\u015e\u015a\u0001\u0000"+
		"\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0162\u0001\u0000"+
		"\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000"+
		"\u0000\u0000\u0161-\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000"+
		"\u0000\u0163\u0165\u0003\u0014\n\u0000\u0164\u0163\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0182\u0001\u0000\u0000\u0000"+
		"\u0168\u016a\u0003\f\u0006\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u0182\u0001\u0000\u0000\u0000\u016d"+
		"\u016f\u00032\u0019\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0001\u0000\u0000\u0000\u0171\u0182\u0001\u0000\u0000\u0000\u0172\u0174"+
		"\u00034\u001a\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001"+
		"\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001"+
		"\u0000\u0000\u0000\u0176\u0182\u0001\u0000\u0000\u0000\u0177\u0179\u0003"+
		"6\u001b\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000"+
		"\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000"+
		"\u0000\u0000\u017b\u0182\u0001\u0000\u0000\u0000\u017c\u017e\u00038\u001c"+
		"\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181\u0164\u0001\u0000\u0000"+
		"\u0000\u0181\u0169\u0001\u0000\u0000\u0000\u0181\u016e\u0001\u0000\u0000"+
		"\u0000\u0181\u0173\u0001\u0000\u0000\u0000\u0181\u0178\u0001\u0000\u0000"+
		"\u0000\u0181\u017d\u0001\u0000\u0000\u0000\u0182/\u0001\u0000\u0000\u0000"+
		"\u0183\u0186\u0003F#\u0000\u0184\u0187\u0003D\"\u0000\u0185\u0187\u0003"+
		"B!\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000\u0000"+
		"\u0000\u01871\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u0012\u0000\u0000"+
		"\u0189\u018a\u0003B!\u0000\u018a3\u0001\u0000\u0000\u0000\u018b\u018f"+
		"\u0005\u0007\u0000\u0000\u018c\u0190\u0005:\u0000\u0000\u018d\u0190\u0003"+
		"B!\u0000\u018e\u0190\u0005;\u0000\u0000\u018f\u018c\u0001\u0000\u0000"+
		"\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u018e\u0001\u0000\u0000"+
		"\u0000\u0190\u019b\u0001\u0000\u0000\u0000\u0191\u0195\u0005+\u0000\u0000"+
		"\u0192\u0196\u0005:\u0000\u0000\u0193\u0196\u0003B!\u0000\u0194\u0196"+
		"\u0005;\u0000\u0000\u0195\u0192\u0001\u0000\u0000\u0000\u0195\u0193\u0001"+
		"\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0198\u0001"+
		"\u0000\u0000\u0000\u0197\u0191\u0001\u0000\u0000\u0000\u0198\u0199\u0001"+
		"\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u019a\u0001"+
		"\u0000\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0197\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c5\u0001\u0000"+
		"\u0000\u0000\u019d\u019e\u0005\u0013\u0000\u0000\u019e\u01a2\u0003B!\u0000"+
		"\u019f\u01a3\u0005:\u0000\u0000\u01a0\u01a3\u0003B!\u0000\u01a1\u01a3"+
		"\u0005;\u0000\u0000\u01a2\u019f\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01ae\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a8\u0005+\u0000\u0000\u01a5\u01a9\u0005:\u0000"+
		"\u0000\u01a6\u01a9\u0003B!\u0000\u01a7\u01a9\u0005;\u0000\u0000\u01a8"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a4\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad"+
		"\u01af\u0001\u0000\u0000\u0000\u01ae\u01aa\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0001\u0000\u0000\u0000\u01af7\u0001\u0000\u0000\u0000\u01b0\u01b7"+
		"\u0003:\u001d\u0000\u01b1\u01b3\u0003H$\u0000\u01b2\u01b4\u0003:\u001d"+
		"\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba9\u0001\u0000\u0000\u0000"+
		"\u01bb\u01be\u0003B!\u0000\u01bc\u01be\u0005;\u0000\u0000\u01bd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be;\u0001"+
		"\u0000\u0000\u0000\u01bf\u01c1\u0005\u0006\u0000\u0000\u01c0\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0003B!\u0000\u01c3\u01c4\u0005 \u0000"+
		"\u0000\u01c4\u01c5\u0005:\u0000\u0000\u01c5=\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c8\u0005\u0005\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9"+
		"\u01ca\u0003B!\u0000\u01ca\u01cb\u0005 \u0000\u0000\u01cb\u01cc\u0005"+
		";\u0000\u0000\u01cc?\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005\u0004\u0000"+
		"\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0003B!\u0000\u01d1"+
		"\u01d2\u0005 \u0000\u0000\u01d2\u01d3\u00051\u0000\u0000\u01d3A\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0005@\u0000\u0000\u01d5C\u0001\u0000\u0000"+
		"\u0000\u01d6\u01da\u0005:\u0000\u0000\u01d7\u01da\u0005;\u0000\u0000\u01d8"+
		"\u01da\u00051\u0000\u0000\u01d9\u01d6\u0001\u0000\u0000\u0000\u01d9\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01daE\u0001"+
		"\u0000\u0000\u0000\u01db\u01e2\u0005\"\u0000\u0000\u01dc\u01e2\u0005!"+
		"\u0000\u0000\u01dd\u01e2\u0005#\u0000\u0000\u01de\u01e2\u0005&\u0000\u0000"+
		"\u01df\u01e2\u0005$\u0000\u0000\u01e0\u01e2\u0005%\u0000\u0000\u01e1\u01db"+
		"\u0001\u0000\u0000\u0000\u01e1\u01dc\u0001\u0000\u0000\u0000\u01e1\u01dd"+
		"\u0001\u0000\u0000\u0000\u01e1\u01de\u0001\u0000\u0000\u0000\u01e1\u01df"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2G\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0007\u0000\u0000\u0000\u01e4I\u0001\u0000"+
		"\u0000\u0000LOV^chmov~\u0083\u0088\u008a\u008f\u0095\u009f\u00a3\u00a8"+
		"\u00ac\u00af\u00bb\u00be\u00c3\u00c7\u00cf\u00d4\u00d9\u00db\u00e0\u00e5"+
		"\u00ea\u00ef\u00f4\u00f6\u00fb\u0100\u0105\u010a\u010f\u0111\u0119\u0121"+
		"\u0126\u012c\u0138\u013f\u0147\u014c\u0151\u0153\u0157\u015e\u0160\u0166"+
		"\u016b\u0170\u0175\u017a\u017f\u0181\u0186\u018f\u0195\u0199\u019b\u01a2"+
		"\u01a8\u01ac\u01ae\u01b5\u01b9\u01bd\u01c0\u01c7\u01ce\u01d9\u01e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}