package controller;
import model.Order;
import java.util.ArrayList;
import java.util.LinkedList;

public class OrderManager {
    private ArrayList<Order> orders;
    private LinkedList<String> history;
    public OrderManager() {
        orders = new ArrayList<>();
        history = new LinkedList<>();
    }
    public void addOrder(Order o) {
        orders.add(o);
        history.add(o.toString());
    }
    public void removeOrder(String orderID) {
        boolean removed = false;
        for (int i=0 ; i<orders.size(); i++) {
            if (orders.get(i).getOrderId().equals(orderID)) {
                orders.remove(i);
                history.add(orderID + " is removed.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            history.add(orderID + " is not found.");
        }
    }
    public void displayAllOrders(){
        System.out.println("Tất cả các đơn đặt hàng:");
        if (orders.isEmpty()) {
            System.out.println("No orders to display.");
        } else {
            for (Order order : orders) {
                order.displayInfo();
                System.out.println("--------------");
            }
        }
        history.add("Xem tất cả đơn đặt hàng.");
    }
    public void displayRevenueReport(){
        System.out.println("Báo cáo doanh thu:");
        for (Order order : orders) {
            System.out.println(order.calculateTotalPrice());
        }
        history.add("Xem báo cáo thuế.");
    }
    public void sortByOrderDate(){
        orders.sort(null);
        history.add("sắp xếp thep ngày đặt hàng.");
    }
    public void sortByCustomerName(){
        orders.sort(new CustomerNameComparator());
        history.add("Sắp xếp đơn hàng theo tên(A-Z).");
    }
    public void sortByTotalPrice(){
        orders.sort(new PaymentAmountComparator());
        history.add("Sắp xếp đơn hàng theo giá.");
    }
    public void printHistory(){
        System.out.println("Lịch sử thao tác:");
        for (String s : history) {
            System.out.println(s);
        }

    }
}
