package creational.singleton;

public class SingletonExample {

    public static void main(String[] args) {

        DBConnection dbConnection = DBConnection.getInstance();
    }
}
