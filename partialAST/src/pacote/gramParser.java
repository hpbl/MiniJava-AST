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
		T__24=25, T__25=26, INTEGER_LITERAL=27, IDENTIFIER=28, WS=29;
	public static final int
		RULE_statement = 0, RULE_expression = 1, RULE_identifier = 2;
	public static final String[] ruleNames = {
		"statement", "expression", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'if'", "'('", "')'", "'else'", "'while'", "'System.out.println'", 
		"';'", "'='", "'['", "']'", "'&&'", "'<'", "'+'", "'-'", "'*'", "'.'", 
		"'length'", "','", "'true'", "'false'", "'this'", "'new'", "'int'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "INTEGER_LITERAL", "IDENTIFIER", "WS"
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
		enterRule(_localctx, 0, RULE_statement);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				match(T__0);
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(7);
					((StatementContext)_localctx).stmt = statement();
					}
					}
					setState(12);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(13);
				match(T__1);
				StatementList list = new StatementList();
				                list.addElement(((StatementContext)_localctx).stmt.declaracao);
				                ((StatementContext)_localctx).declaracao =  new Block(list);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(T__2);
				setState(16);
				match(T__3);
				setState(17);
				((StatementContext)_localctx).exp = expression(0);
				setState(18);
				match(T__4);
				setState(19);
				((StatementContext)_localctx).s1 = statement();
				setState(20);
				match(T__5);
				setState(21);
				((StatementContext)_localctx).s2 = statement();
				((StatementContext)_localctx).declaracao =  new If(((StatementContext)_localctx).exp.expressao, ((StatementContext)_localctx).s1.declaracao, ((StatementContext)_localctx).s2.declaracao);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				match(T__6);
				setState(25);
				match(T__3);
				setState(26);
				((StatementContext)_localctx).exp = expression(0);
				setState(27);
				match(T__4);
				setState(28);
				((StatementContext)_localctx).blck = statement();
				((StatementContext)_localctx).declaracao =  new While(((StatementContext)_localctx).exp.expressao, ((StatementContext)_localctx).blck.declaracao);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(T__7);
				setState(32);
				match(T__3);
				setState(33);
				((StatementContext)_localctx).exp = expression(0);
				setState(34);
				match(T__4);
				setState(35);
				match(T__8);
				((StatementContext)_localctx).declaracao =  new Print(((StatementContext)_localctx).exp.expressao);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				((StatementContext)_localctx).id = identifier();
				setState(39);
				match(T__9);
				setState(40);
				((StatementContext)_localctx).exp = expression(0);
				setState(41);
				match(T__8);
				Identifier idtf = new Identifier(((StatementContext)_localctx).id.getText());
				                ((StatementContext)_localctx).declaracao =  new Assign(idtf, ((StatementContext)_localctx).exp.expressao);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(44);
				((StatementContext)_localctx).id = identifier();
				setState(45);
				match(T__10);
				setState(46);
				((StatementContext)_localctx).e1 = expression(0);
				setState(47);
				match(T__11);
				setState(48);
				match(T__9);
				setState(49);
				((StatementContext)_localctx).e2 = expression(0);
				setState(50);
				match(T__8);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(56);
				((ExpressionContext)_localctx).integer = match(INTEGER_LITERAL);
				((ExpressionContext)_localctx).expressao =  new IntegerLiteral(Integer.parseInt(((ExpressionContext)_localctx).integer.getText()));
				}
				break;
			case 2:
				{
				setState(58);
				match(T__20);
				((ExpressionContext)_localctx).expressao =  new True();
				}
				break;
			case 3:
				{
				setState(60);
				match(T__21);
				((ExpressionContext)_localctx).expressao =  new False();
				}
				break;
			case 4:
				{
				setState(62);
				((ExpressionContext)_localctx).id = identifier();
				((ExpressionContext)_localctx).expressao =  new IdentifierExp(((ExpressionContext)_localctx).id.getText());
				}
				break;
			case 5:
				{
				setState(65);
				match(T__22);
				((ExpressionContext)_localctx).expressao =  new This();
				}
				break;
			case 6:
				{
				setState(67);
				match(T__23);
				setState(68);
				match(T__24);
				setState(69);
				match(T__10);
				setState(70);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(71);
				match(T__11);
				((ExpressionContext)_localctx).expressao =  new ArrayLength(((ExpressionContext)_localctx).exp.expressao);
				}
				break;
			case 7:
				{
				setState(74);
				match(T__23);
				setState(75);
				((ExpressionContext)_localctx).id = identifier();
				setState(76);
				match(T__3);
				setState(77);
				match(T__4);
				((ExpressionContext)_localctx).expressao =  new NewObject(new Identifier(((ExpressionContext)_localctx).id.getText()));
				}
				break;
			case 8:
				{
				setState(80);
				match(T__25);
				setState(81);
				((ExpressionContext)_localctx).exp = expression(2);
				((ExpressionContext)_localctx).expressao =  new Not(((ExpressionContext)_localctx).exp.expressao);
				}
				break;
			case 9:
				{
				setState(84);
				match(T__3);
				setState(85);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(86);
				match(T__4);
				/* descobrir o que é isso */
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(92);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
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
						setState(96);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(97);
						match(T__10);
						setState(98);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(99);
						match(T__11);
						((ExpressionContext)_localctx).expressao =  new ArrayLookup(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(103);
						match(T__17);
						setState(104);
						match(T__18);
						((ExpressionContext)_localctx).expressao =  new ArrayLength(((ExpressionContext)_localctx).e1.expressao);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(106);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(107);
						match(T__17);
						setState(108);
						((ExpressionContext)_localctx).id = identifier();
						setState(109);
						match(T__3);
						setState(118);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << INTEGER_LITERAL) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(110);
							((ExpressionContext)_localctx).e2 = expression(0);
							setState(115);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__19) {
								{
								{
								setState(111);
								match(T__19);
								setState(112);
								((ExpressionContext)_localctx).e3 = expression(0);
								}
								}
								setState(117);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(120);
						match(T__4);
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
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		case 1:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\28\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\\\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13\3\5\3y\n\3"+
		"\3\3\3\3\3\3\7\3~\n\3\f\3\16\3\u0081\13\3\3\4\3\4\3\4\2\3\4\5\2\4\6\2"+
		"\3\3\2\17\23\2\u0095\2\67\3\2\2\2\4[\3\2\2\2\6\u0082\3\2\2\2\b\f\7\3\2"+
		"\2\t\13\5\2\2\2\n\t\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\17"+
		"\3\2\2\2\16\f\3\2\2\2\17\20\7\4\2\2\208\b\2\1\2\21\22\7\5\2\2\22\23\7"+
		"\6\2\2\23\24\5\4\3\2\24\25\7\7\2\2\25\26\5\2\2\2\26\27\7\b\2\2\27\30\5"+
		"\2\2\2\30\31\b\2\1\2\318\3\2\2\2\32\33\7\t\2\2\33\34\7\6\2\2\34\35\5\4"+
		"\3\2\35\36\7\7\2\2\36\37\5\2\2\2\37 \b\2\1\2 8\3\2\2\2!\"\7\n\2\2\"#\7"+
		"\6\2\2#$\5\4\3\2$%\7\7\2\2%&\7\13\2\2&\'\b\2\1\2\'8\3\2\2\2()\5\6\4\2"+
		")*\7\f\2\2*+\5\4\3\2+,\7\13\2\2,-\b\2\1\2-8\3\2\2\2./\5\6\4\2/\60\7\r"+
		"\2\2\60\61\5\4\3\2\61\62\7\16\2\2\62\63\7\f\2\2\63\64\5\4\3\2\64\65\7"+
		"\13\2\2\65\66\b\2\1\2\668\3\2\2\2\67\b\3\2\2\2\67\21\3\2\2\2\67\32\3\2"+
		"\2\2\67!\3\2\2\2\67(\3\2\2\2\67.\3\2\2\28\3\3\2\2\29:\b\3\1\2:;\7\35\2"+
		"\2;\\\b\3\1\2<=\7\27\2\2=\\\b\3\1\2>?\7\30\2\2?\\\b\3\1\2@A\5\6\4\2AB"+
		"\b\3\1\2B\\\3\2\2\2CD\7\31\2\2D\\\b\3\1\2EF\7\32\2\2FG\7\33\2\2GH\7\r"+
		"\2\2HI\5\4\3\2IJ\7\16\2\2JK\b\3\1\2K\\\3\2\2\2LM\7\32\2\2MN\5\6\4\2NO"+
		"\7\6\2\2OP\7\7\2\2PQ\b\3\1\2Q\\\3\2\2\2RS\7\34\2\2ST\5\4\3\4TU\b\3\1\2"+
		"U\\\3\2\2\2VW\7\6\2\2WX\5\4\3\2XY\7\7\2\2YZ\b\3\1\2Z\\\3\2\2\2[9\3\2\2"+
		"\2[<\3\2\2\2[>\3\2\2\2[@\3\2\2\2[C\3\2\2\2[E\3\2\2\2[L\3\2\2\2[R\3\2\2"+
		"\2[V\3\2\2\2\\\177\3\2\2\2]^\f\17\2\2^_\t\2\2\2_`\5\4\3\20`a\b\3\1\2a"+
		"~\3\2\2\2bc\f\16\2\2cd\7\r\2\2de\5\4\3\2ef\7\16\2\2fg\b\3\1\2g~\3\2\2"+
		"\2hi\f\r\2\2ij\7\24\2\2jk\7\25\2\2k~\b\3\1\2lm\f\f\2\2mn\7\24\2\2no\5"+
		"\6\4\2ox\7\6\2\2pu\5\4\3\2qr\7\26\2\2rt\5\4\3\2sq\3\2\2\2tw\3\2\2\2us"+
		"\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xp\3\2\2\2xy\3\2\2\2yz\3\2\2\2z"+
		"{\7\7\2\2{|\b\3\1\2|~\3\2\2\2}]\3\2\2\2}b\3\2\2\2}h\3\2\2\2}l\3\2\2\2"+
		"~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\5\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0083\7\36\2\2\u0083\7\3\2\2\2\t\f\67[ux}\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}