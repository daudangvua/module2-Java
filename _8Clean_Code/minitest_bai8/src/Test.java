import java.time.LocalDate;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Material[] material = new Material[10];
        material[0] = new CrispyFlour("cr1", "giòn", LocalDate.of(2024,10,1), 11000, 10);
        material[1] = new CrispyFlour("cr2", "mịn", LocalDate.of(2024, 12, 5), 15000, 4);
        material[2] = new CrispyFlour("cr3", "xù", LocalDate.of(2024, 6, 22), 17000, 7);
        material[3] = new CrispyFlour("cr4", "ngon", LocalDate.of(2024, 4, 23), 10000, 12);
        material[4] = new CrispyFlour("cr5", "king", LocalDate.of(2024, 11, 1), 22000, 6);
        material[5] = new Meat("m1","pig",LocalDate.of(2025, 4, 14),70000,500 );
        material[6] = new Meat("m1","chicken",LocalDate.of(2025, 4, 15),60000, 300);
        material[7] = new Meat("m1","cow",LocalDate.of(2025, 4, 13),90000, 200);
        material[8] = new Meat("m1","dog",LocalDate.of(2025, 4, 12),1000000, 250);
        material[9] = new Meat("m1","goat",LocalDate.of(2025, 4, 11),77000, 600);
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Danh sách sản phẩm");
            System.out.println("2. Thêm nguyên liệu");
            System.out.println("3. Sửa nguyên liệu");
            System.out.println("4. Xóa nguyên liệu");
            System.out.println("5. Tổng chênh lệch giá gốc và giá sau giảm");
            System.out.println("Nhập lựa chọn:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    extracted(material);
                    break;
                case 2:
                    material=addMaterial(material,scanner);
                    break;
                case 3:
                    updateMaterial(material, scanner);
                    break;
                case 4:
                    material =deleteMaterial(material,scanner);
                    break;
                case 5:
                    calculateDiscountDifference(material);
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }while (choice!=0);
    }

    public static void extracted(Material[] material) {
        System.out.println("--- BỘT CHIÊN GIÒN ---");
        for (Material m : material) {
            if (m instanceof CrispyFlour) {
                System.out.println(m);
            }
        }
        System.out.println("--- THỊT ---");
        for (Material m : material) {
            if (m instanceof Meat) {
                System.out.println(m);
            }

        }
    }
    public static Material[] addMaterial(Material[] material,Scanner scanner) {
        scanner.nextLine();
        System.out.println("\nChọn nguyên liệu muốn thêm");
        System.out.println("1: Bột chiên giòn");
        System.out.println("2: Thịt");
        System.out.println("0: Thoát");
        int type = scanner.nextInt();
        scanner.nextLine();
        if (type == 0) {
            System.out.println("Đã Thoát.");
            return material;
        }
        if (type != 1 && type != 2) {
            System.out.println("Loại nguyên liệu không hợp lệ.");
            return material;
        }

        String id;
        while (true) {
            System.out.println("id: ");
            id = scanner.nextLine();
            boolean isDuplicate = false;
            for (Material m : material) {
                if (m != null && m.getId().equals(id)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                System.out.println("id đã tồn tại. Nhập lại.");
            } else {
                break;
            }
        }
        System.out.println("name: ");
        String name = scanner.nextLine();
        System.out.println("expiration date(yyyy-mm-dd): ");
        String expirationDate = scanner.nextLine();
        LocalDate date = LocalDate.parse(expirationDate);
        int cost;
        while (true) {
            System.out.println("cost: ");
            cost = scanner.nextInt();
            if (cost > 0) {
                break;
            }
            System.out.println("cost không âm. Nhập lại.");
        }
        scanner.nextLine();
        Material newMaterial = null;
        if (type == 1) {
            int quantity;
            while (true) {
                System.out.println("quantity: ");
                quantity = scanner.nextInt();
                if (quantity > 0) {
                    break;
                }
                System.out.println("quantity không âm. Nhập lại. ");
            }
            newMaterial = new CrispyFlour(id,name,date,cost,quantity);
        }else {
            int weight;
            while (true) {
                System.out.println("weight: ");
                weight = scanner.nextInt();
                if (weight > 0) {
                    break;
                }
                System.out.println("weight không âm. Nhập lại.");
            }
            newMaterial = new Meat(id,name,date,cost,weight);
        }
        for (int i=0;i<material.length;i++) {
            if (material[i]==null){
                material[i] = newMaterial;
                return material;
            }
        }
        Material[] newArray = new Material[material.length+1];
        System.arraycopy(material,0,newArray,0,material.length);
        newArray[material.length]=newMaterial;
        return newArray;
    }
    public static void updateMaterial(Material[] material,Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập id muốn sửa: ");
        String id = scanner.nextLine();
        for (Material m : material) {
            if ( m!=null && m.getId().equals(id)) {
                System.out.println("Thông tin hàng muốn sửa:");
                System.out.println(m);

                System.out.println("name(Enter để giữ nguyên): ");
                String name = scanner.nextLine();
                if (!name.isEmpty()) {
                    m.setName(name);
                }

                System.out.println("expiration date(yyyy-mm-dd)(Enter để giữ nguyên): ");
                String expirationDate = scanner.nextLine();
                if (!expirationDate.isEmpty()) {
                    LocalDate date = LocalDate.parse(expirationDate);
                    m.setManufacturingDate(date);
                }

                System.out.println("cost(Enter để giữ nguyên): ");
                String costStr = scanner.nextLine();
                if (!costStr.isEmpty()) {
                    int cost = Integer.parseInt(costStr);
                    m.setCost(cost);
                }

                if (m instanceof CrispyFlour) {
                    System.out.println("quantity(Enter để giữ nguyên): ");
                    String qtyStr = scanner.nextLine();
                    if (!qtyStr.isEmpty()) {
                        int qty = Integer.parseInt(qtyStr);
                        ((CrispyFlour) m).setQuantity(qty);
                    }
                }else if (m instanceof Meat) {
                    System.out.println("weight(Enter để giữ nguyên): ");
                    String weightStr = scanner.nextLine();
                    if (!weightStr.isEmpty()) {
                        int weight = Integer.parseInt(weightStr);
                        ((Meat) m).setWeight(weight);
                    }
                }
                System.out.println("Đã sửa: ");
                return;
            }
        }
        System.out.println("Không tìm thấy id: "+id);
    }
    public static Material[] deleteMaterial(Material[] material,Scanner scanner) {
        scanner.nextLine();
        System.out.println("\nNhập id muốn xóa:");
        String id = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < material.length; i++) {
            if (material[i] != null && material[i].getId().equals(id)) {
                material[i] = null;
                System.out.println("Đã xóa sản phẩm có id: "+id);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy id muốn xóa.");
        }
        return material;
    }
    public static void calculateDiscountDifference(Material[] material) {
        double sumAmount=0;
        for (Material m : material) {
            sumAmount+=m.getAmount();
        }
        double sumRealMoney=0;
        for (Material m : material) {
            if (m instanceof Discount) {
                sumRealMoney+=((Discount)m).getRealMoney();
            }
        }
        double difference = sumAmount - sumRealMoney;
        System.out.println("\n--- Tổng chênh lệch giá gốc và giá sau giảm ---");
        System.out.printf("Tổng giá gốc: %,.0f\n", sumAmount);
        System.out.printf("Tổng giá sau chiết khấu: %,.0f\n", sumRealMoney);
        System.out.printf("Chênh lệch: %,.0f\n", difference);
    }
}
