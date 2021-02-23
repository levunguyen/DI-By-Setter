package com.levunguyen.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientService {
    private EmailService emailService;

    @Autowired
    public ClientService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void processMsg(String message){
        emailService.sendMsg(message);
    }
}
