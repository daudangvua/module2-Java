import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Lỗi: Các cạnh tam giác phải > 0");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Lỗi: Tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại");
        }

        System.out.println("Hợp lệ: Đây là một tam giác!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();
        try {
            checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Lỗi: Đầu vào không hợp lệ!");
        } finally {
            scanner.close();
        }


    }

}


