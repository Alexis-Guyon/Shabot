package fr.bxcchus_.util;

import fr.bxcchus_.config.ShabotConfig;

import com.merakianalytics.orianna.types.common.Division;
import com.merakianalytics.orianna.types.common.Queue;
import com.merakianalytics.orianna.types.common.Tier;

import fr.bxcchus_.main.Shabot;
import twitter4j.Status;
import twitter4j.TwitterException;

import java.util.TimerTask;

public class ShabotOverview extends TimerTask {

    public void run() {
        Tier tier = ShabotConfig.getSummoner().getLeaguePosition(Queue.RANKED_SOLO).getTier();
        Division division = ShabotConfig.getSummoner().getLeaguePosition(Queue.RANKED_SOLO).getDivision();

        try {
            Shabot.id++;
            Status status = ShabotConfig.getTwitterInstance().updateStatus(ShabotConfig.getSummoner().getName() + " is currently " + tier + " " + division + "\n\ntweet id: " +Shabot.id);
            status.getText();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }
}
