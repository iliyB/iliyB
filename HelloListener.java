// Generated from /home/iliy/IdeaProjects/HelloLang/src/Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(HelloParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(HelloParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HelloParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HelloParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(HelloParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(HelloParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(HelloParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(HelloParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(HelloParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(HelloParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#region}.
	 * @param ctx the parse tree
	 */
	void enterRegion(HelloParser.RegionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#region}.
	 * @param ctx the parse tree
	 */
	void exitRegion(HelloParser.RegionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(HelloParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(HelloParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(HelloParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(HelloParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(HelloParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(HelloParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(HelloParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(HelloParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code print_expr}
	 * labeled alternative in {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expr(HelloParser.Print_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_expr}
	 * labeled alternative in {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expr(HelloParser.Print_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print_string}
	 * labeled alternative in {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint_string(HelloParser.Print_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print_string}
	 * labeled alternative in {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint_string(HelloParser.Print_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#break_}.
	 * @param ctx the parse tree
	 */
	void enterBreak_(HelloParser.Break_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#break_}.
	 * @param ctx the parse tree
	 */
	void exitBreak_(HelloParser.Break_Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#continue_}.
	 * @param ctx the parse tree
	 */
	void enterContinue_(HelloParser.Continue_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#continue_}.
	 * @param ctx the parse tree
	 */
	void exitContinue_(HelloParser.Continue_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code condition_denial}
	 * labeled alternative in {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition_denial(HelloParser.Condition_denialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condition_denial}
	 * labeled alternative in {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition_denial(HelloParser.Condition_denialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condition_term}
	 * labeled alternative in {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition_term(HelloParser.Condition_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condition_term}
	 * labeled alternative in {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition_term(HelloParser.Condition_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condition_and}
	 * labeled alternative in {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition_and(HelloParser.Condition_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condition_and}
	 * labeled alternative in {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition_and(HelloParser.Condition_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_cond_denial}
	 * labeled alternative in {@link HelloParser#term_cond}.
	 * @param ctx the parse tree
	 */
	void enterTerm_cond_denial(HelloParser.Term_cond_denialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_cond_denial}
	 * labeled alternative in {@link HelloParser#term_cond}.
	 * @param ctx the parse tree
	 */
	void exitTerm_cond_denial(HelloParser.Term_cond_denialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_cond_factor}
	 * labeled alternative in {@link HelloParser#term_cond}.
	 * @param ctx the parse tree
	 */
	void enterTerm_cond_factor(HelloParser.Term_cond_factorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_cond_factor}
	 * labeled alternative in {@link HelloParser#term_cond}.
	 * @param ctx the parse tree
	 */
	void exitTerm_cond_factor(HelloParser.Term_cond_factorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_cond_or}
	 * labeled alternative in {@link HelloParser#term_cond}.
	 * @param ctx the parse tree
	 */
	void enterTerm_cond_or(HelloParser.Term_cond_orContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_cond_or}
	 * labeled alternative in {@link HelloParser#term_cond}.
	 * @param ctx the parse tree
	 */
	void exitTerm_cond_or(HelloParser.Term_cond_orContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor_cond_compare}
	 * labeled alternative in {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void enterFactor_cond_compare(HelloParser.Factor_cond_compareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor_cond_compare}
	 * labeled alternative in {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void exitFactor_cond_compare(HelloParser.Factor_cond_compareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor_cond_expr}
	 * labeled alternative in {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void enterFactor_cond_expr(HelloParser.Factor_cond_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor_cond_expr}
	 * labeled alternative in {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void exitFactor_cond_expr(HelloParser.Factor_cond_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor_condition}
	 * labeled alternative in {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void enterFactor_condition(HelloParser.Factor_conditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor_condition}
	 * labeled alternative in {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void exitFactor_condition(HelloParser.Factor_conditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor_cond_term}
	 * labeled alternative in {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void enterFactor_cond_term(HelloParser.Factor_cond_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor_cond_term}
	 * labeled alternative in {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void exitFactor_cond_term(HelloParser.Factor_cond_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor_cond_denial}
	 * labeled alternative in {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void enterFactor_cond_denial(HelloParser.Factor_cond_denialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor_cond_denial}
	 * labeled alternative in {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void exitFactor_cond_denial(HelloParser.Factor_cond_denialContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declare_string}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_string(HelloParser.Declare_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declare_string}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_string(HelloParser.Declare_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declare_bool_with_value}
	 * labeled alternative in {@link HelloParser#declare_bool}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_bool_with_value(HelloParser.Declare_bool_with_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare_bool_with_value}
	 * labeled alternative in {@link HelloParser#declare_bool}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_bool_with_value(HelloParser.Declare_bool_with_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declare_bool_without_value}
	 * labeled alternative in {@link HelloParser#declare_bool}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_bool_without_value(HelloParser.Declare_bool_without_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare_bool_without_value}
	 * labeled alternative in {@link HelloParser#declare_bool}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_bool_without_value(HelloParser.Declare_bool_without_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declare_float_with_value}
	 * labeled alternative in {@link HelloParser#declare_float}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_float_with_value(HelloParser.Declare_float_with_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare_float_with_value}
	 * labeled alternative in {@link HelloParser#declare_float}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_float_with_value(HelloParser.Declare_float_with_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declare_float_without_value}
	 * labeled alternative in {@link HelloParser#declare_float}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_float_without_value(HelloParser.Declare_float_without_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare_float_without_value}
	 * labeled alternative in {@link HelloParser#declare_float}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_float_without_value(HelloParser.Declare_float_without_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declare_int_with_value}
	 * labeled alternative in {@link HelloParser#declare_int}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_int_with_value(HelloParser.Declare_int_with_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare_int_with_value}
	 * labeled alternative in {@link HelloParser#declare_int}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_int_with_value(HelloParser.Declare_int_with_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declare_int_without_value}
	 * labeled alternative in {@link HelloParser#declare_int}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_int_without_value(HelloParser.Declare_int_without_valueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declare_int_without_value}
	 * labeled alternative in {@link HelloParser#declare_int}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_int_without_value(HelloParser.Declare_int_without_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_op}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_op(HelloParser.Expr_opContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_op}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_op(HelloParser.Expr_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_term}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_term(HelloParser.Expr_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_term}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_term(HelloParser.Expr_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_bool}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_bool(HelloParser.Expr_boolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_bool}
	 * labeled alternative in {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_bool(HelloParser.Expr_boolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_op}
	 * labeled alternative in {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_op(HelloParser.Term_opContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_op}
	 * labeled alternative in {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_op(HelloParser.Term_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_factor}
	 * labeled alternative in {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_factor(HelloParser.Term_factorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_factor}
	 * labeled alternative in {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_factor(HelloParser.Term_factorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor_ident}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor_ident(HelloParser.Factor_identContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor_ident}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor_ident(HelloParser.Factor_identContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor_integer}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor_integer(HelloParser.Factor_integerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor_integer}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor_integer(HelloParser.Factor_integerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor_float}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor_float(HelloParser.Factor_floatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor_float}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor_float(HelloParser.Factor_floatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor_expr}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor_expr(HelloParser.Factor_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor_expr}
	 * labeled alternative in {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor_expr(HelloParser.Factor_exprContext ctx);
}