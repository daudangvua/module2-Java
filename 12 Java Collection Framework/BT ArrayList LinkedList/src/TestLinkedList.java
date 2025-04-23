import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedLista manager = new LinkedLista();
        manager.seedData();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Sửa thông tin sản phẩm theo ID.");
            System.out.println("3. Xóa sản phẩm theo ID.");
            System.out.println("4. Hiển thị danh sách sản phẩm.");
            System.out.println("5. Tìm kiếm sản phẩm theo tên.");
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá.");
            System.out.println("0. Thoát.");
            System.out.println("Chọn:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.addProduct();
                    break;
                case 2:
                    manager.updateProductById();
                    break;
                case 3:
                    manager.deleteProductById();
                    break;
                case 4:
                    manager.showAllProduct();
                    break;
                case 5:
                    manager.searchProductByName();
                    break;
                case 6:
                    System.out.println("1. Sắp xếp sản phẩm tăng dần theo giá");
                    System.out.println("2. Sắp xếp sản phẩm giảm dần theo giá");
                    int sortChoice = scanner.nextInt();
                    switch (sortChoice) {
                        case 1:
                            manager.sortProductByPrice(true);
                            break;
                        case 2:
                            manager.sortProductByPrice(false);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }while(choice != 0);
    }
}
