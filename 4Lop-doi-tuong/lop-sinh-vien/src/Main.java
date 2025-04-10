import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        student[0] = new Student(0001, "Tran Văn A", "a@gamil.com", 20, 6);
        student[1] = new Student(0002, "Tran Văn B", "b@gamil.com", 19, 3);
        student[2] = new Student(0003, "Tran Văn C", "c@gamil.com", 18, 5);
        student[3] = new Student(0004, "Tran Văn D", "d@gamil.com", 15, 8);
        student[4] = new Student(0005, "Tran Văn E", "e@gamil.com", 21, 2);

        int averageAge = 0;
        for (int i = 0; i < student.length; i++) {
            averageAge += student[i].age;
        }
        int averageAge1 = averageAge / student.length;
        System.out.println("Tuổi trung bình: " + averageAge1);

        int diem = 0;
        for(int i = 0;i<student.length;i++){
            if(student[i].Grade>5){
                diem++;
            }
        }
        System.out.println("Diem lớn hơn 5: " + diem);

        int index=0;
        for(int i = 0;i<student.length;i++){
            if (student[i].Fullname=="Tran Văn A") {
                index = i;
            }
        }
        System.out.printf("Email Tran Văn A la: " + student[index].Email);
    }
}
