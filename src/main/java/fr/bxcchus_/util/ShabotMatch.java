package fr.bxcchus_.util;

import fr.bxcchus_.config.ShabotConfig;

import fr.bxcchus_.main.Shabot;
import twitter4j.Status;
import twitter4j.TwitterException;

import java.util.TimerTask;

public class ShabotMatch extends TimerTask {
    public void run() {
            try {
                if (ShabotConfig.getSummoner().isInGame()) {
                    Shabot.id++;
                    Status status = ShabotConfig.getTwitterInstance().updateStatus(ShabotConfig.getSummoner().getName() + " is currently in game \nhttps://porofessor.gg/live/euw/Noctogone" + "\n\ntweet id: " + Shabot.id++);
                    status.getText();
                }
            } catch (TwitterException e) {
                e.printStackTrace();
            }
    }
}
