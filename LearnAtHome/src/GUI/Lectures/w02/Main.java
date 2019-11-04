package GUI.w02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public
    class Main {

    public static void main(String[] args) {
        MyStruct<Student> ms = new MyStruct<Student>(Student.class);

        ArrayList<Student> al = new ArrayList<Student>();

        al.add(new Student(1701, "Jan"));

        //String str = (String)ms.get(0);
        //Student tmp = (Student)ms.get(0);
        Student tmp = al.get(0);

        System.out.println(tmp);

        tmp.numer = 1702;

        // ===================================

        int[] tab = { 20, 10, 15, 40, 30};

        System.out.println(
            Arrays.toString(tab)
        );

        Arrays.sort(tab);

        System.out.println(
                Arrays.toString(tab)
        );

        String[] tab2 = {"ala", "Ma", "kota"};
        Arrays.sort(tab2);

        System.out.println(
                Arrays.toString(tab2)
        );

        Student[] tab3 = {
            new Student(2534, "Jan"),
            new Student(1701, "Kazik")
        };
        Arrays.sort(tab3);

        System.out.println(
                Arrays.toString(tab3)
        );

        Arrays.sort( tab3, Student.CompareByNumber);

        System.out.println(
                Arrays.toString(tab3)
        );

    }
}

class Student
    implements Comparable<Student>{
    int numer;
    String imie;

    public Student(int numer, String imie){
        this.numer = numer;
        this.imie = imie;
    }

    public String toString(){
        return numer+" "+imie;
    }

    @Override
    public int compareTo(Student o) {
        //return numer - o.numer;
        return this.imie.compareTo(o.imie);
    }

    public static Comparator<Student> CompareByNumber =
            new Comparator<Student>(){

                @Override
                public int compare(Student o1, Student o2) {
                    return o1.numer - o2.numer;
                }
            };

    public static Comparator<Student> CompareByName =
            new StudentCompareByName();
}

class StudentCompareByName
    implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.imie.compareTo(o2.imie);

    }
}