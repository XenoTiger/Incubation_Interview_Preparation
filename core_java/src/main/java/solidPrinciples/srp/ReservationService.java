package solidPrinciples.srp;

/*
This class is not following SRP, The corrected version is in ReservationService.java
 */
public class ReservationService {

    public String search(String source, String destination) {
        // do searchBuses
        return "Buses Found";
    }

    public String bookTicket(int numberOfSeats) {
        // booking the ticket
        return "Ticket Booked";
    }

    public void printTicket() {
        System.out.println("Printing ticket");
    }

    public void getTravelInsuranceInfo(int ticketId) {
        System.out.println("Getting insurance for :->" + ticketId);
    }

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            System.out.println("Sending email");
        }
    }
}