public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread thread = new Thread(oddThread);
        Thread thread1 = new Thread(evenThread);
        thread.start();
        try {
            thread.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
