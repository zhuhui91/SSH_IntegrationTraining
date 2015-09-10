package com.hand.dao;

import java.io.Serializable;

import com.hand.model.User;

public interface UserDaoI {

    /**
     * 保存用户
     * @param user
     * @return
     */
    Serializable save(User user); 
}