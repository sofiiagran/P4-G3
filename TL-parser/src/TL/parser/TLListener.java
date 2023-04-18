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
	 * Enter a parse tree produced by {@link TLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TLParser.DeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link TLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(TLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(TLParser.DataTypeContext ctx);
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
	 * Enter a parse tree produced by {@link TLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TLParser.ConditionContext ctx);
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
	 * Enter a parse tree produced by {@link TLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(TLParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(TLParser.OperationContext ctx);
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
	 * Enter a parse tree produced by {@link TLParser#mathExp}.
	 * @param ctx the parse tree
	 */
	void enterMathExp(TLParser.MathExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#mathExp}.
	 * @param ctx the parse tree
	 */
	void exitMathExp(TLParser.MathExpContext ctx);
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
	 * Enter a parse tree produced by {@link TLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(TLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(TLParser.VarContext ctx);
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
	 * Enter a parse tree produced by {@link TLParser#mathematicalOperation}.
	 * @param ctx the parse tree
	 */
	void enterMathematicalOperation(TLParser.MathematicalOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLParser#mathematicalOperation}.
	 * @param ctx the parse tree
	 */
	void exitMathematicalOperation(TLParser.MathematicalOperationContext ctx);
}