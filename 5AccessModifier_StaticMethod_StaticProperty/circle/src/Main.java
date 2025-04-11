public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1:"+ " Radius = " + c1.getRadius()+ " Area = " + c1.getArea());
        Circle c2 = new Circle(5);
        System.out.println("c2:"+ " Radius = " + c2.getRadius()+ " Area = " + c2.getArea());
    }
}