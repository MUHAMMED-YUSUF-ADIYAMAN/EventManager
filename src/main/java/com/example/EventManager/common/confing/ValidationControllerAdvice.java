package com.example.EventManager.common.confing;

import com.example.EventManager.common.Enums.MessageType;
import com.example.EventManager.common.dto.MessageResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ValidationControllerAdvice {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    @ResponseBody
    public ResponseEntity<MessageResponse> handleValidationException(MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        return ResponseEntity.ok(new MessageResponse(message, MessageType.ERROR));
    }
}