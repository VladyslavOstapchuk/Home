package Home.JAVA.Classes;

public class A {

    public void aFunc(){
        System.out.println("aFunc");
    }

    //B can't change this method
    //final
    public final void foo(){
        System.out.println("foo of A");
    }

    private void privateAFunc(){
        System.out.println("privateAFunc");
    }
}
