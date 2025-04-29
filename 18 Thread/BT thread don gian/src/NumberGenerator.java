public class NumberGenerator implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: "+this.hashCode()+ " - Number: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println("Thread bị gián đoạn.");
            }
        }
    }

    public static void main(String[] args) {
        NumberGenerator gen1 = new NumberGenerator();
        NumberGenerator gen2 = new NumberGenerator();

        Thread t1 = new Thread(gen1);
        Thread t2 = new Thread(gen2);

//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);

        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
