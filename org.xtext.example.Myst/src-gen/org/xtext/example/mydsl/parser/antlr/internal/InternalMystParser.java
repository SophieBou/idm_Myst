package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MystGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMystParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_POURCENTAGE_TEST", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CSV'", "'parse'", "','", "'crossValidation'", "'trainingTest'", "'linearDiscriminantAnalysis'", "'supportVectorMachines'", "'quadraticDiscriminantAnalysis'", "'kernelEstimation'", "'boosting'", "'decisionTree'", "'neutralNetwork'", "'learningVectorQuantization'", "'showAccuracy'", "'showRecall'", "'showFMeasure'", "'showPrecision'", "'showBalancedAccuracyScore'", "'showHammingLoss'", "'showJaccardScore'", "'showMatthewsCorrCoef'", "'showZeroOneLoss'"
    };
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


        public InternalMystParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMystParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMystParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyst.g"; }



     	private MystGrammarAccess grammarAccess;

        public InternalMystParser(TokenStream input, MystGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MystGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMyst.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyst.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyst.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyst.g:72:1: ruleProgram returns [EObject current=null] : ( ( (lv_csv_0_0= ruleCSV ) ) ( (lv_parse_1_0= ruleParse ) ) ( (lv_calcul_2_0= ruleCalcul ) ) ( (lv_metric_3_0= ruleMetric ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_csv_0_0 = null;

        EObject lv_parse_1_0 = null;

        EObject lv_calcul_2_0 = null;

        Enumerator lv_metric_3_0 = null;



        	enterRule();

        try {
            // InternalMyst.g:78:2: ( ( ( (lv_csv_0_0= ruleCSV ) ) ( (lv_parse_1_0= ruleParse ) ) ( (lv_calcul_2_0= ruleCalcul ) ) ( (lv_metric_3_0= ruleMetric ) ) ) )
            // InternalMyst.g:79:2: ( ( (lv_csv_0_0= ruleCSV ) ) ( (lv_parse_1_0= ruleParse ) ) ( (lv_calcul_2_0= ruleCalcul ) ) ( (lv_metric_3_0= ruleMetric ) ) )
            {
            // InternalMyst.g:79:2: ( ( (lv_csv_0_0= ruleCSV ) ) ( (lv_parse_1_0= ruleParse ) ) ( (lv_calcul_2_0= ruleCalcul ) ) ( (lv_metric_3_0= ruleMetric ) ) )
            // InternalMyst.g:80:3: ( (lv_csv_0_0= ruleCSV ) ) ( (lv_parse_1_0= ruleParse ) ) ( (lv_calcul_2_0= ruleCalcul ) ) ( (lv_metric_3_0= ruleMetric ) )
            {
            // InternalMyst.g:80:3: ( (lv_csv_0_0= ruleCSV ) )
            // InternalMyst.g:81:4: (lv_csv_0_0= ruleCSV )
            {
            // InternalMyst.g:81:4: (lv_csv_0_0= ruleCSV )
            // InternalMyst.g:82:5: lv_csv_0_0= ruleCSV
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getCsvCSVParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_csv_0_0=ruleCSV();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"csv",
            						lv_csv_0_0,
            						"org.xtext.example.mydsl.Myst.CSV");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyst.g:99:3: ( (lv_parse_1_0= ruleParse ) )
            // InternalMyst.g:100:4: (lv_parse_1_0= ruleParse )
            {
            // InternalMyst.g:100:4: (lv_parse_1_0= ruleParse )
            // InternalMyst.g:101:5: lv_parse_1_0= ruleParse
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getParseParseParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_parse_1_0=ruleParse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"parse",
            						lv_parse_1_0,
            						"org.xtext.example.mydsl.Myst.Parse");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyst.g:118:3: ( (lv_calcul_2_0= ruleCalcul ) )
            // InternalMyst.g:119:4: (lv_calcul_2_0= ruleCalcul )
            {
            // InternalMyst.g:119:4: (lv_calcul_2_0= ruleCalcul )
            // InternalMyst.g:120:5: lv_calcul_2_0= ruleCalcul
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getCalculCalculParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_calcul_2_0=ruleCalcul();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"calcul",
            						lv_calcul_2_0,
            						"org.xtext.example.mydsl.Myst.Calcul");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyst.g:137:3: ( (lv_metric_3_0= ruleMetric ) )
            // InternalMyst.g:138:4: (lv_metric_3_0= ruleMetric )
            {
            // InternalMyst.g:138:4: (lv_metric_3_0= ruleMetric )
            // InternalMyst.g:139:5: lv_metric_3_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getMetricMetricEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_metric_3_0=ruleMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"metric",
            						lv_metric_3_0,
            						"org.xtext.example.mydsl.Myst.Metric");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleCSV"
    // InternalMyst.g:160:1: entryRuleCSV returns [EObject current=null] : iv_ruleCSV= ruleCSV EOF ;
    public final EObject entryRuleCSV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSV = null;


        try {
            // InternalMyst.g:160:44: (iv_ruleCSV= ruleCSV EOF )
            // InternalMyst.g:161:2: iv_ruleCSV= ruleCSV EOF
            {
             newCompositeNode(grammarAccess.getCSVRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCSV=ruleCSV();

            state._fsp--;

             current =iv_ruleCSV; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSV"


    // $ANTLR start "ruleCSV"
    // InternalMyst.g:167:1: ruleCSV returns [EObject current=null] : (otherlv_0= 'CSV' ( (lv_cvsfile_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCSV() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cvsfile_1_0=null;


        	enterRule();

        try {
            // InternalMyst.g:173:2: ( (otherlv_0= 'CSV' ( (lv_cvsfile_1_0= RULE_STRING ) ) ) )
            // InternalMyst.g:174:2: (otherlv_0= 'CSV' ( (lv_cvsfile_1_0= RULE_STRING ) ) )
            {
            // InternalMyst.g:174:2: (otherlv_0= 'CSV' ( (lv_cvsfile_1_0= RULE_STRING ) ) )
            // InternalMyst.g:175:3: otherlv_0= 'CSV' ( (lv_cvsfile_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getCSVAccess().getCSVKeyword_0());
            		
            // InternalMyst.g:179:3: ( (lv_cvsfile_1_0= RULE_STRING ) )
            // InternalMyst.g:180:4: (lv_cvsfile_1_0= RULE_STRING )
            {
            // InternalMyst.g:180:4: (lv_cvsfile_1_0= RULE_STRING )
            // InternalMyst.g:181:5: lv_cvsfile_1_0= RULE_STRING
            {
            lv_cvsfile_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_cvsfile_1_0, grammarAccess.getCSVAccess().getCvsfileSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCSVRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cvsfile",
            						lv_cvsfile_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSV"


    // $ANTLR start "entryRuleParse"
    // InternalMyst.g:201:1: entryRuleParse returns [EObject current=null] : iv_ruleParse= ruleParse EOF ;
    public final EObject entryRuleParse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParse = null;


        try {
            // InternalMyst.g:201:46: (iv_ruleParse= ruleParse EOF )
            // InternalMyst.g:202:2: iv_ruleParse= ruleParse EOF
            {
             newCompositeNode(grammarAccess.getParseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParse=ruleParse();

            state._fsp--;

             current =iv_ruleParse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParse"


    // $ANTLR start "ruleParse"
    // InternalMyst.g:208:1: ruleParse returns [EObject current=null] : (otherlv_0= 'parse' ( (lv_variableCible_1_0= RULE_STRING ) )? ) ;
    public final EObject ruleParse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variableCible_1_0=null;


        	enterRule();

        try {
            // InternalMyst.g:214:2: ( (otherlv_0= 'parse' ( (lv_variableCible_1_0= RULE_STRING ) )? ) )
            // InternalMyst.g:215:2: (otherlv_0= 'parse' ( (lv_variableCible_1_0= RULE_STRING ) )? )
            {
            // InternalMyst.g:215:2: (otherlv_0= 'parse' ( (lv_variableCible_1_0= RULE_STRING ) )? )
            // InternalMyst.g:216:3: otherlv_0= 'parse' ( (lv_variableCible_1_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getParseAccess().getParseKeyword_0());
            		
            // InternalMyst.g:220:3: ( (lv_variableCible_1_0= RULE_STRING ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyst.g:221:4: (lv_variableCible_1_0= RULE_STRING )
                    {
                    // InternalMyst.g:221:4: (lv_variableCible_1_0= RULE_STRING )
                    // InternalMyst.g:222:5: lv_variableCible_1_0= RULE_STRING
                    {
                    lv_variableCible_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_variableCible_1_0, grammarAccess.getParseAccess().getVariableCibleSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParseRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"variableCible",
                    						lv_variableCible_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParse"


    // $ANTLR start "entryRuleCalcul"
    // InternalMyst.g:242:1: entryRuleCalcul returns [EObject current=null] : iv_ruleCalcul= ruleCalcul EOF ;
    public final EObject entryRuleCalcul() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalcul = null;


        try {
            // InternalMyst.g:242:47: (iv_ruleCalcul= ruleCalcul EOF )
            // InternalMyst.g:243:2: iv_ruleCalcul= ruleCalcul EOF
            {
             newCompositeNode(grammarAccess.getCalculRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalcul=ruleCalcul();

            state._fsp--;

             current =iv_ruleCalcul; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalcul"


    // $ANTLR start "ruleCalcul"
    // InternalMyst.g:249:1: ruleCalcul returns [EObject current=null] : ( ( (lv_strategy_0_0= ruleStrategy ) ) otherlv_1= ',' ( (lv_algorithm_2_0= ruleAlgorithm ) ) ) ;
    public final EObject ruleCalcul() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_strategy_0_0 = null;

        Enumerator lv_algorithm_2_0 = null;



        	enterRule();

        try {
            // InternalMyst.g:255:2: ( ( ( (lv_strategy_0_0= ruleStrategy ) ) otherlv_1= ',' ( (lv_algorithm_2_0= ruleAlgorithm ) ) ) )
            // InternalMyst.g:256:2: ( ( (lv_strategy_0_0= ruleStrategy ) ) otherlv_1= ',' ( (lv_algorithm_2_0= ruleAlgorithm ) ) )
            {
            // InternalMyst.g:256:2: ( ( (lv_strategy_0_0= ruleStrategy ) ) otherlv_1= ',' ( (lv_algorithm_2_0= ruleAlgorithm ) ) )
            // InternalMyst.g:257:3: ( (lv_strategy_0_0= ruleStrategy ) ) otherlv_1= ',' ( (lv_algorithm_2_0= ruleAlgorithm ) )
            {
            // InternalMyst.g:257:3: ( (lv_strategy_0_0= ruleStrategy ) )
            // InternalMyst.g:258:4: (lv_strategy_0_0= ruleStrategy )
            {
            // InternalMyst.g:258:4: (lv_strategy_0_0= ruleStrategy )
            // InternalMyst.g:259:5: lv_strategy_0_0= ruleStrategy
            {

            					newCompositeNode(grammarAccess.getCalculAccess().getStrategyStrategyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_strategy_0_0=ruleStrategy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalculRule());
            					}
            					set(
            						current,
            						"strategy",
            						lv_strategy_0_0,
            						"org.xtext.example.mydsl.Myst.Strategy");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCalculAccess().getCommaKeyword_1());
            		
            // InternalMyst.g:280:3: ( (lv_algorithm_2_0= ruleAlgorithm ) )
            // InternalMyst.g:281:4: (lv_algorithm_2_0= ruleAlgorithm )
            {
            // InternalMyst.g:281:4: (lv_algorithm_2_0= ruleAlgorithm )
            // InternalMyst.g:282:5: lv_algorithm_2_0= ruleAlgorithm
            {

            					newCompositeNode(grammarAccess.getCalculAccess().getAlgorithmAlgorithmEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_algorithm_2_0=ruleAlgorithm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCalculRule());
            					}
            					set(
            						current,
            						"algorithm",
            						lv_algorithm_2_0,
            						"org.xtext.example.mydsl.Myst.Algorithm");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalcul"


    // $ANTLR start "entryRuleStrategy"
    // InternalMyst.g:303:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // InternalMyst.g:303:49: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalMyst.g:304:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalMyst.g:310:1: ruleStrategy returns [EObject current=null] : ( ( (lv_trainingTest_0_0= ruleTrainingTest ) ) | ( (lv_crossValidation_1_0= ruleCrossValidation ) ) ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        EObject lv_trainingTest_0_0 = null;

        EObject lv_crossValidation_1_0 = null;



        	enterRule();

        try {
            // InternalMyst.g:316:2: ( ( ( (lv_trainingTest_0_0= ruleTrainingTest ) ) | ( (lv_crossValidation_1_0= ruleCrossValidation ) ) ) )
            // InternalMyst.g:317:2: ( ( (lv_trainingTest_0_0= ruleTrainingTest ) ) | ( (lv_crossValidation_1_0= ruleCrossValidation ) ) )
            {
            // InternalMyst.g:317:2: ( ( (lv_trainingTest_0_0= ruleTrainingTest ) ) | ( (lv_crossValidation_1_0= ruleCrossValidation ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyst.g:318:3: ( (lv_trainingTest_0_0= ruleTrainingTest ) )
                    {
                    // InternalMyst.g:318:3: ( (lv_trainingTest_0_0= ruleTrainingTest ) )
                    // InternalMyst.g:319:4: (lv_trainingTest_0_0= ruleTrainingTest )
                    {
                    // InternalMyst.g:319:4: (lv_trainingTest_0_0= ruleTrainingTest )
                    // InternalMyst.g:320:5: lv_trainingTest_0_0= ruleTrainingTest
                    {

                    					newCompositeNode(grammarAccess.getStrategyAccess().getTrainingTestTrainingTestParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_trainingTest_0_0=ruleTrainingTest();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStrategyRule());
                    					}
                    					set(
                    						current,
                    						"trainingTest",
                    						lv_trainingTest_0_0,
                    						"org.xtext.example.mydsl.Myst.TrainingTest");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyst.g:338:3: ( (lv_crossValidation_1_0= ruleCrossValidation ) )
                    {
                    // InternalMyst.g:338:3: ( (lv_crossValidation_1_0= ruleCrossValidation ) )
                    // InternalMyst.g:339:4: (lv_crossValidation_1_0= ruleCrossValidation )
                    {
                    // InternalMyst.g:339:4: (lv_crossValidation_1_0= ruleCrossValidation )
                    // InternalMyst.g:340:5: lv_crossValidation_1_0= ruleCrossValidation
                    {

                    					newCompositeNode(grammarAccess.getStrategyAccess().getCrossValidationCrossValidationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_crossValidation_1_0=ruleCrossValidation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStrategyRule());
                    					}
                    					set(
                    						current,
                    						"crossValidation",
                    						lv_crossValidation_1_0,
                    						"org.xtext.example.mydsl.Myst.CrossValidation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMyst.g:361:1: entryRuleCrossValidation returns [EObject current=null] : iv_ruleCrossValidation= ruleCrossValidation EOF ;
    public final EObject entryRuleCrossValidation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossValidation = null;


        try {
            // InternalMyst.g:361:56: (iv_ruleCrossValidation= ruleCrossValidation EOF )
            // InternalMyst.g:362:2: iv_ruleCrossValidation= ruleCrossValidation EOF
            {
             newCompositeNode(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrossValidation=ruleCrossValidation();

            state._fsp--;

             current =iv_ruleCrossValidation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalMyst.g:368:1: ruleCrossValidation returns [EObject current=null] : ( (lv_motcle_0_0= 'crossValidation' ) ) ;
    public final EObject ruleCrossValidation() throws RecognitionException {
        EObject current = null;

        Token lv_motcle_0_0=null;


        	enterRule();

        try {
            // InternalMyst.g:374:2: ( ( (lv_motcle_0_0= 'crossValidation' ) ) )
            // InternalMyst.g:375:2: ( (lv_motcle_0_0= 'crossValidation' ) )
            {
            // InternalMyst.g:375:2: ( (lv_motcle_0_0= 'crossValidation' ) )
            // InternalMyst.g:376:3: (lv_motcle_0_0= 'crossValidation' )
            {
            // InternalMyst.g:376:3: (lv_motcle_0_0= 'crossValidation' )
            // InternalMyst.g:377:4: lv_motcle_0_0= 'crossValidation'
            {
            lv_motcle_0_0=(Token)match(input,15,FOLLOW_2); 

            				newLeafNode(lv_motcle_0_0, grammarAccess.getCrossValidationAccess().getMotcleCrossValidationKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCrossValidationRule());
            				}
            				setWithLastConsumed(current, "motcle", lv_motcle_0_0, "crossValidation");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleTrainingTest"
    // InternalMyst.g:392:1: entryRuleTrainingTest returns [EObject current=null] : iv_ruleTrainingTest= ruleTrainingTest EOF ;
    public final EObject entryRuleTrainingTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingTest = null;


        try {
            // InternalMyst.g:392:53: (iv_ruleTrainingTest= ruleTrainingTest EOF )
            // InternalMyst.g:393:2: iv_ruleTrainingTest= ruleTrainingTest EOF
            {
             newCompositeNode(grammarAccess.getTrainingTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainingTest=ruleTrainingTest();

            state._fsp--;

             current =iv_ruleTrainingTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrainingTest"


    // $ANTLR start "ruleTrainingTest"
    // InternalMyst.g:399:1: ruleTrainingTest returns [EObject current=null] : (otherlv_0= 'trainingTest' otherlv_1= ',' ( (lv_testRate_2_0= RULE_POURCENTAGE_TEST ) ) ) ;
    public final EObject ruleTrainingTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_testRate_2_0=null;


        	enterRule();

        try {
            // InternalMyst.g:405:2: ( (otherlv_0= 'trainingTest' otherlv_1= ',' ( (lv_testRate_2_0= RULE_POURCENTAGE_TEST ) ) ) )
            // InternalMyst.g:406:2: (otherlv_0= 'trainingTest' otherlv_1= ',' ( (lv_testRate_2_0= RULE_POURCENTAGE_TEST ) ) )
            {
            // InternalMyst.g:406:2: (otherlv_0= 'trainingTest' otherlv_1= ',' ( (lv_testRate_2_0= RULE_POURCENTAGE_TEST ) ) )
            // InternalMyst.g:407:3: otherlv_0= 'trainingTest' otherlv_1= ',' ( (lv_testRate_2_0= RULE_POURCENTAGE_TEST ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTrainingTestAccess().getTrainingTestKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingTestAccess().getCommaKeyword_1());
            		
            // InternalMyst.g:415:3: ( (lv_testRate_2_0= RULE_POURCENTAGE_TEST ) )
            // InternalMyst.g:416:4: (lv_testRate_2_0= RULE_POURCENTAGE_TEST )
            {
            // InternalMyst.g:416:4: (lv_testRate_2_0= RULE_POURCENTAGE_TEST )
            // InternalMyst.g:417:5: lv_testRate_2_0= RULE_POURCENTAGE_TEST
            {
            lv_testRate_2_0=(Token)match(input,RULE_POURCENTAGE_TEST,FOLLOW_2); 

            					newLeafNode(lv_testRate_2_0, grammarAccess.getTrainingTestAccess().getTestRatePOURCENTAGE_TESTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrainingTestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"testRate",
            						lv_testRate_2_0,
            						"org.xtext.example.mydsl.Myst.POURCENTAGE_TEST");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrainingTest"


    // $ANTLR start "ruleAlgorithm"
    // InternalMyst.g:437:1: ruleAlgorithm returns [Enumerator current=null] : ( (enumLiteral_0= 'linearDiscriminantAnalysis' ) | (enumLiteral_1= 'supportVectorMachines' ) | (enumLiteral_2= 'quadraticDiscriminantAnalysis' ) | (enumLiteral_3= 'kernelEstimation' ) | (enumLiteral_4= 'boosting' ) | (enumLiteral_5= 'decisionTree' ) | (enumLiteral_6= 'neutralNetwork' ) | (enumLiteral_7= 'learningVectorQuantization' ) ) ;
    public final Enumerator ruleAlgorithm() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalMyst.g:443:2: ( ( (enumLiteral_0= 'linearDiscriminantAnalysis' ) | (enumLiteral_1= 'supportVectorMachines' ) | (enumLiteral_2= 'quadraticDiscriminantAnalysis' ) | (enumLiteral_3= 'kernelEstimation' ) | (enumLiteral_4= 'boosting' ) | (enumLiteral_5= 'decisionTree' ) | (enumLiteral_6= 'neutralNetwork' ) | (enumLiteral_7= 'learningVectorQuantization' ) ) )
            // InternalMyst.g:444:2: ( (enumLiteral_0= 'linearDiscriminantAnalysis' ) | (enumLiteral_1= 'supportVectorMachines' ) | (enumLiteral_2= 'quadraticDiscriminantAnalysis' ) | (enumLiteral_3= 'kernelEstimation' ) | (enumLiteral_4= 'boosting' ) | (enumLiteral_5= 'decisionTree' ) | (enumLiteral_6= 'neutralNetwork' ) | (enumLiteral_7= 'learningVectorQuantization' ) )
            {
            // InternalMyst.g:444:2: ( (enumLiteral_0= 'linearDiscriminantAnalysis' ) | (enumLiteral_1= 'supportVectorMachines' ) | (enumLiteral_2= 'quadraticDiscriminantAnalysis' ) | (enumLiteral_3= 'kernelEstimation' ) | (enumLiteral_4= 'boosting' ) | (enumLiteral_5= 'decisionTree' ) | (enumLiteral_6= 'neutralNetwork' ) | (enumLiteral_7= 'learningVectorQuantization' ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            case 22:
                {
                alt3=6;
                }
                break;
            case 23:
                {
                alt3=7;
                }
                break;
            case 24:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyst.g:445:3: (enumLiteral_0= 'linearDiscriminantAnalysis' )
                    {
                    // InternalMyst.g:445:3: (enumLiteral_0= 'linearDiscriminantAnalysis' )
                    // InternalMyst.g:446:4: enumLiteral_0= 'linearDiscriminantAnalysis'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getLinearDiscriminantAnalysisEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlgorithmAccess().getLinearDiscriminantAnalysisEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyst.g:453:3: (enumLiteral_1= 'supportVectorMachines' )
                    {
                    // InternalMyst.g:453:3: (enumLiteral_1= 'supportVectorMachines' )
                    // InternalMyst.g:454:4: enumLiteral_1= 'supportVectorMachines'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getSupportVectorMachinesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlgorithmAccess().getSupportVectorMachinesEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyst.g:461:3: (enumLiteral_2= 'quadraticDiscriminantAnalysis' )
                    {
                    // InternalMyst.g:461:3: (enumLiteral_2= 'quadraticDiscriminantAnalysis' )
                    // InternalMyst.g:462:4: enumLiteral_2= 'quadraticDiscriminantAnalysis'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getQuadraticDiscriminantAnalysisEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAlgorithmAccess().getQuadraticDiscriminantAnalysisEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyst.g:469:3: (enumLiteral_3= 'kernelEstimation' )
                    {
                    // InternalMyst.g:469:3: (enumLiteral_3= 'kernelEstimation' )
                    // InternalMyst.g:470:4: enumLiteral_3= 'kernelEstimation'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getKernelEstimationEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAlgorithmAccess().getKernelEstimationEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyst.g:477:3: (enumLiteral_4= 'boosting' )
                    {
                    // InternalMyst.g:477:3: (enumLiteral_4= 'boosting' )
                    // InternalMyst.g:478:4: enumLiteral_4= 'boosting'
                    {
                    enumLiteral_4=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getBoostingEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getAlgorithmAccess().getBoostingEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyst.g:485:3: (enumLiteral_5= 'decisionTree' )
                    {
                    // InternalMyst.g:485:3: (enumLiteral_5= 'decisionTree' )
                    // InternalMyst.g:486:4: enumLiteral_5= 'decisionTree'
                    {
                    enumLiteral_5=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getDecisionTreeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getAlgorithmAccess().getDecisionTreeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyst.g:493:3: (enumLiteral_6= 'neutralNetwork' )
                    {
                    // InternalMyst.g:493:3: (enumLiteral_6= 'neutralNetwork' )
                    // InternalMyst.g:494:4: enumLiteral_6= 'neutralNetwork'
                    {
                    enumLiteral_6=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getNeutralNetworkEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getAlgorithmAccess().getNeutralNetworkEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyst.g:501:3: (enumLiteral_7= 'learningVectorQuantization' )
                    {
                    // InternalMyst.g:501:3: (enumLiteral_7= 'learningVectorQuantization' )
                    // InternalMyst.g:502:4: enumLiteral_7= 'learningVectorQuantization'
                    {
                    enumLiteral_7=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAlgorithmAccess().getLearningVectorQuantizationEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getAlgorithmAccess().getLearningVectorQuantizationEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "ruleMetric"
    // InternalMyst.g:512:1: ruleMetric returns [Enumerator current=null] : ( (enumLiteral_0= 'showAccuracy' ) | (enumLiteral_1= 'showRecall' ) | (enumLiteral_2= 'showFMeasure' ) | (enumLiteral_3= 'showPrecision' ) | (enumLiteral_4= 'showBalancedAccuracyScore' ) | (enumLiteral_5= 'showHammingLoss' ) | (enumLiteral_6= 'showJaccardScore' ) | (enumLiteral_7= 'showMatthewsCorrCoef' ) | (enumLiteral_8= 'showZeroOneLoss' ) ) ;
    public final Enumerator ruleMetric() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalMyst.g:518:2: ( ( (enumLiteral_0= 'showAccuracy' ) | (enumLiteral_1= 'showRecall' ) | (enumLiteral_2= 'showFMeasure' ) | (enumLiteral_3= 'showPrecision' ) | (enumLiteral_4= 'showBalancedAccuracyScore' ) | (enumLiteral_5= 'showHammingLoss' ) | (enumLiteral_6= 'showJaccardScore' ) | (enumLiteral_7= 'showMatthewsCorrCoef' ) | (enumLiteral_8= 'showZeroOneLoss' ) ) )
            // InternalMyst.g:519:2: ( (enumLiteral_0= 'showAccuracy' ) | (enumLiteral_1= 'showRecall' ) | (enumLiteral_2= 'showFMeasure' ) | (enumLiteral_3= 'showPrecision' ) | (enumLiteral_4= 'showBalancedAccuracyScore' ) | (enumLiteral_5= 'showHammingLoss' ) | (enumLiteral_6= 'showJaccardScore' ) | (enumLiteral_7= 'showMatthewsCorrCoef' ) | (enumLiteral_8= 'showZeroOneLoss' ) )
            {
            // InternalMyst.g:519:2: ( (enumLiteral_0= 'showAccuracy' ) | (enumLiteral_1= 'showRecall' ) | (enumLiteral_2= 'showFMeasure' ) | (enumLiteral_3= 'showPrecision' ) | (enumLiteral_4= 'showBalancedAccuracyScore' ) | (enumLiteral_5= 'showHammingLoss' ) | (enumLiteral_6= 'showJaccardScore' ) | (enumLiteral_7= 'showMatthewsCorrCoef' ) | (enumLiteral_8= 'showZeroOneLoss' ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            case 29:
                {
                alt4=5;
                }
                break;
            case 30:
                {
                alt4=6;
                }
                break;
            case 31:
                {
                alt4=7;
                }
                break;
            case 32:
                {
                alt4=8;
                }
                break;
            case 33:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyst.g:520:3: (enumLiteral_0= 'showAccuracy' )
                    {
                    // InternalMyst.g:520:3: (enumLiteral_0= 'showAccuracy' )
                    // InternalMyst.g:521:4: enumLiteral_0= 'showAccuracy'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getAccuracyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMetricAccess().getAccuracyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyst.g:528:3: (enumLiteral_1= 'showRecall' )
                    {
                    // InternalMyst.g:528:3: (enumLiteral_1= 'showRecall' )
                    // InternalMyst.g:529:4: enumLiteral_1= 'showRecall'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getRecallEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMetricAccess().getRecallEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyst.g:536:3: (enumLiteral_2= 'showFMeasure' )
                    {
                    // InternalMyst.g:536:3: (enumLiteral_2= 'showFMeasure' )
                    // InternalMyst.g:537:4: enumLiteral_2= 'showFMeasure'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getMeasureEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMetricAccess().getMeasureEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyst.g:544:3: (enumLiteral_3= 'showPrecision' )
                    {
                    // InternalMyst.g:544:3: (enumLiteral_3= 'showPrecision' )
                    // InternalMyst.g:545:4: enumLiteral_3= 'showPrecision'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getPrecisionEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMetricAccess().getPrecisionEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyst.g:552:3: (enumLiteral_4= 'showBalancedAccuracyScore' )
                    {
                    // InternalMyst.g:552:3: (enumLiteral_4= 'showBalancedAccuracyScore' )
                    // InternalMyst.g:553:4: enumLiteral_4= 'showBalancedAccuracyScore'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getBalancedAccuracyScoreEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMetricAccess().getBalancedAccuracyScoreEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyst.g:560:3: (enumLiteral_5= 'showHammingLoss' )
                    {
                    // InternalMyst.g:560:3: (enumLiteral_5= 'showHammingLoss' )
                    // InternalMyst.g:561:4: enumLiteral_5= 'showHammingLoss'
                    {
                    enumLiteral_5=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getHammingLossEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getMetricAccess().getHammingLossEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyst.g:568:3: (enumLiteral_6= 'showJaccardScore' )
                    {
                    // InternalMyst.g:568:3: (enumLiteral_6= 'showJaccardScore' )
                    // InternalMyst.g:569:4: enumLiteral_6= 'showJaccardScore'
                    {
                    enumLiteral_6=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getJaccardScoreEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getMetricAccess().getJaccardScoreEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyst.g:576:3: (enumLiteral_7= 'showMatthewsCorrCoef' )
                    {
                    // InternalMyst.g:576:3: (enumLiteral_7= 'showMatthewsCorrCoef' )
                    // InternalMyst.g:577:4: enumLiteral_7= 'showMatthewsCorrCoef'
                    {
                    enumLiteral_7=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getMatthewsCorrCoefEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getMetricAccess().getMatthewsCorrCoefEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyst.g:584:3: (enumLiteral_8= 'showZeroOneLoss' )
                    {
                    // InternalMyst.g:584:3: (enumLiteral_8= 'showZeroOneLoss' )
                    // InternalMyst.g:585:4: enumLiteral_8= 'showZeroOneLoss'
                    {
                    enumLiteral_8=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getMetricAccess().getZeroOneLossEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getMetricAccess().getZeroOneLossEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetric"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000003FE000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001FE0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});

}