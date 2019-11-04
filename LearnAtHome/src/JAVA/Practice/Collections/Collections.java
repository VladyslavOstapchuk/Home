package JAVA.Practice.Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
//        arrayList();
//        linkedList();
        maps();
    }

    public static void arrayList() {

        //addAll() add all  A U B
        //removeAll() A \ B
        //retainAll()  A /\ B

        //You can initial start size of the list
        ArrayList<String> tmp = new ArrayList<>(2);

        //Add elements
        tmp.add("Fuck");
        tmp.add("this");
        tmp.add("shit");
        tmp.add("!!!");

        //Create new collection and fill it by elements of another collection
        ArrayList<String> arrayList = new ArrayList<>(tmp);

        //Add all elements from another collection
        arrayList.addAll(tmp);

        //Check if list contains such element
//        if (arrayList.contains("Fuck"))
//            showCollection(arrayList);

        //Show element at some position
//        System.out.println(arrayList.get(3));

        //Remove all from the list
        arrayList.clear();

    }

    public static void linkedList() {
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();

        //
        linkedList1.add("1");
        linkedList1.add("2");
        linkedList1.add("3");
        linkedList1.add("4");
        linkedList1.add("5");
        linkedList1.add("6");
        linkedList1.add("7");
        linkedList1.add("8");
        linkedList1.add("9");
        linkedList1.add("10");

        //
        linkedList2.add("11");
        //
        linkedList2.addAll(0, linkedList1);
        linkedList2.addFirst(linkedList1);
        //
        linkedList2.addFirst("12");
        //
        showCollection(linkedList2);
        //
        System.out.println(linkedList2.indexOf("12"));
        //
        linkedList2.removeAll(linkedList1);
        //
        showCollection(linkedList2);
    }

    public static void maps() {
        //HashMap is quicker than TreeMap
        //Tree map is sorted by keys

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"Record 1");
        hashMap.put(2,"Record 2");
        hashMap.put(3,"Record 3");

        //.keySet() returns all keys

        showMap(hashMap);
    }


    //Method to show Maps
    public static <T1,T2> void showMap(HashMap<T1,T2> map){
        for(T1 key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }

    //Universal method to show collection's elements
    public static void showCollection(Collection collection) {
        Iterator iterator = collection.iterator();

        System.out.println(collection);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
