package Basics.Threads.Synchronize;

public class Resource {
    int value;

    public Resource(int value) {
        setValue(value);
    }

    public Resource() {
        setValue(0);
    }

    synchronized public void setValue(int value) {
        this.value = value;
    }

    //Another thread can't use this func till current thread didn't execute this
    synchronized public void changeValue() {
        value++;
        System.out.println(value);
    }


}
