public class Main {
    public static void main(String[] args) {
        Fan f1 = new Fan(Fan.FAST,true,10,"yellow");
        Fan f2 = new Fan(Fan.MEDIUM,false,5,"blue");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
