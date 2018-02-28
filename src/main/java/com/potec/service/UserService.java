package com.potec.service;

import com.potec.pojo.User;
import com.potec.exception.ConnectionRefusedException;
import com.potec.exception.NoDataException;
import com.potec.exception.PasswordException;
import com.potec.exception.LoginNameRepeatException;

/**
 * Created by pohoulong on 2018/1/15.
 */
public interface UserService extends BaseService<User> {

    public Integer confirm(User user) throws PasswordException;

    public void findByLoginName(String username) throws LoginNameRepeatException;

}
