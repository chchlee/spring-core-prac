package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MessageSendService messageSendService = context.getBean(MessageSendService.class);

        User user = context.getBean(User.class);
        messageSendService.processMessage(user, user.getMessage());

        context.close();
    }
}
