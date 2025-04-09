import java.util.Scanner;
public class SelectImage {
    public static void main(String[] args) {
        int input = -1;
        while (input != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In tam giác vuông (bốn góc khác nhau)");
            System.out.println("3. In tam giác cân");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("In hình chữ nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("In tam giác vuông (bốn góc khác nhau)");
                    for (int i=0; i<6; i++) {
                        for (int j=0; j<i; j++) {
                            System.out.print("*");
                        }System.out.println();
                    }System.out.println();
                    for (int i=5; i>0; i--) {
                        for (int j=0; j<i; j++) {
                            System.out.print("*");
                        }System.out.println();
                    }System.out.println();
                    for (int i=0; i<5; i++) {
                        for (int j=0; j<(5-i); j++) {
                            System.out.print(" ");
                        }
                        for (int j=0; j<=i; j++) {
                            System.out.print("*");
                        }System.out.println();
                    }System.out.println();
                    for (int i=0; i<5; i++) {
                        for (int j=0; j<i; j++) {
                            System.out.print(" ");
                        }
                        for (int j=5; j>i; j--) {
                            System.out.print("*");
                        }System.out.println();
                    }
                    break;
                case 3:
                    for (int i=1; i<=5; i++) {
                        for (int j=0; j<5-i; j++) {
                            System.out.print(" ");
                        }
                        for (int j=0; j<=2*i-2; j++) {
                            System.out.print("*");
                        }System.out.println();
                    }System.out.println();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có sự lựa chọn!");
            }
        }
    }
}
