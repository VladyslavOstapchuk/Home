package GUI.w08;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;

public
    class Main
    extends JFrame{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()->{
                    new Main();
                }
        );
    }

    Student[] tab = {
        new Student("Jan", "s0534"),
        new Student("Jola", "s1701"),
        new Student("Kazio", "s5476"),
        null
    };

    public Main(){
        //setSize(640, 480);

        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.BLUE);
        jp1.setPreferredSize(new Dimension( 640, 480));

        JComboBox<Student> jcb = new JComboBox<>();

        jcb.setModel(
            new MyComboBoxModel(tab)
        );

        jcb.setRenderer(
            new MyStudentCellRenderer()
        );

        jp1.add(jcb);


        JButton jb = new JButton("Click me");
        jb.addActionListener(
                (e)->{
                    tab[3] = new Student("tomasz", "s1071");
                }

        );
        jp1.add(jb);


        JPanel jp2 = new JPanel();
        jp2.setBackground(Color.RED);
        jp2.setPreferredSize(new Dimension( 640, 480));

        JList<Student> jlist = new JList<>(tab);

        jp2.add(jlist);

        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("JPanel1", jp1);
        jtp.addTab("JPanel2", jp2);

        add(jtp);

        this.setDefaultCloseOperation(
           JFrame.EXIT_ON_CLOSE
        );

        this.addComponentListener(
            new ComponentAdapter() {
                @Override
                public void componentResized(ComponentEvent e) {
                    super.componentResized(e);
                    System.out.println("zmiana rozmiaru");
                }
            }
        );

        setVisible(true);
        pack();
    }

}
