package executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureWithRunnableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(() -> System.out.println("Hello"));
        System.out.println(future.get());
        if (future.isDone()){
            System.out.println("Task is Done..");
        }
        executor.shutdown();
    }
}
