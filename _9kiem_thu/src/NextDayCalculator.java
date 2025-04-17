import java.time.LocalDate;

public class NextDayCalculator {

    private LocalDate date;
    public NextDayCalculator(LocalDate date) {
        this.date = date;
    }

    public LocalDate getNextDay() {
        return date.plusDays(1);
    }
    @Override
    public String toString() {
        return date.toString();
    }
}
