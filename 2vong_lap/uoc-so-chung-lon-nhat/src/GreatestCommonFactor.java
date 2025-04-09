import java.util.Scanner;
public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Nhập a: ");
        a = sc.nextInt();
        System.out.print("Nhập b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        } else if (a == 0) {
            System.out.println("Ước chung lớn nhất: " + b);
        } else if (b == 0) {
            System.out.println("Ước chung lớn nhất: " + a);
        } else {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            System.out.println("Ước chung lớn nhất: " + a);
        }
        sc.close();
    }
}