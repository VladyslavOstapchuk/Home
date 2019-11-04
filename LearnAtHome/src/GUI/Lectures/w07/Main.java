package GUI.w07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public
    class Main
    extends Frame {

    public static void main(String[] args) {
        new Main();
    }

    public Main(){

        setLayout(new BorderLayout());

        Button b = new Button("click me");
        b.addActionListener(
                (e)->{
                    System.out.println("click");
                }
        );
        b.setSize( 100, 50);


        Button b1 = new Button("click me1");
        b1.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("click1");
                }
            }
        );
        b1.setSize( 100, 20);
        b1.setLocation( 100, 100);

        Button b2 = new Button("click me2");
        Button b3 = new Button("click me3");
        Button b4 = new Button("click me4");

        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.PAGE_START);
        add(b3, BorderLayout.PAGE_END);
        add(b4, BorderLayout.LINE_START);
        add(b, BorderLayout.LINE_END);

        setSize(640, 480);
        setVisible(true);

        addWindowListener(
            new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            }
        );
    }


}
