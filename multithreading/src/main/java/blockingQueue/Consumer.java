package blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int sum = 0;
        try {
            while (true) {
                Thread.sleep(100);
                int number = queue.take();
                if (number == -1) {
                    break;
                }
                sum += number;
                System.out.println("Consumed: " + sum);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
