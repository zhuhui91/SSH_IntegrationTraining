package com.hand.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.service.UserServiceI;

public class TestSpring
{
   @Test
	public void test(){
		ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml"});
		UserServiceI userService=(UserServiceI) ac.getBean("userService");
		userService.test();
		
	}
	
}
