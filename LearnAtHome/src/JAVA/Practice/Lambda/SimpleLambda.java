package JAVA.Practice.Lambda;

public class SimpleLambda {
    public static void main(String[] args) {
        //param list -> body of method
        //() -> {}

        Operation operation = (var1, var2) -> {return var1 + var2;};
        System.out.println(operation.foo(1,1));
    }
}
