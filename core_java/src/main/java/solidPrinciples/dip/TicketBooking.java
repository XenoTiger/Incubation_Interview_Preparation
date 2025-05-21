package solidPrinciples.dip;

/*
This class is tightly coupled with debit card class, if we want to make transaction with
credit card then we have to change functionality of TicketBooking class.
The corrected code is in TicketBookingApp class
 */
public class TicketBooking {

    private DebitCard1 debitCard;

    public TicketBooking(DebitCard1 debitCard) {
        this.debitCard = debitCard;
    }

    public void doPayment(int noOfTickets, int amount) {
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard1 debitCard = new DebitCard1();
        TicketBooking ticketApp = new TicketBooking(debitCard);
        ticketApp.doPayment(4, 5000);
    }
}

class DebitCard1 {
    public void doTransaction(int amount) {
        System.out.println("tx done with DebitCard");
    }
}

class CreditCard1 {
    public void doTransaction(int amount) {
        System.out.println("tx done with CreditCard");
    }
}

