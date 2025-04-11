public class Rectangle {
    private double width=1.0;
    private double height=1.0;
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width*height;
    }
    public double getPerimeter() {
        return 2*width+2*height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void Rectangle() {
        System.out.println("Area = "+getArea());
        System.out.println("perimeter = "+getPerimeter());
    }
}
