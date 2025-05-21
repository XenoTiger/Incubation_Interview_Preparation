package transferQueue;

import java.util.concurrent.TransferQueue;

public class Consumer implements Runnable {

    private final TransferQueue<String> queue;

    public Consumer(TransferQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String task = queue.take();
                System.out.println("Consumed: " + task);
                Thread.sleep(100);
                if(task.equals("Task: 10")){
                    break;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
