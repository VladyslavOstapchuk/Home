package GUI.w01.ex02;

import java.awt.*;

public
class Kwadrat
        extends Figura {

    int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    @Override
    public void rysuj(Graphics g) {
        g.drawRect(x, y, bok, bok);
    }
}
