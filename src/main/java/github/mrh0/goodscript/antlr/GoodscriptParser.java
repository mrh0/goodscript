// Generated from W:/Development/GitHub/goodscript/src/main/antlr4\Goodscript.g4 by ANTLR 4.10.1
package github.mrh0.goodscript.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoodscriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, NL=57, BOOL=58, NAME=59, ATOM=60, 
		INT=61, FLOAT=62, HEX=63, BIN=64, CHAR=65, STRING=66, WHITESPACE=67, EMPTYLINE=68, 
		COMMENT=69, BLOCKCOMMENT=70, INDENT=71, DEDENT=72;
	public static final int
		RULE_number = 0, RULE_primitive = 1, RULE_block = 2, RULE_unOp = 3, RULE_binOp = 4, 
		RULE_expr = 5, RULE_type = 6, RULE_argument = 7, RULE_orderExpression = 8, 
		RULE_functionCall = 9, RULE_statement = 10, RULE_use = 11, RULE_funcPrefix = 12, 
		RULE_func = 13, RULE_program = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"number", "primitive", "block", "unOp", "binOp", "expr", "type", "argument", 
			"orderExpression", "functionCall", "statement", "use", "funcPrefix", 
			"func", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'not'", "'!'", "'!!'", "'~'", "'-'", "'+'", "'*'", "'/'", "'%'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'and'", "'||'", 
			"'or'", "'<<'", "'>>'", "'here'", "'('", "')'", "'if'", "'else'", "'is'", 
			"'!is'", "'as'", "','", "'&'", "'.'", "'['", "']'", "'|'", "':'", "'_'", 
			"'orderby'", "'orderasc'", "'orderdesc'", "'var'", "'='", "'val'", "'break'", 
			"'continue'", "'do'", "'eif'", "'while'", "'for'", "'in'", "'where'", 
			"'ret'", "'use'", "'from'", "'start'", "'fn'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "NL", "BOOL", "NAME", 
			"ATOM", "INT", "FLOAT", "HEX", "BIN", "CHAR", "STRING", "WHITESPACE", 
			"EMPTYLINE", "COMMENT", "BLOCKCOMMENT", "INDENT", "DEDENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Goodscript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GoodscriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberIntContext extends NumberContext {
		public TerminalNode INT() { return getToken(GoodscriptParser.INT, 0); }
		public NumberIntContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterNumberInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitNumberInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitNumberInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberFloatContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(GoodscriptParser.FLOAT, 0); }
		public NumberFloatContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterNumberFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitNumberFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitNumberFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberHexContext extends NumberContext {
		public TerminalNode HEX() { return getToken(GoodscriptParser.HEX, 0); }
		public NumberHexContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterNumberHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitNumberHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitNumberHex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberBinContext extends NumberContext {
		public TerminalNode BIN() { return getToken(GoodscriptParser.BIN, 0); }
		public NumberBinContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterNumberBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitNumberBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitNumberBin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_number);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new NumberIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new NumberFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(FLOAT);
				}
				break;
			case HEX:
				_localctx = new NumberHexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(HEX);
				}
				break;
			case BIN:
				_localctx = new NumberBinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(BIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrimitiveContext extends ParserRuleContext {
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
	 
		public PrimitiveContext() { }
		public void copyFrom(PrimitiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimitiveBoolContext extends PrimitiveContext {
		public TerminalNode BOOL() { return getToken(GoodscriptParser.BOOL, 0); }
		public PrimitiveBoolContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterPrimitiveBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitPrimitiveBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitPrimitiveBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveNumberContext extends PrimitiveContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PrimitiveNumberContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterPrimitiveNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitPrimitiveNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitPrimitiveNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveCharContext extends PrimitiveContext {
		public TerminalNode CHAR() { return getToken(GoodscriptParser.CHAR, 0); }
		public PrimitiveCharContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterPrimitiveChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitPrimitiveChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitPrimitiveChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveStringContext extends PrimitiveContext {
		public TerminalNode STRING() { return getToken(GoodscriptParser.STRING, 0); }
		public PrimitiveStringContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterPrimitiveString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitPrimitiveString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitPrimitiveString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveAtomContext extends PrimitiveContext {
		public TerminalNode ATOM() { return getToken(GoodscriptParser.ATOM, 0); }
		public PrimitiveAtomContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterPrimitiveAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitPrimitiveAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitPrimitiveAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitive);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case HEX:
			case BIN:
				_localctx = new PrimitiveNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				number();
				}
				break;
			case BOOL:
				_localctx = new PrimitiveBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new PrimitiveStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(STRING);
				}
				break;
			case CHAR:
				_localctx = new PrimitiveCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				match(CHAR);
				}
				break;
			case ATOM:
				_localctx = new PrimitiveAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(ATOM);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public TerminalNode INDENT() { return getToken(GoodscriptParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(GoodscriptParser.DEDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(INDENT);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				((BlockContext)_localctx).statement = statement();
				((BlockContext)_localctx).statements.add(((BlockContext)_localctx).statement);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__47) | (1L << T__48) | (1L << T__51) | (1L << NAME))) != 0) );
			setState(49);
			match(DEDENT);
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

	public static class UnOpContext extends ParserRuleContext {
		public UnOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterUnOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitUnOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitUnOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnOpContext unOp() throws RecognitionException {
		UnOpContext _localctx = new UnOpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BinOpContext extends ParserRuleContext {
		public BinOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinOpContext binOp() throws RecognitionException {
		BinOpContext _localctx = new BinOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprNestContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNestContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprNest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprNest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprNest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprInlineIfContext extends ExprContext {
		public ExprContext condition;
		public ExprContext body;
		public ExprContext elseBody;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprInlineIfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprInlineIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprInlineIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprInlineIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprHereContext extends ExprContext {
		public ExprHereContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprHere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprHere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprHere(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNamedContext extends ExprContext {
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public ExprNamedContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprNamed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprNamed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprNamed(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAsContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public ExprAsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprAs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBinOpContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public BinOpContext binOp() {
			return getRuleContext(BinOpContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprBinOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprBinOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprBinOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAccessorContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprAccessorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprAccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprAccessor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIsContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public ExprIsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprIs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTupleContext extends ExprContext {
		public List<ExprContext> values = new ArrayList<ExprContext>();
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprTupleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCallFunctionContext extends ExprContext {
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprCallFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPrimitiveContext extends ExprContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public ExprPrimitiveContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAccessNameContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public ExprAccessNameContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprAccessName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprAccessName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprAccessName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIsNotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public ExprIsNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprIsNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprIsNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprIsNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprUnOpContext extends ExprContext {
		public UnOpContext unOp() {
			return getRuleContext(UnOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprUnOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprUnOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprUnOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprUnOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new ExprHereContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(56);
				match(T__21);
				}
				break;
			case 2:
				{
				_localctx = new ExprUnOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				unOp();
				setState(58);
				expr(12);
				}
				break;
			case 3:
				{
				_localctx = new ExprNestContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(T__22);
				setState(61);
				expr(0);
				setState(62);
				match(T__23);
				}
				break;
			case 4:
				{
				_localctx = new ExprPrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				primitive();
				}
				break;
			case 5:
				{
				_localctx = new ExprNamedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(NAME);
				}
				break;
			case 6:
				{
				_localctx = new ExprInlineIfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(T__24);
				setState(67);
				match(T__22);
				setState(68);
				((ExprInlineIfContext)_localctx).condition = expr(0);
				setState(69);
				match(T__23);
				setState(70);
				((ExprInlineIfContext)_localctx).body = expr(0);
				setState(71);
				match(T__25);
				setState(72);
				((ExprInlineIfContext)_localctx).elseBody = expr(8);
				}
				break;
			case 7:
				{
				_localctx = new ExprCallFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(NAME);
				setState(75);
				match(T__22);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << BOOL) | (1L << NAME) | (1L << ATOM) | (1L << INT) | (1L << FLOAT) | (1L << HEX))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BIN - 64)) | (1L << (CHAR - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(76);
					((ExprCallFunctionContext)_localctx).expr = expr(0);
					((ExprCallFunctionContext)_localctx).args.add(((ExprCallFunctionContext)_localctx).expr);
					}
				}

				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(79);
					match(T__29);
					setState(80);
					((ExprCallFunctionContext)_localctx).expr = expr(0);
					((ExprCallFunctionContext)_localctx).args.add(((ExprCallFunctionContext)_localctx).expr);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__23);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBinOpContext(new ExprContext(_parentctx, _parentState));
						((ExprBinOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(90);
						binOp();
						setState(91);
						((ExprBinOpContext)_localctx).right = expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprIsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(94);
						match(T__26);
						setState(95);
						match(NAME);
						}
						break;
					case 3:
						{
						_localctx = new ExprIsNotContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(97);
						match(T__27);
						setState(98);
						match(NAME);
						}
						break;
					case 4:
						{
						_localctx = new ExprAsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(100);
						match(T__28);
						setState(101);
						match(NAME);
						}
						break;
					case 5:
						{
						_localctx = new ExprTupleContext(new ExprContext(_parentctx, _parentState));
						((ExprTupleContext)_localctx).values.add(_prevctx);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(103);
						match(T__30);
						setState(104);
						((ExprTupleContext)_localctx).expr = expr(0);
						((ExprTupleContext)_localctx).values.add(((ExprTupleContext)_localctx).expr);
						setState(109);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(105);
								match(T__30);
								setState(106);
								((ExprTupleContext)_localctx).expr = expr(0);
								((ExprTupleContext)_localctx).values.add(((ExprTupleContext)_localctx).expr);
								}
								} 
							}
							setState(111);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
						}
						}
						break;
					case 6:
						{
						_localctx = new ExprAccessNameContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(113);
						match(T__31);
						setState(114);
						match(NAME);
						}
						break;
					case 7:
						{
						_localctx = new ExprAccessorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(116);
						match(T__32);
						setState(117);
						expr(0);
						setState(118);
						match(T__33);
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeUnionContext extends TypeContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeUnionContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterTypeUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitTypeUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitTypeUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeTupleContext extends TypeContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeTupleContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterTypeTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitTypeTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitTypeTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeByNameContext extends TypeContext {
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public TypeByNameContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterTypeByName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitTypeByName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitTypeByName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeNestContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeNestContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterTypeNest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitTypeNest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitTypeNest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new TypeByNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(126);
				match(NAME);
				}
				break;
			case T__22:
				{
				_localctx = new TypeNestContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(T__22);
				setState(128);
				type(0);
				setState(129);
				match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new TypeUnionContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(133);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(134);
						match(T__34);
						setState(135);
						type(0);
						setState(140);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(136);
								match(T__34);
								setState(137);
								type(0);
								}
								} 
							}
							setState(142);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						}
						}
						break;
					case 2:
						{
						_localctx = new TypeTupleContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(143);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(144);
						match(T__30);
						setState(145);
						type(0);
						setState(150);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(146);
								match(T__30);
								setState(147);
								type(0);
								}
								} 
							}
							setState(152);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentWildcardContext extends ArgumentContext {
		public ArgumentWildcardContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterArgumentWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitArgumentWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitArgumentWildcard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentPrimitiveContext extends ArgumentContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public ArgumentPrimitiveContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterArgumentPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitArgumentPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitArgumentPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentTypedContext extends ArgumentContext {
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgumentTypedContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterArgumentTyped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitArgumentTyped(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitArgumentTyped(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argument);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new ArgumentTypedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(NAME);
				setState(159);
				match(T__35);
				setState(160);
				type(0);
				}
				break;
			case BOOL:
			case ATOM:
			case INT:
			case FLOAT:
			case HEX:
			case BIN:
			case CHAR:
			case STRING:
				_localctx = new ArgumentPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				primitive();
				}
				break;
			case T__36:
				_localctx = new ArgumentWildcardContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(T__36);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OrderExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OrderExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterOrderExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitOrderExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitOrderExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExpressionContext orderExpression() throws RecognitionException {
		OrderExpressionContext _localctx = new OrderExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_orderExpression);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__37);
				setState(166);
				expr(0);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__38);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(T__39);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallWithArgsContext extends FunctionCallContext {
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallWithArgsContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterFunctionCallWithArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitFunctionCallWithArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitFunctionCallWithArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallNoArgsContext extends FunctionCallContext {
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public FunctionCallNoArgsContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterFunctionCallNoArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitFunctionCallNoArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitFunctionCallNoArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new FunctionCallWithArgsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(NAME);
				setState(173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(172);
					match(T__22);
					}
					break;
				}
				setState(175);
				((FunctionCallWithArgsContext)_localctx).expr = expr(0);
				((FunctionCallWithArgsContext)_localctx).args.add(((FunctionCallWithArgsContext)_localctx).expr);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(176);
					match(T__29);
					setState(177);
					((FunctionCallWithArgsContext)_localctx).expr = expr(0);
					((FunctionCallWithArgsContext)_localctx).args.add(((FunctionCallWithArgsContext)_localctx).expr);
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(183);
					match(T__23);
					}
				}

				}
				break;
			case 2:
				_localctx = new FunctionCallNoArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(NAME);
				setState(187);
				match(T__22);
				setState(188);
				match(T__23);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementAssignmentContext extends StatementContext {
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public StatementAssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementContinueContext extends StatementContext {
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public StatementContinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementReturnContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public StatementReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementBreakContext extends StatementContext {
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public StatementBreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementForInContext extends StatementContext {
		public BlockContext body;
		public BlockContext elseBody;
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public OrderExpressionContext orderExpression() {
			return getRuleContext(OrderExpressionContext.class,0);
		}
		public StatementForInContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementForIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementForIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementForIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefineDestructureTupleContext extends StatementContext {
		public List<TerminalNode> NAME() { return getTokens(GoodscriptParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GoodscriptParser.NAME, i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public StatementDefineDestructureTupleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementDefineDestructureTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementDefineDestructureTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementDefineDestructureTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefineConstDestructureTupleContext extends StatementContext {
		public List<TerminalNode> NAME() { return getTokens(GoodscriptParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GoodscriptParser.NAME, i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public StatementDefineConstDestructureTupleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementDefineConstDestructureTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementDefineConstDestructureTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementDefineConstDestructureTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefineConstContext extends StatementContext {
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementDefineConstContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementDefineConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementDefineConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementDefineConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefineContext extends StatementContext {
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementDefineContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementDefine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementCallFunctionReturnContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public StatementCallFunctionReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementCallFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementCallFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementCallFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementWhileContext extends StatementContext {
		public ExprContext condition;
		public BlockContext body;
		public BlockContext elseBody;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementIfContext extends StatementContext {
		public ExprContext expr;
		public List<ExprContext> conditions = new ArrayList<ExprContext>();
		public BlockContext block;
		public List<BlockContext> bodies = new ArrayList<BlockContext>();
		public BlockContext elseBody;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementCallFunctionContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public StatementCallFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new StatementDefineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(T__40);
				setState(192);
				match(NAME);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(193);
					match(T__35);
					setState(194);
					type(0);
					}
				}

				setState(197);
				match(T__41);
				setState(198);
				expr(0);
				setState(199);
				match(NL);
				}
				break;
			case 2:
				_localctx = new StatementDefineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__40);
				setState(202);
				match(NAME);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(203);
					match(T__35);
					setState(204);
					type(0);
					}
				}

				setState(207);
				match(T__41);
				setState(208);
				functionCall();
				setState(209);
				match(NL);
				}
				break;
			case 3:
				_localctx = new StatementDefineDestructureTupleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(T__40);
				setState(212);
				match(NAME);
				setState(213);
				match(T__29);
				setState(214);
				match(NAME);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(215);
					match(T__29);
					setState(216);
					match(NAME);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(T__41);
				setState(223);
				functionCall();
				setState(224);
				match(NL);
				}
				break;
			case 4:
				_localctx = new StatementDefineConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(T__42);
				setState(227);
				match(NAME);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(228);
					match(T__35);
					setState(229);
					type(0);
					}
				}

				setState(232);
				match(T__41);
				setState(233);
				expr(0);
				setState(234);
				match(NL);
				}
				break;
			case 5:
				_localctx = new StatementDefineConstContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(T__42);
				setState(237);
				match(NAME);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(238);
					match(T__35);
					setState(239);
					type(0);
					}
				}

				setState(242);
				match(T__41);
				setState(243);
				functionCall();
				setState(244);
				match(NL);
				}
				break;
			case 6:
				_localctx = new StatementDefineConstDestructureTupleContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				match(T__42);
				setState(247);
				match(NAME);
				setState(248);
				match(T__29);
				setState(249);
				match(NAME);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(250);
					match(T__29);
					setState(251);
					match(NAME);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
				match(T__41);
				setState(258);
				functionCall();
				setState(259);
				match(NL);
				}
				break;
			case 7:
				_localctx = new StatementAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				match(NAME);
				setState(262);
				match(T__41);
				setState(263);
				expr(0);
				setState(264);
				match(NL);
				}
				break;
			case 8:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(266);
				match(T__43);
				setState(267);
				match(NL);
				}
				break;
			case 9:
				_localctx = new StatementContinueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(268);
				match(T__44);
				setState(269);
				match(NL);
				}
				break;
			case 10:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(270);
				match(T__24);
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(271);
					match(T__22);
					}
					break;
				}
				setState(274);
				((StatementIfContext)_localctx).expr = expr(0);
				((StatementIfContext)_localctx).conditions.add(((StatementIfContext)_localctx).expr);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(275);
					match(T__23);
					}
				}

				setState(278);
				match(T__45);
				setState(279);
				((StatementIfContext)_localctx).block = block();
				((StatementIfContext)_localctx).bodies.add(((StatementIfContext)_localctx).block);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__46) {
					{
					{
					setState(280);
					match(T__46);
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(281);
						match(T__22);
						}
						break;
					}
					setState(284);
					((StatementIfContext)_localctx).expr = expr(0);
					((StatementIfContext)_localctx).conditions.add(((StatementIfContext)_localctx).expr);
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__23) {
						{
						setState(285);
						match(T__23);
						}
					}

					setState(288);
					match(T__45);
					setState(289);
					((StatementIfContext)_localctx).block = block();
					((StatementIfContext)_localctx).bodies.add(((StatementIfContext)_localctx).block);
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(296);
					match(T__25);
					setState(297);
					((StatementIfContext)_localctx).elseBody = block();
					}
				}

				}
				break;
			case 11:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(300);
				match(T__47);
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(301);
					match(T__22);
					}
					break;
				}
				setState(304);
				((StatementWhileContext)_localctx).condition = expr(0);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(305);
					match(T__23);
					}
				}

				setState(308);
				match(T__45);
				setState(309);
				((StatementWhileContext)_localctx).body = block();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(310);
					match(T__25);
					setState(311);
					((StatementWhileContext)_localctx).elseBody = block();
					}
				}

				}
				break;
			case 12:
				_localctx = new StatementForInContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(314);
				match(T__48);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(315);
					match(T__22);
					}
				}

				setState(318);
				match(NAME);
				setState(319);
				match(T__49);
				setState(320);
				expr(0);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(321);
					match(T__50);
					setState(322);
					expr(0);
					}
				}

				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) {
					{
					setState(325);
					orderExpression();
					}
				}

				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(328);
					match(T__23);
					}
				}

				setState(331);
				match(T__45);
				setState(332);
				((StatementForInContext)_localctx).body = block();
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(333);
					match(T__25);
					setState(334);
					((StatementForInContext)_localctx).elseBody = block();
					}
				}

				}
				break;
			case 13:
				_localctx = new StatementCallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(337);
				functionCall();
				setState(338);
				match(NL);
				}
				break;
			case 14:
				_localctx = new StatementCallFunctionReturnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(340);
				match(T__51);
				setState(341);
				functionCall();
				setState(342);
				match(NL);
				}
				break;
			case 15:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(344);
				match(T__51);
				setState(345);
				expr(0);
				setState(346);
				match(NL);
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

	public static class UseContext extends ParserRuleContext {
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
	 
		public UseContext() { }
		public void copyFrom(UseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UseModuleContext extends UseContext {
		public Token from;
		public Token as;
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public TerminalNode STRING() { return getToken(GoodscriptParser.STRING, 0); }
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public UseModuleContext(UseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterUseModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitUseModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitUseModule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseFromModuleContext extends UseContext {
		public Token NAME;
		public List<Token> exports = new ArrayList<Token>();
		public Token from;
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public List<TerminalNode> NAME() { return getTokens(GoodscriptParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GoodscriptParser.NAME, i);
		}
		public TerminalNode STRING() { return getToken(GoodscriptParser.STRING, 0); }
		public UseFromModuleContext(UseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterUseFromModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitUseFromModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitUseFromModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_use);
		int _la;
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new UseModuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(T__52);
				setState(351);
				((UseModuleContext)_localctx).from = match(STRING);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(352);
					match(T__28);
					setState(353);
					((UseModuleContext)_localctx).as = match(NAME);
					}
				}

				setState(356);
				match(NL);
				}
				break;
			case 2:
				_localctx = new UseFromModuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(T__52);
				setState(358);
				((UseFromModuleContext)_localctx).NAME = match(NAME);
				((UseFromModuleContext)_localctx).exports.add(((UseFromModuleContext)_localctx).NAME);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__29) {
					{
					{
					setState(359);
					match(T__29);
					setState(360);
					((UseFromModuleContext)_localctx).NAME = match(NAME);
					((UseFromModuleContext)_localctx).exports.add(((UseFromModuleContext)_localctx).NAME);
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
				match(T__53);
				setState(367);
				((UseFromModuleContext)_localctx).from = match(STRING);
				setState(368);
				match(NL);
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

	public static class FuncPrefixContext extends ParserRuleContext {
		public FuncPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterFuncPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitFuncPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitFuncPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncPrefixContext funcPrefix() throws RecognitionException {
		FuncPrefixContext _localctx = new FuncPrefixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__54);
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

	public static class FuncContext extends ParserRuleContext {
		public Token name;
		public ArgumentContext argument;
		public List<ArgumentContext> args = new ArrayList<ArgumentContext>();
		public TypeContext returnType;
		public BlockContext body;
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncPrefixContext funcPrefix() {
			return getRuleContext(FuncPrefixContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(373);
				funcPrefix();
				}
			}

			setState(376);
			match(T__55);
			setState(377);
			((FuncContext)_localctx).name = match(NAME);
			setState(378);
			match(T__22);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (T__36 - 37)) | (1L << (BOOL - 37)) | (1L << (NAME - 37)) | (1L << (ATOM - 37)) | (1L << (INT - 37)) | (1L << (FLOAT - 37)) | (1L << (HEX - 37)) | (1L << (BIN - 37)) | (1L << (CHAR - 37)) | (1L << (STRING - 37)))) != 0)) {
				{
				setState(379);
				((FuncContext)_localctx).argument = argument();
				((FuncContext)_localctx).args.add(((FuncContext)_localctx).argument);
				}
			}

			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(382);
				match(T__29);
				setState(383);
				((FuncContext)_localctx).argument = argument();
				((FuncContext)_localctx).args.add(((FuncContext)_localctx).argument);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(T__23);
			setState(390);
			match(T__35);
			setState(391);
			((FuncContext)_localctx).returnType = type(0);
			setState(392);
			match(T__45);
			setState(393);
			((FuncContext)_localctx).body = block();
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

	public static class ProgramContext extends ParserRuleContext {
		public FuncContext func;
		public List<FuncContext> functions = new ArrayList<FuncContext>();
		public TerminalNode EOF() { return getToken(GoodscriptParser.EOF, 0); }
		public List<UseContext> use() {
			return getRuleContexts(UseContext.class);
		}
		public UseContext use(int i) {
			return getRuleContext(UseContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(395);
				use();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__54 || _la==T__55) {
				{
				{
				setState(401);
				((ProgramContext)_localctx).func = func();
				((ProgramContext)_localctx).functions.add(((ProgramContext)_localctx).func);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			match(EOF);
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001H\u019a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000#\b\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0004\u0002.\b\u0002\u000b\u0002\f\u0002/\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005N\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005R\b\u0005\n\u0005\f\u0005U\t\u0005\u0001\u0005\u0003"+
		"\u0005X\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005l\b\u0005\n\u0005\f\u0005o\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005y\b\u0005\n\u0005\f\u0005|\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0084\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u008b\b\u0006\n\u0006\f\u0006\u008e\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0095\b\u0006"+
		"\n\u0006\f\u0006\u0098\t\u0006\u0005\u0006\u009a\b\u0006\n\u0006\f\u0006"+
		"\u009d\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00a4\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00aa"+
		"\b\b\u0001\t\u0001\t\u0003\t\u00ae\b\t\u0001\t\u0001\t\u0001\t\u0005\t"+
		"\u00b3\b\t\n\t\f\t\u00b6\t\t\u0001\t\u0003\t\u00b9\b\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u00be\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c4"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00ce\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00da\b\n\n\n\f\n\u00dd\t\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e7\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f1"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00fd\b\n\n\n\f\n\u0100\t\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0111\b\n\u0001\n\u0001\n\u0003\n\u0115"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u011b\b\n\u0001\n\u0001\n"+
		"\u0003\n\u011f\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u0124\b\n\n\n\f\n\u0127"+
		"\t\n\u0001\n\u0001\n\u0003\n\u012b\b\n\u0001\n\u0001\n\u0003\n\u012f\b"+
		"\n\u0001\n\u0001\n\u0003\n\u0133\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0139\b\n\u0001\n\u0001\n\u0003\n\u013d\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u0144\b\n\u0001\n\u0003\n\u0147\b\n\u0001\n\u0003"+
		"\n\u014a\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0150\b\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u015d\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0163\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u016a\b\u000b\n\u000b\f\u000b\u016d\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0172\b\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0003\r\u0177\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u017d\b\r\u0001\r\u0001\r\u0005\r\u0181\b\r\n\r\f\r\u0184\t\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0005\u000e\u018d"+
		"\b\u000e\n\u000e\f\u000e\u0190\t\u000e\u0001\u000e\u0005\u000e\u0193\b"+
		"\u000e\n\u000e\f\u000e\u0196\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0000\u0002\n\f\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u0000\u0002\u0001\u0000\u0001\u0005\u0001"+
		"\u0000\u0005\u0015\u01d9\u0000\"\u0001\u0000\u0000\u0000\u0002)\u0001"+
		"\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000"+
		"\u0000\b5\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000\f\u0083\u0001"+
		"\u0000\u0000\u0000\u000e\u00a3\u0001\u0000\u0000\u0000\u0010\u00a9\u0001"+
		"\u0000\u0000\u0000\u0012\u00bd\u0001\u0000\u0000\u0000\u0014\u015c\u0001"+
		"\u0000\u0000\u0000\u0016\u0171\u0001\u0000\u0000\u0000\u0018\u0173\u0001"+
		"\u0000\u0000\u0000\u001a\u0176\u0001\u0000\u0000\u0000\u001c\u018e\u0001"+
		"\u0000\u0000\u0000\u001e#\u0005=\u0000\u0000\u001f#\u0005>\u0000\u0000"+
		" #\u0005?\u0000\u0000!#\u0005@\u0000\u0000\"\u001e\u0001\u0000\u0000\u0000"+
		"\"\u001f\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000"+
		"\u0000\u0000#\u0001\u0001\u0000\u0000\u0000$*\u0003\u0000\u0000\u0000"+
		"%*\u0005:\u0000\u0000&*\u0005B\u0000\u0000\'*\u0005A\u0000\u0000(*\u0005"+
		"<\u0000\u0000)$\u0001\u0000\u0000\u0000)%\u0001\u0000\u0000\u0000)&\u0001"+
		"\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000"+
		"*\u0003\u0001\u0000\u0000\u0000+-\u0005G\u0000\u0000,.\u0003\u0014\n\u0000"+
		"-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005H\u0000"+
		"\u00002\u0005\u0001\u0000\u0000\u000034\u0007\u0000\u0000\u00004\u0007"+
		"\u0001\u0000\u0000\u000056\u0007\u0001\u0000\u00006\t\u0001\u0000\u0000"+
		"\u000078\u0006\u0005\uffff\uffff\u00008X\u0005\u0016\u0000\u00009:\u0003"+
		"\u0006\u0003\u0000:;\u0003\n\u0005\f;X\u0001\u0000\u0000\u0000<=\u0005"+
		"\u0017\u0000\u0000=>\u0003\n\u0005\u0000>?\u0005\u0018\u0000\u0000?X\u0001"+
		"\u0000\u0000\u0000@X\u0003\u0002\u0001\u0000AX\u0005;\u0000\u0000BC\u0005"+
		"\u0019\u0000\u0000CD\u0005\u0017\u0000\u0000DE\u0003\n\u0005\u0000EF\u0005"+
		"\u0018\u0000\u0000FG\u0003\n\u0005\u0000GH\u0005\u001a\u0000\u0000HI\u0003"+
		"\n\u0005\bIX\u0001\u0000\u0000\u0000JK\u0005;\u0000\u0000KM\u0005\u0017"+
		"\u0000\u0000LN\u0003\n\u0005\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NS\u0001\u0000\u0000\u0000OP\u0005\u001e\u0000\u0000PR\u0003"+
		"\n\u0005\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VX\u0005\u0018\u0000\u0000W7\u0001\u0000\u0000"+
		"\u0000W9\u0001\u0000\u0000\u0000W<\u0001\u0000\u0000\u0000W@\u0001\u0000"+
		"\u0000\u0000WA\u0001\u0000\u0000\u0000WB\u0001\u0000\u0000\u0000WJ\u0001"+
		"\u0000\u0000\u0000Xz\u0001\u0000\u0000\u0000YZ\n\r\u0000\u0000Z[\u0003"+
		"\b\u0004\u0000[\\\u0003\n\u0005\u000e\\y\u0001\u0000\u0000\u0000]^\n\u0007"+
		"\u0000\u0000^_\u0005\u001b\u0000\u0000_y\u0005;\u0000\u0000`a\n\u0006"+
		"\u0000\u0000ab\u0005\u001c\u0000\u0000by\u0005;\u0000\u0000cd\n\u0005"+
		"\u0000\u0000de\u0005\u001d\u0000\u0000ey\u0005;\u0000\u0000fg\n\u0003"+
		"\u0000\u0000gh\u0005\u001f\u0000\u0000hm\u0003\n\u0005\u0000ij\u0005\u001f"+
		"\u0000\u0000jl\u0003\n\u0005\u0000ki\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000ny\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\n\u0002\u0000\u0000qr\u0005"+
		" \u0000\u0000ry\u0005;\u0000\u0000st\n\u0001\u0000\u0000tu\u0005!\u0000"+
		"\u0000uv\u0003\n\u0005\u0000vw\u0005\"\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xY\u0001\u0000\u0000\u0000x]\u0001\u0000\u0000\u0000x`\u0001\u0000"+
		"\u0000\u0000xc\u0001\u0000\u0000\u0000xf\u0001\u0000\u0000\u0000xp\u0001"+
		"\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u000b\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0006\u0006\uffff\uffff\u0000"+
		"~\u0084\u0005;\u0000\u0000\u007f\u0080\u0005\u0017\u0000\u0000\u0080\u0081"+
		"\u0003\f\u0006\u0000\u0081\u0082\u0005\u0018\u0000\u0000\u0082\u0084\u0001"+
		"\u0000\u0000\u0000\u0083}\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000"+
		"\u0000\u0000\u0084\u009b\u0001\u0000\u0000\u0000\u0085\u0086\n\u0003\u0000"+
		"\u0000\u0086\u0087\u0005#\u0000\u0000\u0087\u008c\u0003\f\u0006\u0000"+
		"\u0088\u0089\u0005#\u0000\u0000\u0089\u008b\u0003\f\u0006\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u009a\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\n\u0002\u0000\u0000\u0090\u0091\u0005\u001f\u0000\u0000\u0091\u0096"+
		"\u0003\f\u0006\u0000\u0092\u0093\u0005\u001f\u0000\u0000\u0093\u0095\u0003"+
		"\f\u0006\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000"+
		"\u0000\u0000\u0099\u0085\u0001\u0000\u0000\u0000\u0099\u008f\u0001\u0000"+
		"\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\r\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f\u0005;\u0000\u0000"+
		"\u009f\u00a0\u0005$\u0000\u0000\u00a0\u00a4\u0003\f\u0006\u0000\u00a1"+
		"\u00a4\u0003\u0002\u0001\u0000\u00a2\u00a4\u0005%\u0000\u0000\u00a3\u009e"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u000f\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0005&\u0000\u0000\u00a6\u00aa\u0003\n\u0005\u0000\u00a7\u00aa\u0005"+
		"\'\u0000\u0000\u00a8\u00aa\u0005(\u0000\u0000\u00a9\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u0011\u0001\u0000\u0000\u0000\u00ab\u00ad\u0005;\u0000"+
		"\u0000\u00ac\u00ae\u0005\u0017\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b4\u0003\n\u0005\u0000\u00b0\u00b1\u0005\u001e\u0000\u0000"+
		"\u00b1\u00b3\u0003\n\u0005\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\u0018\u0000\u0000\u00b8"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00be\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005;\u0000\u0000\u00bb\u00bc"+
		"\u0005\u0017\u0000\u0000\u00bc\u00be\u0005\u0018\u0000\u0000\u00bd\u00ab"+
		"\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00be\u0013"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005)\u0000\u0000\u00c0\u00c3\u0005"+
		";\u0000\u0000\u00c1\u00c2\u0005$\u0000\u0000\u00c2\u00c4\u0003\f\u0006"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005*\u0000\u0000"+
		"\u00c6\u00c7\u0003\n\u0005\u0000\u00c7\u00c8\u00059\u0000\u0000\u00c8"+
		"\u015d\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005)\u0000\u0000\u00ca\u00cd"+
		"\u0005;\u0000\u0000\u00cb\u00cc\u0005$\u0000\u0000\u00cc\u00ce\u0003\f"+
		"\u0006\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005*\u0000"+
		"\u0000\u00d0\u00d1\u0003\u0012\t\u0000\u00d1\u00d2\u00059\u0000\u0000"+
		"\u00d2\u015d\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005)\u0000\u0000\u00d4"+
		"\u00d5\u0005;\u0000\u0000\u00d5\u00d6\u0005\u001e\u0000\u0000\u00d6\u00db"+
		"\u0005;\u0000\u0000\u00d7\u00d8\u0005\u001e\u0000\u0000\u00d8\u00da\u0005"+
		";\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005*\u0000\u0000\u00df\u00e0\u0003\u0012\t"+
		"\u0000\u00e0\u00e1\u00059\u0000\u0000\u00e1\u015d\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005+\u0000\u0000\u00e3\u00e6\u0005;\u0000\u0000\u00e4\u00e5"+
		"\u0005$\u0000\u0000\u00e5\u00e7\u0003\f\u0006\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005*\u0000\u0000\u00e9\u00ea\u0003\n"+
		"\u0005\u0000\u00ea\u00eb\u00059\u0000\u0000\u00eb\u015d\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0005+\u0000\u0000\u00ed\u00f0\u0005;\u0000\u0000\u00ee"+
		"\u00ef\u0005$\u0000\u0000\u00ef\u00f1\u0003\f\u0006\u0000\u00f0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005*\u0000\u0000\u00f3\u00f4\u0003"+
		"\u0012\t\u0000\u00f4\u00f5\u00059\u0000\u0000\u00f5\u015d\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005+\u0000\u0000\u00f7\u00f8\u0005;\u0000\u0000"+
		"\u00f8\u00f9\u0005\u001e\u0000\u0000\u00f9\u00fe\u0005;\u0000\u0000\u00fa"+
		"\u00fb\u0005\u001e\u0000\u0000\u00fb\u00fd\u0005;\u0000\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101"+
		"\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0005*\u0000\u0000\u0102\u0103\u0003\u0012\t\u0000\u0103\u0104\u0005"+
		"9\u0000\u0000\u0104\u015d\u0001\u0000\u0000\u0000\u0105\u0106\u0005;\u0000"+
		"\u0000\u0106\u0107\u0005*\u0000\u0000\u0107\u0108\u0003\n\u0005\u0000"+
		"\u0108\u0109\u00059\u0000\u0000\u0109\u015d\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0005,\u0000\u0000\u010b\u015d\u00059\u0000\u0000\u010c\u010d\u0005"+
		"-\u0000\u0000\u010d\u015d\u00059\u0000\u0000\u010e\u0110\u0005\u0019\u0000"+
		"\u0000\u010f\u0111\u0005\u0017\u0000\u0000\u0110\u010f\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000"+
		"\u0000\u0112\u0114\u0003\n\u0005\u0000\u0113\u0115\u0005\u0018\u0000\u0000"+
		"\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0005.\u0000\u0000\u0117"+
		"\u0125\u0003\u0004\u0002\u0000\u0118\u011a\u0005/\u0000\u0000\u0119\u011b"+
		"\u0005\u0017\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e"+
		"\u0003\n\u0005\u0000\u011d\u011f\u0005\u0018\u0000\u0000\u011e\u011d\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0005.\u0000\u0000\u0121\u0122\u0003\u0004"+
		"\u0002\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0118\u0001\u0000"+
		"\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u012a\u0001\u0000"+
		"\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u001a"+
		"\u0000\u0000\u0129\u012b\u0003\u0004\u0002\u0000\u012a\u0128\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u015d\u0001\u0000"+
		"\u0000\u0000\u012c\u012e\u00050\u0000\u0000\u012d\u012f\u0005\u0017\u0000"+
		"\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0003\n\u0005\u0000"+
		"\u0131\u0133\u0005\u0018\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0005.\u0000\u0000\u0135\u0138\u0003\u0004\u0002\u0000\u0136"+
		"\u0137\u0005\u001a\u0000\u0000\u0137\u0139\u0003\u0004\u0002\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139"+
		"\u015d\u0001\u0000\u0000\u0000\u013a\u013c\u00051\u0000\u0000\u013b\u013d"+
		"\u0005\u0017\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0005;\u0000\u0000\u013f\u0140\u00052\u0000\u0000\u0140\u0143\u0003\n"+
		"\u0005\u0000\u0141\u0142\u00053\u0000\u0000\u0142\u0144\u0003\n\u0005"+
		"\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000"+
		"\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0147\u0003\u0010\b\u0000"+
		"\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u014a\u0005\u0018\u0000\u0000"+
		"\u0149\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0005.\u0000\u0000\u014c"+
		"\u014f\u0003\u0004\u0002\u0000\u014d\u014e\u0005\u001a\u0000\u0000\u014e"+
		"\u0150\u0003\u0004\u0002\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0001\u0000\u0000\u0000\u0150\u015d\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0003\u0012\t\u0000\u0152\u0153\u00059\u0000\u0000\u0153\u015d"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u00054\u0000\u0000\u0155\u0156\u0003"+
		"\u0012\t\u0000\u0156\u0157\u00059\u0000\u0000\u0157\u015d\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u00054\u0000\u0000\u0159\u015a\u0003\n\u0005"+
		"\u0000\u015a\u015b\u00059\u0000\u0000\u015b\u015d\u0001\u0000\u0000\u0000"+
		"\u015c\u00bf\u0001\u0000\u0000\u0000\u015c\u00c9\u0001\u0000\u0000\u0000"+
		"\u015c\u00d3\u0001\u0000\u0000\u0000\u015c\u00e2\u0001\u0000\u0000\u0000"+
		"\u015c\u00ec\u0001\u0000\u0000\u0000\u015c\u00f6\u0001\u0000\u0000\u0000"+
		"\u015c\u0105\u0001\u0000\u0000\u0000\u015c\u010a\u0001\u0000\u0000\u0000"+
		"\u015c\u010c\u0001\u0000\u0000\u0000\u015c\u010e\u0001\u0000\u0000\u0000"+
		"\u015c\u012c\u0001\u0000\u0000\u0000\u015c\u013a\u0001\u0000\u0000\u0000"+
		"\u015c\u0151\u0001\u0000\u0000\u0000\u015c\u0154\u0001\u0000\u0000\u0000"+
		"\u015c\u0158\u0001\u0000\u0000\u0000\u015d\u0015\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u00055\u0000\u0000\u015f\u0162\u0005B\u0000\u0000\u0160\u0161"+
		"\u0005\u001d\u0000\u0000\u0161\u0163\u0005;\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u0172\u00059\u0000\u0000\u0165\u0166\u00055\u0000"+
		"\u0000\u0166\u016b\u0005;\u0000\u0000\u0167\u0168\u0005\u001e\u0000\u0000"+
		"\u0168\u016a\u0005;\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a"+
		"\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d"+
		"\u016b\u0001\u0000\u0000\u0000\u016e\u016f\u00056\u0000\u0000\u016f\u0170"+
		"\u0005B\u0000\u0000\u0170\u0172\u00059\u0000\u0000\u0171\u015e\u0001\u0000"+
		"\u0000\u0000\u0171\u0165\u0001\u0000\u0000\u0000\u0172\u0017\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u00057\u0000\u0000\u0174\u0019\u0001\u0000\u0000"+
		"\u0000\u0175\u0177\u0003\u0018\f\u0000\u0176\u0175\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u00058\u0000\u0000\u0179\u017a\u0005;\u0000\u0000\u017a\u017c"+
		"\u0005\u0017\u0000\u0000\u017b\u017d\u0003\u000e\u0007\u0000\u017c\u017b"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u0182"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u001e\u0000\u0000\u017f\u0181"+
		"\u0003\u000e\u0007\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0184"+
		"\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0001\u0000\u0000\u0000\u0183\u0185\u0001\u0000\u0000\u0000\u0184\u0182"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u0018\u0000\u0000\u0186\u0187"+
		"\u0005$\u0000\u0000\u0187\u0188\u0003\f\u0006\u0000\u0188\u0189\u0005"+
		".\u0000\u0000\u0189\u018a\u0003\u0004\u0002\u0000\u018a\u001b\u0001\u0000"+
		"\u0000\u0000\u018b\u018d\u0003\u0016\u000b\u0000\u018c\u018b\u0001\u0000"+
		"\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000"+
		"\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0194\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0193\u0003\u001a"+
		"\r\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000"+
		"\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000"+
		"\u0000\u0195\u0197\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000"+
		"\u0000\u0197\u0198\u0005\u0000\u0000\u0001\u0198\u001d\u0001\u0000\u0000"+
		"\u00001\")/MSWmxz\u0083\u008c\u0096\u0099\u009b\u00a3\u00a9\u00ad\u00b4"+
		"\u00b8\u00bd\u00c3\u00cd\u00db\u00e6\u00f0\u00fe\u0110\u0114\u011a\u011e"+
		"\u0125\u012a\u012e\u0132\u0138\u013c\u0143\u0146\u0149\u014f\u015c\u0162"+
		"\u016b\u0171\u0176\u017c\u0182\u018e\u0194";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}