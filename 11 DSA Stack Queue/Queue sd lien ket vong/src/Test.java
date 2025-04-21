public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.enQueue(10);
        s.enQueue(20);
        s.enQueue(30);
        s.displayQueue();
        s.deQueue();
        s.displayQueue();
    }
}
