import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(01,"bút",4000,32);
        products[1] = new Product(02,"tai nghe",860000,4);
        products[2] = new Product(03,"vở",9000,10);
        products[3] = new Product(04,"bàn",400000,5);
        products[4] = new Product(05,"ghế",230000,11);
        Product.setStoreName("Kho miền Nam");

        inAll(products);

        printInventoryStats();

        Scanner sc = new Scanner(System.in);

        System.out.println("San pham can tim:");
        String input = sc.nextLine();
        Product result= findName(products, input);
        if(result!=null){
            System.out.println("San pham tim thay:");
            result.display();
        }else {
            System.out.println("Khong tim thay san pham.");
        }

        million(products);

        Product maxQuantity = checkMax(products);
        System.out.println("San pham co so luong ton kho lon nhat: ");
        maxQuantity.display();

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
        }
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
