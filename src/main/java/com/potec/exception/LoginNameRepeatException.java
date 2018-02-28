package com.potec.exception;

/**
 * Created by pohoulong on 2018/1/16.
 */
public class LoginNameRepeatException extends RuntimeException {
    private Integer code;

    private String message;

    public LoginNameRepeatException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
