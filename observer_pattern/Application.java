public class Application {

    public static void main(String[] args) {
        StocksObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 =
                new EmailAlertObserverImpl("xyz@gmail.com", new IphoneObservableImpl());

        NotificationAlertObserver observer2 =
                new EmailAlertObserverImpl("abc@gmail.com", new IphoneObservableImpl());

        NotificationAlertObserver observer3 =
                new MobileAlertObserverImpl("abhi_hunk", new IphoneObservableImpl());

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);

    }

}
