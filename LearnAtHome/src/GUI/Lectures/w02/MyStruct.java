package GUI.w02;
public
class MyStruct<T> {

    T db[];
    int count;

    public MyStruct(Class<T> type){
        db = (T[])java.lang.reflect.Array.newInstance(type, 100);
        count = 0;
    }

    public void add(T c){
        db[count++] = c;
    }

    public T get(int i){
        return db[i];
    }
}


/*
public
    class MyStruct {

    Object db[];
    int count;

    public MyStruct(){
        db = new Object[100];
        count = 0;
    }

    public void add(Object c){
        db[count++] = c;
    }

    public Object get(int i){
        return db[i];
    }
}
*/