package com.hand.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.hand.java.UploadFile;
import com.hand.model.PriceManagement;
import com.hand.service.PriceManagementServiceI;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("basePackage")
@Namespace("/")
@Action(value = "priceManagementAction", results =
{ @Result(name = "import", location = "/ImportPrice.jsp"),
		@Result(name = "success", location = "/PriceQuery.jsp"),
		@Result(name = "checkInQuery", location = "/ImportPrice.jsp"),
		@Result(name = "OUTexcel", location = "/OutPrice.jsp"),
		@Result(name = "checkOutQuery", location = "/OutPrice.jsp") })
@SuppressWarnings("serial")
public class PriceManagementAction extends ActionSupport
{

	private InputStream excelFile;
	private File uploadFile;
	private String uploadFileFileName;
	@Autowired
	private PriceManagementServiceI priceManagementService;

	/**
	 * http://localhost:8080/ShengdiSOMS/priceManagementAction.action
	 */

	// 进入页面查询数据
	public String listAll()
	{
		System.out.println("进入页面查询数据---》");
		HttpServletRequest request = ServletActionContext.getRequest();
		List<PriceManagement> sList = priceManagementService.findAll();
		request.setAttribute("list", sList);
		return "success";
	}
	
	// 返回EXECL导入查询数据
	public String QuryInt()
	{
		System.out.println("进入(EXECL导入)页面查询数据---》");
		HttpServletRequest request = ServletActionContext.getRequest();
		List<PriceManagement> sList = priceManagementService.findAll();
		request.setAttribute("list", sList);
		return "checkInQuery";
	}
	
	// 返回EXECL导出查询数据
		public String QuryOut()
		{
			System.out.println("进入(EXECL导出)页面查询数据---》");
			HttpServletRequest request = ServletActionContext.getRequest();
			List<PriceManagement> sList = priceManagementService.findAll();
			request.setAttribute("list", sList);
			return "checkOutQuery";
		}

	// 导入Excel
	public String ExcelInto() throws Exception
	{
		System.out.println("进入导入Excel---》");
		String directory = "/file";
		String targetDirectory = ServletActionContext.getServletContext().getRealPath(directory);
		File target = UploadFile.Upload(uploadFile, uploadFileFileName, targetDirectory);
		System.out.println("file dir = " + target.getAbsolutePath());
		System.out.println("file dir = " + target.getPath());
		List<PriceManagement> sList = new ArrayList<PriceManagement>();
		excelFile = new FileInputStream(target);
		Workbook wb = new HSSFWorkbook(excelFile);
		// Workbook wb = new XSSFWorkbook(excelFile);
		Sheet sheet = wb.getSheetAt(0);
		int rowNum = sheet.getLastRowNum() + 1;
		for (int i = 1; i < rowNum; i++)
		{
			PriceManagement student = new PriceManagement();
			Row row = sheet.getRow(i);
			int cellNum = row.getLastCellNum();
			for (int j = 0; j < cellNum; j++)
			{
				Cell cell = row.getCell(j);
				String cellValue = null;
				System.out.println("判断excel判断excel单元格内容的格式");


				switch (cell.getCellType())
				{
				case HSSFCell.CELL_TYPE_NUMERIC:// 数字类型
					if (HSSFDateUtil.isCellDateFormatted(cell))
					{// 处理日期格式、时间格式
						SimpleDateFormat sdf = null;
						if (cell.getCellStyle().getDataFormat() == HSSFDataFormat.getBuiltinFormat("h:mm"))
						{
							sdf = new SimpleDateFormat("HH:mm");
						} else
						{// 日期
							sdf = new SimpleDateFormat("yyyy-MM-dd");
						}
						Date date = cell.getDateCellValue();
						cellValue = sdf.format(date);
					} else if (cell.getCellStyle().getDataFormat() == 58)
					{
						// 处理自定义日期格式：m月d日(通过判断单元格的格式id解决，id的值是58)
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						double value = cell.getNumericCellValue();
						Date date = org.apache.poi.ss.usermodel.DateUtil.getJavaDate(value);
						cellValue = sdf.format(date);
					} else {
						double value = cell.getNumericCellValue();
						CellStyle style = cell.getCellStyle();
						DecimalFormat format = new DecimalFormat();
						String temp = style.getDataFormatString();
						// 单元格设置成常规
						if (temp.equals("General"))
						{
							format.applyPattern("#");
						}
						cellValue = format.format(value);
					}
					break;
				case HSSFCell.CELL_TYPE_STRING:// String类型
					cellValue = cell.getRichStringCellValue().toString();
					break;
				case HSSFCell.CELL_TYPE_BLANK:
					cellValue = "";
				default:
					cellValue = "";
					break;
				}

				System.out.println("通过列数来判断对应插如的字段");
				switch (j)
				{// 通过列数来判断对应插如的字段
				case 0:
					student.setPL_YH_ITEM(cellValue);
					break;
				case 1:
					student.setEffective_date_from(cellValue);
					break;
				case 2:
					student.setEffective_date_to(cellValue);
					break;
				case 3:
					student.setBase_price(Double.valueOf(cellValue));
					break;
				case 4:
					student.setSpray_coating(Integer.valueOf(cellValue));
					break;
				case 5:
					student.setScrew(Integer.valueOf(cellValue));
					break;
				case 6:
					student.setScrew_price(Double.valueOf(cellValue));
					break;
				case 7:
					student.setCust_code(cellValue.toString());
				case 8:
					student.setTYPE(cellValue.toString());
				case 9:
					student.setPL_CUST_NAME(cellValue.toString());
				}
			}
			sList.add(student);
		}
		System.out.println("查看导入数据");
		Iterator<PriceManagement> iterator = sList.iterator();
		while (iterator.hasNext())
		{
			PriceManagement priceManagement = (PriceManagement) iterator.next();
			int i = 0;
			System.out.println(++i + ":   " + priceManagement.toString());

		}
		priceManagementService.add(sList);
		System.out.println("已成功导入Excel表所有数据");
		return "import";
	}

	public InputStream getExcelFile()
	{
		return excelFile;
	}

	public PriceManagementServiceI getPriceManagementService()
	{
		return priceManagementService;
	}

	// @Resource(name="priceManagementService")
	public void setPriceManagementService(PriceManagementServiceI priceManagementService)
	{
		this.priceManagementService = priceManagementService;
	}

	public File getUploadFile()
	{
		return uploadFile;
	}

	public void setUploadFile(File uploadFile)
	{
		this.uploadFile = uploadFile;
	}

	public String getUploadFileFileName()
	{
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName)
	{
		this.uploadFileFileName = uploadFileFileName;
	}

}
