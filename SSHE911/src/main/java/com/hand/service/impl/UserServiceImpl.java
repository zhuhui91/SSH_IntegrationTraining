package com.hand.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.dao.impl.UserDaoImpl;
import com.hand.model.User;
import com.hand.service.UserServiceI;

@Service(value="userService")
public class UserServiceImpl implements UserServiceI
{

	private UserDaoImpl userDao;
	
	
	
	public UserDaoImpl getUserDao()
	{
		return userDao;
	}


    @Autowired
	public void setUserDao(UserDaoImpl userDao)
	{
		this.userDao = userDao;
	}



	@Override
	public void test()
	{
		System.out.println("进入接口实现类:UserServiceImpl");

	}
	
	@Override
	public Serializable save(User t){
		return userDao.save(t);
	}

}
