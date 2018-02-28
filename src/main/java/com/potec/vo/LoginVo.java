package com.potec.vo;

import org.springframework.stereotype.Component;

/**
 * Created by pohoulong on 2018/1/16.
 */
@Component
public class LoginVo {

    private String loginName;

    private String password;

    private String code;


    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "LoginVo{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
