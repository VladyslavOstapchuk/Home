package GUI.w01.ex02;

import java.awt.*;

public
    class Prostokat
    extends Figura {

    int bok1;
    int bok2;

    public Prostokat(int bok1, int bok2){
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public void rysuj(Graphics g) {
        g.drawRect( x, y, bok1, bok2);
    }
}
