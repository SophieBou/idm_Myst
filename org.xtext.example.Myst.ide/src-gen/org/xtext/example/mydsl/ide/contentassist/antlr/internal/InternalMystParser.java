package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MystGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMystParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_POURCENTAGE_TEST", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'linearDiscriminantAnalysis'", "'supportVectorMachines'", "'quadraticDiscriminantAnalysis'", "'kernelEstimation'", "'boosting'", "'decisionTree'", "'neutralNetwork'", "'learningVectorQuantization'", "'showAccuracy'", "'showRecall'", "'showFMeasure'", "'showPrecision'", "'showBalancedAccuracyScore'", "'showHammingLoss'", "'showJaccardScore'", "'showMatthewsCorrCoef'", "'showZeroOneLoss'", "'CSV'", "'parse'", "','", "'trainingTest'", "'crossValidation'"
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

    	public void setGrammarAccess(MystGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalMyst.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMyst.g:54:1: ( ruleProgram EOF )
            // InternalMyst.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyst.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMyst.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMyst.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalMyst.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMyst.g:69:3: ( rule__Program__Group__0 )
            // InternalMyst.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleCSV"
    // InternalMyst.g:78:1: entryRuleCSV : ruleCSV EOF ;
    public final void entryRuleCSV() throws RecognitionException {
        try {
            // InternalMyst.g:79:1: ( ruleCSV EOF )
            // InternalMyst.g:80:1: ruleCSV EOF
            {
             before(grammarAccess.getCSVRule()); 
            pushFollow(FOLLOW_1);
            ruleCSV();

            state._fsp--;

             after(grammarAccess.getCSVRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSV"


    // $ANTLR start "ruleCSV"
    // InternalMyst.g:87:1: ruleCSV : ( ( rule__CSV__Group__0 ) ) ;
    public final void ruleCSV() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:91:2: ( ( ( rule__CSV__Group__0 ) ) )
            // InternalMyst.g:92:2: ( ( rule__CSV__Group__0 ) )
            {
            // InternalMyst.g:92:2: ( ( rule__CSV__Group__0 ) )
            // InternalMyst.g:93:3: ( rule__CSV__Group__0 )
            {
             before(grammarAccess.getCSVAccess().getGroup()); 
            // InternalMyst.g:94:3: ( rule__CSV__Group__0 )
            // InternalMyst.g:94:4: rule__CSV__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CSV__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSVAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSV"


    // $ANTLR start "entryRuleParse"
    // InternalMyst.g:103:1: entryRuleParse : ruleParse EOF ;
    public final void entryRuleParse() throws RecognitionException {
        try {
            // InternalMyst.g:104:1: ( ruleParse EOF )
            // InternalMyst.g:105:1: ruleParse EOF
            {
             before(grammarAccess.getParseRule()); 
            pushFollow(FOLLOW_1);
            ruleParse();

            state._fsp--;

             after(grammarAccess.getParseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParse"


    // $ANTLR start "ruleParse"
    // InternalMyst.g:112:1: ruleParse : ( ( rule__Parse__Group__0 ) ) ;
    public final void ruleParse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:116:2: ( ( ( rule__Parse__Group__0 ) ) )
            // InternalMyst.g:117:2: ( ( rule__Parse__Group__0 ) )
            {
            // InternalMyst.g:117:2: ( ( rule__Parse__Group__0 ) )
            // InternalMyst.g:118:3: ( rule__Parse__Group__0 )
            {
             before(grammarAccess.getParseAccess().getGroup()); 
            // InternalMyst.g:119:3: ( rule__Parse__Group__0 )
            // InternalMyst.g:119:4: rule__Parse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParse"


    // $ANTLR start "entryRuleCalcul"
    // InternalMyst.g:128:1: entryRuleCalcul : ruleCalcul EOF ;
    public final void entryRuleCalcul() throws RecognitionException {
        try {
            // InternalMyst.g:129:1: ( ruleCalcul EOF )
            // InternalMyst.g:130:1: ruleCalcul EOF
            {
             before(grammarAccess.getCalculRule()); 
            pushFollow(FOLLOW_1);
            ruleCalcul();

            state._fsp--;

             after(grammarAccess.getCalculRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalcul"


    // $ANTLR start "ruleCalcul"
    // InternalMyst.g:137:1: ruleCalcul : ( ( rule__Calcul__Group__0 ) ) ;
    public final void ruleCalcul() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:141:2: ( ( ( rule__Calcul__Group__0 ) ) )
            // InternalMyst.g:142:2: ( ( rule__Calcul__Group__0 ) )
            {
            // InternalMyst.g:142:2: ( ( rule__Calcul__Group__0 ) )
            // InternalMyst.g:143:3: ( rule__Calcul__Group__0 )
            {
             before(grammarAccess.getCalculAccess().getGroup()); 
            // InternalMyst.g:144:3: ( rule__Calcul__Group__0 )
            // InternalMyst.g:144:4: rule__Calcul__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Calcul__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalculAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalcul"


    // $ANTLR start "entryRuleStrategy"
    // InternalMyst.g:153:1: entryRuleStrategy : ruleStrategy EOF ;
    public final void entryRuleStrategy() throws RecognitionException {
        try {
            // InternalMyst.g:154:1: ( ruleStrategy EOF )
            // InternalMyst.g:155:1: ruleStrategy EOF
            {
             before(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getStrategyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalMyst.g:162:1: ruleStrategy : ( ( rule__Strategy__Alternatives ) ) ;
    public final void ruleStrategy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:166:2: ( ( ( rule__Strategy__Alternatives ) ) )
            // InternalMyst.g:167:2: ( ( rule__Strategy__Alternatives ) )
            {
            // InternalMyst.g:167:2: ( ( rule__Strategy__Alternatives ) )
            // InternalMyst.g:168:3: ( rule__Strategy__Alternatives )
            {
             before(grammarAccess.getStrategyAccess().getAlternatives()); 
            // InternalMyst.g:169:3: ( rule__Strategy__Alternatives )
            // InternalMyst.g:169:4: rule__Strategy__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Strategy__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStrategyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleCrossValidation"
    // InternalMyst.g:178:1: entryRuleCrossValidation : ruleCrossValidation EOF ;
    public final void entryRuleCrossValidation() throws RecognitionException {
        try {
            // InternalMyst.g:179:1: ( ruleCrossValidation EOF )
            // InternalMyst.g:180:1: ruleCrossValidation EOF
            {
             before(grammarAccess.getCrossValidationRule()); 
            pushFollow(FOLLOW_1);
            ruleCrossValidation();

            state._fsp--;

             after(grammarAccess.getCrossValidationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCrossValidation"


    // $ANTLR start "ruleCrossValidation"
    // InternalMyst.g:187:1: ruleCrossValidation : ( ( rule__CrossValidation__MotcleAssignment ) ) ;
    public final void ruleCrossValidation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:191:2: ( ( ( rule__CrossValidation__MotcleAssignment ) ) )
            // InternalMyst.g:192:2: ( ( rule__CrossValidation__MotcleAssignment ) )
            {
            // InternalMyst.g:192:2: ( ( rule__CrossValidation__MotcleAssignment ) )
            // InternalMyst.g:193:3: ( rule__CrossValidation__MotcleAssignment )
            {
             before(grammarAccess.getCrossValidationAccess().getMotcleAssignment()); 
            // InternalMyst.g:194:3: ( rule__CrossValidation__MotcleAssignment )
            // InternalMyst.g:194:4: rule__CrossValidation__MotcleAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CrossValidation__MotcleAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCrossValidationAccess().getMotcleAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCrossValidation"


    // $ANTLR start "entryRuleTrainingTest"
    // InternalMyst.g:203:1: entryRuleTrainingTest : ruleTrainingTest EOF ;
    public final void entryRuleTrainingTest() throws RecognitionException {
        try {
            // InternalMyst.g:204:1: ( ruleTrainingTest EOF )
            // InternalMyst.g:205:1: ruleTrainingTest EOF
            {
             before(grammarAccess.getTrainingTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainingTest();

            state._fsp--;

             after(grammarAccess.getTrainingTestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainingTest"


    // $ANTLR start "ruleTrainingTest"
    // InternalMyst.g:212:1: ruleTrainingTest : ( ( rule__TrainingTest__Group__0 ) ) ;
    public final void ruleTrainingTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:216:2: ( ( ( rule__TrainingTest__Group__0 ) ) )
            // InternalMyst.g:217:2: ( ( rule__TrainingTest__Group__0 ) )
            {
            // InternalMyst.g:217:2: ( ( rule__TrainingTest__Group__0 ) )
            // InternalMyst.g:218:3: ( rule__TrainingTest__Group__0 )
            {
             before(grammarAccess.getTrainingTestAccess().getGroup()); 
            // InternalMyst.g:219:3: ( rule__TrainingTest__Group__0 )
            // InternalMyst.g:219:4: rule__TrainingTest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainingTest"


    // $ANTLR start "ruleAlgorithm"
    // InternalMyst.g:228:1: ruleAlgorithm : ( ( rule__Algorithm__Alternatives ) ) ;
    public final void ruleAlgorithm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:232:1: ( ( ( rule__Algorithm__Alternatives ) ) )
            // InternalMyst.g:233:2: ( ( rule__Algorithm__Alternatives ) )
            {
            // InternalMyst.g:233:2: ( ( rule__Algorithm__Alternatives ) )
            // InternalMyst.g:234:3: ( rule__Algorithm__Alternatives )
            {
             before(grammarAccess.getAlgorithmAccess().getAlternatives()); 
            // InternalMyst.g:235:3: ( rule__Algorithm__Alternatives )
            // InternalMyst.g:235:4: rule__Algorithm__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Algorithm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithm"


    // $ANTLR start "ruleMetric"
    // InternalMyst.g:244:1: ruleMetric : ( ( rule__Metric__Alternatives ) ) ;
    public final void ruleMetric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:248:1: ( ( ( rule__Metric__Alternatives ) ) )
            // InternalMyst.g:249:2: ( ( rule__Metric__Alternatives ) )
            {
            // InternalMyst.g:249:2: ( ( rule__Metric__Alternatives ) )
            // InternalMyst.g:250:3: ( rule__Metric__Alternatives )
            {
             before(grammarAccess.getMetricAccess().getAlternatives()); 
            // InternalMyst.g:251:3: ( rule__Metric__Alternatives )
            // InternalMyst.g:251:4: rule__Metric__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Metric__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMetricAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetric"


    // $ANTLR start "rule__Strategy__Alternatives"
    // InternalMyst.g:259:1: rule__Strategy__Alternatives : ( ( ( rule__Strategy__TrainingTestAssignment_0 ) ) | ( ( rule__Strategy__CrossValidationAssignment_1 ) ) );
    public final void rule__Strategy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:263:1: ( ( ( rule__Strategy__TrainingTestAssignment_0 ) ) | ( ( rule__Strategy__CrossValidationAssignment_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyst.g:264:2: ( ( rule__Strategy__TrainingTestAssignment_0 ) )
                    {
                    // InternalMyst.g:264:2: ( ( rule__Strategy__TrainingTestAssignment_0 ) )
                    // InternalMyst.g:265:3: ( rule__Strategy__TrainingTestAssignment_0 )
                    {
                     before(grammarAccess.getStrategyAccess().getTrainingTestAssignment_0()); 
                    // InternalMyst.g:266:3: ( rule__Strategy__TrainingTestAssignment_0 )
                    // InternalMyst.g:266:4: rule__Strategy__TrainingTestAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Strategy__TrainingTestAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStrategyAccess().getTrainingTestAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyst.g:270:2: ( ( rule__Strategy__CrossValidationAssignment_1 ) )
                    {
                    // InternalMyst.g:270:2: ( ( rule__Strategy__CrossValidationAssignment_1 ) )
                    // InternalMyst.g:271:3: ( rule__Strategy__CrossValidationAssignment_1 )
                    {
                     before(grammarAccess.getStrategyAccess().getCrossValidationAssignment_1()); 
                    // InternalMyst.g:272:3: ( rule__Strategy__CrossValidationAssignment_1 )
                    // InternalMyst.g:272:4: rule__Strategy__CrossValidationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Strategy__CrossValidationAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStrategyAccess().getCrossValidationAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__Alternatives"


    // $ANTLR start "rule__Algorithm__Alternatives"
    // InternalMyst.g:280:1: rule__Algorithm__Alternatives : ( ( ( 'linearDiscriminantAnalysis' ) ) | ( ( 'supportVectorMachines' ) ) | ( ( 'quadraticDiscriminantAnalysis' ) ) | ( ( 'kernelEstimation' ) ) | ( ( 'boosting' ) ) | ( ( 'decisionTree' ) ) | ( ( 'neutralNetwork' ) ) | ( ( 'learningVectorQuantization' ) ) );
    public final void rule__Algorithm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:284:1: ( ( ( 'linearDiscriminantAnalysis' ) ) | ( ( 'supportVectorMachines' ) ) | ( ( 'quadraticDiscriminantAnalysis' ) ) | ( ( 'kernelEstimation' ) ) | ( ( 'boosting' ) ) | ( ( 'decisionTree' ) ) | ( ( 'neutralNetwork' ) ) | ( ( 'learningVectorQuantization' ) ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            case 17:
                {
                alt2=6;
                }
                break;
            case 18:
                {
                alt2=7;
                }
                break;
            case 19:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyst.g:285:2: ( ( 'linearDiscriminantAnalysis' ) )
                    {
                    // InternalMyst.g:285:2: ( ( 'linearDiscriminantAnalysis' ) )
                    // InternalMyst.g:286:3: ( 'linearDiscriminantAnalysis' )
                    {
                     before(grammarAccess.getAlgorithmAccess().getLinearDiscriminantAnalysisEnumLiteralDeclaration_0()); 
                    // InternalMyst.g:287:3: ( 'linearDiscriminantAnalysis' )
                    // InternalMyst.g:287:4: 'linearDiscriminantAnalysis'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgorithmAccess().getLinearDiscriminantAnalysisEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyst.g:291:2: ( ( 'supportVectorMachines' ) )
                    {
                    // InternalMyst.g:291:2: ( ( 'supportVectorMachines' ) )
                    // InternalMyst.g:292:3: ( 'supportVectorMachines' )
                    {
                     before(grammarAccess.getAlgorithmAccess().getSupportVectorMachinesEnumLiteralDeclaration_1()); 
                    // InternalMyst.g:293:3: ( 'supportVectorMachines' )
                    // InternalMyst.g:293:4: 'supportVectorMachines'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgorithmAccess().getSupportVectorMachinesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyst.g:297:2: ( ( 'quadraticDiscriminantAnalysis' ) )
                    {
                    // InternalMyst.g:297:2: ( ( 'quadraticDiscriminantAnalysis' ) )
                    // InternalMyst.g:298:3: ( 'quadraticDiscriminantAnalysis' )
                    {
                     before(grammarAccess.getAlgorithmAccess().getQuadraticDiscriminantAnalysisEnumLiteralDeclaration_2()); 
                    // InternalMyst.g:299:3: ( 'quadraticDiscriminantAnalysis' )
                    // InternalMyst.g:299:4: 'quadraticDiscriminantAnalysis'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgorithmAccess().getQuadraticDiscriminantAnalysisEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyst.g:303:2: ( ( 'kernelEstimation' ) )
                    {
                    // InternalMyst.g:303:2: ( ( 'kernelEstimation' ) )
                    // InternalMyst.g:304:3: ( 'kernelEstimation' )
                    {
                     before(grammarAccess.getAlgorithmAccess().getKernelEstimationEnumLiteralDeclaration_3()); 
                    // InternalMyst.g:305:3: ( 'kernelEstimation' )
                    // InternalMyst.g:305:4: 'kernelEstimation'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgorithmAccess().getKernelEstimationEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyst.g:309:2: ( ( 'boosting' ) )
                    {
                    // InternalMyst.g:309:2: ( ( 'boosting' ) )
                    // InternalMyst.g:310:3: ( 'boosting' )
                    {
                     before(grammarAccess.getAlgorithmAccess().getBoostingEnumLiteralDeclaration_4()); 
                    // InternalMyst.g:311:3: ( 'boosting' )
                    // InternalMyst.g:311:4: 'boosting'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgorithmAccess().getBoostingEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyst.g:315:2: ( ( 'decisionTree' ) )
                    {
                    // InternalMyst.g:315:2: ( ( 'decisionTree' ) )
                    // InternalMyst.g:316:3: ( 'decisionTree' )
                    {
                     before(grammarAccess.getAlgorithmAccess().getDecisionTreeEnumLiteralDeclaration_5()); 
                    // InternalMyst.g:317:3: ( 'decisionTree' )
                    // InternalMyst.g:317:4: 'decisionTree'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgorithmAccess().getDecisionTreeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyst.g:321:2: ( ( 'neutralNetwork' ) )
                    {
                    // InternalMyst.g:321:2: ( ( 'neutralNetwork' ) )
                    // InternalMyst.g:322:3: ( 'neutralNetwork' )
                    {
                     before(grammarAccess.getAlgorithmAccess().getNeutralNetworkEnumLiteralDeclaration_6()); 
                    // InternalMyst.g:323:3: ( 'neutralNetwork' )
                    // InternalMyst.g:323:4: 'neutralNetwork'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgorithmAccess().getNeutralNetworkEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyst.g:327:2: ( ( 'learningVectorQuantization' ) )
                    {
                    // InternalMyst.g:327:2: ( ( 'learningVectorQuantization' ) )
                    // InternalMyst.g:328:3: ( 'learningVectorQuantization' )
                    {
                     before(grammarAccess.getAlgorithmAccess().getLearningVectorQuantizationEnumLiteralDeclaration_7()); 
                    // InternalMyst.g:329:3: ( 'learningVectorQuantization' )
                    // InternalMyst.g:329:4: 'learningVectorQuantization'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getAlgorithmAccess().getLearningVectorQuantizationEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithm__Alternatives"


    // $ANTLR start "rule__Metric__Alternatives"
    // InternalMyst.g:337:1: rule__Metric__Alternatives : ( ( ( 'showAccuracy' ) ) | ( ( 'showRecall' ) ) | ( ( 'showFMeasure' ) ) | ( ( 'showPrecision' ) ) | ( ( 'showBalancedAccuracyScore' ) ) | ( ( 'showHammingLoss' ) ) | ( ( 'showJaccardScore' ) ) | ( ( 'showMatthewsCorrCoef' ) ) | ( ( 'showZeroOneLoss' ) ) );
    public final void rule__Metric__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:341:1: ( ( ( 'showAccuracy' ) ) | ( ( 'showRecall' ) ) | ( ( 'showFMeasure' ) ) | ( ( 'showPrecision' ) ) | ( ( 'showBalancedAccuracyScore' ) ) | ( ( 'showHammingLoss' ) ) | ( ( 'showJaccardScore' ) ) | ( ( 'showMatthewsCorrCoef' ) ) | ( ( 'showZeroOneLoss' ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 23:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            case 25:
                {
                alt3=6;
                }
                break;
            case 26:
                {
                alt3=7;
                }
                break;
            case 27:
                {
                alt3=8;
                }
                break;
            case 28:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyst.g:342:2: ( ( 'showAccuracy' ) )
                    {
                    // InternalMyst.g:342:2: ( ( 'showAccuracy' ) )
                    // InternalMyst.g:343:3: ( 'showAccuracy' )
                    {
                     before(grammarAccess.getMetricAccess().getAccuracyEnumLiteralDeclaration_0()); 
                    // InternalMyst.g:344:3: ( 'showAccuracy' )
                    // InternalMyst.g:344:4: 'showAccuracy'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getMetricAccess().getAccuracyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyst.g:348:2: ( ( 'showRecall' ) )
                    {
                    // InternalMyst.g:348:2: ( ( 'showRecall' ) )
                    // InternalMyst.g:349:3: ( 'showRecall' )
                    {
                     before(grammarAccess.getMetricAccess().getRecallEnumLiteralDeclaration_1()); 
                    // InternalMyst.g:350:3: ( 'showRecall' )
                    // InternalMyst.g:350:4: 'showRecall'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getMetricAccess().getRecallEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyst.g:354:2: ( ( 'showFMeasure' ) )
                    {
                    // InternalMyst.g:354:2: ( ( 'showFMeasure' ) )
                    // InternalMyst.g:355:3: ( 'showFMeasure' )
                    {
                     before(grammarAccess.getMetricAccess().getMeasureEnumLiteralDeclaration_2()); 
                    // InternalMyst.g:356:3: ( 'showFMeasure' )
                    // InternalMyst.g:356:4: 'showFMeasure'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getMetricAccess().getMeasureEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyst.g:360:2: ( ( 'showPrecision' ) )
                    {
                    // InternalMyst.g:360:2: ( ( 'showPrecision' ) )
                    // InternalMyst.g:361:3: ( 'showPrecision' )
                    {
                     before(grammarAccess.getMetricAccess().getPrecisionEnumLiteralDeclaration_3()); 
                    // InternalMyst.g:362:3: ( 'showPrecision' )
                    // InternalMyst.g:362:4: 'showPrecision'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getMetricAccess().getPrecisionEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyst.g:366:2: ( ( 'showBalancedAccuracyScore' ) )
                    {
                    // InternalMyst.g:366:2: ( ( 'showBalancedAccuracyScore' ) )
                    // InternalMyst.g:367:3: ( 'showBalancedAccuracyScore' )
                    {
                     before(grammarAccess.getMetricAccess().getBalancedAccuracyScoreEnumLiteralDeclaration_4()); 
                    // InternalMyst.g:368:3: ( 'showBalancedAccuracyScore' )
                    // InternalMyst.g:368:4: 'showBalancedAccuracyScore'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMetricAccess().getBalancedAccuracyScoreEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyst.g:372:2: ( ( 'showHammingLoss' ) )
                    {
                    // InternalMyst.g:372:2: ( ( 'showHammingLoss' ) )
                    // InternalMyst.g:373:3: ( 'showHammingLoss' )
                    {
                     before(grammarAccess.getMetricAccess().getHammingLossEnumLiteralDeclaration_5()); 
                    // InternalMyst.g:374:3: ( 'showHammingLoss' )
                    // InternalMyst.g:374:4: 'showHammingLoss'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMetricAccess().getHammingLossEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyst.g:378:2: ( ( 'showJaccardScore' ) )
                    {
                    // InternalMyst.g:378:2: ( ( 'showJaccardScore' ) )
                    // InternalMyst.g:379:3: ( 'showJaccardScore' )
                    {
                     before(grammarAccess.getMetricAccess().getJaccardScoreEnumLiteralDeclaration_6()); 
                    // InternalMyst.g:380:3: ( 'showJaccardScore' )
                    // InternalMyst.g:380:4: 'showJaccardScore'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMetricAccess().getJaccardScoreEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyst.g:384:2: ( ( 'showMatthewsCorrCoef' ) )
                    {
                    // InternalMyst.g:384:2: ( ( 'showMatthewsCorrCoef' ) )
                    // InternalMyst.g:385:3: ( 'showMatthewsCorrCoef' )
                    {
                     before(grammarAccess.getMetricAccess().getMatthewsCorrCoefEnumLiteralDeclaration_7()); 
                    // InternalMyst.g:386:3: ( 'showMatthewsCorrCoef' )
                    // InternalMyst.g:386:4: 'showMatthewsCorrCoef'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMetricAccess().getMatthewsCorrCoefEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyst.g:390:2: ( ( 'showZeroOneLoss' ) )
                    {
                    // InternalMyst.g:390:2: ( ( 'showZeroOneLoss' ) )
                    // InternalMyst.g:391:3: ( 'showZeroOneLoss' )
                    {
                     before(grammarAccess.getMetricAccess().getZeroOneLossEnumLiteralDeclaration_8()); 
                    // InternalMyst.g:392:3: ( 'showZeroOneLoss' )
                    // InternalMyst.g:392:4: 'showZeroOneLoss'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMetricAccess().getZeroOneLossEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Metric__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMyst.g:400:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:404:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMyst.g:405:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMyst.g:412:1: rule__Program__Group__0__Impl : ( ( rule__Program__CsvAssignment_0 ) ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:416:1: ( ( ( rule__Program__CsvAssignment_0 ) ) )
            // InternalMyst.g:417:1: ( ( rule__Program__CsvAssignment_0 ) )
            {
            // InternalMyst.g:417:1: ( ( rule__Program__CsvAssignment_0 ) )
            // InternalMyst.g:418:2: ( rule__Program__CsvAssignment_0 )
            {
             before(grammarAccess.getProgramAccess().getCsvAssignment_0()); 
            // InternalMyst.g:419:2: ( rule__Program__CsvAssignment_0 )
            // InternalMyst.g:419:3: rule__Program__CsvAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__CsvAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getCsvAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMyst.g:427:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:431:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMyst.g:432:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMyst.g:439:1: rule__Program__Group__1__Impl : ( ( rule__Program__ParseAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:443:1: ( ( ( rule__Program__ParseAssignment_1 ) ) )
            // InternalMyst.g:444:1: ( ( rule__Program__ParseAssignment_1 ) )
            {
            // InternalMyst.g:444:1: ( ( rule__Program__ParseAssignment_1 ) )
            // InternalMyst.g:445:2: ( rule__Program__ParseAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getParseAssignment_1()); 
            // InternalMyst.g:446:2: ( rule__Program__ParseAssignment_1 )
            // InternalMyst.g:446:3: rule__Program__ParseAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__ParseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getParseAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Program__Group__2"
    // InternalMyst.g:454:1: rule__Program__Group__2 : rule__Program__Group__2__Impl rule__Program__Group__3 ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:458:1: ( rule__Program__Group__2__Impl rule__Program__Group__3 )
            // InternalMyst.g:459:2: rule__Program__Group__2__Impl rule__Program__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalMyst.g:466:1: rule__Program__Group__2__Impl : ( ( rule__Program__CalculAssignment_2 ) ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:470:1: ( ( ( rule__Program__CalculAssignment_2 ) ) )
            // InternalMyst.g:471:1: ( ( rule__Program__CalculAssignment_2 ) )
            {
            // InternalMyst.g:471:1: ( ( rule__Program__CalculAssignment_2 ) )
            // InternalMyst.g:472:2: ( rule__Program__CalculAssignment_2 )
            {
             before(grammarAccess.getProgramAccess().getCalculAssignment_2()); 
            // InternalMyst.g:473:2: ( rule__Program__CalculAssignment_2 )
            // InternalMyst.g:473:3: rule__Program__CalculAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Program__CalculAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getCalculAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__Program__Group__3"
    // InternalMyst.g:481:1: rule__Program__Group__3 : rule__Program__Group__3__Impl ;
    public final void rule__Program__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:485:1: ( rule__Program__Group__3__Impl )
            // InternalMyst.g:486:2: rule__Program__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3"


    // $ANTLR start "rule__Program__Group__3__Impl"
    // InternalMyst.g:492:1: rule__Program__Group__3__Impl : ( ( rule__Program__MetricAssignment_3 ) ) ;
    public final void rule__Program__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:496:1: ( ( ( rule__Program__MetricAssignment_3 ) ) )
            // InternalMyst.g:497:1: ( ( rule__Program__MetricAssignment_3 ) )
            {
            // InternalMyst.g:497:1: ( ( rule__Program__MetricAssignment_3 ) )
            // InternalMyst.g:498:2: ( rule__Program__MetricAssignment_3 )
            {
             before(grammarAccess.getProgramAccess().getMetricAssignment_3()); 
            // InternalMyst.g:499:2: ( rule__Program__MetricAssignment_3 )
            // InternalMyst.g:499:3: rule__Program__MetricAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Program__MetricAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getMetricAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__3__Impl"


    // $ANTLR start "rule__CSV__Group__0"
    // InternalMyst.g:508:1: rule__CSV__Group__0 : rule__CSV__Group__0__Impl rule__CSV__Group__1 ;
    public final void rule__CSV__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:512:1: ( rule__CSV__Group__0__Impl rule__CSV__Group__1 )
            // InternalMyst.g:513:2: rule__CSV__Group__0__Impl rule__CSV__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CSV__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CSV__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSV__Group__0"


    // $ANTLR start "rule__CSV__Group__0__Impl"
    // InternalMyst.g:520:1: rule__CSV__Group__0__Impl : ( 'CSV' ) ;
    public final void rule__CSV__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:524:1: ( ( 'CSV' ) )
            // InternalMyst.g:525:1: ( 'CSV' )
            {
            // InternalMyst.g:525:1: ( 'CSV' )
            // InternalMyst.g:526:2: 'CSV'
            {
             before(grammarAccess.getCSVAccess().getCSVKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCSVAccess().getCSVKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSV__Group__0__Impl"


    // $ANTLR start "rule__CSV__Group__1"
    // InternalMyst.g:535:1: rule__CSV__Group__1 : rule__CSV__Group__1__Impl ;
    public final void rule__CSV__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:539:1: ( rule__CSV__Group__1__Impl )
            // InternalMyst.g:540:2: rule__CSV__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CSV__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSV__Group__1"


    // $ANTLR start "rule__CSV__Group__1__Impl"
    // InternalMyst.g:546:1: rule__CSV__Group__1__Impl : ( ( rule__CSV__CvsfileAssignment_1 ) ) ;
    public final void rule__CSV__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:550:1: ( ( ( rule__CSV__CvsfileAssignment_1 ) ) )
            // InternalMyst.g:551:1: ( ( rule__CSV__CvsfileAssignment_1 ) )
            {
            // InternalMyst.g:551:1: ( ( rule__CSV__CvsfileAssignment_1 ) )
            // InternalMyst.g:552:2: ( rule__CSV__CvsfileAssignment_1 )
            {
             before(grammarAccess.getCSVAccess().getCvsfileAssignment_1()); 
            // InternalMyst.g:553:2: ( rule__CSV__CvsfileAssignment_1 )
            // InternalMyst.g:553:3: rule__CSV__CvsfileAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CSV__CvsfileAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCSVAccess().getCvsfileAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSV__Group__1__Impl"


    // $ANTLR start "rule__Parse__Group__0"
    // InternalMyst.g:562:1: rule__Parse__Group__0 : rule__Parse__Group__0__Impl rule__Parse__Group__1 ;
    public final void rule__Parse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:566:1: ( rule__Parse__Group__0__Impl rule__Parse__Group__1 )
            // InternalMyst.g:567:2: rule__Parse__Group__0__Impl rule__Parse__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Parse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parse__Group__0"


    // $ANTLR start "rule__Parse__Group__0__Impl"
    // InternalMyst.g:574:1: rule__Parse__Group__0__Impl : ( 'parse' ) ;
    public final void rule__Parse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:578:1: ( ( 'parse' ) )
            // InternalMyst.g:579:1: ( 'parse' )
            {
            // InternalMyst.g:579:1: ( 'parse' )
            // InternalMyst.g:580:2: 'parse'
            {
             before(grammarAccess.getParseAccess().getParseKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getParseAccess().getParseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parse__Group__0__Impl"


    // $ANTLR start "rule__Parse__Group__1"
    // InternalMyst.g:589:1: rule__Parse__Group__1 : rule__Parse__Group__1__Impl ;
    public final void rule__Parse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:593:1: ( rule__Parse__Group__1__Impl )
            // InternalMyst.g:594:2: rule__Parse__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parse__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parse__Group__1"


    // $ANTLR start "rule__Parse__Group__1__Impl"
    // InternalMyst.g:600:1: rule__Parse__Group__1__Impl : ( ( rule__Parse__VariableCibleAssignment_1 )? ) ;
    public final void rule__Parse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:604:1: ( ( ( rule__Parse__VariableCibleAssignment_1 )? ) )
            // InternalMyst.g:605:1: ( ( rule__Parse__VariableCibleAssignment_1 )? )
            {
            // InternalMyst.g:605:1: ( ( rule__Parse__VariableCibleAssignment_1 )? )
            // InternalMyst.g:606:2: ( rule__Parse__VariableCibleAssignment_1 )?
            {
             before(grammarAccess.getParseAccess().getVariableCibleAssignment_1()); 
            // InternalMyst.g:607:2: ( rule__Parse__VariableCibleAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyst.g:607:3: rule__Parse__VariableCibleAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parse__VariableCibleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParseAccess().getVariableCibleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parse__Group__1__Impl"


    // $ANTLR start "rule__Calcul__Group__0"
    // InternalMyst.g:616:1: rule__Calcul__Group__0 : rule__Calcul__Group__0__Impl rule__Calcul__Group__1 ;
    public final void rule__Calcul__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:620:1: ( rule__Calcul__Group__0__Impl rule__Calcul__Group__1 )
            // InternalMyst.g:621:2: rule__Calcul__Group__0__Impl rule__Calcul__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Calcul__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calcul__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calcul__Group__0"


    // $ANTLR start "rule__Calcul__Group__0__Impl"
    // InternalMyst.g:628:1: rule__Calcul__Group__0__Impl : ( ( rule__Calcul__StrategyAssignment_0 ) ) ;
    public final void rule__Calcul__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:632:1: ( ( ( rule__Calcul__StrategyAssignment_0 ) ) )
            // InternalMyst.g:633:1: ( ( rule__Calcul__StrategyAssignment_0 ) )
            {
            // InternalMyst.g:633:1: ( ( rule__Calcul__StrategyAssignment_0 ) )
            // InternalMyst.g:634:2: ( rule__Calcul__StrategyAssignment_0 )
            {
             before(grammarAccess.getCalculAccess().getStrategyAssignment_0()); 
            // InternalMyst.g:635:2: ( rule__Calcul__StrategyAssignment_0 )
            // InternalMyst.g:635:3: rule__Calcul__StrategyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Calcul__StrategyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCalculAccess().getStrategyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calcul__Group__0__Impl"


    // $ANTLR start "rule__Calcul__Group__1"
    // InternalMyst.g:643:1: rule__Calcul__Group__1 : rule__Calcul__Group__1__Impl rule__Calcul__Group__2 ;
    public final void rule__Calcul__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:647:1: ( rule__Calcul__Group__1__Impl rule__Calcul__Group__2 )
            // InternalMyst.g:648:2: rule__Calcul__Group__1__Impl rule__Calcul__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Calcul__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calcul__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calcul__Group__1"


    // $ANTLR start "rule__Calcul__Group__1__Impl"
    // InternalMyst.g:655:1: rule__Calcul__Group__1__Impl : ( ',' ) ;
    public final void rule__Calcul__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:659:1: ( ( ',' ) )
            // InternalMyst.g:660:1: ( ',' )
            {
            // InternalMyst.g:660:1: ( ',' )
            // InternalMyst.g:661:2: ','
            {
             before(grammarAccess.getCalculAccess().getCommaKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCalculAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calcul__Group__1__Impl"


    // $ANTLR start "rule__Calcul__Group__2"
    // InternalMyst.g:670:1: rule__Calcul__Group__2 : rule__Calcul__Group__2__Impl ;
    public final void rule__Calcul__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:674:1: ( rule__Calcul__Group__2__Impl )
            // InternalMyst.g:675:2: rule__Calcul__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calcul__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calcul__Group__2"


    // $ANTLR start "rule__Calcul__Group__2__Impl"
    // InternalMyst.g:681:1: rule__Calcul__Group__2__Impl : ( ( rule__Calcul__AlgorithmAssignment_2 ) ) ;
    public final void rule__Calcul__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:685:1: ( ( ( rule__Calcul__AlgorithmAssignment_2 ) ) )
            // InternalMyst.g:686:1: ( ( rule__Calcul__AlgorithmAssignment_2 ) )
            {
            // InternalMyst.g:686:1: ( ( rule__Calcul__AlgorithmAssignment_2 ) )
            // InternalMyst.g:687:2: ( rule__Calcul__AlgorithmAssignment_2 )
            {
             before(grammarAccess.getCalculAccess().getAlgorithmAssignment_2()); 
            // InternalMyst.g:688:2: ( rule__Calcul__AlgorithmAssignment_2 )
            // InternalMyst.g:688:3: rule__Calcul__AlgorithmAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Calcul__AlgorithmAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCalculAccess().getAlgorithmAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calcul__Group__2__Impl"


    // $ANTLR start "rule__TrainingTest__Group__0"
    // InternalMyst.g:697:1: rule__TrainingTest__Group__0 : rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1 ;
    public final void rule__TrainingTest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:701:1: ( rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1 )
            // InternalMyst.g:702:2: rule__TrainingTest__Group__0__Impl rule__TrainingTest__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__TrainingTest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__0"


    // $ANTLR start "rule__TrainingTest__Group__0__Impl"
    // InternalMyst.g:709:1: rule__TrainingTest__Group__0__Impl : ( 'trainingTest' ) ;
    public final void rule__TrainingTest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:713:1: ( ( 'trainingTest' ) )
            // InternalMyst.g:714:1: ( 'trainingTest' )
            {
            // InternalMyst.g:714:1: ( 'trainingTest' )
            // InternalMyst.g:715:2: 'trainingTest'
            {
             before(grammarAccess.getTrainingTestAccess().getTrainingTestKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getTrainingTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__0__Impl"


    // $ANTLR start "rule__TrainingTest__Group__1"
    // InternalMyst.g:724:1: rule__TrainingTest__Group__1 : rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2 ;
    public final void rule__TrainingTest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:728:1: ( rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2 )
            // InternalMyst.g:729:2: rule__TrainingTest__Group__1__Impl rule__TrainingTest__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__TrainingTest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__1"


    // $ANTLR start "rule__TrainingTest__Group__1__Impl"
    // InternalMyst.g:736:1: rule__TrainingTest__Group__1__Impl : ( ',' ) ;
    public final void rule__TrainingTest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:740:1: ( ( ',' ) )
            // InternalMyst.g:741:1: ( ',' )
            {
            // InternalMyst.g:741:1: ( ',' )
            // InternalMyst.g:742:2: ','
            {
             before(grammarAccess.getTrainingTestAccess().getCommaKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__1__Impl"


    // $ANTLR start "rule__TrainingTest__Group__2"
    // InternalMyst.g:751:1: rule__TrainingTest__Group__2 : rule__TrainingTest__Group__2__Impl ;
    public final void rule__TrainingTest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:755:1: ( rule__TrainingTest__Group__2__Impl )
            // InternalMyst.g:756:2: rule__TrainingTest__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__2"


    // $ANTLR start "rule__TrainingTest__Group__2__Impl"
    // InternalMyst.g:762:1: rule__TrainingTest__Group__2__Impl : ( ( rule__TrainingTest__TestRateAssignment_2 ) ) ;
    public final void rule__TrainingTest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:766:1: ( ( ( rule__TrainingTest__TestRateAssignment_2 ) ) )
            // InternalMyst.g:767:1: ( ( rule__TrainingTest__TestRateAssignment_2 ) )
            {
            // InternalMyst.g:767:1: ( ( rule__TrainingTest__TestRateAssignment_2 ) )
            // InternalMyst.g:768:2: ( rule__TrainingTest__TestRateAssignment_2 )
            {
             before(grammarAccess.getTrainingTestAccess().getTestRateAssignment_2()); 
            // InternalMyst.g:769:2: ( rule__TrainingTest__TestRateAssignment_2 )
            // InternalMyst.g:769:3: rule__TrainingTest__TestRateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TrainingTest__TestRateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingTestAccess().getTestRateAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__Group__2__Impl"


    // $ANTLR start "rule__Program__CsvAssignment_0"
    // InternalMyst.g:778:1: rule__Program__CsvAssignment_0 : ( ruleCSV ) ;
    public final void rule__Program__CsvAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:782:1: ( ( ruleCSV ) )
            // InternalMyst.g:783:2: ( ruleCSV )
            {
            // InternalMyst.g:783:2: ( ruleCSV )
            // InternalMyst.g:784:3: ruleCSV
            {
             before(grammarAccess.getProgramAccess().getCsvCSVParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCSV();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getCsvCSVParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__CsvAssignment_0"


    // $ANTLR start "rule__Program__ParseAssignment_1"
    // InternalMyst.g:793:1: rule__Program__ParseAssignment_1 : ( ruleParse ) ;
    public final void rule__Program__ParseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:797:1: ( ( ruleParse ) )
            // InternalMyst.g:798:2: ( ruleParse )
            {
            // InternalMyst.g:798:2: ( ruleParse )
            // InternalMyst.g:799:3: ruleParse
            {
             before(grammarAccess.getProgramAccess().getParseParseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParse();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getParseParseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ParseAssignment_1"


    // $ANTLR start "rule__Program__CalculAssignment_2"
    // InternalMyst.g:808:1: rule__Program__CalculAssignment_2 : ( ruleCalcul ) ;
    public final void rule__Program__CalculAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:812:1: ( ( ruleCalcul ) )
            // InternalMyst.g:813:2: ( ruleCalcul )
            {
            // InternalMyst.g:813:2: ( ruleCalcul )
            // InternalMyst.g:814:3: ruleCalcul
            {
             before(grammarAccess.getProgramAccess().getCalculCalculParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCalcul();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getCalculCalculParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__CalculAssignment_2"


    // $ANTLR start "rule__Program__MetricAssignment_3"
    // InternalMyst.g:823:1: rule__Program__MetricAssignment_3 : ( ruleMetric ) ;
    public final void rule__Program__MetricAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:827:1: ( ( ruleMetric ) )
            // InternalMyst.g:828:2: ( ruleMetric )
            {
            // InternalMyst.g:828:2: ( ruleMetric )
            // InternalMyst.g:829:3: ruleMetric
            {
             before(grammarAccess.getProgramAccess().getMetricMetricEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMetric();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getMetricMetricEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__MetricAssignment_3"


    // $ANTLR start "rule__CSV__CvsfileAssignment_1"
    // InternalMyst.g:838:1: rule__CSV__CvsfileAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CSV__CvsfileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:842:1: ( ( RULE_STRING ) )
            // InternalMyst.g:843:2: ( RULE_STRING )
            {
            // InternalMyst.g:843:2: ( RULE_STRING )
            // InternalMyst.g:844:3: RULE_STRING
            {
             before(grammarAccess.getCSVAccess().getCvsfileSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCSVAccess().getCvsfileSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSV__CvsfileAssignment_1"


    // $ANTLR start "rule__Parse__VariableCibleAssignment_1"
    // InternalMyst.g:853:1: rule__Parse__VariableCibleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Parse__VariableCibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:857:1: ( ( RULE_STRING ) )
            // InternalMyst.g:858:2: ( RULE_STRING )
            {
            // InternalMyst.g:858:2: ( RULE_STRING )
            // InternalMyst.g:859:3: RULE_STRING
            {
             before(grammarAccess.getParseAccess().getVariableCibleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParseAccess().getVariableCibleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parse__VariableCibleAssignment_1"


    // $ANTLR start "rule__Calcul__StrategyAssignment_0"
    // InternalMyst.g:868:1: rule__Calcul__StrategyAssignment_0 : ( ruleStrategy ) ;
    public final void rule__Calcul__StrategyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:872:1: ( ( ruleStrategy ) )
            // InternalMyst.g:873:2: ( ruleStrategy )
            {
            // InternalMyst.g:873:2: ( ruleStrategy )
            // InternalMyst.g:874:3: ruleStrategy
            {
             before(grammarAccess.getCalculAccess().getStrategyStrategyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStrategy();

            state._fsp--;

             after(grammarAccess.getCalculAccess().getStrategyStrategyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calcul__StrategyAssignment_0"


    // $ANTLR start "rule__Calcul__AlgorithmAssignment_2"
    // InternalMyst.g:883:1: rule__Calcul__AlgorithmAssignment_2 : ( ruleAlgorithm ) ;
    public final void rule__Calcul__AlgorithmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:887:1: ( ( ruleAlgorithm ) )
            // InternalMyst.g:888:2: ( ruleAlgorithm )
            {
            // InternalMyst.g:888:2: ( ruleAlgorithm )
            // InternalMyst.g:889:3: ruleAlgorithm
            {
             before(grammarAccess.getCalculAccess().getAlgorithmAlgorithmEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgorithm();

            state._fsp--;

             after(grammarAccess.getCalculAccess().getAlgorithmAlgorithmEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calcul__AlgorithmAssignment_2"


    // $ANTLR start "rule__Strategy__TrainingTestAssignment_0"
    // InternalMyst.g:898:1: rule__Strategy__TrainingTestAssignment_0 : ( ruleTrainingTest ) ;
    public final void rule__Strategy__TrainingTestAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:902:1: ( ( ruleTrainingTest ) )
            // InternalMyst.g:903:2: ( ruleTrainingTest )
            {
            // InternalMyst.g:903:2: ( ruleTrainingTest )
            // InternalMyst.g:904:3: ruleTrainingTest
            {
             before(grammarAccess.getStrategyAccess().getTrainingTestTrainingTestParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTrainingTest();

            state._fsp--;

             after(grammarAccess.getStrategyAccess().getTrainingTestTrainingTestParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__TrainingTestAssignment_0"


    // $ANTLR start "rule__Strategy__CrossValidationAssignment_1"
    // InternalMyst.g:913:1: rule__Strategy__CrossValidationAssignment_1 : ( ruleCrossValidation ) ;
    public final void rule__Strategy__CrossValidationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:917:1: ( ( ruleCrossValidation ) )
            // InternalMyst.g:918:2: ( ruleCrossValidation )
            {
            // InternalMyst.g:918:2: ( ruleCrossValidation )
            // InternalMyst.g:919:3: ruleCrossValidation
            {
             before(grammarAccess.getStrategyAccess().getCrossValidationCrossValidationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCrossValidation();

            state._fsp--;

             after(grammarAccess.getStrategyAccess().getCrossValidationCrossValidationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strategy__CrossValidationAssignment_1"


    // $ANTLR start "rule__CrossValidation__MotcleAssignment"
    // InternalMyst.g:928:1: rule__CrossValidation__MotcleAssignment : ( ( 'crossValidation' ) ) ;
    public final void rule__CrossValidation__MotcleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:932:1: ( ( ( 'crossValidation' ) ) )
            // InternalMyst.g:933:2: ( ( 'crossValidation' ) )
            {
            // InternalMyst.g:933:2: ( ( 'crossValidation' ) )
            // InternalMyst.g:934:3: ( 'crossValidation' )
            {
             before(grammarAccess.getCrossValidationAccess().getMotcleCrossValidationKeyword_0()); 
            // InternalMyst.g:935:3: ( 'crossValidation' )
            // InternalMyst.g:936:4: 'crossValidation'
            {
             before(grammarAccess.getCrossValidationAccess().getMotcleCrossValidationKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCrossValidationAccess().getMotcleCrossValidationKeyword_0()); 

            }

             after(grammarAccess.getCrossValidationAccess().getMotcleCrossValidationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CrossValidation__MotcleAssignment"


    // $ANTLR start "rule__TrainingTest__TestRateAssignment_2"
    // InternalMyst.g:947:1: rule__TrainingTest__TestRateAssignment_2 : ( RULE_POURCENTAGE_TEST ) ;
    public final void rule__TrainingTest__TestRateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyst.g:951:1: ( ( RULE_POURCENTAGE_TEST ) )
            // InternalMyst.g:952:2: ( RULE_POURCENTAGE_TEST )
            {
            // InternalMyst.g:952:2: ( RULE_POURCENTAGE_TEST )
            // InternalMyst.g:953:3: RULE_POURCENTAGE_TEST
            {
             before(grammarAccess.getTrainingTestAccess().getTestRatePOURCENTAGE_TESTTerminalRuleCall_2_0()); 
            match(input,RULE_POURCENTAGE_TEST,FOLLOW_2); 
             after(grammarAccess.getTrainingTestAccess().getTestRatePOURCENTAGE_TESTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingTest__TestRateAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000001FF00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000FF000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});

}