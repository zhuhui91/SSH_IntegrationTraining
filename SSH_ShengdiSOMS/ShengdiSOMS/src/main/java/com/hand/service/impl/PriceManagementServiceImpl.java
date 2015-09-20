package com.hand.service.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dao.PriceManagementDaoI;
import com.hand.model.PriceManagement;
import com.hand.service.PriceManagementServiceI;


@Transactional
@Service
public class PriceManagementServiceImpl implements PriceManagementServiceI
{
   @Autowired
   private PriceManagementDaoI priceManagementDao;
   
	public PriceManagementDaoI getPriceManagementDao()
{
	return priceManagementDao;
}

public void setPriceManagementDao(PriceManagementDaoI priceManagementDao)
{
	this.priceManagementDao = priceManagementDao;
}

	@Override
	public List<PriceManagement> findAll()
	{
		return priceManagementDao.findAll();
	}

	@Override
	public PriceManagement findById(int id)
	{
		return priceManagementDao.findById(id);
	}

	@Override
	public void add(List<PriceManagement> pricemanagement)
	{
		priceManagementDao.add(pricemanagement);
	}

	@Override
	public InputStream getUserExcel() {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("sheet1");
		HSSFRow row = sheet.createRow(0);

		HSSFCell cell = row.createCell(0);
		cell.setCellType(HSSFCell.ENCODING_UTF_16);
		cell.setCellValue("PL_YH_ITEM");

		cell = row.createCell(1);
		cell.setCellType(HSSFCell.ENCODING_UTF_16);
		cell.setCellValue("effective_date_from");

		cell = row.createCell(2);
		cell.setCellType(HSSFCell.ENCODING_UTF_16);
		cell.setCellValue("effective_date_to");

		cell = row.createCell(3);
		cell.setCellType(HSSFCell.ENCODING_UTF_16);
		cell.setCellValue("Base_price");
		
		cell = row.createCell(4);
		cell.setCellType(HSSFCell.ENCODING_UTF_16);
		cell.setCellValue("Spray_coating");
		
		cell = row.createCell(5);
		cell.setCellType(HSSFCell.ENCODING_UTF_16);
		cell.setCellValue("Screw");
		
		cell = row.createCell(6);
		cell.setCellType(HSSFCell.ENCODING_UTF_16);
		cell.setCellValue("Screw_price");
		
		cell = row.createCell(7);
		cell.setCellType(HSSFCell.ENCODING_UTF_16);
		cell.setCellValue("cust_code");
		
		cell = row.createCell(8);
		cell.setCellType(HSSFCell.ENCODING_UTF_16);
		cell.setCellValue("TYPE");
		
		cell = row.createCell(9);
		cell.setCellType(HSSFCell.ENCODING_UTF_16);
		cell.setCellValue("PL_CUST_NAME");

		List<PriceManagement> userslist = this.findAll();

		for (int i = 0; i < userslist.size(); i++) {
			PriceManagement user = userslist.get(i);
			row = sheet.createRow(i + 1);

			cell = row.createCell(0);
			cell.setCellType(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue(user.getPL_YH_ITEM());

			cell = row.createCell(1);
			cell.setCellType(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue(user.getEffective_date_from().toString());

			cell = row.createCell(2);
			cell.setCellType(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue(user.getEffective_date_to().toString());

			cell = row.createCell(3);
			cell.setCellType(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue(user.getBase_price());
			
			cell = row.createCell(4);
			cell.setCellType(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue(user.getSpray_coating());
			
			cell = row.createCell(5);
			cell.setCellType(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue(user.getScrew());
			
			cell = row.createCell(6);
			cell.setCellType(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue(user.getScrew_price());
			
			cell = row.createCell(7);
			cell.setCellType(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue(user.getCust_code());
			
			cell = row.createCell(8);
			cell.setCellType(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue(user.getTYPE());
			
			cell = row.createCell(9);
			cell.setCellType(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue(user.getPL_CUST_NAME());
		}

		// 但是三种方法导出的Excel表的时间都不直观，看不懂，需待优化
		// ================================方法三，推荐====================================
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			workbook.write(os);
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte[] bytes = os.toByteArray();
		ByteArrayInputStream is = new ByteArrayInputStream(bytes);
		return is;
	}

}
