public class Test {
    public static void main(String[] args) {
        Shape triangle = new Triangle("red");
        System.out.println(triangle);
        Shape triangle2 = new Triangle(3,4,6,"blue");
        System.out.println(triangle2);
    }
}
