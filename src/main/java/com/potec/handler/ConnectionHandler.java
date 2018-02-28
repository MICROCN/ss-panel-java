package com.potec.handler;

import com.potec.exception.ConnectionRefusedException;
import com.potec.message.Message;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pohoulong on 2018/1/16.
 */
@ControllerAdvice
public class ConnectionHandler {

    @ExceptionHandler(value = ConnectionRefusedException.class)
    @ResponseBody
    public Message ExceptionHandle(ConnectionRefusedException e) {
        return Message.error(e.getCode(), e.getMessage());
    }

}
