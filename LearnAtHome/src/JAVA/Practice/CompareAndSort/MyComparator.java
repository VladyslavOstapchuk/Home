package Basics.CompareAndSort;

import java.util.Comparator;

public class MyComparator implements Comparator<Items> {
    @Override
    public int compare(Items item1, Items item2) {
        if(item1.getPrice() > item2.getPrice()) return 1;
        if(item1.getPrice() < item2.getPrice()) return -1;
        return 0;
    }
}
