package Basics.Generics;


public class MyGenArray<T> {
    private T array[];
    private int size = 1, inserted = 0;


    public MyGenArray(int size) {
        this.size = size;
        array = (T[]) new Object[size];
    }

    public MyGenArray() {
        array = (T[]) new Object[size];
    }

    public void addElementAtTheEnd(T element) {

        if (inserted == size) {
            T tmp[] = array;

            array = (T[]) new Object[++size];

            for (int i = 0; i < tmp.length; i++) {
                array[i] = tmp[i];
            }

        }

        array[inserted++] = element;
    }

    public void addElementAt(){

    }

    public T get(int index) {
        return array[index];
    }

    public void removeLastElement() {
        T tmp[] = (T[]) new Object[--size];

        for (int i = 0; i < size; i++) {
            tmp[i] = array[i];
        }

        array = tmp;
        inserted--;
    }

    public void removeFirstElement() {
        T tmp[] = (T[]) new Object[--size];

        for (int i = 0; i < size; i++) {
            tmp[i] = array[i + 1];
        }

        array = tmp;
        inserted--;
    }

    public void removeElementAt(int index) {
        if (index == size - 1) removeLastElement();
        else if (index == 0) removeFirstElement();
        else {
            for(int i = index; i < size-1; i++){
                array[i] = array[i+1];
            }
            size--;
            inserted--;
        }
    }

    public void showWholeArray() {
        System.out.println();
        for (int i = 0; i < inserted; i++) {
            System.out.println(get(i));
        }
        System.out.println();
    }

    public void arrayInfo() {
        System.out.println(
                "\n| Type     = " + get(0).getClass().getName() +
                        "\n| Size     = " + size +
                        "\n| Inserted = " + inserted + "\n");
    }


}
