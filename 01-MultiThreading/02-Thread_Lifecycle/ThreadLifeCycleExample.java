package Multithreading;

class MyThread extends Thread {

    @Override
    public void run() {

        try {
            System.out.println("Thread is running..."); // RUNNING

            Thread.sleep(2000); // WAITING / TIMED WAITING

            System.out.println("Thread resumed after sleep");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread finished execution"); // TERMINATED
    }
}

public class ThreadLifecycleExample {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        // NEW state
        System.out.println("State after creation: " + t1.getState());

        t1.start(); // moves to RUNNABLE

        // Give some time to start
        try { Thread.sleep(100); } catch (Exception e) {}

        System.out.println("State after start(): " + t1.getState());

        try {
            t1.join(); // main waits for thread → WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TERMINATED state
        System.out.println("State after completion: " + t1.getState());
    }
}

/*
Expected Output (approx):

State after creation: NEW
Thread is running...
State after start(): RUNNABLE
Thread resumed after sleep
Thread finished execution
State after completion: TERMINATED

👉 Exact timing may vary
*/
