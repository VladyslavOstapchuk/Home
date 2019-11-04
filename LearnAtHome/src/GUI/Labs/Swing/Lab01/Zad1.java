package GUI.Labs.Swing.Lab01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad1 {
    int index;

    Zad1() {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Color[] colors = {Color.BLUE, Color.GREEN, Color.RED, Color.PINK, Color.CYAN,Color.YELLOW};

        JButton button = new JButton();
        button.setSize(150, 100);
        frame.add(button,BorderLayout.CENTER);

        index = 0;

        button.setBackground(colors[index++]);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (index == colors.length) index = 0;
                button.setBackground(colors[index++]);
                System.out.println(index);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Zad1();
    }
}

