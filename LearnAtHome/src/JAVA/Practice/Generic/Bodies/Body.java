package JAVA.Practice.Generic.Bodies;

public class Body {
    protected String title;

    public Body(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
