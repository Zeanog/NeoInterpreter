//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 3.4
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// $ANTLR 3.4 C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g 2015-02-19 15:22:05

// The variable 'variable' is assigned but its value is never used.
#pragma warning disable 219
// Unreachable code detected.
#pragma warning disable 162
// Missing XML comment for publicly visible type or member 'Type_or_Member'
#pragma warning disable 1591
// CLS compliance checking will not be performed on 'type' because it is not visible from outside this assembly.
#pragma warning disable 3019


using System.Collections.Generic;
using Antlr.Runtime;
using Antlr.Runtime.Misc;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "3.4")]
[System.CLSCompliant(false)]
public partial class NeoLexer : Antlr.Runtime.Lexer
{
	public const int EOF=-1;
	public const int T__28=28;
	public const int T__29=29;
	public const int T__30=30;
	public const int T__31=31;
	public const int T__32=32;
	public const int T__33=33;
	public const int T__34=34;
	public const int T__35=35;
	public const int T__36=36;
	public const int T__37=37;
	public const int T__38=38;
	public const int ASSIGNMENT=4;
	public const int COMMENT=5;
	public const int DECLARATION=6;
	public const int FILE=7;
	public const int FLOAT_VALUE=8;
	public const int FUNCTION_ARGUMENT=9;
	public const int FUNCTION_ARGUMENTS=10;
	public const int FUNCTION_BODY=11;
	public const int FUNCTION_CALL=12;
	public const int FUNCTION_DEF=13;
	public const int FUNCTION_DEFS=14;
	public const int ID=15;
	public const int INT_VALUE=16;
	public const int LITERAL=17;
	public const int PARAM=18;
	public const int PARAMS=19;
	public const int PARENEXP=20;
	public const int PROGRAM=21;
	public const int SCRIPT=22;
	public const int TYPE_FLOAT=23;
	public const int TYPE_INT=24;
	public const int UNARY=25;
	public const int VARIABLE=26;
	public const int WS=27;

    // delegates
    // delegators

	public NeoLexer()
	{
		OnCreated();
	}

	public NeoLexer(ICharStream input )
		: this(input, new RecognizerSharedState())
	{
	}

	public NeoLexer(ICharStream input, RecognizerSharedState state)
		: base(input, state)
	{

		OnCreated();
	}
	public override string GrammarFileName { get { return "C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g"; } }


	partial void OnCreated();
	partial void EnterRule(string ruleName, int ruleIndex);
	partial void LeaveRule(string ruleName, int ruleIndex);

	partial void EnterRule_T__28();
	partial void LeaveRule_T__28();

