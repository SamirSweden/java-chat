package com.example.demo.controller;


import com.example.demo.DTO.Message;
import com.example.demo.DTO.TypingMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.send")
    @SendTo("/topic/messages")
    public Message send(Message message){
        return message;
    }

    @MessageMapping("/chat.typing")
    @SendTo("/topic/typing")
    public TypingMessage typing(TypingMessage message){
        return  message;
    }

}



