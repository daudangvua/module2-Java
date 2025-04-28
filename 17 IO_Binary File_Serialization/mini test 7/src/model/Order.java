package model;
import java.io.Serializable;
import java.time.LocalDate;

public abstract class Order implements Payable, Comparable<Order>, Serializable {
    private String orderId;
    private String customerName;
    private LocalDate orderDate;

    public Order() {
    }

    public Order(String orderId, String customerName, LocalDate orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public abstract void displayInfo();

    @Override
    public int compareTo(Order o) {
        return this.orderDate.compareTo(o.orderDate);
    }
    @Override
    public String toString() {
        return "model.Order{" +
                "orderId='" + orderId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}
