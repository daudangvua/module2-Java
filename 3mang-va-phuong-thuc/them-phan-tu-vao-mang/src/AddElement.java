import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int longth = sc.nextInt();
        int[]  array = new int[longth];
        for (int j = 0; j < longth; j++) {
            System.out.print("Nhập phần tử thứ " + j + ": ");
            array[j] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        inArray(array);
        System.out.println();
        System.out.println("Giá trị muốn thêm: ");
        int index = sc.nextInt();
        System.out.println("Vị trí thêm vào trong mảng(0 đến "+longth+"): ");
        int location = sc.nextInt();
        if (location<0||location>longth) {
            System.out.println("Vị trí không khớp");
            return;
        }
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < location; i++) {
            newArray[i] = array[i];
        }
        newArray[location] = index;
        for (int i = location; i < array.length; i++) {
            newArray[i+1] = array[i];
        }
        System.out.println("Hàm mới thêm là: ");
        inArray(newArray);
    }
    public static void inArray(int[] arr) {
        for (int i:arr) {
            System.out.print(i + " ");
        }
    }
}
