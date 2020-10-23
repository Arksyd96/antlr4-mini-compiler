// Generated from g.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link gParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull gParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link gParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull gParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lib}.
	 * @param ctx the parse tree
	 */
	void enterLib(@NotNull gParser.LibContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lib}.
	 * @param ctx the parse tree
	 */
	void exitLib(@NotNull gParser.LibContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(@NotNull gParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(@NotNull gParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(@NotNull gParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(@NotNull gParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#outputIdList}.
	 * @param ctx the parse tree
	 */
	void enterOutputIdList(@NotNull gParser.OutputIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#outputIdList}.
	 * @param ctx the parse tree
	 */
	void exitOutputIdList(@NotNull gParser.OutputIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(@NotNull gParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(@NotNull gParser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link gParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void enterComp(@NotNull gParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comp}
	 * labeled alternative in {@link gParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void exitComp(@NotNull gParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Str}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStr(@NotNull gParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Str}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStr(@NotNull gParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(@NotNull gParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(@NotNull gParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull gParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull gParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#strFormat}.
	 * @param ctx the parse tree
	 */
	void enterStrFormat(@NotNull gParser.StrFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#strFormat}.
	 * @param ctx the parse tree
	 */
	void exitStrFormat(@NotNull gParser.StrFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus(@NotNull gParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus(@NotNull gParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpParen}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpParen(@NotNull gParser.ExpParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpParen}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpParen(@NotNull gParser.ExpParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#instBlock}.
	 * @param ctx the parse tree
	 */
	void enterInstBlock(@NotNull gParser.InstBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#instBlock}.
	 * @param ctx the parse tree
	 */
	void exitInstBlock(@NotNull gParser.InstBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(@NotNull gParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(@NotNull gParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#thenBlock}.
	 * @param ctx the parse tree
	 */
	void enterThenBlock(@NotNull gParser.ThenBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#thenBlock}.
	 * @param ctx the parse tree
	 */
	void exitThenBlock(@NotNull gParser.ThenBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull gParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull gParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull gParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull gParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDiv(@NotNull gParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDiv(@NotNull gParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#importLib}.
	 * @param ctx the parse tree
	 */
	void enterImportLib(@NotNull gParser.ImportLibContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#importLib}.
	 * @param ctx the parse tree
	 */
	void exitImportLib(@NotNull gParser.ImportLibContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(@NotNull gParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(@NotNull gParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull gParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull gParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link gParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull gParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link gParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull gParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull gParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull gParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link gParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull gParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link gParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull gParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Times}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTimes(@NotNull gParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Times}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTimes(@NotNull gParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EvalParen}
	 * labeled alternative in {@link gParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void enterEvalParen(@NotNull gParser.EvalParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EvalParen}
	 * labeled alternative in {@link gParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void exitEvalParen(@NotNull gParser.EvalParenContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#outputArgs}.
	 * @param ctx the parse tree
	 */
	void enterOutputArgs(@NotNull gParser.OutputArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#outputArgs}.
	 * @param ctx the parse tree
	 */
	void exitOutputArgs(@NotNull gParser.OutputArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(@NotNull gParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(@NotNull gParser.MainBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull gParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull gParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#evalOperand}.
	 * @param ctx the parse tree
	 */
	void enterEvalOperand(@NotNull gParser.EvalOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#evalOperand}.
	 * @param ctx the parse tree
	 */
	void exitEvalOperand(@NotNull gParser.EvalOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(@NotNull gParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(@NotNull gParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#axiom}.
	 * @param ctx the parse tree
	 */
	void enterAxiom(@NotNull gParser.AxiomContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#axiom}.
	 * @param ctx the parse tree
	 */
	void exitAxiom(@NotNull gParser.AxiomContext ctx);
}