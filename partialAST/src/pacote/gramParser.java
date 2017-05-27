// Generated from /Users/Pintor/Downloads/asd/src/pacote/gram.g4 by ANTLR 4.7
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, INTEGER_LITERAL=15, IDENTIFIER=16, 
		WS=17;
	public static final int
		RULE_expression = 0, RULE_identifier = 1;
	public static final String[] ruleNames = {
		"expression", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'['", "']'", "'.'", "'length'", "'('", "','", "')'", "'true'", 
		"'false'", "'this'", "'new'", "'int'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(5);
				((ExpressionContext)_localctx).integer = match(INTEGER_LITERAL);
				((ExpressionContext)_localctx).expressao =  new IntegerLiteral(Integer.parseInt(((ExpressionContext)_localctx).integer.getText()));
				}
				break;
			case 2:
				{
				setState(7);
				match(T__8);
				((ExpressionContext)_localctx).expressao =  new True();
				}
				break;
			case 3:
				{
				setState(9);
				match(T__9);
				((ExpressionContext)_localctx).expressao =  new False();
				}
				break;
			case 4:
				{
				setState(11);
				((ExpressionContext)_localctx).id = identifier();
				((ExpressionContext)_localctx).expressao =  new IdentifierExp(((ExpressionContext)_localctx).id.getText());
				}
				break;
			case 5:
				{
				setState(14);
				match(T__10);
				((ExpressionContext)_localctx).expressao =  new This();
				}
				break;
			case 6:
				{
				setState(16);
				match(T__11);
				setState(17);
				match(T__12);
				setState(18);
				match(T__1);
				setState(19);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(20);
				match(T__2);
				((ExpressionContext)_localctx).expressao =  new ArrayLength(((ExpressionContext)_localctx).exp.expressao);
				}
				break;
			case 7:
				{
				setState(23);
				match(T__11);
				setState(24);
				((ExpressionContext)_localctx).id = identifier();
				setState(25);
				match(T__5);
				setState(26);
				match(T__7);
				((ExpressionContext)_localctx).expressao =  new NewObject(new Identifier(((ExpressionContext)_localctx).id.getText()));
				}
				break;
			case 8:
				{
				setState(29);
				match(T__13);
				setState(30);
				((ExpressionContext)_localctx).exp = expression(2);
				((ExpressionContext)_localctx).expressao =  new Not(((ExpressionContext)_localctx).exp.expressao);
				}
				break;
			case 9:
				{
				setState(33);
				match(T__5);
				setState(34);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(35);
				match(T__7);
				/* descobrir o que é isso */
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(40);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(41);
						((ExpressionContext)_localctx).op = match(T__0);
						setState(42);
						((ExpressionContext)_localctx).e2 = expression(14);
						((ExpressionContext)_localctx).expressao =  new Plus(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(45);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(46);
						match(T__1);
						setState(47);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(48);
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
						setState(51);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(52);
						match(T__3);
						setState(53);
						match(T__4);
						((ExpressionContext)_localctx).expressao =  new ArrayLength(((ExpressionContext)_localctx).e1.expressao);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(55);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(56);
						match(T__3);
						setState(57);
						((ExpressionContext)_localctx).id = identifier();
						setState(58);
						match(T__5);
						setState(67);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << INTEGER_LITERAL) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(59);
							((ExpressionContext)_localctx).e2 = expression(0);
							setState(64);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__6) {
								{
								{
								setState(60);
								match(T__6);
								setState(61);
								((ExpressionContext)_localctx).e3 = expression(0);
								}
								}
								setState(66);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(69);
						match(T__7);
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
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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
		case 0:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23R\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2)\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2A\n\2\f\2\16\2D\13\2\5\2F\n\2\3\2\3\2\3"+
		"\2\7\2K\n\2\f\2\16\2N\13\2\3\3\3\3\3\3\2\3\2\4\2\4\2\2\2]\2(\3\2\2\2\4"+
		"O\3\2\2\2\6\7\b\2\1\2\7\b\7\21\2\2\b)\b\2\1\2\t\n\7\13\2\2\n)\b\2\1\2"+
		"\13\f\7\f\2\2\f)\b\2\1\2\r\16\5\4\3\2\16\17\b\2\1\2\17)\3\2\2\2\20\21"+
		"\7\r\2\2\21)\b\2\1\2\22\23\7\16\2\2\23\24\7\17\2\2\24\25\7\4\2\2\25\26"+
		"\5\2\2\2\26\27\7\5\2\2\27\30\b\2\1\2\30)\3\2\2\2\31\32\7\16\2\2\32\33"+
		"\5\4\3\2\33\34\7\b\2\2\34\35\7\n\2\2\35\36\b\2\1\2\36)\3\2\2\2\37 \7\20"+
		"\2\2 !\5\2\2\4!\"\b\2\1\2\")\3\2\2\2#$\7\b\2\2$%\5\2\2\2%&\7\n\2\2&\'"+
		"\b\2\1\2\')\3\2\2\2(\6\3\2\2\2(\t\3\2\2\2(\13\3\2\2\2(\r\3\2\2\2(\20\3"+
		"\2\2\2(\22\3\2\2\2(\31\3\2\2\2(\37\3\2\2\2(#\3\2\2\2)L\3\2\2\2*+\f\17"+
		"\2\2+,\7\3\2\2,-\5\2\2\20-.\b\2\1\2.K\3\2\2\2/\60\f\16\2\2\60\61\7\4\2"+
		"\2\61\62\5\2\2\2\62\63\7\5\2\2\63\64\b\2\1\2\64K\3\2\2\2\65\66\f\r\2\2"+
		"\66\67\7\6\2\2\678\7\7\2\28K\b\2\1\29:\f\f\2\2:;\7\6\2\2;<\5\4\3\2<E\7"+
		"\b\2\2=B\5\2\2\2>?\7\t\2\2?A\5\2\2\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3"+
		"\2\2\2CF\3\2\2\2DB\3\2\2\2E=\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\n\2\2HI\b"+
		"\2\1\2IK\3\2\2\2J*\3\2\2\2J/\3\2\2\2J\65\3\2\2\2J9\3\2\2\2KN\3\2\2\2L"+
		"J\3\2\2\2LM\3\2\2\2M\3\3\2\2\2NL\3\2\2\2OP\7\22\2\2P\5\3\2\2\2\7(BEJL";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}