package fr.bxcchus_.config;

import com.merakianalytics.orianna.Orianna;
import com.merakianalytics.orianna.types.common.Region;
import com.merakianalytics.orianna.types.core.summoner.Summoner;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class ShabotConfig {
    // Twitter API Config
    public static Twitter getTwitterInstance() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("OAuthConsumerKey")
                .setOAuthConsumerSecret("OAuthConsumerSecret")
                .setOAuthAccessToken("OAuthAccessToken")
                .setOAuthAccessTokenSecret("OAuthAccessTokenSecret");
        return new TwitterFactory(cb.build()).getInstance();
    }
    // Riot API Config
    public static Summoner getSummoner() {
        return Orianna.summonerNamed("League Name").withRegion(Region.EUROPE_WEST).get();
    }
    public static void getRiotApiKey() {
        try {
            Orianna.setRiotAPIKey("Riot API Key");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
