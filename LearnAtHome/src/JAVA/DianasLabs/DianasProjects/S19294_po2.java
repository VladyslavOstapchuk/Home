package DianasLabs.DianasProjects;

import java.util.Arrays;

public class S19294_po2 {
    public static void main(String[] args) {
        PojazdMechaniczny[] pojazdyMechaniczne = new PojazdMechaniczny[100];

        String[] nazwy = {"Audi", "Lada", "BMW", "Mercedes", "Volkswagen"};
        int[] iloscMiejsc = {2, 4, 6, 8};

        for (int i = 0; i < pojazdyMechaniczne.length; i++) {
            pojazdyMechaniczne[i] = new PojazdMechaniczny(
                    //
                    nazwy[(int) (Math.random() * nazwy.length)],
                    //
                    iloscMiejsc[(int) (Math.random() * iloscMiejsc.length)],
                    //
                    new Silnik(
                            //
                            (int) (Math.random() * 1000 + 1000),
                            //
                            (int) (Math.random() * 1000) + 1000
                    )
            );
        }

        System.out.println("///////////////////PRZED SORTOWANIEM///////////////////");
        drukuj(pojazdyMechaniczne);

        posortuj(pojazdyMechaniczne);

        System.out.println("/////////////////////PO SORTOWANIU/////////////////////");
        drukuj(pojazdyMechaniczne);


    }

    public static void posortuj(PojazdMechaniczny[] pojazdyMechaniczne) {
        Arrays.sort(pojazdyMechaniczne,PojazdMechaniczny::compareTo);
    }

    public static void drukuj(PojazdMechaniczny[] pojazdyMechaniczne) {
        for (int i = 0; i < pojazdyMechaniczne.length; i++) {
            System.out.println("\n"+(i+1) + ") " + pojazdyMechaniczne[i]);
        }
    }
}

class Silnik {
    private int moc;
    private long pojemnosc;

    public Silnik(int moc, long pojemnosc) {
        this.moc = moc;
        this.pojemnosc = pojemnosc;
    }

    public int getMoc() {
        return moc;
    }

    public long getPojemnosc() {
        return pojemnosc;
    }

    @Override
    public String toString() {
        return "\nMoc : " + moc + " k/m" +
                "\nPojemnosc : " + pojemnosc + "cm^3";
    }


}

class PojazdMechaniczny implements Comparable<PojazdMechaniczny> {
    private int iloscMiejsc;
    private String nazwa;
    private Silnik silnik;

    public PojazdMechaniczny(String nazwa, int iloscMiejsc, Silnik silnik) {
        this.nazwa = nazwa;
        this.iloscMiejsc = iloscMiejsc;
        this.silnik = silnik;
    }

    @Override
    public int compareTo(PojazdMechaniczny pojazdMechaniczny) {
        //
        if (this.silnik.getMoc() == pojazdMechaniczny.silnik.getMoc()) {
            //
            if (this.silnik.getPojemnosc() == pojazdMechaniczny.silnik.getPojemnosc()) {
                //
                if (this.iloscMiejsc == pojazdMechaniczny.iloscMiejsc) {

                       return this.nazwa.compareTo(pojazdMechaniczny.nazwa);

                } else return pojazdMechaniczny.iloscMiejsc - this.iloscMiejsc;

            } else return (int) (pojazdMechaniczny.silnik.getPojemnosc() - this.silnik.getPojemnosc());

        } else return pojazdMechaniczny.silnik.getMoc() - this.silnik.getMoc();
    }

    @Override
    public String toString() {
        return "\nNazwa : " + nazwa
                + "\nIlosc miejsc : " + iloscMiejsc
                + silnik.toString();
    }
}

