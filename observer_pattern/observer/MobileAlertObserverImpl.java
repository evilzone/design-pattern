public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgMobile("product is stocked up...hurry!");
    }

    private void sendMsgMobile(String msg) {
        System.out.println("message sent to: " + userName);
    }
}
