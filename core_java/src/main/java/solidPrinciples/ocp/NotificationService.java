package solidPrinciples.ocp;

/*
This class is not following OCP principle, The new implementation
is in NotificationManager class
 */
public class NotificationService {

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            // write email related logic
        }
    }
}
