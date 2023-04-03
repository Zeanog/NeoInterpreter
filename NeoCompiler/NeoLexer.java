// $ANTLR 3.4 C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g 2012-10-25 08:39:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class NeoLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int ASSIGNMENT_OPERATOR=4;
    public static final int BINARY_OPERATOR=5;
    public static final int COMMENT=6;
    public static final int DECLARATION=7;
    public static final int FLOAT=8;
    public static final int ID=9;
    public static final int INT=10;
    public static final int LITERAL=11;
    public static final int TYPE_FLOAT=12;
    public static final int TYPE_INT=13;
    public static final int WS=14;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public NeoLexer() {} 
    public NeoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public NeoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:7:7: ( ';' )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:7:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "TYPE_INT"
    public final void mTYPE_INT() throws RecognitionException {
        try {
            int _type = TYPE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:53:9: ( ( 'int' ) )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:53:11: ( 'int' )
            {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:53:11: ( 'int' )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:53:12: 'int'
            {
            match("int"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_INT"

    // $ANTLR start "TYPE_FLOAT"
    public final void mTYPE_FLOAT() throws RecognitionException {
        try {
            int _type = TYPE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:56:11: ( ( 'float' ) )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:56:13: ( 'float' )
            {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:56:13: ( 'float' )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:56:14: 'float'
            {
            match("float"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_FLOAT"

    // $ANTLR start "BINARY_OPERATOR"
    public final void mBINARY_OPERATOR() throws RecognitionException {
        try {
            int _type = BINARY_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:59:17: ( '+' | '-' | '*' | '/' )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:
            {
            if ( (input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINARY_OPERATOR"

    // $ANTLR start "ASSIGNMENT_OPERATOR"
    public final void mASSIGNMENT_OPERATOR() throws RecognitionException {
        try {
            int _type = ASSIGNMENT_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:62:20: ( '=' )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:62:22: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGNMENT_OPERATOR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:65:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:65:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:65:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:68:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:68:7: ( '0' .. '9' )+
            {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:68:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:72:5: ( ( INT '.' INT ) )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:72:9: ( INT '.' INT )
            {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:72:9: ( INT '.' INT )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:72:10: INT '.' INT
            {
            mINT(); 


            match('.'); 

            mINT(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:76:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='/') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='/') ) {
                    alt6=1;
                }
                else if ( (LA6_1=='*') ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:76:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:76:14: (~ ( '\\n' | '\\r' ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:76:28: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:76:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    Skip();

                    }
                    break;
                case 2 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:77:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:77:14: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='*') ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1=='/') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:77:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match("*/"); 



                    Skip();

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:80:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:80:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            Skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:1:8: ( T__15 | TYPE_INT | TYPE_FLOAT | BINARY_OPERATOR | ASSIGNMENT_OPERATOR | ID | INT | FLOAT | COMMENT | WS )
        int alt7=10;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:1:10: T__15
                {
                mT__15(); 


                }
                break;
            case 2 :
                // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:1:16: TYPE_INT
                {
                mTYPE_INT(); 


                }
                break;
            case 3 :
                // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:1:25: TYPE_FLOAT
                {
                mTYPE_FLOAT(); 


                }
                break;
            case 4 :
                // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:1:36: BINARY_OPERATOR
                {
                mBINARY_OPERATOR(); 


                }
                break;
            case 5 :
                // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:1:52: ASSIGNMENT_OPERATOR
                {
                mASSIGNMENT_OPERATOR(); 


                }
                break;
            case 6 :
                // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:1:72: ID
                {
                mID(); 


                }
                break;
            case 7 :
                // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:1:75: INT
                {
                mINT(); 


                }
                break;
            case 8 :
                // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:1:79: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 9 :
                // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:1:85: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 10 :
                // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:1:93: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\2\uffff\2\6\1\10\2\uffff\1\15\2\uffff\2\6\3\uffff\1\21\1\6\1\uffff"+
        "\1\6\1\24\1\uffff";
    static final String DFA7_eofS =
        "\25\uffff";
    static final String DFA7_minS =
        "\1\11\1\uffff\1\156\1\154\1\52\2\uffff\1\56\2\uffff\1\164\1\157"+
        "\3\uffff\1\60\1\141\1\uffff\1\164\1\60\1\uffff";
    static final String DFA7_maxS =
        "\1\172\1\uffff\1\156\1\154\1\57\2\uffff\1\71\2\uffff\1\164\1\157"+
        "\3\uffff\1\172\1\141\1\uffff\1\164\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\3\uffff\1\5\1\6\1\uffff\1\4\1\12\2\uffff\1\11\1\7\1"+
        "\10\2\uffff\1\2\2\uffff\1\3";
    static final String DFA7_specialS =
        "\25\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\11\2\uffff\1\11\22\uffff\1\11\11\uffff\2\10\1\uffff\1\10"+
            "\1\uffff\1\4\12\7\1\uffff\1\1\1\uffff\1\5\3\uffff\32\6\4\uffff"+
            "\1\6\1\uffff\5\6\1\3\2\6\1\2\21\6",
            "",
            "\1\12",
            "\1\13",
            "\1\14\4\uffff\1\14",
            "",
            "",
            "\1\16\1\uffff\12\7",
            "",
            "",
            "\1\17",
            "\1\20",
            "",
            "",
            "",
            "\12\6\7\uffff\32\6\4\uffff\1\6\1\uffff\32\6",
            "\1\22",
            "",
            "\1\23",
            "\12\6\7\uffff\32\6\4\uffff\1\6\1\uffff\32\6",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | TYPE_INT | TYPE_FLOAT | BINARY_OPERATOR | ASSIGNMENT_OPERATOR | ID | INT | FLOAT | COMMENT | WS );";
        }
    }
 

}