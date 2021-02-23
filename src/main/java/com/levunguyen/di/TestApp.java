package com.levunguyen.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ClientService client = applicationContext.getBean(ClientService.class);
        client.processMsg("Sending message");
    }
}
