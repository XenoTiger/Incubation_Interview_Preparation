package behavioral.observer;

public class ObserverClient {

    public static void main(String[] args) {

        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0); // will send notification twice
        iphoneStockObservable.setStockCount(10);

    }
}
