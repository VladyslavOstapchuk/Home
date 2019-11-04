package DianasLabs.Zestawy;

public class s19294_zestaw04 {

    public static void main(String[] args) {
        cwiczenie_01();
        cwiczenie_03();
        cwiczenie_06();
        cwiczenie_07();
    }

    public static void cwiczenie_01() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("\n");
    }

    public static void cwiczenie_03() {
        int a = 0;
        while (a < 5) {            // Pętla "while" służy do cyklicznego wykonania pewnego
            System.out.println(a);// fregmentu kodu tak długo, jak długo określony warunek jest prawdziwy
            a++;                 // i dopóty warunek pętli ma wartość "true'
        }

        System.out.println("\n");

        int b = 0;                  // Działa tak samo jak pętla "while" ale różnica polega na tym,
        do {
            System.out.println(b);// że w pętli "while" prawdzany jest przed wykonaniem ciała pętli,
            b++;                  //natomiast w pętli DO-WHILE po.
        }
        while (b < 5);

        System.out.println("\n");
    }


    public static void cwiczenie_06() {
        for (int i = -1500; i <=1500; i++) {
            if (i % 3 == 0 || i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    public static void cwiczenie_07() {
        System.out.println("*:");
        for (int i = 1; i <= 6; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


