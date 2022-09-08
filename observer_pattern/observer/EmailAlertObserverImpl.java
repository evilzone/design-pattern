import com.observerpattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail("product is stocked up...hurry!");
    }

    private void sendMail(String msg) {
        System.out.println("email sent to: " + emailId);
    }
}
