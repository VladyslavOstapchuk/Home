package GUI.w10;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public
    class StudentModel
    extends AbstractTableModel
{

    ArrayList<Student> al;

    public StudentModel() {
        al = new ArrayList<>();

        al.add(
                new Student("Jan", 1974, "s0002", null)
        );
        al.add(
                new Student("Ola", 1990, "s0005", null)
        );
    }

    @Override
    public int getRowCount() {
        return al.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student s = al.get(rowIndex);
        switch(columnIndex){
            case 0:
                return s.name;
            case 1:
                return s.birthYear;
            case 2:
                return s.sKa;
            case 3:
                return s.img;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex,
                           int columnIndex){
        if(columnIndex == 0)
            return true;
        return false;
    }

    public void setValueAt(Object aValue,
                    int rowIndex,
                    int columnIndex){
        Student s = al.get(rowIndex);
        switch(columnIndex){
            case 0:
                s.name = (String)aValue;
        }

    }

}
