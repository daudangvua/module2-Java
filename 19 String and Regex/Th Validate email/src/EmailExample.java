import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    public static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample(){
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);;
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
