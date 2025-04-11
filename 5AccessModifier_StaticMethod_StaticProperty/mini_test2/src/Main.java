public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(01,"bút",4000,32);
        products[1] = new Product(02,"tai nghe",860000,4);
        products[2] = new Product(03,"vở",9000,10);
        products[3] = new Product(04,"bàn",400000,5);
        products[4] = new Product(05,"ghế",230000,11);
        Product.setStoreName("Vip_pro");
        for (Product p: products) {
            p.display();
            System.out.println();
        }
        System.out.println("Tổng số sản phẩm: "+Product.totalProduct);
        System.out.println("Giá trị kho hàng: "+Product.totalInventoryVal+" VND");
        System.out.println("Giá trung bình: " + Product.getAveragePrice()+" VND");
    }
}
