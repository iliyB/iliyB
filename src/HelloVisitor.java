// Generated from C:/Users/iliy-/IntelliJIDEAProjects/Hello/src\Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(HelloParser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(HelloParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(HelloParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(HelloParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(HelloParser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HelloParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#region}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegion(HelloParser.RegionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(HelloParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(HelloParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#while_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_(HelloParser.While_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#if_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_(HelloParser.If_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(HelloParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#break_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_(HelloParser.Break_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#continue_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_(HelloParser.Continue_Context ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HelloParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#term_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_cond(HelloParser.Term_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_cond(HelloParser.Factor_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HelloParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(HelloParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(HelloParser.FactorContext ctx);
}