package deadlock;

public class ResourceA {

    public synchronized void methodA(ResourceB resourceB){
        System.out.println(Thread.currentThread().getName() + " acquired lock on ResourceA and waiting for ResourceB...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        resourceB.last();
    }
    public synchronized void last() {
        System.out.println("Inside ResourceA.last()");
    }
}
