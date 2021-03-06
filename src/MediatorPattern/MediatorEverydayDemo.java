package MediatorPattern;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by WeichengXu on 2016/5/23.
 */
public class MediatorEverydayDemo {

    private Toolkit toolkit;
    private Timer timer;

    public MediatorEverydayDemo(int seconds) {

        toolkit = Toolkit.getDefaultToolkit();

        //Timer is the mediator that acts as hub or router
        timer = new Timer();
        //timer knows about two colleagues, colleagues do not know about each other
        //this makes colleagues loose coupling,
        //so that each colleague can be reusable, because they are not hard referenced to one another
        timer.schedule(new ReminderTask(), seconds * 1000);
        timer.schedule(new ReminderTaskWithoutBeep(), seconds * 2 * 1000);
    }

    public static void main(String[] args) {
        System.out.println("About to schedule a task.");
        new MediatorEverydayDemo(3);
        System.out.println("Task scheduled.");
    }

    class ReminderTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Time is up!");
            toolkit.beep();
        }
    }

    class ReminderTaskWithoutBeep extends TimerTask {

        @Override
        public void run() {
            System.out.println("Time is really up!");
            timer.cancel();
        }
    }
}


