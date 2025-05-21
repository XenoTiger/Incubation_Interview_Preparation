public class RunnableExample implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() +": Number: " + i);
            Thread.yield(); //gives control to other thread as well
        }
    }

    public static void main(String[] args) {
        RunnableExample runnableExample = new RunnableExample();
        Thread thread1  = new Thread(runnableExample);
        Thread thread2 = new Thread(runnableExample);
        thread1.start();
        //thread1.setDaemon(true); marks as a Daemon thread, JVM always waits for UserThread to complete means thread2
        //Daemon threads are background threads, which JVM stops execution after some time
        thread2.start();
    }
}
