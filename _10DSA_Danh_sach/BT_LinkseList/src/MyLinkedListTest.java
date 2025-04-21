public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.addFirst("C");
        list.addLast("D");
        list.add(1, "B");
        list.addFirst("A");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " "); // A C B D
        }

        System.out.println("\nContains B? " + list.contains("B"));
        System.out.println("Index of D: " + list.indexOf("D"));

        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}
