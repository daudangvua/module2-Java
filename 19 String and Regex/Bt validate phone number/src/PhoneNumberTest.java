public class PhoneNumberTest {
    public static final String[] vaalidNumber = new String[] {"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        for (String s : vaalidNumber) {
            System.out.println(s + " -> " + phoneNumber.validate(s));
        }
    }
}
