package lld.observerDesign;

import lld.observerDesign.observable.IphoneObservable;
import lld.observerDesign.observable.StockObservable;
import lld.observerDesign.observer.EmailAlertNotification;
import lld.observerDesign.observer.MobileAlertNotification;
import lld.observerDesign.observer.NotificationAlertObserver;

public class store {
    
    public static void main(String[] args) {
        StockObservable iphonStockObservable = new IphoneObservable() ;

        NotificationAlertObserver obsr1 = new EmailAlertNotification("dileep9594@gmail.com", iphonStockObservable);
        NotificationAlertObserver obsr2 = new EmailAlertNotification("xyz@gmail.com", iphonStockObservable);
        NotificationAlertObserver obsr3 = new MobileAlertNotification("8317059894", iphonStockObservable) ;

        iphonStockObservable.add(obsr1);
        iphonStockObservable.add(obsr2);
        iphonStockObservable.add(obsr3);

        iphonStockObservable.setStockCount(10);
        iphonStockObservable.setStockCount(0);
        iphonStockObservable.setStockCount(1000);

    }
}
