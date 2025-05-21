package executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureWithCallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> "Hello");
        System.out.println(future.get());
        if (future.isDone()) {
            System.out.println("Task is Done...");
        }
        executor.shutdown();
    }
}
