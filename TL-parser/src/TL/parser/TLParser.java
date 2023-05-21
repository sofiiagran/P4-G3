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
		LIST=9, COLLECTION=10, PRINT=11, WHILE=12, REPEAT=13, REPEAT_UNTIL=14, 
		IF=15, ELSE=16, ELSE_IF=17, THEN=18, DO=19, TIMES=20, RETURN=21, ASK=22, 
		ANSWER=23, RUN=24, GET=25, NOT=26, LPAREN=27, RPAREN=28, LBRACE=29, RBRACE=30, 
		LBRACK=31, RBRACK=32, SEMI=33, COMMA=34, DOT=35, QUOTE=36, ASSIGN=37, 
		GT=38, LT=39, EQUAL=40, LE=41, GE=42, NOTEQUAL=43, AND=44, OR=45, INC=46, 
		DEC=47, ADD=48, SUB=49, MUL=50, DIV=51, CARET=52, MOD=53, BOOL_LITERAL=54, 
		ADD_ASSIGN=55, SUB_ASSIGN=56, MUL_ASSIGN=57, DIV_ASSIGN=58, TEXT_VAL=59, 
		NUMBER_VAL_INT=60, NUMBER_VAL_DOUBLE=61, WS=62, NEWLINE=63, COMMENT=64, 
		LINE_COMMENT=65, COLLECTION_ID=66, ID=67;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_startBlock = 2, RULE_startBody = 3, 
		RULE_functionsBlock = 4, RULE_funcDec = 5, RULE_funcOutputParam = 6, RULE_funcInputParam = 7, 
		RULE_funcName = 8, RULE_funcCall = 9, RULE_declaration = 10, RULE_numberDecl = 11, 
		RULE_textDecl = 12, RULE_boolDecl = 13, RULE_numberListDecl = 14, RULE_numberListInit = 15, 
		RULE_textListDecl = 16, RULE_textListInit = 17, RULE_initialization = 18, 
		RULE_funcBody = 19, RULE_statement = 20, RULE_ifThenStatement = 21, RULE_ifThenElseStatement = 22, 
		RULE_repeatStatement = 23, RULE_repeatUntilStatement = 24, RULE_whileStatement = 25, 
		RULE_statementBody = 26, RULE_condition = 27, RULE_expression = 28, RULE_returnExp = 29, 
		RULE_printExp = 30, RULE_askExp = 31, RULE_mathExp = 32, RULE_textInit = 33, 
		RULE_numberInit = 34, RULE_booleanInit = 35, RULE_val = 36, RULE_numberValue = 37, 
		RULE_collectionDecl = 38, RULE_collectionInstanceDecl = 39, RULE_collectionInit = 40, 
		RULE_increment = 41, RULE_decrement = 42, RULE_assignment = 43, RULE_var = 44, 
		RULE_conditionalOperation = 45, RULE_mathematicalOperation1 = 46, RULE_mathematicalOperation2 = 47, 
		RULE_dotVariable = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "startBlock", "startBody", "functionsBlock", "funcDec", 
			"funcOutputParam", "funcInputParam", "funcName", "funcCall", "declaration", 
			"numberDecl", "textDecl", "boolDecl", "numberListDecl", "numberListInit", 
			"textListDecl", "textListInit", "initialization", "funcBody", "statement", 
			"ifThenStatement", "ifThenElseStatement", "repeatStatement", "repeatUntilStatement", 
			"whileStatement", "statementBody", "condition", "expression", "returnExp", 
			"printExp", "askExp", "mathExp", "textInit", "numberInit", "booleanInit", 
			"val", "numberValue", "collectionDecl", "collectionInstanceDecl", "collectionInit", 
			"increment", "decrement", "assignment", "var", "conditionalOperation", 
			"mathematicalOperation1", "mathematicalOperation2", "dotVariable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'functions'", "'function'", "'begin'", "'end'", "'truthvalue'", 
			"'number'", "'text'", "'list'", "'Collection'", "'print'", "'while'", 
			"'repeat'", "'repeat until'", "'if'", "'else'", "'else if'", "'then'", 
			"'do'", "'times'", "'return'", "'ask'", "'answer'", "'run'", "'get'", 
			"'not'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
			"'\"'", "'='", "'>'", "'<'", null, null, null, null, null, null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", null, "'+='", "'-='", 
			"'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "FUNCTIONS", "FUNC", "BEGIN", "END", "BOOLEAN", "NUMBER", 
			"TEXT", "LIST", "COLLECTION", "PRINT", "WHILE", "REPEAT", "REPEAT_UNTIL", 
			"IF", "ELSE", "ELSE_IF", "THEN", "DO", "TIMES", "RETURN", "ASK", "ANSWER", 
			"RUN", "GET", "NOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "SEMI", "COMMA", "DOT", "QUOTE", "ASSIGN", "GT", "LT", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "CARET", "MOD", "BOOL_LITERAL", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
			"DIV_ASSIGN", "TEXT_VAL", "NUMBER_VAL_INT", "NUMBER_VAL_DOUBLE", "WS", 
			"NEWLINE", "COMMENT", "LINE_COMMENT", "COLLECTION_ID", "ID"
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
			setState(98);
			block();
			setState(99);
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
			setState(101);
			startBlock();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTIONS) {
				{
				setState(102);
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
			setState(105);
			match(START);
			setState(106);
			match(BEGIN);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21036488L) != 0) || _la==COLLECTION_ID || _la==ID) {
				{
				{
				setState(107);
				startBody();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(115);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(118); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(120);
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(123); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(125);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(128); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(130);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(133); 
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(FUNCTIONS);
			setState(138);
			match(BEGIN);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					declaration();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 3458764513820540935L) != 0)) {
				{
				{
				setState(145);
				initialization();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				funcDec();
				}
				}
				setState(154); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC );
			setState(156);
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
		enterRule(_localctx, 10, RULE_funcDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(FUNC);
			setState(159);
			((FuncDecContext)_localctx).funcID = funcName();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(160);
				match(LPAREN);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 1152921504606846999L) != 0)) {
					{
					setState(161);
					((FuncDecContext)_localctx).param = funcOutputParam();
					}
				}

				setState(164);
				match(RPAREN);
				}
			}

			setState(167);
			match(BEGIN);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21036488L) != 0) || _la==COLLECTION_ID || _la==ID) {
				{
				{
				setState(168);
				funcBody();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(174);
				returnExp();
				}
			}

			setState(177);
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
		enterRule(_localctx, 12, RULE_funcOutputParam);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(180);
				declaration();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(181);
					match(COMMA);
					{
					setState(182);
					declaration();
					}
					}
					}
					setState(187);
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
		enterRule(_localctx, 14, RULE_funcInputParam);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(191);
				var();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(192);
					match(COMMA);
					setState(193);
					var();
					}
					}
					setState(198);
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
		enterRule(_localctx, 16, RULE_funcName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		enterRule(_localctx, 18, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RUN) {
				{
				setState(203);
				match(RUN);
				}
			}

			setState(206);
			((FuncCallContext)_localctx).funcID = funcName();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(207);
				match(LPAREN);
				setState(208);
				((FuncCallContext)_localctx).param = funcInputParam();
				setState(209);
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
		public NumberListDeclContext numberListDecl() {
			return getRuleContext(NumberListDeclContext.class,0);
		}
		public TextListDeclContext textListDecl() {
			return getRuleContext(TextListDeclContext.class,0);
		}
		public CollectionDeclContext collectionDecl() {
			return getRuleContext(CollectionDeclContext.class,0);
		}
		public CollectionInstanceDeclContext collectionInstanceDecl() {
			return getRuleContext(CollectionInstanceDeclContext.class,0);
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
		enterRule(_localctx, 20, RULE_declaration);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				((DeclarationContext)_localctx).numberDec = numberDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((DeclarationContext)_localctx).textDec = textDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				((DeclarationContext)_localctx).boolDec = boolDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				numberListDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				textListDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				collectionDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(219);
				collectionInstanceDecl();
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
		enterRule(_localctx, 22, RULE_numberDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(NUMBER);
			setState(223);
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
		enterRule(_localctx, 24, RULE_textDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(TEXT);
			setState(226);
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
		enterRule(_localctx, 26, RULE_boolDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(BOOLEAN);
			setState(229);
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
	public static class NumberListDeclContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TLParser.NUMBER, 0); }
		public TerminalNode LIST() { return getToken(TLParser.LIST, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public NumberListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberListDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterNumberListDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitNumberListDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitNumberListDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberListDeclContext numberListDecl() throws RecognitionException {
		NumberListDeclContext _localctx = new NumberListDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numberListDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(NUMBER);
			setState(232);
			match(LIST);
			setState(233);
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
	public static class NumberListInitContext extends ParserRuleContext {
		public Token assignID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<NumberValueContext> numberValue() {
			return getRuleContexts(NumberValueContext.class);
		}
		public NumberValueContext numberValue(int i) {
			return getRuleContext(NumberValueContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(TLParser.NUMBER, 0); }
		public TerminalNode LIST() { return getToken(TLParser.LIST, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLParser.COMMA, i);
		}
		public NumberListInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberListInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterNumberListInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitNumberListInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitNumberListInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberListInitContext numberListInit() throws RecognitionException {
		NumberListInitContext _localctx = new NumberListInitContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numberListInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(235);
				match(NUMBER);
				setState(236);
				match(LIST);
				}
			}

			setState(239);
			((NumberListInitContext)_localctx).assignID = match(ID);
			setState(240);
			match(ASSIGN);
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_VAL_INT:
			case NUMBER_VAL_DOUBLE:
				{
				setState(241);
				numberValue();
				}
				break;
			case ID:
				{
				setState(242);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(248);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER_VAL_INT:
				case NUMBER_VAL_DOUBLE:
					{
					setState(246);
					numberValue();
					}
					break;
				case ID:
					{
					setState(247);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(254);
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
	public static class TextListDeclContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TLParser.TEXT, 0); }
		public TerminalNode LIST() { return getToken(TLParser.LIST, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TextListDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textListDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterTextListDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitTextListDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitTextListDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextListDeclContext textListDecl() throws RecognitionException {
		TextListDeclContext _localctx = new TextListDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_textListDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(TEXT);
			setState(256);
			match(LIST);
			setState(257);
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
	public static class TextListInitContext extends ParserRuleContext {
		public Token assignID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<TerminalNode> TEXT_VAL() { return getTokens(TLParser.TEXT_VAL); }
		public TerminalNode TEXT_VAL(int i) {
			return getToken(TLParser.TEXT_VAL, i);
		}
		public TerminalNode TEXT() { return getToken(TLParser.TEXT, 0); }
		public TerminalNode LIST() { return getToken(TLParser.LIST, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLParser.COMMA, i);
		}
		public TextListInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textListInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterTextListInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitTextListInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitTextListInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextListInitContext textListInit() throws RecognitionException {
		TextListInitContext _localctx = new TextListInitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_textListInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT) {
				{
				setState(259);
				match(TEXT);
				setState(260);
				match(LIST);
				}
			}

			setState(263);
			((TextListInitContext)_localctx).assignID = match(ID);
			setState(264);
			match(ASSIGN);
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==TEXT_VAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==TEXT_VAL || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(272);
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
		public List<NumberListInitContext> numberListInit() {
			return getRuleContexts(NumberListInitContext.class);
		}
		public NumberListInitContext numberListInit(int i) {
			return getRuleContext(NumberListInitContext.class,i);
		}
		public List<TextListInitContext> textListInit() {
			return getRuleContexts(TextListInitContext.class);
		}
		public TextListInitContext textListInit(int i) {
			return getRuleContext(TextListInitContext.class,i);
		}
		public List<CollectionInitContext> collectionInit() {
			return getRuleContexts(CollectionInitContext.class);
		}
		public CollectionInitContext collectionInit(int i) {
			return getRuleContext(CollectionInitContext.class,i);
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
		enterRule(_localctx, 36, RULE_initialization);
		try {
			int _alt;
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(273);
						textInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(276); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(278);
						numberInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(281); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(283);
						booleanInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(286); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(288);
						numberListInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(291); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(294); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(293);
						textListInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(296); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(299); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(298);
						collectionInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(301); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 38, RULE_funcBody);
		try {
			int _alt;
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(305);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(308); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(310);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(313); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(315);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(318); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(320);
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(323); 
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
		enterRule(_localctx, 40, RULE_statement);
		try {
			int _alt;
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(327);
						ifThenStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(330); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(332);
						ifThenElseStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(335); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(337);
						repeatStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(340); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(343); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(342);
						repeatUntilStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(345); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(348); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(347);
						whileStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(350); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
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
		enterRule(_localctx, 42, RULE_ifThenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(IF);
			setState(355);
			condition();
			setState(356);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(358); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(357);
				statementBody();
				}
				}
				setState(360); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 21036488L) != 0) || _la==COLLECTION_ID || _la==ID );
			setState(362);
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
		public StatementBodyContext ifBody;
		public StatementBodyContext elseIfBody;
		public StatementBodyContext elseBody;
		public TerminalNode IF() { return getToken(TLParser.IF, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
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
		public List<StatementBodyContext> statementBody() {
			return getRuleContexts(StatementBodyContext.class);
		}
		public StatementBodyContext statementBody(int i) {
			return getRuleContext(StatementBodyContext.class,i);
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
		enterRule(_localctx, 44, RULE_ifThenElseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(IF);
			setState(365);
			condition();
			setState(366);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21036488L) != 0) || _la==COLLECTION_ID || _la==ID) {
				{
				{
				setState(367);
				((IfThenElseStatementContext)_localctx).ifBody = statementBody();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(END);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(374);
				match(ELSE_IF);
				setState(375);
				condition();
				setState(376);
				match(BEGIN);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21036488L) != 0) || _la==COLLECTION_ID || _la==ID) {
					{
					{
					setState(377);
					((IfThenElseStatementContext)_localctx).elseIfBody = statementBody();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				match(END);
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(390);
				match(ELSE);
				setState(391);
				match(BEGIN);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21036488L) != 0) || _la==COLLECTION_ID || _la==ID) {
					{
					{
					setState(392);
					((IfThenElseStatementContext)_localctx).elseBody = statementBody();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398);
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
		public NumberValueContext numberVal;
		public TerminalNode REPEAT() { return getToken(TLParser.REPEAT, 0); }
		public TerminalNode TIMES() { return getToken(TLParser.TIMES, 0); }
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
		public TerminalNode THEN() { return getToken(TLParser.THEN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_repeatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(REPEAT);
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_VAL_INT:
			case NUMBER_VAL_DOUBLE:
				{
				setState(402);
				((RepeatStatementContext)_localctx).numberVal = numberValue();
				}
				break;
			case ID:
				{
				setState(403);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(406);
			match(TIMES);
			setState(407);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21036488L) != 0) || _la==COLLECTION_ID || _la==ID) {
				{
				{
				setState(408);
				statementBody();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
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
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
		public TerminalNode THEN() { return getToken(TLParser.THEN, 0); }
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
		enterRule(_localctx, 48, RULE_repeatUntilStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(REPEAT_UNTIL);
			setState(417);
			condition();
			setState(418);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21036488L) != 0) || _la==COLLECTION_ID || _la==ID) {
				{
				{
				setState(419);
				statementBody();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
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
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public TerminalNode DO() { return getToken(TLParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
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
		enterRule(_localctx, 50, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(WHILE);
			setState(428);
			condition();
			setState(429);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==DO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 21036488L) != 0) || _la==COLLECTION_ID || _la==ID) {
				{
				{
				setState(430);
				statementBody();
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(436);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 52, RULE_statementBody);
		try {
			int _alt;
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(438);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(441); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(443);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(446); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(448);
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(451); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(453);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(456); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		public ConditionalOperationContext conOp;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> NOT() { return getTokens(TLParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(TLParser.NOT, i);
		}
		public List<TerminalNode> AND() { return getTokens(TLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TLParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(TLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TLParser.OR, i);
		}
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		public TerminalNode NOT() { return getToken(TLParser.NOT, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_condition);
		int _la;
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				_localctx = new Con1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					{
					setState(460);
					var();
					setState(461);
					((Con1Context)_localctx).conOp = conditionalOperation();
					setState(464);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BOOL_LITERAL:
					case TEXT_VAL:
					case NUMBER_VAL_INT:
					case NUMBER_VAL_DOUBLE:
						{
						setState(462);
						val();
						}
						break;
					case ID:
						{
						setState(463);
						var();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				case 2:
					{
					{
					setState(466);
					var();
					}
					}
					break;
				case 3:
					{
					{
					setState(467);
					match(NOT);
					setState(468);
					var();
					}
					}
					break;
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 2199024041985L) != 0)) {
					{
					setState(481);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AND:
					case OR:
						{
						setState(471);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						{
						setState(472);
						var();
						setState(473);
						((Con1Context)_localctx).conOp = conditionalOperation();
						setState(476);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case BOOL_LITERAL:
						case TEXT_VAL:
						case NUMBER_VAL_INT:
						case NUMBER_VAL_DOUBLE:
							{
							setState(474);
							val();
							}
							break;
						case ID:
							{
							setState(475);
							var();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						break;
					case ID:
						{
						{
						setState(478);
						var();
						}
						}
						break;
					case NOT:
						{
						{
						setState(479);
						match(NOT);
						setState(480);
						var();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new Con2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				var();
				}
				break;
			case 3:
				_localctx = new Con3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(487);
				match(NOT);
				setState(488);
				var();
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
		public List<IncrementContext> increment() {
			return getRuleContexts(IncrementContext.class);
		}
		public IncrementContext increment(int i) {
			return getRuleContext(IncrementContext.class,i);
		}
		public List<DecrementContext> decrement() {
			return getRuleContexts(DecrementContext.class);
		}
		public DecrementContext decrement(int i) {
			return getRuleContext(DecrementContext.class,i);
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
		enterRule(_localctx, 56, RULE_expression);
		try {
			int _alt;
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(491);
						mathExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(494); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(496);
						funcCall();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(499); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(502); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(501);
						funcDec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(504); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(507); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(506);
						printExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(509); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(512); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(511);
						askExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(514); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(517); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(516);
						assignment();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(519); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(522); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(521);
						increment();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(524); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(527); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(526);
						decrement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(529); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		public VarContext returnVar;
		public TerminalNode RETURN() { return getToken(TLParser.RETURN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_returnExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(RETURN);
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
			case TEXT_VAL:
			case NUMBER_VAL_INT:
			case NUMBER_VAL_DOUBLE:
				{
				setState(534);
				((ReturnExpContext)_localctx).returnVal = val();
				}
				break;
			case ID:
				{
				setState(535);
				((ReturnExpContext)_localctx).returnVar = var();
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
		public TerminalNode PRINT() { return getToken(TLParser.PRINT, 0); }
		public List<TerminalNode> TEXT_VAL() { return getTokens(TLParser.TEXT_VAL); }
		public TerminalNode TEXT_VAL(int i) {
			return getToken(TLParser.TEXT_VAL, i);
		}
		public List<NumberValueContext> numberValue() {
			return getRuleContexts(NumberValueContext.class);
		}
		public NumberValueContext numberValue(int i) {
			return getRuleContext(NumberValueContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
		enterRule(_localctx, 60, RULE_printExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(PRINT);
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_VAL:
				{
				setState(539);
				match(TEXT_VAL);
				}
				break;
			case NUMBER_VAL_INT:
			case NUMBER_VAL_DOUBLE:
				{
				setState(540);
				numberValue();
				}
				break;
			case ID:
				{
				setState(541);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD) {
				{
				setState(550); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(544);
					match(ADD);
					setState(548);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXT_VAL:
						{
						setState(545);
						match(TEXT_VAL);
						}
						break;
					case NUMBER_VAL_INT:
					case NUMBER_VAL_DOUBLE:
						{
						setState(546);
						numberValue();
						}
						break;
					case ID:
						{
						setState(547);
						var();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(552); 
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
		public TerminalNode ASK() { return getToken(TLParser.ASK, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public List<TerminalNode> TEXT_VAL() { return getTokens(TLParser.TEXT_VAL); }
		public TerminalNode TEXT_VAL(int i) {
			return getToken(TLParser.TEXT_VAL, i);
		}
		public List<NumberValueContext> numberValue() {
			return getRuleContexts(NumberValueContext.class);
		}
		public NumberValueContext numberValue(int i) {
			return getRuleContext(NumberValueContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
		enterRule(_localctx, 62, RULE_askExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(ASK);
			setState(557);
			((AskExpContext)_localctx).askID = match(ID);
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_VAL:
				{
				setState(558);
				match(TEXT_VAL);
				}
				break;
			case NUMBER_VAL_INT:
			case NUMBER_VAL_DOUBLE:
				{
				setState(559);
				numberValue();
				}
				break;
			case ID:
				{
				setState(560);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD) {
				{
				setState(569); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(563);
					match(ADD);
					setState(567);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXT_VAL:
						{
						setState(564);
						match(TEXT_VAL);
						}
						break;
					case NUMBER_VAL_INT:
					case NUMBER_VAL_DOUBLE:
						{
						setState(565);
						numberValue();
						}
						break;
					case ID:
						{
						setState(566);
						var();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(571); 
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
	public static class MathExpContext extends ParserRuleContext {
		public VarContext assignID;
		public MathematicalOperation1Context mathOp1;
		public MathematicalOperation2Context mathOp2;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<NumberValueContext> numberValue() {
			return getRuleContexts(NumberValueContext.class);
		}
		public NumberValueContext numberValue(int i) {
			return getRuleContext(NumberValueContext.class,i);
		}
		public List<MathematicalOperation1Context> mathematicalOperation1() {
			return getRuleContexts(MathematicalOperation1Context.class);
		}
		public MathematicalOperation1Context mathematicalOperation1(int i) {
			return getRuleContext(MathematicalOperation1Context.class,i);
		}
		public MathematicalOperation2Context mathematicalOperation2() {
			return getRuleContext(MathematicalOperation2Context.class,0);
		}
		public MathExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExp; }
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

	public final MathExpContext mathExp() throws RecognitionException {
		MathExpContext _localctx = new MathExpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mathExp);
		try {
			int _alt;
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				((MathExpContext)_localctx).assignID = var();
				setState(576);
				match(ASSIGN);
				setState(579);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER_VAL_INT:
				case NUMBER_VAL_DOUBLE:
					{
					setState(577);
					numberValue();
					}
					break;
				case ID:
					{
					setState(578);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(586); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(581);
						((MathExpContext)_localctx).mathOp1 = mathematicalOperation1();
						setState(584);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NUMBER_VAL_INT:
						case NUMBER_VAL_DOUBLE:
							{
							setState(582);
							numberValue();
							}
							break;
						case ID:
							{
							setState(583);
							var();
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
					setState(588); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				((MathExpContext)_localctx).assignID = var();
				setState(591);
				((MathExpContext)_localctx).mathOp2 = mathematicalOperation2();
				setState(594);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER_VAL_INT:
				case NUMBER_VAL_DOUBLE:
					{
					setState(592);
					numberValue();
					}
					break;
				case ID:
					{
					setState(593);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(596);
						((MathExpContext)_localctx).mathOp1 = mathematicalOperation1();
						setState(599);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NUMBER_VAL_INT:
						case NUMBER_VAL_DOUBLE:
							{
							setState(597);
							numberValue();
							}
							break;
						case ID:
							{
							setState(598);
							var();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(605);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
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
		enterRule(_localctx, 66, RULE_textInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT) {
				{
				setState(608);
				match(TEXT);
				}
			}

			setState(611);
			((TextInitContext)_localctx).var1ID = match(ID);
			setState(612);
			match(ASSIGN);
			{
			setState(613);
			match(TEXT_VAL);
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
	public static class NumberInitContext extends ParserRuleContext {
		public Token var1ID;
		public NumberValueContext numberVal;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(TLParser.NUMBER, 0); }
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_numberInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(615);
				match(NUMBER);
				}
			}

			setState(618);
			((NumberInitContext)_localctx).var1ID = match(ID);
			setState(619);
			match(ASSIGN);
			{
			setState(620);
			((NumberInitContext)_localctx).numberVal = numberValue();
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
	public static class BooleanInitContext extends ParserRuleContext {
		public Token var1ID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
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
		enterRule(_localctx, 70, RULE_booleanInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOLEAN) {
				{
				setState(622);
				match(BOOLEAN);
				}
			}

			setState(625);
			((BooleanInitContext)_localctx).var1ID = match(ID);
			setState(626);
			match(ASSIGN);
			{
			setState(627);
			match(BOOL_LITERAL);
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
	public static class ValContext extends ParserRuleContext {
		public Token textVal;
		public NumberValueContext numberVal;
		public Token boolVal;
		public TerminalNode TEXT_VAL() { return getToken(TLParser.TEXT_VAL, 0); }
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
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
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				((ValContext)_localctx).textVal = match(TEXT_VAL);
				}
				break;
			case NUMBER_VAL_INT:
			case NUMBER_VAL_DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				((ValContext)_localctx).numberVal = numberValue();
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
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
	public static class NumberValueContext extends ParserRuleContext {
		public Token double_;
		public Token int_;
		public TerminalNode NUMBER_VAL_DOUBLE() { return getToken(TLParser.NUMBER_VAL_DOUBLE, 0); }
		public TerminalNode NUMBER_VAL_INT() { return getToken(TLParser.NUMBER_VAL_INT, 0); }
		public NumberValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberValueContext numberValue() throws RecognitionException {
		NumberValueContext _localctx = new NumberValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_numberValue);
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_VAL_DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				((NumberValueContext)_localctx).double_ = match(NUMBER_VAL_DOUBLE);
				}
				break;
			case NUMBER_VAL_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
				((NumberValueContext)_localctx).int_ = match(NUMBER_VAL_INT);
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
	public static class CollectionDeclContext extends ParserRuleContext {
		public Token collectionName;
		public TerminalNode COLLECTION() { return getToken(TLParser.COLLECTION, 0); }
		public TerminalNode LPAREN() { return getToken(TLParser.LPAREN, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(TLParser.RPAREN, 0); }
		public TerminalNode COLLECTION_ID() { return getToken(TLParser.COLLECTION_ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLParser.COMMA, i);
		}
		public CollectionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCollectionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCollectionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCollectionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionDeclContext collectionDecl() throws RecognitionException {
		CollectionDeclContext _localctx = new CollectionDeclContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_collectionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(COLLECTION);
			setState(639);
			((CollectionDeclContext)_localctx).collectionName = match(COLLECTION_ID);
			setState(640);
			match(LPAREN);
			setState(641);
			declaration();
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(642);
				match(COMMA);
				setState(643);
				declaration();
				}
				}
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(649);
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
	public static class CollectionInstanceDeclContext extends ParserRuleContext {
		public Token collectionName;
		public Token instanceName;
		public TerminalNode COLLECTION_ID() { return getToken(TLParser.COLLECTION_ID, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public CollectionInstanceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionInstanceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCollectionInstanceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCollectionInstanceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCollectionInstanceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionInstanceDeclContext collectionInstanceDecl() throws RecognitionException {
		CollectionInstanceDeclContext _localctx = new CollectionInstanceDeclContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_collectionInstanceDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			((CollectionInstanceDeclContext)_localctx).collectionName = match(COLLECTION_ID);
			setState(652);
			((CollectionInstanceDeclContext)_localctx).instanceName = match(ID);
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
	public static class CollectionInitContext extends ParserRuleContext {
		public CollectionInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionInit; }
	 
		public CollectionInitContext() { }
		public void copyFrom(CollectionInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CollectionInitVarContext extends CollectionInitContext {
		public Token collectionInstance;
		public Token field;
		public VarContext variable;
		public TerminalNode GET() { return getToken(TLParser.GET, 0); }
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CollectionInitVarContext(CollectionInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCollectionInitVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCollectionInitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCollectionInitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CollectionInitTextContext extends CollectionInitContext {
		public Token collectionInstance;
		public Token field;
		public TerminalNode GET() { return getToken(TLParser.GET, 0); }
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode TEXT_VAL() { return getToken(TLParser.TEXT_VAL, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public CollectionInitTextContext(CollectionInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCollectionInitText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCollectionInitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCollectionInitText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CollectionInitNumberContext extends CollectionInitContext {
		public Token collectionInstance;
		public Token field;
		public TerminalNode GET() { return getToken(TLParser.GET, 0); }
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public NumberValueContext numberValue() {
			return getRuleContext(NumberValueContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public CollectionInitNumberContext(CollectionInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCollectionInitNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCollectionInitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCollectionInitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CollectionInitBoolContext extends CollectionInitContext {
		public Token collectionInstance;
		public Token field;
		public TerminalNode GET() { return getToken(TLParser.GET, 0); }
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(TLParser.BOOL_LITERAL, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public CollectionInitBoolContext(CollectionInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCollectionInitBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCollectionInitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCollectionInitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CollectionInitAllContext extends CollectionInitContext {
		public Token collectionName;
		public Token instanceName;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode COLLECTION_ID() { return getToken(TLParser.COLLECTION_ID, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
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
		public CollectionInitAllContext(CollectionInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCollectionInitAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCollectionInitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCollectionInitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionInitContext collectionInit() throws RecognitionException {
		CollectionInitContext _localctx = new CollectionInitContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_collectionInit);
		int _la;
		try {
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				_localctx = new CollectionInitBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				((CollectionInitBoolContext)_localctx).collectionInstance = match(ID);
				setState(655);
				match(GET);
				setState(656);
				((CollectionInitBoolContext)_localctx).field = match(ID);
				setState(657);
				match(ASSIGN);
				setState(658);
				match(BOOL_LITERAL);
				}
				break;
			case 2:
				_localctx = new CollectionInitTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				((CollectionInitTextContext)_localctx).collectionInstance = match(ID);
				setState(660);
				match(GET);
				setState(661);
				((CollectionInitTextContext)_localctx).field = match(ID);
				setState(662);
				match(ASSIGN);
				setState(663);
				match(TEXT_VAL);
				}
				break;
			case 3:
				_localctx = new CollectionInitNumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				((CollectionInitNumberContext)_localctx).collectionInstance = match(ID);
				setState(665);
				match(GET);
				setState(666);
				((CollectionInitNumberContext)_localctx).field = match(ID);
				setState(667);
				match(ASSIGN);
				setState(668);
				numberValue();
				}
				break;
			case 4:
				_localctx = new CollectionInitVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(669);
				((CollectionInitVarContext)_localctx).collectionInstance = match(ID);
				setState(670);
				match(GET);
				setState(671);
				((CollectionInitVarContext)_localctx).field = match(ID);
				setState(672);
				match(ASSIGN);
				setState(673);
				((CollectionInitVarContext)_localctx).variable = var();
				}
				break;
			case 5:
				_localctx = new CollectionInitAllContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(674);
				((CollectionInitAllContext)_localctx).collectionName = match(COLLECTION_ID);
				setState(675);
				((CollectionInitAllContext)_localctx).instanceName = match(ID);
				setState(676);
				match(ASSIGN);
				setState(679);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL_LITERAL:
				case TEXT_VAL:
				case NUMBER_VAL_INT:
				case NUMBER_VAL_DOUBLE:
					{
					setState(677);
					val();
					}
					break;
				case ID:
					{
					setState(678);
					var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(681);
					match(COMMA);
					setState(684);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BOOL_LITERAL:
					case TEXT_VAL:
					case NUMBER_VAL_INT:
					case NUMBER_VAL_DOUBLE:
						{
						setState(682);
						val();
						}
						break;
					case ID:
						{
						setState(683);
						var();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(690);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode INC() { return getToken(TLParser.INC, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(ID);
			setState(694);
			match(INC);
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
	public static class DecrementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode DEC() { return getToken(TLParser.DEC, 0); }
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(ID);
			setState(697);
			match(DEC);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignListContext extends AssignmentContext {
		public Token assignID;
		public Token indexID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode GET() { return getToken(TLParser.GET, 0); }
		public TerminalNode NUMBER_VAL_INT() { return getToken(TLParser.NUMBER_VAL_INT, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public AssignListContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAssignList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAssignList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAssignList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignAnswerContext extends AssignmentContext {
		public Token assignID;
		public Token askID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public TerminalNode GET() { return getToken(TLParser.GET, 0); }
		public TerminalNode ANSWER() { return getToken(TLParser.ANSWER, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public AssignAnswerContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAssignAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAssignAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAssignAnswer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignIDContext extends AssignmentContext {
		public Token var1ID;
		public Token var2ID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public AssignIDContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAssignID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAssignID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAssignID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignment);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new AssignIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				((AssignIDContext)_localctx).var1ID = match(ID);
				setState(700);
				match(ASSIGN);
				setState(701);
				((AssignIDContext)_localctx).var2ID = match(ID);
				}
				break;
			case 2:
				_localctx = new AssignAnswerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				((AssignAnswerContext)_localctx).assignID = match(ID);
				setState(703);
				match(ASSIGN);
				setState(704);
				((AssignAnswerContext)_localctx).askID = match(ID);
				setState(705);
				match(GET);
				setState(706);
				match(ANSWER);
				}
				break;
			case 3:
				_localctx = new AssignListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				((AssignListContext)_localctx).assignID = match(ID);
				setState(708);
				match(ASSIGN);
				setState(709);
				((AssignListContext)_localctx).indexID = match(ID);
				setState(710);
				match(GET);
				setState(711);
				match(NUMBER_VAL_INT);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public DotVariableContext dotVariable() {
			return getRuleContext(DotVariableContext.class,0);
		}
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
		enterRule(_localctx, 88, RULE_var);
		try {
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				dotVariable();
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
		enterRule(_localctx, 90, RULE_conditionalOperation);
		try {
			setState(724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				((ConditionalOperationContext)_localctx).conOpLT = match(LT);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				((ConditionalOperationContext)_localctx).conOpGT = match(GT);
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(720);
				((ConditionalOperationContext)_localctx).conOpEQ = match(EQUAL);
				}
				break;
			case NOTEQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(721);
				((ConditionalOperationContext)_localctx).conOpNEQ = match(NOTEQUAL);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 5);
				{
				setState(722);
				((ConditionalOperationContext)_localctx).conOpLE = match(LE);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 6);
				{
				setState(723);
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
		enterRule(_localctx, 92, RULE_mathematicalOperation1);
		try {
			setState(731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_VAL_INT:
			case NUMBER_VAL_DOUBLE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				((MathematicalOperation1Context)_localctx).mathOpADD = match(ADD);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
				((MathematicalOperation1Context)_localctx).mathOpSUB = match(SUB);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(729);
				((MathematicalOperation1Context)_localctx).mathOpMUL = match(MUL);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 5);
				{
				setState(730);
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
		enterRule(_localctx, 94, RULE_mathematicalOperation2);
		try {
			setState(738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_VAL_INT:
			case NUMBER_VAL_DOUBLE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case ADD_ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				((MathematicalOperation2Context)_localctx).mathOpADD = match(ADD_ASSIGN);
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(735);
				((MathematicalOperation2Context)_localctx).mathOpSUB = match(SUB_ASSIGN);
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(736);
				((MathematicalOperation2Context)_localctx).mathOpMUL = match(MUL_ASSIGN);
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(737);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DotVariableContext extends ParserRuleContext {
		public Token askID;
		public Token listID;
		public Token instanceName;
		public Token field;
		public TerminalNode GET() { return getToken(TLParser.GET, 0); }
		public TerminalNode ANSWER() { return getToken(TLParser.ANSWER, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public TerminalNode NUMBER_VAL_INT() { return getToken(TLParser.NUMBER_VAL_INT, 0); }
		public DotVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterDotVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitDotVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitDotVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotVariableContext dotVariable() throws RecognitionException {
		DotVariableContext _localctx = new DotVariableContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dotVariable);
		try {
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				((DotVariableContext)_localctx).askID = match(ID);
				setState(741);
				match(GET);
				setState(742);
				match(ANSWER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				((DotVariableContext)_localctx).listID = match(ID);
				setState(744);
				match(GET);
				{
				setState(745);
				match(NUMBER_VAL_INT);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(746);
				((DotVariableContext)_localctx).instanceName = match(ID);
				setState(747);
				match(GET);
				setState(748);
				((DotVariableContext)_localctx).field = match(ID);
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

	public static final String _serializedATN =
		"\u0004\u0001C\u02f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001h\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002m\b\u0002\n\u0002\f\u0002p\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003u\b\u0003\u000b\u0003"+
		"\f\u0003v\u0001\u0003\u0004\u0003z\b\u0003\u000b\u0003\f\u0003{\u0001"+
		"\u0003\u0004\u0003\u007f\b\u0003\u000b\u0003\f\u0003\u0080\u0001\u0003"+
		"\u0004\u0003\u0084\b\u0003\u000b\u0003\f\u0003\u0085\u0003\u0003\u0088"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008d\b\u0004"+
		"\n\u0004\f\u0004\u0090\t\u0004\u0001\u0004\u0005\u0004\u0093\b\u0004\n"+
		"\u0004\f\u0004\u0096\t\u0004\u0001\u0004\u0004\u0004\u0099\b\u0004\u000b"+
		"\u0004\f\u0004\u009a\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00a3\b\u0005\u0001\u0005\u0003\u0005\u00a6"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00aa\b\u0005\n\u0005\f\u0005"+
		"\u00ad\t\u0005\u0001\u0005\u0003\u0005\u00b0\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b8"+
		"\b\u0006\n\u0006\f\u0006\u00bb\t\u0006\u0003\u0006\u00bd\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00c3\b\u0007\n"+
		"\u0007\f\u0007\u00c6\t\u0007\u0003\u0007\u00c8\b\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0003\t\u00cd\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00d4\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00dd\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00ee\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00f4\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00f9\b\u000f\u0005\u000f\u00fb\b\u000f\n\u000f"+
		"\f\u000f\u00fe\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0106\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u010d\b\u0011\n\u0011"+
		"\f\u0011\u0110\t\u0011\u0001\u0012\u0004\u0012\u0113\b\u0012\u000b\u0012"+
		"\f\u0012\u0114\u0001\u0012\u0004\u0012\u0118\b\u0012\u000b\u0012\f\u0012"+
		"\u0119\u0001\u0012\u0004\u0012\u011d\b\u0012\u000b\u0012\f\u0012\u011e"+
		"\u0001\u0012\u0004\u0012\u0122\b\u0012\u000b\u0012\f\u0012\u0123\u0001"+
		"\u0012\u0004\u0012\u0127\b\u0012\u000b\u0012\f\u0012\u0128\u0001\u0012"+
		"\u0004\u0012\u012c\b\u0012\u000b\u0012\f\u0012\u012d\u0003\u0012\u0130"+
		"\b\u0012\u0001\u0013\u0004\u0013\u0133\b\u0013\u000b\u0013\f\u0013\u0134"+
		"\u0001\u0013\u0004\u0013\u0138\b\u0013\u000b\u0013\f\u0013\u0139\u0001"+
		"\u0013\u0004\u0013\u013d\b\u0013\u000b\u0013\f\u0013\u013e\u0001\u0013"+
		"\u0004\u0013\u0142\b\u0013\u000b\u0013\f\u0013\u0143\u0003\u0013\u0146"+
		"\b\u0013\u0001\u0014\u0004\u0014\u0149\b\u0014\u000b\u0014\f\u0014\u014a"+
		"\u0001\u0014\u0004\u0014\u014e\b\u0014\u000b\u0014\f\u0014\u014f\u0001"+
		"\u0014\u0004\u0014\u0153\b\u0014\u000b\u0014\f\u0014\u0154\u0001\u0014"+
		"\u0004\u0014\u0158\b\u0014\u000b\u0014\f\u0014\u0159\u0001\u0014\u0004"+
		"\u0014\u015d\b\u0014\u000b\u0014\f\u0014\u015e\u0003\u0014\u0161\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0167\b\u0015"+
		"\u000b\u0015\f\u0015\u0168\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0171\b\u0016\n\u0016\f\u0016\u0174"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u017b\b\u0016\n\u0016\f\u0016\u017e\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0182\b\u0016\n\u0016\f\u0016\u0185\t\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u018a\b\u0016\n\u0016\f\u0016\u018d\t\u0016"+
		"\u0001\u0016\u0003\u0016\u0190\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0195\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u019a\b\u0017\n\u0017\f\u0017\u019d\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01a5\b\u0018\n"+
		"\u0018\f\u0018\u01a8\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01b0\b\u0019\n\u0019\f\u0019"+
		"\u01b3\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u01b8\b"+
		"\u001a\u000b\u001a\f\u001a\u01b9\u0001\u001a\u0004\u001a\u01bd\b\u001a"+
		"\u000b\u001a\f\u001a\u01be\u0001\u001a\u0004\u001a\u01c2\b\u001a\u000b"+
		"\u001a\f\u001a\u01c3\u0001\u001a\u0004\u001a\u01c7\b\u001a\u000b\u001a"+
		"\f\u001a\u01c8\u0003\u001a\u01cb\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01d1\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u01d6\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01dd\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u01e2\b\u001b\n\u001b\f\u001b\u01e5\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01ea\b\u001b\u0001\u001c\u0004\u001c"+
		"\u01ed\b\u001c\u000b\u001c\f\u001c\u01ee\u0001\u001c\u0004\u001c\u01f2"+
		"\b\u001c\u000b\u001c\f\u001c\u01f3\u0001\u001c\u0004\u001c\u01f7\b\u001c"+
		"\u000b\u001c\f\u001c\u01f8\u0001\u001c\u0004\u001c\u01fc\b\u001c\u000b"+
		"\u001c\f\u001c\u01fd\u0001\u001c\u0004\u001c\u0201\b\u001c\u000b\u001c"+
		"\f\u001c\u0202\u0001\u001c\u0004\u001c\u0206\b\u001c\u000b\u001c\f\u001c"+
		"\u0207\u0001\u001c\u0004\u001c\u020b\b\u001c\u000b\u001c\f\u001c\u020c"+
		"\u0001\u001c\u0004\u001c\u0210\b\u001c\u000b\u001c\f\u001c\u0211\u0003"+
		"\u001c\u0214\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0219"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u021f"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0225"+
		"\b\u001e\u0004\u001e\u0227\b\u001e\u000b\u001e\f\u001e\u0228\u0003\u001e"+
		"\u022b\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0232\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0238\b\u001f\u0004\u001f\u023a\b\u001f\u000b\u001f\f\u001f"+
		"\u023b\u0003\u001f\u023e\b\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u0244"+
		"\b \u0001 \u0001 \u0001 \u0003 \u0249\b \u0004 \u024b\b \u000b \f \u024c"+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u0253\b \u0001 \u0001 \u0001 \u0003"+
		" \u0258\b \u0005 \u025a\b \n \f \u025d\t \u0003 \u025f\b \u0001!\u0003"+
		"!\u0262\b!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0003\"\u0269\b\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0003#\u0270\b#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0003$\u0279\b$\u0001%\u0001%\u0003%\u027d"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u0285\b&\n&\f&\u0288"+
		"\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u02a8\b(\u0001(\u0001(\u0001(\u0003(\u02ad\b(\u0005(\u02af"+
		"\b(\n(\f(\u02b2\t(\u0003(\u02b4\b(\u0001)\u0001)\u0001)\u0001*\u0001*"+
		"\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u02c9\b+\u0001,\u0001,\u0003,\u02cd"+
		"\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02d5\b-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u02dc\b.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u02e3\b/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u02ee\b0\u00010\u0000\u00001\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`\u0000\u0004\u0002\u0000;;CC\u0002\u0000\u0004"+
		"\u0004\u0012\u0012\u0002\u0000\u0004\u0004\u0013\u0013\u0001\u0000,-\u0358"+
		"\u0000b\u0001\u0000\u0000\u0000\u0002e\u0001\u0000\u0000\u0000\u0004i"+
		"\u0001\u0000\u0000\u0000\u0006\u0087\u0001\u0000\u0000\u0000\b\u0089\u0001"+
		"\u0000\u0000\u0000\n\u009e\u0001\u0000\u0000\u0000\f\u00bc\u0001\u0000"+
		"\u0000\u0000\u000e\u00c7\u0001\u0000\u0000\u0000\u0010\u00c9\u0001\u0000"+
		"\u0000\u0000\u0012\u00cc\u0001\u0000\u0000\u0000\u0014\u00dc\u0001\u0000"+
		"\u0000\u0000\u0016\u00de\u0001\u0000\u0000\u0000\u0018\u00e1\u0001\u0000"+
		"\u0000\u0000\u001a\u00e4\u0001\u0000\u0000\u0000\u001c\u00e7\u0001\u0000"+
		"\u0000\u0000\u001e\u00ed\u0001\u0000\u0000\u0000 \u00ff\u0001\u0000\u0000"+
		"\u0000\"\u0105\u0001\u0000\u0000\u0000$\u012f\u0001\u0000\u0000\u0000"+
		"&\u0145\u0001\u0000\u0000\u0000(\u0160\u0001\u0000\u0000\u0000*\u0162"+
		"\u0001\u0000\u0000\u0000,\u016c\u0001\u0000\u0000\u0000.\u0191\u0001\u0000"+
		"\u0000\u00000\u01a0\u0001\u0000\u0000\u00002\u01ab\u0001\u0000\u0000\u0000"+
		"4\u01ca\u0001\u0000\u0000\u00006\u01e9\u0001\u0000\u0000\u00008\u0213"+
		"\u0001\u0000\u0000\u0000:\u0215\u0001\u0000\u0000\u0000<\u021a\u0001\u0000"+
		"\u0000\u0000>\u022c\u0001\u0000\u0000\u0000@\u025e\u0001\u0000\u0000\u0000"+
		"B\u0261\u0001\u0000\u0000\u0000D\u0268\u0001\u0000\u0000\u0000F\u026f"+
		"\u0001\u0000\u0000\u0000H\u0278\u0001\u0000\u0000\u0000J\u027c\u0001\u0000"+
		"\u0000\u0000L\u027e\u0001\u0000\u0000\u0000N\u028b\u0001\u0000\u0000\u0000"+
		"P\u02b3\u0001\u0000\u0000\u0000R\u02b5\u0001\u0000\u0000\u0000T\u02b8"+
		"\u0001\u0000\u0000\u0000V\u02c8\u0001\u0000\u0000\u0000X\u02cc\u0001\u0000"+
		"\u0000\u0000Z\u02d4\u0001\u0000\u0000\u0000\\\u02db\u0001\u0000\u0000"+
		"\u0000^\u02e2\u0001\u0000\u0000\u0000`\u02ed\u0001\u0000\u0000\u0000b"+
		"c\u0003\u0002\u0001\u0000cd\u0005\u0000\u0000\u0001d\u0001\u0001\u0000"+
		"\u0000\u0000eg\u0003\u0004\u0002\u0000fh\u0003\b\u0004\u0000gf\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000h\u0003\u0001\u0000\u0000\u0000"+
		"ij\u0005\u0001\u0000\u0000jn\u0005\u0004\u0000\u0000km\u0003\u0006\u0003"+
		"\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qr\u0005\u0005\u0000\u0000r\u0005\u0001\u0000\u0000"+
		"\u0000su\u0003\u0014\n\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0088\u0001"+
		"\u0000\u0000\u0000xz\u0003$\u0012\u0000yx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|\u0088\u0001\u0000\u0000\u0000}\u007f\u00038\u001c\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0088\u0001\u0000\u0000"+
		"\u0000\u0082\u0084\u0003(\u0014\u0000\u0083\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0088\u0001\u0000\u0000\u0000"+
		"\u0087t\u0001\u0000\u0000\u0000\u0087y\u0001\u0000\u0000\u0000\u0087~"+
		"\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0088\u0007"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0002\u0000\u0000\u008a\u008e"+
		"\u0005\u0004\u0000\u0000\u008b\u008d\u0003\u0014\n\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0094\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0093\u0003"+
		"$\u0012\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u0099\u0003\n\u0005\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\u0005\u0000\u0000\u009d\t\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005\u0003\u0000\u0000\u009f\u00a5\u0003\u0010\b\u0000\u00a0"+
		"\u00a2\u0005\u001b\u0000\u0000\u00a1\u00a3\u0003\f\u0006\u0000\u00a2\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005\u001c\u0000\u0000\u00a5\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00ab\u0005\u0004\u0000\u0000\u00a8\u00aa"+
		"\u0003&\u0013\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0003:\u001d\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\u0005\u0000\u0000\u00b2\u000b\u0001\u0000"+
		"\u0000\u0000\u00b3\u00bd\u0003\u0014\n\u0000\u00b4\u00b9\u0003\u0014\n"+
		"\u0000\u00b5\u00b6\u0005\"\u0000\u0000\u00b6\u00b8\u0003\u0014\n\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b3\u0001\u0000\u0000\u0000\u00bc\u00b4\u0001\u0000\u0000\u0000"+
		"\u00bd\r\u0001\u0000\u0000\u0000\u00be\u00c8\u0003X,\u0000\u00bf\u00c4"+
		"\u0003X,\u0000\u00c0\u00c1\u0005\"\u0000\u0000\u00c1\u00c3\u0003X,\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c7\u00be\u0001\u0000\u0000\u0000\u00c7\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c8\u000f\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005C\u0000\u0000\u00ca"+
		"\u0011\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005\u0018\u0000\u0000\u00cc"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d3\u0003\u0010\b\u0000\u00cf\u00d0"+
		"\u0005\u001b\u0000\u0000\u00d0\u00d1\u0003\u000e\u0007\u0000\u00d1\u00d2"+
		"\u0005\u001c\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u0013"+
		"\u0001\u0000\u0000\u0000\u00d5\u00dd\u0003\u0016\u000b\u0000\u00d6\u00dd"+
		"\u0003\u0018\f\u0000\u00d7\u00dd\u0003\u001a\r\u0000\u00d8\u00dd\u0003"+
		"\u001c\u000e\u0000\u00d9\u00dd\u0003 \u0010\u0000\u00da\u00dd\u0003L&"+
		"\u0000\u00db\u00dd\u0003N\'\u0000\u00dc\u00d5\u0001\u0000\u0000\u0000"+
		"\u00dc\u00d6\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000"+
		"\u00dc\u00d8\u0001\u0000\u0000\u0000\u00dc\u00d9\u0001\u0000\u0000\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000"+
		"\u00dd\u0015\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u0007\u0000\u0000"+
		"\u00df\u00e0\u0005C\u0000\u0000\u00e0\u0017\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005\b\u0000\u0000\u00e2\u00e3\u0005C\u0000\u0000\u00e3\u0019"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0006\u0000\u0000\u00e5\u00e6"+
		"\u0005C\u0000\u0000\u00e6\u001b\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005"+
		"\u0007\u0000\u0000\u00e8\u00e9\u0005\t\u0000\u0000\u00e9\u00ea\u0005C"+
		"\u0000\u0000\u00ea\u001d\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0007"+
		"\u0000\u0000\u00ec\u00ee\u0005\t\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005C\u0000\u0000\u00f0\u00f3\u0005%\u0000\u0000\u00f1"+
		"\u00f4\u0003J%\u0000\u00f2\u00f4\u0005C\u0000\u0000\u00f3\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00fc\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f8\u0005\"\u0000\u0000\u00f6\u00f9\u0003J"+
		"%\u0000\u00f7\u00f9\u0005C\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f5\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u001f\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0005\b\u0000\u0000\u0100\u0101\u0005\t\u0000\u0000\u0101"+
		"\u0102\u0005C\u0000\u0000\u0102!\u0001\u0000\u0000\u0000\u0103\u0104\u0005"+
		"\b\u0000\u0000\u0104\u0106\u0005\t\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005C\u0000\u0000\u0108\u0109\u0005%\u0000\u0000"+
		"\u0109\u010e\u0007\u0000\u0000\u0000\u010a\u010b\u0005\"\u0000\u0000\u010b"+
		"\u010d\u0007\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d"+
		"\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0001\u0000\u0000\u0000\u010f#\u0001\u0000\u0000\u0000\u0110\u010e"+
		"\u0001\u0000\u0000\u0000\u0111\u0113\u0003B!\u0000\u0112\u0111\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0130\u0001\u0000"+
		"\u0000\u0000\u0116\u0118\u0003D\"\u0000\u0117\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u0130\u0001\u0000\u0000"+
		"\u0000\u011b\u011d\u0003F#\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0130\u0001\u0000\u0000\u0000\u0120"+
		"\u0122\u0003\u001e\u000f\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0001\u0000\u0000\u0000\u0124\u0130\u0001\u0000\u0000\u0000\u0125"+
		"\u0127\u0003\"\u0011\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129"+
		"\u0001\u0000\u0000\u0000\u0129\u0130\u0001\u0000\u0000\u0000\u012a\u012c"+
		"\u0003P(\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000"+
		"\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000"+
		"\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0112\u0001\u0000"+
		"\u0000\u0000\u012f\u0117\u0001\u0000\u0000\u0000\u012f\u011c\u0001\u0000"+
		"\u0000\u0000\u012f\u0121\u0001\u0000\u0000\u0000\u012f\u0126\u0001\u0000"+
		"\u0000\u0000\u012f\u012b\u0001\u0000\u0000\u0000\u0130%\u0001\u0000\u0000"+
		"\u0000\u0131\u0133\u0003(\u0014\u0000\u0132\u0131\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0146\u0001\u0000\u0000\u0000"+
		"\u0136\u0138\u00038\u001c\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139"+
		"\u013a\u0001\u0000\u0000\u0000\u013a\u0146\u0001\u0000\u0000\u0000\u013b"+
		"\u013d\u0003\u0014\n\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0146\u0001\u0000\u0000\u0000\u0140\u0142"+
		"\u0003$\u0012\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0132\u0001"+
		"\u0000\u0000\u0000\u0145\u0137\u0001\u0000\u0000\u0000\u0145\u013c\u0001"+
		"\u0000\u0000\u0000\u0145\u0141\u0001\u0000\u0000\u0000\u0146\'\u0001\u0000"+
		"\u0000\u0000\u0147\u0149\u0003*\u0015\u0000\u0148\u0147\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u0161\u0001\u0000\u0000"+
		"\u0000\u014c\u014e\u0003,\u0016\u0000\u014d\u014c\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0161\u0001\u0000\u0000\u0000"+
		"\u0151\u0153\u0003.\u0017\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153"+
		"\u0154\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0001\u0000\u0000\u0000\u0155\u0161\u0001\u0000\u0000\u0000\u0156"+
		"\u0158\u00030\u0018\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u0161\u0001\u0000\u0000\u0000\u015b\u015d"+
		"\u00032\u0019\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f\u0001"+
		"\u0000\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000\u0160\u0148\u0001"+
		"\u0000\u0000\u0000\u0160\u014d\u0001\u0000\u0000\u0000\u0160\u0152\u0001"+
		"\u0000\u0000\u0000\u0160\u0157\u0001\u0000\u0000\u0000\u0160\u015c\u0001"+
		"\u0000\u0000\u0000\u0161)\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u000f"+
		"\u0000\u0000\u0163\u0164\u00036\u001b\u0000\u0164\u0166\u0007\u0001\u0000"+
		"\u0000\u0165\u0167\u00034\u001a\u0000\u0166\u0165\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0005\u0005\u0000\u0000\u016b+\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\u0005\u000f\u0000\u0000\u016d\u016e\u00036\u001b\u0000\u016e\u0172"+
		"\u0007\u0001\u0000\u0000\u016f\u0171\u00034\u001a\u0000\u0170\u016f\u0001"+
		"\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0175\u0001"+
		"\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0183\u0005"+
		"\u0005\u0000\u0000\u0176\u0177\u0005\u0011\u0000\u0000\u0177\u0178\u0003"+
		"6\u001b\u0000\u0178\u017c\u0005\u0004\u0000\u0000\u0179\u017b\u00034\u001a"+
		"\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u017e\u0001\u0000\u0000"+
		"\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0005\u0005\u0000\u0000\u0180\u0182\u0001\u0000\u0000"+
		"\u0000\u0181\u0176\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000"+
		"\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u018f\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0005\u0010\u0000\u0000\u0187\u018b\u0005\u0004\u0000"+
		"\u0000\u0188\u018a\u00034\u001a\u0000\u0189\u0188\u0001\u0000\u0000\u0000"+
		"\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018e\u0001\u0000\u0000\u0000"+
		"\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u0190\u0005\u0005\u0000\u0000"+
		"\u018f\u0186\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000"+
		"\u0190-\u0001\u0000\u0000\u0000\u0191\u0194\u0005\r\u0000\u0000\u0192"+
		"\u0195\u0003J%\u0000\u0193\u0195\u0003X,\u0000\u0194\u0192\u0001\u0000"+
		"\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0005\u0014\u0000\u0000\u0197\u019b\u0007\u0001"+
		"\u0000\u0000\u0198\u019a\u00034\u001a\u0000\u0199\u0198\u0001\u0000\u0000"+
		"\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000"+
		"\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000"+
		"\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u0005\u0000"+
		"\u0000\u019f/\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\u000e\u0000\u0000"+
		"\u01a1\u01a2\u00036\u001b\u0000\u01a2\u01a6\u0007\u0001\u0000\u0000\u01a3"+
		"\u01a5\u00034\u001a\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005\u0005\u0000\u0000\u01aa1\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0005\f\u0000\u0000\u01ac\u01ad\u00036"+
		"\u001b\u0000\u01ad\u01b1\u0007\u0002\u0000\u0000\u01ae\u01b0\u00034\u001a"+
		"\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0005\u0005\u0000\u0000\u01b53\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b8\u0003(\u0014\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01ba\u01cb\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bd\u0003\u0014\n\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0001\u0000\u0000\u0000\u01bf\u01cb\u0001\u0000\u0000\u0000\u01c0\u01c2"+
		"\u0003$\u0012\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c4\u01cb\u0001\u0000\u0000\u0000\u01c5\u01c7\u0003"+
		"8\u001c\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01b7\u0001\u0000"+
		"\u0000\u0000\u01ca\u01bc\u0001\u0000\u0000\u0000\u01ca\u01c1\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01cb5\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u0003X,\u0000\u01cd\u01d0\u0003Z-\u0000\u01ce\u01d1"+
		"\u0003H$\u0000\u01cf\u01d1\u0003X,\u0000\u01d0\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d6\u0003X,\u0000\u01d3\u01d4\u0005\u001a\u0000\u0000\u01d4"+
		"\u01d6\u0003X,\u0000\u01d5\u01cc\u0001\u0000\u0000\u0000\u01d5\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01e3\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0007\u0003\u0000\u0000\u01d8\u01d9\u0003"+
		"X,\u0000\u01d9\u01dc\u0003Z-\u0000\u01da\u01dd\u0003H$\u0000\u01db\u01dd"+
		"\u0003X,\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01db\u0001\u0000"+
		"\u0000\u0000\u01dd\u01e2\u0001\u0000\u0000\u0000\u01de\u01e2\u0003X,\u0000"+
		"\u01df\u01e0\u0005\u001a\u0000\u0000\u01e0\u01e2\u0003X,\u0000\u01e1\u01d7"+
		"\u0001\u0000\u0000\u0000\u01e1\u01de\u0001\u0000\u0000\u0000\u01e1\u01df"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e5\u0001\u0000\u0000\u0000\u01e3\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01ea"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e6\u01ea"+
		"\u0003X,\u0000\u01e7\u01e8\u0005\u001a\u0000\u0000\u01e8\u01ea\u0003X"+
		",\u0000\u01e9\u01d5\u0001\u0000\u0000\u0000\u01e9\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea7\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ed\u0003@ \u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0001\u0000\u0000\u0000\u01ef\u0214\u0001\u0000\u0000\u0000\u01f0\u01f2"+
		"\u0003\u0012\t\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f4\u0214\u0001\u0000\u0000\u0000\u01f5\u01f7\u0003"+
		"\n\u0005\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000"+
		"\u0000\u0000\u01f9\u0214\u0001\u0000\u0000\u0000\u01fa\u01fc\u0003<\u001e"+
		"\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fe\u0214\u0001\u0000\u0000\u0000\u01ff\u0201\u0003>\u001f\u0000"+
		"\u0200\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000"+
		"\u0202\u0200\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000"+
		"\u0203\u0214\u0001\u0000\u0000\u0000\u0204\u0206\u0003V+\u0000\u0205\u0204"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u0205"+
		"\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0214"+
		"\u0001\u0000\u0000\u0000\u0209\u020b\u0003R)\u0000\u020a\u0209\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u0214\u0001\u0000"+
		"\u0000\u0000\u020e\u0210\u0003T*\u0000\u020f\u020e\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0214\u0001\u0000\u0000\u0000"+
		"\u0213\u01ec\u0001\u0000\u0000\u0000\u0213\u01f1\u0001\u0000\u0000\u0000"+
		"\u0213\u01f6\u0001\u0000\u0000\u0000\u0213\u01fb\u0001\u0000\u0000\u0000"+
		"\u0213\u0200\u0001\u0000\u0000\u0000\u0213\u0205\u0001\u0000\u0000\u0000"+
		"\u0213\u020a\u0001\u0000\u0000\u0000\u0213\u020f\u0001\u0000\u0000\u0000"+
		"\u02149\u0001\u0000\u0000\u0000\u0215\u0218\u0005\u0015\u0000\u0000\u0216"+
		"\u0219\u0003H$\u0000\u0217\u0219\u0003X,\u0000\u0218\u0216\u0001\u0000"+
		"\u0000\u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0219;\u0001\u0000\u0000"+
		"\u0000\u021a\u021e\u0005\u000b\u0000\u0000\u021b\u021f\u0005;\u0000\u0000"+
		"\u021c\u021f\u0003J%\u0000\u021d\u021f\u0003X,\u0000\u021e\u021b\u0001"+
		"\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021d\u0001"+
		"\u0000\u0000\u0000\u021f\u022a\u0001\u0000\u0000\u0000\u0220\u0224\u0005"+
		"0\u0000\u0000\u0221\u0225\u0005;\u0000\u0000\u0222\u0225\u0003J%\u0000"+
		"\u0223\u0225\u0003X,\u0000\u0224\u0221\u0001\u0000\u0000\u0000\u0224\u0222"+
		"\u0001\u0000\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225\u0227"+
		"\u0001\u0000\u0000\u0000\u0226\u0220\u0001\u0000\u0000\u0000\u0227\u0228"+
		"\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229"+
		"\u0001\u0000\u0000\u0000\u0229\u022b\u0001\u0000\u0000\u0000\u022a\u0226"+
		"\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b=\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u0005\u0016\u0000\u0000\u022d\u0231\u0005"+
		"C\u0000\u0000\u022e\u0232\u0005;\u0000\u0000\u022f\u0232\u0003J%\u0000"+
		"\u0230\u0232\u0003X,\u0000\u0231\u022e\u0001\u0000\u0000\u0000\u0231\u022f"+
		"\u0001\u0000\u0000\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0232\u023d"+
		"\u0001\u0000\u0000\u0000\u0233\u0237\u00050\u0000\u0000\u0234\u0238\u0005"+
		";\u0000\u0000\u0235\u0238\u0003J%\u0000\u0236\u0238\u0003X,\u0000\u0237"+
		"\u0234\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237"+
		"\u0236\u0001\u0000\u0000\u0000\u0238\u023a\u0001\u0000\u0000\u0000\u0239"+
		"\u0233\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b"+
		"\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c"+
		"\u023e\u0001\u0000\u0000\u0000\u023d\u0239\u0001\u0000\u0000\u0000\u023d"+
		"\u023e\u0001\u0000\u0000\u0000\u023e?\u0001\u0000\u0000\u0000\u023f\u0240"+
		"\u0003X,\u0000\u0240\u0243\u0005%\u0000\u0000\u0241\u0244\u0003J%\u0000"+
		"\u0242\u0244\u0003X,\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0242"+
		"\u0001\u0000\u0000\u0000\u0244\u024a\u0001\u0000\u0000\u0000\u0245\u0248"+
		"\u0003\\.\u0000\u0246\u0249\u0003J%\u0000\u0247\u0249\u0003X,\u0000\u0248"+
		"\u0246\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249"+
		"\u024b\u0001\u0000\u0000\u0000\u024a\u0245\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c"+
		"\u024d\u0001\u0000\u0000\u0000\u024d\u025f\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0003X,\u0000\u024f\u0252\u0003^/\u0000\u0250\u0253\u0003J%\u0000"+
		"\u0251\u0253\u0003X,\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0251"+
		"\u0001\u0000\u0000\u0000\u0253\u025b\u0001\u0000\u0000\u0000\u0254\u0257"+
		"\u0003\\.\u0000\u0255\u0258\u0003J%\u0000\u0256\u0258\u0003X,\u0000\u0257"+
		"\u0255\u0001\u0000\u0000\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0258"+
		"\u025a\u0001\u0000\u0000\u0000\u0259\u0254\u0001\u0000\u0000\u0000\u025a"+
		"\u025d\u0001\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0001\u0000\u0000\u0000\u025c\u025f\u0001\u0000\u0000\u0000\u025d"+
		"\u025b\u0001\u0000\u0000\u0000\u025e\u023f\u0001\u0000\u0000\u0000\u025e"+
		"\u024e\u0001\u0000\u0000\u0000\u025fA\u0001\u0000\u0000\u0000\u0260\u0262"+
		"\u0005\b\u0000\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0261\u0262\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0264\u0005"+
		"C\u0000\u0000\u0264\u0265\u0005%\u0000\u0000\u0265\u0266\u0005;\u0000"+
		"\u0000\u0266C\u0001\u0000\u0000\u0000\u0267\u0269\u0005\u0007\u0000\u0000"+
		"\u0268\u0267\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026b\u0005C\u0000\u0000\u026b"+
		"\u026c\u0005%\u0000\u0000\u026c\u026d\u0003J%\u0000\u026dE\u0001\u0000"+
		"\u0000\u0000\u026e\u0270\u0005\u0006\u0000\u0000\u026f\u026e\u0001\u0000"+
		"\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0005C\u0000\u0000\u0272\u0273\u0005%\u0000\u0000"+
		"\u0273\u0274\u00056\u0000\u0000\u0274G\u0001\u0000\u0000\u0000\u0275\u0279"+
		"\u0005;\u0000\u0000\u0276\u0279\u0003J%\u0000\u0277\u0279\u00056\u0000"+
		"\u0000\u0278\u0275\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000"+
		"\u0000\u0278\u0277\u0001\u0000\u0000\u0000\u0279I\u0001\u0000\u0000\u0000"+
		"\u027a\u027d\u0005=\u0000\u0000\u027b\u027d\u0005<\u0000\u0000\u027c\u027a"+
		"\u0001\u0000\u0000\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027dK\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0005\n\u0000\u0000\u027f\u0280\u0005B"+
		"\u0000\u0000\u0280\u0281\u0005\u001b\u0000\u0000\u0281\u0286\u0003\u0014"+
		"\n\u0000\u0282\u0283\u0005\"\u0000\u0000\u0283\u0285\u0003\u0014\n\u0000"+
		"\u0284\u0282\u0001\u0000\u0000\u0000\u0285\u0288\u0001\u0000\u0000\u0000"+
		"\u0286\u0284\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000"+
		"\u0287\u0289\u0001\u0000\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u0005\u001c\u0000\u0000\u028aM\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0005B\u0000\u0000\u028c\u028d\u0005C\u0000\u0000\u028dO\u0001"+
		"\u0000\u0000\u0000\u028e\u028f\u0005C\u0000\u0000\u028f\u0290\u0005\u0019"+
		"\u0000\u0000\u0290\u0291\u0005C\u0000\u0000\u0291\u0292\u0005%\u0000\u0000"+
		"\u0292\u02b4\u00056\u0000\u0000\u0293\u0294\u0005C\u0000\u0000\u0294\u0295"+
		"\u0005\u0019\u0000\u0000\u0295\u0296\u0005C\u0000\u0000\u0296\u0297\u0005"+
		"%\u0000\u0000\u0297\u02b4\u0005;\u0000\u0000\u0298\u0299\u0005C\u0000"+
		"\u0000\u0299\u029a\u0005\u0019\u0000\u0000\u029a\u029b\u0005C\u0000\u0000"+
		"\u029b\u029c\u0005%\u0000\u0000\u029c\u02b4\u0003J%\u0000\u029d\u029e"+
		"\u0005C\u0000\u0000\u029e\u029f\u0005\u0019\u0000\u0000\u029f\u02a0\u0005"+
		"C\u0000\u0000\u02a0\u02a1\u0005%\u0000\u0000\u02a1\u02b4\u0003X,\u0000"+
		"\u02a2\u02a3\u0005B\u0000\u0000\u02a3\u02a4\u0005C\u0000\u0000\u02a4\u02a7"+
		"\u0005%\u0000\u0000\u02a5\u02a8\u0003H$\u0000\u02a6\u02a8\u0003X,\u0000"+
		"\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a8\u02b0\u0001\u0000\u0000\u0000\u02a9\u02ac\u0005\"\u0000\u0000\u02aa"+
		"\u02ad\u0003H$\u0000\u02ab\u02ad\u0003X,\u0000\u02ac\u02aa\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ab\u0001\u0000\u0000\u0000\u02ad\u02af\u0001\u0000"+
		"\u0000\u0000\u02ae\u02a9\u0001\u0000\u0000\u0000\u02af\u02b2\u0001\u0000"+
		"\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b1\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b3\u028e\u0001\u0000\u0000\u0000\u02b3\u0293\u0001\u0000"+
		"\u0000\u0000\u02b3\u0298\u0001\u0000\u0000\u0000\u02b3\u029d\u0001\u0000"+
		"\u0000\u0000\u02b3\u02a2\u0001\u0000\u0000\u0000\u02b4Q\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b6\u0005C\u0000\u0000\u02b6\u02b7\u0005.\u0000\u0000\u02b7"+
		"S\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005C\u0000\u0000\u02b9\u02ba\u0005"+
		"/\u0000\u0000\u02baU\u0001\u0000\u0000\u0000\u02bb\u02bc\u0005C\u0000"+
		"\u0000\u02bc\u02bd\u0005%\u0000\u0000\u02bd\u02c9\u0005C\u0000\u0000\u02be"+
		"\u02bf\u0005C\u0000\u0000\u02bf\u02c0\u0005%\u0000\u0000\u02c0\u02c1\u0005"+
		"C\u0000\u0000\u02c1\u02c2\u0005\u0019\u0000\u0000\u02c2\u02c9\u0005\u0017"+
		"\u0000\u0000\u02c3\u02c4\u0005C\u0000\u0000\u02c4\u02c5\u0005%\u0000\u0000"+
		"\u02c5\u02c6\u0005C\u0000\u0000\u02c6\u02c7\u0005\u0019\u0000\u0000\u02c7"+
		"\u02c9\u0005<\u0000\u0000\u02c8\u02bb\u0001\u0000\u0000\u0000\u02c8\u02be"+
		"\u0001\u0000\u0000\u0000\u02c8\u02c3\u0001\u0000\u0000\u0000\u02c9W\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cd\u0005C\u0000\u0000\u02cb\u02cd\u0003`0"+
		"\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cdY\u0001\u0000\u0000\u0000\u02ce\u02d5\u0005\'\u0000\u0000"+
		"\u02cf\u02d5\u0005&\u0000\u0000\u02d0\u02d5\u0005(\u0000\u0000\u02d1\u02d5"+
		"\u0005+\u0000\u0000\u02d2\u02d5\u0005)\u0000\u0000\u02d3\u02d5\u0005*"+
		"\u0000\u0000\u02d4\u02ce\u0001\u0000\u0000\u0000\u02d4\u02cf\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d0\u0001\u0000\u0000\u0000\u02d4\u02d1\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d5[\u0001\u0000\u0000\u0000\u02d6\u02dc\u0001\u0000\u0000"+
		"\u0000\u02d7\u02dc\u00050\u0000\u0000\u02d8\u02dc\u00051\u0000\u0000\u02d9"+
		"\u02dc\u00052\u0000\u0000\u02da\u02dc\u00053\u0000\u0000\u02db\u02d6\u0001"+
		"\u0000\u0000\u0000\u02db\u02d7\u0001\u0000\u0000\u0000\u02db\u02d8\u0001"+
		"\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02da\u0001"+
		"\u0000\u0000\u0000\u02dc]\u0001\u0000\u0000\u0000\u02dd\u02e3\u0001\u0000"+
		"\u0000\u0000\u02de\u02e3\u00057\u0000\u0000\u02df\u02e3\u00058\u0000\u0000"+
		"\u02e0\u02e3\u00059\u0000\u0000\u02e1\u02e3\u0005:\u0000\u0000\u02e2\u02dd"+
		"\u0001\u0000\u0000\u0000\u02e2\u02de\u0001\u0000\u0000\u0000\u02e2\u02df"+
		"\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e3_\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005"+
		"C\u0000\u0000\u02e5\u02e6\u0005\u0019\u0000\u0000\u02e6\u02ee\u0005\u0017"+
		"\u0000\u0000\u02e7\u02e8\u0005C\u0000\u0000\u02e8\u02e9\u0005\u0019\u0000"+
		"\u0000\u02e9\u02ee\u0005<\u0000\u0000\u02ea\u02eb\u0005C\u0000\u0000\u02eb"+
		"\u02ec\u0005\u0019\u0000\u0000\u02ec\u02ee\u0005C\u0000\u0000\u02ed\u02e4"+
		"\u0001\u0000\u0000\u0000\u02ed\u02e7\u0001\u0000\u0000\u0000\u02ed\u02ea"+
		"\u0001\u0000\u0000\u0000\u02eea\u0001\u0000\u0000\u0000kgnv{\u0080\u0085"+
		"\u0087\u008e\u0094\u009a\u00a2\u00a5\u00ab\u00af\u00b9\u00bc\u00c4\u00c7"+
		"\u00cc\u00d3\u00dc\u00ed\u00f3\u00f8\u00fc\u0105\u010e\u0114\u0119\u011e"+
		"\u0123\u0128\u012d\u012f\u0134\u0139\u013e\u0143\u0145\u014a\u014f\u0154"+
		"\u0159\u015e\u0160\u0168\u0172\u017c\u0183\u018b\u018f\u0194\u019b\u01a6"+
		"\u01b1\u01b9\u01be\u01c3\u01c8\u01ca\u01d0\u01d5\u01dc\u01e1\u01e3\u01e9"+
		"\u01ee\u01f3\u01f8\u01fd\u0202\u0207\u020c\u0211\u0213\u0218\u021e\u0224"+
		"\u0228\u022a\u0231\u0237\u023b\u023d\u0243\u0248\u024c\u0252\u0257\u025b"+
		"\u025e\u0261\u0268\u026f\u0278\u027c\u0286\u02a7\u02ac\u02b0\u02b3\u02c8"+
		"\u02cc\u02d4\u02db\u02e2\u02ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}