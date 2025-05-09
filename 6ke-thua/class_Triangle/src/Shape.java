public class Shape {
    private String color;
    private String name;
    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Name: " + getName()
                +"\nMầu: " + getColor()+"\n";

    }
}
