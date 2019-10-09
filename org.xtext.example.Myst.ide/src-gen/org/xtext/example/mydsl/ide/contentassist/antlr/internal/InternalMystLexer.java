package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMystLexer extends Lexer {
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_POURCENTAGE_TEST=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMystLexer() {;} 
    public InternalMystLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMystLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyst.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:11:7: ( 'linearDiscriminantAnalysis' )
            // InternalMyst.g:11:9: 'linearDiscriminantAnalysis'
            {
            match("linearDiscriminantAnalysis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:12:7: ( 'supportVectorMachines' )
            // InternalMyst.g:12:9: 'supportVectorMachines'
            {
            match("supportVectorMachines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:13:7: ( 'quadraticDiscriminantAnalysis' )
            // InternalMyst.g:13:9: 'quadraticDiscriminantAnalysis'
            {
            match("quadraticDiscriminantAnalysis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:14:7: ( 'kernelEstimation' )
            // InternalMyst.g:14:9: 'kernelEstimation'
            {
            match("kernelEstimation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:15:7: ( 'boosting' )
            // InternalMyst.g:15:9: 'boosting'
            {
            match("boosting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:16:7: ( 'decisionTree' )
            // InternalMyst.g:16:9: 'decisionTree'
            {
            match("decisionTree"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:17:7: ( 'neutralNetwork' )
            // InternalMyst.g:17:9: 'neutralNetwork'
            {
            match("neutralNetwork"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:18:7: ( 'learningVectorQuantization' )
            // InternalMyst.g:18:9: 'learningVectorQuantization'
            {
            match("learningVectorQuantization"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:19:7: ( 'showAccuracy' )
            // InternalMyst.g:19:9: 'showAccuracy'
            {
            match("showAccuracy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:20:7: ( 'showRecall' )
            // InternalMyst.g:20:9: 'showRecall'
            {
            match("showRecall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:21:7: ( 'showFMeasure' )
            // InternalMyst.g:21:9: 'showFMeasure'
            {
            match("showFMeasure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:22:7: ( 'showPrecision' )
            // InternalMyst.g:22:9: 'showPrecision'
            {
            match("showPrecision"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:23:7: ( 'showBalancedAccuracyScore' )
            // InternalMyst.g:23:9: 'showBalancedAccuracyScore'
            {
            match("showBalancedAccuracyScore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:24:7: ( 'showHammingLoss' )
            // InternalMyst.g:24:9: 'showHammingLoss'
            {
            match("showHammingLoss"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:25:7: ( 'showJaccardScore' )
            // InternalMyst.g:25:9: 'showJaccardScore'
            {
            match("showJaccardScore"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:26:7: ( 'showMatthewsCorrCoef' )
            // InternalMyst.g:26:9: 'showMatthewsCorrCoef'
            {
            match("showMatthewsCorrCoef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:27:7: ( 'showZeroOneLoss' )
            // InternalMyst.g:27:9: 'showZeroOneLoss'
            {
            match("showZeroOneLoss"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:28:7: ( 'CSV' )
            // InternalMyst.g:28:9: 'CSV'
            {
            match("CSV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:29:7: ( 'parse' )
            // InternalMyst.g:29:9: 'parse'
            {
            match("parse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:30:7: ( ',' )
            // InternalMyst.g:30:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:31:7: ( 'trainingTest' )
            // InternalMyst.g:31:9: 'trainingTest'
            {
            match("trainingTest"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:32:7: ( 'crossValidation' )
            // InternalMyst.g:32:9: 'crossValidation'
            {
            match("crossValidation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_POURCENTAGE_TEST"
    public final void mRULE_POURCENTAGE_TEST() throws RecognitionException {
        try {
            int _type = RULE_POURCENTAGE_TEST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:962:23: ( RULE_INT '.' RULE_INT )
            // InternalMyst.g:962:25: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POURCENTAGE_TEST"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:964:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyst.g:964:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyst.g:964:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyst.g:964:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyst.g:964:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyst.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalMyst.g:966:19: ( ( '0' .. '9' )+ )
            // InternalMyst.g:966:21: ( '0' .. '9' )+
            {
            // InternalMyst.g:966:21: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyst.g:966:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:968:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyst.g:968:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyst.g:968:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyst.g:968:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyst.g:968:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyst.g:968:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyst.g:968:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyst.g:968:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyst.g:968:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyst.g:968:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyst.g:968:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:970:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyst.g:970:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyst.g:970:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyst.g:970:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:972:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyst.g:972:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyst.g:972:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyst.g:972:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyst.g:972:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyst.g:972:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyst.g:972:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyst.g:972:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:974:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyst.g:974:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyst.g:974:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyst.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyst.g:976:16: ( . )
            // InternalMyst.g:976:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyst.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_POURCENTAGE_TEST | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=29;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMyst.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalMyst.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalMyst.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalMyst.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalMyst.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalMyst.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalMyst.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalMyst.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalMyst.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalMyst.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalMyst.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalMyst.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalMyst.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalMyst.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalMyst.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalMyst.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalMyst.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalMyst.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalMyst.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalMyst.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalMyst.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalMyst.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalMyst.g:1:142: RULE_POURCENTAGE_TEST
                {
                mRULE_POURCENTAGE_TEST(); 

                }
                break;
            case 24 :
                // InternalMyst.g:1:164: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // InternalMyst.g:1:172: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // InternalMyst.g:1:184: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // InternalMyst.g:1:200: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // InternalMyst.g:1:216: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // InternalMyst.g:1:224: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\11\27\1\uffff\2\27\2\24\1\uffff\3\24\2\uffff\2\27\1\uffff\11\27\1\uffff\2\27\5\uffff\11\27\1\77\14\27\1\uffff\24\27\1\150\23\27\1\uffff\43\27\1\u009f\22\27\1\uffff\10\27\1\u00ba\21\27\1\uffff\20\27\1\u00dc\1\u00dd\10\27\1\u00e6\1\27\1\u00e8\4\27\2\uffff\1\u00ed\7\27\1\uffff\1\27\1\uffff\4\27\1\uffff\7\27\1\u0101\5\27\1\u0107\2\27\1\u010a\2\27\1\uffff\1\u010d\4\27\1\uffff\1\u0112\1\27\1\uffff\1\27\1\u0115\1\uffff\4\27\1\uffff\2\27\1\uffff\20\27\1\u012c\3\27\1\u0130\1\27\1\uffff\3\27\1\uffff\14\27\1\u0141\1\27\1\u0143\1\u0144\1\uffff\1\27\2\uffff\2\27\1\u0148\1\uffff";
    static final String DFA12_eofS =
        "\u0149\uffff";
    static final String DFA12_minS =
        "\1\0\1\145\1\150\1\165\1\145\1\157\2\145\1\123\1\141\1\uffff\2\162\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\156\1\141\1\uffff\1\160\1\157\1\141\1\162\1\157\1\143\1\165\1\126\1\162\1\uffff\1\141\1\157\5\uffff\1\145\1\162\1\160\1\167\1\144\1\156\1\163\1\151\1\164\1\60\1\163\1\151\1\163\1\141\1\156\1\157\1\101\1\162\1\145\1\164\1\163\1\162\1\uffff\1\145\1\156\1\163\1\162\1\151\1\162\1\143\1\145\1\115\1\162\4\141\1\145\1\141\1\154\2\151\1\141\1\60\1\151\1\126\1\104\1\156\1\164\2\143\2\145\1\154\1\155\1\143\1\164\1\162\1\164\1\105\1\156\1\157\1\154\1\uffff\1\156\1\141\1\151\1\147\1\126\1\165\2\141\1\143\1\141\1\155\1\143\1\164\1\157\1\151\1\163\1\147\1\156\1\116\1\147\1\154\1\163\1\126\1\145\1\162\1\154\1\163\1\151\1\156\1\151\1\141\1\150\1\117\1\143\1\164\1\60\1\124\1\145\1\124\1\151\1\143\1\145\1\143\1\141\1\154\1\165\1\163\1\143\1\156\1\162\1\145\1\156\1\104\1\151\1\uffff\1\162\1\164\1\145\1\144\1\162\1\143\1\164\1\143\1\60\1\162\1\151\1\145\1\147\1\144\1\167\1\145\1\151\1\155\1\145\1\167\1\163\1\141\1\151\1\164\1\157\1\171\1\uffff\1\145\1\157\1\144\1\114\1\123\1\163\1\114\1\163\1\141\1\145\1\157\2\164\1\155\1\157\1\162\2\60\1\156\1\101\1\157\1\143\1\103\1\157\1\143\1\164\1\60\1\162\1\60\2\151\1\162\1\115\2\uffff\1\60\1\143\1\163\2\157\1\163\1\162\1\151\1\uffff\1\153\1\uffff\1\157\1\156\1\121\1\141\1\uffff\1\143\1\163\2\162\1\163\1\151\1\157\1\60\1\156\1\141\1\165\1\143\1\165\1\60\1\145\1\162\1\60\1\155\1\156\1\uffff\1\60\1\156\1\141\1\150\1\162\1\uffff\1\60\1\103\1\uffff\1\151\1\60\1\uffff\1\164\1\156\1\151\1\141\1\uffff\1\157\1\156\1\uffff\1\101\1\164\1\156\1\143\1\145\1\141\1\156\1\151\1\145\1\171\1\146\1\156\1\141\1\172\1\163\1\123\1\60\1\164\1\154\1\141\1\60\1\143\1\uffff\1\101\1\171\1\164\1\uffff\1\157\1\156\1\163\1\151\1\162\1\141\1\151\1\157\1\145\1\154\1\163\1\156\1\60\1\171\2\60\1\uffff\1\163\2\uffff\1\151\1\163\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\151\2\165\1\145\1\157\2\145\1\123\1\141\1\uffff\2\162\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\156\1\141\1\uffff\1\160\1\157\1\141\1\162\1\157\1\143\1\165\1\126\1\162\1\uffff\1\141\1\157\5\uffff\1\145\1\162\1\160\1\167\1\144\1\156\1\163\1\151\1\164\1\172\1\163\1\151\1\163\1\141\1\156\1\157\1\132\1\162\1\145\1\164\1\163\1\162\1\uffff\1\145\1\156\1\163\1\162\1\151\1\162\1\143\1\145\1\115\1\162\4\141\1\145\1\141\1\154\2\151\1\141\1\172\1\151\1\126\1\104\1\156\1\164\2\143\2\145\1\154\1\155\1\143\1\164\1\162\1\164\1\105\1\156\1\157\1\154\1\uffff\1\156\1\141\1\151\1\147\1\126\1\165\2\141\1\143\1\141\1\155\1\143\1\164\1\157\1\151\1\163\1\147\1\156\1\116\1\147\1\154\1\163\1\126\1\145\1\162\1\154\1\163\1\151\1\156\1\151\1\141\1\150\1\117\1\143\1\164\1\172\1\124\1\145\1\124\1\151\1\143\1\145\1\143\1\141\1\154\1\165\1\163\1\143\1\156\1\162\1\145\1\156\1\104\1\151\1\uffff\1\162\1\164\1\145\1\144\1\162\1\143\1\164\1\143\1\172\1\162\1\151\1\145\1\147\1\144\1\167\1\145\1\151\1\155\1\145\1\167\1\163\1\141\1\151\1\164\1\157\1\171\1\uffff\1\145\1\157\1\144\1\114\1\123\1\163\1\114\1\163\1\141\1\145\1\157\2\164\1\155\1\157\1\162\2\172\1\156\1\101\1\157\1\143\1\103\1\157\1\143\1\164\1\172\1\162\1\172\2\151\1\162\1\115\2\uffff\1\172\1\143\1\163\2\157\1\163\1\162\1\151\1\uffff\1\153\1\uffff\1\157\1\156\1\121\1\141\1\uffff\1\143\1\163\2\162\1\163\1\151\1\157\1\172\1\156\1\141\1\165\1\143\1\165\1\172\1\145\1\162\1\172\1\155\1\156\1\uffff\1\172\1\156\1\141\1\150\1\162\1\uffff\1\172\1\103\1\uffff\1\151\1\172\1\uffff\1\164\1\156\1\151\1\141\1\uffff\1\157\1\156\1\uffff\1\101\1\164\1\156\1\143\1\145\1\141\1\156\1\151\1\145\1\171\1\146\1\156\1\141\1\172\1\163\1\123\1\172\1\164\1\154\1\141\1\172\1\143\1\uffff\1\101\1\171\1\164\1\uffff\1\157\1\156\1\163\1\151\1\162\1\141\1\151\1\157\1\145\1\154\1\163\1\156\1\172\1\171\2\172\1\uffff\1\163\2\uffff\1\151\1\163\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\12\uffff\1\24\4\uffff\1\30\3\uffff\1\34\1\35\2\uffff\1\30\11\uffff\1\24\2\uffff\1\27\1\31\1\32\1\33\1\34\26\uffff\1\22\50\uffff\1\23\66\uffff\1\5\32\uffff\1\12\41\uffff\1\11\1\13\10\uffff\1\6\1\uffff\1\25\4\uffff\1\14\23\uffff\1\7\5\uffff\1\16\2\uffff\1\21\2\uffff\1\26\4\uffff\1\17\2\uffff\1\4\26\uffff\1\20\3\uffff\1\2\20\uffff\1\15\1\uffff\1\1\1\10\3\uffff\1\3";
    static final String DFA12_specialS =
        "\1\1\17\uffff\1\2\1\0\u0137\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\20\4\24\1\21\4\24\1\12\2\24\1\22\12\15\7\24\2\17\1\10\27\17\3\24\1\16\1\17\1\24\1\17\1\5\1\14\1\6\6\17\1\4\1\1\1\17\1\7\1\17\1\11\1\3\1\17\1\2\1\13\6\17\uff85\24",
            "\1\26\3\uffff\1\25",
            "\1\31\14\uffff\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "",
            "\1\42",
            "\1\43",
            "\1\44\1\uffff\12\44",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\45",
            "\0\45",
            "\1\46\4\uffff\1\47",
            "",
            "",
            "\1\51",
            "\1\52",
            "",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106\1\112\3\uffff\1\110\1\uffff\1\113\1\uffff\1\114\2\uffff\1\115\2\uffff\1\111\1\uffff\1\107\7\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00e7",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0108",
            "\1\u0109",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u010b",
            "\1\u010c",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0113",
            "",
            "\1\u0114",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0131",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0142",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\u0145",
            "",
            "",
            "\1\u0146",
            "\1\u0147",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_POURCENTAGE_TEST | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_17 = input.LA(1);

                        s = -1;
                        if ( ((LA12_17>='\u0000' && LA12_17<='\uFFFF')) ) {s = 37;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='l') ) {s = 1;}

                        else if ( (LA12_0=='s') ) {s = 2;}

                        else if ( (LA12_0=='q') ) {s = 3;}

                        else if ( (LA12_0=='k') ) {s = 4;}

                        else if ( (LA12_0=='b') ) {s = 5;}

                        else if ( (LA12_0=='d') ) {s = 6;}

                        else if ( (LA12_0=='n') ) {s = 7;}

                        else if ( (LA12_0=='C') ) {s = 8;}

                        else if ( (LA12_0=='p') ) {s = 9;}

                        else if ( (LA12_0==',') ) {s = 10;}

                        else if ( (LA12_0=='t') ) {s = 11;}

                        else if ( (LA12_0=='c') ) {s = 12;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 13;}

                        else if ( (LA12_0=='^') ) {s = 14;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||(LA12_0>='e' && LA12_0<='j')||LA12_0=='m'||LA12_0=='o'||LA12_0=='r'||(LA12_0>='u' && LA12_0<='z')) ) {s = 15;}

                        else if ( (LA12_0=='\"') ) {s = 16;}

                        else if ( (LA12_0=='\'') ) {s = 17;}

                        else if ( (LA12_0=='/') ) {s = 18;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 19;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_16 = input.LA(1);

                        s = -1;
                        if ( ((LA12_16>='\u0000' && LA12_16<='\uFFFF')) ) {s = 37;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}