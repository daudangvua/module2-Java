public class NameClassTest {
    public static final String validateClass[] = new String[] {"C0223G", "A0323K", "M0318G", "P0323A", "@1234K", "C@123G", "C1234@", "C12245G"};
    public static void main(String[] args) {
        NameClass nameClass = new NameClass();
        for (String name: validateClass) {
            boolean result = nameClass.validate(name);
            System.out.println(name + " -> " + (result ? "Hợp lệ" : "Không hợp lệ"));
        }
    }
}
