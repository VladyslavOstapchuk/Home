package JAVA.Practice.Annotation;

//Ignores warnings
//@SuppressWarnings("unused")
@SuppressWarnings("all")
public class Inherited extends Parent {

    //Shows that this method overrides parents method
    @Override
    protected void foo() {
        super.foo();
    }
}
