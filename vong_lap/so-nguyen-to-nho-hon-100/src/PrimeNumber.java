public class PrimeNumber {
    public static void main(String[] args) {
        int number = 2;
        System.out.println("Số nguyên tố nhỏ hơn 100 là: ");
        while (number < 100) {
            if (check(number)) {
                System.out.println(number);
            }
            number++;
        }
        System.out.println();
    }

    public static boolean check(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }return true;
    }
}
