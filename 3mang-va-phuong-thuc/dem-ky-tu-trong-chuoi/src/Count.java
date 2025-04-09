import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        String str = "Xin chao moi nguoi";
        System.out.println("Đây là chuỗi cần đếm: "+str);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần đếm: ");
        String input = scanner.next();
        char x = input.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của "+x+" là: " + count);
    }
}
