package com.example;

public class Main {
    public static void main(String[] args) {
        MessageClass messageClass = new MessageClass();
        System.out.println(getMessage(messageClass));
    }

    public static String getMessage(MessageClass messageClass) {
        return messageClass.getMessage();
    }
}
