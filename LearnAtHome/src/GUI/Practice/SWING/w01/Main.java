package GUI.Practice.w01.w01;

import javax.swing.*;

public class Main extends JFrame{
  //3
  JFrame frame;

    //2
//    JFrame frame;
//
//    Main(){
//        frame = new JFrame();
//
//        JButton button = new JButton("Click");
//        button.setBounds(500,400,100,100);
//
//        frame.add(button);
//        frame.setLayout(null);
//        frame.setSize(400,500);
//
//        frame.setLayout(null);
//        frame.setVisible(true);
//    }

    //3

    Main(){
        JButton button = new JButton("Click");
        button.setBounds(100,100,100,100);
        add(button);

        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }



    public static void main(String[] args) {
        //3
        new Main();
        //2
//        new Main();
        //1
//        JFrame frame = new JFrame();
//        JButton button = new JButton("test");
//        button.setSize(100, 30);
//        button.setBounds(500 / 2, 400 / 2, 100, 100);
//
//        frame.add(button);
//        frame.setSize(500, 400);
//        frame.setLayout(null);
//
//        frame.setVisible(true);


    }
}
