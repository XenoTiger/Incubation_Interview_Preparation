package solidPrinciples.srp;

class TicketPrintingService {
    public void printTicket() {
        System.out.println("Printing ticket");
    }
}

class TravelInsuranceService {
    public void getTravelInsuranceInfo(int ticketId) {
        System.out.println("Getting insurance for :->" + ticketId);
    }
}

class OtpService {
    public void sendOTP(String medium) {
        if (medium.equalsIgnoreCase("email")) {
            System.out.println("Sending email OTP");
        } else if (medium.equalsIgnoreCase("phone")) {
            System.out.println("Sending phone OTP");
        }
    }
}


public class ReservationServiceNew {

    public String search(String source, String destination) {
        // do searchBuses
        return "Buses Found";
    }

    public String bookTicket(int numberOfSeats) {
        // booking the ticket
        return "Ticket Booked";
    }

    public static void main(String[] args) {

        ReservationServiceNew serviceNew = new ReservationServiceNew();
        TicketPrintingService printingService = new TicketPrintingService();
        TravelInsuranceService insuranceService = new TravelInsuranceService();
        OtpService otpService = new OtpService();

        System.out.println(serviceNew.search("City A", "City B"));
        System.out.println(serviceNew.bookTicket(2));
        printingService.printTicket();
        insuranceService.getTravelInsuranceInfo(123);
        otpService.sendOTP("email");
    }
}
