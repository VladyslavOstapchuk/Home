package Basics.Threads.LocalSynchronize;

public class Main {
    public static void main(String[] args) {
        new Thread(new MyRunnableClass()).start();
        new Thread(new MyRunnableClass()).start();

        System.out.println("End value = " + Resource.value);
    }
}


