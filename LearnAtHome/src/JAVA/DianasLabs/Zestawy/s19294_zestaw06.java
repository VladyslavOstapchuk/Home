package DianasLabs.Zestawy;

public class s19294_zestaw06 {

    public static void main(String[] args) {
        System.out.println("\ncw1");
        czwiczenie_01();
        System.out.println("\ncw3");
        czwiczenie_03();
        System.out.println("\ncw4");
        czwiczenie_04();
    }

    public static void czwiczenie_01() {
        double[][] punkt = {
                {1},
                {0},
                {0}
        };

        double[][] obrot = {
                {1, -1, 0},
                {1, 0, 0},
                {0, 1, 1}
        };

        double[][] rezultat = new double[3][1];

        int obrotColLength = obrot[0].length;
        int mRRowLength = obrot.length;
        int mRColLength = punkt[0].length;
        for (int i = 0; i < mRRowLength; i++) {
            for (int j = 0; j < mRColLength; j++) {
                for (int k = 0; k < obrotColLength; k++) {
                    rezultat[i][j] += obrot[i][k] * punkt[k][j];
                }
            }
        }

        System.out.println("Rezultat");
        for (int i = 0; i < rezultat.length; i++) {
            System.out.println(rezultat[i][0]);
        }
    }

    public static void czwiczenie_03() {
        int rozmiar = (int) (3 + Math.random() * 8);
        char tab[][] = new char[rozmiar][rozmiar];

        int random;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                random = (int) (Math.random() * 101);
                tab[i][j] = (random > 50) ? 'l' : 'a';
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        int counter = 0;

        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length - 2; j++) {
                if (tab[i][j] == 'a' & tab[i][j + 1] == 'l' & tab[i][j + 2] == 'a') {
                    System.out.println("ala");
                    counter++;
                }
            }
        }

        System.out.println("Slow \"ala\" w tablice : " + counter);
    }

    public static void czwiczenie_04() {
        int rozmiar = 10;
        int tab[][] = new int[rozmiar][rozmiar];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                for (int k = tab.length - 1; k >= 0; k--) {
                    if (i == k | j == k | i == tab.length - 1 - k | j == tab.length - 1 - k) tab[i][j] = k;
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }
}