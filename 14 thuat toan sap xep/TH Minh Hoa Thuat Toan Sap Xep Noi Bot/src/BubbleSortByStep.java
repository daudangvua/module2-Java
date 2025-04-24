import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập kích thước danh sách: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Danh sách có "+list.length+" giá trị.");
        for(int i=0;i<list.length;i++){
            System.out.println("Nhập giá trị thứ "+i+":");
            list[i]=scanner.nextInt();
        }
        System.out.println("Danh sách bạn nhập là: "+java.util.Arrays.toString(list));
        System.out.println("Sắp xếp danh sách:");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass=true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass=false;
            for (int j = 0; j < list.length-i; j++) {
                if(list[j]<list[j+1]){
                    System.out.println("Đổi "+list[j]+" với "+list[j+1]);
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                    needNextPass=true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Mảng đã được sắp xếp ở lần lặp thứ "+(i-1));
                break;
            }
            System.out.print("Lần lặp thứ " + i + " có kết quả là: "+java.util.Arrays.toString(list));
            System.out.println();
        }
    }
}
