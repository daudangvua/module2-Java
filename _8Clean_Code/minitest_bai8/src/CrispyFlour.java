import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CrispyFlour extends Material implements Discount{
    private int quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public double getAmount() {
        return quantity*super.getCost();
    }
    @Override
    public LocalDate getExpiryDate() {
        return super.getManufacturingDate().plusYears(1);
    }
    @Override
    public double getRealMoney() {
        long monthsToExpire = ChronoUnit.MONTHS.between(LocalDate.now(), getExpiryDate());
        double discountRate;
        if (monthsToExpire <= 2) {
            discountRate = 0.4;
        } else if (monthsToExpire <= 4) {
            discountRate = 0.2;
        } else {
            discountRate = 0.05;
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
                "\nquantity: "+getQuantity()+"\n";
    }
}
