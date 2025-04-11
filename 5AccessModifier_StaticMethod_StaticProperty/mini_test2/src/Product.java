public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    static String storeName;
    static int totalProduct;
    static double totalInventoryVal;
    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProduct++;
        totalInventoryVal += getTotalInventoryVal();
    }
    public double getTotalInventoryVal() {
        return price*quantity;
    }
    static double getAveragePrice() {
        if(totalProduct==0) {
            return 0;
        } else {
            return totalInventoryVal/totalProduct;
        }
    }
    static String getStoreName() {
        return storeName;
    }
    static void setStoreName(String name) {
        storeName = name;
    }
    public void display() {
        System.out.println("mã: "+id);
        System.out.println("tên: "+name);
        System.out.println("Giá: "+price+" VND");
        System.out.println("Số lượng: "+quantity);
        System.out.println("kho hàng: "+storeName);
//        System.out.println("totalProduct: "+totalProduct);
//        System.out.println("totalInventoryVal: "+totalInventoryVal+" VND");
    }
}
