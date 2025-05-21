package customLocalThreadPoolExecutor;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        LocalThreadPoolExecutor executor =new LocalThreadPoolExecutor(3);

        for(int i=1; i<=5; i++){
            int taskId = i;
            executor.submit(() -> System.out.println("Executing Task : " + taskId));
        }

        Thread.sleep(3000);
        executor.shutdown();
    }
}
