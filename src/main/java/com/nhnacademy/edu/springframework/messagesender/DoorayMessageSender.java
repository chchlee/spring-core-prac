package com.nhnacademy.edu.springframework.messagesender;

import com.nhn.dooray.client.DoorayHook;
import com.nhn.dooray.client.DoorayHookSender;

import java.io.UnsupportedEncodingException;

public class DoorayMessageSender implements MessageSender {
    DoorayHookSender doorayHookSender;

    public DoorayMessageSender(DoorayHookSender doorayHookSender) {
        this.doorayHookSender = doorayHookSender;
    }

    @Override
    @LogExecutionTime
    public boolean sendMessage(User user, String message) {
        try {
            String utf8Message = new String(message.getBytes("ISO-8859-1"), "UTF-8");
            String utf8Name = new String(user.getName().getBytes("ISO-8859-1"), "UTF-8");

            doorayHookSender.send(DoorayHook.builder()
                    .botName(utf8Name)
                    .text(utf8Message)
                    .build());
            return true;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }
    }
}
