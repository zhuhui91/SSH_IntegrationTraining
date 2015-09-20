package com.hand.action;

import java.io.InputStream;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.hand.service.PriceManagementServiceI;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ParentPackage("basePackage")
@Namespace("")
@Action(value = "generateUserExcel", results = { @Result(name = "success", type = "stream", params = { "contentType",
		"application/vnd.ms-excel", "contentDisposition", "filename=AllUser.xls", "inputName", "downloadUserExcel",
		"bufferSize", "1024" }) })
public class GenerateUserExcel extends ActionSupport {

	@Autowired
	private PriceManagementServiceI priceManagementService;

	public InputStream getDownloadUserExcel() {

		return this.priceManagementService.getUserExcel();
	}

	@Override
	public String execute() throws Exception {
		System.out.println("已成功导入Excel表所有数据");
		return SUCCESS;
	}
}
