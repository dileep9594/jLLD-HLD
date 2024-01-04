package lld.observerDesign.observable;

import lld.observerDesign.observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer) ;
    public void remove(NotificationAlertObserver observer) ;
    public void notifySubbscribers();
    public void setStockCount(int newStockAdded) ;
    public int getStockCount() ;
}
