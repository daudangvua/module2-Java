public class Test {
    public static void main(String[] args) {
        MoveablePoint m = new MoveablePoint(5, 10, 1.5f, 2.5f);
        System.out.println("Trước khi di chuyển: \n" + m);
        m.move();
        System.out.println("Sau khi di chuyển: \n" + m);
    }
}
