package transferQueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueExample {

    public static void main(String[] args) {

        TransferQueue<String> transferQueue = new LinkedTransferQueue<>();

        Thread producer = new Thread(new Producer(transferQueue));
        Thread consumer = new Thread(new Consumer(transferQueue));

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
