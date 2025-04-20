public class MyLinkedList<E> {
    private Node head;
    private int numNodes;
    public MyLinkedList() {}
    private class Node {
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }
    public void addLast(E element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        numNodes++;
    }
    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node temp = head;
        E removedData;
        if(index == 0) {
            removedData = (E) head.data;
            head = head.next;
        } else {
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            Node nodeToRemove = temp.next;
            removedData = (E) nodeToRemove.data;
            temp.next = nodeToRemove.next;
        }
        numNodes--;
        return removedData;
    }
    public boolean remove(Object e) {
        if (e == null) {
            return false;
        }
        if (head.data.equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(e)) {
                current.next = current.next.next;
                numNodes--;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public int size() {
        return numNodes;
    }
    public MyLinkedList<E> clone(){
        MyLinkedList<E> clonedList = new MyLinkedList<>();
        Node current = this.head;
        while (current != null) {
            clonedList.addLast((E)current.data);
            current = current.next;
        }
        return clonedList;
    }
    public boolean contains(E o) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public int indexOf(E o){
        Node current = head;
        int index =0;
        while (current != null) {
            if (current.data.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

}
