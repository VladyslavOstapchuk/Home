package GUI.w07;

import javax.swing.*;
import java.awt.*;

public
    class MyJFrame
    extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            ()-> {
                new MyJFrame();
            }
        );
    }

    MyColorPanel mcp;

    public MyJFrame(){

        mcp = new MyColorPanel();

        this.add(
            new MyFlowLayout(mcp), BorderLayout.PAGE_START
        );
        this.add(
            new MyGridLayout(mcp), BorderLayout.PAGE_END
        );

        this.add(
            new MyActionPanel(mcp), BorderLayout.LINE_START
        );

        this.add(
            mcp, BorderLayout.CENTER
        );
        this.setSize( 640, 480);
        this.setVisible(true);
    }
}
