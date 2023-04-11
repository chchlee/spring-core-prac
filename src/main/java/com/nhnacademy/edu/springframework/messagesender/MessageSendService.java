package com.nhnacademy.edu.springframework.messagesender;

public class MessageSendService {
    private final MessageSender messageSender;

    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        User user = new User("choonghee123@gmail.com", "01057118590");
        messageSender.sendMessage(user, "Hello, Message");
    }
}
