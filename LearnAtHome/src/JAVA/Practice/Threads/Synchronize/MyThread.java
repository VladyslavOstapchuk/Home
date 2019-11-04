package Basics.Threads.Synchronize;

public class MyThread extends Thread {
    Resource resource;

    public MyThread(Resource resource) {
        setResource(resource);
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeValue();
    }
}
