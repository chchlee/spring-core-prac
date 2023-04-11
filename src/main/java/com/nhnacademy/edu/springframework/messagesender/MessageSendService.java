package com.nhnacademy.edu.springframework.messagesender;

public class MessageSendService {
    private MessageSender messageSender;


    public void setSmsMessageSender(MessageSender messageSender) {
        System.out.println("invoke SMS Message!!");
        this.messageSender = messageSender;
    }

    public void setEmailMessageSender(MessageSender messageSender){
        System.out.println("invoke Email Message!!");
        this.messageSender = messageSender;
    }



    public void doSendMessage() {
        User user = new User("choonghee123@gmail.com", "01057118590");
        messageSender.sendMessage(user, "Hello, "+getClass().getSimpleName()+ " Message!");
    }
}
