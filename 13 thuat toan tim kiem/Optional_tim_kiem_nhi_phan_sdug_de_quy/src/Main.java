import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập mảng cách nhau bằng dấu phẩy");
        String input = scanner.nextLine();
        String[] array = input.split(",");
        for (String s : array) {
            String trimmed =s.trim();
            if(trimmed.length()>0){}
        }
    }
}
