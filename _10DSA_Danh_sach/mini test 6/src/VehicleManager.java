import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class VehicleManager {
    private ArrayList<Vehicle> vehicleList;
    private LinkedList<String> actionHistory;

    public VehicleManager() {
        vehicleList = new ArrayList<>();
        actionHistory = new LinkedList<>();
    }

    public void addVehicle(Vehicle v) {
        vehicleList.add(v);
        actionHistory.add("Đã thêm xe: "+v.getId());
    }

    public void removeVehicle(String id) {
        boolean removed = false;
        for (int i =0; i<vehicleList.size(); i++ ) {
            if (vehicleList.get(i).getId().equals(id)) {
                vehicleList.remove(i);
                actionHistory.add("Đã xóa xe: "+id);
                System.out.println("Đã xóa xe: "+id);
                removed = true;
                break;
            }
        }
        if (!removed) {
            actionHistory.add("Xe muốn xóa không tồn tại: " + id);
            System.out.println("Không tồn tại xe có ID: " + id);
        }
    }
    public void displayAllVehicles() {
        System.out.println("Tất cả xe:");
        for (Vehicle v : vehicleList) {
            v.displayInfo();
            System.out.println("-------------------");
        }
        actionHistory.add("Đã hiển thị danh sách phương tiện.");
    }
    public void displayTaxReport() {
        System.out.println("Báo cáo thuế");
        for (Vehicle v : vehicleList) {
            System.out.println("ID: "+v.getId()+"\nTax: "+v.calculateTax()+"\n");
        }
        actionHistory.add("Đã hiển thị báo cáo thuế.");
    }

    public void sortByYear () {
        Collections.sort(vehicleList);
        System.out.println("Sắp xếp theo năm (tăng dần).");
        actionHistory.add("Đã hiển thị sắp xếp theo năm.");
    }
    public void sortByBrand () {
        Collections.sort(vehicleList,new BrandComparator());
        System.out.println("Sắp xếp theo hãng.");
        actionHistory.add("Đã hiển thị sắp xếp theo hãng.");
    }
    public void sortByTax () {
        Collections.sort(vehicleList, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return Double.compare(o1.calculateTax(), o2.calculateTax());
            }
        });
        System.out.println("Sắp xếp theo thuế.");
        actionHistory.add("Đã hiển thị sắp xếp theo thuế.");
    }
    public void printHistory() {
        System.out.println("Lịch sử thao tác:");
        for (String action : actionHistory) {
            System.out.println(action);
        }
        actionHistory.add("Đã hiện lịch sử thao tác.");
    }
}