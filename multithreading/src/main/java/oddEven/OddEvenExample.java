package oddEven;

public class OddEvenExample {

    public static void main(String[] args) {
        OddEvenPrinter oddEvenPrinter = new OddEvenPrinter();

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                oddEvenPrinter.printOdd(i);
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                oddEvenPrinter.printEven(i);
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
