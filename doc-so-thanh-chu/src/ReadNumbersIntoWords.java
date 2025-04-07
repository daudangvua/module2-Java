import java.util.Scanner;
public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số (0 đến 999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            String world = ckeckSo(number);
            System.out.println(world);
        }
    }
    public static String ckeckSo(int number) {
        if (number < 10) {
            return singleNumber(number);
        } else if (number < 20) {
            return twoNumbers(number);
        } else if (number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String ten = roundNumberTen(tens);
            if (ones == 0) {
                return ten;
            } else {
                return ten + " " + singleNumber(ones);
            }
        } else {
            int hundreds = number / 100;
            int after = number % 100;
            String hundredWord = singleNumber(hundreds) + " hundred ";
            if (after == 0) {
                return hundredWord;
            } else {
                return hundredWord + " and " + ckeckSo(after);
            }
        }
    }
    public static String singleNumber(int digit) {
        switch (digit) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "out of ability";
        }
    }
    public static String twoNumbers(int number) {
        switch (number) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "out of ability";
        }
    }
    public static String roundNumberTen(int tens) {
        switch (tens) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "out of ability";
        }
    }
}
