public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.5f, 7.2f);
        Point2D point2D1 = new Point2D();
        System.out.println("Point2D: "+point2D.toString());
        point2D.setXY(8.1f, 2.3f);
        System.out.println("Tọa độ sau khi setXY: " + point2D.toString());

        Point3D point3D = new Point3D(1.1f, 2.2f, 3.3f);
        System.out.println("\nPoint3D:"+point3D.toString());

        point3D.setXYZ(9.9f, 8.8f, 7.7f);
        System.out.println("Tọa độ sau khi setXYZ: " + point3D.toString());
    }
}
