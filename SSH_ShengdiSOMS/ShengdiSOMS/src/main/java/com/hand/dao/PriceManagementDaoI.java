package com.hand.dao;

import java.util.List;

import com.hand.model.PriceManagement;

public interface PriceManagementDaoI
{
   public List<PriceManagement> findAll();
   public PriceManagement findById(int id);
   public void add(List<PriceManagement> pricemanagement);
}
