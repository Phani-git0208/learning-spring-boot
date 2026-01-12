package com.phain.springlerning.learningspringbootapp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue ="gpay")
public class gpay implements payment {
        public String pay() {
            String payment = "paying through gpay";
            System.out.println("payment form : "+payment);
            return payment;
        }
}
