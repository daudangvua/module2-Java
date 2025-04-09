import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();
        if (rows <= 0 || cols <= 0) {
            System.out.println("Số hàng và số cột phải lớn hơn 0");
            return;
        }
        int[][] matrix = new int[rows][cols];
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("matrix[%d][%d] = ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận bạn vừa nhập là:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Bạn muốn tính tổng tại cột bao nhiêu: ");
        int value = scanner.nextInt();
        int sum =0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][value];
        }
        System.out.printf("Tổng tại cột " + value + " là: " + sum);
    }
}
