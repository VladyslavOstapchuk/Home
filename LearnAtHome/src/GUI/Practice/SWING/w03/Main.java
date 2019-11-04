package GUI.Practice.w01.w03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    JFrame frame;
    int value;

    Main(){
        value = 0;

        frame = new JFrame();
        frame.setSize(500,400);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Click");
        JLabel label = new JLabel("Fuck");

        frame.add(button, BorderLayout.SOUTH);
        frame.add(label,BorderLayout.NORTH);

        label.setText(String.valueOf(value));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;

                label.setText(String.valueOf(value));
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
