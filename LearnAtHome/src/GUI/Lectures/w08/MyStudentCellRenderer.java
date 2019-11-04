package GUI.w08;

import javax.swing.*;
import java.awt.*;

public
    class MyStudentCellRenderer
    implements ListCellRenderer<Student> {

    JPanel jp;

    JLabel lImie;
    JLabel lSka;

    public MyStudentCellRenderer(){
        jp = new JPanel();
        jp.setBackground(Color.PINK);

        lImie = new JLabel();
        lSka = new JLabel();

        jp.add(lImie);
        jp.add(lSka);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Student> list, Student value, int index, boolean isSelected, boolean cellHasFocus) {
        if(value == null){
            lImie.setText("????");
            lSka.setText("!!!!");
        }else {
            lImie.setText(value.imie);
            lSka.setText(value.ska);
        }
        jp.setBackground(
            new Color(
                (int)(Math.random()*255),
                (int)(Math.random()*255),
                (int)(Math.random()*255)
            )
        );
        return jp;
    }
}
