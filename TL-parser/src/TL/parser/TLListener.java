// Generated from TL.g4 by ANTLR 4.12.0
package TL.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLParser}.
 */
public interface TLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#prototypes}.
	 * @param ctx the parse tree
	 */
	void enterPrototypes(TLParser.PrototypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#prototypes}.
	 * @param ctx the parse tree
	 */
	void exitPrototypes(TLParser.PrototypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#startBlock}.
	 * @param ctx the parse tree
	 */
	void enterStartBlock(TLParser.StartBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#startBlock}.
	 * @param ctx the parse tree
	 */
	void exitStartBlock(TLParser.StartBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#startBody}.
	 * @param ctx the parse tree
	 */
	void enterStartBody(TLParser.StartBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#startBody}.
	 * @param ctx the parse tree
	 */
	void exitStartBody(TLParser.StartBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#functionsBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionsBlock(TLParser.FunctionsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#functionsBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionsBlock(TLParser.FunctionsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#funcBlockBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBlockBody(TLParser.FuncBlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#funcBlockBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBlockBody(TLParser.FuncBlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void enterFuncDec(TLParser.FuncDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#funcDec}.
	 * @param ctx the parse tree
	 */
	void exitFuncDec(TLParser.FuncDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#funcOutputParam}.
	 * @param ctx the parse tree
	 */
	void enterFuncOutputParam(TLParser.FuncOutputParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#funcOutputParam}.
	 * @param ctx the parse tree
	 */
	void exitFuncOutputParam(TLParser.FuncOutputParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#funcInputParam}.
	 * @param ctx the parse tree
	 */
	void enterFuncInputParam(TLParser.FuncInputParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#funcInputParam}.
	 * @param ctx the parse tree
	 */
	void exitFuncInputParam(TLParser.FuncInputParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(TLParser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(TLParser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(TLParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(TLParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberDec}
	 * labeled alternative in {@link TLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterNumberDec(TLParser.NumberDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberDec}
	 * labeled alternative in {@link TLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitNumberDec(TLParser.NumberDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textDec}
	 * labeled alternative in {@link TLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterTextDec(TLParser.TextDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textDec}
	 * labeled alternative in {@link TLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitTextDec(TLParser.TextDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolDec}
	 * labeled alternative in {@link TLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterBoolDec(TLParser.BoolDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolDec}
	 * labeled alternative in {@link TLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitBoolDec(TLParser.BoolDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(TLParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(TLParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(TLParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(TLParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(TLParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(TLParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(TLParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(TLParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(TLParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(TLParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#repeatUntilStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatUntilStatement(TLParser.RepeatUntilStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#repeatUntilStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatUntilStatement(TLParser.RepeatUntilStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(TLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(TLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#statementBody}.
	 * @param ctx the parse tree
	 */
	void enterStatementBody(TLParser.StatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#statementBody}.
	 * @param ctx the parse tree
	 */
	void exitStatementBody(TLParser.StatementBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code con1}
	 * labeled alternative in {@link TLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCon1(TLParser.Con1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code con1}
	 * labeled alternative in {@link TLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCon1(TLParser.Con1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code con2}
	 * labeled alternative in {@link TLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCon2(TLParser.Con2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code con2}
	 * labeled alternative in {@link TLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCon2(TLParser.Con2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code con3}
	 * labeled alternative in {@link TLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCon3(TLParser.Con3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code con3}
	 * labeled alternative in {@link TLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCon3(TLParser.Con3Context ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#rightCondition}.
	 * @param ctx the parse tree
	 */
	void enterRightCondition(TLParser.RightConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#rightCondition}.
	 * @param ctx the parse tree
	 */
	void exitRightCondition(TLParser.RightConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#returnExp}.
	 * @param ctx the parse tree
	 */
	void enterReturnExp(TLParser.ReturnExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#returnExp}.
	 * @param ctx the parse tree
	 */
	void exitReturnExp(TLParser.ReturnExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#returnBody}.
	 * @param ctx the parse tree
	 */
	void enterReturnBody(TLParser.ReturnBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#returnBody}.
	 * @param ctx the parse tree
	 */
	void exitReturnBody(TLParser.ReturnBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#printExp}.
	 * @param ctx the parse tree
	 */
	void enterPrintExp(TLParser.PrintExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#printExp}.
	 * @param ctx the parse tree
	 */
	void exitPrintExp(TLParser.PrintExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#printBody}.
	 * @param ctx the parse tree
	 */
	void enterPrintBody(TLParser.PrintBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#printBody}.
	 * @param ctx the parse tree
	 */
	void exitPrintBody(TLParser.PrintBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#askExp}.
	 * @param ctx the parse tree
	 */
	void enterAskExp(TLParser.AskExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#askExp}.
	 * @param ctx the parse tree
	 */
	void exitAskExp(TLParser.AskExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#answerVal}.
	 * @param ctx the parse tree
	 */
	void enterAnswerVal(TLParser.AnswerValContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#answerVal}.
	 * @param ctx the parse tree
	 */
	void exitAnswerVal(TLParser.AnswerValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExp1}
	 * labeled alternative in {@link TLParser#mathExp}.
	 * @param ctx the parse tree
	 */
	void enterMathExp1(TLParser.MathExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExp1}
	 * labeled alternative in {@link TLParser#mathExp}.
	 * @param ctx the parse tree
	 */
	void exitMathExp1(TLParser.MathExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExp2}
	 * labeled alternative in {@link TLParser#mathExp}.
	 * @param ctx the parse tree
	 */
	void enterMathExp2(TLParser.MathExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExp2}
	 * labeled alternative in {@link TLParser#mathExp}.
	 * @param ctx the parse tree
	 */
	void exitMathExp2(TLParser.MathExp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#textInit}.
	 * @param ctx the parse tree
	 */
	void enterTextInit(TLParser.TextInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#textInit}.
	 * @param ctx the parse tree
	 */
	void exitTextInit(TLParser.TextInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#numberInit}.
	 * @param ctx the parse tree
	 */
	void enterNumberInit(TLParser.NumberInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#numberInit}.
	 * @param ctx the parse tree
	 */
	void exitNumberInit(TLParser.NumberInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#booleanInit}.
	 * @param ctx the parse tree
	 */
	void enterBooleanInit(TLParser.BooleanInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#booleanInit}.
	 * @param ctx the parse tree
	 */
	void exitBooleanInit(TLParser.BooleanInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(TLParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(TLParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#conditionalOperation}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperation(TLParser.ConditionalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#conditionalOperation}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperation(TLParser.ConditionalOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#mathematicalOperation1}.
	 * @param ctx the parse tree
	 */
	void enterMathematicalOperation1(TLParser.MathematicalOperation1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#mathematicalOperation1}.
	 * @param ctx the parse tree
	 */
	void exitMathematicalOperation1(TLParser.MathematicalOperation1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TLParser#mathematicalOperation2}.
	 * @param ctx the parse tree
	 */
	void enterMathematicalOperation2(TLParser.MathematicalOperation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#mathematicalOperation2}.
	 * @param ctx the parse tree
	 */
	void exitMathematicalOperation2(TLParser.MathematicalOperation2Context ctx);
}