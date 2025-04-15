public class Test {
    public static void main(String[] args) {
        Resizeable[] shapes = {
                new Circle(5),
                new Rectangle(4,6),
                new Square(3)
        };
        for (Resizeable shape : shapes) {
            System.out.println("Kích thước trước khi thay đổi: "+shape);
            shape.resize(20);
            System.out.println("Kích thước sau khi thay đổi: "+shape);
            System.out.println();
        }
    }
}
