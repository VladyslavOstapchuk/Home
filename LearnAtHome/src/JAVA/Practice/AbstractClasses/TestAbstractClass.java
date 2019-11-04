package JAVA.Practice.AbstractClasses;

//Difference between abstract class and interface :
//1. Class can inherit one class and many interfaces
//2. Interface doesn't realize method just contain signature of it

public abstract class TestAbstractClass {
    //
    public abstract void abstractMethod();
    //
    public void method() {
        System.out.println("method of abstract class");
    }
}
