// $ANTLR 3.4 C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g 2012-10-25 08:39:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class NeoParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT_OPERATOR", "BINARY_OPERATOR", "COMMENT", "DECLARATION", "FLOAT", "ID", "INT", "LITERAL", "TYPE_FLOAT", "TYPE_INT", "WS", "';'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public NeoParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public NeoParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return NeoParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g"; }


    public AstParserRuleReturnScope<CommonTree, CommonToken> Process() {
    	TreeAdaptor = new CommonTreeAdaptor();
    	return program();
    }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:22:8: public program : ( WS )* ( statement )+ ( WS )* ;
    public final NeoParser.program_return program() throws RecognitionException {
        NeoParser.program_return retval = new NeoParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonToken WS1=null;
        CommonToken WS3=null;
        NeoParser.statement_return statement2 =null;


        CommonTree WS1_tree=null;
        CommonTree WS3_tree=null;

        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:23:2: ( ( WS )* ( statement )+ ( WS )* )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:23:4: ( WS )* ( statement )+ ( WS )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:23:4: ( WS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==WS) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:23:4: WS
            	    {
            	    WS1=(CommonToken)match(input,WS,FOLLOW_WS_in_program58); 
            	    WS1_tree = 
            	    (CommonTree)adaptor.create(WS1)
            	    ;
            	    adaptor.addChild(root_0, WS1_tree);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:23:8: ( statement )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:23:8: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program61);
            	    statement2=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement2.getTree());

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


            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:23:19: ( WS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:23:19: WS
            	    {
            	    WS3=(CommonToken)match(input,WS,FOLLOW_WS_in_program64); 
            	    WS3_tree = 
            	    (CommonTree)adaptor.create(WS3)
            	    ;
            	    adaptor.addChild(root_0, WS3_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:26:1: statement : ( ( WS )* declaration ( WS )* ';' | ( WS )* assignment ( WS )* ';' );
    public final NeoParser.statement_return statement() throws RecognitionException {
        NeoParser.statement_return retval = new NeoParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonToken WS4=null;
        CommonToken WS6=null;
        CommonToken char_literal7=null;
        CommonToken WS8=null;
        CommonToken WS10=null;
        CommonToken char_literal11=null;
        NeoParser.declaration_return declaration5 =null;

        NeoParser.assignment_return assignment9 =null;


        CommonTree WS4_tree=null;
        CommonTree WS6_tree=null;
        CommonTree char_literal7_tree=null;
        CommonTree WS8_tree=null;
        CommonTree WS10_tree=null;
        CommonTree char_literal11_tree=null;

        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:27:2: ( ( WS )* declaration ( WS )* ';' | ( WS )* assignment ( WS )* ';' )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:27:4: ( WS )* declaration ( WS )* ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:27:4: ( WS )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==WS) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:27:4: WS
                    	    {
                    	    WS4=(CommonToken)match(input,WS,FOLLOW_WS_in_statement77); 
                    	    WS4_tree = 
                    	    (CommonTree)adaptor.create(WS4)
                    	    ;
                    	    adaptor.addChild(root_0, WS4_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    pushFollow(FOLLOW_declaration_in_statement80);
                    declaration5=declaration();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration5.getTree());

                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:27:20: ( WS )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==WS) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:27:20: WS
                    	    {
                    	    WS6=(CommonToken)match(input,WS,FOLLOW_WS_in_statement82); 
                    	    WS6_tree = 
                    	    (CommonTree)adaptor.create(WS6)
                    	    ;
                    	    adaptor.addChild(root_0, WS6_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    char_literal7=(CommonToken)match(input,15,FOLLOW_15_in_statement85); 
                    char_literal7_tree = 
                    (CommonTree)adaptor.create(char_literal7)
                    ;
                    adaptor.addChild(root_0, char_literal7_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:28:4: ( WS )* assignment ( WS )* ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:28:4: ( WS )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==WS) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:28:4: WS
                    	    {
                    	    WS8=(CommonToken)match(input,WS,FOLLOW_WS_in_statement90); 
                    	    WS8_tree = 
                    	    (CommonTree)adaptor.create(WS8)
                    	    ;
                    	    adaptor.addChild(root_0, WS8_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assignment_in_statement93);
                    assignment9=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment9.getTree());

                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:28:19: ( WS )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==WS) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:28:19: WS
                    	    {
                    	    WS10=(CommonToken)match(input,WS,FOLLOW_WS_in_statement95); 
                    	    WS10_tree = 
                    	    (CommonTree)adaptor.create(WS10)
                    	    ;
                    	    adaptor.addChild(root_0, WS10_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    char_literal11=(CommonToken)match(input,15,FOLLOW_15_in_statement98); 
                    char_literal11_tree = 
                    (CommonTree)adaptor.create(char_literal11)
                    ;
                    adaptor.addChild(root_0, char_literal11_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class operation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operation"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:31:1: operation : ( ( value -> value ) ( WS )* ( BINARY_OPERATOR ( WS )* value )* ) -> ( ^( BINARY_OPERATOR value value ) )+ ;
    public final NeoParser.operation_return operation() throws RecognitionException {
        NeoParser.operation_return retval = new NeoParser.operation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonToken WS13=null;
        CommonToken BINARY_OPERATOR14=null;
        CommonToken WS15=null;
        NeoParser.value_return value12 =null;

        NeoParser.value_return value16 =null;


        CommonTree WS13_tree=null;
        CommonTree BINARY_OPERATOR14_tree=null;
        CommonTree WS15_tree=null;
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleTokenStream stream_BINARY_OPERATOR=new RewriteRuleTokenStream(adaptor,"token BINARY_OPERATOR");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:2: ( ( ( value -> value ) ( WS )* ( BINARY_OPERATOR ( WS )* value )* ) -> ( ^( BINARY_OPERATOR value value ) )+ )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:4: ( ( value -> value ) ( WS )* ( BINARY_OPERATOR ( WS )* value )* )
            {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:4: ( ( value -> value ) ( WS )* ( BINARY_OPERATOR ( WS )* value )* )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:5: ( value -> value ) ( WS )* ( BINARY_OPERATOR ( WS )* value )*
            {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:5: ( value -> value )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:6: value
            {
            pushFollow(FOLLOW_value_in_operation112);
            value12=value();

            state._fsp--;

            stream_value.add(value12.getTree());

            // AST REWRITE
            // elements: value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 32:12: -> value
            {
                adaptor.addChild(root_0, stream_value.nextTree());

            }


            retval.tree = root_0;

            }


            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:22: ( WS )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==WS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:22: WS
            	    {
            	    WS13=(CommonToken)match(input,WS,FOLLOW_WS_in_operation119);  
            	    stream_WS.add(WS13);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:26: ( BINARY_OPERATOR ( WS )* value )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BINARY_OPERATOR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:27: BINARY_OPERATOR ( WS )* value
            	    {
            	    BINARY_OPERATOR14=(CommonToken)match(input,BINARY_OPERATOR,FOLLOW_BINARY_OPERATOR_in_operation123);  
            	    stream_BINARY_OPERATOR.add(BINARY_OPERATOR14);


            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:43: ( WS )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==WS) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:43: WS
            	    	    {
            	    	    WS15=(CommonToken)match(input,WS,FOLLOW_WS_in_operation125);  
            	    	    stream_WS.add(WS15);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);


            	    pushFollow(FOLLOW_value_in_operation128);
            	    value16=value();

            	    state._fsp--;

            	    stream_value.add(value16.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: value, BINARY_OPERATOR, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 32:56: -> ( ^( BINARY_OPERATOR value value ) )+
            {
                if ( !(stream_value.hasNext()||stream_BINARY_OPERATOR.hasNext()||stream_value.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_value.hasNext()||stream_BINARY_OPERATOR.hasNext()||stream_value.hasNext() ) {
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:32:59: ^( BINARY_OPERATOR value value )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    stream_BINARY_OPERATOR.nextNode()
                    , root_1);

                    adaptor.addChild(root_1, stream_value.nextTree());

                    adaptor.addChild(root_1, stream_value.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_value.reset();
                stream_BINARY_OPERATOR.reset();
                stream_value.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operation"


    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:35:1: assignment : ( WS )* ID ( WS )* ASSIGNMENT_OPERATOR ( WS )* operation -> ^( ASSIGNMENT_OPERATOR ID operation ) ;
    public final NeoParser.assignment_return assignment() throws RecognitionException {
        NeoParser.assignment_return retval = new NeoParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonToken WS17=null;
        CommonToken ID18=null;
        CommonToken WS19=null;
        CommonToken ASSIGNMENT_OPERATOR20=null;
        CommonToken WS21=null;
        NeoParser.operation_return operation22 =null;


        CommonTree WS17_tree=null;
        CommonTree ID18_tree=null;
        CommonTree WS19_tree=null;
        CommonTree ASSIGNMENT_OPERATOR20_tree=null;
        CommonTree WS21_tree=null;
        RewriteRuleTokenStream stream_ASSIGNMENT_OPERATOR=new RewriteRuleTokenStream(adaptor,"token ASSIGNMENT_OPERATOR");
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_operation=new RewriteRuleSubtreeStream(adaptor,"rule operation");
        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:36:2: ( ( WS )* ID ( WS )* ASSIGNMENT_OPERATOR ( WS )* operation -> ^( ASSIGNMENT_OPERATOR ID operation ) )
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:36:4: ( WS )* ID ( WS )* ASSIGNMENT_OPERATOR ( WS )* operation
            {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:36:4: ( WS )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==WS) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:36:4: WS
            	    {
            	    WS17=(CommonToken)match(input,WS,FOLLOW_WS_in_assignment155);  
            	    stream_WS.add(WS17);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            ID18=(CommonToken)match(input,ID,FOLLOW_ID_in_assignment158);  
            stream_ID.add(ID18);


            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:36:11: ( WS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==WS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:36:11: WS
            	    {
            	    WS19=(CommonToken)match(input,WS,FOLLOW_WS_in_assignment160);  
            	    stream_WS.add(WS19);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            ASSIGNMENT_OPERATOR20=(CommonToken)match(input,ASSIGNMENT_OPERATOR,FOLLOW_ASSIGNMENT_OPERATOR_in_assignment163);  
            stream_ASSIGNMENT_OPERATOR.add(ASSIGNMENT_OPERATOR20);


            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:36:35: ( WS )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==WS) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:36:35: WS
            	    {
            	    WS21=(CommonToken)match(input,WS,FOLLOW_WS_in_assignment165);  
            	    stream_WS.add(WS21);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            pushFollow(FOLLOW_operation_in_assignment168);
            operation22=operation();

            state._fsp--;

            stream_operation.add(operation22.getTree());

            // AST REWRITE
            // elements: ASSIGNMENT_OPERATOR, ID, operation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 36:49: -> ^( ASSIGNMENT_OPERATOR ID operation )
            {
                // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:36:52: ^( ASSIGNMENT_OPERATOR ID operation )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_ASSIGNMENT_OPERATOR.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_operation.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:39:1: declaration : ( ( WS )* t= TYPE_INT ( WS )* v= ID -> ^( DECLARATION $t $v) | ( WS )* t= TYPE_FLOAT ( WS )* v= ID -> ^( DECLARATION $t $v) );
    public final NeoParser.declaration_return declaration() throws RecognitionException {
        NeoParser.declaration_return retval = new NeoParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonToken t=null;
        CommonToken v=null;
        CommonToken WS23=null;
        CommonToken WS24=null;
        CommonToken WS25=null;
        CommonToken WS26=null;

        CommonTree t_tree=null;
        CommonTree v_tree=null;
        CommonTree WS23_tree=null;
        CommonTree WS24_tree=null;
        CommonTree WS25_tree=null;
        CommonTree WS26_tree=null;
        RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_TYPE_INT=new RewriteRuleTokenStream(adaptor,"token TYPE_INT");
        RewriteRuleTokenStream stream_TYPE_FLOAT=new RewriteRuleTokenStream(adaptor,"token TYPE_FLOAT");

        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:40:2: ( ( WS )* t= TYPE_INT ( WS )* v= ID -> ^( DECLARATION $t $v) | ( WS )* t= TYPE_FLOAT ( WS )* v= ID -> ^( DECLARATION $t $v) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:40:4: ( WS )* t= TYPE_INT ( WS )* v= ID
                    {
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:40:4: ( WS )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==WS) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:40:4: WS
                    	    {
                    	    WS23=(CommonToken)match(input,WS,FOLLOW_WS_in_declaration190);  
                    	    stream_WS.add(WS23);


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    t=(CommonToken)match(input,TYPE_INT,FOLLOW_TYPE_INT_in_declaration195);  
                    stream_TYPE_INT.add(t);


                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:40:19: ( WS )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==WS) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:40:19: WS
                    	    {
                    	    WS24=(CommonToken)match(input,WS,FOLLOW_WS_in_declaration197);  
                    	    stream_WS.add(WS24);


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    v=(CommonToken)match(input,ID,FOLLOW_ID_in_declaration202);  
                    stream_ID.add(v);


                    // AST REWRITE
                    // elements: t, v
                    // token labels: v, t
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
                    RewriteRuleTokenStream stream_t=new RewriteRuleTokenStream(adaptor,"token t",t);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 40:28: -> ^( DECLARATION $t $v)
                    {
                        // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:40:31: ^( DECLARATION $t $v)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_t.nextNode());

                        adaptor.addChild(root_1, stream_v.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:41:4: ( WS )* t= TYPE_FLOAT ( WS )* v= ID
                    {
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:41:4: ( WS )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==WS) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:41:4: WS
                    	    {
                    	    WS25=(CommonToken)match(input,WS,FOLLOW_WS_in_declaration219);  
                    	    stream_WS.add(WS25);


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    t=(CommonToken)match(input,TYPE_FLOAT,FOLLOW_TYPE_FLOAT_in_declaration224);  
                    stream_TYPE_FLOAT.add(t);


                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:41:21: ( WS )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==WS) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:41:21: WS
                    	    {
                    	    WS26=(CommonToken)match(input,WS,FOLLOW_WS_in_declaration226);  
                    	    stream_WS.add(WS26);


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    v=(CommonToken)match(input,ID,FOLLOW_ID_in_declaration231);  
                    stream_ID.add(v);


                    // AST REWRITE
                    // elements: t, v
                    // token labels: v, t
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
                    RewriteRuleTokenStream stream_t=new RewriteRuleTokenStream(adaptor,"token t",t);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 41:30: -> ^( DECLARATION $t $v)
                    {
                        // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:41:33: ^( DECLARATION $t $v)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_t.nextNode());

                        adaptor.addChild(root_1, stream_v.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:44:1: value : ( ID | number );
    public final NeoParser.value_return value() throws RecognitionException {
        NeoParser.value_return retval = new NeoParser.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonToken ID27=null;
        NeoParser.number_return number28 =null;


        CommonTree ID27_tree=null;

        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:44:7: ( ID | number )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==FLOAT||LA20_0==INT) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:44:9: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID27=(CommonToken)match(input,ID,FOLLOW_ID_in_value254); 
                    ID27_tree = 
                    (CommonTree)adaptor.create(ID27)
                    ;
                    adaptor.addChild(root_0, ID27_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:45:4: number
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_number_in_value259);
                    number28=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number28.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"


    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:48:1: number : ( INT -> ^( LITERAL TYPE_INT INT ) | FLOAT -> ^( LITERAL TYPE_FLOAT FLOAT ) );
    public final NeoParser.number_return number() throws RecognitionException {
        NeoParser.number_return retval = new NeoParser.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonToken INT29=null;
        CommonToken FLOAT30=null;

        CommonTree INT29_tree=null;
        CommonTree FLOAT30_tree=null;
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:49:2: ( INT -> ^( LITERAL TYPE_INT INT ) | FLOAT -> ^( LITERAL TYPE_FLOAT FLOAT ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==INT) ) {
                alt21=1;
            }
            else if ( (LA21_0==FLOAT) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:49:4: INT
                    {
                    INT29=(CommonToken)match(input,INT,FOLLOW_INT_in_number272);  
                    stream_INT.add(INT29);


                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 49:8: -> ^( LITERAL TYPE_INT INT )
                    {
                        // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:49:11: ^( LITERAL TYPE_INT INT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LITERAL, "LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(TYPE_INT, "TYPE_INT")
                        );

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:50:4: FLOAT
                    {
                    FLOAT30=(CommonToken)match(input,FLOAT,FOLLOW_FLOAT_in_number287);  
                    stream_FLOAT.add(FLOAT30);


                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 50:10: -> ^( LITERAL TYPE_FLOAT FLOAT )
                    {
                        // C:\\Users\\Desktop\\NeoInterpreter\\NeoCompiler\\Neo.g:50:13: ^( LITERAL TYPE_FLOAT FLOAT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LITERAL, "LITERAL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(TYPE_FLOAT, "TYPE_FLOAT")
                        );

                        adaptor.addChild(root_1, 
                        stream_FLOAT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\2\2\2\uffff";
    static final String DFA2_minS =
        "\2\11\2\uffff";
    static final String DFA2_maxS =
        "\2\16\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\3\2\uffff\2\3\1\1",
            "\1\3\2\uffff\2\3\1\1",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()+ loopback of 23:8: ( statement )+";
        }
    }
    static final String DFA8_eotS =
        "\4\uffff";
    static final String DFA8_eofS =
        "\4\uffff";
    static final String DFA8_minS =
        "\2\11\2\uffff";
    static final String DFA8_maxS =
        "\2\16\2\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\4\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\3\2\uffff\2\2\1\1",
            "\1\3\2\uffff\2\2\1\1",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
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
        public String getDescription() {
            return "26:1: statement : ( ( WS )* declaration ( WS )* ';' | ( WS )* assignment ( WS )* ';' );";
        }
    }
    static final String DFA19_eotS =
        "\4\uffff";
    static final String DFA19_eofS =
        "\4\uffff";
    static final String DFA19_minS =
        "\2\14\2\uffff";
    static final String DFA19_maxS =
        "\2\16\2\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA19_specialS =
        "\4\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\3\1\2\1\1",
            "\1\3\1\2\1\1",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "39:1: declaration : ( ( WS )* t= TYPE_INT ( WS )* v= ID -> ^( DECLARATION $t $v) | ( WS )* t= TYPE_FLOAT ( WS )* v= ID -> ^( DECLARATION $t $v) );";
        }
    }
 

    public static final BitSet FOLLOW_WS_in_program58 = new BitSet(new long[]{0x0000000000007200L});
    public static final BitSet FOLLOW_statement_in_program61 = new BitSet(new long[]{0x0000000000007202L});
    public static final BitSet FOLLOW_WS_in_program64 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_WS_in_statement77 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_declaration_in_statement80 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_WS_in_statement82 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_statement85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_statement90 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_assignment_in_statement93 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_WS_in_statement95 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_statement98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_operation112 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_WS_in_operation119 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_BINARY_OPERATOR_in_operation123 = new BitSet(new long[]{0x0000000000004700L});
    public static final BitSet FOLLOW_WS_in_operation125 = new BitSet(new long[]{0x0000000000004700L});
    public static final BitSet FOLLOW_value_in_operation128 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_WS_in_assignment155 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_ID_in_assignment158 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_WS_in_assignment160 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ASSIGNMENT_OPERATOR_in_assignment163 = new BitSet(new long[]{0x0000000000004700L});
    public static final BitSet FOLLOW_WS_in_assignment165 = new BitSet(new long[]{0x0000000000004700L});
    public static final BitSet FOLLOW_operation_in_assignment168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_declaration190 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_TYPE_INT_in_declaration195 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_WS_in_declaration197 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_ID_in_declaration202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_declaration219 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_TYPE_FLOAT_in_declaration224 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_WS_in_declaration226 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_ID_in_declaration231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_number272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_number287 = new BitSet(new long[]{0x0000000000000002L});

}