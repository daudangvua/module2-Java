public class NextDayCalculator {

    public static final String CONCAT = "/";
    public static final int FIRSTMONTH = 1;
    public static final int LAST_MONTH_OF_THE_YEAR = 12;

    public static String getNextDay(int day, int month, int year) {
        int lastMonth = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastMonth = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    lastMonth = 29;
                }else {
                    lastMonth = 28;
                }
                break;
            default:
                lastMonth = 30;
        }

        if (month== LAST_MONTH_OF_THE_YEAR &&day == lastMonth){
            return FIRSTMONTH +CONCAT + FIRSTMONTH + CONCAT + (++year);
        } else if (day == lastMonth){
            return FIRSTMONTH +CONCAT + (++month) + CONCAT + year;
        } else {
            return (++day)+ CONCAT +month + CONCAT + year;
        }

    }
}
