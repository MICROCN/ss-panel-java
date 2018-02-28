package com.potec.pojo;

/**
 * Created by pohoulong on 2018/1/14.
 */

public class User extends BaseEntity {

    private Integer id;

    private String loginName;

    private String password;

    private String realName;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(String loginName, String password) {
        this.loginName = loginName;
        this.password = password;
    }

    public User(String loginName, String password, String realName) {
        this.loginName = loginName;
        this.password = password;
        this.realName = realName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
