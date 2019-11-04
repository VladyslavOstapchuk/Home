package GUI.w03;

public
    interface MyFuncInterface {

    void justFun();

    default void fun(){
        System.out.println("Domyslna metoda");
    }

}
