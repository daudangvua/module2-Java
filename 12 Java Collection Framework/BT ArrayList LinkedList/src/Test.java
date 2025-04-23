import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Sửa thông tin sản phẩm theo ID.");
            System.out.println("3. Xóa sản phẩm theo ID.");
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
                default:
            }
        }while(choice != 0);
    }
}
