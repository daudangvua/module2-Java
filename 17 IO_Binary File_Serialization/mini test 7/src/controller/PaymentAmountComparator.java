package controller;
import model.Order;
import java.util.Comparator;

public class PaymentAmountComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return Double.compare(o1.calculateTotalPrice(), o2.calculateTotalPrice());
    }
}
