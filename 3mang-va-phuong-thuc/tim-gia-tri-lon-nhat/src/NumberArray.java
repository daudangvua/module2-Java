import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhập kích thước mảng: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("Kích thước không vượt quá 20");
            }
        } while(size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + i + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Mảng đã nhập là: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }System.out.println();
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị lớn nhất trong danh sách là: " + max + ", ở vị trí thứ " + index);
    }
}
