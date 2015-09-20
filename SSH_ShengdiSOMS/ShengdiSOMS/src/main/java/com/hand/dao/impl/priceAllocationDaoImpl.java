package com.hand.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.dao.priceAllocationDaoI;
import com.hand.model.priceAllocation;

@Repository(value = "priceAllocationDao")
public class priceAllocationDaoImpl implements priceAllocationDaoI
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(priceAllocation t)
	{
		this.sessionFactory.getCurrentSession().save(t);
	}
     
	  @SuppressWarnings("unchecked")
	@Override
	  public List<priceAllocation> getAll(){
	    String hql="FROM priceAllocation";
	      return this.sessionFactory.getCurrentSession().createQuery(hql).list();
	  }
	 
}
