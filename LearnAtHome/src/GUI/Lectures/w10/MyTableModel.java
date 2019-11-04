package GUI.w10;

import javax.swing.table.AbstractTableModel;
import java.awt.*;

public
    class MyTableModel
    extends AbstractTableModel {

    String[] columns = {"Integer", "String", "Color"};

    Integer[] ints = {
        1, 2, 3
    };
    String[] strings = {
        "jeden", "dwa", "trzy"
    };
    Color[] colors = {
        Color.RED, Color.BLUE, Color.CYAN
    };

    @Override
    public String getColumnName(int index){
        return columns[index];
    }

    @Override
    public int getRowCount() {
        return colors.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return ints[rowIndex];
            case 1:
                return strings[rowIndex];
            case 2:
                return colors[rowIndex];
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int index){
        /*
        Class c = super.getColumnClass(index);
        System.out.println(c);

        return c;
        */
        switch(index){
            case 0:
            case 1:
                return Object.class;
            case 2:
                return Color.class;
        }
        return null;
    }
}
