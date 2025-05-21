package functionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Double> supplier = () -> Math.random() * 10;
        System.out.println(supplier.get());

        Supplier<String> messageSupplier = () -> "Hello, this is a message from the Supplier!";
        System.out.println(messageSupplier.get());
    }

}
