package view;

import model.ClothingOrder;
import model.ElectronicsOrder;
import controller.OrderManager;
import model.Order;
import storage.OrderStorage;

import java.time.LocalDate;
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
                    orderManager.loadOrders();
                    break;
            }
        }while (choice !=0);
        scanner.close();
    }
    public static void addNewOder() {
        int type = chooseOrderType();
        String orderId = inputOrderId();
        String customerName = inputCustomerName();
        int orderDate = inputOrderDate();

        if (type == 1) {
            ElectronicsOrder eo = createElectronicsOrder(orderId, customerName, orderDate);
            orderManager.addOrder(eo);
        } else {
            ClothingOrder co = createClothingOrder(orderId, customerName, orderDate);
            orderManager.addOrder(co);
        }
    }

    public static int chooseOrderType() {
        int type;
        while (true) {
            System.out.println("Bạn muốn thêm đơn hàng nào:");
            System.out.println("1. Điện tử");
            System.out.println("2. Quần áo");
            System.out.print("Chọn: ");
            if (scanner.hasNextInt()) {
                type = scanner.nextInt();
                scanner.nextLine(); // clear buffer
                if (type == 1 || type == 2) return type;
            } else {
                scanner.nextLine();
            }
            System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập 1 hoặc 2.");
        }
    }

    public static String inputOrderId() {
        String orderId;
        do {
            System.out.print("Mã đơn hàng: ");
            orderId = scanner.nextLine().trim();
        } while (orderId.isEmpty());
        return orderId;
    }

    public static String inputCustomerName() {
        String name;
        do {
            System.out.print("Tên khách hàng: ");
            name = scanner.nextLine().trim();
        } while (name.isEmpty());
        return name;
    }

    public static int inputOrderDate() {
        int date;
        while (true) {
            System.out.print("Ngày đặt hàng (yyyyMMdd): ");
            if (scanner.hasNextInt()) {
                date = scanner.nextInt();
                if (String.valueOf(date).length() == 8) return date;
            }
            scanner.nextLine();
            System.out.println("Ngày không hợp lệ. Nhập lại theo định dạng yyyyMMdd.");
        }
    }

    public static ElectronicsOrder createElectronicsOrder(String orderId, String customerName, int orderDate) {
        double itemPrice = -1;
        while (itemPrice < 0) {
            System.out.print("Giá sản phẩm: ");
            if (scanner.hasNextDouble()) {
                itemPrice = scanner.nextDouble();
                if (itemPrice < 0) System.out.println("Giá không được âm.");
            } else {
                scanner.next();
                System.out.println("Giá không hợp lệ.");
            }
        }

        int warrantyMonths = -1;
        while (warrantyMonths < 0) {
            System.out.print("Số tháng bảo hành: ");
            if (scanner.hasNextInt()) {
                warrantyMonths = scanner.nextInt();
                if (warrantyMonths < 0) System.out.println("Số tháng không được âm.");
            } else {
                scanner.next();
                System.out.println("Dữ liệu không hợp lệ.");
            }
        }

        return new ElectronicsOrder(orderId, customerName, orderDate, itemPrice, warrantyMonths);
    }

    public static ClothingOrder createClothingOrder(String orderId, String customerName, int orderDate) {
        double basePrice = -1;
        while (basePrice < 0) {
            System.out.print("Giá cơ bản: ");
            if (scanner.hasNextDouble()) {
                basePrice = scanner.nextDouble();
                if (basePrice < 0) System.out.println("Giá không được âm.");
            } else {
                scanner.next();
                System.out.println("Giá không hợp lệ.");
            }
        }
        scanner.nextLine(); // clear buffer

        String size;
        while (true) {
            System.out.print("Size (S/M/L/XL): ");
            size = scanner.nextLine().trim().toUpperCase();
            if (isValidSize(size)) break;
            System.out.println("Kích cỡ không hợp lệ.");
        }

        return new ClothingOrder(orderId, customerName, orderDate, basePrice, size);
    }

    public static boolean isValidSize(String size) {
        return size != null && (size.equals("S") || size.equals("M") || size.equals("L") || size.equals("XL"));
    }

}