package GUI.w01.ex02;

public
    abstract class Figura
    implements Wyrysowywalny {

    int x, y;

    public Figura(){
        x = (int)(Math.random()*200);
        y = (int)(Math.random()*200);
    }

}
