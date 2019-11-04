package GUI.w01.egz;

public
class Main {

    public static void main(String[] args){
        Osoba jan = new Osoba("Jan", "B.");
        Student s0534 = new Student( jan,"s0534");
        Osoba stud = s0534;
    }

}

class Osoba{

    protected String imie;
    protected String nazwisko;

    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}

class Student
    extends Osoba{

    //Osoba osoba; // !!!
    String ska;

    public Student(Osoba osoba, String ska){
        super(osoba.imie, osoba.nazwisko);
        //this.osoba = osoba; // !!!
        this.ska = ska;
    }
}




