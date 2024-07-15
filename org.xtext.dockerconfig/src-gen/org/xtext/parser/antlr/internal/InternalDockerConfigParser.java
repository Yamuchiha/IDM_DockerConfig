package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.DockerConfigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDockerConfigParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Service'", "'{'", "'image'", "'ports'", "','", "'}'", "'volumes'", "'Port'", "'hostPort'", "'containerPort'", "'Volume'", "'hostPath'", "'containerPath'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDockerConfigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDockerConfigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDockerConfigParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDockerConfig.g"; }



     	private DockerConfigGrammarAccess grammarAccess;

        public InternalDockerConfigParser(TokenStream input, DockerConfigGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Service";
       	}

       	@Override
       	protected DockerConfigGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleService"
    // InternalDockerConfig.g:64:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDockerConfig.g:64:48: (iv_ruleService= ruleService EOF )
            // InternalDockerConfig.g:65:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalDockerConfig.g:71:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'image' ( (lv_image_4_0= ruleEString ) ) )? otherlv_5= 'ports' otherlv_6= '{' ( (lv_ports_7_0= rulePort ) ) (otherlv_8= ',' ( (lv_ports_9_0= rulePort ) ) )* otherlv_10= '}' otherlv_11= 'volumes' otherlv_12= '{' ( (lv_volumes_13_0= ruleVolume ) ) (otherlv_14= ',' ( (lv_volumes_15_0= ruleVolume ) ) )* otherlv_16= '}' otherlv_17= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_image_4_0 = null;

        EObject lv_ports_7_0 = null;

        EObject lv_ports_9_0 = null;

        EObject lv_volumes_13_0 = null;

        EObject lv_volumes_15_0 = null;



        	enterRule();

        try {
            // InternalDockerConfig.g:77:2: ( (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'image' ( (lv_image_4_0= ruleEString ) ) )? otherlv_5= 'ports' otherlv_6= '{' ( (lv_ports_7_0= rulePort ) ) (otherlv_8= ',' ( (lv_ports_9_0= rulePort ) ) )* otherlv_10= '}' otherlv_11= 'volumes' otherlv_12= '{' ( (lv_volumes_13_0= ruleVolume ) ) (otherlv_14= ',' ( (lv_volumes_15_0= ruleVolume ) ) )* otherlv_16= '}' otherlv_17= '}' ) )
            // InternalDockerConfig.g:78:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'image' ( (lv_image_4_0= ruleEString ) ) )? otherlv_5= 'ports' otherlv_6= '{' ( (lv_ports_7_0= rulePort ) ) (otherlv_8= ',' ( (lv_ports_9_0= rulePort ) ) )* otherlv_10= '}' otherlv_11= 'volumes' otherlv_12= '{' ( (lv_volumes_13_0= ruleVolume ) ) (otherlv_14= ',' ( (lv_volumes_15_0= ruleVolume ) ) )* otherlv_16= '}' otherlv_17= '}' )
            {
            // InternalDockerConfig.g:78:2: (otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'image' ( (lv_image_4_0= ruleEString ) ) )? otherlv_5= 'ports' otherlv_6= '{' ( (lv_ports_7_0= rulePort ) ) (otherlv_8= ',' ( (lv_ports_9_0= rulePort ) ) )* otherlv_10= '}' otherlv_11= 'volumes' otherlv_12= '{' ( (lv_volumes_13_0= ruleVolume ) ) (otherlv_14= ',' ( (lv_volumes_15_0= ruleVolume ) ) )* otherlv_16= '}' otherlv_17= '}' )
            // InternalDockerConfig.g:79:3: otherlv_0= 'Service' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'image' ( (lv_image_4_0= ruleEString ) ) )? otherlv_5= 'ports' otherlv_6= '{' ( (lv_ports_7_0= rulePort ) ) (otherlv_8= ',' ( (lv_ports_9_0= rulePort ) ) )* otherlv_10= '}' otherlv_11= 'volumes' otherlv_12= '{' ( (lv_volumes_13_0= ruleVolume ) ) (otherlv_14= ',' ( (lv_volumes_15_0= ruleVolume ) ) )* otherlv_16= '}' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalDockerConfig.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalDockerConfig.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalDockerConfig.g:84:4: (lv_name_1_0= ruleEString )
            // InternalDockerConfig.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.DockerConfig.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDockerConfig.g:106:3: (otherlv_3= 'image' ( (lv_image_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDockerConfig.g:107:4: otherlv_3= 'image' ( (lv_image_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getImageKeyword_3_0());
                    			
                    // InternalDockerConfig.g:111:4: ( (lv_image_4_0= ruleEString ) )
                    // InternalDockerConfig.g:112:5: (lv_image_4_0= ruleEString )
                    {
                    // InternalDockerConfig.g:112:5: (lv_image_4_0= ruleEString )
                    // InternalDockerConfig.g:113:6: lv_image_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServiceAccess().getImageEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_image_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceRule());
                    						}
                    						set(
                    							current,
                    							"image",
                    							lv_image_4_0,
                    							"org.xtext.DockerConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getPortsKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalDockerConfig.g:139:3: ( (lv_ports_7_0= rulePort ) )
            // InternalDockerConfig.g:140:4: (lv_ports_7_0= rulePort )
            {
            // InternalDockerConfig.g:140:4: (lv_ports_7_0= rulePort )
            // InternalDockerConfig.g:141:5: lv_ports_7_0= rulePort
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_ports_7_0=rulePort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					add(
            						current,
            						"ports",
            						lv_ports_7_0,
            						"org.xtext.DockerConfig.Port");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDockerConfig.g:158:3: (otherlv_8= ',' ( (lv_ports_9_0= rulePort ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDockerConfig.g:159:4: otherlv_8= ',' ( (lv_ports_9_0= rulePort ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalDockerConfig.g:163:4: ( (lv_ports_9_0= rulePort ) )
            	    // InternalDockerConfig.g:164:5: (lv_ports_9_0= rulePort )
            	    {
            	    // InternalDockerConfig.g:164:5: (lv_ports_9_0= rulePort )
            	    // InternalDockerConfig.g:165:6: lv_ports_9_0= rulePort
            	    {

            	    						newCompositeNode(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_ports_9_0=rulePort();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ports",
            	    							lv_ports_9_0,
            	    							"org.xtext.DockerConfig.Port");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getVolumesKeyword_9());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalDockerConfig.g:195:3: ( (lv_volumes_13_0= ruleVolume ) )
            // InternalDockerConfig.g:196:4: (lv_volumes_13_0= ruleVolume )
            {
            // InternalDockerConfig.g:196:4: (lv_volumes_13_0= ruleVolume )
            // InternalDockerConfig.g:197:5: lv_volumes_13_0= ruleVolume
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getVolumesVolumeParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_8);
            lv_volumes_13_0=ruleVolume();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					add(
            						current,
            						"volumes",
            						lv_volumes_13_0,
            						"org.xtext.DockerConfig.Volume");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDockerConfig.g:214:3: (otherlv_14= ',' ( (lv_volumes_15_0= ruleVolume ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDockerConfig.g:215:4: otherlv_14= ',' ( (lv_volumes_15_0= ruleVolume ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalDockerConfig.g:219:4: ( (lv_volumes_15_0= ruleVolume ) )
            	    // InternalDockerConfig.g:220:5: (lv_volumes_15_0= ruleVolume )
            	    {
            	    // InternalDockerConfig.g:220:5: (lv_volumes_15_0= ruleVolume )
            	    // InternalDockerConfig.g:221:6: lv_volumes_15_0= ruleVolume
            	    {

            	    						newCompositeNode(grammarAccess.getServiceAccess().getVolumesVolumeParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_volumes_15_0=ruleVolume();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getServiceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"volumes",
            	    							lv_volumes_15_0,
            	    							"org.xtext.DockerConfig.Volume");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_17=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleEString"
    // InternalDockerConfig.g:251:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDockerConfig.g:251:47: (iv_ruleEString= ruleEString EOF )
            // InternalDockerConfig.g:252:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDockerConfig.g:258:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDockerConfig.g:264:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDockerConfig.g:265:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDockerConfig.g:265:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDockerConfig.g:266:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDockerConfig.g:274:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePort"
    // InternalDockerConfig.g:285:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalDockerConfig.g:285:45: (iv_rulePort= rulePort EOF )
            // InternalDockerConfig.g:286:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalDockerConfig.g:292:1: rulePort returns [EObject current=null] : ( () otherlv_1= 'Port' otherlv_2= '{' (otherlv_3= 'hostPort' ( (lv_hostPort_4_0= ruleEString ) ) )? (otherlv_5= 'containerPort' ( (lv_containerPort_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_hostPort_4_0 = null;

        AntlrDatatypeRuleToken lv_containerPort_6_0 = null;



        	enterRule();

        try {
            // InternalDockerConfig.g:298:2: ( ( () otherlv_1= 'Port' otherlv_2= '{' (otherlv_3= 'hostPort' ( (lv_hostPort_4_0= ruleEString ) ) )? (otherlv_5= 'containerPort' ( (lv_containerPort_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalDockerConfig.g:299:2: ( () otherlv_1= 'Port' otherlv_2= '{' (otherlv_3= 'hostPort' ( (lv_hostPort_4_0= ruleEString ) ) )? (otherlv_5= 'containerPort' ( (lv_containerPort_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalDockerConfig.g:299:2: ( () otherlv_1= 'Port' otherlv_2= '{' (otherlv_3= 'hostPort' ( (lv_hostPort_4_0= ruleEString ) ) )? (otherlv_5= 'containerPort' ( (lv_containerPort_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalDockerConfig.g:300:3: () otherlv_1= 'Port' otherlv_2= '{' (otherlv_3= 'hostPort' ( (lv_hostPort_4_0= ruleEString ) ) )? (otherlv_5= 'containerPort' ( (lv_containerPort_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalDockerConfig.g:300:3: ()
            // InternalDockerConfig.g:301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPortAccess().getPortAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDockerConfig.g:315:3: (otherlv_3= 'hostPort' ( (lv_hostPort_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDockerConfig.g:316:4: otherlv_3= 'hostPort' ( (lv_hostPort_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPortAccess().getHostPortKeyword_3_0());
                    			
                    // InternalDockerConfig.g:320:4: ( (lv_hostPort_4_0= ruleEString ) )
                    // InternalDockerConfig.g:321:5: (lv_hostPort_4_0= ruleEString )
                    {
                    // InternalDockerConfig.g:321:5: (lv_hostPort_4_0= ruleEString )
                    // InternalDockerConfig.g:322:6: lv_hostPort_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPortAccess().getHostPortEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_hostPort_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPortRule());
                    						}
                    						set(
                    							current,
                    							"hostPort",
                    							lv_hostPort_4_0,
                    							"org.xtext.DockerConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDockerConfig.g:340:3: (otherlv_5= 'containerPort' ( (lv_containerPort_6_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDockerConfig.g:341:4: otherlv_5= 'containerPort' ( (lv_containerPort_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getPortAccess().getContainerPortKeyword_4_0());
                    			
                    // InternalDockerConfig.g:345:4: ( (lv_containerPort_6_0= ruleEString ) )
                    // InternalDockerConfig.g:346:5: (lv_containerPort_6_0= ruleEString )
                    {
                    // InternalDockerConfig.g:346:5: (lv_containerPort_6_0= ruleEString )
                    // InternalDockerConfig.g:347:6: lv_containerPort_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPortAccess().getContainerPortEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_containerPort_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPortRule());
                    						}
                    						set(
                    							current,
                    							"containerPort",
                    							lv_containerPort_6_0,
                    							"org.xtext.DockerConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPortAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleVolume"
    // InternalDockerConfig.g:373:1: entryRuleVolume returns [EObject current=null] : iv_ruleVolume= ruleVolume EOF ;
    public final EObject entryRuleVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolume = null;


        try {
            // InternalDockerConfig.g:373:47: (iv_ruleVolume= ruleVolume EOF )
            // InternalDockerConfig.g:374:2: iv_ruleVolume= ruleVolume EOF
            {
             newCompositeNode(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVolume=ruleVolume();

            state._fsp--;

             current =iv_ruleVolume; 
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
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalDockerConfig.g:380:1: ruleVolume returns [EObject current=null] : ( () otherlv_1= 'Volume' otherlv_2= '{' (otherlv_3= 'hostPath' ( (lv_hostPath_4_0= ruleEString ) ) )? (otherlv_5= 'containerPath' ( (lv_containerPath_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleVolume() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_hostPath_4_0 = null;

        AntlrDatatypeRuleToken lv_containerPath_6_0 = null;



        	enterRule();

        try {
            // InternalDockerConfig.g:386:2: ( ( () otherlv_1= 'Volume' otherlv_2= '{' (otherlv_3= 'hostPath' ( (lv_hostPath_4_0= ruleEString ) ) )? (otherlv_5= 'containerPath' ( (lv_containerPath_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalDockerConfig.g:387:2: ( () otherlv_1= 'Volume' otherlv_2= '{' (otherlv_3= 'hostPath' ( (lv_hostPath_4_0= ruleEString ) ) )? (otherlv_5= 'containerPath' ( (lv_containerPath_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalDockerConfig.g:387:2: ( () otherlv_1= 'Volume' otherlv_2= '{' (otherlv_3= 'hostPath' ( (lv_hostPath_4_0= ruleEString ) ) )? (otherlv_5= 'containerPath' ( (lv_containerPath_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalDockerConfig.g:388:3: () otherlv_1= 'Volume' otherlv_2= '{' (otherlv_3= 'hostPath' ( (lv_hostPath_4_0= ruleEString ) ) )? (otherlv_5= 'containerPath' ( (lv_containerPath_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalDockerConfig.g:388:3: ()
            // InternalDockerConfig.g:389:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVolumeAccess().getVolumeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVolumeAccess().getVolumeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getVolumeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDockerConfig.g:403:3: (otherlv_3= 'hostPath' ( (lv_hostPath_4_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDockerConfig.g:404:4: otherlv_3= 'hostPath' ( (lv_hostPath_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getVolumeAccess().getHostPathKeyword_3_0());
                    			
                    // InternalDockerConfig.g:408:4: ( (lv_hostPath_4_0= ruleEString ) )
                    // InternalDockerConfig.g:409:5: (lv_hostPath_4_0= ruleEString )
                    {
                    // InternalDockerConfig.g:409:5: (lv_hostPath_4_0= ruleEString )
                    // InternalDockerConfig.g:410:6: lv_hostPath_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVolumeAccess().getHostPathEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_hostPath_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVolumeRule());
                    						}
                    						set(
                    							current,
                    							"hostPath",
                    							lv_hostPath_4_0,
                    							"org.xtext.DockerConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDockerConfig.g:428:3: (otherlv_5= 'containerPath' ( (lv_containerPath_6_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDockerConfig.g:429:4: otherlv_5= 'containerPath' ( (lv_containerPath_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getVolumeAccess().getContainerPathKeyword_4_0());
                    			
                    // InternalDockerConfig.g:433:4: ( (lv_containerPath_6_0= ruleEString ) )
                    // InternalDockerConfig.g:434:5: (lv_containerPath_6_0= ruleEString )
                    {
                    // InternalDockerConfig.g:434:5: (lv_containerPath_6_0= ruleEString )
                    // InternalDockerConfig.g:435:6: lv_containerPath_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVolumeAccess().getContainerPathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_containerPath_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVolumeRule());
                    						}
                    						set(
                    							current,
                    							"containerPath",
                    							lv_containerPath_6_0,
                    							"org.xtext.DockerConfig.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVolumeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleVolume"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C10000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000810000L});

}