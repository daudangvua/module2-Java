package view;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm đơn hàng mới (Điện tử / Quần áo)");
            System.out.println("2. Xoá đơn hàng theo mã");
            System.out.println("3. Hiển thị tất cả đơn hàng");
            System.out.println("4. Hiển thị báo cáo doanh thu");
            System.out.println("5. Sắp xếp theo ngày đặt hàng");
            System.out.println("6. Sắp xếp theo tên khách hàng");
            System.out.println("7. Sắp xếp theo tổng tiền đơn hàng");
            System.out.println("8. Xem lịch sử thao tác");
            System.out.println("9. Ghi danh sách đơn hàng ra file nhị phân");
            System.out.println("10. Đọc danh sách đơn hàng từ file nhị phân");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addNewOder();
                    break;
                case 2:
            }
        }while (choice !=0);
        scanner.close();
    }
    public static void addNewOder(){
        System.out.println("Bạn muốn thêm đơn hàng nào:");
        System.out.println("1. điện tử.");
        System.out.println("2. Quần áo.");
        System.out.println("Chọn:");
        int type = scanner.nextInt();
        System.out.println("Mã đơn hàng:");
        String orderId = scanner.nextLine();
        System.out.println("Nhập tên khách hàng:");
        String customerName = scanner.nextLine();
        System.out.println("Ngày đặt hàng(yyyy/MM/dd):");
        int orderDate = scanner.nextInt();
        if (type == 1) {

        }

    }
}
