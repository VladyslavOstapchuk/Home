//package DianasLabs;
//
//public class S19294_zestaw07 {
//    public static void main(String[] args) {
//        System.out.println("\nczw1");
//        czwiczenie01();
//        System.out.println("\nczw2");
//        czwiczenie02();
//        System.out.println("\nczw3");
//        czwiczenie03();
//        System.out.println("\nczw4");
//        czwiczenie04();
//    }
//
//    public static void czwiczenie01() {
//        MethodCurrier methodCurrier = new MethodCurrier();
//
//        int a = 123;
//        float b = 3.14f;
//        char c = 'a';
//        byte d = 4;
//
//        methodCurrier.setValue(a);
//        methodCurrier.setValue(b);
//        methodCurrier.setValue(c);
//        methodCurrier.setValue(d);
//
//        //Decyzja zalezy od parametru podanego do metody
//    }
//
//    public static void czwiczenie02() {
//        Liczba liczba = new Liczba();
//        liczba.przepiszWartosc(10);
//
//        MethodCurrier methodCurrier = new MethodCurrier();
//        methodCurrier.setValue(liczba);
//    }
//
//    public static void czwiczenie03() {
//        DianasLabs.zestaw11.Osoba osoba = new DianasLabs.zestaw11.Osoba();
//
//        osoba.imie = "Diana";
//        osoba.nazwisko = "Zhukowa";
//        osoba.rokUrodzenia = 1997;
//
//        osoba.show();
//    }
//
//    public static void czwiczenie04() {
//        DianasLabs.zestaw11.Osoba osoba = new DianasLabs.zestaw11.Osoba("Diana", "Zhukowa", 1997);
//
//        osoba.show();
//    }
//
//}
//
//class MethodCurrier {
//
//    void setValue(int value) {
//        System.out.println(value + " is int value");
//        value += 10;
//    }
//
//    void setValue(float value) {
//        System.out.println(value + " is float value");
//        value*=10;
//    }
//
//    void setValue(Liczba value) {
//        setValue(value.wyswietlWartosc());
//        value.przepiszWartosc(value.wyswietlWartosc()+10);
//    }
//}
//
//class Liczba {
//    int value;
//
//    public void przepiszWartosc(int value) {
//        this.value = value;
//    }
//
//    public int wyswietlWartosc() {
//        System.out.println("Value = " + value);
//        return value;
//    }
//}
//
//class Osoba {
//    String imie, nazwisko;
//    int rokUrodzenia;
//
//    Osoba(String imie, String nazwisko, int rokUrodzenia) {
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//        this.rokUrodzenia = rokUrodzenia;
//    }
//
//    Osoba() {
//        this(null, null, 0);
//    }
//
//    void show() {
//        System.out.println(
//                "Imie = " + imie +
//                        "\nNazwisko = " + nazwisko +
//                        "\nRok urodzenia = " + rokUrodzenia);
//    }
//}
//
