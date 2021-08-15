package fr.bxcchus_.main;

import fr.bxcchus_.config.ShabotConfig;
import fr.bxcchus_.util.ShabotMatchScheduler;
import fr.bxcchus_.util.ShabotOverviewScheduler;

import twitter4j.TwitterException;

public class Shabot {
    public static int id = 230;

    public static void main(String[] args) throws TwitterException {

        // Load Shabot
        ShabotConfig.getRiotApiKey();
        System.out.println("Shabot V1 is enabled");

        // Instance Twitter API
        ShabotConfig.getTwitterInstance();

        // Instance Class & Objects
        ShabotMatchScheduler smc = new ShabotMatchScheduler();
        ShabotOverviewScheduler soc = new ShabotOverviewScheduler();

        // Scheduler
        smc.scheduler();
        soc.scheduler();
    }
}

