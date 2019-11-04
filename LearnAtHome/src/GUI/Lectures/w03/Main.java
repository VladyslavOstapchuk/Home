package GUI.w03;

public
    class Main {


    public static void main(String[] args) {
        MyColor color = MyColor.RED;
/*
        int wrt = MyColor.RED.getStan() | MyColor.BLUE.getStan();

        switch (color){
            case RED:
                System.out.println("czerwony");
                break;
            case BLUE:
                System.out.println("niebieski");
                break;
        }
*/
        MyFuncInterface z1 = new MyClass();
        z1.justFun();

        MyFuncInterface z2 = new MyFuncInterface() {
            @Override
            public void justFun() {
                System.out.println("justFun wywolanie z klasy anonimowej");
            }
        };
        z2.justFun();

        MyFuncInterface z3 = () -> {
            System.out.println("justFun z lambdy");
        };

        MyFuncInt z4 = (str) -> {
            return true;
        };

        // =====================

        int[] tab = {10, 20, 30, 40};
        for(int i=0; i<tab.length; i++){
            System.out.println(tab[i]);
        }

        for( int i : tab){
            System.out.println(i);
        }
    }
}

