package model;

public class ClothingOrder extends Order {
    private double basePrice;
    private String size;

    public ClothingOrder() {
    }

    public ClothingOrder(double basePrice, String size) {
        this.basePrice = basePrice;
        this.size = size;
    }

    public ClothingOrder(String orderId, String customerName, int orderDate, double basePrice, String size) {
        super(orderId, customerName, orderDate);
        this.basePrice = basePrice;
        this.size = size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!isValidSize(size)) {
            throw new IllegalArgumentException("Kích cỡ không hợp lệ (phải là S, M, L, hoặc XL)");
        }
        this.size = size;
    }
    private boolean isValidSize(String size) {
        return size != null && (size.equals("S") || size.equals("M") || size.equals("L") || size.equals("XL"));
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    @Override
    public double calculateTotalPrice() {
        return (getSize().equals("L") || getSize().equals("XL")) ? getBasePrice()+(getBasePrice() * 0.1) : getBasePrice();
    }
    @Override
    public String toString() {
        return "Đơn hàng quần áo:" +
                "\nMã: " + getOrderId() +
                "\nTên khách hàng: " + getCustomerName() +
                "\nNgày đặt hàng: " + getOrderDate() +
                "\nGiá: " + calculateTotalPrice() +
                "\nsize: " + getSize();
    }
}
