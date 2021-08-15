package fr.bxcchus_.util;

import java.util.Timer;
import java.util.TimerTask;

public class ShabotMatchScheduler {
    public void scheduler() {
        Timer timer = new Timer(); // creating timer
        TimerTask task = new ShabotMatch(); // creating timer task
        // scheduling the task for repeated fixed-delay execution, beginning after the specified delay
        timer.schedule(task, 1000, (long) 1.5e+6);
    }
}
