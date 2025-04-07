import java.util.Scanner;
public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD, VND;
        System.out.println("Nhập USD: ");
        USD = scanner.nextDouble();
        VND = USD * 23000;
        System.out.printf("VND: %.0f", VND);
    }
}
