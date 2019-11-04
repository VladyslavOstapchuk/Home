package JAVA.Practice.Object;

public class Main {
    public static void main(String[] args) {

        SimpleObject simpleObject1 = new SimpleObject(2);
        SimpleObject simpleObject2 = new SimpleObject(2);

        //Class Object is parent class of all classes
        Object simpleObject3 = new SimpleObject(2);

        //Comparing
        System.out.println(simpleObject1.equals(simpleObject3));

        //Return info about class
        System.out.println(SimpleObject.class);
        System.out.println(simpleObject1.getClass());

        //        Class clazz = simpleObject1.getClass();
        Class clazz = SimpleObject.class;




    }
}
