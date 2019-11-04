package Basics.Threads.LocalSynchronize;

public class MyRunnableClass implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++)
            Resource.incValue();
        Thread.yield();
    }
}
