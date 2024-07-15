package org.xtext.ide.contentassist.antlr.internal;

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
import org.xtext.services.DockerConfigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDockerConfigParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Service'", "'{'", "'ports'", "'}'", "'volumes'", "'image'", "','", "'Port'", "'hostPort'", "'containerPort'", "'Volume'", "'hostPath'", "'containerPath'"
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

    	public void setGrammarAccess(DockerConfigGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleService"
    // InternalDockerConfig.g:53:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalDockerConfig.g:54:1: ( ruleService EOF )
            // InternalDockerConfig.g:55:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalDockerConfig.g:62:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:66:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalDockerConfig.g:67:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalDockerConfig.g:67:2: ( ( rule__Service__Group__0 ) )
            // InternalDockerConfig.g:68:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalDockerConfig.g:69:3: ( rule__Service__Group__0 )
            // InternalDockerConfig.g:69:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleEString"
    // InternalDockerConfig.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDockerConfig.g:79:1: ( ruleEString EOF )
            // InternalDockerConfig.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDockerConfig.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDockerConfig.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDockerConfig.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalDockerConfig.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDockerConfig.g:94:3: ( rule__EString__Alternatives )
            // InternalDockerConfig.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePort"
    // InternalDockerConfig.g:103:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalDockerConfig.g:104:1: ( rulePort EOF )
            // InternalDockerConfig.g:105:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalDockerConfig.g:112:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:116:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalDockerConfig.g:117:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalDockerConfig.g:117:2: ( ( rule__Port__Group__0 ) )
            // InternalDockerConfig.g:118:3: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalDockerConfig.g:119:3: ( rule__Port__Group__0 )
            // InternalDockerConfig.g:119:4: rule__Port__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleVolume"
    // InternalDockerConfig.g:128:1: entryRuleVolume : ruleVolume EOF ;
    public final void entryRuleVolume() throws RecognitionException {
        try {
            // InternalDockerConfig.g:129:1: ( ruleVolume EOF )
            // InternalDockerConfig.g:130:1: ruleVolume EOF
            {
             before(grammarAccess.getVolumeRule()); 
            pushFollow(FOLLOW_1);
            ruleVolume();

            state._fsp--;

             after(grammarAccess.getVolumeRule()); 
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
    // $ANTLR end "entryRuleVolume"


    // $ANTLR start "ruleVolume"
    // InternalDockerConfig.g:137:1: ruleVolume : ( ( rule__Volume__Group__0 ) ) ;
    public final void ruleVolume() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:141:2: ( ( ( rule__Volume__Group__0 ) ) )
            // InternalDockerConfig.g:142:2: ( ( rule__Volume__Group__0 ) )
            {
            // InternalDockerConfig.g:142:2: ( ( rule__Volume__Group__0 ) )
            // InternalDockerConfig.g:143:3: ( rule__Volume__Group__0 )
            {
             before(grammarAccess.getVolumeAccess().getGroup()); 
            // InternalDockerConfig.g:144:3: ( rule__Volume__Group__0 )
            // InternalDockerConfig.g:144:4: rule__Volume__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getGroup()); 

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
    // $ANTLR end "ruleVolume"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDockerConfig.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDockerConfig.g:157:2: ( RULE_STRING )
                    {
                    // InternalDockerConfig.g:157:2: ( RULE_STRING )
                    // InternalDockerConfig.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDockerConfig.g:163:2: ( RULE_ID )
                    {
                    // InternalDockerConfig.g:163:2: ( RULE_ID )
                    // InternalDockerConfig.g:164:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Service__Group__0"
    // InternalDockerConfig.g:173:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:177:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalDockerConfig.g:178:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

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
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalDockerConfig.g:185:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:189:1: ( ( 'Service' ) )
            // InternalDockerConfig.g:190:1: ( 'Service' )
            {
            // InternalDockerConfig.g:190:1: ( 'Service' )
            // InternalDockerConfig.g:191:2: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalDockerConfig.g:200:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:204:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalDockerConfig.g:205:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

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
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalDockerConfig.g:212:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:216:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // InternalDockerConfig.g:217:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // InternalDockerConfig.g:217:1: ( ( rule__Service__NameAssignment_1 ) )
            // InternalDockerConfig.g:218:2: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // InternalDockerConfig.g:219:2: ( rule__Service__NameAssignment_1 )
            // InternalDockerConfig.g:219:3: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalDockerConfig.g:227:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:231:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalDockerConfig.g:232:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

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
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalDockerConfig.g:239:1: rule__Service__Group__2__Impl : ( '{' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:243:1: ( ( '{' ) )
            // InternalDockerConfig.g:244:1: ( '{' )
            {
            // InternalDockerConfig.g:244:1: ( '{' )
            // InternalDockerConfig.g:245:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalDockerConfig.g:254:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:258:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalDockerConfig.g:259:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

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
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalDockerConfig.g:266:1: rule__Service__Group__3__Impl : ( ( rule__Service__Group_3__0 )? ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:270:1: ( ( ( rule__Service__Group_3__0 )? ) )
            // InternalDockerConfig.g:271:1: ( ( rule__Service__Group_3__0 )? )
            {
            // InternalDockerConfig.g:271:1: ( ( rule__Service__Group_3__0 )? )
            // InternalDockerConfig.g:272:2: ( rule__Service__Group_3__0 )?
            {
             before(grammarAccess.getServiceAccess().getGroup_3()); 
            // InternalDockerConfig.g:273:2: ( rule__Service__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDockerConfig.g:273:3: rule__Service__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Service__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalDockerConfig.g:281:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:285:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalDockerConfig.g:286:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

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
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalDockerConfig.g:293:1: rule__Service__Group__4__Impl : ( 'ports' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:297:1: ( ( 'ports' ) )
            // InternalDockerConfig.g:298:1: ( 'ports' )
            {
            // InternalDockerConfig.g:298:1: ( 'ports' )
            // InternalDockerConfig.g:299:2: 'ports'
            {
             before(grammarAccess.getServiceAccess().getPortsKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPortsKeyword_4()); 

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
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalDockerConfig.g:308:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:312:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalDockerConfig.g:313:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

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
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalDockerConfig.g:320:1: rule__Service__Group__5__Impl : ( '{' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:324:1: ( ( '{' ) )
            // InternalDockerConfig.g:325:1: ( '{' )
            {
            // InternalDockerConfig.g:325:1: ( '{' )
            // InternalDockerConfig.g:326:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalDockerConfig.g:335:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:339:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalDockerConfig.g:340:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

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
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalDockerConfig.g:347:1: rule__Service__Group__6__Impl : ( ( rule__Service__PortsAssignment_6 ) ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:351:1: ( ( ( rule__Service__PortsAssignment_6 ) ) )
            // InternalDockerConfig.g:352:1: ( ( rule__Service__PortsAssignment_6 ) )
            {
            // InternalDockerConfig.g:352:1: ( ( rule__Service__PortsAssignment_6 ) )
            // InternalDockerConfig.g:353:2: ( rule__Service__PortsAssignment_6 )
            {
             before(grammarAccess.getServiceAccess().getPortsAssignment_6()); 
            // InternalDockerConfig.g:354:2: ( rule__Service__PortsAssignment_6 )
            // InternalDockerConfig.g:354:3: rule__Service__PortsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Service__PortsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getPortsAssignment_6()); 

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
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalDockerConfig.g:362:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:366:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalDockerConfig.g:367:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__8();

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
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalDockerConfig.g:374:1: rule__Service__Group__7__Impl : ( ( rule__Service__Group_7__0 )* ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:378:1: ( ( ( rule__Service__Group_7__0 )* ) )
            // InternalDockerConfig.g:379:1: ( ( rule__Service__Group_7__0 )* )
            {
            // InternalDockerConfig.g:379:1: ( ( rule__Service__Group_7__0 )* )
            // InternalDockerConfig.g:380:2: ( rule__Service__Group_7__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_7()); 
            // InternalDockerConfig.g:381:2: ( rule__Service__Group_7__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDockerConfig.g:381:3: rule__Service__Group_7__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Service__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // InternalDockerConfig.g:389:1: rule__Service__Group__8 : rule__Service__Group__8__Impl rule__Service__Group__9 ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:393:1: ( rule__Service__Group__8__Impl rule__Service__Group__9 )
            // InternalDockerConfig.g:394:2: rule__Service__Group__8__Impl rule__Service__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Service__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__9();

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
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // InternalDockerConfig.g:401:1: rule__Service__Group__8__Impl : ( '}' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:405:1: ( ( '}' ) )
            // InternalDockerConfig.g:406:1: ( '}' )
            {
            // InternalDockerConfig.g:406:1: ( '}' )
            // InternalDockerConfig.g:407:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group__9"
    // InternalDockerConfig.g:416:1: rule__Service__Group__9 : rule__Service__Group__9__Impl rule__Service__Group__10 ;
    public final void rule__Service__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:420:1: ( rule__Service__Group__9__Impl rule__Service__Group__10 )
            // InternalDockerConfig.g:421:2: rule__Service__Group__9__Impl rule__Service__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__10();

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
    // $ANTLR end "rule__Service__Group__9"


    // $ANTLR start "rule__Service__Group__9__Impl"
    // InternalDockerConfig.g:428:1: rule__Service__Group__9__Impl : ( 'volumes' ) ;
    public final void rule__Service__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:432:1: ( ( 'volumes' ) )
            // InternalDockerConfig.g:433:1: ( 'volumes' )
            {
            // InternalDockerConfig.g:433:1: ( 'volumes' )
            // InternalDockerConfig.g:434:2: 'volumes'
            {
             before(grammarAccess.getServiceAccess().getVolumesKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getVolumesKeyword_9()); 

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
    // $ANTLR end "rule__Service__Group__9__Impl"


    // $ANTLR start "rule__Service__Group__10"
    // InternalDockerConfig.g:443:1: rule__Service__Group__10 : rule__Service__Group__10__Impl rule__Service__Group__11 ;
    public final void rule__Service__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:447:1: ( rule__Service__Group__10__Impl rule__Service__Group__11 )
            // InternalDockerConfig.g:448:2: rule__Service__Group__10__Impl rule__Service__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Service__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__11();

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
    // $ANTLR end "rule__Service__Group__10"


    // $ANTLR start "rule__Service__Group__10__Impl"
    // InternalDockerConfig.g:455:1: rule__Service__Group__10__Impl : ( '{' ) ;
    public final void rule__Service__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:459:1: ( ( '{' ) )
            // InternalDockerConfig.g:460:1: ( '{' )
            {
            // InternalDockerConfig.g:460:1: ( '{' )
            // InternalDockerConfig.g:461:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Service__Group__10__Impl"


    // $ANTLR start "rule__Service__Group__11"
    // InternalDockerConfig.g:470:1: rule__Service__Group__11 : rule__Service__Group__11__Impl rule__Service__Group__12 ;
    public final void rule__Service__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:474:1: ( rule__Service__Group__11__Impl rule__Service__Group__12 )
            // InternalDockerConfig.g:475:2: rule__Service__Group__11__Impl rule__Service__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__12();

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
    // $ANTLR end "rule__Service__Group__11"


    // $ANTLR start "rule__Service__Group__11__Impl"
    // InternalDockerConfig.g:482:1: rule__Service__Group__11__Impl : ( ( rule__Service__VolumesAssignment_11 ) ) ;
    public final void rule__Service__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:486:1: ( ( ( rule__Service__VolumesAssignment_11 ) ) )
            // InternalDockerConfig.g:487:1: ( ( rule__Service__VolumesAssignment_11 ) )
            {
            // InternalDockerConfig.g:487:1: ( ( rule__Service__VolumesAssignment_11 ) )
            // InternalDockerConfig.g:488:2: ( rule__Service__VolumesAssignment_11 )
            {
             before(grammarAccess.getServiceAccess().getVolumesAssignment_11()); 
            // InternalDockerConfig.g:489:2: ( rule__Service__VolumesAssignment_11 )
            // InternalDockerConfig.g:489:3: rule__Service__VolumesAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Service__VolumesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getVolumesAssignment_11()); 

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
    // $ANTLR end "rule__Service__Group__11__Impl"


    // $ANTLR start "rule__Service__Group__12"
    // InternalDockerConfig.g:497:1: rule__Service__Group__12 : rule__Service__Group__12__Impl rule__Service__Group__13 ;
    public final void rule__Service__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:501:1: ( rule__Service__Group__12__Impl rule__Service__Group__13 )
            // InternalDockerConfig.g:502:2: rule__Service__Group__12__Impl rule__Service__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Service__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__13();

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
    // $ANTLR end "rule__Service__Group__12"


    // $ANTLR start "rule__Service__Group__12__Impl"
    // InternalDockerConfig.g:509:1: rule__Service__Group__12__Impl : ( ( rule__Service__Group_12__0 )* ) ;
    public final void rule__Service__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:513:1: ( ( ( rule__Service__Group_12__0 )* ) )
            // InternalDockerConfig.g:514:1: ( ( rule__Service__Group_12__0 )* )
            {
            // InternalDockerConfig.g:514:1: ( ( rule__Service__Group_12__0 )* )
            // InternalDockerConfig.g:515:2: ( rule__Service__Group_12__0 )*
            {
             before(grammarAccess.getServiceAccess().getGroup_12()); 
            // InternalDockerConfig.g:516:2: ( rule__Service__Group_12__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDockerConfig.g:516:3: rule__Service__Group_12__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Service__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Service__Group__12__Impl"


    // $ANTLR start "rule__Service__Group__13"
    // InternalDockerConfig.g:524:1: rule__Service__Group__13 : rule__Service__Group__13__Impl rule__Service__Group__14 ;
    public final void rule__Service__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:528:1: ( rule__Service__Group__13__Impl rule__Service__Group__14 )
            // InternalDockerConfig.g:529:2: rule__Service__Group__13__Impl rule__Service__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__Service__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__14();

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
    // $ANTLR end "rule__Service__Group__13"


    // $ANTLR start "rule__Service__Group__13__Impl"
    // InternalDockerConfig.g:536:1: rule__Service__Group__13__Impl : ( '}' ) ;
    public final void rule__Service__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:540:1: ( ( '}' ) )
            // InternalDockerConfig.g:541:1: ( '}' )
            {
            // InternalDockerConfig.g:541:1: ( '}' )
            // InternalDockerConfig.g:542:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_13()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Service__Group__13__Impl"


    // $ANTLR start "rule__Service__Group__14"
    // InternalDockerConfig.g:551:1: rule__Service__Group__14 : rule__Service__Group__14__Impl ;
    public final void rule__Service__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:555:1: ( rule__Service__Group__14__Impl )
            // InternalDockerConfig.g:556:2: rule__Service__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__14__Impl();

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
    // $ANTLR end "rule__Service__Group__14"


    // $ANTLR start "rule__Service__Group__14__Impl"
    // InternalDockerConfig.g:562:1: rule__Service__Group__14__Impl : ( '}' ) ;
    public final void rule__Service__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:566:1: ( ( '}' ) )
            // InternalDockerConfig.g:567:1: ( '}' )
            {
            // InternalDockerConfig.g:567:1: ( '}' )
            // InternalDockerConfig.g:568:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_14()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__Service__Group__14__Impl"


    // $ANTLR start "rule__Service__Group_3__0"
    // InternalDockerConfig.g:578:1: rule__Service__Group_3__0 : rule__Service__Group_3__0__Impl rule__Service__Group_3__1 ;
    public final void rule__Service__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:582:1: ( rule__Service__Group_3__0__Impl rule__Service__Group_3__1 )
            // InternalDockerConfig.g:583:2: rule__Service__Group_3__0__Impl rule__Service__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Service__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_3__1();

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
    // $ANTLR end "rule__Service__Group_3__0"


    // $ANTLR start "rule__Service__Group_3__0__Impl"
    // InternalDockerConfig.g:590:1: rule__Service__Group_3__0__Impl : ( 'image' ) ;
    public final void rule__Service__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:594:1: ( ( 'image' ) )
            // InternalDockerConfig.g:595:1: ( 'image' )
            {
            // InternalDockerConfig.g:595:1: ( 'image' )
            // InternalDockerConfig.g:596:2: 'image'
            {
             before(grammarAccess.getServiceAccess().getImageKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getImageKeyword_3_0()); 

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
    // $ANTLR end "rule__Service__Group_3__0__Impl"


    // $ANTLR start "rule__Service__Group_3__1"
    // InternalDockerConfig.g:605:1: rule__Service__Group_3__1 : rule__Service__Group_3__1__Impl ;
    public final void rule__Service__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:609:1: ( rule__Service__Group_3__1__Impl )
            // InternalDockerConfig.g:610:2: rule__Service__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_3__1__Impl();

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
    // $ANTLR end "rule__Service__Group_3__1"


    // $ANTLR start "rule__Service__Group_3__1__Impl"
    // InternalDockerConfig.g:616:1: rule__Service__Group_3__1__Impl : ( ( rule__Service__ImageAssignment_3_1 ) ) ;
    public final void rule__Service__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:620:1: ( ( ( rule__Service__ImageAssignment_3_1 ) ) )
            // InternalDockerConfig.g:621:1: ( ( rule__Service__ImageAssignment_3_1 ) )
            {
            // InternalDockerConfig.g:621:1: ( ( rule__Service__ImageAssignment_3_1 ) )
            // InternalDockerConfig.g:622:2: ( rule__Service__ImageAssignment_3_1 )
            {
             before(grammarAccess.getServiceAccess().getImageAssignment_3_1()); 
            // InternalDockerConfig.g:623:2: ( rule__Service__ImageAssignment_3_1 )
            // InternalDockerConfig.g:623:3: rule__Service__ImageAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__ImageAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getImageAssignment_3_1()); 

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
    // $ANTLR end "rule__Service__Group_3__1__Impl"


    // $ANTLR start "rule__Service__Group_7__0"
    // InternalDockerConfig.g:632:1: rule__Service__Group_7__0 : rule__Service__Group_7__0__Impl rule__Service__Group_7__1 ;
    public final void rule__Service__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:636:1: ( rule__Service__Group_7__0__Impl rule__Service__Group_7__1 )
            // InternalDockerConfig.g:637:2: rule__Service__Group_7__0__Impl rule__Service__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__Service__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_7__1();

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
    // $ANTLR end "rule__Service__Group_7__0"


    // $ANTLR start "rule__Service__Group_7__0__Impl"
    // InternalDockerConfig.g:644:1: rule__Service__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:648:1: ( ( ',' ) )
            // InternalDockerConfig.g:649:1: ( ',' )
            {
            // InternalDockerConfig.g:649:1: ( ',' )
            // InternalDockerConfig.g:650:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__Service__Group_7__0__Impl"


    // $ANTLR start "rule__Service__Group_7__1"
    // InternalDockerConfig.g:659:1: rule__Service__Group_7__1 : rule__Service__Group_7__1__Impl ;
    public final void rule__Service__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:663:1: ( rule__Service__Group_7__1__Impl )
            // InternalDockerConfig.g:664:2: rule__Service__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_7__1__Impl();

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
    // $ANTLR end "rule__Service__Group_7__1"


    // $ANTLR start "rule__Service__Group_7__1__Impl"
    // InternalDockerConfig.g:670:1: rule__Service__Group_7__1__Impl : ( ( rule__Service__PortsAssignment_7_1 ) ) ;
    public final void rule__Service__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:674:1: ( ( ( rule__Service__PortsAssignment_7_1 ) ) )
            // InternalDockerConfig.g:675:1: ( ( rule__Service__PortsAssignment_7_1 ) )
            {
            // InternalDockerConfig.g:675:1: ( ( rule__Service__PortsAssignment_7_1 ) )
            // InternalDockerConfig.g:676:2: ( rule__Service__PortsAssignment_7_1 )
            {
             before(grammarAccess.getServiceAccess().getPortsAssignment_7_1()); 
            // InternalDockerConfig.g:677:2: ( rule__Service__PortsAssignment_7_1 )
            // InternalDockerConfig.g:677:3: rule__Service__PortsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__PortsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getPortsAssignment_7_1()); 

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
    // $ANTLR end "rule__Service__Group_7__1__Impl"


    // $ANTLR start "rule__Service__Group_12__0"
    // InternalDockerConfig.g:686:1: rule__Service__Group_12__0 : rule__Service__Group_12__0__Impl rule__Service__Group_12__1 ;
    public final void rule__Service__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:690:1: ( rule__Service__Group_12__0__Impl rule__Service__Group_12__1 )
            // InternalDockerConfig.g:691:2: rule__Service__Group_12__0__Impl rule__Service__Group_12__1
            {
            pushFollow(FOLLOW_10);
            rule__Service__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group_12__1();

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
    // $ANTLR end "rule__Service__Group_12__0"


    // $ANTLR start "rule__Service__Group_12__0__Impl"
    // InternalDockerConfig.g:698:1: rule__Service__Group_12__0__Impl : ( ',' ) ;
    public final void rule__Service__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:702:1: ( ( ',' ) )
            // InternalDockerConfig.g:703:1: ( ',' )
            {
            // InternalDockerConfig.g:703:1: ( ',' )
            // InternalDockerConfig.g:704:2: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_12_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_12_0()); 

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
    // $ANTLR end "rule__Service__Group_12__0__Impl"


    // $ANTLR start "rule__Service__Group_12__1"
    // InternalDockerConfig.g:713:1: rule__Service__Group_12__1 : rule__Service__Group_12__1__Impl ;
    public final void rule__Service__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:717:1: ( rule__Service__Group_12__1__Impl )
            // InternalDockerConfig.g:718:2: rule__Service__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group_12__1__Impl();

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
    // $ANTLR end "rule__Service__Group_12__1"


    // $ANTLR start "rule__Service__Group_12__1__Impl"
    // InternalDockerConfig.g:724:1: rule__Service__Group_12__1__Impl : ( ( rule__Service__VolumesAssignment_12_1 ) ) ;
    public final void rule__Service__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:728:1: ( ( ( rule__Service__VolumesAssignment_12_1 ) ) )
            // InternalDockerConfig.g:729:1: ( ( rule__Service__VolumesAssignment_12_1 ) )
            {
            // InternalDockerConfig.g:729:1: ( ( rule__Service__VolumesAssignment_12_1 ) )
            // InternalDockerConfig.g:730:2: ( rule__Service__VolumesAssignment_12_1 )
            {
             before(grammarAccess.getServiceAccess().getVolumesAssignment_12_1()); 
            // InternalDockerConfig.g:731:2: ( rule__Service__VolumesAssignment_12_1 )
            // InternalDockerConfig.g:731:3: rule__Service__VolumesAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Service__VolumesAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getVolumesAssignment_12_1()); 

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
    // $ANTLR end "rule__Service__Group_12__1__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // InternalDockerConfig.g:740:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:744:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalDockerConfig.g:745:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__1();

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
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // InternalDockerConfig.g:752:1: rule__Port__Group__0__Impl : ( () ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:756:1: ( ( () ) )
            // InternalDockerConfig.g:757:1: ( () )
            {
            // InternalDockerConfig.g:757:1: ( () )
            // InternalDockerConfig.g:758:2: ()
            {
             before(grammarAccess.getPortAccess().getPortAction_0()); 
            // InternalDockerConfig.g:759:2: ()
            // InternalDockerConfig.g:759:3: 
            {
            }

             after(grammarAccess.getPortAccess().getPortAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // InternalDockerConfig.g:767:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:771:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalDockerConfig.g:772:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__2();

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
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // InternalDockerConfig.g:779:1: rule__Port__Group__1__Impl : ( 'Port' ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:783:1: ( ( 'Port' ) )
            // InternalDockerConfig.g:784:1: ( 'Port' )
            {
            // InternalDockerConfig.g:784:1: ( 'Port' )
            // InternalDockerConfig.g:785:2: 'Port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getPortKeyword_1()); 

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
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // InternalDockerConfig.g:794:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:798:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // InternalDockerConfig.g:799:2: rule__Port__Group__2__Impl rule__Port__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Port__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__3();

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
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // InternalDockerConfig.g:806:1: rule__Port__Group__2__Impl : ( '{' ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:810:1: ( ( '{' ) )
            // InternalDockerConfig.g:811:1: ( '{' )
            {
            // InternalDockerConfig.g:811:1: ( '{' )
            // InternalDockerConfig.g:812:2: '{'
            {
             before(grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__3"
    // InternalDockerConfig.g:821:1: rule__Port__Group__3 : rule__Port__Group__3__Impl rule__Port__Group__4 ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:825:1: ( rule__Port__Group__3__Impl rule__Port__Group__4 )
            // InternalDockerConfig.g:826:2: rule__Port__Group__3__Impl rule__Port__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Port__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__4();

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
    // $ANTLR end "rule__Port__Group__3"


    // $ANTLR start "rule__Port__Group__3__Impl"
    // InternalDockerConfig.g:833:1: rule__Port__Group__3__Impl : ( ( rule__Port__Group_3__0 )? ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:837:1: ( ( ( rule__Port__Group_3__0 )? ) )
            // InternalDockerConfig.g:838:1: ( ( rule__Port__Group_3__0 )? )
            {
            // InternalDockerConfig.g:838:1: ( ( rule__Port__Group_3__0 )? )
            // InternalDockerConfig.g:839:2: ( rule__Port__Group_3__0 )?
            {
             before(grammarAccess.getPortAccess().getGroup_3()); 
            // InternalDockerConfig.g:840:2: ( rule__Port__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDockerConfig.g:840:3: rule__Port__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Port__Group__3__Impl"


    // $ANTLR start "rule__Port__Group__4"
    // InternalDockerConfig.g:848:1: rule__Port__Group__4 : rule__Port__Group__4__Impl rule__Port__Group__5 ;
    public final void rule__Port__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:852:1: ( rule__Port__Group__4__Impl rule__Port__Group__5 )
            // InternalDockerConfig.g:853:2: rule__Port__Group__4__Impl rule__Port__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Port__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__5();

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
    // $ANTLR end "rule__Port__Group__4"


    // $ANTLR start "rule__Port__Group__4__Impl"
    // InternalDockerConfig.g:860:1: rule__Port__Group__4__Impl : ( ( rule__Port__Group_4__0 )? ) ;
    public final void rule__Port__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:864:1: ( ( ( rule__Port__Group_4__0 )? ) )
            // InternalDockerConfig.g:865:1: ( ( rule__Port__Group_4__0 )? )
            {
            // InternalDockerConfig.g:865:1: ( ( rule__Port__Group_4__0 )? )
            // InternalDockerConfig.g:866:2: ( rule__Port__Group_4__0 )?
            {
             before(grammarAccess.getPortAccess().getGroup_4()); 
            // InternalDockerConfig.g:867:2: ( rule__Port__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDockerConfig.g:867:3: rule__Port__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Port__Group__4__Impl"


    // $ANTLR start "rule__Port__Group__5"
    // InternalDockerConfig.g:875:1: rule__Port__Group__5 : rule__Port__Group__5__Impl ;
    public final void rule__Port__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:879:1: ( rule__Port__Group__5__Impl )
            // InternalDockerConfig.g:880:2: rule__Port__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__5__Impl();

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
    // $ANTLR end "rule__Port__Group__5"


    // $ANTLR start "rule__Port__Group__5__Impl"
    // InternalDockerConfig.g:886:1: rule__Port__Group__5__Impl : ( '}' ) ;
    public final void rule__Port__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:890:1: ( ( '}' ) )
            // InternalDockerConfig.g:891:1: ( '}' )
            {
            // InternalDockerConfig.g:891:1: ( '}' )
            // InternalDockerConfig.g:892:2: '}'
            {
             before(grammarAccess.getPortAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Port__Group__5__Impl"


    // $ANTLR start "rule__Port__Group_3__0"
    // InternalDockerConfig.g:902:1: rule__Port__Group_3__0 : rule__Port__Group_3__0__Impl rule__Port__Group_3__1 ;
    public final void rule__Port__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:906:1: ( rule__Port__Group_3__0__Impl rule__Port__Group_3__1 )
            // InternalDockerConfig.g:907:2: rule__Port__Group_3__0__Impl rule__Port__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Port__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group_3__1();

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
    // $ANTLR end "rule__Port__Group_3__0"


    // $ANTLR start "rule__Port__Group_3__0__Impl"
    // InternalDockerConfig.g:914:1: rule__Port__Group_3__0__Impl : ( 'hostPort' ) ;
    public final void rule__Port__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:918:1: ( ( 'hostPort' ) )
            // InternalDockerConfig.g:919:1: ( 'hostPort' )
            {
            // InternalDockerConfig.g:919:1: ( 'hostPort' )
            // InternalDockerConfig.g:920:2: 'hostPort'
            {
             before(grammarAccess.getPortAccess().getHostPortKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getHostPortKeyword_3_0()); 

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
    // $ANTLR end "rule__Port__Group_3__0__Impl"


    // $ANTLR start "rule__Port__Group_3__1"
    // InternalDockerConfig.g:929:1: rule__Port__Group_3__1 : rule__Port__Group_3__1__Impl ;
    public final void rule__Port__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:933:1: ( rule__Port__Group_3__1__Impl )
            // InternalDockerConfig.g:934:2: rule__Port__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group_3__1__Impl();

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
    // $ANTLR end "rule__Port__Group_3__1"


    // $ANTLR start "rule__Port__Group_3__1__Impl"
    // InternalDockerConfig.g:940:1: rule__Port__Group_3__1__Impl : ( ( rule__Port__HostPortAssignment_3_1 ) ) ;
    public final void rule__Port__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:944:1: ( ( ( rule__Port__HostPortAssignment_3_1 ) ) )
            // InternalDockerConfig.g:945:1: ( ( rule__Port__HostPortAssignment_3_1 ) )
            {
            // InternalDockerConfig.g:945:1: ( ( rule__Port__HostPortAssignment_3_1 ) )
            // InternalDockerConfig.g:946:2: ( rule__Port__HostPortAssignment_3_1 )
            {
             before(grammarAccess.getPortAccess().getHostPortAssignment_3_1()); 
            // InternalDockerConfig.g:947:2: ( rule__Port__HostPortAssignment_3_1 )
            // InternalDockerConfig.g:947:3: rule__Port__HostPortAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Port__HostPortAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getHostPortAssignment_3_1()); 

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
    // $ANTLR end "rule__Port__Group_3__1__Impl"


    // $ANTLR start "rule__Port__Group_4__0"
    // InternalDockerConfig.g:956:1: rule__Port__Group_4__0 : rule__Port__Group_4__0__Impl rule__Port__Group_4__1 ;
    public final void rule__Port__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:960:1: ( rule__Port__Group_4__0__Impl rule__Port__Group_4__1 )
            // InternalDockerConfig.g:961:2: rule__Port__Group_4__0__Impl rule__Port__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Port__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group_4__1();

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
    // $ANTLR end "rule__Port__Group_4__0"


    // $ANTLR start "rule__Port__Group_4__0__Impl"
    // InternalDockerConfig.g:968:1: rule__Port__Group_4__0__Impl : ( 'containerPort' ) ;
    public final void rule__Port__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:972:1: ( ( 'containerPort' ) )
            // InternalDockerConfig.g:973:1: ( 'containerPort' )
            {
            // InternalDockerConfig.g:973:1: ( 'containerPort' )
            // InternalDockerConfig.g:974:2: 'containerPort'
            {
             before(grammarAccess.getPortAccess().getContainerPortKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getContainerPortKeyword_4_0()); 

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
    // $ANTLR end "rule__Port__Group_4__0__Impl"


    // $ANTLR start "rule__Port__Group_4__1"
    // InternalDockerConfig.g:983:1: rule__Port__Group_4__1 : rule__Port__Group_4__1__Impl ;
    public final void rule__Port__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:987:1: ( rule__Port__Group_4__1__Impl )
            // InternalDockerConfig.g:988:2: rule__Port__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group_4__1__Impl();

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
    // $ANTLR end "rule__Port__Group_4__1"


    // $ANTLR start "rule__Port__Group_4__1__Impl"
    // InternalDockerConfig.g:994:1: rule__Port__Group_4__1__Impl : ( ( rule__Port__ContainerPortAssignment_4_1 ) ) ;
    public final void rule__Port__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:998:1: ( ( ( rule__Port__ContainerPortAssignment_4_1 ) ) )
            // InternalDockerConfig.g:999:1: ( ( rule__Port__ContainerPortAssignment_4_1 ) )
            {
            // InternalDockerConfig.g:999:1: ( ( rule__Port__ContainerPortAssignment_4_1 ) )
            // InternalDockerConfig.g:1000:2: ( rule__Port__ContainerPortAssignment_4_1 )
            {
             before(grammarAccess.getPortAccess().getContainerPortAssignment_4_1()); 
            // InternalDockerConfig.g:1001:2: ( rule__Port__ContainerPortAssignment_4_1 )
            // InternalDockerConfig.g:1001:3: rule__Port__ContainerPortAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Port__ContainerPortAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getContainerPortAssignment_4_1()); 

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
    // $ANTLR end "rule__Port__Group_4__1__Impl"


    // $ANTLR start "rule__Volume__Group__0"
    // InternalDockerConfig.g:1010:1: rule__Volume__Group__0 : rule__Volume__Group__0__Impl rule__Volume__Group__1 ;
    public final void rule__Volume__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1014:1: ( rule__Volume__Group__0__Impl rule__Volume__Group__1 )
            // InternalDockerConfig.g:1015:2: rule__Volume__Group__0__Impl rule__Volume__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Volume__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__1();

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
    // $ANTLR end "rule__Volume__Group__0"


    // $ANTLR start "rule__Volume__Group__0__Impl"
    // InternalDockerConfig.g:1022:1: rule__Volume__Group__0__Impl : ( () ) ;
    public final void rule__Volume__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1026:1: ( ( () ) )
            // InternalDockerConfig.g:1027:1: ( () )
            {
            // InternalDockerConfig.g:1027:1: ( () )
            // InternalDockerConfig.g:1028:2: ()
            {
             before(grammarAccess.getVolumeAccess().getVolumeAction_0()); 
            // InternalDockerConfig.g:1029:2: ()
            // InternalDockerConfig.g:1029:3: 
            {
            }

             after(grammarAccess.getVolumeAccess().getVolumeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Volume__Group__0__Impl"


    // $ANTLR start "rule__Volume__Group__1"
    // InternalDockerConfig.g:1037:1: rule__Volume__Group__1 : rule__Volume__Group__1__Impl rule__Volume__Group__2 ;
    public final void rule__Volume__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1041:1: ( rule__Volume__Group__1__Impl rule__Volume__Group__2 )
            // InternalDockerConfig.g:1042:2: rule__Volume__Group__1__Impl rule__Volume__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Volume__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__2();

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
    // $ANTLR end "rule__Volume__Group__1"


    // $ANTLR start "rule__Volume__Group__1__Impl"
    // InternalDockerConfig.g:1049:1: rule__Volume__Group__1__Impl : ( 'Volume' ) ;
    public final void rule__Volume__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1053:1: ( ( 'Volume' ) )
            // InternalDockerConfig.g:1054:1: ( 'Volume' )
            {
            // InternalDockerConfig.g:1054:1: ( 'Volume' )
            // InternalDockerConfig.g:1055:2: 'Volume'
            {
             before(grammarAccess.getVolumeAccess().getVolumeKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getVolumeKeyword_1()); 

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
    // $ANTLR end "rule__Volume__Group__1__Impl"


    // $ANTLR start "rule__Volume__Group__2"
    // InternalDockerConfig.g:1064:1: rule__Volume__Group__2 : rule__Volume__Group__2__Impl rule__Volume__Group__3 ;
    public final void rule__Volume__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1068:1: ( rule__Volume__Group__2__Impl rule__Volume__Group__3 )
            // InternalDockerConfig.g:1069:2: rule__Volume__Group__2__Impl rule__Volume__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Volume__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__3();

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
    // $ANTLR end "rule__Volume__Group__2"


    // $ANTLR start "rule__Volume__Group__2__Impl"
    // InternalDockerConfig.g:1076:1: rule__Volume__Group__2__Impl : ( '{' ) ;
    public final void rule__Volume__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1080:1: ( ( '{' ) )
            // InternalDockerConfig.g:1081:1: ( '{' )
            {
            // InternalDockerConfig.g:1081:1: ( '{' )
            // InternalDockerConfig.g:1082:2: '{'
            {
             before(grammarAccess.getVolumeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Volume__Group__2__Impl"


    // $ANTLR start "rule__Volume__Group__3"
    // InternalDockerConfig.g:1091:1: rule__Volume__Group__3 : rule__Volume__Group__3__Impl rule__Volume__Group__4 ;
    public final void rule__Volume__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1095:1: ( rule__Volume__Group__3__Impl rule__Volume__Group__4 )
            // InternalDockerConfig.g:1096:2: rule__Volume__Group__3__Impl rule__Volume__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Volume__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__4();

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
    // $ANTLR end "rule__Volume__Group__3"


    // $ANTLR start "rule__Volume__Group__3__Impl"
    // InternalDockerConfig.g:1103:1: rule__Volume__Group__3__Impl : ( ( rule__Volume__Group_3__0 )? ) ;
    public final void rule__Volume__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1107:1: ( ( ( rule__Volume__Group_3__0 )? ) )
            // InternalDockerConfig.g:1108:1: ( ( rule__Volume__Group_3__0 )? )
            {
            // InternalDockerConfig.g:1108:1: ( ( rule__Volume__Group_3__0 )? )
            // InternalDockerConfig.g:1109:2: ( rule__Volume__Group_3__0 )?
            {
             before(grammarAccess.getVolumeAccess().getGroup_3()); 
            // InternalDockerConfig.g:1110:2: ( rule__Volume__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDockerConfig.g:1110:3: rule__Volume__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Volume__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVolumeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Volume__Group__3__Impl"


    // $ANTLR start "rule__Volume__Group__4"
    // InternalDockerConfig.g:1118:1: rule__Volume__Group__4 : rule__Volume__Group__4__Impl rule__Volume__Group__5 ;
    public final void rule__Volume__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1122:1: ( rule__Volume__Group__4__Impl rule__Volume__Group__5 )
            // InternalDockerConfig.g:1123:2: rule__Volume__Group__4__Impl rule__Volume__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Volume__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group__5();

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
    // $ANTLR end "rule__Volume__Group__4"


    // $ANTLR start "rule__Volume__Group__4__Impl"
    // InternalDockerConfig.g:1130:1: rule__Volume__Group__4__Impl : ( ( rule__Volume__Group_4__0 )? ) ;
    public final void rule__Volume__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1134:1: ( ( ( rule__Volume__Group_4__0 )? ) )
            // InternalDockerConfig.g:1135:1: ( ( rule__Volume__Group_4__0 )? )
            {
            // InternalDockerConfig.g:1135:1: ( ( rule__Volume__Group_4__0 )? )
            // InternalDockerConfig.g:1136:2: ( rule__Volume__Group_4__0 )?
            {
             before(grammarAccess.getVolumeAccess().getGroup_4()); 
            // InternalDockerConfig.g:1137:2: ( rule__Volume__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDockerConfig.g:1137:3: rule__Volume__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Volume__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVolumeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Volume__Group__4__Impl"


    // $ANTLR start "rule__Volume__Group__5"
    // InternalDockerConfig.g:1145:1: rule__Volume__Group__5 : rule__Volume__Group__5__Impl ;
    public final void rule__Volume__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1149:1: ( rule__Volume__Group__5__Impl )
            // InternalDockerConfig.g:1150:2: rule__Volume__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group__5__Impl();

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
    // $ANTLR end "rule__Volume__Group__5"


    // $ANTLR start "rule__Volume__Group__5__Impl"
    // InternalDockerConfig.g:1156:1: rule__Volume__Group__5__Impl : ( '}' ) ;
    public final void rule__Volume__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1160:1: ( ( '}' ) )
            // InternalDockerConfig.g:1161:1: ( '}' )
            {
            // InternalDockerConfig.g:1161:1: ( '}' )
            // InternalDockerConfig.g:1162:2: '}'
            {
             before(grammarAccess.getVolumeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Volume__Group__5__Impl"


    // $ANTLR start "rule__Volume__Group_3__0"
    // InternalDockerConfig.g:1172:1: rule__Volume__Group_3__0 : rule__Volume__Group_3__0__Impl rule__Volume__Group_3__1 ;
    public final void rule__Volume__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1176:1: ( rule__Volume__Group_3__0__Impl rule__Volume__Group_3__1 )
            // InternalDockerConfig.g:1177:2: rule__Volume__Group_3__0__Impl rule__Volume__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Volume__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group_3__1();

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
    // $ANTLR end "rule__Volume__Group_3__0"


    // $ANTLR start "rule__Volume__Group_3__0__Impl"
    // InternalDockerConfig.g:1184:1: rule__Volume__Group_3__0__Impl : ( 'hostPath' ) ;
    public final void rule__Volume__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1188:1: ( ( 'hostPath' ) )
            // InternalDockerConfig.g:1189:1: ( 'hostPath' )
            {
            // InternalDockerConfig.g:1189:1: ( 'hostPath' )
            // InternalDockerConfig.g:1190:2: 'hostPath'
            {
             before(grammarAccess.getVolumeAccess().getHostPathKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getHostPathKeyword_3_0()); 

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
    // $ANTLR end "rule__Volume__Group_3__0__Impl"


    // $ANTLR start "rule__Volume__Group_3__1"
    // InternalDockerConfig.g:1199:1: rule__Volume__Group_3__1 : rule__Volume__Group_3__1__Impl ;
    public final void rule__Volume__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1203:1: ( rule__Volume__Group_3__1__Impl )
            // InternalDockerConfig.g:1204:2: rule__Volume__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group_3__1__Impl();

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
    // $ANTLR end "rule__Volume__Group_3__1"


    // $ANTLR start "rule__Volume__Group_3__1__Impl"
    // InternalDockerConfig.g:1210:1: rule__Volume__Group_3__1__Impl : ( ( rule__Volume__HostPathAssignment_3_1 ) ) ;
    public final void rule__Volume__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1214:1: ( ( ( rule__Volume__HostPathAssignment_3_1 ) ) )
            // InternalDockerConfig.g:1215:1: ( ( rule__Volume__HostPathAssignment_3_1 ) )
            {
            // InternalDockerConfig.g:1215:1: ( ( rule__Volume__HostPathAssignment_3_1 ) )
            // InternalDockerConfig.g:1216:2: ( rule__Volume__HostPathAssignment_3_1 )
            {
             before(grammarAccess.getVolumeAccess().getHostPathAssignment_3_1()); 
            // InternalDockerConfig.g:1217:2: ( rule__Volume__HostPathAssignment_3_1 )
            // InternalDockerConfig.g:1217:3: rule__Volume__HostPathAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Volume__HostPathAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getHostPathAssignment_3_1()); 

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
    // $ANTLR end "rule__Volume__Group_3__1__Impl"


    // $ANTLR start "rule__Volume__Group_4__0"
    // InternalDockerConfig.g:1226:1: rule__Volume__Group_4__0 : rule__Volume__Group_4__0__Impl rule__Volume__Group_4__1 ;
    public final void rule__Volume__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1230:1: ( rule__Volume__Group_4__0__Impl rule__Volume__Group_4__1 )
            // InternalDockerConfig.g:1231:2: rule__Volume__Group_4__0__Impl rule__Volume__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Volume__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Volume__Group_4__1();

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
    // $ANTLR end "rule__Volume__Group_4__0"


    // $ANTLR start "rule__Volume__Group_4__0__Impl"
    // InternalDockerConfig.g:1238:1: rule__Volume__Group_4__0__Impl : ( 'containerPath' ) ;
    public final void rule__Volume__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1242:1: ( ( 'containerPath' ) )
            // InternalDockerConfig.g:1243:1: ( 'containerPath' )
            {
            // InternalDockerConfig.g:1243:1: ( 'containerPath' )
            // InternalDockerConfig.g:1244:2: 'containerPath'
            {
             before(grammarAccess.getVolumeAccess().getContainerPathKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVolumeAccess().getContainerPathKeyword_4_0()); 

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
    // $ANTLR end "rule__Volume__Group_4__0__Impl"


    // $ANTLR start "rule__Volume__Group_4__1"
    // InternalDockerConfig.g:1253:1: rule__Volume__Group_4__1 : rule__Volume__Group_4__1__Impl ;
    public final void rule__Volume__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1257:1: ( rule__Volume__Group_4__1__Impl )
            // InternalDockerConfig.g:1258:2: rule__Volume__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Volume__Group_4__1__Impl();

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
    // $ANTLR end "rule__Volume__Group_4__1"


    // $ANTLR start "rule__Volume__Group_4__1__Impl"
    // InternalDockerConfig.g:1264:1: rule__Volume__Group_4__1__Impl : ( ( rule__Volume__ContainerPathAssignment_4_1 ) ) ;
    public final void rule__Volume__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1268:1: ( ( ( rule__Volume__ContainerPathAssignment_4_1 ) ) )
            // InternalDockerConfig.g:1269:1: ( ( rule__Volume__ContainerPathAssignment_4_1 ) )
            {
            // InternalDockerConfig.g:1269:1: ( ( rule__Volume__ContainerPathAssignment_4_1 ) )
            // InternalDockerConfig.g:1270:2: ( rule__Volume__ContainerPathAssignment_4_1 )
            {
             before(grammarAccess.getVolumeAccess().getContainerPathAssignment_4_1()); 
            // InternalDockerConfig.g:1271:2: ( rule__Volume__ContainerPathAssignment_4_1 )
            // InternalDockerConfig.g:1271:3: rule__Volume__ContainerPathAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Volume__ContainerPathAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVolumeAccess().getContainerPathAssignment_4_1()); 

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
    // $ANTLR end "rule__Volume__Group_4__1__Impl"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // InternalDockerConfig.g:1280:1: rule__Service__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1284:1: ( ( ruleEString ) )
            // InternalDockerConfig.g:1285:2: ( ruleEString )
            {
            // InternalDockerConfig.g:1285:2: ( ruleEString )
            // InternalDockerConfig.g:1286:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__ImageAssignment_3_1"
    // InternalDockerConfig.g:1295:1: rule__Service__ImageAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Service__ImageAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1299:1: ( ( ruleEString ) )
            // InternalDockerConfig.g:1300:2: ( ruleEString )
            {
            // InternalDockerConfig.g:1300:2: ( ruleEString )
            // InternalDockerConfig.g:1301:3: ruleEString
            {
             before(grammarAccess.getServiceAccess().getImageEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getImageEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Service__ImageAssignment_3_1"


    // $ANTLR start "rule__Service__PortsAssignment_6"
    // InternalDockerConfig.g:1310:1: rule__Service__PortsAssignment_6 : ( rulePort ) ;
    public final void rule__Service__PortsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1314:1: ( ( rulePort ) )
            // InternalDockerConfig.g:1315:2: ( rulePort )
            {
            // InternalDockerConfig.g:1315:2: ( rulePort )
            // InternalDockerConfig.g:1316:3: rulePort
            {
             before(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Service__PortsAssignment_6"


    // $ANTLR start "rule__Service__PortsAssignment_7_1"
    // InternalDockerConfig.g:1325:1: rule__Service__PortsAssignment_7_1 : ( rulePort ) ;
    public final void rule__Service__PortsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1329:1: ( ( rulePort ) )
            // InternalDockerConfig.g:1330:2: ( rulePort )
            {
            // InternalDockerConfig.g:1330:2: ( rulePort )
            // InternalDockerConfig.g:1331:3: rulePort
            {
             before(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getPortsPortParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Service__PortsAssignment_7_1"


    // $ANTLR start "rule__Service__VolumesAssignment_11"
    // InternalDockerConfig.g:1340:1: rule__Service__VolumesAssignment_11 : ( ruleVolume ) ;
    public final void rule__Service__VolumesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1344:1: ( ( ruleVolume ) )
            // InternalDockerConfig.g:1345:2: ( ruleVolume )
            {
            // InternalDockerConfig.g:1345:2: ( ruleVolume )
            // InternalDockerConfig.g:1346:3: ruleVolume
            {
             before(grammarAccess.getServiceAccess().getVolumesVolumeParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleVolume();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getVolumesVolumeParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Service__VolumesAssignment_11"


    // $ANTLR start "rule__Service__VolumesAssignment_12_1"
    // InternalDockerConfig.g:1355:1: rule__Service__VolumesAssignment_12_1 : ( ruleVolume ) ;
    public final void rule__Service__VolumesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1359:1: ( ( ruleVolume ) )
            // InternalDockerConfig.g:1360:2: ( ruleVolume )
            {
            // InternalDockerConfig.g:1360:2: ( ruleVolume )
            // InternalDockerConfig.g:1361:3: ruleVolume
            {
             before(grammarAccess.getServiceAccess().getVolumesVolumeParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVolume();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getVolumesVolumeParserRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__Service__VolumesAssignment_12_1"


    // $ANTLR start "rule__Port__HostPortAssignment_3_1"
    // InternalDockerConfig.g:1370:1: rule__Port__HostPortAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Port__HostPortAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1374:1: ( ( ruleEString ) )
            // InternalDockerConfig.g:1375:2: ( ruleEString )
            {
            // InternalDockerConfig.g:1375:2: ( ruleEString )
            // InternalDockerConfig.g:1376:3: ruleEString
            {
             before(grammarAccess.getPortAccess().getHostPortEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPortAccess().getHostPortEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Port__HostPortAssignment_3_1"


    // $ANTLR start "rule__Port__ContainerPortAssignment_4_1"
    // InternalDockerConfig.g:1385:1: rule__Port__ContainerPortAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Port__ContainerPortAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1389:1: ( ( ruleEString ) )
            // InternalDockerConfig.g:1390:2: ( ruleEString )
            {
            // InternalDockerConfig.g:1390:2: ( ruleEString )
            // InternalDockerConfig.g:1391:3: ruleEString
            {
             before(grammarAccess.getPortAccess().getContainerPortEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPortAccess().getContainerPortEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Port__ContainerPortAssignment_4_1"


    // $ANTLR start "rule__Volume__HostPathAssignment_3_1"
    // InternalDockerConfig.g:1400:1: rule__Volume__HostPathAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Volume__HostPathAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1404:1: ( ( ruleEString ) )
            // InternalDockerConfig.g:1405:2: ( ruleEString )
            {
            // InternalDockerConfig.g:1405:2: ( ruleEString )
            // InternalDockerConfig.g:1406:3: ruleEString
            {
             before(grammarAccess.getVolumeAccess().getHostPathEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVolumeAccess().getHostPathEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Volume__HostPathAssignment_3_1"


    // $ANTLR start "rule__Volume__ContainerPathAssignment_4_1"
    // InternalDockerConfig.g:1415:1: rule__Volume__ContainerPathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Volume__ContainerPathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDockerConfig.g:1419:1: ( ( ruleEString ) )
            // InternalDockerConfig.g:1420:2: ( ruleEString )
            {
            // InternalDockerConfig.g:1420:2: ( ruleEString )
            // InternalDockerConfig.g:1421:3: ruleEString
            {
             before(grammarAccess.getVolumeAccess().getContainerPathEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVolumeAccess().getContainerPathEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Volume__ContainerPathAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C04000L});

}