import java.util.LinkedList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class LinkedLista {
    private LinkedList<Product> productList  = new LinkedList();
    private Scanner sc = new Scanner(System.in);
    public void seedData() {
        productList .add(new Product("1","but",100));
        productList .add(new Product("2","vo",200));
    }
    public void addProduct() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = sc.nextDouble();
        productList .add(new Product(id,name,price));
        System.out.println("Đã thêm sản phẩm!");
    }
    public void updateProductById() {
        System.out.println("Nhập ID sản phẩm muốn sửa: ");
        String id = sc.nextLine();
        for (Product product : productList ) {
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
        Iterator<Product> iterator = productList .iterator();
        boolean isFound = false;
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId().equals(id)){
                iterator.remove();
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Đã xóa sản phẩm có ID: " + id);
        }else {
            System.out.println("Không tìm thấy sản phẩm với ID: " + id);
        }
    }
    public void showAllProduct() {
        System.out.println("Danh sách sản phẩm:");
        for (Product product : productList ) {
            System.out.println(product);
        }
    }
    public void searchProductByName() {
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String name = sc.nextLine().toLowerCase();
        for (Product product : productList ) {
            if (product.getName().toLowerCase().contains(name)) {
                System.out.println(product);
            }
        }

    }
    public void sortProductByPrice(boolean isAscending) {
        Comparator<Product> comparator = new Comparator<>() {
            @Override
            public int compare(Product p1, Product p2) {
                return isAscending
                        ? Double.compare(p1.getPrice(), p2.getPrice())
                        : Double.compare(p2.getPrice(), p1.getPrice());
            }
        };
        productList .sort(comparator);
        System.out.println("Đã sắp xếp sản phẩm theo giá " + (isAscending ? "tăng dần" : "giảm dần"));
    }

}
