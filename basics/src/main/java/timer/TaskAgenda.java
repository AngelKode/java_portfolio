package timer;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class TaskAgenda {
    public static void main(String[] args) {
        Timer timer = new Timer();
        AtomicInteger atomicCounter = new AtomicInteger(3); //Thread safe
        Toolkit tk = Toolkit.getDefaultToolkit();
        timer.schedule(new TimerTask() {
            private int maxNumExecutions = atomicCounter.getAndDecrement();
            @Override
            public void run() {
                maxNumExecutions--;
                if(maxNumExecutions < 1){
                    timer.cancel();
                }
                tk.beep();
                System.out.println("Run after 2 seconds");
            }
        },2000,5000);
    }
}
