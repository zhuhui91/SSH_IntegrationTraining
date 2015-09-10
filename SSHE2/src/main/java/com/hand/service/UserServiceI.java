package com.hand.service;

import java.io.Serializable;
import com.hand.model.User;

/**
 * 测试
 * @author gacl
 *
 */
public interface UserServiceI {

    /**
     * 测试方法
     */
    void test();
    
    /**
     * 保存用户
     * @param user
     * @return
     */
    Serializable save(User user); 
}