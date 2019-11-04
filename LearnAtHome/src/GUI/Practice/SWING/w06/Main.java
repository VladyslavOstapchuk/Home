package GUI.Practice.w01.w06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    Main() {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(200, 100);

        ////

        JLabel lLabel = new JLabel("Login");
        JLabel pLabel = new JLabel("Password");

        lLabel.setSize(30,50);
        pLabel.setSize(30,50);

        JPasswordField password = new JPasswordField();
        JTextField login = new JTextField();

        ////

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));

        panel.add(lLabel);
        panel.add(login);
        panel.add(pLabel);
        panel.add(password);

        ////

        JButton button = new JButton("Log in");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(
                        pLabel.getText() + " : " + login.getText() +
                                ";\n" + lLabel.getText() + "    : " + password.getText() + ";"
                );
            }
        });

        ////

        frame.add(panel, BorderLayout.NORTH);
        frame.add(button,BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
