package com.hand.service;

import java.io.InputStream;
import java.util.List;

import com.hand.model.PriceManagement;

public interface PriceManagementServiceI
{
	public List<PriceManagement> findAll();
	public PriceManagement findById(int id);
    public void add(List<PriceManagement> pricemanagement);
    
    public InputStream getUserExcel();

}
