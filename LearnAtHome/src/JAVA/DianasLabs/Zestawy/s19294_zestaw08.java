package DianasLabs.Zestawy;

public class s19294_zestaw08 {
    public static void main(String[] args) {
        czwiczenie1();
        czwiczenie2_4();
        czwiczenie3();
    }

    public static void czwiczenie1() {
        System.out.println("\n//==========CW1=========//");


        Cplx cplx1 = new Cplx(4, 5);
        Cplx cplx2 = new Cplx(45, -10);
        Cplx cplx3 = new Cplx(2, 4);

        cplx1.show();
        cplx2.show();
        cplx3.show();

        cplx1.add(cplx2);
        cplx1.show();

        cplx1.sub(cplx3);
        cplx1.show();

        cplx1.inc();
        cplx1.show();

        cplx1.mul(cplx3);
        cplx1.show();
    }

    public static void czwiczenie2_4() {
        System.out.println("\n//=======CW2 i CW4======//");
        Kwadrat kwadrat = new Kwadrat(2);
        System.out.println("\nKWADRAT");
        kwadrat.show();
    }

    public static void czwiczenie3() {
        System.out.println("\n//==========CW3=========//");
        Walec walec = new Walec(3, 9);
        System.out.println("\nWALEC");
        walec.show();
    }
}

class Cplx {
    private double rz, im;

    public Cplx(double rz, double im) {
        this.rz = rz;
        this.im = im;
    }

    void add(Cplx cplx) {
        System.out.println("\nDodawanie");
        this.im += cplx.im;
        this.rz += cplx.rz;
    }

    void sub(Cplx cplx) {
        System.out.println("\nOdejmowanie");
        this.im -= cplx.im;
        this.rz -= cplx.rz;
    }

    void mul(Cplx cplx) {
        System.out.println("\nMnozenie");
        this.rz = this.rz * cplx.rz - this.im * cplx.im;
        this.im = this.rz * cplx.im + cplx.rz * this.im;
    }

    void inc() {
        System.out.println("\nZwiekszenie czesci rzeczewistej o jeden");
        this.rz++;
    }

    void show() {
        char znak = (im > 0) ? '+' : '-';
        System.out.println(rz + " " + znak + " " + Math.abs(im) + "i");
    }
}

class Kwadrat {
    private double bok;

    public Kwadrat(double bok) {
        this.bok = bok;
    }

    double p() {
        return Math.pow(bok, 2);
    }

    double vSzescianu() {
        return Math.pow(bok, 3);
    }

    Walec walecWSzescioscianie() {
        return new Walec(bok / 2, bok);
    }

    void show() {
        System.out.println("\nBok             : " + bok +
                "\nP               : " + p() +
                "\nV szescioscianu : " + vSzescianu());
        System.out.println("\nDane walca umiesczonego \nw szescioscianie na podstawie kwadratu :");
        walecWSzescioscianie().show();
    }
}

class Walec {
    private double promien, wyskosc;

    public Walec(double promien, double wyskosc) {
        this.promien = promien;
        this.wyskosc = wyskosc;
    }

    double pPowierzchniPodstawy() {
        return 2 * Math.PI * Math.pow(promien, 2);
    }

    double vWalca() {
        return pPowierzchniPodstawy() * wyskosc;
    }

    void show() {
        System.out.println("\nPromien         : " + promien +
                "\nWysokosc        : " + wyskosc +
                "\nV walca         : " + vWalca() +
                "\nP podstawy      : " + pPowierzchniPodstawy());
    }
}

