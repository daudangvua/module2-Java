public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
        head = null;
    }

    public void addFirst(E element) {
        Node temp = new Node(element);
        temp.setNext(head);
        head = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = new Node(element);
        if (head == null) {
            head = temp;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(temp);
        }
        numNodes++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        if (index == 0) {
            addFirst(element);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }

        Node newNode = new Node(element);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        numNodes++;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }

        return (E) temp.getData();
    }

    public int size() {
        return numNodes;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(element)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.getData().equals(element)) {
                return index;
            }
            temp = temp.getNext();
            index++;
        }
        return -1;
    }
}
