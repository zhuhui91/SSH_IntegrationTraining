package com.hand.dao;


import java.util.List;

import com.hand.model.priceAllocation;

public interface priceAllocationDaoI
{
	 public void save(priceAllocation t);
	 
	 
	   public List<priceAllocation> getAll();
	  
	 
	
}
