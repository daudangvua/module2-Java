public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.enQueue(14);
        s.enQueue(22);
        s.enQueue(-6);
        s.displayQueue();
        s.deQueue();
        s.displayQueue();
        s.deQueue();
        s.displayQueue();
        s.enQueue(9);
        s.displayQueue();
        s.enQueue(20);
        s.displayQueue();
    }
}
