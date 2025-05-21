package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {

    private AtomicInteger counter = new AtomicInteger(); // used for mutual exclusion

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get();
    }
}
