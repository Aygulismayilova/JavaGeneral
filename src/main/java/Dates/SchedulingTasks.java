package Dates;
//the class that represents our task

import java.util.Timer;
import java.util.TimerTask;

class EatPeopleTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("eat all the people");
        System.out.println("end of task");
    }
}


public class SchedulingTasks {
    public static void main(String[] args) {

        EatPeopleTask task1 = new EatPeopleTask();
        Timer timer = new Timer();
        timer.schedule(task1, 5000,5);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        timer.cancel();
    }


    //Timer and TimerTask classes
    // TimerTask  implements Runnable
}
