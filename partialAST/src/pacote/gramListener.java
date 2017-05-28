// Generated from /Users/Pintor/Documents/CIn/7/Compiladores/MiniJava-AST/partialAST/src/pacote/gram.g4 by ANTLR 4.7
package pacote;

import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gramParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gramParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gramParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gramParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gramParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gramParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(gramParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(gramParser.IdentifierContext ctx);
}