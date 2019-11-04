package DianasLabs.Zestawy;

import Basics.Bits.Color;

public class s19294_zestaw11 {
    public static void main(String[] args) {
        czwiczenie_01();
        czwiczenie_02();
        czwiczenie_03();
        czwiczenie_04();
        czwiczenie_05();
    }

    static void czwiczenie_01() {
        System.out.println("\n////////////////////CZW01////////////////////\n");

        Telefon telefon = new Telefon("123-123-123", new Color(12, 11, 123));
        System.out.println(telefon);

        telefon.zadzwon("234-234-234");
    }

    static void czwiczenie_02() {
        System.out.println("\n////////////////////CZW02////////////////////\n");

        String[] polaczenia = {};

        Komorka komorka = new Komorka("123-456-789", new Color(123, 123, 123), polaczenia);
        System.out.println(komorka);

        komorka.wyswietlHistoriePolaczen();
        komorka.zadzwon("123-123-123");
        komorka.wyswietlHistoriePolaczen();
    }

    static void czwiczenie_03() {
        System.out.println("\n////////////////////CZW03////////////////////");

        String[] polaczenia = {};

        Osoba[] znajomi = {
                new Osoba("Jan", "Kowalski", "123-123-123"),
                new Osoba("Piotr", "Wojtowicz", "678-678-678"),
                new Osoba("Andrzej", "Galicki", "246-246-246"),
                new Osoba("George", "Martin", "468-468-468"),
                new Osoba("Jan", "Kowalski", "234-234-234")
        };

        Smartfon smartfon = new Smartfon("194-148-437", new Color(123, 123, 123), polaczenia, znajomi);
        System.out.println(smartfon);

        smartfon.wyswietlHistoriePolaczen();
        smartfon.zadzwon("468-468-468");
        smartfon.wyswietlHistoriePolaczen();
    }

    static void czwiczenie_04() {
        System.out.println("\n////////////////////CZW04////////////////////\n");

        String[] polaczenia = {
                "123-123-123",
                "234-234-234",
                "345-345-345",
                "456-456-456",
                "567-567-567",
                "678-678-678",
                "789-789-789",
                "890-890-890",
                "135-135-135",
                "246-246-246",
                "468-468-468",
        };

        Osoba[] znajomi = {
                new Osoba("Jan", "Kowalski", "123-123-123"),
                new Osoba("Piotr", "Wojtowicz", "678-678-678"),
                new Osoba("Andrzej", "Galicki", "246-246-246"),
                new Osoba("George", "Martin", "468-468-468"),
                new Osoba("Jan", "Kowalski", "234-234-234")
        };

        Telefon telefon = new Telefon("194-148-437", new Color(123, 123, 123));
        System.out.println(telefon);
        telefon.wyswietlHistoriePolaczen();

        Komorka komorka = new Komorka("194-148-437", new Color(123, 123, 123), polaczenia);
        System.out.println(komorka);
        komorka.wyswietlHistoriePolaczen();

        Smartfon smartfon = new Smartfon("194-148-437", new Color(123, 123, 123), polaczenia, znajomi);
        System.out.println(smartfon);
        smartfon.wyswietlHistoriePolaczen();
    }

    static void czwiczenie_05() {
        System.out.println("\n////////////////////CZW05////////////////////\n");

        String[] numery = {
                "234-234-234",
                //
                "123-123-123",
                //
                "345-345-345",
                //
                "678-678-678",
                //
                "567-567-567",
                //
                "246-246-246",
                //
                "789-789-789",
                //
                "468-468-468",
                //
                "135-135-135",
                //
                "234-234-234",
                //
                "345-345-345",
        };

        String[] polaczenia = {};

        Osoba[] znajomi = {
                new Osoba("Jan", "Kowalski", "123-123-123"),
                new Osoba("Piotr", "Wojtowicz", "678-678-678"),
                new Osoba("Andrzej", "Galicki", "246-246-246"),
                new Osoba("George", "Martin", "468-468-468"),
                new Osoba("Jan", "Kowalski", "234-234-234")
        };

        Telefon[] telefony = {
                new Telefon("123-123-123", new Color(12, 11, 123)),
                new Komorka("123-456-789", new Color(123, 123, 123), polaczenia),
                new Smartfon("194-148-437", new Color(123, 123, 123), polaczenia, znajomi)
        };

        for (Telefon telefon : telefony) {

            System.out.println(telefon);

            telefon.wyswietlHistoriePolaczen();

            for (int i = 0; i < numery.length; i++) {
                telefon.zadzwon(numery[i]);
            }

            telefon.wyswietlHistoriePolaczen();
        }
    }
}

