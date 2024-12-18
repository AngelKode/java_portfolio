package advanced;

import java.sql.SQLOutput;

public class ThreadClass{

    public static void main(String[] args) {
        //BLOCKED

        //Instance new thread
        //Thread myThread = new Thread(ThreadClass::threadProcess);

        //New thread to compare them
        //Thread myThreadTwo = new Thread(ThreadClass::threadProcess);

        //myThread.start();
        //myThreadTwo.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //State BLOCKED for infinite loop of the first thread
        //System.out.println(myThreadTwo.getState());


        //WATING
        //If the thread is waiting for other thread to finish
        Thread watingThread = Thread.currentThread();
        Thread processThread = new Thread(() -> {
            System.out.println(watingThread.getState());
            try {
                Thread.sleep(5000);
            }catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }
        });

        processThread.start();//Start task
        try {
            processThread.join();//Wait till task is done
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //RUNNABLE
        Thread runnableThread = new Thread(ThreadClass::threadProcess);
        runnableThread.start();
        System.out.println(runnableThread.getState());

        //TERMINATED
        try {
            runnableThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(runnableThread.getState());
            System.out.println(runnableThread.isAlive());
        }

    }

    public static synchronized void threadProcess() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
