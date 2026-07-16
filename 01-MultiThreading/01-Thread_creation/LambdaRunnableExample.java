package Multithreading;

public class LambdaRunnableExample {

    public static void main(String[] args) {

        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda thread: " + i);
            }
        };

        Thread t1 = new Thread(task);
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
        }
    }
}

/*
Possible Output:

Lambda thread: 1
Main thread: 1
Lambda thread: 2
Main thread: 2
...

👉 Order changes every run
*/
