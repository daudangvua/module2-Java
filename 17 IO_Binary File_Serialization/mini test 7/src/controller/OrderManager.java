package controller;
import model.Order;
import storage.OrderStorage;
import java.io.*;
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
        history.add("Đã thêm đơn hàng có mã "+o.getOrderId()+".");
    }
    public void removeOrder(String orderID) {
        boolean removed = false;
        for (int i=0 ; i<orders.size(); i++) {
            if (orders.get(i).getOrderId().equals(orderID)) {
                orders.remove(i);
                history.add("Đã xóa đơn hàng có mã "+orderID + ".");
                System.out.println("Đã xóa đơn hàng có mã "+orderID + ".");
                removed = true;
                break;
            }
        }
        if (!removed) {
            history.add("Cố gắng xóa mã "+ orderID + " không tồn tại.");
            System.out.println("Mã "+orderID+" Không tồn tại.");
        }
    }
    public void displayAllOrders(){
        System.out.println("Tất cả các đơn đặt hàng:");
        if (orders.isEmpty()) {
            System.out.println("Không có đơn hàng nào để hiển thị.");
        } else {
            for (Order order : orders) {
                order.displayInfo();
                System.out.println("--------------");
            }
        }
        history.add("Xem tất cả đơn đặt hàng.");
    }
    public void displayRevenueReport(){
        System.out.println("==== BÁO CÁO DOANH THU ====");
        double totalRevenue = 0;
        if (orders.isEmpty()) {
            System.out.println("Không có đơn hàng nào để tính doanh thu.");
        }else {
            for (Order order : orders) {
                double price = order.calculateTotalPrice();
                System.out.println("Khách hàng: " + order.getCustomerName() +
                        " | Mã đơn: " + order.getOrderId() +
                        " | Tổng tiền: " + price + " VND");
                totalRevenue += price;
            }
            System.out.println("---------------------------");
            System.out.println("TỔNG DOANH THU: " + totalRevenue + " VND");
        }
        history.add("Xem báo cáo hoanh thu.");
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
        System.out.println("==== LỊCH SỬ THAO TÁC ====");
        for (String s : history) {
            System.out.println(s);
        }
    }
    public ArrayList<Order> getOrders() {
        history.add("Lưu vào file nhị phân.");
        return orders;
    }
    public void loadOrders() {
        OrderStorage storage = new OrderStorage();
        ArrayList<Order> loadedOrders = storage.loadOrders();

        if (loadedOrders.isEmpty()) {
            System.out.println("Không có đơn hàng nào được tải từ file.");
            history.add("Tải danh sách đơn hàng thất bại hoặc file trống.");
        } else {
            this.orders = loadedOrders;
            System.out.println("Đã tải " + orders.size() + " đơn hàng từ file.");
            for (Order order : loadedOrders) {
                order.displayInfo();  // Hiển thị thông tin đơn hàng
                System.out.println("---------------------------");
            }
            history.add("Tải danh sách đơn hàng từ file thành công.");
        }
    }

}
