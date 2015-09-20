package com.hand.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hand.dao.PriceManagementDaoI;
import com.hand.model.PriceManagement;

@Repository(value = "PriceManagementDao")
public class PriceManagementDaoImpl implements PriceManagementDaoI
{
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<PriceManagement> findAll()
	{
		String hql="FROM PriceManagement";
	      return this.sessionFactory.getCurrentSession().createQuery(hql).list();
	}

	@Override
	public PriceManagement findById(int id)
	{
		return (PriceManagement) this.sessionFactory.getCurrentSession().get(PriceManagement.class,id);
	}

	@Override
	public void add(List<PriceManagement> pricemanagement)
	{
		if(pricemanagement.size() > 0){
			int sNum = pricemanagement.size();
			for(int i=0;i<sNum;i++){
				this.sessionFactory.getCurrentSession().saveOrUpdate(pricemanagement.get(i));
			}
		}

	}

}
