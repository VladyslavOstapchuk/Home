package JAVA.Practice.Annotation;

public class Parent {
    protected void foo(){
        System.out.println("Just func");
    }

    //Shows that method is outdated
    @Deprecated
    protected void old(){
        System.out.println("Old method");
    }

    protected void callOld(){
        old();
    }
}
