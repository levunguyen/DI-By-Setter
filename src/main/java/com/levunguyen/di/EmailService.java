package com.levunguyen.di;

import org.springframework.stereotype.Service;

@Service("EmailService")
public class EmailService implements MessageService{
    @Override
    public void sendMsg(String message) {
        System.out.println(message);
    }
}
