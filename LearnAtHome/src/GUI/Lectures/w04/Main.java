package GUI.w04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public
    class Main {

    public static void main(String[] args) {
        MyColor myColor = new MyColor( 100, 200, 100);

        MyColor[] tab = new MyColor[]{ myColor};

        ArrayList<MyColor> arrayList = new ArrayList<>();
        arrayList.add(myColor);

        arrayList.get(0);

        HashMap<String, MyColor> hashMap = new HashMap<>();
        hashMap.put("zielony", myColor);
        hashMap.put("zielony", new MyColor(50, 50, 50));

        System.out.println(
            hashMap.get("zielony1")
        );

        for(MyColor i : arrayList){
            System.out.println(
                    ">"+i
            );
        }

        MyArray myArray = new MyArray();
        myArray.add(10);
        myArray.add(20);

        Iterator<Integer> iterator = myArray.iterator();
        while (iterator.hasNext()){
            System.out.println(
                iterator.next()
            );
        }

        for( Integer i : myArray){
            System.out.println(i);
        }
    }
}
