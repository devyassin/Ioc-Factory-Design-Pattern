package com.TP2.Sol3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class EmployeeManager {
    private final NotificationService emailService;
    private final NotificationService smsService;

    @Autowired
    public EmployeeManager(EmailService emailService, SMSService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void notifyEmployee(Employee employee, String message, String method) {
        if ("email".equalsIgnoreCase(method)) {
            employee.setStatus(message);
            emailService.notify(employee);
        } else if ("sms".equalsIgnoreCase(method)) {
            employee.setStatus(message);
            smsService.notify(employee);
        }
    }

}
