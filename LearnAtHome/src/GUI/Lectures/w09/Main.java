package GUI.w09;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public
    class Main
    extends JFrame {

    public static void main(String[] args){
        SwingUtilities.invokeLater(
            ()-> {
                new Main();
            }
        );
    }

    public Main(){
        JPanel jp = new JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                Dimension componentSize =  this.getSize();
                double width = componentSize.getWidth();
                double height = componentSize.getHeight();

                g.setColor(Color.YELLOW);
                for( int i=0; i<height; i+=10){
                    g.drawLine( 0, i, (int)width, i);
                }
                for( int i=0; i<width; i+=10){
                    g.drawLine( i, 0, i, (int)height);
                }
            }

        };
        jp.setBackground(Color.RED);

        jp.setPreferredSize(
           new Dimension( 5000, 4000)
        );

        JTextPane jtp = new JTextPane();
        jtp.setFont(
           new Font(
               "Arial Bold",
               Font.ITALIC,
               25
           )
        );

        JEditorPane jep = new JEditorPane();
        try {
            jep.setPage("http://tomaszew.pjwstk.edu.pl");
        } catch (IOException e) {
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(jep);

        this.add(jp);

        JPanel nav = new JPanel();

        JButton jb = new JButton("Click me");

        jb.addActionListener(
            (e)->{
                Color c = JColorChooser.showDialog(
                    Main.this,
                        "Color chooser",
                        null
                );
                jp.setBackground(c);
            }
        );

        nav.add(jb);

        this.add( nav, BorderLayout.PAGE_END);
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
