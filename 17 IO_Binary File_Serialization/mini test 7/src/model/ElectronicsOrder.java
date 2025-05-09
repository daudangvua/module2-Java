package model;

public class ElectronicsOrder extends Order {
    private double itemPrice;
    private int warrantyMonths;

    public ElectronicsOrder() {
    }

    public ElectronicsOrder(double itemPrice, int warrantyMonths) {
        this.itemPrice = itemPrice;
        this.warrantyMonths = warrantyMonths;
    }

    public ElectronicsOrder(String orderId, String customerName, int orderDate, double itemPrice, int warrantyMonths) {
        super(orderId, customerName, orderDate);
        this.itemPrice = itemPrice;
        this.warrantyMonths = warrantyMonths;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    @Override
    public double calculateTotalPrice() {
        return getItemPrice()+(getWarrantyMonths()*50);
    }
    @Override
    public String toString() {
        return "Đơn hàng điện tử:" +
                "\nMã: " + getOrderId() +
                "\nTên khách hàng: " + getCustomerName() +
                "\nNgày đặt hàng: " + getOrderDate() +
                "\nGiá: " + calculateTotalPrice() +
                "\nTháng bảo hành: " + getWarrantyMonths();
    }
}
