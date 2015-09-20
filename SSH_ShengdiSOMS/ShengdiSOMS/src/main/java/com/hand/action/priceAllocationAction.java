package com.hand.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.hand.model.priceAllocation;
import com.hand.service.priceAllocationServiceI;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("basePackage")
@Namespace("/")
@Action(value = "priceAllocationAction", results =
{ @Result(name = "success", location = "/PriceConfigure.jsp"),
	@Result(name = "list", location = "/PriceConfigureQuery.jsp")})
@SuppressWarnings("serial")
public class priceAllocationAction extends ActionSupport implements RequestAware
{
	@Autowired
	private priceAllocationServiceI priceAllocationService;

	private String cust_code; // 客户简称
	private String type; // 类型
	private String cust_name; // 客户名称
	private String activity; // 启用状态
	private int serial_number; // 序号
	private String price_list_col; // 字段名称(PL数据库列)

	/**
	 * http://localhost:8080/ShengdiSOMS/priceAllocationAction.action
	 */
	//@Override
	public String newcofig()
	{		
		System.out.println(toString());
		System.out.println("进入action类:priceAllocationAction(新增配置)");
		// action获取表单提交的值
		if(this.getCust_code()!=null && this.getType()!=null && this.getPrice_list_col()!=null){

		// action把获取到的值传到model中
		priceAllocation t = new priceAllocation();
		System.out.println("action把获取到的值传到model中");
		t.setCust_code(this.getCust_code());
		t.setType(this.getType());
		t.setPrice_list_col(this.getPrice_list_col());
		 if(this.getCust_name()!=null){
		t.setCust_name(this.getCust_name());
		 }
		 if(this.getActivity()!=null){
		t.setActivity(this.getActivity());
		 }
		 if(this.getSerial_number()>0){
		t.setSerial_number(this.getSerial_number());
		 }
		  priceAllocationService.save(t);
		 }else{
		 System.out.println("客户简称或类型或字段名称为空!");
		 System.out.println("请重新输入!");
		 }
		return "success";

	}

	 //@Autowired
	  public String list(){
	     request.put("priceAllocations",priceAllocationService.getAll());
	     return "list";
	  }	  
	  private Map<String,Object> request;//action
	  @Override
		public void setRequest(Map<String, Object> arg0)
		{
		  this.request=arg0;
			
		}
	  
	 
	public String getCust_code()
	{
		return cust_code;
	}

	public void setCust_code(String cust_code)
	{
		this.cust_code = cust_code;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getCust_name()
	{
		return cust_name;
	}

	public void setCust_name(String cust_name)
	{
		this.cust_name = cust_name;
	}

	public String getActivity()
	{
		return activity;
	}

	public void setActivity(String activity)
	{
		this.activity = activity;
	}

	public int getSerial_number()
	{
		return serial_number;
	}

	public void setSerial_number(int serial_number)
	{
		this.serial_number = serial_number;
	}

	public String getPrice_list_col()
	{
		return price_list_col;
	}

	public void setPrice_list_col(String price_list_col)
	{
		this.price_list_col = price_list_col;
	}

	@Override
	public String toString()
	{
		return "priceAllocationAction [priceAllocationService=" + priceAllocationService + ", cust_code=" + cust_code
				+ ", type=" + type + ", cust_name=" + cust_name + ", activity=" + activity + ", serial_number="
				+ serial_number + ", price_list_col=" + price_list_col + "]";
	}

	

}
