package solidPrinciples.ocp;

abstract class Notification {
    public abstract void sendOTP(String message);
}

class SmsNotification extends Notification {

    @Override
    public void sendOTP(String message) {
        System.out.println("Sending mobile notification " + message);
    }
}

class EmailNotification extends Notification {

    @Override
    public void sendOTP(String message) {
        System.out.println("Sending email notification " + message);
    }
}

public class NotificationManager {

    public static void main(String[] args) {
        SmsNotification smsNotification = new SmsNotification();
        EmailNotification emailNotification = new EmailNotification();

        // Example usage
        smsNotification.sendOTP("1234");
        emailNotification.sendOTP("5678");

    }
}

