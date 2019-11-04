package Basics.Bits;

public class Color {
    ////
    //| for +
    //& for -
    ////
    //
    int value;

    //
    public Color(int r, int g, int b) {
        refreshValue(r, g, b);
    }

    //
    @Override
    public String toString() {
        return super.toString() + " " + returnRGB() + "hash : " + this.hashCode();
    }

    //
    public void refreshValue(int r, int g, int b) {
        value |= r;
        value <<= 8;
        value |= g;
        value <<= 8;
        value |= b;
    }

    //
    public String returnRGB() {
        int tmp = value;
        int mask = 0b11111111;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("red : " + ((tmp >> 16) & mask) + "; ");
        stringBuilder.append("green : " + ((tmp >> 8) & mask) + "; ");
        stringBuilder.append("blue : " + (tmp & mask) + "; ");
        return stringBuilder.toString();
    }

}
