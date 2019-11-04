package GUI.w07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public
    class MyGridLayout
    extends JPanel {

    MyButton[] buttons;
    Color[] colors = {
        Color.PINK,
        Color.RED,
        Color.BLUE,
        Color.BLACK,
        Color.CYAN,
        Color.DARK_GRAY,
        Color.PINK,
        Color.RED,
        Color.BLUE,
        Color.BLACK,
        Color.CYAN,
        Color.DARK_GRAY
    };

    public MyGridLayout(MyColorPanel mcp){
        this.setBackground(Color.PINK);

        this.setLayout(new GridLayout(3, 4));

        buttons = new MyButton[12];
        for(int i=0; i<buttons.length; i++) {
            buttons[i] = new MyButton("Click me" + i, i);
            this.add(buttons[i]);
            buttons[i].addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mcp.setBackground(
                            colors[
                                ((MyButton)e.getSource()).getNum()
                            ]
                        );
                    }
                }
            );
        }
    }
}

class MyButton
    extends JButton{

    int num;

    public MyButton(String label, int num){
        super(label);
        this.num = num;
    }

    public int getNum(){
        return num;
    }
}
