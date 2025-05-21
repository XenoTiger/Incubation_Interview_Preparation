package exception;

public class RuntimeExceptionDemo {

    private static void getRuntimeException() {
        String s = "Niraj";
        s = null;
        try {
            System.out.println(s.charAt(0));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private static void getArrayIndexOutOfBoundException() {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    private static void handleExceptionWithMultipleCatch() {
        try {
            String str = "hello world";
            char[] chars = str.toCharArray();
            char last = chars[chars.length - 1];
            System.out.println(last);
            String str2 = null;
            System.out.println(str2.length());
            System.out.println(chars[12]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Some Cleanup");
        }


    }

    private static void getCustomException() {
        String[] users = {"Niraj", "Virat"};
        if (users[0].equals("Ronaldo")) {
            System.out.println("Suiii");
        } else throw new NoSuchUserException("User not found");

    }

    public static void main(String[] args) {
        getRuntimeException();
        getArrayIndexOutOfBoundException();
        getCustomException();
        handleExceptionWithMultipleCatch();
    }
}
