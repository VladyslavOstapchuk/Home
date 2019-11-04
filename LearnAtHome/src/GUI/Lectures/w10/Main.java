package GUI.w10;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public
    class Main
    extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            ()-> new Main()
        );
    }

    public Main(){

        TableModel dataModel = new StudentModel();

        JTable table = new JTable(dataModel);
        table.setDefaultRenderer(Color.class, new MyColorCellRenderer());
        //table.setCe
        JScrollPane scrollpane = new JScrollPane(table);

        this.add( scrollpane);

        this.setSize(640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
