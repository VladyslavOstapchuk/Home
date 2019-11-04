//package DianasLabs;
//
//public class s19294_zestaw09 {
//    public static void main(String[] args) {
//        czwiczenie1();
//        czwiczenie2();
//        czwiczenie3();
//    }
//
//    public static void czwiczenie1() {
//        System.out.println("CW1");
//
//        KulaW kulaW1 = new KulaW(new Kwadrat(12));
//        KulaW kulaW2 = new KulaW(new Walec(4, 4));
//
//        kulaW1.show();
//        kulaW2.show();
//    }
//
//    public static void czwiczenie2() {
//        System.out.println("CW2");
//
//        KulaNa kulaNa1 = new KulaNa(new Kwadrat(10));
//        KulaNa kulaNa2 = new KulaNa(new Walec(7,2));
//
//        kulaNa1.show();
//        kulaNa2.show();
//    }
//
//    public static void czwiczenie3() {
//        System.out.println("CW3");
//
//        String ciagZnakow = "Ala ma kota";
//
//        System.out.println(ciagZnakow.charAt(2));
//        System.out.println(ciagZnakow.charAt(4));
//
//        System.out.println(ciagZnakow.indexOf('k'));
//
//        for(int i = 0; i < ciagZnakow.length(); i++){
//            if(ciagZnakow.charAt(i) != ' ') System.out.print(ciagZnakow.charAt(i));
//            else System.out.println();
//        }
//    }
//}
//
//class KulaW {
//    private double promien;
//
//    public KulaW(Kwadrat kwadrat) {
//        promien = kwadrat.getBok() / 2;
//    }
//
//    public KulaW(Walec walec) {
//        if (walec.getPromien() == walec.getWyskosc())
//            promien = walec.getPromien();
//        else {
//            promien = 0;
//        }
//    }
//
//    void show() {
//        System.out.println("Kula z prominiem " + promien);
//    }
//}
//
//class KulaNa{
//    private double promien;
//
//    public KulaNa(Kwadrat kwadrat){
//        promien = ((kwadrat.getBok() * kwadrat.getBok()) * Math.sqrt(2) / 2);
//    }
//
//    public KulaNa(Walec walec){
//        double d = Math.sqrt(Math.pow(walec.getPromien()*2,2) + Math.pow(walec.getWyskosc(),2));
//        promien = d/2;
//    }
//
//    void show(){
//        System.out.println("Kula z prominiem " + promien);
//    }
//}
//
//class Kwadrat {
//    private double bok;
//
//    public Kwadrat(double bok) {
//        this.bok = bok;
//    }
//
//    double p() {
//        return Math.pow(bok, 2);
//    }
//
//    double vSzescianu() {
//        return Math.pow(bok, 3);
//    }
//
//    Walec walecWSzescioscianie() {
//        return new Walec(bok / 2, bok);
//    }
//
//    void show() {
//        System.out.println("\nBok             : " + bok +
//                "\nP               : " + p() +
//                "\nV szescioscianu : " + vSzescianu());
//        System.out.println("\nDane walca umiesczonego \nw szescioscianie na podstawie kwadratu :");
//        walecWSzescioscianie().show();
//    }
//
//    public double getBok() {
//        return bok;
//    }
//}
//
//class Walec {
//    private double promien, wyskosc;
//
//    public Walec(double promien, double wyskosc) {
//        this.promien = promien;
//        this.wyskosc = wyskosc;
//    }
//
//    double pPowierzchniPodstawy() {
//        return 2 * Math.PI * Math.pow(promien, 2);
//    }
//
//    double vWalca() {
//        return pPowierzchniPodstawy() * wyskosc;
//    }
//
//    void show() {
//        System.out.println("\nPromien         : " + promien +
//                "\nWysokosc        : " + wyskosc +
//                "\nV walca         : " + vWalca() +
//                "\nP podstawy      : " + pPowierzchniPodstawy());
//    }
//
//    public double getPromien() {
//        return promien;
//    }
//
//    public double getWyskosc() {
//        return wyskosc;
//    }
//}
//
