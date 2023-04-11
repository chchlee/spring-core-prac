package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args) {
        User user = new User("choonghee123@gmail.com","01057118590");
        MessageSender smsMessageSender = new SmsMessageSender();
        smsMessageSender.sendMessage(user, "Hello, SMS");
    }


}
