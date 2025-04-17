public class AbsoluteNumberCalculator {

    public static final int ZERO = 0;

    public static int findAbsolute(int number){
        if(number < ZERO)
            return  -number;
        return number;
    }
}