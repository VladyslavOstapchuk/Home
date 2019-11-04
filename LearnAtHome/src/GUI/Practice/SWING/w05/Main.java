package GUI.Practice.w01.w05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    JFrame frame;

    Main(){
        frame = new JFrame();
        frame.setSize(640,500);

        JTextArea textArea = new JTextArea();

        JButton button = new JButton("SHOW");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(textArea.getText());
            }
        });

        frame.add(textArea,BorderLayout.NORTH);
        frame.add(button,BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

