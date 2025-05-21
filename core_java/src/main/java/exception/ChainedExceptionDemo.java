package exception;

public class ChainedExceptionDemo {

    public static void main(String[] args) {
        try {
            int[] numbers = { 1,2,3,4,5};
            int divisor = 0;
            for (int i=0; i< numbers.length; i++){
                int result = numbers[i] / divisor;
                System.out.println(result);
            }
        }
        catch (ArithmeticException e){
            throw new RuntimeException("Error: division by zero", e);
        }
    }


}
