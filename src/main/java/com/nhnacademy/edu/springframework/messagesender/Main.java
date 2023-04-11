package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        User user = new User("choonghee123@gmail.com", "01057118590");

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            MessageSender smsMessageSender1 = context.getBean("smsMessageSender", SmsMessageSender.class);
            MessageSender smsMessageSender2 = context.getBean("smsMessageSender", SmsMessageSender.class);
            MessageSender emailMessageSender1 = context.getBean("emailMessageSender", EmailMessageSender.class);
            MessageSender emailMessageSender2 = context.getBean("emailMessageSender", EmailMessageSender.class);
        }
    }


}
