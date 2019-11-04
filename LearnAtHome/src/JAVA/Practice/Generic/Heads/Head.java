package JAVA.Practice.Generic.Heads;

public class Head {
    protected String title;

    public Head(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
