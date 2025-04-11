import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập width: ");
        double w = sc.nextDouble();
        System.out.printf("Nhập height: ");
        double h = sc.nextDouble();

        Rectangle r = new Rectangle(w,h);
        r.Rectangle();
    }
}
