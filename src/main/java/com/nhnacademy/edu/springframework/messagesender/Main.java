package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User("choonghee123@gmail.com", "01057118590");

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            MessageSender smsMessageSender = context.getBean("smsMessageSender", SmsMessageSender.class);
            smsMessageSender.sendMessage(user, "Hello, ApplicationContext");
        }
    }


}
