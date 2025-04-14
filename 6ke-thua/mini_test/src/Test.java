import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FictionBook[] fictionBook = new FictionBook[3];
        fictionBook[0] = new FictionBook("Viễn tưởng","vt10",115000,"Naruto","Nha xuat ban A");
        fictionBook[1] = new FictionBook("Kỹ năng giao tiếp","war231",130000,"Đắc Nhân Tâm","Dale Carnegie");
        fictionBook[2] = new FictionBook("Trinh thám","TT99",99000,"Conan","Nhà xuất bản B");

        ProgrammingBook[] programmingBook = new ProgrammingBook[3];
        programmingBook[0] =new ProgrammingBook("Java","Web Development","King_001","Web",543000,"A");
        programmingBook[1] =new ProgrammingBook("Java","Game Development","King_002","Game",623000,"B");
        programmingBook[2] =new ProgrammingBook("Bootstrap","HTML, CSS, JavaScript","King_003","Giao diện web",543000,"C");
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Fiction Book(Sách tiểu thuyết)");
            System.out.println("2. Programming Book(Sách lập trình)");
            System.out.println("3. Tổng tiền tất cả các cuốn sách");
            System.out.println("4. Sách Fiction có thể loại viễn tưởng là:");
            System.out.println("5. Sách Fiction có giá nhỏ hơn 100 nghìn là:");
            System.out.println("6. Sách Programming có language(Java) là:");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inFictionBook(fictionBook);
                    break;
                case 2:
                    inProgrammingBook(programmingBook);
                    break;
                case 3:
                    System.out.println("\n--- Tổng tiền tất cả các cuốn sách là: ---");
                    sum(fictionBook,programmingBook);
                    break;
                case 4:
                    System.out.println("\n--- Sách Fiction có thể loại viễn tưởng là: ---");
                    fictionBook(fictionBook);
                    break;
                case 5:
                    System.out.println("\n--- Sách Fiction có giá nhỏ hơn 100 nghìn là: ---");
                    checkPrice(fictionBook);
                    break;
                case 6:
                    System.out.println("\n--- Sách Programming có language(Java) là: ---");
                    javaBook(programmingBook);
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }
    public static void inFictionBook(FictionBook[] fictionBook) {
        for (FictionBook fb : fictionBook) {
            fb.toString();
            System.out.println(fb);
        }
    }
    public static void inProgrammingBook(ProgrammingBook[] programmingBook) {
        for (ProgrammingBook pb : programmingBook) {
            pb.toString();
            System.out.println(pb);
        }
    }
    public static void sum(FictionBook[] fictionBook, ProgrammingBook[] programmingBook) {
        double sum = 0;
        for (FictionBook fb : fictionBook) sum += fb.getPrice();
        for (ProgrammingBook pb : programmingBook) sum += pb.getPrice();
        System.out.println(sum+" VND");
    }
    public static void fictionBook(FictionBook[] fictionBook) {
        for (FictionBook fb : fictionBook) {
            if(fb.getCategory().equals("Viễn tưởng")) {
                System.out.println(fb);
            }
        }
    }
    public static void javaBook(ProgrammingBook[] programmingBook) {
        for (int i = 0; i < programmingBook.length; i++) {
            if (programmingBook[i].getLanguage().equals("Java")) {
                System.out.println(programmingBook[i]);
            };
        }
    }
    public static void checkPrice(FictionBook[] fictionBook) {
        for (FictionBook fb : fictionBook) {
            if(fb.getPrice()<100000) {
                System.out.println(fb);
            }
        }
    }
}