	// $ANTLR start "T__28"
	[GrammarRule("T__28")]
	private void mT__28()
	{
		EnterRule_T__28();
		EnterRule("T__28", 1);
		TraceIn("T__28", 1);
		try
		{
			int _type = T__28;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:8:7: ( '(' )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:8:9: '('
			{
			DebugLocation(8, 9);
			Match('('); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__28", 1);
			LeaveRule("T__28", 1);
			LeaveRule_T__28();
		}
	}
	// $ANTLR end "T__28"

	partial void EnterRule_T__29();
	partial void LeaveRule_T__29();

	// $ANTLR start "T__29"
	[GrammarRule("T__29")]
	private void mT__29()
	{
		EnterRule_T__29();
		EnterRule("T__29", 2);
		TraceIn("T__29", 2);
		try
		{
			int _type = T__29;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:9:7: ( ')' )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:9:9: ')'
			{
			DebugLocation(9, 9);
			Match(')'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__29", 2);
			LeaveRule("T__29", 2);
			LeaveRule_T__29();
		}
	}
	// $ANTLR end "T__29"

	partial void EnterRule_T__30();
	partial void LeaveRule_T__30();

	// $ANTLR start "T__30"
	[GrammarRule("T__30")]
	private void mT__30()
	{
		EnterRule_T__30();
		EnterRule("T__30", 3);
		TraceIn("T__30", 3);
		try
		{
			int _type = T__30;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:10:7: ( '*' )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:10:9: '*'
			{
			DebugLocation(10, 9);
			Match('*'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__30", 3);
			LeaveRule("T__30", 3);
			LeaveRule_T__30();
		}
	}
	// $ANTLR end "T__30"

	partial void EnterRule_T__31();
	partial void LeaveRule_T__31();

	// $ANTLR start "T__31"
	[GrammarRule("T__31")]
	private void mT__31()
	{
		EnterRule_T__31();
		EnterRule("T__31", 4);
		TraceIn("T__31", 4);
		try
		{
			int _type = T__31;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:11:7: ( '+' )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:11:9: '+'
			{
			DebugLocation(11, 9);
			Match('+'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__31", 4);
			LeaveRule("T__31", 4);
			LeaveRule_T__31();
		}
	}
	// $ANTLR end "T__31"

	partial void EnterRule_T__32();
	partial void LeaveRule_T__32();

	// $ANTLR start "T__32"
	[GrammarRule("T__32")]
	private void mT__32()
	{
		EnterRule_T__32();
		EnterRule("T__32", 5);
		TraceIn("T__32", 5);
		try
		{
			int _type = T__32;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:12:7: ( ',' )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:12:9: ','
			{
			DebugLocation(12, 9);
			Match(','); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__32", 5);
			LeaveRule("T__32", 5);
			LeaveRule_T__32();
		}
	}
	// $ANTLR end "T__32"

	partial void EnterRule_T__33();
	partial void LeaveRule_T__33();

	// $ANTLR start "T__33"
	[GrammarRule("T__33")]
	private void mT__33()
	{
		EnterRule_T__33();
		EnterRule("T__33", 6);
		TraceIn("T__33", 6);
		try
		{
			int _type = T__33;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:13:7: ( '-' )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:13:9: '-'
			{
			DebugLocation(13, 9);
			Match('-'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__33", 6);
			LeaveRule("T__33", 6);
			LeaveRule_T__33();
		}
	}
	// $ANTLR end "T__33"

	partial void EnterRule_T__34();
	partial void LeaveRule_T__34();

	// $ANTLR start "T__34"
	[GrammarRule("T__34")]
	private void mT__34()
	{
		EnterRule_T__34();
		EnterRule("T__34", 7);
		TraceIn("T__34", 7);
		try
		{
			int _type = T__34;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:14:7: ( '/' )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:14:9: '/'
			{
			DebugLocation(14, 9);
			Match('/'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__34", 7);
			LeaveRule("T__34", 7);
			LeaveRule_T__34();
		}
	}
	// $ANTLR end "T__34"

	partial void EnterRule_T__35();
	partial void LeaveRule_T__35();

	// $ANTLR start "T__35"
	[GrammarRule("T__35")]
	private void mT__35()
	{
		EnterRule_T__35();
		EnterRule("T__35", 8);
		TraceIn("T__35", 8);
		try
		{
			int _type = T__35;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:15:7: ( ';' )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:15:9: ';'
			{
			DebugLocation(15, 9);
			Match(';'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__35", 8);
			LeaveRule("T__35", 8);
			LeaveRule_T__35();
		}
	}
	// $ANTLR end "T__35"

	partial void EnterRule_T__36();
	partial void LeaveRule_T__36();

	// $ANTLR start "T__36"
	[GrammarRule("T__36")]
	private void mT__36()
	{
		EnterRule_T__36();
		EnterRule("T__36", 9);
		TraceIn("T__36", 9);
		try
		{
			int _type = T__36;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:16:7: ( '=' )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:16:9: '='
			{
			DebugLocation(16, 9);
			Match('='); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__36", 9);
			LeaveRule("T__36", 9);
			LeaveRule_T__36();
		}
	}
	// $ANTLR end "T__36"

	partial void EnterRule_T__37();
	partial void LeaveRule_T__37();

	// $ANTLR start "T__37"
	[GrammarRule("T__37")]
	private void mT__37()
	{
		EnterRule_T__37();
		EnterRule("T__37", 10);
		TraceIn("T__37", 10);
		try
		{
			int _type = T__37;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:17:7: ( '{' )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:17:9: '{'
			{
			DebugLocation(17, 9);
			Match('{'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__37", 10);
			LeaveRule("T__37", 10);
			LeaveRule_T__37();
		}
	}
	// $ANTLR end "T__37"

	partial void EnterRule_T__38();
	partial void LeaveRule_T__38();

	// $ANTLR start "T__38"
	[GrammarRule("T__38")]
	private void mT__38()
	{
		EnterRule_T__38();
		EnterRule("T__38", 11);
		TraceIn("T__38", 11);
		try
		{
			int _type = T__38;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:18:7: ( '}' )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:18:9: '}'
			{
			DebugLocation(18, 9);
			Match('}'); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("T__38", 11);
			LeaveRule("T__38", 11);
			LeaveRule_T__38();
		}
	}
	// $ANTLR end "T__38"

	partial void EnterRule_ID();
	partial void LeaveRule_ID();

	// $ANTLR start "ID"
	[GrammarRule("ID")]
	private void mID()
	{
		EnterRule_ID();
		EnterRule("ID", 12);
		TraceIn("ID", 12);
		try
		{
			int _type = ID;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:121:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:121:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			DebugLocation(121, 7);
			if ((input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z'))
			{
				input.Consume();
			}
			else
			{
				MismatchedSetException mse = new MismatchedSetException(null,input);
				DebugRecognitionException(mse);
				Recover(mse);
				throw mse;
			}

			DebugLocation(121, 31);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:121:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			try { DebugEnterSubRule(1);
			while (true)
			{
				int alt1=2;
				try { DebugEnterDecision(1, false);
				int LA1_0 = input.LA(1);

				if (((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')))
				{
					alt1 = 1;
				}


				} finally { DebugExitDecision(1); }
				switch ( alt1 )
				{
				case 1:
					DebugEnterAlt(1);
					// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:
					{
					DebugLocation(121, 31);
					input.Consume();


					}
					break;

				default:
					goto loop1;
				}
			}

			loop1:
				;

			} finally { DebugExitSubRule(1); }


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("ID", 12);
			LeaveRule("ID", 12);
			LeaveRule_ID();
		}
	}
	// $ANTLR end "ID"

	partial void EnterRule_INT_VALUE();
	partial void LeaveRule_INT_VALUE();

	// $ANTLR start "INT_VALUE"
	[GrammarRule("INT_VALUE")]
	private void mINT_VALUE()
	{
		EnterRule_INT_VALUE();
		EnterRule("INT_VALUE", 13);
		TraceIn("INT_VALUE", 13);
		try
		{
			int _type = INT_VALUE;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:124:11: ( ( '0' .. '9' )+ )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:124:13: ( '0' .. '9' )+
			{
			DebugLocation(124, 13);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:124:13: ( '0' .. '9' )+
			int cnt2=0;
			try { DebugEnterSubRule(2);
			while (true)
			{
				int alt2=2;
				try { DebugEnterDecision(2, false);
				int LA2_0 = input.LA(1);

				if (((LA2_0>='0' && LA2_0<='9')))
				{
					alt2 = 1;
				}


				} finally { DebugExitDecision(2); }
				switch (alt2)
				{
				case 1:
					DebugEnterAlt(1);
					// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:
					{
					DebugLocation(124, 13);
					input.Consume();


					}
					break;

				default:
					if (cnt2 >= 1)
						goto loop2;

					EarlyExitException eee2 = new EarlyExitException( 2, input );
					DebugRecognitionException(eee2);
					throw eee2;
				}
				cnt2++;
			}
			loop2:
				;

			} finally { DebugExitSubRule(2); }


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("INT_VALUE", 13);
			LeaveRule("INT_VALUE", 13);
			LeaveRule_INT_VALUE();
		}
	}
	// $ANTLR end "INT_VALUE"

	partial void EnterRule_FLOAT_VALUE();
	partial void LeaveRule_FLOAT_VALUE();

	// $ANTLR start "FLOAT_VALUE"
	[GrammarRule("FLOAT_VALUE")]
	private void mFLOAT_VALUE()
	{
		EnterRule_FLOAT_VALUE();
		EnterRule("FLOAT_VALUE", 14);
		TraceIn("FLOAT_VALUE", 14);
		try
		{
			int _type = FLOAT_VALUE;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:128:5: ( ( INT_VALUE '.' INT_VALUE ) )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:128:9: ( INT_VALUE '.' INT_VALUE )
			{
			DebugLocation(128, 9);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:128:9: ( INT_VALUE '.' INT_VALUE )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:128:10: INT_VALUE '.' INT_VALUE
			{
			DebugLocation(128, 10);
			mINT_VALUE(); 
			DebugLocation(128, 20);
			Match('.'); 
			DebugLocation(128, 24);
			mINT_VALUE(); 

			}


			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("FLOAT_VALUE", 14);
			LeaveRule("FLOAT_VALUE", 14);
			LeaveRule_FLOAT_VALUE();
		}
	}
	// $ANTLR end "FLOAT_VALUE"

	partial void EnterRule_COMMENT();
	partial void LeaveRule_COMMENT();

	// $ANTLR start "COMMENT"
	[GrammarRule("COMMENT")]
	private void mCOMMENT()
	{
		EnterRule_COMMENT();
		EnterRule("COMMENT", 15);
		TraceIn("COMMENT", 15);
		try
		{
			int _type = COMMENT;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:132:5: ( ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' ) | ( '/*' ( options {greedy=false; } : . )* '*/' ) )
			int alt6=2;
			try { DebugEnterDecision(6, false);
			int LA6_0 = input.LA(1);

			if ((LA6_0=='/'))
			{
				int LA6_1 = input.LA(2);

				if ((LA6_1=='/'))
				{
					alt6 = 1;
				}
				else if ((LA6_1=='*'))
				{
					alt6 = 2;
				}
				else
				{
					NoViableAltException nvae = new NoViableAltException("", 6, 1, input);
					DebugRecognitionException(nvae);
					throw nvae;
				}
			}
			else
			{
				NoViableAltException nvae = new NoViableAltException("", 6, 0, input);
				DebugRecognitionException(nvae);
				throw nvae;
			}
			} finally { DebugExitDecision(6); }
			switch (alt6)
			{
			case 1:
				DebugEnterAlt(1);
				// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:132:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
				{
				DebugLocation(132, 9);
				// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:132:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
				DebugEnterAlt(1);
				// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:132:10: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
				{
				DebugLocation(132, 10);
				Match("//"); 

				DebugLocation(132, 15);
				// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:132:15: (~ ( '\\n' | '\\r' ) )*
				try { DebugEnterSubRule(3);
				while (true)
				{
					int alt3=2;
					try { DebugEnterDecision(3, false);
					int LA3_0 = input.LA(1);

					if (((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')))
					{
						alt3 = 1;
					}


					} finally { DebugExitDecision(3); }
					switch ( alt3 )
					{
					case 1:
						DebugEnterAlt(1);
						// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:
						{
						DebugLocation(132, 15);
						input.Consume();


						}
						break;

					default:
						goto loop3;
					}
				}

				loop3:
					;

				} finally { DebugExitSubRule(3); }

				DebugLocation(132, 29);
				// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:132:29: ( '\\r' )?
				int alt4=2;
				try { DebugEnterSubRule(4);
				try { DebugEnterDecision(4, false);
				int LA4_0 = input.LA(1);

				if ((LA4_0=='\r'))
				{
					alt4 = 1;
				}
				} finally { DebugExitDecision(4); }
				switch (alt4)
				{
				case 1:
					DebugEnterAlt(1);
					// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:132:29: '\\r'
					{
					DebugLocation(132, 29);
					Match('\r'); 

					}
					break;

				}
				} finally { DebugExitSubRule(4); }

				DebugLocation(132, 35);
				Match('\n'); 

				}

				DebugLocation(132, 41);
				Skip();

				}
				break;
			case 2:
				DebugEnterAlt(2);
				// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:133:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
				{
				DebugLocation(133, 9);
				// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:133:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
				DebugEnterAlt(1);
				// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:133:10: '/*' ( options {greedy=false; } : . )* '*/'
				{
				DebugLocation(133, 10);
				Match("/*"); 

				DebugLocation(133, 15);
				// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:133:15: ( options {greedy=false; } : . )*
				try { DebugEnterSubRule(5);
				while (true)
				{
					int alt5=2;
					try { DebugEnterDecision(5, false);
					int LA5_0 = input.LA(1);

					if ((LA5_0=='*'))
					{
						int LA5_1 = input.LA(2);

						if ((LA5_1=='/'))
						{
							alt5 = 2;
						}
						else if (((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')))
						{
							alt5 = 1;
						}


					}
					else if (((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')))
					{
						alt5 = 1;
					}


					} finally { DebugExitDecision(5); }
					switch ( alt5 )
					{
					case 1:
						DebugEnterAlt(1);
						// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:133:43: .
						{
						DebugLocation(133, 43);
						MatchAny(); 

						}
						break;

					default:
						goto loop5;
					}
				}

				loop5:
					;

				} finally { DebugExitSubRule(5); }

				DebugLocation(133, 48);
				Match("*/"); 


				}

				DebugLocation(133, 54);
				Skip();

				}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("COMMENT", 15);
			LeaveRule("COMMENT", 15);
			LeaveRule_COMMENT();
		}
	}
	// $ANTLR end "COMMENT"

	partial void EnterRule_WS();
	partial void LeaveRule_WS();

	// $ANTLR start "WS"
	[GrammarRule("WS")]
	private void mWS()
	{
		EnterRule_WS();
		EnterRule("WS", 16);
		TraceIn("WS", 16);
		try
		{
			int _type = WS;
			int _channel = DefaultTokenChannel;
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:136:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:136:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			DebugLocation(136, 9);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:136:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt7=0;
			try { DebugEnterSubRule(7);
			while (true)
			{
				int alt7=2;
				try { DebugEnterDecision(7, false);
				int LA7_0 = input.LA(1);

				if (((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' '))
				{
					alt7 = 1;
				}


				} finally { DebugExitDecision(7); }
				switch (alt7)
				{
				case 1:
					DebugEnterAlt(1);
					// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:
					{
					DebugLocation(136, 9);
					input.Consume();


					}
					break;

				default:
					if (cnt7 >= 1)
						goto loop7;

					EarlyExitException eee7 = new EarlyExitException( 7, input );
					DebugRecognitionException(eee7);
					throw eee7;
				}
				cnt7++;
			}
			loop7:
				;

			} finally { DebugExitSubRule(7); }

			DebugLocation(136, 31);
			Skip();

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally
		{
			TraceOut("WS", 16);
			LeaveRule("WS", 16);
			LeaveRule_WS();
		}
	}
	// $ANTLR end "WS"

	public override void mTokens()
	{
		// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | ID | INT_VALUE | FLOAT_VALUE | COMMENT | WS )
		int alt8=16;
		try { DebugEnterDecision(8, false);
		try
		{
			alt8 = dfa8.Predict(input);
		}
		catch (NoViableAltException nvae)
		{
			DebugRecognitionException(nvae);
			throw;
		}
		} finally { DebugExitDecision(8); }
		switch (alt8)
		{
		case 1:
			DebugEnterAlt(1);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:10: T__28
			{
			DebugLocation(1, 10);
			mT__28(); 

			}
			break;
		case 2:
			DebugEnterAlt(2);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:16: T__29
			{
			DebugLocation(1, 16);
			mT__29(); 

			}
			break;
		case 3:
			DebugEnterAlt(3);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:22: T__30
			{
			DebugLocation(1, 22);
			mT__30(); 

			}
			break;
		case 4:
			DebugEnterAlt(4);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:28: T__31
			{
			DebugLocation(1, 28);
			mT__31(); 

			}
			break;
		case 5:
			DebugEnterAlt(5);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:34: T__32
			{
			DebugLocation(1, 34);
			mT__32(); 

			}
			break;
		case 6:
			DebugEnterAlt(6);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:40: T__33
			{
			DebugLocation(1, 40);
			mT__33(); 

			}
			break;
		case 7:
			DebugEnterAlt(7);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:46: T__34
			{
			DebugLocation(1, 46);
			mT__34(); 

			}
			break;
		case 8:
			DebugEnterAlt(8);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:52: T__35
			{
			DebugLocation(1, 52);
			mT__35(); 

			}
			break;
		case 9:
			DebugEnterAlt(9);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:58: T__36
			{
			DebugLocation(1, 58);
			mT__36(); 

			}
			break;
		case 10:
			DebugEnterAlt(10);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:64: T__37
			{
			DebugLocation(1, 64);
			mT__37(); 

			}
			break;
		case 11:
			DebugEnterAlt(11);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:70: T__38
			{
			DebugLocation(1, 70);
			mT__38(); 

			}
			break;
		case 12:
			DebugEnterAlt(12);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:76: ID
			{
			DebugLocation(1, 76);
			mID(); 

			}
			break;
		case 13:
			DebugEnterAlt(13);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:79: INT_VALUE
			{
			DebugLocation(1, 79);
			mINT_VALUE(); 

			}
			break;
		case 14:
			DebugEnterAlt(14);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:89: FLOAT_VALUE
			{
			DebugLocation(1, 89);
			mFLOAT_VALUE(); 

			}
			break;
		case 15:
			DebugEnterAlt(15);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:101: COMMENT
			{
			DebugLocation(1, 101);
			mCOMMENT(); 

			}
			break;
		case 16:
			DebugEnterAlt(16);
			// C:\\Users\\Home\\Dropbox\\NeoInterpreter\\NeoCompiler\\Neo.g:1:109: WS
			{
			DebugLocation(1, 109);
			mWS(); 

			}
			break;

		}

	}


	#region DFA
	DFA8 dfa8;

	protected override void InitDFAs()
	{
		base.InitDFAs();
		dfa8 = new DFA8(this);
	}

	private class DFA8 : DFA
	{
		private const string DFA8_eotS =
			"\x7\xFFFF\x1\x10\x5\xFFFF\x1\x11\x5\xFFFF";
		private const string DFA8_eofS =
			"\x13\xFFFF";
		private const string DFA8_minS =
			"\x1\x9\x6\xFFFF\x1\x2A\x5\xFFFF\x1\x2E\x5\xFFFF";
		private const string DFA8_maxS =
			"\x1\x7D\x6\xFFFF\x1\x2F\x5\xFFFF\x1\x39\x5\xFFFF";
		private const string DFA8_acceptS =
			"\x1\xFFFF\x1\x1\x1\x2\x1\x3\x1\x4\x1\x5\x1\x6\x1\xFFFF\x1\x8\x1\x9\x1"+
			"\xA\x1\xB\x1\xC\x1\xFFFF\x1\x10\x1\xF\x1\x7\x1\xD\x1\xE";
		private const string DFA8_specialS =
			"\x13\xFFFF}>";
		private static readonly string[] DFA8_transitionS =
			{
				"\x2\xE\x2\xFFFF\x1\xE\x12\xFFFF\x1\xE\x7\xFFFF\x1\x1\x1\x2\x1\x3\x1"+
				"\x4\x1\x5\x1\x6\x1\xFFFF\x1\x7\xA\xD\x1\xFFFF\x1\x8\x1\xFFFF\x1\x9\x3"+
				"\xFFFF\x1A\xC\x4\xFFFF\x1\xC\x1\xFFFF\x1A\xC\x1\xA\x1\xFFFF\x1\xB",
				"",
				"",
				"",
				"",
				"",
				"",
				"\x1\xF\x4\xFFFF\x1\xF",
				"",
				"",
				"",
				"",
				"",
				"\x1\x12\x1\xFFFF\xA\xD",
				"",
				"",
				"",
				"",
				""
			};

		private static readonly short[] DFA8_eot = DFA.UnpackEncodedString(DFA8_eotS);
		private static readonly short[] DFA8_eof = DFA.UnpackEncodedString(DFA8_eofS);
		private static readonly char[] DFA8_min = DFA.UnpackEncodedStringToUnsignedChars(DFA8_minS);
		private static readonly char[] DFA8_max = DFA.UnpackEncodedStringToUnsignedChars(DFA8_maxS);
		private static readonly short[] DFA8_accept = DFA.UnpackEncodedString(DFA8_acceptS);
		private static readonly short[] DFA8_special = DFA.UnpackEncodedString(DFA8_specialS);
		private static readonly short[][] DFA8_transition;

		static DFA8()
		{
			int numStates = DFA8_transitionS.Length;
			DFA8_transition = new short[numStates][];
			for ( int i=0; i < numStates; i++ )
			{
				DFA8_transition[i] = DFA.UnpackEncodedString(DFA8_transitionS[i]);
			}
		}

		public DFA8( BaseRecognizer recognizer )
		{
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}

		public override string Description { get { return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | ID | INT_VALUE | FLOAT_VALUE | COMMENT | WS );"; } }

		public override void Error(NoViableAltException nvae)
		{
			DebugRecognitionException(nvae);
		}
	}

 
	#endregion

}