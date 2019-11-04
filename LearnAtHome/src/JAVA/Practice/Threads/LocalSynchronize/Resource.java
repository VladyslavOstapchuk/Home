package Basics.Threads.LocalSynchronize;

public class Resource{
    static int value = 0;

    public static synchronized void incValue(){
        System.out.println(value++);
    }
}