class Telefon {
    protected String interfejsKomunikacyjny;
    protected Color color;

    public Telefon(String interfejsKomunikacyjny, Color color) {
        this.interfejsKomunikacyjny = interfejsKomunikacyjny;
        this.color = color;
    }

    public void zadzwon(String numer) {
        System.out.println("Dzwonimy pod numer " + numer);
    }

    public void wyswietlHistoriePolaczen() {
        System.out.println("\nBrak historii polaczen\n");
    }

    @Override
    public String toString() {
        return "Telefon" +
                "\nInterfejs komunikacyjny : " + interfejsKomunikacyjny;
    }
}

class Komorka extends Telefon {
    protected String[] tablicaOstatnichPolaczen;

    public Komorka(String interfejsKomunikacyjny, Color color, String[] tablicaOstatnichPolaczen) {
        super(interfejsKomunikacyjny, color);

        if (tablicaOstatnichPolaczen.length == 0) {
            this.tablicaOstatnichPolaczen = new String[10];
        } else if (tablicaOstatnichPolaczen.length > 10) {
            this.tablicaOstatnichPolaczen = new String[10];

            for (int i = 0; i < this.tablicaOstatnichPolaczen.length; i++) {
                this.tablicaOstatnichPolaczen[i] = tablicaOstatnichPolaczen[i];
            }
        } else {
            this.tablicaOstatnichPolaczen = tablicaOstatnichPolaczen;
        }
    }

    @Override
    public void zadzwon(String numer) {
        super.zadzwon(numer);
        for (int i = tablicaOstatnichPolaczen.length - 2; i >= 0; i--) {
            tablicaOstatnichPolaczen[i + 1] = tablicaOstatnichPolaczen[i];
        }
        tablicaOstatnichPolaczen[0] = numer;
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        if (count() != 0) {
            System.out.println("\nHistoria polaczen :");

            for (int i = 0; i < count(); i++) {
                System.out.println((i + 1) + ") " + tablicaOstatnichPolaczen[i]);
            }
        } else {
            System.out.println("\nBrak historii polaczen\n");
        }
    }

    protected int count() {
        int count = 0;

        for (int i = 0; i < tablicaOstatnichPolaczen.length; i++) {
            if (tablicaOstatnichPolaczen[i] != null) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    @Override
    public String toString() {
        return "Komorka" +
                "\nInterfejs komunikacyjny : " + interfejsKomunikacyjny;
    }
}

class Smartfon extends Komorka {
    private Osoba[] znajomi;

    Smartfon(String interfejsKomunikacyjny, Color color, String[] tablicaOstatnichPolaczen, Osoba[] znajomi) {
        super(interfejsKomunikacyjny, color, tablicaOstatnichPolaczen);
        this.znajomi = znajomi;
    }

    @Override
    public void wyswietlHistoriePolaczen() {
        if (count() != 0) {
            System.out.println("\nHistoria polaczen :");
            for (int i = 0; i < count(); i++) {
                System.out.println((i + 1) + ") " + find(tablicaOstatnichPolaczen[i]));
            }
        } else {
            System.out.println("\nBrak historii polaczen\n");
        }
    }

    private String find(String numer) {
        for (int i = 0; i < znajomi.length; i++) {
            if (numer == znajomi[i].getNumer()) {
                return znajomi[i].toString();
            }
        }
        return numer;
    }

    @Override
    public String toString() {
        return "\nSmartfon" +
                "\nInterfejs komunikacyjny : " + interfejsKomunikacyjny;
    }
}

class Osoba {
    private String imie, nazwisko, numer;

    Osoba(String imie, String nazwisko, String numer) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer = numer;
    }

    public String getNumer() {
        return numer;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + numer;
    }
}


