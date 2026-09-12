package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void orderDetail(){
        System.out.println("Order Success");
        paymentService.pay();
    }
}
