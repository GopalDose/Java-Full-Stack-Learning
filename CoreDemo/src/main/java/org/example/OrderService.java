package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.SmsService;

public class OrderService {

    NotificationService notificationService;

    public OrderService(NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void placeOrder(){
        System.out.println("Order Placed");
        notificationService.sendNotification();
    }

}
