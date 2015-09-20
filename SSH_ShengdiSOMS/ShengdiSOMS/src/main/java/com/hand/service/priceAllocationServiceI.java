package com.hand.service;


import java.util.List;

import com.hand.model.priceAllocation;

public interface priceAllocationServiceI  // (配置价格)
{
//   public void newConfiguration(); // 新增配置(配置价格)
   
   public void save(priceAllocation t);
   
   
     public List<priceAllocation> getAll();
     
   
   
}
