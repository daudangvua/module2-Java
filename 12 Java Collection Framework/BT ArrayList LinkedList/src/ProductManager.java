import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> arrayProduct = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void addProduct() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = sc.nextDouble();
        arrayProduct.add(new Product(id,name,price));
        System.out.println("Đã thêm sản phẩm!");
    }
    public void updateProductById() {
        System.out.println("Nhập ID sản phẩm muốn sửa: ");
        String id = sc.nextLine();
        for (Product product : arrayProduct) {
            if(product.getId()==id) {
                System.out.println("Nhập tên sản phẩm mới: ");
                product.setName(sc.nextLine());
                System.out.println("Nhập giá mới: ");
                product.setPrice(sc.nextDouble());
                System.out.println("Cập nhập thành công!");
                return;
            }
        }
        System.out.println("Không thấy sản phẩm cần sửa!");
    }
    public void deleteProductById() {
        System.out.println("Nhập ID sản phẩm muốn xóa: ");
        String id = sc.nextLine();

        arrayProduct.remove(String.valueOf(id));
        System.out.println("Đã xóa sản phẩm có ID: " + id);
    }

}
