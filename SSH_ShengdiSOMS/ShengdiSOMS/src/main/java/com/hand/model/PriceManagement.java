package com.hand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "om_cust_price_list", schema = "ShengdiSoms")
public class PriceManagement
{

	private String PL_CUST_NAME; // Customer name
	private String cust_code; // 客户简称
	private String TYPE; // 类型
	private String PL_YH_ITEM; // 工厂型号
	private String effective_date_from; // 有效日期从
	private String effective_date_to; // 有效日期至
	private double Base_price; // 基础价
	private int Spray_coating; // 加喷涂
	private int Screw; // 加螺钉
	private double Screw_price; // 螺钉价格
	//private String Import_state; // 导入状态
	//private String Remarks; // 备注

	public String getPL_CUST_NAME()
	{
		return PL_CUST_NAME;
	}

	public void setPL_CUST_NAME(String pL_CUST_NAME)
	{
		PL_CUST_NAME = pL_CUST_NAME;
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

	public String getTYPE()
	{
		return TYPE;
	}

	public void setTYPE(String tYPE)
	{
		TYPE = tYPE;
	}

	public String getPL_YH_ITEM()
	{
		return PL_YH_ITEM;
	}

	public void setPL_YH_ITEM(String pL_YH_ITEM)
	{
		PL_YH_ITEM = pL_YH_ITEM;
	}

	public String getEffective_date_from()
	{
		return effective_date_from;
	}

	public void setEffective_date_from(String effective_date_from)
	{
		this.effective_date_from = effective_date_from;
	}

	public String getEffective_date_to()
	{
		return effective_date_to;
	}

	public void setEffective_date_to(String effective_date_to)
	{
		this.effective_date_to = effective_date_to;
	}

	public double getBase_price()
	{
		return Base_price;
	}

	public void setBase_price(double base_price)
	{
		Base_price = base_price;
	}

	public int getSpray_coating()
	{
		return Spray_coating;
	}

	public void setSpray_coating(int spray_coating)
	{
		Spray_coating = spray_coating;
	}

	public int getScrew()
	{
		return Screw;
	}

	public void setScrew(int screw)
	{
		Screw = screw;
	}

	public double getScrew_price()
	{
		return Screw_price;
	}

	public void setScrew_price(double screw_price)
	{
		Screw_price = screw_price;
	}

	@Override
	public String toString()
	{
		return "PriceManagement [PL_CUST_NAME=" + PL_CUST_NAME + ", cust_code=" + cust_code + ", TYPE=" + TYPE
				+ ", PL_YH_ITEM=" + PL_YH_ITEM + ", effective_date_from=" + effective_date_from + ", effective_date_to="
				+ effective_date_to + ", Base_price=" + Base_price + ", Spray_coating=" + Spray_coating + ", Screw="
				+ Screw + ", Screw_price=" + Screw_price + ", Import_state="+ "]";
	}
}
