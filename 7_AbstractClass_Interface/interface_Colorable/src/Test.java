public class Test {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(8),
                new Rectangle(5,3),
                new Square(4)
        };
        for (Shape shape : shapes) {
            double area =0;
            if (shape instanceof Circle) {
                area = ((Circle)shape).getArea();
            }else if (shape instanceof Rectangle) {
                area = ((Rectangle) shape).getArea();
            }
            System.out.println("Area: " + area);
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
            System.out.println();
        }
    }
}
