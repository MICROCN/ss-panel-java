package com.potec.exception;

/**
 * Created by pohoulong on 2018/1/15.
 */
public class PasswordException extends RuntimeException {

    private Integer code;

    private String message;

    /**
     * Instantiates a new Password exception.
     *
     * @param code    the code
     * @param message the message
     */
    public PasswordException(Integer code, String message) {
        super(message);
        this.message = message;
        this.code = code;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}