package com.hand.action;

import java.util.Date;
import java.util.UUID;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.hand.model.User;
import com.hand.service.UserServiceI;

@ParentPackage("basePackage") //写注解和在struts.xml文件写action一样效果
@Namespace("/") // 配置命名空间"/":在根目录下进行访问(即直接访问),"/demo":在demo命名空间的目录下进行访问
@Action(value="userAction") //声明action,此action类就会自动加到struts.xml
public class UserAction
{
	private UserServiceI userService;
	
	
	
	public UserServiceI getUserService()
	{
		return userService;
	}


    @Autowired //将UserServiceI类自动注入struts.xml作为action类
	public void setUserService(UserServiceI userService)
	{
		this.userService = userService;
	}



	public void test(){
		System.out.println("进入action类:UserAction");
	    userService.test();  // 调用UserServiceI类的test方法
	}
    
	public void addUser(){
		User t=new User();
		t.setId(UUID.randomUUID().toString());
		t.setName("刘杨许");
		t.setPwd("123456");
		t.setCreatedatetime(new Date());
		userService.save(t);
	}
}
