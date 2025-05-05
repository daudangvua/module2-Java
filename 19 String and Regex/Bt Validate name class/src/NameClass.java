import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {

    public static final String NAME_CLASS = "^[CAP]\\d{4}[GHIK]+$";

    public NameClass() {
    }
    public boolean validate(String name){
        Pattern pattern = Pattern.compile(NAME_CLASS);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
