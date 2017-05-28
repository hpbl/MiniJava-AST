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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, INTEGER_LITERAL=36, IDENTIFIER=37, 
		WS=38;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expression = 7, 
		RULE_identifier = 8;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "expression", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "','", "'return'", 
		"'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
		"'='", "'&&'", "'<'", "'+'", "'-'", "'*'", "'.'", "'length'", "'true'", 
		"'false'", "'this'", "'new'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"INTEGER_LITERAL", "IDENTIFIER", "WS"
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
	public static class GoalContext extends ParserRuleContext {
		public Program programa;
		public MainClassContext mc1;
		public ClassDeclarationContext cd1;
		public TerminalNode EOF() { return getToken(gramParser.EOF, 0); }
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((GoalContext)_localctx).mc1 = mainClass();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(19);
				((GoalContext)_localctx).cd1 = classDeclaration();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(EOF);
			ClassDeclList cdl1 = new ClassDeclList();

			                if (((GoalContext)_localctx).cd1 != null) {
			                    cdl1.addElement(((GoalContext)_localctx).cd1.declClasse);
			                }

			                ((GoalContext)_localctx).programa =  new Program(((GoalContext)_localctx).mc1.classeMain, cdl1);
			                
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

	public static class MainClassContext extends ParserRuleContext {
		public MainClass classeMain;
		public IdentifierContext id1;
		public IdentifierContext id2;
		public StatementContext s1;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			((MainClassContext)_localctx).id1 = identifier();
			setState(30);
			match(T__1);
			setState(31);
			match(T__2);
			setState(32);
			match(T__3);
			setState(33);
			match(T__4);
			setState(34);
			match(T__5);
			setState(35);
			match(T__6);
			setState(36);
			match(T__7);
			setState(37);
			match(T__8);
			setState(38);
			match(T__9);
			setState(39);
			((MainClassContext)_localctx).id2 = identifier();
			setState(40);
			match(T__10);
			setState(41);
			match(T__1);
			setState(42);
			((MainClassContext)_localctx).s1 = statement();
			setState(43);
			match(T__11);
			setState(44);
			match(T__11);
			Identifier idtf1 = new Identifier(((MainClassContext)_localctx).id1.getText());
			                Identifier idtf2 = new Identifier(((MainClassContext)_localctx).id2.getText());

			                ((MainClassContext)_localctx).classeMain =  new MainClass(idtf1, idtf2, ((MainClassContext)_localctx).s1.declaracao);
			                
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDecl declClasse;
		public IdentifierContext id1;
		public IdentifierContext id2;
		public VarDeclarationContext vd1;
		public MethodDeclarationContext md1;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			((ClassDeclarationContext)_localctx).id1 = identifier();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(49);
				match(T__12);
				setState(50);
				((ClassDeclarationContext)_localctx).id2 = identifier();
				}
			}

			setState(53);
			match(T__1);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(54);
				((ClassDeclarationContext)_localctx).vd1 = varDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(60);
				((ClassDeclarationContext)_localctx).md1 = methodDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__11);
			Identifier idtf1 = new Identifier(((ClassDeclarationContext)_localctx).id1.getText());

			                VarDeclList vl1 = new VarDeclList();

			                if (((ClassDeclarationContext)_localctx).vd1 != null) {
			                    vl1.addElement(((ClassDeclarationContext)_localctx).vd1.declVariavel);
			                }

			                MethodDeclList ml1 = new MethodDeclList();
			                ml1.addElement(((ClassDeclarationContext)_localctx).md1.declMetodo);

			                if (((ClassDeclarationContext)_localctx).id2 != null) {
			                    Identifier idtf2 = new Identifier(((ClassDeclarationContext)_localctx).id2.getText());
			                    ((ClassDeclarationContext)_localctx).declClasse =  new ClassDeclExtends(idtf1, idtf2, vl1, ml1);

			                } else {
			                    ((ClassDeclarationContext)_localctx).declClasse =  new ClassDeclSimple(idtf1, vl1, ml1);
			                }

			                
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDecl declVariavel;
		public TypeContext tp;
		public IdentifierContext id;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((VarDeclarationContext)_localctx).tp = type();
			setState(70);
			((VarDeclarationContext)_localctx).id = identifier();
			setState(71);
			match(T__13);
			Identifier idtf = new Identifier(((VarDeclarationContext)_localctx).id.getText());
			                ((VarDeclarationContext)_localctx).declVariavel =  new VarDecl(((VarDeclarationContext)_localctx).tp.tipo, idtf);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDecl declMetodo;
		public TypeContext tp1;
		public IdentifierContext id1;
		public TypeContext tp2;
		public IdentifierContext id2;
		public TypeContext tp3;
		public IdentifierContext id3;
		public VarDeclarationContext vd1;
		public StatementContext st1;
		public ExpressionContext e1;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramListener ) ((gramListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramVisitor ) return ((gramVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__2);
			setState(75);
			((MethodDeclarationContext)_localctx).tp1 = type();
			setState(76);
			((MethodDeclarationContext)_localctx).id1 = identifier();
			setState(77);
			match(T__6);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(78);
				((MethodDeclarationContext)_localctx).tp2 = type();
				setState(79);
				((MethodDeclarationContext)_localctx).id2 = identifier();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(80);
					match(T__14);
					setState(81);
					((MethodDeclarationContext)_localctx).tp3 = type();
					setState(82);
					((MethodDeclarationContext)_localctx).id3 = identifier();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(91);
			match(T__10);
			setState(92);
			match(T__1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					((MethodDeclarationContext)_localctx).vd1 = varDeclaration();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(99);
				((MethodDeclarationContext)_localctx).st1 = statement();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(T__15);
			setState(106);
			((MethodDeclarationContext)_localctx).e1 = expression(0);
			setState(107);
			match(T__13);
			setState(108);
			match(T__11);
			Identifier idtf1 = new Identifier(((MethodDeclarationContext)_localctx).id1.getText());

			                FormalList fl1 = new FormalList();
			                Identifier idtf2 = new Identifier(((MethodDeclarationContext)_localctx).id2.getText());
			                Formal f1 = new Formal(((MethodDeclarationContext)_localctx).tp2.tipo, idtf2);
			                fl1.addElement(f1);

			                if (((MethodDeclarationContext)_localctx).tp3 != null) {
			                    Identifier idtf3 = new Identifier(((MethodDeclarationContext)_localctx).id3.getText());
			                    Formal f2 = new Formal(((MethodDeclarationContext)_localctx).tp3.tipo, idtf3);
			                    fl1.addElement(f2);
			                }

			                VarDeclList vl1 = new VarDeclList();
			                vl1.addElement(((MethodDeclarationContext)_localctx).vd1.declVariavel);

			                StatementList sl1 = new StatementList();
			                sl1.addElement(((MethodDeclarationContext)_localctx).st1.declaracao);

			                ((MethodDeclarationContext)_localctx).declMetodo =  new MethodDecl(((MethodDeclarationContext)_localctx).tp1.tipo, idtf1, fl1, vl1, sl1, ((MethodDeclarationContext)_localctx).e1.expressao);
			                
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
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__16);
				setState(112);
				match(T__8);
				setState(113);
				match(T__9);
				((TypeContext)_localctx).tipo =  new IntArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__17);
				((TypeContext)_localctx).tipo =  new BooleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(T__16);
				((TypeContext)_localctx).tipo =  new IntegerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
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
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__1);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(125);
					((StatementContext)_localctx).stmt = statement();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(T__11);
				StatementList list = new StatementList();
				                list.addElement(((StatementContext)_localctx).stmt.declaracao);
				                ((StatementContext)_localctx).declaracao =  new Block(list);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__18);
				setState(134);
				match(T__6);
				setState(135);
				((StatementContext)_localctx).exp = expression(0);
				setState(136);
				match(T__10);
				setState(137);
				((StatementContext)_localctx).s1 = statement();
				setState(138);
				match(T__19);
				setState(139);
				((StatementContext)_localctx).s2 = statement();
				((StatementContext)_localctx).declaracao =  new If(((StatementContext)_localctx).exp.expressao, ((StatementContext)_localctx).s1.declaracao, ((StatementContext)_localctx).s2.declaracao);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(T__20);
				setState(143);
				match(T__6);
				setState(144);
				((StatementContext)_localctx).exp = expression(0);
				setState(145);
				match(T__10);
				setState(146);
				((StatementContext)_localctx).blck = statement();
				((StatementContext)_localctx).declaracao =  new While(((StatementContext)_localctx).exp.expressao, ((StatementContext)_localctx).blck.declaracao);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(T__21);
				setState(150);
				match(T__6);
				setState(151);
				((StatementContext)_localctx).exp = expression(0);
				setState(152);
				match(T__10);
				setState(153);
				match(T__13);
				((StatementContext)_localctx).declaracao =  new Print(((StatementContext)_localctx).exp.expressao);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				((StatementContext)_localctx).id = identifier();
				setState(157);
				match(T__22);
				setState(158);
				((StatementContext)_localctx).exp = expression(0);
				setState(159);
				match(T__13);
				Identifier idtf = new Identifier(((StatementContext)_localctx).id.getText());
				                ((StatementContext)_localctx).declaracao =  new Assign(idtf, ((StatementContext)_localctx).exp.expressao);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				((StatementContext)_localctx).id = identifier();
				setState(163);
				match(T__8);
				setState(164);
				((StatementContext)_localctx).e1 = expression(0);
				setState(165);
				match(T__9);
				setState(166);
				match(T__22);
				setState(167);
				((StatementContext)_localctx).e2 = expression(0);
				setState(168);
				match(T__13);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(174);
				((ExpressionContext)_localctx).integer = match(INTEGER_LITERAL);
				((ExpressionContext)_localctx).expressao =  new IntegerLiteral(Integer.parseInt(((ExpressionContext)_localctx).integer.getText()));
				}
				break;
			case 2:
				{
				setState(176);
				match(T__30);
				((ExpressionContext)_localctx).expressao =  new True();
				}
				break;
			case 3:
				{
				setState(178);
				match(T__31);
				((ExpressionContext)_localctx).expressao =  new False();
				}
				break;
			case 4:
				{
				setState(180);
				((ExpressionContext)_localctx).id = identifier();
				((ExpressionContext)_localctx).expressao =  new IdentifierExp(((ExpressionContext)_localctx).id.getText());
				}
				break;
			case 5:
				{
				setState(183);
				match(T__32);
				((ExpressionContext)_localctx).expressao =  new This();
				}
				break;
			case 6:
				{
				setState(185);
				match(T__33);
				setState(186);
				match(T__16);
				setState(187);
				match(T__8);
				setState(188);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(189);
				match(T__9);
				((ExpressionContext)_localctx).expressao =  new NewArray(((ExpressionContext)_localctx).exp.expressao);
				}
				break;
			case 7:
				{
				setState(192);
				match(T__33);
				setState(193);
				((ExpressionContext)_localctx).id = identifier();
				setState(194);
				match(T__6);
				setState(195);
				match(T__10);
				((ExpressionContext)_localctx).expressao =  new NewObject(new Identifier(((ExpressionContext)_localctx).id.getText()));
				}
				break;
			case 8:
				{
				setState(198);
				match(T__34);
				setState(199);
				((ExpressionContext)_localctx).exp = expression(2);
				((ExpressionContext)_localctx).expressao =  new Not(((ExpressionContext)_localctx).exp.expressao);
				}
				break;
			case 9:
				{
				setState(202);
				match(T__6);
				setState(203);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(204);
				match(T__10);
				/* descobrir o que é isso */
				                ((ExpressionContext)_localctx).expressao =  ((ExpressionContext)_localctx).exp.expressao;
				                
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(241);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(210);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(211);
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
						setState(214);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(215);
						match(T__8);
						setState(216);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(217);
						match(T__9);
						((ExpressionContext)_localctx).expressao =  new ArrayLookup(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(221);
						match(T__28);
						setState(222);
						match(T__29);
						((ExpressionContext)_localctx).expressao =  new ArrayLength(((ExpressionContext)_localctx).e1.expressao);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(225);
						match(T__28);
						setState(226);
						((ExpressionContext)_localctx).id = identifier();
						setState(227);
						match(T__6);
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << INTEGER_LITERAL) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(228);
							((ExpressionContext)_localctx).e2 = expression(0);
							setState(233);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__14) {
								{
								{
								setState(229);
								match(T__14);
								setState(230);
								((ExpressionContext)_localctx).e3 = expression(0);
								}
								}
								setState(235);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(238);
						match(T__10);
						ExpList expList = new ExpList();

						                          if (((ExpressionContext)_localctx).e2 != null) {
						                              expList.addElement(((ExpressionContext)_localctx).e2.expressao);

						                              if (((ExpressionContext)_localctx).e3 != null) {
						                                  expList.addElement(((ExpressionContext)_localctx).e3.expressao);
						                              }
						                          }


						                           Identifier idtf = new Identifier(((ExpressionContext)_localctx).id.getText());

						                           ((ExpressionContext)_localctx).expressao =  new Call(((ExpressionContext)_localctx).e1.expressao, idtf, expList);
						}
						break;
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 16, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\66"+
		"\n\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"W\n\6\f\6\16\6Z\13\6\5\6\\\n\6\3\6\3\6\3\6\7\6a\n\6\f\6\16\6d\13\6\3\6"+
		"\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\7\b\u0081\n\b\f\b\16\b\u0084\13"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ae\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d2\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ea"+
		"\n\t\f\t\16\t\u00ed\13\t\5\t\u00ef\n\t\3\t\3\t\3\t\7\t\u00f4\n\t\f\t\16"+
		"\t\u00f7\13\t\3\n\3\n\3\n\2\3\20\13\2\4\6\b\n\f\16\20\22\2\3\3\2\32\36"+
		"\2\u0110\2\24\3\2\2\2\4\36\3\2\2\2\6\61\3\2\2\2\bG\3\2\2\2\nL\3\2\2\2"+
		"\f|\3\2\2\2\16\u00ad\3\2\2\2\20\u00d1\3\2\2\2\22\u00f8\3\2\2\2\24\30\5"+
		"\4\3\2\25\27\5\6\4\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3"+
		"\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7\2\2\3\34\35\b\2\1\2\35\3\3"+
		"\2\2\2\36\37\7\3\2\2\37 \5\22\n\2 !\7\4\2\2!\"\7\5\2\2\"#\7\6\2\2#$\7"+
		"\7\2\2$%\7\b\2\2%&\7\t\2\2&\'\7\n\2\2\'(\7\13\2\2()\7\f\2\2)*\5\22\n\2"+
		"*+\7\r\2\2+,\7\4\2\2,-\5\16\b\2-.\7\16\2\2./\7\16\2\2/\60\b\3\1\2\60\5"+
		"\3\2\2\2\61\62\7\3\2\2\62\65\5\22\n\2\63\64\7\17\2\2\64\66\5\22\n\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67;\7\4\2\28:\5\b\5\298\3\2\2"+
		"\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>@\5\n\6\2?>\3\2\2"+
		"\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\16\2\2EF\b\4"+
		"\1\2F\7\3\2\2\2GH\5\f\7\2HI\5\22\n\2IJ\7\20\2\2JK\b\5\1\2K\t\3\2\2\2L"+
		"M\7\5\2\2MN\5\f\7\2NO\5\22\n\2O[\7\t\2\2PQ\5\f\7\2QX\5\22\n\2RS\7\21\2"+
		"\2ST\5\f\7\2TU\5\22\n\2UW\3\2\2\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2[P\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\r\2\2^b"+
		"\7\4\2\2_a\5\b\5\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ch\3\2\2\2d"+
		"b\3\2\2\2eg\5\16\b\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2"+
		"jh\3\2\2\2kl\7\22\2\2lm\5\20\t\2mn\7\20\2\2no\7\16\2\2op\b\6\1\2p\13\3"+
		"\2\2\2qr\7\23\2\2rs\7\13\2\2st\7\f\2\2t}\b\7\1\2uv\7\24\2\2v}\b\7\1\2"+
		"wx\7\23\2\2x}\b\7\1\2yz\5\22\n\2z{\b\7\1\2{}\3\2\2\2|q\3\2\2\2|u\3\2\2"+
		"\2|w\3\2\2\2|y\3\2\2\2}\r\3\2\2\2~\u0082\7\4\2\2\177\u0081\5\16\b\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\16\2\2\u0086"+
		"\u00ae\b\b\1\2\u0087\u0088\7\25\2\2\u0088\u0089\7\t\2\2\u0089\u008a\5"+
		"\20\t\2\u008a\u008b\7\r\2\2\u008b\u008c\5\16\b\2\u008c\u008d\7\26\2\2"+
		"\u008d\u008e\5\16\b\2\u008e\u008f\b\b\1\2\u008f\u00ae\3\2\2\2\u0090\u0091"+
		"\7\27\2\2\u0091\u0092\7\t\2\2\u0092\u0093\5\20\t\2\u0093\u0094\7\r\2\2"+
		"\u0094\u0095\5\16\b\2\u0095\u0096\b\b\1\2\u0096\u00ae\3\2\2\2\u0097\u0098"+
		"\7\30\2\2\u0098\u0099\7\t\2\2\u0099\u009a\5\20\t\2\u009a\u009b\7\r\2\2"+
		"\u009b\u009c\7\20\2\2\u009c\u009d\b\b\1\2\u009d\u00ae\3\2\2\2\u009e\u009f"+
		"\5\22\n\2\u009f\u00a0\7\31\2\2\u00a0\u00a1\5\20\t\2\u00a1\u00a2\7\20\2"+
		"\2\u00a2\u00a3\b\b\1\2\u00a3\u00ae\3\2\2\2\u00a4\u00a5\5\22\n\2\u00a5"+
		"\u00a6\7\13\2\2\u00a6\u00a7\5\20\t\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\7"+
		"\31\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac\b\b\1\2"+
		"\u00ac\u00ae\3\2\2\2\u00ad~\3\2\2\2\u00ad\u0087\3\2\2\2\u00ad\u0090\3"+
		"\2\2\2\u00ad\u0097\3\2\2\2\u00ad\u009e\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ae"+
		"\17\3\2\2\2\u00af\u00b0\b\t\1\2\u00b0\u00b1\7&\2\2\u00b1\u00d2\b\t\1\2"+
		"\u00b2\u00b3\7!\2\2\u00b3\u00d2\b\t\1\2\u00b4\u00b5\7\"\2\2\u00b5\u00d2"+
		"\b\t\1\2\u00b6\u00b7\5\22\n\2\u00b7\u00b8\b\t\1\2\u00b8\u00d2\3\2\2\2"+
		"\u00b9\u00ba\7#\2\2\u00ba\u00d2\b\t\1\2\u00bb\u00bc\7$\2\2\u00bc\u00bd"+
		"\7\23\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf\5\20\t\2\u00bf\u00c0\7\f\2"+
		"\2\u00c0\u00c1\b\t\1\2\u00c1\u00d2\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3\u00c4"+
		"\5\22\n\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6\7\r\2\2\u00c6\u00c7\b\t\1\2"+
		"\u00c7\u00d2\3\2\2\2\u00c8\u00c9\7%\2\2\u00c9\u00ca\5\20\t\4\u00ca\u00cb"+
		"\b\t\1\2\u00cb\u00d2\3\2\2\2\u00cc\u00cd\7\t\2\2\u00cd\u00ce\5\20\t\2"+
		"\u00ce\u00cf\7\r\2\2\u00cf\u00d0\b\t\1\2\u00d0\u00d2\3\2\2\2\u00d1\u00af"+
		"\3\2\2\2\u00d1\u00b2\3\2\2\2\u00d1\u00b4\3\2\2\2\u00d1\u00b6\3\2\2\2\u00d1"+
		"\u00b9\3\2\2\2\u00d1\u00bb\3\2\2\2\u00d1\u00c2\3\2\2\2\u00d1\u00c8\3\2"+
		"\2\2\u00d1\u00cc\3\2\2\2\u00d2\u00f5\3\2\2\2\u00d3\u00d4\f\17\2\2\u00d4"+
		"\u00d5\t\2\2\2\u00d5\u00d6\5\20\t\20\u00d6\u00d7\b\t\1\2\u00d7\u00f4\3"+
		"\2\2\2\u00d8\u00d9\f\16\2\2\u00d9\u00da\7\13\2\2\u00da\u00db\5\20\t\2"+
		"\u00db\u00dc\7\f\2\2\u00dc\u00dd\b\t\1\2\u00dd\u00f4\3\2\2\2\u00de\u00df"+
		"\f\r\2\2\u00df\u00e0\7\37\2\2\u00e0\u00e1\7 \2\2\u00e1\u00f4\b\t\1\2\u00e2"+
		"\u00e3\f\f\2\2\u00e3\u00e4\7\37\2\2\u00e4\u00e5\5\22\n\2\u00e5\u00ee\7"+
		"\t\2\2\u00e6\u00eb\5\20\t\2\u00e7\u00e8\7\21\2\2\u00e8\u00ea\5\20\t\2"+
		"\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\r\2\2\u00f1\u00f2\b\t"+
		"\1\2\u00f2\u00f4\3\2\2\2\u00f3\u00d3\3\2\2\2\u00f3\u00d8\3\2\2\2\u00f3"+
		"\u00de\3\2\2\2\u00f3\u00e2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\21\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9"+
		"\7\'\2\2\u00f9\23\3\2\2\2\22\30\65;AX[bh|\u0082\u00ad\u00d1\u00eb\u00ee"+
		"\u00f3\u00f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}