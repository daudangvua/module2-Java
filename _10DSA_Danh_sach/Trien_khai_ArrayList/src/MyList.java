import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index,E e) {
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }

        for(int i=size-1;i>index;i--){
            elements[i]=elements[i-1];
        }
        elements[index]=e;
        size++;
    }
    public E remove(int index) {
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        E removedElement = (E) elements[index];
        for(int i=index;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return removedElement;
    }
    public int size(){
        return size;
    }
    public MyList<E> clone() {
        MyList<E> clonedList = new MyList<>(elements.length);
        for (int i = 0; i < size; i++) {
            clonedList.elements[i] = this.elements[i];
        }
        clonedList.size = this.size;
        return clonedList;
    }
    public boolean contains(E o) {
        return indexOf(o) >=0;
    }
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }
    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(size * 2);
        }
        elements[size++] = e;
        return true;
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            elements = Arrays.copyOf(elements, minCapacity);
        }
    }
    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
