package com.hand.test;

import java.util.Date;
import java.util.UUID;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.model.User;
import com.hand.service.UserServiceI;

public class TestHibernate
{
    @Test
	public void test(){
    	ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"});
    	UserServiceI userService=(UserServiceI) ac.getBean("userService");
		User t=new User();
		t.setId(UUID.randomUUID().toString());
		t.setName("孙宇");
		t.setPwd("123456");
		t.setCreatedatetime(new Date());
    	userService.save(t);
    }
	
}
