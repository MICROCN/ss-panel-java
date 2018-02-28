package com.potec.constant;

/**
 * Created by pohoulong on 2018/1/15.
 */
public enum CommonStatusEnum {

    /**
     * Success common status enum.
     */
    _SUCCESS(10000, "返回结果正常"),
    /**
     * Connection refused common status enum.
     */
    _CONNECTION_REFUSED(10001, "服务器拒绝响应"),
    /**
     * No data common status enum.
     */
    _NO_DATA(10002, "查找不到数据"),
    /**
     * Password error common status enum.
     */
    _PASSWORD_ERROR(10003, "账号或密码错误"),
    /**
     * Code error common status enum.
     */
    _CommonStatusEnum_ERROR(10004, "验证码错误"),
    /**
     * Fail common status enum.
     */
    _FAIL(10005, "数据不合法"),

    /**
     * Repeat loginname common status enum.
     */
    _REPEAT_LOGINNAME(10006, "用户名重复"),

    /**
     * Code error common status enum.
     */
    _CODE_ERROR(10007, "验证码错误");

    private Integer code;

    private String content;

    CommonStatusEnum() {
    }

    CommonStatusEnum(Integer code, String content) {
        this.code = code;
        this.content = content;
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

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * From code common status enum.
     *
     * @param code the code
     * @return the common status enum
     */
    public static CommonStatusEnum fromCommonStatusEnum(int code) {
        for (CommonStatusEnum c : CommonStatusEnum.values()) {
            if (c.getCode() == code) {
                return c;
            }
        }
        throw new IllegalArgumentException(code + "");
    }
}
