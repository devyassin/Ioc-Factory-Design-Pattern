package com.TP2.Sol3;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements NotificationService{
    @Override
    public void notify(Employee emp) {
        System.out.println("Send Email : " +
                "Bonjour "+emp.getName()+" voici ton status "+emp.getStatus());
    }
}
