import javax.xml.namespace.QName;

public class Triangle extends Shape {
    private double side1=1;
    private double side2=1;
    private double side3=1;
    public Triangle(String color,String name) {
        super(color, name);
    }
    public Triangle(double side1, double side2, double side3,String color, String name) {
        super(color,name);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea() {
        double p = (getSide1()+getSide2()+getSide3())/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    public double getPerimeter() {
        return getSide1()+getSide2()+getSide3();
    }
    @Override
    public String toString() {
        return "Name: " +getName()
                +"\nCạnh a: "+getSide1()
                +"\nCạnh b: "+getSide2()
                +"\nCạnh c: "+getSide3()
                +"\nDiện tích: "+String.format("%.3f", getArea())
                +"\nchi vi: "+getPerimeter()
                +"\nMầu: "+getColor()+"\n";
    }
}
