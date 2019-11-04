package DianasLabs.Zestawy;

public class S19294_zestaw02 {
    public static void main(String[] args) {
        cwiczenie_01();
        cwiczenie_02();
        cwiczenie_03();
        cwiczenie_04();
        cwiczenie_05();
    }

    public static void cwiczenie_01() {
        // logiczne
        boolean bool = true;
        //liczb całkowitych
        byte b = 2;
        short sh = 231;
        char ch = 39423;
        int in = 3129345;
        long lon = 349093;
        //liczb rzeczywistych
        float fl = 123f;
        double doub = 13.83;
        //znak
        char ch1 = 'a';
        String strin = "Ala ma kota";

    }

    public static void cwiczenie_02() {
        int a = 534;
        //w dziesiętnej
        int a1 = 534;
        System.out.println(a1);
        //w binarnej
        int a2 = 0b1000010110;
        System.out.println(a2);
        //w oktalnej
        int a3 = 01026;
        System.out.println(a3);
        //w heksadecymalnej
        int a4 = 0x216;
        System.out.println(a4);
    }

    public static void cwiczenie_03() {
        int a12 = 1;
        //int 12a = 1;
        //int @asd = 1;
        //int void = 1;
        //int null = 1;
    }

    public static void cwiczenie_04() {
        //w imionach registr ma znaczenie
        char charvalue = 'a';
        char charValue = 'a';
    }

    public static void cwiczenie_05() {
        int a;
        //Zmiennej c tu nie mozna wywolac tak samo jak i b,
        // bo kazda zmienna moze istniec tylko w bloku, w ktorym ona byla zadeklarowana
        //c = 0;
        //b = 0;
        {
            int b;
            {
                {
                    int c;
                    //Mozemy skorzystac ze zmiennej tu, bo ona tu istnieje
                    a = 5;
                    b = 7;
                }
            }
        }
    }


}
