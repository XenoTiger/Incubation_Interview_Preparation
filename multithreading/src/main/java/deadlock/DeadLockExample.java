package deadlock;

import javax.swing.plaf.TableHeaderUI;

public class DeadLockExample {

    public static void main(String[] args) {
         ResourceA resourceA = new ResourceA();
         ResourceB resourceB = new ResourceB();

        Runnable runnable1 = () -> resourceA.methodA(resourceB);
        Runnable runnable2 = () -> resourceB.methodB(resourceA);

        Thread t1 = new Thread(runnable1, "Thread-A");
        Thread t2 = new Thread(runnable2, "Thread-B");

        t1.start();
        t2.start();


    }
}
