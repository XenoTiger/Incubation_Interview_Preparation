package functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer
                = (fName, lName) -> System.out.println("Full Name : " + fName + " " + lName);

        biConsumer.accept("Harry", "Potter");
        biConsumer.accept("Virat", "Kohli");
    }
}
