// Generated from /Users/Pintor/Downloads/asd/src/pacote/gram.g4 by ANTLR 4.7
package pacote;

import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
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