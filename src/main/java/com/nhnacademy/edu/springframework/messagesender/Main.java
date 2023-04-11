package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args) {
        User user = new User("choonghee123@gmail.com","01057118590");
        Main main = new Main();
        main.sendSmsMessage(user, "Hello, SMS");
        main.sendEmailMessage(user, "Hello, Email");
    }

    private void sendSmsMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    private void sendEmailMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
    }
}
