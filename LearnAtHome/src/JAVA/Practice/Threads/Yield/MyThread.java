package Basics.Threads.Yield;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
            //Gives his execution time to another thread
            Thread.yield();
        }
    }
}
