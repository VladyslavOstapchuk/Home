package GUI.w07;

import javax.swing.*;
import java.awt.*;

public
    class MyActionPanel
    extends JPanel {

    JLabel jl1;
    JTextField jtf;
    JLabel jl2;
    JCheckBox jcb;

    public MyActionPanel(MyColorPanel mcp){
        setBackground(Color.PINK);

        setLayout(new GridLayout(2,2));

        jl1 = new JLabel("Lable1");
        jl2 = new JLabel("Label2");

        jtf = new JTextField();
        jcb = new JCheckBox();

        add( jl1);
        add( jtf);
        add(jl2);
        add(jcb);

    }
}
