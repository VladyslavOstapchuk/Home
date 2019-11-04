package GUI.w04;

import java.util.Iterator;

public
    class MyArray
    implements Iterable<Integer>{

    private int[] tab;
    private int size;

    public MyArray(){
        tab = new int[5];
        size = 0;
    }


    public void add(int wrt){
        if(size >= tab.length) {
            int[] tmp = new int[tab.length * 2];
            for (int i = 0; i < tab.length; i++)
                tmp[i] = tab[i];

            tab = tmp;
        }
        tab[size++] = wrt;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(this);
    }

    public int size(){
        return size;
    }

    public int get(int index){
        return tab[index];
    }

}

class MyArrayIterator
    implements Iterator{

    MyArray myArray;
    int currentIndex;

    public MyArrayIterator(MyArray myArray){
        this.myArray = myArray;
        currentIndex = 0;
    }


    @Override
    public boolean hasNext() {
        return myArray.size() > currentIndex;
    }

    @Override
    public Object next() {
        return myArray.get(currentIndex++);
    }
}
