package Basics.Generics;

public class Gen <T> {
    private T object;

    Gen(T object) {
        this.object = object;
    }

    T getObject() {
        return object;
    }

    public String showType(){
       return ("Type of object : " + getObject().getClass().getName() + "\n");
    }

    public String showValue(){
        return ("Value = " + getObject() + "\n");
    }

    @Override
    public String toString() {
        return showType() + showValue();
    }
}
