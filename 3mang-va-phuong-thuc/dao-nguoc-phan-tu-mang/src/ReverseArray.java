import java.util.Scanner;

public class ReverseArray {
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
        int i =0;
        while(i < array.length){
            System.out.println("Nhập phần tử " + i + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng: ", "");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
        for (int k = 0; k < array.length/2; k++){
            int temp = array[k];
            array[k] = array[size - 1 - k];
            array[size - 1 - k] = temp;
        }
        System.out.printf("\n%-20s%s", "Mảng đảo ngược: ", "");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
    }
}
