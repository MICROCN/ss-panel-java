package com.potec.message;

import com.potec.constant.CommonStatusEnum;

import java.util.List;


public class Message {
    private int code;
    private String msg;
    private Object data;

    public Message() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Message(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Message(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


    public static Message success(Object data) {
        return new Message(CommonStatusEnum._SUCCESS.getCode(), CommonStatusEnum._SUCCESS.getContent(), data);
    }

    /**
     * 返回成功消息
     *
     * @param
     * @return 成功消息
     */
    public static Message success() {
        return new Message(CommonStatusEnum._SUCCESS.getCode(), CommonStatusEnum._SUCCESS.getContent());
    }

    /**
     * 返回失败消息
     *
     * @param content 内容
     * @return 成功消息
     */
    public static Message error(int CommonStatusEnum, String content, Object data) {
        return new Message(CommonStatusEnum, content, data);
    }

    /**
     * 返回失败消息
     *
     * @param content 内容
     * @return 成功消息
     */
    public static Message error(int CommonStatusEnum, String content) {
        return new Message(CommonStatusEnum, content);
    }

    /**
     * 返回失败消息
     *
     * @param content 内容
     * @return 成功消息
     */
    public static Message error(String content, Object data) {
        return new Message(CommonStatusEnum._CONNECTION_REFUSED.getCode(), content, data);
    }

    /**
     * 返回失败消息
     *
     * @param content 内容
     * @return 成功消息
     */
    public static Message error(String content) {
        return new Message(CommonStatusEnum._CONNECTION_REFUSED.getCode(), content);
    }

    /**
     * 返回失败消息
     *
     * @param
     * @return 成功消息
     */
    public static Message error() {
        return new Message(CommonStatusEnum._CONNECTION_REFUSED.getCode(), CommonStatusEnum._CONNECTION_REFUSED.getContent());
    }
}
