public class Motorbike extends Vehicle{
    private int enginePower;

    public Motorbike() {
    }

    public Motorbike(String id, String brand, int year, int enginePower) {
        super(id, brand, year);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public double calculateTax() {
        return getEnginePower()<100 ? 500:1000;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorbike ID: "+getId()
                +"\nBrand: "+getBrand()
                +"\nYear: "+getYear()
                +"\nEngine Power: "+getEnginePower());
    }
}
