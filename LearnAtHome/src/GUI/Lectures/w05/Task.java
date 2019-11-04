package GUI.w05;

public
    class Task
    implements Runnable{

    private static Object flag = new Object();

    private char chr;

    public Task(char chr){
        this.chr = chr;
    }

    @Override
    public void run() {
        synchronized(flag) {
            for (int i = 0; i < 100; i++) {
                System.out.print(chr);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
