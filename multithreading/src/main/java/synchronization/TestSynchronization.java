package synchronization;

public class TestSynchronization {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        t1.join(); // so that result should print once execution is done
        t2.join();

        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
