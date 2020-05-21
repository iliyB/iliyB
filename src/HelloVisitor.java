// Generated from C:/Users/iliy-/IntelliJIDEAProjects/HelloLang/src\Hello.g4 by ANTLR 4.8
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
	 * Visit a parse tree produced by the {@code expr_op}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_op(HelloParser.Expr_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_term}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_term(HelloParser.Expr_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_string}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_string(HelloParser.Expr_stringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_bool}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_bool(HelloParser.Expr_boolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_op}
	 * labeled alternative in {@link HelloParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_op(HelloParser.Term_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_factor}
	 * labeled alternative in {@link HelloParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_factor(HelloParser.Term_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_ident}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_ident(HelloParser.Factor_identContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_integer}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_integer(HelloParser.Factor_integerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_float}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_float(HelloParser.Factor_floatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_expr}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_expr(HelloParser.Factor_exprContext ctx);
}