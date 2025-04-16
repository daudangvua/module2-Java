import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public double getAmount() {
        return super.getCost() * getWeight();
    }

    @Override
    public LocalDate getExpiryDate() {
        return super.getManufacturingDate().plusDays(7);
    }
    @Override
    public double getRealMoney() {
        long daysToExpire = ChronoUnit.DAYS.between(LocalDate.now(), getExpiryDate());
        double discountRate;
        if(daysToExpire <= 5){
            discountRate = 0.3;
        }else {
            discountRate = 0.1;
        }
        return getAmount() * (1 - discountRate);
    }
    @Override
    public String toString() {
        return "id: "+getId() +
                "\nname: "+getName()+
                "\nexpiration date: "+getExpiryDate()+
                "\ncost(giá gốc): "+String.format("%,.0f", getAmount())+" VND"+
                "\ncost(sau giảm giá): "+String.format("%,.0f", getRealMoney())+" VND"+
                "\nweight: "+getWeight()+" kg\n";
    }
}
