package lld.observerDesign.observer;

import lld.observerDesign.observable.StockObservable;

public class EmailAlertNotification implements NotificationAlertObserver{
     String emailid;
     StockObservable observable ;

     public EmailAlertNotification(String emailid , StockObservable observable ){
        this.emailid = emailid;
        this.observable = observable ;
     }

     public void update(){
        sendMail(emailid , "product in stock hurry up") ;
     }

     public void sendMail(String emailid , String msg){
        System.out.println("mail sent to" + emailid) ;
     }
    
}
