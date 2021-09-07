package data.structures.arrays;

@SuppressWarnings("unchecked")
public class Array <T> {

    private T [] arr;
    private int len = 0; //length user thinks array is
    private int capacity = 0; //Actual array size

    public Array() {
        this(16);
    }

    public Array(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size() {
        return len;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T get(int index) {
        if (index >= len || index < 0) throw new IndexOutOfBoundsException();
        return arr[index];
    }

    public void set(int index, T elem) {
        if (index >= len || index < 0) throw new IndexOutOfBoundsException();
        arr[index] = elem;
    }

    public void clear() {
        for(int i = 0; i < capacity; i++) {
            arr[i] = null;
        }
        len = 0;
    }

    public void add(T elem) {
        if(len+1 >= capacity){
            if(capacity == 0) capacity = 1;
            else capacity *=2; //double the size
            T[] new_arr = (T[]) new Object[capacity];
            for(int i = 0; i < len; i++) {
                new_arr[i] = arr[i];
            }
            arr = new_arr;
        }
        arr[len++] = elem;
    }

    public T removeAt(int rm_index) {
        if(rm_index >= len || rm_index < 0) {
            throw new IndexOutOfBoundsException();
        }
        T data = arr[rm_index];
        for(int i = rm_index; rm_index < len; i++) {
            arr[i] = arr[i+1];
        }
        capacity = --len;
        return data;

    }

    public boolean remove(Object elem) {
        int index = indexOf(elem);
        if(index == -1 ){
            return false;
        }
        removeAt(index);
        return true;
    }

    public int indexOf(Object elem) {
        for(int i = 0; i < len; i++) {
            if(elem == null) {
                if (arr[i] == null) return i;
            }else {
                if (arr[i].equals(elem))
                return  i;
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }
}
