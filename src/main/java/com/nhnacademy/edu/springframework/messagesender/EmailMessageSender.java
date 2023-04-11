package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
    }

    public void init() {
        System.out.println(getClass().getSimpleName() + "이 생성되었습니다.");
    }
}
