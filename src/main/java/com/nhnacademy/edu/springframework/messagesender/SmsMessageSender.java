package com.nhnacademy.edu.springframework.messagesender;

public class SmsMessageSender implements MessageSender {

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    @Override
    public void init() {
        System.out.println(getClass().getSimpleName() + "이 생성되었습니다.");
    }


}
