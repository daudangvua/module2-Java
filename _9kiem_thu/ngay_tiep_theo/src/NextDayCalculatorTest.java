import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("case 1/1/2018")
    public void testCaseDay1Month1Year2018() {
        int year = 2018;
        int month = 1;
        int day = 1;
        String resultExpect="2/1/2018";
        String resul = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(resultExpect,resul);
    }
    @Test
    @DisplayName("case 31/1/2018")
    public void testCaseDay31Month1Year2018() {
        int year = 2018;
        int month = 1;
        int day = 31;
        String resultExpect="1/2/2018";
        String resul = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(resultExpect,resul);
    }@Test
    @DisplayName("case 30/4/2018")
    public void testCaseDay30Month4Year2018() {
        int year = 2018;
        int month = 4;
        int day = 30;
        String resultExpect="1/5/2018";
        String resul = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(resultExpect,resul);
    }
    @Test
    @DisplayName("case 28/2/2018")
    public void testCaseDay28Month2Year2018() {
        int year = 2018;
        int month = 2;
        int day = 28;
        String resultExpect="1/3/2018";
        String resul = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(resultExpect,resul);
    }@Test
    @DisplayName("case 29/2/2020")
    public void testCaseDay29Month2Year2020() {
        int year = 2020;
        int month = 2;
        int day = 29;
        String resultExpect="1/3/2020";
        String resul = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(resultExpect,resul);
    }@Test
    @DisplayName("case 31/12/2018")
    public void testCaseDay31Month12Year2018() {
        int year = 2018;
        int month = 12;
        int day = 31;
        String resultExpect="1/1/2019";
        String resul = NextDayCalculator.getNextDay(day,month,year);
        assertEquals(resultExpect,resul);
    }

}