package GUI.w05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Student s0534 = new Student("Tom", 534);

        ArrayList<Student> al = new ArrayList<>();
        al.add(s0534);
        HashSet<Student> hs = new HashSet<>();
        hs.add(s0534);
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s0534);
/*
        System.out.println(
            al.contains(s0534)
        );
*/
        Student tmp = new Student("Tom", 534);

        System.out.println(
            al.contains(tmp)
        );

        System.out.println(
            hs.contains(tmp)
        );
        System.out.println(
            ts.contains(tmp)
        );

        // ====================================

        new Thread(
            new Task('a')
        ).start();
        new Thread(
                new Task('b')
        ).start();
        new Thread(
                new Task('c')
        ).start();


        new Thread(
                ()->{

                }
        ).start();
    }


}
