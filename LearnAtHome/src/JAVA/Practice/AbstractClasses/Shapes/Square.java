package JAVA.Practice.AbstractClasses.Shapes;

public class Square implements Shape2D{

    protected double side;
    protected String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getSqure() {
        return side*side;
    }

    @Override
    public String toString() {
        return  "\n"+getName() +
                "\nSide   = " + getSide() +
                "\nColor  = " + getColor()+
                "\nSquare = " + getSqure();
    }
}
