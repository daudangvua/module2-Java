import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi:");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int)inputString.charAt(i);
            frequentChar[ascii]+=1;
        }
        int max = 0;
        char character = (char)255;
        for (int i = 0; i < 255; i++) {
            if (frequentChar[i] > max){
                max= frequentChar[i];
                character = (char)i;
            }
        }
        System.out.println("Ký tự xuất hiện nhiều nhất là: '"+character+"' số lần xuất hiện là "+max+" lần");
    }
}
