package storage;

import model.Order;

import java.io.*;
import java.util.ArrayList;

public class OrderStorage {
    public static void saveOrder(ArrayList<Order> orders) {
        File dir = new File("storage");
        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                System.out.println("Không thể tạo thư mục storage!");
                return;
            }
        }

        File file = new File(dir,"order.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(orders);
            System.out.println("Đã lưu danh sách đơn hàng vào:"+file.getPath());
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu file: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<Order> loadOrders() {
        File dir = new File("storage");
        File file = new File(dir, "order.txt");

        // Kiểm tra file có tồn tại không
        if (!file.exists()) {
            System.out.println("File không tồn tại!");
            return new ArrayList<>();  // Trả về danh sách rỗng nếu file không tồn tại
        }

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            // Đọc đối tượng từ file
            ArrayList<Order> orders = (ArrayList<Order>) ois.readObject();
            System.out.println("Đã đọc danh sách đơn hàng từ: " + file.getPath());
            return orders;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
            return new ArrayList<>();  // Trả về danh sách rỗng trong trường hợp có lỗi
        }
    }
}
