package GUI.w10;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public
    class MyColorCellRenderer
    extends JPanel
    implements TableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if(column == 2) {
            Color color = (Color) value;
            this.setBackground(color);
        }else{
            this.setBackground(Color.WHITE);
        }
        return this;
    }
}
