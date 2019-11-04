package Basics.Threads.Join;

public class Main {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.start();

        //All threads wait for the end of myThread1

        try {
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyThread myThread2 = new MyThread();
        myThread2.start();

    }
}
