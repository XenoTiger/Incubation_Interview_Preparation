package deadlock;

public class ResourceB {

    public synchronized void methodB(ResourceA resourceA) {
        System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceB and waiting for ResourceA...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        resourceA.last();
    }

    public synchronized void last() {
        System.out.println("Inside ResourceB.last()");
    }
}
