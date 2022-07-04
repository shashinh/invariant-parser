// Generated from /home/shashin/projects/invariant-parser/receiverparser/REC.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RECParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NUMS=3, NEWLINE=4;
	public static final int
		RULE_recs = 0, RULE_entry = 1, RULE_clazzes = 2, RULE_clazz = 3, RULE_bciKey = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"recs", "entry", "clazzes", "clazz", "bciKey"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NUMS", "NEWLINE"
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
	public String getGrammarFileName() { return "REC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RECParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RecsContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(RECParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(RECParser.EOF, 0); }
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public RecsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recs; }
	}

	public final RecsContext recs() throws RecognitionException {
		RecsContext _localctx = new RecsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_recs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMS) {
				{
				{
				setState(10);
				entry();
				setState(11);
				match(T__0);
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
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

	public static class EntryContext extends ParserRuleContext {
		public BciKeyContext bciKey() {
			return getRuleContext(BciKeyContext.class,0);
		}
		public ClazzesContext clazzes() {
			return getRuleContext(ClazzesContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			bciKey();
			setState(21);
			match(T__1);
			setState(22);
			clazzes();
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

	public static class ClazzesContext extends ParserRuleContext {
		public List<ClazzContext> clazz() {
			return getRuleContexts(ClazzContext.class);
		}
		public ClazzContext clazz(int i) {
			return getRuleContext(ClazzContext.class,i);
		}
		public ClazzesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clazzes; }
	}

	public final ClazzesContext clazzes() throws RecognitionException {
		ClazzesContext _localctx = new ClazzesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clazzes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			clazz();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(25);
				match(T__1);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUMS) {
					{
					{
					setState(26);
					clazz();
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ClazzContext extends ParserRuleContext {
		public TerminalNode NUMS() { return getToken(RECParser.NUMS, 0); }
		public ClazzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clazz; }
	}

	public final ClazzContext clazz() throws RecognitionException {
		ClazzContext _localctx = new ClazzContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_clazz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(NUMS);
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

	public static class BciKeyContext extends ParserRuleContext {
		public TerminalNode NUMS() { return getToken(RECParser.NUMS, 0); }
		public BciKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bciKey; }
	}

	public final BciKeyContext bciKey() throws RecognitionException {
		BciKeyContext _localctx = new BciKeyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bciKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(NUMS);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\5\4#\n\4\3"+
		"\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3\3\6\6\2&\2\21\3\2\2\2\4\26\3"+
		"\2\2\2\6\32\3\2\2\2\b$\3\2\2\2\n&\3\2\2\2\f\r\5\4\3\2\r\16\7\3\2\2\16"+
		"\20\3\2\2\2\17\f\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22"+
		"\24\3\2\2\2\23\21\3\2\2\2\24\25\t\2\2\2\25\3\3\2\2\2\26\27\5\n\6\2\27"+
		"\30\7\4\2\2\30\31\5\6\4\2\31\5\3\2\2\2\32\"\5\b\5\2\33\37\7\4\2\2\34\36"+
		"\5\b\5\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 #\3\2\2\2"+
		"!\37\3\2\2\2\"\33\3\2\2\2\"#\3\2\2\2#\7\3\2\2\2$%\7\5\2\2%\t\3\2\2\2&"+
		"\'\7\5\2\2\'\13\3\2\2\2\5\21\37\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}