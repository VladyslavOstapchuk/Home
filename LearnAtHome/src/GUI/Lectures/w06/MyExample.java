package GUI.w06;

import java.util.ArrayList;

public
    class MyExample
    implements Runnable{

    public MyExample(){
        new Thread(this).start();
    }

    ArrayList<MyListener> myListeners = new ArrayList<>();

    public void addMyListener(MyListener myListener){
        myListeners.add(myListener);
    }

    public void fireMyEventHandeling(MyEvent evt){
        for( MyListener myListener : myListeners){
            myListener.myEventHandeling(evt);
        }
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            try {
                Thread.sleep(5000+(int)(Math.random()*10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fireMyEventHandeling(
                new MyEvent()
            );
        }
    }
}
