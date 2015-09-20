package com.hand.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dao.priceAllocationDaoI;
import com.hand.model.priceAllocation;
import com.hand.service.priceAllocationServiceI;

@Transactional
@Service
public class priceAllocationServiceImpl implements priceAllocationServiceI
{
	@Autowired
	private priceAllocationDaoI priceAllocationDao;

	public priceAllocationDaoI getPriceAllocationDao()
	{
		return priceAllocationDao;
	}

	public void setPriceAllocationDao(priceAllocationDaoI priceAllocationDao)
	{
		this.priceAllocationDao = priceAllocationDao;
	}

//	@Override
//	public void newConfiguration()
//	{
//		System.out.println("进入接口实现类:priceAllocationServiceImpl");
//
//	}

	@Override
	public void save(priceAllocation t)
	{
		this.priceAllocationDao.save(t);
	}
	
	
	  public List<priceAllocation> getAll(){
	    return priceAllocationDao.getAll();
	  } 
	 

}
