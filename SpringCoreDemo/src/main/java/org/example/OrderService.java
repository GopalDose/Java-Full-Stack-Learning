package org.example;

import org.example.payment.PaymentService;
import org.example.payment.UpiPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private final PaymentService paymentService;

    public OrderService(@Qualifier("upi") PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void orderPlaced(){
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
