package Basics.CompareAndSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("//------Items-------------------------//");
        //1
        TreeSet<Items> prices1 = new TreeSet<>();
        //
        prices1.add(new Items("Kolbasa", 14.88));
        prices1.add(new Items("Kolbasa", 14.87));
        prices1.add(new Items("Kolbasa", 14.86));
        //
        for (Items prices : prices1) System.out.println(prices);
        System.out.println("//-------------------------------//");
        //2
        ArrayList<Items> prices2 = new ArrayList<>();
        //
        prices1.add(new Items("Kolbasa", 14.88));
        prices1.add(new Items("Kolbasa", 14.87));
        prices1.add(new Items("Kolbasa", 14.86));
        //
        MyComparator myComparator = new MyComparator();
        prices2.sort(myComparator);
        //
        for (Items prices : prices1) System.out.println(prices);
        System.out.println("//-------------------------------//");


        String[] strings = {"c","b","a"};

        Arrays.sort(strings,String::compareTo);

        System.out.println(strings[0].compareTo(strings[1]));

    }
}
