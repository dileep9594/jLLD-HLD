package lld.observerDesign.observable;

import java.util.ArrayList;
import java.util.List;

import lld.observerDesign.observer.NotificationAlertObserver;

public class IphoneObservable implements StockObservable {
  
     public List<NotificationAlertObserver> observerList = new ArrayList<>() ;

     public int stockCount =0 ;

     @Override
     public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
     }

     @Override
     public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
     }
     @Override
     public void notifySubbscribers(){
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
     }
     public void setStockCount(int newStockAdded){
        if(stockCount ==0){
            notifySubbscribers();
        }
        stockCount = stockCount+ newStockAdded; 
    }
    public int getStockCount(){ return stockCount; }

    
}
