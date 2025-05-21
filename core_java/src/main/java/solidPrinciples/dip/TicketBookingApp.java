package solidPrinciples.dip;

interface PaymentMethod {
    void doTransaction(int amount);
}

class DebitCard implements PaymentMethod {

    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction done with DebitCard for amount: " + amount);
    }
}

class CreditCard implements PaymentMethod {

    @Override
    public void doTransaction(int amount) {
        System.out.println("Transaction done with CreditCard for amount: " + amount);
    }
}

public class TicketBookingApp {

    private final PaymentMethod paymentMethod;

    // Constructor injection for dependency
    public TicketBookingApp(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void doPayment(int noOfTickets, int amount) {
        System.out.println("Booking " + noOfTickets + " tickets.");
        paymentMethod.doTransaction(amount);
    }

    public static void main(String[] args) {
        // Use DebitCard for payment
        PaymentMethod debitCard = new DebitCard();
        TicketBookingApp ticketAppWithDebitCard = new TicketBookingApp(debitCard);
        ticketAppWithDebitCard.doPayment(4, 5000);

        // Use CreditCard for payment
        PaymentMethod creditCard = new CreditCard();
        TicketBookingApp ticketAppWithCreditCard = new TicketBookingApp(creditCard);
        ticketAppWithCreditCard.doPayment(2, 3000);
    }
}
