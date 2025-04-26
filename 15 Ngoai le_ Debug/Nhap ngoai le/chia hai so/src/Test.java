import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        int x = scanner.nextInt();
        System.out.println("Nhập số thứ hai");
        int y = scanner.nextInt();
        try {
            int result = x / y;
            System.out.println("Kết quả: " + result);
        }catch (ArithmeticException e) {
            System.err.println("Lỗi không thể chia cho 0.");
        }catch (InputMismatchException e) {
            System.err.println("Lỗi: vui lòng nhập số nguyên");
        }finally {
            scanner.close();
        }
    }
}
