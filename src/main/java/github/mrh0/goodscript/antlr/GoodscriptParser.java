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
		T__9=10, T__10=11, T__11=12, NL=13, BOOL=14, NAME=15, ATOM=16, INT=17, 
		FLOAT=18, HEX=19, BIN=20, CHAR=21, STRING=22, WHITESPACE=23, COMMENT=24, 
		BLOCKCOMMENT=25, INDENT=26, DEDENT=27;
	public static final int
		RULE_number = 0, RULE_primitive = 1, RULE_expr = 2, RULE_shortcall = 3, 
		RULE_statement = 4, RULE_block = 5, RULE_use = 6, RULE_func = 7, RULE_program = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"number", "primitive", "expr", "shortcall", "statement", "block", "use", 
			"func", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'('", "')'", "'='", "'ret'", "'use'", "'from'", "'as'", 
			"'start'", "'fn'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NL", "BOOL", "NAME", "ATOM", "INT", "FLOAT", "HEX", "BIN", "CHAR", 
			"STRING", "WHITESPACE", "COMMENT", "BLOCKCOMMENT", "INDENT", "DEDENT"
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
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new NumberIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new NumberFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(FLOAT);
				}
				break;
			case HEX:
				_localctx = new NumberHexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				match(HEX);
				}
				break;
			case BIN:
				_localctx = new NumberBinContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(GoodscriptParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(GoodscriptParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(GoodscriptParser.CHAR, 0); }
		public TerminalNode ATOM() { return getToken(GoodscriptParser.ATOM, 0); }
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primitive);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case HEX:
			case BIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				number();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(BOOL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				match(CHAR);
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
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
	public static class ExprOpBinContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprOpBinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterExprOpBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitExprOpBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitExprOpBin(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new ExprNestContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(32);
				match(T__1);
				setState(33);
				expr(0);
				setState(34);
				match(T__2);
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
				setState(36);
				primitive();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprOpBinContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(39);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(40);
					match(T__0);
					setState(41);
					expr(4);
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ShortcallContext extends ParserRuleContext {
		public ShortcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortcall; }
	 
		public ShortcallContext() { }
		public void copyFrom(ShortcallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShortcallArgContext extends ShortcallContext {
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public ShortcallContext shortcall() {
			return getRuleContext(ShortcallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ShortcallArgContext(ShortcallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterShortcallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitShortcallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitShortcallArg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShortcallNoArgContext extends ShortcallContext {
		public TerminalNode NAME() { return getToken(GoodscriptParser.NAME, 0); }
		public ShortcallNoArgContext(ShortcallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterShortcallNoArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitShortcallNoArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitShortcallNoArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortcallContext shortcall() throws RecognitionException {
		ShortcallContext _localctx = new ShortcallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_shortcall);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ShortcallArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(NAME);
				setState(48);
				shortcall();
				}
				break;
			case 2:
				_localctx = new ShortcallArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(NAME);
				setState(50);
				expr(0);
				}
				break;
			case 3:
				_localctx = new ShortcallNoArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(NAME);
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
	public static class StatementShortcallContext extends StatementContext {
		public ShortcallContext shortcall() {
			return getRuleContext(ShortcallContext.class,0);
		}
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public StatementShortcallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).enterStatementShortcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoodscriptListener ) ((GoodscriptListener)listener).exitStatementShortcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoodscriptVisitor ) return ((GoodscriptVisitor<? extends T>)visitor).visitStatementShortcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new StatementAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(NAME);
				setState(55);
				match(T__3);
				setState(56);
				match(T__1);
				setState(57);
				expr(0);
				setState(58);
				match(T__2);
				setState(59);
				match(NL);
				}
				break;
			case 2:
				_localctx = new StatementAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(NAME);
				setState(62);
				match(T__3);
				setState(63);
				expr(0);
				setState(64);
				match(NL);
				}
				break;
			case 3:
				_localctx = new StatementShortcallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				shortcall();
				setState(67);
				match(NL);
				}
				break;
			case 4:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(T__4);
				setState(70);
				expr(0);
				setState(71);
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
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(INDENT);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				((BlockContext)_localctx).statement = statement();
				((BlockContext)_localctx).statements.add(((BlockContext)_localctx).statement);
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==NAME );
			setState(81);
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

	public static class UseContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GoodscriptParser.STRING, 0); }
		public TerminalNode NL() { return getToken(GoodscriptParser.NL, 0); }
		public List<TerminalNode> NAME() { return getTokens(GoodscriptParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GoodscriptParser.NAME, i);
		}
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
		enterRule(_localctx, 12, RULE_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__5);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(84);
				match(NAME);
				setState(85);
				match(T__6);
				}
			}

			setState(88);
			match(STRING);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(89);
				match(T__7);
				setState(90);
				match(NAME);
				}
			}

			setState(93);
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
		enterRule(_localctx, 14, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(95);
				match(T__8);
				}
			}

			setState(98);
			match(T__9);
			setState(99);
			((FuncContext)_localctx).name = match(NAME);
			setState(100);
			match(T__1);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(101);
				((FuncContext)_localctx).NAME = match(NAME);
				((FuncContext)_localctx).args.add(((FuncContext)_localctx).NAME);
				}
			}

			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(104);
				match(T__10);
				setState(105);
				((FuncContext)_localctx).NAME = match(NAME);
				((FuncContext)_localctx).args.add(((FuncContext)_localctx).NAME);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(T__2);
			setState(112);
			match(T__11);
			setState(113);
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
		enterRule(_localctx, 16, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(115);
				use();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(121);
				((ProgramContext)_localctx).func = func();
				((ProgramContext)_localctx).functions.add(((ProgramContext)_localctx).func);
				}
				}
				setState(126);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u0080\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u0017\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002&\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00035\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001\u0005\u0001\u0005\u0004"+
		"\u0005N\b\u0005\u000b\u0005\f\u0005O\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006W\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\\\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0003\u0007a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007g\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007k\b\u0007\n\u0007"+
		"\f\u0007n\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0005\bu\b\b\n\b\f\bx\t\b\u0001\b\u0005\b{\b\b\n\b\f\b~\t\b\u0001\b"+
		"\u0000\u0001\u0004\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000"+
		"\u008c\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000"+
		"\u0000\u0004%\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b"+
		"I\u0001\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000"+
		"\u0000\u000e`\u0001\u0000\u0000\u0000\u0010v\u0001\u0000\u0000\u0000\u0012"+
		"\u0017\u0005\u0011\u0000\u0000\u0013\u0017\u0005\u0012\u0000\u0000\u0014"+
		"\u0017\u0005\u0013\u0000\u0000\u0015\u0017\u0005\u0014\u0000\u0000\u0016"+
		"\u0012\u0001\u0000\u0000\u0000\u0016\u0013\u0001\u0000\u0000\u0000\u0016"+
		"\u0014\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0001\u0001\u0000\u0000\u0000\u0018\u001e\u0003\u0000\u0000\u0000\u0019"+
		"\u001e\u0005\u000e\u0000\u0000\u001a\u001e\u0005\u0016\u0000\u0000\u001b"+
		"\u001e\u0005\u0015\u0000\u0000\u001c\u001e\u0005\u0010\u0000\u0000\u001d"+
		"\u0018\u0001\u0000\u0000\u0000\u001d\u0019\u0001\u0000\u0000\u0000\u001d"+
		"\u001a\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e\u0003\u0001\u0000\u0000\u0000\u001f"+
		" \u0006\u0002\uffff\uffff\u0000 !\u0005\u0002\u0000\u0000!\"\u0003\u0004"+
		"\u0002\u0000\"#\u0005\u0003\u0000\u0000#&\u0001\u0000\u0000\u0000$&\u0003"+
		"\u0002\u0001\u0000%\u001f\u0001\u0000\u0000\u0000%$\u0001\u0000\u0000"+
		"\u0000&,\u0001\u0000\u0000\u0000\'(\n\u0003\u0000\u0000()\u0005\u0001"+
		"\u0000\u0000)+\u0003\u0004\u0002\u0004*\'\u0001\u0000\u0000\u0000+.\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-\u0005\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/0\u0005\u000f"+
		"\u0000\u000005\u0003\u0006\u0003\u000012\u0005\u000f\u0000\u000025\u0003"+
		"\u0004\u0002\u000035\u0005\u000f\u0000\u00004/\u0001\u0000\u0000\u0000"+
		"41\u0001\u0000\u0000\u000043\u0001\u0000\u0000\u00005\u0007\u0001\u0000"+
		"\u0000\u000067\u0005\u000f\u0000\u000078\u0005\u0004\u0000\u000089\u0005"+
		"\u0002\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0005\u0003\u0000\u0000"+
		";<\u0005\r\u0000\u0000<J\u0001\u0000\u0000\u0000=>\u0005\u000f\u0000\u0000"+
		">?\u0005\u0004\u0000\u0000?@\u0003\u0004\u0002\u0000@A\u0005\r\u0000\u0000"+
		"AJ\u0001\u0000\u0000\u0000BC\u0003\u0006\u0003\u0000CD\u0005\r\u0000\u0000"+
		"DJ\u0001\u0000\u0000\u0000EF\u0005\u0005\u0000\u0000FG\u0003\u0004\u0002"+
		"\u0000GH\u0005\r\u0000\u0000HJ\u0001\u0000\u0000\u0000I6\u0001\u0000\u0000"+
		"\u0000I=\u0001\u0000\u0000\u0000IB\u0001\u0000\u0000\u0000IE\u0001\u0000"+
		"\u0000\u0000J\t\u0001\u0000\u0000\u0000KM\u0005\u001a\u0000\u0000LN\u0003"+
		"\b\u0004\u0000ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QR\u0005\u001b\u0000\u0000R\u000b\u0001\u0000\u0000\u0000SV\u0005\u0006"+
		"\u0000\u0000TU\u0005\u000f\u0000\u0000UW\u0005\u0007\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X[\u0005\u0016\u0000\u0000YZ\u0005\b\u0000\u0000Z\\\u0005\u000f\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0005\r\u0000\u0000^\r\u0001\u0000\u0000\u0000_a\u0005"+
		"\t\u0000\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bc\u0005\n\u0000\u0000cd\u0005\u000f\u0000\u0000df\u0005"+
		"\u0002\u0000\u0000eg\u0005\u000f\u0000\u0000fe\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gl\u0001\u0000\u0000\u0000hi\u0005\u000b\u0000"+
		"\u0000ik\u0005\u000f\u0000\u0000jh\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005\u0003\u0000\u0000"+
		"pq\u0005\f\u0000\u0000qr\u0003\n\u0005\u0000r\u000f\u0001\u0000\u0000"+
		"\u0000su\u0003\f\u0006\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w|\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000y{\u0003\u000e\u0007\u0000zy\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u0011\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u000e\u0016\u001d%,4IOV[`flv|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}