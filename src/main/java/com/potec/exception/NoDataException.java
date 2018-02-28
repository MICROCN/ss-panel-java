package com.potec.exception;

/**
 * Created by pohoulong on 2018/1/15.
 */
public class NoDataException extends RuntimeException {

    private Integer code;

    private String message;

    /**
     * Instantiates a new No data exception.
     *
     * @param message the message
     * @param code    the code
     */
    public NoDataException(Integer code, String message) {
        super(message);
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
