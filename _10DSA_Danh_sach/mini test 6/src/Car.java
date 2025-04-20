public class Car extends Vehicle {
    private int numberOfSeats;

    public Car() {
    }

    public Car(String id, String brand, int year, int numberOfSeats) {
        super(id, brand, year);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateTax() {
        return getNumberOfSeats()*300;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car ID: "+getId()
                +"\nBrand: "+getBrand()
                +"\nYear: "+getYear()
                +"\nNumber of Seats: "+getNumberOfSeats());
    }
}
