package GUI.w01.ex02;

import java.awt.*;

public
    class Kolo
    extends Figura{

    int promien;

    public Kolo(int promien){
        super();
        this.promien = promien;
    }

    @Override
    public void rysuj(Graphics g) {
        g.drawOval( x, y,2*promien,2*promien);
    }
}
