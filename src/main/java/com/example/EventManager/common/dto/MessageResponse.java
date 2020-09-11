package com.example.EventManager.common.dto;


import com.example.EventManager.common.Enums.MessageType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse {
    public String message;
    public MessageType messageType;


}