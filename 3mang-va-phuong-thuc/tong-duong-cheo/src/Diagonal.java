import java.util.Scanner;
public class Diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int rows = scanner.nextInt();
        System.out.println("Nhập số cột: ");
        int cols = scanner.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Nhập phần tử của ma trận: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("arr["+i+"]["+j+"]" + " ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập là: ");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int compute = diagonalLeft(arr);
        System.out.println("Tổng đường chéo từ trái qua phải là: " + compute);
        int compute2 = diagonalRight(arr);
        System.out.println("Tổng đường chéo từ phải qua trái là: " + compute2);
    }
    public static int diagonalLeft(int[][] array) {
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i][i];
        }
        return sum;
    }
    public static int diagonalRight(int[][] array) {
        int sum2 =0;
        for (int i = 0; i < array.length; i++) {
            sum2+=array[i][array.length-i-1];
        }
        return sum2;
    }
}
