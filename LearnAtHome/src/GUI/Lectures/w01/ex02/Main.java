package GUI.w01.ex02;

import java.awt.*;

public
    class Main
    extends Frame {

    public static void main(String[] args){
        new Main();
    }

    //Figura tab[] = new Figura[100];
    Wyrysowywalny tab[] = new Wyrysowywalny[100];

    public Main(){
        tab[0] = new Kolo(10);
        tab[1] = new Kwadrat( 20);
        tab[2] = new Prostokat( 10, 20);

        this.setSize( 640, 480);
        this.setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        for(int i=0; i<tab.length; i++){
            if(tab[i]!=null)
                tab[i].rysuj(g);
        }
    }
}