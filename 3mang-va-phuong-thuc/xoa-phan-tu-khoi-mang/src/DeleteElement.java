import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 5, 45, 6, 7, 8, 9, 10};
        System.out.printf("Mảng ban đầu là: ");
        for ( int i: array) {
            System.out.printf(i + " ");
        }System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần xóa: ");
        int index_del = sc.nextInt();
        int value = findLocation(array,index_del);
        if(value == -1){

            System.out.println("Không tìm thấy " + index_del + " trong mảng.");
        } else {
            array = delValue(array,value);
            System.out.println("Mảng sau khi xóa là: " );
            for ( int i: array) {
                System.out.printf(i + " ");
            }
        }
    }
    public static int findLocation(int[] arr,int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value) {
                return i;
            }
        }
        return -1;
    }
    public static int[] delValue(int[] arr,int index) {
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = arr[i+1];
        }
        return newArr;
    }
}
