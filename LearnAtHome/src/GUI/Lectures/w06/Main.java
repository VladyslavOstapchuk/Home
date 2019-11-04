package GUI.w06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public
    class Main {

    public static void main(String[] args) {
        Frame f = new Frame();

        f.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        super.windowClosing(e);
                        System.out.println("hmm a moze???");
                    }
                }
        );

        f.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("zamykanie");
                        //System.exit(0);
                    }
                }

                //new MyWindowListener(f)
                /*new WindowListener() {
                    @Override
                    public void windowOpened(WindowEvent e) {
                        f.setVisible(false);
                    }

                    @Override
                    public void windowClosing(WindowEvent e) {

                    }

                    @Override
                    public void windowClosed(WindowEvent e) {

                    }

                    @Override
                    public void windowIconified(WindowEvent e) {

                    }

                    @Override
                    public void windowDeiconified(WindowEvent e) {

                    }

                    @Override
                    public void windowActivated(WindowEvent e) {

                    }

                    @Override
                    public void windowDeactivated(WindowEvent e) {

                    }
                }*/
        );


        f.setVisible(true);

        //JFrame fr = new JFrame();
        //SwingUtilities.invokeLater(...);
/*
        while(true){
            System.out.println("tu");
        }
        */

        MyExample mex = new MyExample();
        mex.addMyListener(
                new MyAdapter() {
                    @Override
                    public void myEventHandeling(MyEvent evt) {
                        System.out.println("responce "+evt);
                    }
                }
        );
    }
}

class MyWindowListener
    implements WindowListener {

    Frame f;

    public MyWindowListener(Frame f){
        this.f = f;
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

