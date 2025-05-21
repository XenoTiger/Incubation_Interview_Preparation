package optionals;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        // 1. Creating Optionals
        Optional<String> opt1 = Optional.of("Hello, World");
        Optional<String> opt2 = Optional.ofNullable(null);
        Optional<String> opt3 = Optional.empty();

        // 2. Retrieving values
        System.out.println("Optional Value: " + opt1.orElse("Default"));
        System.out.println("Optional Value: " + opt2.orElse("Default"));
        System.out.println("Optional Value: " + opt3.orElse("Default"));

        // 3. Checking presence
        System.out.println("opt1 is present: " + opt1.isPresent());
        System.out.println("opt2 is empty: " + opt2.isEmpty());

        // 4. orElseGet and orElseThrow
        System.out.println(opt1.orElseGet(() -> "Some Value"));
        System.out.println(opt2.orElseGet(() -> "Some Value"));

        try {
            System.out.println(opt2.orElseThrow(() -> new IllegalStateException("No Value is Present")));
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }


    }
}
