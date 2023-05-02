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
		RULE_program = 0, RULE_prototypes = 1, RULE_block = 2, RULE_startBlock = 3, 
		RULE_startBody = 4, RULE_functionsBlock = 5, RULE_funcBlockBody = 6, RULE_funcDec = 7, 
		RULE_funcOutputParam = 8, RULE_funcInputParam = 9, RULE_funcName = 10, 
		RULE_funcCall = 11, RULE_declaration = 12, RULE_initialization = 13, RULE_funcBody = 14, 
		RULE_statement = 15, RULE_ifThenStatement = 16, RULE_ifThenElseStatement = 17, 
		RULE_repeatStatement = 18, RULE_repeatUntilStatement = 19, RULE_whileStatement = 20, 
<<<<<<< Updated upstream
		RULE_statementBody = 21, RULE_condition = 22, RULE_expression = 23, RULE_operation = 24, 
		RULE_returnExp = 25, RULE_printExp = 26, RULE_askExp = 27, RULE_mathExpr = 28, 
		RULE_value = 29, RULE_textInit = 30, RULE_numberInit = 31, RULE_booleanInit = 32, 
		RULE_var = 33, RULE_val = 34, RULE_conditionalOperation = 35, RULE_mathematicalOperation = 36;
=======
		RULE_statementBody = 21, RULE_condition = 22, RULE_rightCondition = 23, 
		RULE_expression = 24, RULE_returnExp = 25, RULE_returnBody = 26, RULE_printExp = 27, 
		RULE_printBody = 28, RULE_askExp = 29, RULE_answerVal = 30, RULE_mathExp = 31, 
		RULE_textInit = 32, RULE_numberInit = 33, RULE_booleanInit = 34, RULE_val = 35, 
		RULE_conditionalOperation = 36, RULE_mathematicalOperation1 = 37, RULE_mathematicalOperation2 = 38;
>>>>>>> Stashed changes
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "prototypes", "block", "startBlock", "startBody", "functionsBlock", 
			"funcBlockBody", "funcDec", "funcOutputParam", "funcInputParam", "funcName", 
			"funcCall", "declaration", "initialization", "funcBody", "statement", 
			"ifThenStatement", "ifThenElseStatement", "repeatStatement", "repeatUntilStatement", 
<<<<<<< Updated upstream
			"whileStatement", "statementBody", "condition", "expression", "operation", 
			"returnExp", "printExp", "askExp", "mathExpr", "value", "textInit", "numberInit", 
			"booleanInit", "var", "val", "conditionalOperation", "mathematicalOperation"
=======
			"whileStatement", "statementBody", "condition", "rightCondition", "expression", 
			"returnExp", "returnBody", "printExp", "printBody", "askExp", "answerVal", 
			"mathExp", "textInit", "numberInit", "booleanInit", "val", "conditionalOperation", 
			"mathematicalOperation1", "mathematicalOperation2"
>>>>>>> Stashed changes
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
		public PrototypesContext prototypes() {
			return getRuleContext(PrototypesContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(74);
			block();
			setState(75);
=======
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(78);
				prototypes();
				}
			}

			setState(81);
			block();
			setState(82);
