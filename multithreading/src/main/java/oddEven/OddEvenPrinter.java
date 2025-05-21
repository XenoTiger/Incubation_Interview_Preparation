package oddEven;

public class OddEvenPrinter {

    private boolean isOdd = true;

    public synchronized void printOdd(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(number);
        isOdd = false;
        notify();
    }

    public synchronized void printEven(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(number);
        isOdd = true;
        notify();
    }
}
