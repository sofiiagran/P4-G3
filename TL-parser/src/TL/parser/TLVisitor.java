// Generated from TL.g4 by ANTLR 4.12.0
package TL.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#startBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartBlock(TLParser.StartBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#startBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartBody(TLParser.StartBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#functionsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionsBlock(TLParser.FunctionsBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#funcDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDec(TLParser.FuncDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#funcOutputParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncOutputParam(TLParser.FuncOutputParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#funcInputParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncInputParam(TLParser.FuncInputParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#funcName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncName(TLParser.FuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(TLParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#numberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberDecl(TLParser.NumberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#textDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextDecl(TLParser.TextDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#boolDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolDecl(TLParser.BoolDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#numberListDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberListDecl(TLParser.NumberListDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#numberListInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberListInit(TLParser.NumberListInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#textListDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextListDecl(TLParser.TextListDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#textListInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextListInit(TLParser.TextListInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(TLParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(TLParser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(TLParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(TLParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(TLParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#repeatUntilStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatUntilStatement(TLParser.RepeatUntilStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(TLParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#statementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBody(TLParser.StatementBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code con1}
	 * labeled alternative in {@link TLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon1(TLParser.Con1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code con2}
	 * labeled alternative in {@link TLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon2(TLParser.Con2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code con3}
	 * labeled alternative in {@link TLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon3(TLParser.Con3Context ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#returnExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExp(TLParser.ReturnExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#printExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExp(TLParser.PrintExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#askExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAskExp(TLParser.AskExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#mathExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExp(TLParser.MathExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#textInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextInit(TLParser.TextInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#numberInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberInit(TLParser.NumberInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#booleanInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanInit(TLParser.BooleanInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(TLParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code answerVal}
	 * labeled alternative in {@link TLParser#dotVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswerVal(TLParser.AnswerValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexVal}
	 * labeled alternative in {@link TLParser#dotVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexVal(TLParser.IndexValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionVal}
	 * labeled alternative in {@link TLParser#dotVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionVal(TLParser.CollectionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#numberValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(TLParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionDecl}
	 * labeled alternative in {@link TLParser#collectionDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionDecl(TLParser.CollectionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionInitBool}
	 * labeled alternative in {@link TLParser#collectionInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionInitBool(TLParser.CollectionInitBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionInitText}
	 * labeled alternative in {@link TLParser#collectionInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionInitText(TLParser.CollectionInitTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionInitNumber}
	 * labeled alternative in {@link TLParser#collectionInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionInitNumber(TLParser.CollectionInitNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionInitVar}
	 * labeled alternative in {@link TLParser#collectionInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionInitVar(TLParser.CollectionInitVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionInitAll}
	 * labeled alternative in {@link TLParser#collectionInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionInitAll(TLParser.CollectionInitAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(TLParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(TLParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#conditionalOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOperation(TLParser.ConditionalOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#mathematicalOperation1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathematicalOperation1(TLParser.MathematicalOperation1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TLParser#mathematicalOperation2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathematicalOperation2(TLParser.MathematicalOperation2Context ctx);
}