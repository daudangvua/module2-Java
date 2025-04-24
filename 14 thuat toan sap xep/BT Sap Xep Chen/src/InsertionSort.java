import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        int pos,x;
        for (int i=1;i<list.length;i++){
            pos=i;
            x=list[i];
            while (pos>0 && x<list[pos-1]) {
                list[pos]=list[pos-1];
                pos--;
            }
            list[pos]=x;
        }
        System.out.println("Sắp xếp thứ tự tăng dần: "+java.util.Arrays.toString(list));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        indexedInsertionSort(scanner);

    }

    public static void indexedInsertionSort(Scanner scanner) {

        System.out.println("Nhập độ dài của danh sách:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " +i +": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Danh sách: "+java.util.Arrays.toString(arr));
        insertionSort(arr);
    }
}
