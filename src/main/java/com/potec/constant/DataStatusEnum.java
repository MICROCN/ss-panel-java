package com.potec.constant;

/**
 * Created by pohoulong on 2018/1/15.
 */
public enum DataStatusEnum {

    /**
     * Disable data status enum.
     */
    _DISABLE("000", "禁用"), /**
     * Use data status enum.
     */
    _USE("001", "正在使用"), /**
     * Delete data status enum.
     */
    _DELETE("002", "删除");

    private String code;

    private String content;

    DataStatusEnum() {
    }

    DataStatusEnum(String code, String content) {
        this.code = code;
        this.content = content;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

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
}
