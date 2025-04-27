package view;

import model.ClothingOrder;
import model.ElectronicsOrder;
import controller.OrderManager;
import model.Order;
import storage.OrderStorage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final OrderManager orderManager = new OrderManager();
    public static void main(String[] args) {
        ElectronicsOrder defaultOrder = new ElectronicsOrder("E001", "Nguyễn Văn A", 20250427, 5000000, 12);
        orderManager.addOrder(defaultOrder);
        ClothingOrder defaultOrder1 = new ClothingOrder("C001", "Trần Thị B", 20250420, 350000, "L");
        orderManager.addOrder(defaultOrder1);
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
                    System.out.println("Nhập mã cần xóa:");
                    scanner.nextLine();
                    String orderId = scanner.nextLine();
                    orderManager.removeOrder(orderId);
                    break;
                case 3:
                    orderManager.displayAllOrders();
                    break;
                case 4:
                    orderManager.displayRevenueReport();
                    break;
                case 5:
                    orderManager.sortByOrderDate();
                    break;
                case 6:
                    orderManager.sortByCustomerName();
                    break;
                case 7:
                    orderManager.sortByTotalPrice();
                    break;
                case 8:
                    orderManager.printHistory();
                    break;
                case 9:
                    OrderStorage.saveOrder(orderManager.getOrders());
                    break;
                case 10:
                    ArrayList<Order> loadedOrders = OrderStorage.loadOrders();
                    if (loadedOrders.isEmpty()) {
                        System.out.println("Không có đơn hàng nào được tải.");
                    } else {
                        System.out.println("Đã tải " + loadedOrders.size() + " đơn hàng từ file.");
                        for (Order order : loadedOrders) {
                            order.displayInfo();  // Hiển thị thông tin đơn hàng
                        }
                    }
                    break;
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
        scanner.nextLine();
        System.out.println("Mã đơn hàng:");
        String orderId = scanner.nextLine();
        System.out.println("Nhập tên khách hàng:");
        String customerName = scanner.nextLine();
        System.out.println("Ngày đặt hàng(yyyy/MM/dd):");
        int orderDate = scanner.nextInt();
        if (type == 1) {
            System.out.print("Giá sản phẩm: ");
            double itemPrice = scanner.nextDouble();
            System.out.print("Số tháng bảo hành: ");
            int warrantyMonths = scanner.nextInt();
            ElectronicsOrder eo = new ElectronicsOrder(orderId, customerName, orderDate, itemPrice, warrantyMonths);
            orderManager.addOrder(eo);
        } else if (type == 2){
            System.out.print("Giá cơ bản: ");
            double basePrice = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Size (S/M/L/XL): ");
            String size = scanner.nextLine();
            ClothingOrder co = new ClothingOrder(orderId, customerName, orderDate, basePrice, size);
            orderManager.addOrder(co);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
    }


}
