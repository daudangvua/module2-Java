public class Cylinder extends Circle {
    private double height;
    public Cylinder(double height, double radius, String color) {
        super(radius,color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return Math.PI * super.getArea()* height;
    }
    @Override
    public String toString() {
        return "Bán kính: "+super.getRadius()
                +"\nChiều cao: "+getHeight()
                +"\nDiện tích: "+super.getArea()
                +"\nThể tích: "+getVolume()
                +"\nmàu: "+super.getColor();
    }
}
