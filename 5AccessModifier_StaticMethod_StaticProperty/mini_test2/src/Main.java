import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(01,"bút",4000,32);
        products[1] = new Product(02,"tai nghe",860000,4);
        products[2] = new Product(03,"vở",9000,10);
        products[3] = new Product(04,"bàn",400000,5);
        products[4] = new Product(05,"ghế",230000,11);
        Scanner sc = new Scanner(System.in);
        Product.setStoreName("Kho miền Nam");
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. In tất cả sản phẩm");
            System.out.println("2. Tìm sản phẩm theo tên");
            System.out.println("3. In sản phẩm có giá > 1 triệu");
            System.out.println("4. Sản phẩm có số lượng lớn nhất");
            System.out.println("5. Thống kê kho");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    inAll(products);
                    break;
                case 2:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String name = sc.nextLine();
                    Product result = findName(products, name);
                    if (result != null) {
                        System.out.println("Sản phẩm tìm thấy:");
                        result.display();
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;
                case 3:
                    million(products);
                    break;
                case 4:
                    Product maxQuantity = checkMax(products);
                    System.out.println("San pham co so luong ton kho lon nhat: ");
                    maxQuantity.display();
                    break;
                case 5:
                    printInventoryStats();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }while (choice != 0);
    }

    public static void printInventoryStats() {
        System.out.println("Tổng số sản phẩm: " + Product.getTotalProduct());
        System.out.println("Giá trị kho hàng: " + Product.totalInventoryVal + " VND");
        System.out.println("Giá trung bình: " + Product.getAveragePrice() + " VND");
    }

    public static void inAll(Product[] products) {
        for (Product p: products) {
            p.display();
            System.out.println();
        }
    }

    public static Product findName(Product[] products, String name) {
        for (Product p: products) {
            if(p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public static void million(Product[] products) {
        System.out.println("San pham co gia lon hon 1trieu la: ");
        boolean flag1 = false;
        for (Product p: products) {
            if (p.getPrice() > 1000000) {
                p.display();
                flag1 = true;
            }
        }
        if (!flag1) {
            System.out.println("Khong co san pham lon hon 1trieu.");
        }System.out.println();
    }

    public static Product checkMax(Product[] products) {
        Product max = products[0];
        for (Product p : products) {
            if (p.getQuantity() > max.getQuantity()) {
                max = p;
            }
        }
        return max;
    }

}
