import java.util.Scanner;

public class Test {

    public static final int MOTORBIKE = 1;
    public static final int CAR = 2;

    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm phương tiện");
            System.out.println("2. Xoá phương tiện theo mã");
            System.out.println("3. Hiển thị danh sách phương tiện");
            System.out.println("4. Hiển thị báo cáo thuế");
            System.out.println("5. Sắp xếp theo năm sản xuất");
            System.out.println("6. Sắp xếp theo hãng sản xuất");
            System.out.println("7. Sắp xếp theo thuế tăng dần");
            System.out.println("8. Xem lịch sử thao tác");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập loại phương tiện (1. Xe hơi | 2. Xe máy): ");
                    int type = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập mã xe: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập hãng xe: ");
                    String brand = sc.nextLine();
                    System.out.print("Nhập năm sản xuất: ");
                    int year = Integer.parseInt(sc.nextLine());

                    if (type == MOTORBIKE) {
                        System.out.print("Nhập số chỗ ngồi: ");
                        int seats = Integer.parseInt(sc.nextLine());
                        Vehicle car = new Car(id, brand, year, seats);
                        manager.addVehicle(car);
                    } else if (type == CAR) {
                        System.out.print("Nhập công suất động cơ: ");
                        int power = Integer.parseInt(sc.nextLine());
                        Vehicle bike = new Motorbike(id, brand, year, power);
                        manager.addVehicle(bike);
                    } else {
                        System.out.println("Loại không hợp lệ.");
                    }
                    break;

                case 2:
                    System.out.print("Nhập mã xe cần xóa: ");
                    String delId = sc.nextLine();
                    manager.removeVehicle(delId);
                    break;

                case 3:
                    manager.displayAllVehicles();
                    break;

                case 4:
                    manager.displayTaxReport();
                    break;

                case 5:
                    manager.sortByYear();
                    manager.displayAllVehicles();
                    break;

                case 6:
                    manager.sortByBrand();
                    manager.displayAllVehicles();
                    break;

                case 7:
                    manager.sortByTax();
                    manager.displayAllVehicles();
                    break;

                case 8:
                    manager.printHistory();
                    break;

                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }

        } while (choice != 0);

        sc.close();
    }
}
