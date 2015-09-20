package com.hand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "om_cust_price_list_config", schema = "ShengdiSoms")
public class priceAllocation
{
	@Override
	public String toString()
	{
		return "priceAllocation [cust_code=" + cust_code + ", type=" + type + ", cust_name=" + cust_name + ", activity="
				+ activity + ", serial_number=" + serial_number + ", price_list_col=" + price_list_col + "]";
	}

	private String cust_code; // 客户简称
	private String type; // 类型
	private String cust_name; // 客户名称
	private String activity; // 启用状态
	private int serial_number; // 序号
	private String price_list_col; // 字段名称(PL数据库列)

	/** 默认构造函数 */
	public priceAllocation() {
	}

	@Id
	@Column(name = "cust_code", nullable = false, length = 120)
	public String getCust_code()
	{
		return cust_code;
	}

	public void setCust_code(String cust_code)
	{
		this.cust_code = cust_code;
	}

	@Column(name = "type", nullable = false, length = 8)
	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	@Column(name = "cust_name", length = 120)
	public String getCust_name()
	{
		return cust_name;
	}

	public void setCust_name(String cust_name)
	{
		this.cust_name = cust_name;
	}

	@Column(name = "activity", length = 2)
	public String getActivity()
	{
		return activity;
	}

	public void setActivity(String activity)
	{
		this.activity = activity;
	}

	@Column(name = "serial_number")
	public int getSerial_number()
	{
		return serial_number;
	}

	public void setSerial_number(int serial_number)
	{
		this.serial_number = serial_number;
	}

	@Column(name = "price_list_col", nullable = false, length = 30)
	public String getPrice_list_col()
	{
		return price_list_col;
	}

	public void setPrice_list_col(String price_list_col)
	{
		this.price_list_col = price_list_col;
	}

}
