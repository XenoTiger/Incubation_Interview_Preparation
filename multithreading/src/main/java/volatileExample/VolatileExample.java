package volatileExample;

public class VolatileExample {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedResource.setFlagTrue();
        });


        Thread reader = new Thread(sharedResource::printIfFlagTrue);

        writer.start();
        reader.start();
    }
}
