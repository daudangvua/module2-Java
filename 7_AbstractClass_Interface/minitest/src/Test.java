import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Personnel[] guy = new Personnel[6];
        guy[0] = new FullTimeEmployee("full1","NV1",22,"0123456765","NV1@gmail.com",101000,50000,1200000);
        guy[1] = new FullTimeEmployee("full2","NV2",30,"0123456789","NV2@gmail.com",156000,70000,1300000);
        guy[2] = new FullTimeEmployee("full3","NV3",18,"0155553789","NV3@gmail.com",61000,0,1620000);
        guy[3] = new OvertimeEmployees("ov1","NV4",19,"0921345543","NV4@gmail.com",8);
        guy[4] = new OvertimeEmployees("ov2","NV5",17,"0912235763","NV5@gmail.com",4);
        guy[5] = new OvertimeEmployees("ov3","NV6",21,"0987349844","NV6@gmail.com",6);

        for (Personnel p : guy) {
            System.out.println(p.getFullName()+": "+p.getFoodReceived()+" VND");
        }

        double sum = 0;
        double average=0;
        for (Personnel p : guy) {
            sum += p.getFoodReceived();
            average = sum/guy.length;
        }System.out.println("\nLương trung bình: "+average+" VND");


        boolean found = false;
        for (Personnel p : guy) {
            if (p.getFoodReceived()<average && p instanceof FullTimeEmployee) {
                System.out.println(p.getFullName()+": "+p.getFoodReceived()+" VND");
                found = true;
            }
        }
        if (!found) {
            System.out.println("\nKhông có nhân viên nào thấp hơn mức lương trung bình.");
        }


        double sumPartTime = 0;
        for (Personnel p : guy) {
            if (p instanceof OvertimeEmployees) {
                sumPartTime+= p.getFoodReceived();
            }
        }
        System.out.println("\nLương phải trả cho tất cả nhân viên bán thời gian: "+sumPartTime+" VND\n");

        Arrays.sort(guy);
        for (Personnel p : guy) {
            if (p instanceof FullTimeEmployee) {
                System.out.println(p.getFullName()+": "+p.getFoodReceived()+" VND");
            }
        }

    }
}
