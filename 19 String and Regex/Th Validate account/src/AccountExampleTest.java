public class AccountExampleTest {
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh", ".@", "12345", "1234_", "abcde", "abc_e@"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account: " + account + " -> " + (isValid ? "Hợp lệ" : "Không hợp lệ"));
        }
    }
}
