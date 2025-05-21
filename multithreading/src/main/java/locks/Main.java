package locks;

public class Main {
    public static void main(String[] args) {

       Banking banking = new Banking();
       Runnable runnable = () -> banking.withdraw(50);

       Thread t1 = new Thread(runnable);
       Thread t2 = new Thread(runnable);

       t1.start();
       t2.start();


    }
}
