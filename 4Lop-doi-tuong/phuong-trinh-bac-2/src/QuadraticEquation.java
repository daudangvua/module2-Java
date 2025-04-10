public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }
    public double getRoot1() {
        if(getDiscriminant() > 0) {
            return (-b + Math.sqrt(b*b - 4*a*c)) / (2 * a);
        } else if(getDiscriminant() == 0) {
            return -b / (2 * a);
        } else {
            return Double.NaN;
        }
    }
    public double getRoot2() {
        if(getDiscriminant() > 0) {
            return (-b - Math.sqrt(b*b - 4*a*c)) / (2 * a);
        } else if(getDiscriminant() == 0) {
            return -b / (2 * a);
        } else {
            return Double.NaN;
        }
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
}
