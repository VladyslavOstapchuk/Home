package GUI.w08;

public
    class Student {

    String imie;
    String ska;

    public Student(String imie, String ska){
        this.imie = imie;
        this.ska = ska;
    }

    public String toString(){
        return imie+" "+ska;
    }
}
