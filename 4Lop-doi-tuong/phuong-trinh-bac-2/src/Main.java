import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phương trình bậc hai: ax\u00B2 + bx + c = 0");
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("a: "+quadraticEquation.getA());
        System.out.println("b: "+quadraticEquation.getB());
        System.out.println("c: "+quadraticEquation.getC());
        System.out.println("Phương trình bậc hai sau khi nhập là: \n"+ quadraticEquation.getA()+"x\u00B2 + " + quadraticEquation.getB()+"x + " + quadraticEquation.getC()+" = 0");
        System.out.println("delta= "+quadraticEquation.getDiscriminant());
        if(Double.isNaN(quadraticEquation.getRoot1()) && Double.isNaN(quadraticEquation.getRoot2())) {
            System.out.println("Phương trình vô nghiệm.");
        } else if(quadraticEquation.getRoot1() == quadraticEquation.getRoot2()) {
            System.out.println("Phương trình có nghiệm kép: x =" + quadraticEquation.getRoot1());
        } else {
            System.out.println("Nghiệm 1: x1 = " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm 2: x2 = " + quadraticEquation.getRoot2());
        }
    }
}
