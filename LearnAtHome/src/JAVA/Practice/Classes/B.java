package Home.JAVA.Classes;

public class B extends A {

    public void bFunc() {
        System.out.println("bFunc");
    }

    //B can't overwrite this method cause it's final
//    public void foo(){
//    }
}
