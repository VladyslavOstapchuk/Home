package DianasLabs.Zestawy;

import java.lang.reflect.Array;

public class s19294_zestaw05 {

    public static void main(String[] args) {
        czwiczenie_01();
        System.out.println();
        czwiczenie_02();
        System.out.println();
        czwiczenie_03();
        System.out.println();
        czwiczenie_04();
        System.out.println();
        czwiczenie_05();
        System.out.println();
        czwiczenie_06();
        System.out.println();
        czwiczenie_07();
        System.out.println();
        czwiczenie_08();
    }

    public static void czwiczenie_01() {
        System.out.println("//===cw01");
        int[] tablicaInt = new int[10];

        System.out.println("Ilosc elementow tablicy = " + tablicaInt.length);
    }

    public static void czwiczenie_02() {
        System.out.println("//===cw02");
        int[] tablicaInt = new int[10];

        System.out.println("Tablica :");
        for (int i = 0; i < tablicaInt.length; i++) {
            tablicaInt[i] = (int) (Math.random() * 2);
            System.out.print(tablicaInt[i] + " ");
        }
        System.out.println();
    }

    public static void czwiczenie_03() {
        System.out.println("//===cw03");
        System.out.println("Tablica :");

        int[] tablicaInt = new int[10];
        for (int i = 0; i < tablicaInt.length; i++) {
            tablicaInt[i] = (int) (Math.random() * 2);
            System.out.print(tablicaInt[i] + " ");
        }
        System.out.println();

        int zera = 0;
        int jedynki = 0;

        for (int i = 0; i < tablicaInt.length; i++) {
            if (tablicaInt[i] == 1) jedynki++;
            else zera++;
        }

        System.out.println("\nIlosc 1 : = " + jedynki);
        System.out.println("Ilosc 0 : = " + zera);
    }

    public static void czwiczenie_04() {
        System.out.println("//===cw04");
        double tablicaDouble[] = new double[10];

        for (int i = 0; i < tablicaDouble.length; i++) {
            tablicaDouble[i] = (Math.random() * 100);
        }

        System.out.println("Tablica :");
        for (int i = 0; i < tablicaDouble.length; i++) {
            System.out.print(tablicaDouble[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Elementy o parzystym indeksie :");
        for (int i = 0; i < tablicaDouble.length; i++) {
            if (i % 2 == 0)
                System.out.print("index = " + i + " " + tablicaDouble[i] + "\n");
        }
        System.out.println();

        System.out.println("Parzyste gdy jest przekonwertowane w int ");
        for (int i = 0; i < tablicaDouble.length; i++) {
            if ((int) tablicaDouble[i] % 2 == 0)
                System.out.print(tablicaDouble[i] + "\n");
        }

    }

    public static void czwiczenie_05() {
        System.out.println("//===cw05");
        int tab[] = new int[2];
        //Jesli zainijializowac tablice to bedzie wypisany adres tablicy
        System.out.println(tab);
    }

    public static void czwiczenie_06() {
        System.out.println("//===cw06");
        //Jest zainijowana tablica z trzech elementow
        int[] tab = {789, 678, 567};
        //Wykonuje dzialania na wszystkich elementach tablicy
        //Wypisuje rezultat roznicy elementow na pozycjach i i j
        for (int i = 0; i < tab.length; i++) {
            for (int j = i; j < tab.length; j++) {
                System.out.println(tab[i] - tab[j]);
            }
        }
    }

    public static void czwiczenie_07() {
        System.out.println("//===cw07");
        String[] slowa = {
                "Ala ", " kota ", "ma", "ma", "a", " kot ", " Ale "
        };

        System.out.print(slowa[0]);
        System.out.print(slowa[2]);
        System.out.print(slowa[1]);
        System.out.print(slowa[4]);
        System.out.print(slowa[5]);
        System.out.print(slowa[3]);
        System.out.print(slowa[6]);
        System.out.println();
    }

    public static void czwiczenie_08() {
        System.out.println("//===cw08");
        char[] tablicaChar = new char[10];

        for(int i = 0; i < tablicaChar.length; i ++){
            tablicaChar[i] = (char) (65 + (int) (Math.random() * 26));
        }

        System.out.println("Tablica pierwotna :");
        for(int i = 0 ; i < tablicaChar.length; i++){
            System.out.print(tablicaChar[i] + " ");
        }
        System.out.println();

        char[] tablicaCharOdwrocona = new char[tablicaChar.length];

        int k = tablicaChar.length - 1;
        for(int i = 0; i < tablicaCharOdwrocona.length; i++){
            tablicaCharOdwrocona[i] = tablicaChar[k--];
        }

        System.out.println("\nTablica odwrocona :");
        for(int i = 0 ; i < tablicaCharOdwrocona.length; i++){
            System.out.print(tablicaCharOdwrocona[i] + " ");
        }
    }
}
