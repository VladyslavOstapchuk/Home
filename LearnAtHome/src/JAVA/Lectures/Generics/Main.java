package Basics.Generics;

public class Main {
    public static void main(String[] args) {
        MyGenArray<TestClass> myGenArray = new MyGenArray<>();

        myGenArray.addElementAtTheEnd(new TestClass());
        myGenArray.addElementAtTheEnd(new TestClass("my text"));

        myGenArray.showWholeArray();

        MyGenArray<Gen<TestClass>> gens = new MyGenArray<>();
        gens.addElementAtTheEnd(new Gen<TestClass>(new TestClass("my text")));
        gens.addElementAtTheEnd(new Gen<TestClass>(new TestClass()));

        gens.showWholeArray();

    }

}
