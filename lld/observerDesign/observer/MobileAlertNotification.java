package lld.observerDesign.observer;

import lld.observerDesign.observable.StockObservable;

public class MobileAlertNotification implements NotificationAlertObserver{
     String mobileNumber;
     StockObservable observable ;

     public MobileAlertNotification(String mobileNumber , StockObservable observable ){
        this.mobileNumber = mobileNumber;
        this.observable = observable ;
     }

     public void update(){
        sendMail(mobileNumber , "product in stock hurry up") ;
     }

     public void sendMail(String mobileNumber , String msg){
        System.out.println("mail sent to" + mobileNumber) ;
     }
    
}
