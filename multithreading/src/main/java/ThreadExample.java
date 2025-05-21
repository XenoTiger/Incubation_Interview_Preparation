public class ThreadExample extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExample thread = new ThreadExample();
        //lifecycle of thread
        System.out.println(thread.getState());
        thread.start();
        //thread.interrupt();  interrupts execution of current thread
        System.out.println(thread.getState());
        Thread.sleep(2000);
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());

        //callable

    }

}
