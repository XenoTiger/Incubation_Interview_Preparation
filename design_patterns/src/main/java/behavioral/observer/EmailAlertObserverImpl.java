package behavioral.observer;

public class EmailAlertObserverImpl implements NotificationAlertObserver {


    private String emailId;
    private StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sentEmail(emailId, "product is in stock");
    }

    private void sentEmail(String emailId, String message){
        System.out.println("Email sent to :" + emailId + " with message-> " + message);
    }
}
