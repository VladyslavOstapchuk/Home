package Basics.Threads.Synchronize;

public class Main {
    public static void main(String[] args) {
        //We use it while two threads work together on same resources (For example file)
        Resource resource = new Resource();

        MyThread myThread1 = new MyThread(resource);
        MyThread myThread2 = new MyThread(resource);

        myThread1.start();
        myThread2.start();


        System.out.println(resource.value);
    }
}
