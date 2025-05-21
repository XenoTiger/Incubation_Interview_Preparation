package functionalInterfaces;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class CustomFunctionalInterfaceExample {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a * b;

        System.out.println(calculator.calculate(5, 4));

    }
}
