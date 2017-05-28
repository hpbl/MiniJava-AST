// Generated from /Users/Pintor/Documents/CIn/7/Compiladores/MiniJava-AST/partialAST/src/pacote/gram.g4 by ANTLR 4.7
package pacote;

import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, INTEGER_LITERAL=28, IDENTIFIER=29, WS=30;
	public static final int
		RULE_type = 0, RULE_statement = 1, RULE_expression = 2, RULE_identifier = 3;
	public static final String[] ruleNames = {
		"type", "statement", "expression", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'['", "']'", "'boolean'", "'{'", "'}'", "'if'", "'('", 
		"')'", "'else'", "'while'", "'System.out.println'", "';'", "'='", "'&&'", 
		"'<'", "'+'", "'-'", "'*'", "'.'", "'length'", "','", "'true'", "'false'", 
		"'this'", "'new'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "INTEGER_LITERAL", "IDENTIFIER", "WS"
	};
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
	public String getGrammarFileName() { return "gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public Type tipo;
		public IdentifierContext id;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				match(T__0);
				setState(9);
				match(T__1);
				setState(10);
				match(T__2);
				((TypeContext)_localctx).tipo =  new IntArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(T__3);
				((TypeContext)_localctx).tipo =  new BooleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				match(T__0);
				((TypeContext)_localctx).tipo =  new IntegerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(16);
				((TypeContext)_localctx).id = identifier();
				((TypeContext)_localctx).tipo =  new IdentifierType(((TypeContext)_localctx).id.getText());
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

	public static class StatementContext extends ParserRuleContext {
		public Statement declaracao;
		public StatementContext stmt;
		public ExpressionContext exp;
		public StatementContext s1;
		public StatementContext s2;
		public StatementContext blck;
		public IdentifierContext id;
		public ExpressionContext e1;
		public ExpressionContext e2;
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(T__4);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(22);
					((StatementContext)_localctx).stmt = statement();
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28);
				match(T__5);
				StatementList list = new StatementList();
				                list.addElement(((StatementContext)_localctx).stmt.declaracao);
				                ((StatementContext)_localctx).declaracao =  new Block(list);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(T__6);
				setState(31);
				match(T__7);
				setState(32);
				((StatementContext)_localctx).exp = expression(0);
				setState(33);
				match(T__8);
				setState(34);
				((StatementContext)_localctx).s1 = statement();
				setState(35);
				match(T__9);
				setState(36);
				((StatementContext)_localctx).s2 = statement();
				((StatementContext)_localctx).declaracao =  new If(((StatementContext)_localctx).exp.expressao, ((StatementContext)_localctx).s1.declaracao, ((StatementContext)_localctx).s2.declaracao);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(T__10);
				setState(40);
				match(T__7);
				setState(41);
				((StatementContext)_localctx).exp = expression(0);
				setState(42);
				match(T__8);
				setState(43);
				((StatementContext)_localctx).blck = statement();
				((StatementContext)_localctx).declaracao =  new While(((StatementContext)_localctx).exp.expressao, ((StatementContext)_localctx).blck.declaracao);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(T__11);
				setState(47);
				match(T__7);
				setState(48);
				((StatementContext)_localctx).exp = expression(0);
				setState(49);
				match(T__8);
				setState(50);
				match(T__12);
				((StatementContext)_localctx).declaracao =  new Print(((StatementContext)_localctx).exp.expressao);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				((StatementContext)_localctx).id = identifier();
				setState(54);
				match(T__13);
				setState(55);
				((StatementContext)_localctx).exp = expression(0);
				setState(56);
				match(T__12);
				Identifier idtf = new Identifier(((StatementContext)_localctx).id.getText());
				                ((StatementContext)_localctx).declaracao =  new Assign(idtf, ((StatementContext)_localctx).exp.expressao);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				((StatementContext)_localctx).id = identifier();
				setState(60);
				match(T__1);
				setState(61);
				((StatementContext)_localctx).e1 = expression(0);
				setState(62);
				match(T__2);
				setState(63);
				match(T__13);
				setState(64);
				((StatementContext)_localctx).e2 = expression(0);
				setState(65);
				match(T__12);
				Identifier idtf = new Identifier(((StatementContext)_localctx).id.getText());
				                ((StatementContext)_localctx).declaracao =  new ArrayAssign(idtf, ((StatementContext)_localctx).e1.expressao, ((StatementContext)_localctx).e2.expressao);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Exp expressao;
		public ExpressionContext e1;
		public Token integer;
		public IdentifierContext id;
		public ExpressionContext exp;
		public Token op;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public TerminalNode INTEGER_LITERAL() { return getToken(gramParser.INTEGER_LITERAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(71);
				((ExpressionContext)_localctx).integer = match(INTEGER_LITERAL);
				((ExpressionContext)_localctx).expressao =  new IntegerLiteral(Integer.parseInt(((ExpressionContext)_localctx).integer.getText()));
				}
				break;
			case 2:
				{
				setState(73);
				match(T__22);
				((ExpressionContext)_localctx).expressao =  new True();
				}
				break;
			case 3:
				{
				setState(75);
				match(T__23);
				((ExpressionContext)_localctx).expressao =  new False();
				}
				break;
			case 4:
				{
				setState(77);
				((ExpressionContext)_localctx).id = identifier();
				((ExpressionContext)_localctx).expressao =  new IdentifierExp(((ExpressionContext)_localctx).id.getText());
				}
				break;
			case 5:
				{
				setState(80);
				match(T__24);
				((ExpressionContext)_localctx).expressao =  new This();
				}
				break;
			case 6:
				{
				setState(82);
				match(T__25);
				setState(83);
				match(T__0);
				setState(84);
				match(T__1);
				setState(85);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(86);
				match(T__2);
				((ExpressionContext)_localctx).expressao =  new ArrayLength(((ExpressionContext)_localctx).exp.expressao);
				}
				break;
			case 7:
				{
				setState(89);
				match(T__25);
				setState(90);
				((ExpressionContext)_localctx).id = identifier();
				setState(91);
				match(T__7);
				setState(92);
				match(T__8);
				((ExpressionContext)_localctx).expressao =  new NewObject(new Identifier(((ExpressionContext)_localctx).id.getText()));
				}
				break;
			case 8:
				{
				setState(95);
				match(T__26);
				setState(96);
				((ExpressionContext)_localctx).exp = expression(2);
				((ExpressionContext)_localctx).expressao =  new Not(((ExpressionContext)_localctx).exp.expressao);
				}
				break;
			case 9:
				{
				setState(99);
				match(T__7);
				setState(100);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(101);
				match(T__8);
				/* descobrir o que é isso */
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(107);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						((ExpressionContext)_localctx).e2 = expression(14);
						switch (((ExpressionContext)_localctx).op.getText()) {
						                              case "&&":  ((ExpressionContext)_localctx).expressao =  new And(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						                                          break;

						                              case "<":   ((ExpressionContext)_localctx).expressao =  new LessThan(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						                                          break;

						                              case "+":   ((ExpressionContext)_localctx).expressao =  new Plus(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						                                          break;

						                              case "-":   ((ExpressionContext)_localctx).expressao =  new Minus(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						                                          break;

						                              case "*":   ((ExpressionContext)_localctx).expressao =  new Times(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						                                          break;
						                          }

						                          
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(112);
						match(T__1);
						setState(113);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(114);
						match(T__2);
						((ExpressionContext)_localctx).expressao =  new ArrayLookup(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(118);
						match(T__19);
						setState(119);
						match(T__20);
						((ExpressionContext)_localctx).expressao =  new ArrayLength(((ExpressionContext)_localctx).e1.expressao);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(121);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(122);
						match(T__19);
						setState(123);
						((ExpressionContext)_localctx).id = identifier();
						setState(124);
						match(T__7);
						setState(133);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << INTEGER_LITERAL) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(125);
							((ExpressionContext)_localctx).e2 = expression(0);
							setState(130);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__21) {
								{
								{
								setState(126);
								match(T__21);
								setState(127);
								((ExpressionContext)_localctx).e3 = expression(0);
								}
								}
								setState(132);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(135);
						match(T__8);
						ExpList expList = new ExpList();
						                           expList.addElement(((ExpressionContext)_localctx).e2.expressao);
						                           expList.addElement(((ExpressionContext)_localctx).e3.expressao);

						                           Identifier idtf = new Identifier(((ExpressionContext)_localctx).id.getText());

						                           ((ExpressionContext)_localctx).expressao =  new Call(((ExpressionContext)_localctx).e1.expressao, idtf, expList);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IDENTIFIER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0094\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"\26\n\2\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3G"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4k\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0083\n\4\f\4\16\4\u0086\13\4\5\4\u0088"+
		"\n\4\3\4\3\4\3\4\7\4\u008d\n\4\f\4\16\4\u0090\13\4\3\5\3\5\3\5\2\3\6\6"+
		"\2\4\6\b\2\3\3\2\21\25\2\u00a6\2\25\3\2\2\2\4F\3\2\2\2\6j\3\2\2\2\b\u0091"+
		"\3\2\2\2\n\13\7\3\2\2\13\f\7\4\2\2\f\r\7\5\2\2\r\26\b\2\1\2\16\17\7\6"+
		"\2\2\17\26\b\2\1\2\20\21\7\3\2\2\21\26\b\2\1\2\22\23\5\b\5\2\23\24\b\2"+
		"\1\2\24\26\3\2\2\2\25\n\3\2\2\2\25\16\3\2\2\2\25\20\3\2\2\2\25\22\3\2"+
		"\2\2\26\3\3\2\2\2\27\33\7\7\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2"+
		"\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\b"+
		"\2\2\37G\b\3\1\2 !\7\t\2\2!\"\7\n\2\2\"#\5\6\4\2#$\7\13\2\2$%\5\4\3\2"+
		"%&\7\f\2\2&\'\5\4\3\2\'(\b\3\1\2(G\3\2\2\2)*\7\r\2\2*+\7\n\2\2+,\5\6\4"+
		"\2,-\7\13\2\2-.\5\4\3\2./\b\3\1\2/G\3\2\2\2\60\61\7\16\2\2\61\62\7\n\2"+
		"\2\62\63\5\6\4\2\63\64\7\13\2\2\64\65\7\17\2\2\65\66\b\3\1\2\66G\3\2\2"+
		"\2\678\5\b\5\289\7\20\2\29:\5\6\4\2:;\7\17\2\2;<\b\3\1\2<G\3\2\2\2=>\5"+
		"\b\5\2>?\7\4\2\2?@\5\6\4\2@A\7\5\2\2AB\7\20\2\2BC\5\6\4\2CD\7\17\2\2D"+
		"E\b\3\1\2EG\3\2\2\2F\27\3\2\2\2F \3\2\2\2F)\3\2\2\2F\60\3\2\2\2F\67\3"+
		"\2\2\2F=\3\2\2\2G\5\3\2\2\2HI\b\4\1\2IJ\7\36\2\2Jk\b\4\1\2KL\7\31\2\2"+
		"Lk\b\4\1\2MN\7\32\2\2Nk\b\4\1\2OP\5\b\5\2PQ\b\4\1\2Qk\3\2\2\2RS\7\33\2"+
		"\2Sk\b\4\1\2TU\7\34\2\2UV\7\3\2\2VW\7\4\2\2WX\5\6\4\2XY\7\5\2\2YZ\b\4"+
		"\1\2Zk\3\2\2\2[\\\7\34\2\2\\]\5\b\5\2]^\7\n\2\2^_\7\13\2\2_`\b\4\1\2`"+
		"k\3\2\2\2ab\7\35\2\2bc\5\6\4\4cd\b\4\1\2dk\3\2\2\2ef\7\n\2\2fg\5\6\4\2"+
		"gh\7\13\2\2hi\b\4\1\2ik\3\2\2\2jH\3\2\2\2jK\3\2\2\2jM\3\2\2\2jO\3\2\2"+
		"\2jR\3\2\2\2jT\3\2\2\2j[\3\2\2\2ja\3\2\2\2je\3\2\2\2k\u008e\3\2\2\2lm"+
		"\f\17\2\2mn\t\2\2\2no\5\6\4\20op\b\4\1\2p\u008d\3\2\2\2qr\f\16\2\2rs\7"+
		"\4\2\2st\5\6\4\2tu\7\5\2\2uv\b\4\1\2v\u008d\3\2\2\2wx\f\r\2\2xy\7\26\2"+
		"\2yz\7\27\2\2z\u008d\b\4\1\2{|\f\f\2\2|}\7\26\2\2}~\5\b\5\2~\u0087\7\n"+
		"\2\2\177\u0084\5\6\4\2\u0080\u0081\7\30\2\2\u0081\u0083\5\6\4\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087\177\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\13\2\2\u008a\u008b\b\4\1\2"+
		"\u008b\u008d\3\2\2\2\u008cl\3\2\2\2\u008cq\3\2\2\2\u008cw\3\2\2\2\u008c"+
		"{\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2"+
		"\u008f\7\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\37\2\2\u0092\t\3\2"+
		"\2\2\n\25\33Fj\u0084\u0087\u008c\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}