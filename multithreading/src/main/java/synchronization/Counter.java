package synchronization;

public class Counter {

    private int count = 0;

    public  void increment() {  //types of synchronization(static)
        synchronized (this) {  // can use at method level also, avoid using at method level if we have other stuff aswell
            count++;
        }
    }

    public int getCount() {
        return count;

    }
}
