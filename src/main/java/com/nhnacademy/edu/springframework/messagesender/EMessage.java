package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
public enum EMessage {
    EMAIL, MESSAGE;
}
