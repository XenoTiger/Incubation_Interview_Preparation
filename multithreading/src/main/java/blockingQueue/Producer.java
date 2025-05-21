package blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
       try {
           for(int i=1; i<=100; i++){
               Thread.sleep(900);
               queue.put(i);
               System.out.println("Produced: " + i);
           }
           queue.put(-1);
       }catch (InterruptedException e){
           Thread.currentThread().interrupt();
       }
    }
}
