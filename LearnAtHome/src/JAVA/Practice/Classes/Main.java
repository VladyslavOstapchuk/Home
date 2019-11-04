package Home.JAVA.Classes;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A bObj = new B();

        a.aFunc();
        a.foo();

        //B hasn't access to the A's private method
        b.bFunc();
        b.foo();

        c.cFunc();

        //Object bObj can use only methods of A class
//        bObj.bFunc();
    }
}
