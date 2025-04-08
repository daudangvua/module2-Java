public class PrimeHome {
    public static void main(String[] args) {
        int counter = 0;
        int number = 2;
        System.out.println("20 số nguyên tố đầu tiên là: ");
        while (counter < 20) {
            if (check(number)) {
                System.out.println(number);
                counter++;
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
