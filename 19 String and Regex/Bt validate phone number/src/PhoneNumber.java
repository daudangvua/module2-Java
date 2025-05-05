import java.util.regex.Pattern;

public class PhoneNumber {
    public PhoneNumber(){
    }
    public boolean validate(String number){
        Pattern pattern = Pattern.compile("^[(]\\d{2}[)]-[(]0\\d{9}[)]$");
        return pattern.matcher(number).matches();
    }
}
