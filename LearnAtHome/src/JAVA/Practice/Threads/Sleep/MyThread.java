package Basics.Threads.Sleep;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
            try {
                //Thread sleeps for 1 sec
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
