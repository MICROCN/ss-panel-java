package com.potec.dao;

import com.potec.pojo.User;

/**
 * Created by pohoulong on 2018/1/12.
 */

public interface UserDao {

    User findByLoginNameAndPassword(String loginName, String Password);

    User findByLoginName(String loginName);

}