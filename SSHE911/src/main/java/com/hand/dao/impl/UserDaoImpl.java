package com.hand.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.model.User;

@Repository(value="userDao")  // 让Spring可以检测到
public class UserDaoImpl implements com.hand.dao.UserDaoI
{

	private SessionFactory sessionFactory;
	
	
	
	public SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}


    @Autowired
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}



	@Override
	public Serializable save(User t)
	{
		return this.sessionFactory.getCurrentSession().save(t);
	}

}
