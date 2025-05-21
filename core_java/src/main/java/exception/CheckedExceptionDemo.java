package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {

    //Using try catch block
    private static void readFile() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cleanup");
        }
    }

    // Using method signature
    private static void readFileFromSystem() throws IOException {
        FileInputStream fileInputStream;
        fileInputStream = new FileInputStream("file.txt");
        int data = fileInputStream.read();
        System.out.println(data);

    }

    public static void main(String[] args) throws IOException {
        readFile();
        readFileFromSystem();
    }
}
