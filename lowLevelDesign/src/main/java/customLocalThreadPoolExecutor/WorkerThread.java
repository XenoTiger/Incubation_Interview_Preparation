package customLocalThreadPoolExecutor;

import java.util.concurrent.BlockingQueue;

public class WorkerThread extends Thread{

    private final BlockingQueue<Runnable> blockingQueue;

    public WorkerThread(BlockingQueue<Runnable> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
       try{
           while(!Thread.currentThread().isInterrupted()){
               Runnable task = blockingQueue.take();
               Thread.sleep(1000);
               task.run();
           }
       }catch (InterruptedException e){
           Thread.currentThread().interrupt();
       }
    }
}
