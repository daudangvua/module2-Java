import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay {
    @Test
    @DisplayName("Testing")
    void testAdd() {
        NextDayCalculator calculator = new NextDayCalculator(LocalDate.of(2018,1,1));
        calculator.toString();
    }


}
