package customLocalThreadPoolExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LocalThreadPoolExecutor {

    private final List<WorkerThread> workers;
    private final BlockingQueue<Runnable> blockingQueue;
    private volatile boolean isShutdown = false;

    public LocalThreadPoolExecutor(int noOfThreads) {
        this.workers = new ArrayList<>();
        this.blockingQueue = new LinkedBlockingQueue<>();

        for (int i = 0; i < noOfThreads; i++) {
           WorkerThread worker = new WorkerThread(blockingQueue);
           workers.add(worker);
           worker.start();
        }
    }

    public void submit(Runnable task) {
        if (!isShutdown) {
            blockingQueue.offer(task);
        } else {
            throw new IllegalStateException("Executor is shutdown, Cannot accept new tasks..");
        }
    }

    public void shutdown() {
        isShutdown = true;

        // Interrupt all workers so they stop waiting for new tasks
        for (WorkerThread worker : workers) {
            worker.interrupt();
        }

        // Wait for all workers to finish
        for (WorkerThread worker : workers) {
            try {
                worker.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Executor shutdown complete.");
    }
}
