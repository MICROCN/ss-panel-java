package com.potec.vo;
/**
 * Created by Administrator on 2018/1/24 0024.
 */
public class RegisterVo {

    private String loginName;

    private String password;

    private String realName;

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "LoginVo{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

}
