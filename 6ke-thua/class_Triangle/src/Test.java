public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape("red","hình");
        System.out.println(shape);
        Shape triangle = new Triangle(3,4,6,"blue","Tam giác");
        System.out.println(triangle);
    }
}
