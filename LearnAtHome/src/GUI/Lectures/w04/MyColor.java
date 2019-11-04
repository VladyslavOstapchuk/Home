package GUI.w04;

public
    class MyColor {

    int r, g, b;

    public MyColor(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String toString() {
        return "[" + r + ", " + g + ", " + b + "]\n";
    }
}
