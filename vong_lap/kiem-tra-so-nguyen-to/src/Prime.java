import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số:");
        int n = sc.nextInt();
        if ( n <= 1 ) {
            System.out.println(n + " không phải số nguyên tố");
        } else if (n < 4) {
            System.out.println(n + " là số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(n)) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(n + " là số nguyên tố");
            } else {
                System.out.println(n + " không phải số nguyên tố");
            }
        }
    }
}
