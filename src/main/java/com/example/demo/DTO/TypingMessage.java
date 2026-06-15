package com.example.demo.DTO;

public class TypingMessage {

    private String user;

    public TypingMessage(){}

    public TypingMessage(String user){
        this.user = user;
    }

    public String getUser(){
        return  user;
    }

    public void setUser(String user){
        this.user = user;
    }
}
