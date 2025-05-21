package transferQueue;

import java.util.concurrent.TransferQueue;

public class Producer implements Runnable {

    private final TransferQueue<String> queue;

    public Producer(TransferQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String task = "Task: " + i;
                queue.transfer(task);
                System.out.println("Produced: " + task);
                Thread.sleep(900);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
