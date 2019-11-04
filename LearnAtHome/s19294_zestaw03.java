package DianasLabs;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class s19294_zestaw03 {

    public static void main(String[] args) {
        cwiczenie_01();
        cwiczenie_02();
        cwiczenie_03();
        cwiczenie_04();
        cwiczenie_05();
        cwiczenie_06();
        cwiczenie_07();
        cwiczenie_08();
    }

    public static void cwiczenie_01() {
        boolean czyPada = true;
        if (czyPada) {
            System.out.println("Tak,pada.");
        } else {
            System.out.println("Nie pada.");
        }
        System.out.println();
    }

    public static void cwiczenie_02() {
        int wrt = -4;
        boolean a = (wrt > -15 & wrt <= -10) | (wrt > -5 & wrt < 0) | (wrt > 5 & wrt < 10);
        boolean b = (wrt <= -13) | (wrt > -8 & wrt <= -3);
        boolean c = (wrt >= -4);
        if(a & b & c) System.out.println("Zmienna nalezy do czesci wspolnej zbiorow A, B i C");
        else System.out.println("Zmienna nie nalezy do czesci wspolnej zbiorow A, B i C");
        System.out.println();
    }

    public static void cwiczenie_03() {
        int wrt = -11;
        if((wrt > -15 & wrt < -10) ^ (wrt < -13)) System.out.println("Nalezy tylko do A");
        else if(wrt > -13) System.out.println("Nie nalezy do zadnego zbioru");
        else System.out.println("Nalezy do A i B");
        System.out.println();
    }

    public static void cwiczenie_04() {
        //Jest roznica w kolejnosci komputerowych i zwyklych obliczen
        double wrt = pow(sqrt(sqrt(2)),2) - 2;
        System.out.println(wrt);
        System.out.println();
    }

    public static void cwiczenie_05() {
        //Jest roznica w kolejnosci komputerowych i zwyklych obliczen
        double sqTwo = Math.sqrt(2);
        double wrt = pow(sqTwo,2) - 2;
        System.out.println(sqTwo);
        System.out.println(wrt);
        if(sqTwo == wrt) System.out.println("Przewidywanie nie sprawdzily sie");
        else System.out.println("Przewidywanie sprawdzily sie");
        System.out.println();
    }

    public static void cwiczenie_06() {
        int x = 4;
        long y = x * 4 - x++;
        if(y < 12) System.out.println("za malo");
        else System.out.println("w sam raz");
        //x++ najpierw wykorzystuje zmienna i tylko potem zwieksza ja na 1
        System.out.println();
    }

    public static void cwiczenie_07() {
        boolean czyPada, czySwieciSlonce;
        czyPada = true;
        czySwieciSlonce = true;
        if (czyPada == true & czySwieciSlonce == false) {
            System.out.println("Plucha � pada i nie swieci slonce.");
        }

        if (czyPada == true & czySwieciSlonce == true) {
            System.out.println("Tecza � pada i swieci slonce.");
        }

        if (czySwieciSlonce == true & czyPada == false) {
            System.out.println("Slonecznie - swieci slonce i nie pada.");
        }

        if (czySwieciSlonce == false & czyPada == false) {
            System.out.println("Pochmurno - nie swieci slonce i nie pada.");
        }
        System.out.println();
    }

    public static void cwiczenie_08() {
        boolean CzyPada = true;
        int a = CzyPada ? 5 : 8;
        System.out.println(a);
        System.out.println();
    }
}


