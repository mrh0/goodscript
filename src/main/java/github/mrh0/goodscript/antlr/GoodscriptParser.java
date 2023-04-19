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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, NL=44, BOOL=45, NAME=46, 
		ATOM=47, INT=48, FLOAT=49, HEX=50, BIN=51, CHAR=52, STRING=53, WHITESPACE=54, 
		COMMENT=55, BLOCKCOMMENT=56, INDENT=57, DEDENT=58;
	public static final int
		RULE_number = 0, RULE_primitive = 1, RULE_block = 2, RULE_unOp = 3, RULE_binOp = 4, 
		RULE_expr = 5, RULE_statement = 6, RULE_use = 7, RULE_funcPrefix = 8, 
		RULE_func = 9, RULE_program = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"number", "primitive", "block", "unOp", "binOp", "expr", "statement", 
			"use", "funcPrefix", "func", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'not'", "'!'", "'!!'", "'~'", "'-'", "'+'", "'*'", "'/'", "'%'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&'", "'|'", "'&&'", "'and'", 
			"'||'", "'or'", "'<<'", "'>>'", "'('", "')'", "'if'", "'else'", "'is'", 
			"'as'", "'var'", "'='", "'val'", "'ret'", "'break'", "'continue'", "':'", 
			"'eif'", "'while'", "','", "'use'", "'from'", "'start'", "'fn'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NL", "BOOL", "NAME", 
			"ATOM", "INT", "FLOAT", "HEX", "BIN", "CHAR", "STRING", "WHITESPACE", 
			"COMMENT", "BLOCKCOMMENT", "INDENT", "DEDENT"
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
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new NumberIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new NumberFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(FLOAT);
				}
				break;
			case HEX:
				_localctx = new NumberHexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				match(HEX);
				}
				break;
			case BIN:
				_localctx = new NumberBinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
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
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case HEX:
			case BIN:
				_localctx = new PrimitiveNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				number();
				}
				break;
			case BOOL:
				_localctx = new PrimitiveBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(BOOL);
				}
				break;
			case STRING:
				_localctx = new PrimitiveStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				match(STRING);
				}
				break;
			case CHAR:
				_localctx = new PrimitiveCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				match(CHAR);
				}
				break;
			case ATOM:
				_localctx = new PrimitiveAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
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
			setState(35);
			match(INDENT);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				((BlockContext)_localctx).statement = statement();
				((BlockContext)_localctx).statements.add(((BlockContext)_localctx).statement);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << NAME))) != 0) );
			setState(41);
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
			setState(43);
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
			setState(45);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
				{
				_localctx = new ExprUnOpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(48);
				unOp();
				setState(49);
				expr(7);
				}
				break;
			case T__23:
				{
				_localctx = new ExprNestContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(T__23);
				setState(52);
				expr(0);
				setState(53);
				match(T__24);
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
				{
				_localctx = new ExprPrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				primitive();
				}
				break;
			case NAME:
				{
				_localctx = new ExprNamedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(NAME);
				}
				break;
			case T__25:
				{
				_localctx = new ExprInlineIfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(T__25);
				setState(58);
				match(T__23);
				setState(59);
				((ExprInlineIfContext)_localctx).condition = expr(0);
				setState(60);
				match(T__24);
				setState(61);
				((ExprInlineIfContext)_localctx).body = expr(0);
				setState(62);
				match(T__26);
				setState(63);
				((ExprInlineIfContext)_localctx).elseBody = expr(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprBinOpContext(new ExprContext(_parentctx, _parentState));
						((ExprBinOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(68);
						binOp();
						setState(69);
						((ExprBinOpContext)_localctx).right = expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprIsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(71);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(72);
						match(T__27);
						setState(73);
						match(NAME);
						}
						break;
					case 3:
						{
						_localctx = new ExprAsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(75);
						match(T__28);
						setState(76);
						match(NAME);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class StatementDefineConstContext extends StatementContext {
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
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
	public static class StatementCallFunctionReturnContext extends StatementContext {
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new StatementDefineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(T__29);
				setState(83);
				match(NAME);
				setState(84);
				match(T__30);
				setState(85);
				expr(0);
				setState(86);
				match(NL);
				}
				break;
			case 2:
				_localctx = new StatementDefineConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__31);
				setState(89);
				match(NAME);
				setState(90);
				match(T__30);
				setState(91);
				expr(0);
				setState(92);
				match(NL);
				}
				break;
			case 3:
				_localctx = new StatementAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(NAME);
				setState(95);
				match(T__30);
				setState(96);
				expr(0);
				setState(97);
				match(NL);
				}
				break;
			case 4:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(T__32);
				setState(100);
				expr(0);
				setState(101);
				match(NL);
				}
				break;
			case 5:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(T__33);
				setState(104);
				match(NL);
				}
				break;
			case 6:
				_localctx = new StatementContinueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				match(T__34);
				setState(106);
				match(NL);
				}
				break;
			case 7:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				match(T__25);
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(108);
					match(T__23);
					}
					break;
				}
				setState(111);
				((StatementIfContext)_localctx).expr = expr(0);
				((StatementIfContext)_localctx).conditions.add(((StatementIfContext)_localctx).expr);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(112);
					match(T__24);
					}
				}

				setState(115);
				match(T__35);
				setState(116);
				((StatementIfContext)_localctx).block = block();
				((StatementIfContext)_localctx).bodies.add(((StatementIfContext)_localctx).block);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__36) {
					{
					{
					setState(117);
					match(T__36);
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(118);
						match(T__23);
						}
						break;
					}
					setState(121);
					((StatementIfContext)_localctx).expr = expr(0);
					((StatementIfContext)_localctx).conditions.add(((StatementIfContext)_localctx).expr);
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__24) {
						{
						setState(122);
						match(T__24);
						}
					}

					setState(125);
					match(T__35);
					setState(126);
					((StatementIfContext)_localctx).block = block();
					((StatementIfContext)_localctx).bodies.add(((StatementIfContext)_localctx).block);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(133);
					match(T__26);
					setState(134);
					match(T__35);
					setState(135);
					((StatementIfContext)_localctx).elseBody = block();
					}
				}

				}
				break;
			case 8:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(138);
				match(T__37);
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(139);
					match(T__23);
					}
					break;
				}
				setState(142);
				((StatementWhileContext)_localctx).condition = expr(0);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(143);
					match(T__24);
					}
				}

				setState(146);
				match(T__35);
				setState(147);
				((StatementWhileContext)_localctx).body = block();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(148);
					match(T__26);
					setState(149);
					match(T__35);
					setState(150);
					((StatementWhileContext)_localctx).elseBody = block();
					}
				}

				}
				break;
			case 9:
				_localctx = new StatementCallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(153);
				match(NAME);
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(154);
					match(T__23);
					}
					break;
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__23) | (1L << T__25) | (1L << BOOL) | (1L << NAME) | (1L << ATOM) | (1L << INT) | (1L << FLOAT) | (1L << HEX) | (1L << BIN) | (1L << CHAR) | (1L << STRING))) != 0)) {
					{
					setState(157);
					((StatementCallFunctionContext)_localctx).expr = expr(0);
					((StatementCallFunctionContext)_localctx).args.add(((StatementCallFunctionContext)_localctx).expr);
					}
				}

				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(160);
					match(T__38);
					setState(161);
					((StatementCallFunctionContext)_localctx).expr = expr(0);
					((StatementCallFunctionContext)_localctx).args.add(((StatementCallFunctionContext)_localctx).expr);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(167);
					match(T__24);
					}
				}

				setState(170);
				match(NL);
				}
				break;
			case 10:
				_localctx = new StatementCallFunctionReturnContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(171);
				match(T__32);
				setState(172);
				match(NAME);
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(173);
					match(T__23);
					}
					break;
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__23) | (1L << T__25) | (1L << BOOL) | (1L << NAME) | (1L << ATOM) | (1L << INT) | (1L << FLOAT) | (1L << HEX) | (1L << BIN) | (1L << CHAR) | (1L << STRING))) != 0)) {
					{
					setState(176);
					((StatementCallFunctionReturnContext)_localctx).expr = expr(0);
					((StatementCallFunctionReturnContext)_localctx).args.add(((StatementCallFunctionReturnContext)_localctx).expr);
					}
				}

				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__38) {
					{
					{
					setState(179);
					match(T__38);
					setState(180);
					((StatementCallFunctionReturnContext)_localctx).expr = expr(0);
					((StatementCallFunctionReturnContext)_localctx).args.add(((StatementCallFunctionReturnContext)_localctx).expr);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24) {
					{
					setState(186);
					match(T__24);
					}
				}

				setState(189);
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
		public List<TerminalNode> NAME() { return getTokens(GoodscriptParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GoodscriptParser.NAME, i);
		}
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public TerminalNode STRING() { return getToken(GoodscriptParser.STRING, 0); }
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__39);
			setState(193);
			match(NAME);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(194);
				match(T__40);
				setState(195);
				match(STRING);
				}
			}

			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(198);
				match(T__28);
				setState(199);
				match(NAME);
				}
			}

			setState(202);
			match(NL);
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
		enterRule(_localctx, 16, RULE_funcPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__41);
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
		public Token NAME;
		public List<Token> args = new ArrayList<Token>();
		public BlockContext body;
		public List<TerminalNode> NAME() { return getTokens(GoodscriptParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GoodscriptParser.NAME, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncPrefixContext funcPrefix() {
			return getRuleContext(FuncPrefixContext.class,0);
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
		enterRule(_localctx, 18, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(206);
				funcPrefix();
				}
			}

			setState(209);
			match(T__42);
			setState(210);
			((FuncContext)_localctx).name = match(NAME);
			setState(211);
			match(T__23);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(212);
				((FuncContext)_localctx).NAME = match(NAME);
				((FuncContext)_localctx).args.add(((FuncContext)_localctx).NAME);
				}
			}

			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__38) {
				{
				{
				setState(215);
				match(T__38);
				setState(216);
				((FuncContext)_localctx).NAME = match(NAME);
				((FuncContext)_localctx).args.add(((FuncContext)_localctx).NAME);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			match(T__24);
			setState(223);
			match(T__35);
			setState(224);
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
		enterRule(_localctx, 20, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(226);
				use();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__41 || _la==T__42) {
				{
				{
				setState(232);
				((ProgramContext)_localctx).func = func();
				((ProgramContext)_localctx).functions.add(((ProgramContext)_localctx).func);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u00ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\"\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0004\u0002&\b\u0002\u000b\u0002\f\u0002\'\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005B\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005N\b\u0005"+
		"\n\u0005\f\u0005Q\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"n\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006r\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006x\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006|\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u0081\b\u0006\n\u0006\f\u0006\u0084\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0089\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u008d\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0091\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0098"+
		"\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009c\b\u0006\u0001\u0006"+
		"\u0003\u0006\u009f\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00a3\b"+
		"\u0006\n\u0006\f\u0006\u00a6\t\u0006\u0001\u0006\u0003\u0006\u00a9\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00af\b\u0006"+
		"\u0001\u0006\u0003\u0006\u00b2\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00b6\b\u0006\n\u0006\f\u0006\u00b9\t\u0006\u0001\u0006\u0003\u0006\u00bc"+
		"\b\u0006\u0001\u0006\u0003\u0006\u00bf\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00c5\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00c9\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0003\t\u00d0\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d6\b\t"+
		"\u0001\t\u0001\t\u0005\t\u00da\b\t\n\t\f\t\u00dd\t\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0005\n\u00e4\b\n\n\n\f\n\u00e7\t\n\u0001\n\u0005\n"+
		"\u00ea\b\n\n\n\f\n\u00ed\t\n\u0001\n\u0000\u0001\n\u000b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0002\u0001\u0000\u0001\u0005"+
		"\u0001\u0000\u0005\u0017\u0113\u0000\u001a\u0001\u0000\u0000\u0000\u0002"+
		"!\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u0006+\u0001"+
		"\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000\u0000"+
		"\f\u00be\u0001\u0000\u0000\u0000\u000e\u00c0\u0001\u0000\u0000\u0000\u0010"+
		"\u00cc\u0001\u0000\u0000\u0000\u0012\u00cf\u0001\u0000\u0000\u0000\u0014"+
		"\u00e5\u0001\u0000\u0000\u0000\u0016\u001b\u00050\u0000\u0000\u0017\u001b"+
		"\u00051\u0000\u0000\u0018\u001b\u00052\u0000\u0000\u0019\u001b\u00053"+
		"\u0000\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001a\u0017\u0001\u0000"+
		"\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000"+
		"\u0000\u0000\u001b\u0001\u0001\u0000\u0000\u0000\u001c\"\u0003\u0000\u0000"+
		"\u0000\u001d\"\u0005-\u0000\u0000\u001e\"\u00055\u0000\u0000\u001f\"\u0005"+
		"4\u0000\u0000 \"\u0005/\u0000\u0000!\u001c\u0001\u0000\u0000\u0000!\u001d"+
		"\u0001\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000! \u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000"+
		"#%\u00059\u0000\u0000$&\u0003\f\u0006\u0000%$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0005:\u0000\u0000*\u0005\u0001"+
		"\u0000\u0000\u0000+,\u0007\u0000\u0000\u0000,\u0007\u0001\u0000\u0000"+
		"\u0000-.\u0007\u0001\u0000\u0000.\t\u0001\u0000\u0000\u0000/0\u0006\u0005"+
		"\uffff\uffff\u000001\u0003\u0006\u0003\u000012\u0003\n\u0005\u00072B\u0001"+
		"\u0000\u0000\u000034\u0005\u0018\u0000\u000045\u0003\n\u0005\u000056\u0005"+
		"\u0019\u0000\u00006B\u0001\u0000\u0000\u00007B\u0003\u0002\u0001\u0000"+
		"8B\u0005.\u0000\u00009:\u0005\u001a\u0000\u0000:;\u0005\u0018\u0000\u0000"+
		";<\u0003\n\u0005\u0000<=\u0005\u0019\u0000\u0000=>\u0003\n\u0005\u0000"+
		">?\u0005\u001b\u0000\u0000?@\u0003\n\u0005\u0003@B\u0001\u0000\u0000\u0000"+
		"A/\u0001\u0000\u0000\u0000A3\u0001\u0000\u0000\u0000A7\u0001\u0000\u0000"+
		"\u0000A8\u0001\u0000\u0000\u0000A9\u0001\u0000\u0000\u0000BO\u0001\u0000"+
		"\u0000\u0000CD\n\b\u0000\u0000DE\u0003\b\u0004\u0000EF\u0003\n\u0005\t"+
		"FN\u0001\u0000\u0000\u0000GH\n\u0002\u0000\u0000HI\u0005\u001c\u0000\u0000"+
		"IN\u0005.\u0000\u0000JK\n\u0001\u0000\u0000KL\u0005\u001d\u0000\u0000"+
		"LN\u0005.\u0000\u0000MC\u0001\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000"+
		"MJ\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000P\u000b\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RS\u0005\u001e\u0000\u0000ST\u0005.\u0000\u0000TU\u0005"+
		"\u001f\u0000\u0000UV\u0003\n\u0005\u0000VW\u0005,\u0000\u0000W\u00bf\u0001"+
		"\u0000\u0000\u0000XY\u0005 \u0000\u0000YZ\u0005.\u0000\u0000Z[\u0005\u001f"+
		"\u0000\u0000[\\\u0003\n\u0005\u0000\\]\u0005,\u0000\u0000]\u00bf\u0001"+
		"\u0000\u0000\u0000^_\u0005.\u0000\u0000_`\u0005\u001f\u0000\u0000`a\u0003"+
		"\n\u0005\u0000ab\u0005,\u0000\u0000b\u00bf\u0001\u0000\u0000\u0000cd\u0005"+
		"!\u0000\u0000de\u0003\n\u0005\u0000ef\u0005,\u0000\u0000f\u00bf\u0001"+
		"\u0000\u0000\u0000gh\u0005\"\u0000\u0000h\u00bf\u0005,\u0000\u0000ij\u0005"+
		"#\u0000\u0000j\u00bf\u0005,\u0000\u0000km\u0005\u001a\u0000\u0000ln\u0005"+
		"\u0018\u0000\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000oq\u0003\n\u0005\u0000pr\u0005\u0019\u0000\u0000"+
		"qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000st\u0005$\u0000\u0000t\u0082\u0003\u0004\u0002\u0000uw\u0005%\u0000"+
		"\u0000vx\u0005\u0018\u0000\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0003\n\u0005\u0000z|\u0005\u0019"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}~\u0005$\u0000\u0000~\u007f\u0003\u0004\u0002\u0000"+
		"\u007f\u0081\u0001\u0000\u0000\u0000\u0080u\u0001\u0000\u0000\u0000\u0081"+
		"\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0088\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u001b\u0000\u0000\u0086"+
		"\u0087\u0005$\u0000\u0000\u0087\u0089\u0003\u0004\u0002\u0000\u0088\u0085"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u00bf"+
		"\u0001\u0000\u0000\u0000\u008a\u008c\u0005&\u0000\u0000\u008b\u008d\u0005"+
		"\u0018\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0003"+
		"\n\u0005\u0000\u008f\u0091\u0005\u0019\u0000\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005$\u0000\u0000\u0093\u0097\u0003\u0004\u0002"+
		"\u0000\u0094\u0095\u0005\u001b\u0000\u0000\u0095\u0096\u0005$\u0000\u0000"+
		"\u0096\u0098\u0003\u0004\u0002\u0000\u0097\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u00bf\u0001\u0000\u0000\u0000"+
		"\u0099\u009b\u0005.\u0000\u0000\u009a\u009c\u0005\u0018\u0000\u0000\u009b"+
		"\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009e\u0001\u0000\u0000\u0000\u009d\u009f\u0003\n\u0005\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\'\u0000\u0000\u00a1\u00a3\u0003"+
		"\n\u0005\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a9\u0005\u0019\u0000\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00bf\u0005,\u0000\u0000\u00ab\u00ac\u0005!\u0000\u0000"+
		"\u00ac\u00ae\u0005.\u0000\u0000\u00ad\u00af\u0005\u0018\u0000\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003\n\u0005\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\'\u0000\u0000\u00b4\u00b6\u0003"+
		"\n\u0005\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u0005\u0019\u0000\u0000\u00bb\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bf\u0005,\u0000\u0000\u00beR\u0001\u0000\u0000\u0000"+
		"\u00beX\u0001\u0000\u0000\u0000\u00be^\u0001\u0000\u0000\u0000\u00bec"+
		"\u0001\u0000\u0000\u0000\u00beg\u0001\u0000\u0000\u0000\u00bei\u0001\u0000"+
		"\u0000\u0000\u00bek\u0001\u0000\u0000\u0000\u00be\u008a\u0001\u0000\u0000"+
		"\u0000\u00be\u0099\u0001\u0000\u0000\u0000\u00be\u00ab\u0001\u0000\u0000"+
		"\u0000\u00bf\r\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005(\u0000\u0000"+
		"\u00c1\u00c4\u0005.\u0000\u0000\u00c2\u00c3\u0005)\u0000\u0000\u00c3\u00c5"+
		"\u00055\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005"+
		"\u001d\u0000\u0000\u00c7\u00c9\u0005.\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005,\u0000\u0000\u00cb\u000f\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0005*\u0000\u0000\u00cd\u0011\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d0\u0003\u0010\b\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0005+\u0000\u0000\u00d2\u00d3\u0005.\u0000\u0000\u00d3\u00d5\u0005"+
		"\u0018\u0000\u0000\u00d4\u00d6\u0005.\u0000\u0000\u00d5\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00db\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0005\'\u0000\u0000\u00d8\u00da\u0005.\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005\u0019\u0000\u0000\u00df\u00e0\u0005$\u0000\u0000"+
		"\u00e0\u00e1\u0003\u0004\u0002\u0000\u00e1\u0013\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e4\u0003\u000e\u0007\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00eb\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00ea\u0003\u0012\t\u0000\u00e9"+
		"\u00e8\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u0015\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u001f"+
		"\u001a!\'AMOmqw{\u0082\u0088\u008c\u0090\u0097\u009b\u009e\u00a4\u00a8"+
		"\u00ae\u00b1\u00b7\u00bb\u00be\u00c4\u00c8\u00cf\u00d5\u00db\u00e5\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}