>>>>>>> Stashed changes
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
	public static class PrototypesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<FuncOutputParamContext> funcOutputParam() {
			return getRuleContexts(FuncOutputParamContext.class);
		}
		public FuncOutputParamContext funcOutputParam(int i) {
			return getRuleContext(FuncOutputParamContext.class,i);
		}
		public PrototypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterPrototypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitPrototypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitPrototypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrototypesContext prototypes() throws RecognitionException {
		PrototypesContext _localctx = new PrototypesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prototypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				match(ID);
				setState(85);
				funcOutputParam();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(77);
			startBlock();
			setState(79);
=======
			setState(90);
			startBlock();
			setState(92);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTIONS) {
				{
<<<<<<< Updated upstream
				setState(78);
=======
				setState(91);
>>>>>>> Stashed changes
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
		enterRule(_localctx, 6, RULE_startBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(81);
			match(START);
			setState(82);
			match(LBRACE);
			setState(86);
=======
			setState(94);
			match(START);
			setState(95);
			match(BEGIN);
			setState(99);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6922032627275824072L) != 0) || _la==ID) {
				{
				{
<<<<<<< Updated upstream
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
=======
				setState(96);
				startBody();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(END);
>>>>>>> Stashed changes
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
		enterRule(_localctx, 8, RULE_startBody);
		try {
			int _alt;
<<<<<<< Updated upstream
			setState(111);
=======
			setState(124);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
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
=======
				setState(105); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(106);
						statement();
=======
						setState(104);
						declaration();
>>>>>>> Stashed changes
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(109); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(109);
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(112); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(114);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(117); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(119);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(122); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 10, RULE_functionsBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(113);
			match(FUNCTIONS);
			setState(114);
			match(LBRACE);
			setState(118);
=======
			setState(126);
			match(FUNCTIONS);
			setState(127);
			match(BEGIN);
			setState(131);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 456L) != 0) || _la==ID) {
				{
				{
<<<<<<< Updated upstream
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
=======
				setState(128);
				funcBlockBody();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(END);
>>>>>>> Stashed changes
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
		enterRule(_localctx, 12, RULE_funcBlockBody);
		try {
			int _alt;
<<<<<<< Updated upstream
			setState(138);
=======
			setState(151);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(124); 
=======
				setState(137); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(123);
=======
						setState(136);
>>>>>>> Stashed changes
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(126); 
=======
					setState(139); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(129); 
=======
				setState(142); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(128);
=======
						setState(141);
>>>>>>> Stashed changes
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(131); 
=======
					setState(144); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(134); 
=======
				setState(147); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(133);
=======
						setState(146);
>>>>>>> Stashed changes
						funcDec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(136); 
=======
					setState(149); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public TerminalNode BEGIN() { return getToken(TLParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(TLParser.END, 0); }
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
		enterRule(_localctx, 14, RULE_funcDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(140);
			match(FUNC);
			setState(141);
			((FuncDecContext)_localctx).funcID = funcName();
			setState(143);
=======
			setState(153);
			match(FUNC);
			setState(154);
			((FuncDecContext)_localctx).funcID = funcName();
			setState(156);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
<<<<<<< Updated upstream
				setState(142);
=======
				setState(155);
>>>>>>> Stashed changes
				funcOutputParam();
				}
			}

<<<<<<< Updated upstream
			setState(145);
			match(LBRACE);
			setState(149);
=======
			setState(158);
			match(BEGIN);
			setState(162);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6922032627275824072L) != 0) || _la==ID) {
				{
				{
<<<<<<< Updated upstream
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
=======
				setState(159);
				funcBody();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public TerminalNode LPAREN() { return getToken(TLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TLParser.RPAREN, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
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
			setState(167);
			match(LPAREN);
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case NUMBER:
				case TEXT:
					{
					setState(168);
					declaration();
					}
					break;
				case ID:
					{
					setState(169);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & 2305843009213693959L) != 0)) {
					{
					{
					setState(174);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BOOLEAN:
					case NUMBER:
					case TEXT:
						{
						setState(172);
						declaration();
						}
						break;
					case ID:
						{
						setState(173);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(176);
					match(COMMA);
					setState(179);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BOOLEAN:
					case NUMBER:
					case TEXT:
						{
						setState(177);
						declaration();
						}
						break;
					case ID:
						{
						setState(178);
						match(ID);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(188);
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
		enterRule(_localctx, 18, RULE_funcInputParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(LPAREN);
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(191);
				match(ID);
				}
				break;
			case 2:
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(192);
					match(ID);
					setState(193);
					match(COMMA);
					setState(194);
					match(ID);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(202);
			match(RPAREN);
>>>>>>> Stashed changes
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
		enterRule(_localctx, 20, RULE_funcName);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(154);
=======
			setState(204);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
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
=======
>>>>>>> Stashed changes
	public static class FuncCallContext extends ParserRuleContext {
		public Token funcID;
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
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
		enterRule(_localctx, 22, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(195);
=======
			setState(207);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RUN) {
				{
<<<<<<< Updated upstream
				setState(194);
=======
				setState(206);
>>>>>>> Stashed changes
				match(RUN);
				}
			}

<<<<<<< Updated upstream
			setState(197);
			((FuncCallContext)_localctx).funcID = funcName();
			setState(199);
=======
			setState(209);
			((FuncCallContext)_localctx).funcID = match(ID);
			setState(211);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
<<<<<<< Updated upstream
				setState(198);
=======
				setState(210);
>>>>>>> Stashed changes
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
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolDecContext extends DeclarationContext {
		public TerminalNode BOOLEAN() { return getToken(TLParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public BoolDecContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterBoolDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitBoolDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitBoolDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextDecContext extends DeclarationContext {
		public TerminalNode TEXT() { return getToken(TLParser.TEXT, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TextDecContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterTextDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitTextDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitTextDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberDecContext extends DeclarationContext {
		public TerminalNode NUMBER() { return getToken(TLParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public NumberDecContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterNumberDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitNumberDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitNumberDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		try {
<<<<<<< Updated upstream
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((DeclarationContext)_localctx).dt = dataType();
			setState(202);
			var();
=======
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(NUMBER);
				setState(214);
				match(ID);
				}
				break;
			case TEXT:
				_localctx = new TextDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(TEXT);
				setState(216);
				match(ID);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(BOOLEAN);
				setState(218);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
>>>>>>> Stashed changes
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
		enterRule(_localctx, 26, RULE_initialization);
		try {
			int _alt;
<<<<<<< Updated upstream
			setState(219);
=======
			setState(236);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(205); 
=======
				setState(222); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(204);
=======
						setState(221);
>>>>>>> Stashed changes
						textInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(207); 
=======
					setState(224); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(210); 
=======
				setState(227); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(209);
=======
						setState(226);
>>>>>>> Stashed changes
						numberInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(212); 
=======
					setState(229); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(215); 
=======
				setState(232); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(214);
=======
						setState(231);
>>>>>>> Stashed changes
						booleanInit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(217); 
=======
					setState(234); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
<<<<<<< Updated upstream
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
=======
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
			setState(246);
=======
			setState(258);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(227); 
=======
				setState(239); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(226);
=======
						setState(238);
>>>>>>> Stashed changes
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(229); 
=======
					setState(241); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(232); 
=======
				setState(244); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(231);
=======
						setState(243);
>>>>>>> Stashed changes
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(234); 
=======
					setState(246); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(237); 
=======
				setState(249); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(236);
=======
						setState(248);
>>>>>>> Stashed changes
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(239); 
=======
					setState(251); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< Updated upstream
				setState(242); 
=======
				setState(254); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(241);
=======
						setState(253);
>>>>>>> Stashed changes
						initialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(244); 
=======
					setState(256); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
<<<<<<< Updated upstream
			setState(273);
=======
			setState(285);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(249); 
=======
				setState(261); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(248);
=======
						setState(260);
>>>>>>> Stashed changes
						ifThenStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(251); 
=======
					setState(263); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(254); 
=======
				setState(266); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(253);
=======
						setState(265);
>>>>>>> Stashed changes
						ifThenElseStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(256); 
=======
					setState(268); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(259); 
=======
				setState(271); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(258);
=======
						setState(270);
>>>>>>> Stashed changes
						repeatStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(261); 
=======
					setState(273); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< Updated upstream
				setState(264); 
=======
				setState(276); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(263);
=======
						setState(275);
>>>>>>> Stashed changes
						repeatUntilStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(266); 
=======
					setState(278); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< Updated upstream
				setState(269); 
=======
				setState(281); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(268);
=======
						setState(280);
>>>>>>> Stashed changes
						whileStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(271); 
=======
					setState(283); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 32, RULE_ifThenStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
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
=======
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
>>>>>>> Stashed changes
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
		public TerminalNode ELSE() { return getToken(TLParser.ELSE, 0); }
		public List<TerminalNode> BEGIN() { return getTokens(TLParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(TLParser.BEGIN, i);
		}
		public TerminalNode THEN() { return getToken(TLParser.THEN, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
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
=======
			setState(293);
			match(IF);
			setState(294);
			condition();
			setState(295);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(296);
			statementBody();
			setState(297);
			match(END);
			setState(305);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
<<<<<<< Updated upstream
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
=======
				setState(298);
				match(ELSE_IF);
				setState(299);
				match(BEGIN);
				setState(300);
				statementBody();
				setState(301);
				match(END);
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			match(ELSE);
			setState(309);
			match(BEGIN);
			setState(310);
>>>>>>> Stashed changes
			statementBody();
			setState(311);
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
		enterRule(_localctx, 36, RULE_repeatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
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
=======
			setState(313);
			match(REPEAT);
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==NUMBER_VAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(315);
			match(TIMES);
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(317);
			statementBody();
			setState(318);
			match(END);
>>>>>>> Stashed changes
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
		enterRule(_localctx, 38, RULE_repeatUntilStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
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
=======
			setState(320);
			match(REPEAT_UNTIL);
			setState(321);
			condition();
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(323);
			statementBody();
			setState(324);
			match(END);
>>>>>>> Stashed changes
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
		enterRule(_localctx, 40, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
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
=======
			setState(326);
			match(WHILE);
			setState(327);
			condition();
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==DO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(329);
			statementBody();
			setState(330);
			match(END);
>>>>>>> Stashed changes
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		int _la;
		try {
<<<<<<< Updated upstream
			int _alt;
			setState(339);
=======
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6922032627275792904L) != 0) || _la==ID) {
				{
<<<<<<< Updated upstream
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
=======
				{
				setState(332);
				expression();
>>>>>>> Stashed changes
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) {
				{
				{
				setState(338);
				declaration();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) {
				{
				{
				setState(344);
				statement();
				}
				}
				setState(349);
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
		public ValContext leftCon;
		public RightConditionContext rightCondition() {
			return getRuleContext(RightConditionContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
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
		enterRule(_localctx, 44, RULE_condition);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new Con1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				((Con1Context)_localctx).leftCon = val();
				setState(351);
				rightCondition();
				}
				break;
			case 2:
				_localctx = new Con2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(ID);
				}
				break;
			case 3:
				_localctx = new Con3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				match(NOTEQUAL);
				setState(355);
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
		public ValContext rightCon;
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
		enterRule(_localctx, 46, RULE_rightCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
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
=======
			setState(361); 
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
<<<<<<< Updated upstream
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
=======
				{
				setState(358);
				((RightConditionContext)_localctx).op = conditionalOperation();
				setState(359);
				((RightConditionContext)_localctx).rightCon = val();
				}
				}
				setState(363); 
>>>>>>> Stashed changes
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
		enterRule(_localctx, 48, RULE_expression);
		try {
			int _alt;
<<<<<<< Updated upstream
			setState(385);
=======
			setState(395);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(356); 
=======
				setState(366); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(355);
=======
						setState(365);
>>>>>>> Stashed changes
						funcCall();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(358); 
=======
					setState(368); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(361); 
=======
				setState(371); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(360);
=======
						setState(370);
>>>>>>> Stashed changes
						funcDec();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(363); 
=======
					setState(373); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(366); 
=======
				setState(376); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(365);
=======
						setState(375);
>>>>>>> Stashed changes
						returnExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(368); 
=======
					setState(378); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< Updated upstream
				setState(371); 
=======
				setState(381); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(370);
=======
						setState(380);
>>>>>>> Stashed changes
						printExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(373); 
=======
					setState(383); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< Updated upstream
				setState(376); 
=======
				setState(386); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(375);
=======
						setState(385);
>>>>>>> Stashed changes
						askExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(378); 
=======
					setState(388); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< Updated upstream
				setState(381); 
=======
				setState(391); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(380);
						mathExpr();
=======
						setState(390);
						mathExp();
>>>>>>> Stashed changes
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(383); 
=======
					setState(393); 
>>>>>>> Stashed changes
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
<<<<<<< Updated upstream
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
=======
>>>>>>> Stashed changes
	public static class ReturnExpContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(TLParser.RETURN, 0); }
		public ReturnBodyContext returnBody() {
			return getRuleContext(ReturnBodyContext.class,0);
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
<<<<<<< Updated upstream
			setState(392);
			match(RETURN);
			setState(393);
			var();
=======
			setState(397);
			match(RETURN);
			setState(398);
			returnBody();
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
	public static class ReturnBodyContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ReturnBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterReturnBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitReturnBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitReturnBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnBodyContext returnBody() throws RecognitionException {
		ReturnBodyContext _localctx = new ReturnBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			val();
>>>>>>> Stashed changes
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
		public PrintBodyContext printBody() {
			return getRuleContext(PrintBodyContext.class,0);
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
		enterRule(_localctx, 54, RULE_printExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(PRINT);
			setState(403);
			printBody();
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
	public static class PrintBodyContext extends ParserRuleContext {
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
		public PrintBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterPrintBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitPrintBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitPrintBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintBodyContext printBody() throws RecognitionException {
		PrintBodyContext _localctx = new PrintBodyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_printBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
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
=======
			{
			setState(405);
			val();
			}
			setState(412);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD) {
				{
<<<<<<< Updated upstream
				setState(407); 
=======
				setState(408); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
<<<<<<< Updated upstream
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
=======
					setState(406);
					match(ADD);
					{
					setState(407);
					val();
					}
					}
					}
					setState(410); 
>>>>>>> Stashed changes
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
		public PrintBodyContext printBody() {
			return getRuleContext(PrintBodyContext.class,0);
		}
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
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
=======
			setState(414);
			match(ASK);
			setState(415);
			((AskExpContext)_localctx).askID = match(ID);
			setState(416);
			printBody();
>>>>>>> Stashed changes
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
			setState(418);
			((AnswerValContext)_localctx).askID = match(ID);
			setState(419);
			match(DOT);
			setState(420);
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
<<<<<<< Updated upstream
	public static class MathExprContext extends ParserRuleContext {
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
	 
		public MathExprContext() { }
		public void copyFrom(MathExprContext ctx) {
=======
	public static class MathExpContext extends ParserRuleContext {
		public MathExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExp; }
	 
		public MathExpContext() { }
		public void copyFrom(MathExpContext ctx) {
>>>>>>> Stashed changes
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
<<<<<<< Updated upstream
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
=======
	public static class MathExp2Context extends MathExpContext {
		public ValContext left;
		public MathematicalOperation2Context mathOp;
		public ValContext right;
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public MathematicalOperation2Context mathematicalOperation2() {
			return getRuleContext(MathematicalOperation2Context.class,0);
		}
		public MathExp2Context(MathExpContext ctx) { copyFrom(ctx); }
>>>>>>> Stashed changes
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
		public ValContext left;
		public MathematicalOperation1Context mathOp;
		public ValContext right;
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
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

<<<<<<< Updated upstream
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
=======
	public final MathExpContext mathExp() throws RecognitionException {
		MathExpContext _localctx = new MathExpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mathExp);
		try {
			int _alt;
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				_localctx = new MathExp1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(ID);
				setState(423);
				match(ASSIGN);
				setState(424);
				((MathExp1Context)_localctx).left = val();
				setState(428); 
>>>>>>> Stashed changes
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
<<<<<<< Updated upstream
						setState(434);
						((MathExpContext)_localctx).right = value();
=======
						setState(425);
						((MathExp1Context)_localctx).mathOp = mathematicalOperation1();
						setState(426);
						((MathExp1Context)_localctx).right = val();
>>>>>>> Stashed changes
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
<<<<<<< Updated upstream
					setState(437); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
=======
					setState(430); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
>>>>>>> Stashed changes
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new MathExp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				((MathExp2Context)_localctx).left = val();
				setState(433);
				((MathExp2Context)_localctx).mathOp = mathematicalOperation2();
				setState(434);
				((MathExp2Context)_localctx).right = val();
				}
<<<<<<< Updated upstream
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131945690300416L) != 0) );
=======
				break;
>>>>>>> Stashed changes
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
		public Token var1ID;
		public Token var2ID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
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
<<<<<<< Updated upstream
		enterRule(_localctx, 60, RULE_textInit);
=======
		enterRule(_localctx, 64, RULE_textInit);
>>>>>>> Stashed changes
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(448);
=======
			setState(439);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT) {
				{
<<<<<<< Updated upstream
				setState(447);
=======
				setState(438);
>>>>>>> Stashed changes
				match(TEXT);
				}
			}

<<<<<<< Updated upstream
			setState(450);
			var();
			setState(451);
			match(ASSIGN);
			setState(452);
			match(TEXT_VAL);
=======
			setState(441);
			((TextInitContext)_localctx).var1ID = match(ID);
			setState(442);
			match(ASSIGN);
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_VAL:
				{
				setState(443);
				match(TEXT_VAL);
				}
				break;
			case ID:
				{
				setState(444);
				((TextInitContext)_localctx).var2ID = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
>>>>>>> Stashed changes
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
		public Token var2ID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
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
<<<<<<< Updated upstream
		enterRule(_localctx, 62, RULE_numberInit);
=======
		enterRule(_localctx, 66, RULE_numberInit);
>>>>>>> Stashed changes
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(455);
=======
			setState(448);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
<<<<<<< Updated upstream
				setState(454);
=======
				setState(447);
>>>>>>> Stashed changes
				match(NUMBER);
				}
			}

<<<<<<< Updated upstream
			setState(457);
			var();
			setState(458);
			match(ASSIGN);
			setState(459);
			match(NUMBER_VAL);
=======
			setState(450);
			((NumberInitContext)_localctx).var1ID = match(ID);
			setState(451);
			match(ASSIGN);
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_VAL:
				{
				setState(452);
				match(NUMBER_VAL);
				}
				break;
			case ID:
				{
				setState(453);
				((NumberInitContext)_localctx).var2ID = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
>>>>>>> Stashed changes
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
		public Token var2ID;
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
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
<<<<<<< Updated upstream
		enterRule(_localctx, 64, RULE_booleanInit);
=======
		enterRule(_localctx, 68, RULE_booleanInit);
>>>>>>> Stashed changes
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< Updated upstream
			setState(462);
=======
			setState(457);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOLEAN) {
				{
<<<<<<< Updated upstream
				setState(461);
=======
				setState(456);
>>>>>>> Stashed changes
				match(BOOLEAN);
				}
			}

<<<<<<< Updated upstream
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
=======
			setState(459);
			((BooleanInitContext)_localctx).var1ID = match(ID);
			setState(460);
			match(ASSIGN);
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
				{
				setState(461);
				match(BOOL_LITERAL);
				}
				break;
			case ID:
				{
				setState(462);
				((BooleanInitContext)_localctx).var2ID = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
>>>>>>> Stashed changes
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
		public Token variable;
		public TerminalNode TEXT_VAL() { return getToken(TLParser.TEXT_VAL, 0); }
		public TerminalNode NUMBER_VAL() { return getToken(TLParser.NUMBER_VAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(TLParser.BOOL_LITERAL, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
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
<<<<<<< Updated upstream
		enterRule(_localctx, 68, RULE_val);
		try {
			setState(473);
=======
		enterRule(_localctx, 70, RULE_val);
		try {
			setState(469);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_VAL:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(470);
=======
				setState(465);
>>>>>>> Stashed changes
				((ValContext)_localctx).textVal = match(TEXT_VAL);
				}
				break;
			case NUMBER_VAL:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(471);
=======
				setState(466);
>>>>>>> Stashed changes
				((ValContext)_localctx).numberVal = match(NUMBER_VAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(472);
=======
				setState(467);
>>>>>>> Stashed changes
				((ValContext)_localctx).boolVal = match(BOOL_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				((ValContext)_localctx).variable = match(ID);
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
<<<<<<< Updated upstream
		enterRule(_localctx, 70, RULE_conditionalOperation);
		try {
			setState(481);
=======
		enterRule(_localctx, 72, RULE_conditionalOperation);
		try {
			setState(477);
>>>>>>> Stashed changes
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< Updated upstream
				setState(475);
				((ConditionalOperationContext)_localctx).conOp = match(LT);
=======
				setState(471);
				((ConditionalOperationContext)_localctx).conOpLT = match(LT);
>>>>>>> Stashed changes
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< Updated upstream
				setState(476);
				((ConditionalOperationContext)_localctx).conOp = match(GT);
=======
				setState(472);
				((ConditionalOperationContext)_localctx).conOpGT = match(GT);
>>>>>>> Stashed changes
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< Updated upstream
				setState(477);
				((ConditionalOperationContext)_localctx).conOp = match(EQUAL);
=======
				setState(473);
				((ConditionalOperationContext)_localctx).conOpEQ = match(EQUAL);
>>>>>>> Stashed changes
				}
				break;
			case NOTEQUAL:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< Updated upstream
				setState(478);
				((ConditionalOperationContext)_localctx).conOp = match(NOTEQUAL);
=======
				setState(474);
				((ConditionalOperationContext)_localctx).conOpNEQ = match(NOTEQUAL);
>>>>>>> Stashed changes
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< Updated upstream
				setState(479);
				((ConditionalOperationContext)_localctx).conOp = match(LE);
=======
				setState(475);
				((ConditionalOperationContext)_localctx).conOpLE = match(LE);
>>>>>>> Stashed changes
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< Updated upstream
				setState(480);
				((ConditionalOperationContext)_localctx).conOp = match(GE);
=======
				setState(476);
				((ConditionalOperationContext)_localctx).conOpGE = match(GE);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
	public static class MathematicalOperationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(TLParser.ASSIGN, 0); }
=======
	public static class MathematicalOperation1Context extends ParserRuleContext {
		public Token mathOpADD;
		public Token mathOpSUB;
		public Token mathOpMUL;
		public Token mathOpDIV;
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
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
=======
	public final MathematicalOperation1Context mathematicalOperation1() throws RecognitionException {
		MathematicalOperation1Context _localctx = new MathematicalOperation1Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_mathematicalOperation1);
		try {
			setState(484);
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
				setState(480);
				((MathematicalOperation1Context)_localctx).mathOpADD = match(ADD);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				((MathematicalOperation1Context)_localctx).mathOpSUB = match(SUB);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				((MathematicalOperation1Context)_localctx).mathOpMUL = match(MUL);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 5);
				{
				setState(483);
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
		enterRule(_localctx, 76, RULE_mathematicalOperation2);
		try {
			setState(491);
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
				setState(487);
				((MathematicalOperation2Context)_localctx).mathOpADD = match(ADD_ASSIGN);
				}
				break;
			case SUB_ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				((MathematicalOperation2Context)_localctx).mathOpSUB = match(SUB_ASSIGN);
				}
				break;
			case MUL_ASSIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				((MathematicalOperation2Context)_localctx).mathOpMUL = match(MUL_ASSIGN);
				}
				break;
			case DIV_ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(490);
				((MathematicalOperation2Context)_localctx).mathOpDIV = match(DIV_ASSIGN);
				}
				break;
			default:
				throw new NoViableAltException(this);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
		"\u0004\u0001@\u01e6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
=======
		"\u0004\u0001C\u01ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
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
=======
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0003\u0000"+
		"P\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0004\u0001W\b\u0001\u000b\u0001\f\u0001X\u0001\u0002\u0001\u0002\u0003"+
		"\u0002]\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003b\b\u0003"+
		"\n\u0003\f\u0003e\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004"+
		"j\b\u0004\u000b\u0004\f\u0004k\u0001\u0004\u0004\u0004o\b\u0004\u000b"+
		"\u0004\f\u0004p\u0001\u0004\u0004\u0004t\b\u0004\u000b\u0004\f\u0004u"+
		"\u0001\u0004\u0004\u0004y\b\u0004\u000b\u0004\f\u0004z\u0003\u0004}\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0082\b\u0005\n"+
		"\u0005\f\u0005\u0085\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004"+
		"\u0006\u008a\b\u0006\u000b\u0006\f\u0006\u008b\u0001\u0006\u0004\u0006"+
		"\u008f\b\u0006\u000b\u0006\f\u0006\u0090\u0001\u0006\u0004\u0006\u0094"+
		"\b\u0006\u000b\u0006\f\u0006\u0095\u0003\u0006\u0098\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u009d\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00a1\b\u0007\n\u0007\f\u0007\u00a4\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00ab\b\b\u0001\b\u0001\b\u0003"+
		"\b\u00af\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b4\b\b\u0005\b\u00b6\b"+
		"\b\n\b\f\b\u00b9\t\b\u0003\b\u00bb\b\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0005\t\u00c4\b\t\n\t\f\t\u00c7\t\t\u0003\t\u00c9"+
		"\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0003\u000b\u00d0\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00d4\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00dc\b\f\u0001\r\u0004\r\u00df\b\r"+
		"\u000b\r\f\r\u00e0\u0001\r\u0004\r\u00e4\b\r\u000b\r\f\r\u00e5\u0001\r"+
		"\u0004\r\u00e9\b\r\u000b\r\f\r\u00ea\u0003\r\u00ed\b\r\u0001\u000e\u0004"+
		"\u000e\u00f0\b\u000e\u000b\u000e\f\u000e\u00f1\u0001\u000e\u0004\u000e"+
		"\u00f5\b\u000e\u000b\u000e\f\u000e\u00f6\u0001\u000e\u0004\u000e\u00fa"+
		"\b\u000e\u000b\u000e\f\u000e\u00fb\u0001\u000e\u0004\u000e\u00ff\b\u000e"+
		"\u000b\u000e\f\u000e\u0100\u0003\u000e\u0103\b\u000e\u0001\u000f\u0004"+
		"\u000f\u0106\b\u000f\u000b\u000f\f\u000f\u0107\u0001\u000f\u0004\u000f"+
		"\u010b\b\u000f\u000b\u000f\f\u000f\u010c\u0001\u000f\u0004\u000f\u0110"+
		"\b\u000f\u000b\u000f\f\u000f\u0111\u0001\u000f\u0004\u000f\u0115\b\u000f"+
		"\u000b\u000f\f\u000f\u0116\u0001\u000f\u0004\u000f\u011a\b\u000f\u000b"+
		"\u000f\f\u000f\u011b\u0003\u000f\u011e\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u0130\b\u0011\n\u0011\f\u0011\u0133"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0005\u0015\u014e\b\u0015\n\u0015\f\u0015\u0151\t\u0015"+
		"\u0001\u0015\u0005\u0015\u0154\b\u0015\n\u0015\f\u0015\u0157\t\u0015\u0001"+
		"\u0015\u0005\u0015\u015a\b\u0015\n\u0015\f\u0015\u015d\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0165\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u016a\b"+
		"\u0017\u000b\u0017\f\u0017\u016b\u0001\u0018\u0004\u0018\u016f\b\u0018"+
		"\u000b\u0018\f\u0018\u0170\u0001\u0018\u0004\u0018\u0174\b\u0018\u000b"+
		"\u0018\f\u0018\u0175\u0001\u0018\u0004\u0018\u0179\b\u0018\u000b\u0018"+
		"\f\u0018\u017a\u0001\u0018\u0004\u0018\u017e\b\u0018\u000b\u0018\f\u0018"+
		"\u017f\u0001\u0018\u0004\u0018\u0183\b\u0018\u000b\u0018\f\u0018\u0184"+
		"\u0001\u0018\u0004\u0018\u0188\b\u0018\u000b\u0018\f\u0018\u0189\u0003"+
		"\u0018\u018c\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0004\u001c\u0199\b\u001c\u000b\u001c\f\u001c\u019a\u0003\u001c"+
		"\u019d\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u01ad\b\u001f\u000b\u001f"+
		"\f\u001f\u01ae\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u01b5\b\u001f\u0001 \u0003 \u01b8\b \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u01be\b \u0001!\u0003!\u01c1\b!\u0001!\u0001!\u0001!\u0001!\u0003!\u01c7"+
		"\b!\u0001\"\u0003\"\u01ca\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\""+
		"\u01d0\b\"\u0001#\u0001#\u0001#\u0001#\u0003#\u01d6\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u01de\b$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u01e5\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u01ec\b&\u0001"+
		"&\u0000\u0000\'\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJL\u0000\u0003\u0002"+
		"\u0000\u0004\u0004\u0011\u0011\u0002\u0000>>CC\u0002\u0000\u0004\u0004"+
		"\u0012\u0012\u0225\u0000O\u0001\u0000\u0000\u0000\u0002V\u0001\u0000\u0000"+
		"\u0000\u0004Z\u0001\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000\b"+
		"|\u0001\u0000\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u0097\u0001\u0000"+
		"\u0000\u0000\u000e\u0099\u0001\u0000\u0000\u0000\u0010\u00a7\u0001\u0000"+
		"\u0000\u0000\u0012\u00be\u0001\u0000\u0000\u0000\u0014\u00cc\u0001\u0000"+
		"\u0000\u0000\u0016\u00cf\u0001\u0000\u0000\u0000\u0018\u00db\u0001\u0000"+
		"\u0000\u0000\u001a\u00ec\u0001\u0000\u0000\u0000\u001c\u0102\u0001\u0000"+
		"\u0000\u0000\u001e\u011d\u0001\u0000\u0000\u0000 \u011f\u0001\u0000\u0000"+
		"\u0000\"\u0125\u0001\u0000\u0000\u0000$\u0139\u0001\u0000\u0000\u0000"+
		"&\u0140\u0001\u0000\u0000\u0000(\u0146\u0001\u0000\u0000\u0000*\u014f"+
		"\u0001\u0000\u0000\u0000,\u0164\u0001\u0000\u0000\u0000.\u0169\u0001\u0000"+
		"\u0000\u00000\u018b\u0001\u0000\u0000\u00002\u018d\u0001\u0000\u0000\u0000"+
		"4\u0190\u0001\u0000\u0000\u00006\u0192\u0001\u0000\u0000\u00008\u0195"+
		"\u0001\u0000\u0000\u0000:\u019e\u0001\u0000\u0000\u0000<\u01a2\u0001\u0000"+
		"\u0000\u0000>\u01b4\u0001\u0000\u0000\u0000@\u01b7\u0001\u0000\u0000\u0000"+
		"B\u01c0\u0001\u0000\u0000\u0000D\u01c9\u0001\u0000\u0000\u0000F\u01d5"+
		"\u0001\u0000\u0000\u0000H\u01dd\u0001\u0000\u0000\u0000J\u01e4\u0001\u0000"+
		"\u0000\u0000L\u01eb\u0001\u0000\u0000\u0000NP\u0003\u0002\u0001\u0000"+
		"ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QR\u0003\u0004\u0002\u0000RS\u0005\u0000\u0000\u0001S\u0001\u0001"+
		"\u0000\u0000\u0000TU\u0005C\u0000\u0000UW\u0003\u0010\b\u0000VT\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y\u0003\u0001\u0000\u0000\u0000Z\\\u0003\u0006"+
		"\u0003\u0000[]\u0003\n\u0005\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]\u0005\u0001\u0000\u0000\u0000^_\u0005\u0001\u0000"+
		"\u0000_c\u0005\u0004\u0000\u0000`b\u0003\b\u0004\u0000a`\u0001\u0000\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0005\u0000\u0000g\u0007\u0001\u0000\u0000\u0000hj\u0003\u0018\f\u0000"+
		"ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000l}\u0001\u0000\u0000\u0000mo\u0003\u001a"+
		"\r\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000q}\u0001\u0000\u0000\u0000rt\u0003"+
		"0\u0018\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v}\u0001\u0000\u0000\u0000"+
		"wy\u0003\u001e\u000f\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000"+
		"\u0000\u0000|i\u0001\u0000\u0000\u0000|n\u0001\u0000\u0000\u0000|s\u0001"+
		"\u0000\u0000\u0000|x\u0001\u0000\u0000\u0000}\t\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u0002\u0000\u0000\u007f\u0083\u0005\u0004\u0000\u0000\u0080"+
		"\u0082\u0003\f\u0006\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0005\u0000\u0000\u0087\u000b"+
		"\u0001\u0000\u0000\u0000\u0088\u008a\u0003\u0018\f\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0098\u0001"+
		"\u0000\u0000\u0000\u008d\u008f\u0003\u001a\r\u0000\u008e\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0098\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\u0003\u000e\u0007\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000"+
		"\u0000\u0000\u0097\u0089\u0001\u0000\u0000\u0000\u0097\u008e\u0001\u0000"+
		"\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0098\r\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a\u009c\u0003\u0014\n\u0000"+
		"\u009b\u009d\u0003\u0010\b\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u00a2\u0005\u0004\u0000\u0000\u009f\u00a1\u0003\u001c\u000e\u0000\u00a0"+
		"\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0005\u0000\u0000\u00a6\u000f\u0001\u0000\u0000\u0000\u00a7"+
		"\u00ba\u0005\u0019\u0000\u0000\u00a8\u00ab\u0003\u0018\f\u0000\u00a9\u00ab"+
		"\u0005C\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00bb\u0001\u0000\u0000\u0000\u00ac\u00af\u0003"+
		"\u0018\f\u0000\u00ad\u00af\u0005C\u0000\u0000\u00ae\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0005 \u0000\u0000\u00b1\u00b4\u0003\u0018\f"+
		"\u0000\u00b2\u00b4\u0005C\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b5\u00ae\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00ba\u00aa\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u001a\u0000\u0000"+
		"\u00bd\u0011\u0001\u0000\u0000\u0000\u00be\u00c8\u0005\u0019\u0000\u0000"+
		"\u00bf\u00c9\u0005C\u0000\u0000\u00c0\u00c1\u0005C\u0000\u0000\u00c1\u00c2"+
		"\u0005 \u0000\u0000\u00c2\u00c4\u0005C\u0000\u0000\u00c3\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005\u001a\u0000\u0000\u00cb\u0013\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005C\u0000\u0000\u00cd\u0015\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d0\u0005\u0016\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d3\u0005C\u0000\u0000\u00d2\u00d4\u0003\u0012\t\u0000"+
		"\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u0017\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0007\u0000\u0000"+
		"\u00d6\u00dc\u0005C\u0000\u0000\u00d7\u00d8\u0005\b\u0000\u0000\u00d8"+
		"\u00dc\u0005C\u0000\u0000\u00d9\u00da\u0005\u0006\u0000\u0000\u00da\u00dc"+
		"\u0005C\u0000\u0000\u00db\u00d5\u0001\u0000\u0000\u0000\u00db\u00d7\u0001"+
		"\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u0019\u0001"+
		"\u0000\u0000\u0000\u00dd\u00df\u0003@ \u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00ed\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e4\u0003B!\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00ed\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e9\u0003D\"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00de"+
		"\u0001\u0000\u0000\u0000\u00ec\u00e3\u0001\u0000\u0000\u0000\u00ec\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ed\u001b\u0001\u0000\u0000\u0000\u00ee\u00f0"+
		"\u0003\u001e\u000f\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u0103\u0001\u0000\u0000\u0000\u00f3\u00f5"+
		"\u00030\u0018\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f7\u0103\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003"+
		"\u0018\f\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u0103\u0001\u0000\u0000\u0000\u00fd\u00ff\u0003\u001a"+
		"\r\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"+
		"\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00ef\u0001\u0000\u0000"+
		"\u0000\u0102\u00f4\u0001\u0000\u0000\u0000\u0102\u00f9\u0001\u0000\u0000"+
		"\u0000\u0102\u00fe\u0001\u0000\u0000\u0000\u0103\u001d\u0001\u0000\u0000"+
		"\u0000\u0104\u0106\u0003 \u0010\u0000\u0105\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u011e\u0001\u0000\u0000\u0000"+
		"\u0109\u010b\u0003\"\u0011\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u011e\u0001\u0000\u0000\u0000\u010e"+
		"\u0110\u0003$\u0012\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0001\u0000\u0000\u0000\u0112\u011e\u0001\u0000\u0000\u0000\u0113\u0115"+
		"\u0003&\u0013\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u011e\u0001\u0000\u0000\u0000\u0118\u011a\u0003"+
		"(\u0014\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000"+
		"\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u0105\u0001\u0000"+
		"\u0000\u0000\u011d\u010a\u0001\u0000\u0000\u0000\u011d\u010f\u0001\u0000"+
		"\u0000\u0000\u011d\u0114\u0001\u0000\u0000\u0000\u011d\u0119\u0001\u0000"+
		"\u0000\u0000\u011e\u001f\u0001\u0000\u0000\u0000\u011f\u0120\u0005\u000e"+
		"\u0000\u0000\u0120\u0121\u0003,\u0016\u0000\u0121\u0122\u0007\u0000\u0000"+
		"\u0000\u0122\u0123\u0003*\u0015\u0000\u0123\u0124\u0005\u0005\u0000\u0000"+
		"\u0124!\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u000e\u0000\u0000\u0126"+
		"\u0127\u0003,\u0016\u0000\u0127\u0128\u0007\u0000\u0000\u0000\u0128\u0129"+
		"\u0003*\u0015\u0000\u0129\u0131\u0005\u0005\u0000\u0000\u012a\u012b\u0005"+
		"\u0010\u0000\u0000\u012b\u012c\u0005\u0004\u0000\u0000\u012c\u012d\u0003"+
		"*\u0015\u0000\u012d\u012e\u0005\u0005\u0000\u0000\u012e\u0130\u0001\u0000"+
		"\u0000\u0000\u012f\u012a\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000"+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0005\u000f\u0000\u0000\u0135\u0136\u0005\u0004"+
		"\u0000\u0000\u0136\u0137\u0003*\u0015\u0000\u0137\u0138\u0005\u0005\u0000"+
		"\u0000\u0138#\u0001\u0000\u0000\u0000\u0139\u013a\u0005\f\u0000\u0000"+
		"\u013a\u013b\u0007\u0001\u0000\u0000\u013b\u013c\u0005\u0013\u0000\u0000"+
		"\u013c\u013d\u0007\u0000\u0000\u0000\u013d\u013e\u0003*\u0015\u0000\u013e"+
		"\u013f\u0005\u0005\u0000\u0000\u013f%\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0005\r\u0000\u0000\u0141\u0142\u0003,\u0016\u0000\u0142\u0143\u0007"+
		"\u0000\u0000\u0000\u0143\u0144\u0003*\u0015\u0000\u0144\u0145\u0005\u0005"+
		"\u0000\u0000\u0145\'\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u000b\u0000"+
		"\u0000\u0147\u0148\u0003,\u0016\u0000\u0148\u0149\u0007\u0002\u0000\u0000"+
		"\u0149\u014a\u0003*\u0015\u0000\u014a\u014b\u0005\u0005\u0000\u0000\u014b"+
		")\u0001\u0000\u0000\u0000\u014c\u014e\u00030\u0018\u0000\u014d\u014c\u0001"+
		"\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u014d\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0155\u0001"+
		"\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152\u0154\u0003"+
		"\u0018\f\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000"+
		"\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000"+
		"\u0000\u0000\u0156\u015b\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0158\u015a\u0003\u001e\u000f\u0000\u0159\u0158\u0001\u0000"+
		"\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c+\u0001\u0000\u0000"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0003F#\u0000\u015f"+
		"\u0160\u0003.\u0017\u0000\u0160\u0165\u0001\u0000\u0000\u0000\u0161\u0165"+
		"\u0005C\u0000\u0000\u0162\u0163\u0005)\u0000\u0000\u0163\u0165\u0005C"+
		"\u0000\u0000\u0164\u015e\u0001\u0000\u0000\u0000\u0164\u0161\u0001\u0000"+
		"\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165-\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0003H$\u0000\u0167\u0168\u0003F#\u0000\u0168\u016a"+
		"\u0001\u0000\u0000\u0000\u0169\u0166\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0001\u0000\u0000\u0000\u016c/\u0001\u0000\u0000\u0000\u016d\u016f\u0003"+
		"\u0016\u000b\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001"+
		"\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u018c\u0001\u0000\u0000\u0000\u0172\u0174\u0003"+
		"\u000e\u0007\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001"+
		"\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001"+
		"\u0000\u0000\u0000\u0176\u018c\u0001\u0000\u0000\u0000\u0177\u0179\u0003"+
		"2\u0019\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000"+
		"\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000"+
		"\u0000\u0000\u017b\u018c\u0001\u0000\u0000\u0000\u017c\u017e\u00036\u001b"+
		"\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u018c\u0001\u0000\u0000\u0000\u0181\u0183\u0003:\u001d\u0000"+
		"\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000"+
		"\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185\u018c\u0001\u0000\u0000\u0000\u0186\u0188\u0003>\u001f\u0000\u0187"+
		"\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u018c\u0001\u0000\u0000\u0000\u018b\u016e\u0001\u0000\u0000\u0000\u018b"+
		"\u0173\u0001\u0000\u0000\u0000\u018b\u0178\u0001\u0000\u0000\u0000\u018b"+
		"\u017d\u0001\u0000\u0000\u0000\u018b\u0182\u0001\u0000\u0000\u0000\u018b"+
		"\u0187\u0001\u0000\u0000\u0000\u018c1\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0005\u0014\u0000\u0000\u018e\u018f\u00034\u001a\u0000\u018f3\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0003F#\u0000\u01915\u0001\u0000\u0000\u0000"+
		"\u0192\u0193\u0005\t\u0000\u0000\u0193\u0194\u00038\u001c\u0000\u0194"+
		"7\u0001\u0000\u0000\u0000\u0195\u019c\u0003F#\u0000\u0196\u0197\u0005"+
		".\u0000\u0000\u0197\u0199\u0003F#\u0000\u0198\u0196\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000"+
		"\u0000\u019c\u0198\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000"+
		"\u0000\u019d9\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u0015\u0000\u0000"+
		"\u019f\u01a0\u0005C\u0000\u0000\u01a0\u01a1\u00038\u001c\u0000\u01a1;"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005C\u0000\u0000\u01a3\u01a4\u0005"+
		"!\u0000\u0000\u01a4\u01a5\u0005\u0018\u0000\u0000\u01a5=\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0005C\u0000\u0000\u01a7\u01a8\u0005#\u0000\u0000\u01a8"+
		"\u01ac\u0003F#\u0000\u01a9\u01aa\u0003J%\u0000\u01aa\u01ab\u0003F#\u0000"+
		"\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b1\u0003F#\u0000\u01b1\u01b2\u0003L&\u0000\u01b2\u01b3\u0003"+
		"F#\u0000\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u01a6\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b0\u0001\u0000\u0000\u0000\u01b5?\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b8\u0005\b\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0005C\u0000\u0000\u01ba\u01bd\u0005#\u0000\u0000\u01bb\u01be\u0005"+
		"=\u0000\u0000\u01bc\u01be\u0005C\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01beA\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c1\u0005\u0007\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c3\u0005C\u0000\u0000\u01c3\u01c6\u0005#\u0000\u0000\u01c4\u01c7"+
		"\u0005>\u0000\u0000\u01c5\u01c7\u0005C\u0000\u0000\u01c6\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c7C\u0001\u0000\u0000"+
		"\u0000\u01c8\u01ca\u0005\u0006\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\u0005C\u0000\u0000\u01cc\u01cf\u0005#\u0000\u0000\u01cd"+
		"\u01d0\u00054\u0000\u0000\u01ce\u01d0\u0005C\u0000\u0000\u01cf\u01cd\u0001"+
		"\u0000\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0E\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d6\u0005=\u0000\u0000\u01d2\u01d6\u0005>\u0000\u0000"+
		"\u01d3\u01d6\u00054\u0000\u0000\u01d4\u01d6\u0005C\u0000\u0000\u01d5\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6G\u0001"+
		"\u0000\u0000\u0000\u01d7\u01de\u0005%\u0000\u0000\u01d8\u01de\u0005$\u0000"+
		"\u0000\u01d9\u01de\u0005&\u0000\u0000\u01da\u01de\u0005)\u0000\u0000\u01db"+
		"\u01de\u0005\'\u0000\u0000\u01dc\u01de\u0005(\u0000\u0000\u01dd\u01d7"+
		"\u0001\u0000\u0000\u0000\u01dd\u01d8\u0001\u0000\u0000\u0000\u01dd\u01d9"+
		"\u0001\u0000\u0000\u0000\u01dd\u01da\u0001\u0000\u0000\u0000\u01dd\u01db"+
		"\u0001\u0000\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01deI\u0001"+
		"\u0000\u0000\u0000\u01df\u01e5\u0001\u0000\u0000\u0000\u01e0\u01e5\u0005"+
		".\u0000\u0000\u01e1\u01e5\u0005/\u0000\u0000\u01e2\u01e5\u00050\u0000"+
		"\u0000\u01e3\u01e5\u00051\u0000\u0000\u01e4\u01df\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e0\u0001\u0000\u0000\u0000\u01e4\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e5K\u0001\u0000\u0000\u0000\u01e6\u01ec\u0001\u0000\u0000\u0000\u01e7"+
		"\u01ec\u00055\u0000\u0000\u01e8\u01ec\u00056\u0000\u0000\u01e9\u01ec\u0005"+
		"7\u0000\u0000\u01ea\u01ec\u00058\u0000\u0000\u01eb\u01e6\u0001\u0000\u0000"+
		"\u0000\u01eb\u01e7\u0001\u0000\u0000\u0000\u01eb\u01e8\u0001\u0000\u0000"+
		"\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ecM\u0001\u0000\u0000\u0000DOX\\ckpuz|\u0083\u008b\u0090\u0095"+
		"\u0097\u009c\u00a2\u00aa\u00ae\u00b3\u00b7\u00ba\u00c5\u00c8\u00cf\u00d3"+
		"\u00db\u00e0\u00e5\u00ea\u00ec\u00f1\u00f6\u00fb\u0100\u0102\u0107\u010c"+
		"\u0111\u0116\u011b\u011d\u0131\u014f\u0155\u015b\u0164\u016b\u0170\u0175"+
		"\u017a\u017f\u0184\u0189\u018b\u019a\u019c\u01ae\u01b4\u01b7\u01bd\u01c0"+
		"\u01c6\u01c9\u01cf\u01d5\u01dd\u01e4\u01eb";
>>>>>>> Stashed changes
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}