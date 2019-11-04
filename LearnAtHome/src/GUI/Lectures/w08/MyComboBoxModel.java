package GUI.w08;

import javax.swing.*;
import javax.swing.event.ListDataListener;

public
    class MyComboBoxModel
    implements ComboBoxModel<Student> {

    Student[] students;

    public MyComboBoxModel(Student[] students){
        this.students = students;
    }


    Object selectedItem = null;

    @Override
    public void setSelectedItem(Object anItem) {
        System.out.println("setSelectedItem"+anItem);
        selectedItem = anItem;
    }

    @Override
    public Object getSelectedItem() {
        System.out.println("getSelectedItem");
        return selectedItem;
    }

    @Override
    public int getSize() {
        System.out.println("getSize");
        return students.length;
    }

    @Override
    public Student getElementAt(int index) {
        System.out.println("getElementAt"+index);
        return students[index];
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
}
