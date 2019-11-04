package GUI.w07;

import javax.swing.*;
import java.awt.*;

public
    class MyFlowLayout
    extends JPanel {

    JButton[] buttons;

    public MyFlowLayout(MyColorPanel mcp){
        this.setBackground(Color.RED);

        this.setLayout(new FlowLayout());

        buttons = new JButton[10];
        for(int i=0; i<buttons.length; i++) {
            buttons[i] = new JButton("Click me" + i);
            this.add(buttons[i]);
        }
    }
}
