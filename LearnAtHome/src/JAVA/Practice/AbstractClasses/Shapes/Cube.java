package JAVA.Practice.AbstractClasses.Shapes;

public class Cube extends Square implements Shape3D {

    public Cube(double side, String color) {
        super(side, color);
    }

    @Override
    public String getName() {
        return "Cube";
    }

    @Override
    public double getSqure() {
        return 6 * super.getSqure();
    }

    @Override
    public double getVolume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nVolume = " + getVolume();
    }
}
