public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        // Thêm phần tử
        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        list.add(3, 40);

        // In ra danh sách ban đầu
        System.out.println("Danh sách ban đầu:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Phần tử " + i + ": " + list.get(i));
        }

        // Xoá phần tử ở vị trí 2
        System.out.println("\nXoá phần tử tại index 2: " + list.remove(2));

        // In lại danh sách sau khi xoá
        System.out.println("Danh sách sau khi xoá:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Phần tử " + i + ": " + list.get(i));
        }

        // Kiểm tra contains và indexOf
        System.out.println("\nDanh sách có chứa 20 không? " + list.contains(20));
        System.out.println("Vị trí của 40 là: " + list.indexOf(40));

        // Clone danh sách
        MyList<Integer> clonedList = list.clone();
        System.out.println("\nDanh sách clone:");
        for (int i = 0; i < clonedList.size(); i++) {
            System.out.println("Phần tử " + i + ": " + clonedList.get(i));
        }

        // Clear danh sách gốc
        list.clear();
        System.out.println("\nKích thước sau khi clear: " + list.size());
    }
}
