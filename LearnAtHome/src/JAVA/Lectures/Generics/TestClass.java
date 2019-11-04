package Basics.Generics;

public class TestClass {
    private String text;

    TestClass(){
        this("test");
    }

    TestClass(String text){
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Text : " + text;
    }
}
