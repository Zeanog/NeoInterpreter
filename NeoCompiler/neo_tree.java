// $ANTLR 3.4 C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g 2012-10-20 23:55:12

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class neo_tree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT_OPERATOR", "BINARY_OPERATOR", "CHAR", "COMMENT", "DECLARATION", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "LITERAL", "OCTAL_ESC", "STRING", "TYPE_FLOAT", "TYPE_INT", "UNICODE_ESC", "VALUE", "WS", "';'"
    };

    public static final int EOF=-1;
    public static final int T__23=23;
    public static final int ASSIGNMENT_OPERATOR=4;
    public static final int BINARY_OPERATOR=5;
    public static final int CHAR=6;
    public static final int COMMENT=7;
    public static final int DECLARATION=8;
    public static final int ESC_SEQ=9;
    public static final int EXPONENT=10;
    public static final int FLOAT=11;
    public static final int HEX_DIGIT=12;
    public static final int ID=13;
    public static final int INT=14;
    public static final int LITERAL=15;
    public static final int OCTAL_ESC=16;
    public static final int STRING=17;
    public static final int TYPE_FLOAT=18;
    public static final int TYPE_INT=19;
    public static final int UNICODE_ESC=20;
    public static final int VALUE=21;
    public static final int WS=22;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public neo_tree(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public neo_tree(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return neo_tree.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g"; }



    // $ANTLR start "program"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:10:1: program : ( statement )+ ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:10:9: ( ( statement )+ )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:10:11: ( statement )+
            {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:10:11: ( statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ASSIGNMENT_OPERATOR||LA1_0==DECLARATION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:10:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program29);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "statement"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:13:1: statement : ( declaration | assignment );
    public final void statement() throws RecognitionException {
        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:14:2: ( declaration | assignment )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==DECLARATION) ) {
                alt2=1;
            }
            else if ( (LA2_0==ASSIGNMENT_OPERATOR) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:14:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_statement42);
                    declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:15:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement47);
                    assignment();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "operation"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:18:1: operation : ( value | ^( BINARY_OPERATOR value value ) );
    public final void operation() throws RecognitionException {
        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:19:2: ( value | ^( BINARY_OPERATOR value value ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==LITERAL) ) {
                alt3=1;
            }
            else if ( (LA3_0==BINARY_OPERATOR) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:19:4: value
                    {
                    pushFollow(FOLLOW_value_in_operation60);
                    value();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:20:4: ^( BINARY_OPERATOR value value )
                    {
                    match(input,BINARY_OPERATOR,FOLLOW_BINARY_OPERATOR_in_operation66); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_value_in_operation68);
                    value();

                    state._fsp--;


                    pushFollow(FOLLOW_value_in_operation70);
                    value();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "operation"



    // $ANTLR start "assignment"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:23:1: assignment : ^( ASSIGNMENT_OPERATOR ID operation ) ;
    public final void assignment() throws RecognitionException {
        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:24:2: ( ^( ASSIGNMENT_OPERATOR ID operation ) )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:24:4: ^( ASSIGNMENT_OPERATOR ID operation )
            {
            match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_assignment85); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_assignment87); 

            pushFollow(FOLLOW_operation_in_assignment89);
            operation();

            state._fsp--;


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "declaration"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:27:1: declaration : ^( DECLARATION ID ID ) ;
    public final void declaration() throws RecognitionException {
        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:28:2: ( ^( DECLARATION ID ID ) )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:28:4: ^( DECLARATION ID ID )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration103); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_declaration105); 

            match(input,ID,FOLLOW_ID_in_declaration107); 

            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "value"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:31:1: value : ( ID | ^( LITERAL TYPE_INT INT ) | ^( LITERAL TYPE_FLOAT FLOAT ) );
    public final void value() throws RecognitionException {
        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:31:7: ( ID | ^( LITERAL TYPE_INT INT ) | ^( LITERAL TYPE_FLOAT FLOAT ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==LITERAL) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==DOWN) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==TYPE_INT) ) {
                        alt4=2;
                    }
                    else if ( (LA4_3==TYPE_FLOAT) ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:31:9: ID
                    {
                    match(input,ID,FOLLOW_ID_in_value119); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:32:4: ^( LITERAL TYPE_INT INT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_value125); 

                    match(input, Token.DOWN, null); 
                    match(input,TYPE_INT,FOLLOW_TYPE_INT_in_value127); 

                    match(input,INT,FOLLOW_INT_in_value129); 

                    match(input, Token.UP, null); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\neo_tree.g:33:4: ^( LITERAL TYPE_FLOAT FLOAT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_value136); 

                    match(input, Token.DOWN, null); 
                    match(input,TYPE_FLOAT,FOLLOW_TYPE_FLOAT_in_value138); 

                    match(input,FLOAT,FOLLOW_FLOAT_in_value140); 

                    match(input, Token.UP, null); 


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "value"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_program29 = new BitSet(new long[]{0x0000000000000112L});
    public static final BitSet FOLLOW_declaration_in_statement42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_operation60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_OPERATOR_in_operation66 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_value_in_operation68 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_value_in_operation70 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_assignment85 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_assignment87 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_operation_in_assignment89 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declaration105 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_declaration107 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_value119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_value125 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_INT_in_value127 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_INT_in_value129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_value136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_FLOAT_in_value138 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_FLOAT_in_value140 = new BitSet(new long[]{0x0000000000000008L});

}