package JAVA.Practice.Lambda;

public class Lambda {
    public static void main(String[] args) {


        Basics.AbstracClasses.Lambda.TestInterface testInterface = () -> System.out.println("Test");
        testInterface.testMethod();
        int a = 11, b = 10;
        Basics.AbstracClasses.Lambda.Count count = (double x, double y) -> x + y;
        System.out.println(count.sum(a, b));

        TestClass testClass = new TestClass() {
            @Override
            public void testMethod() {

            }
        };
    }
}
