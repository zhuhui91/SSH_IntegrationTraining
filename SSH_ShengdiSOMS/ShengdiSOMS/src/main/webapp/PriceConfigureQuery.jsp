<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>价格表配置(查询/修改)</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="css/PriceConfigure.css" type="text/css" rel="stylesheet" />
<script src="js/jquery-1.11.3.min.js"></script>
<!-- <script src="js/bootstrap.min.js"></script> -->
</head>
<body>
	<div class="container-fruid">
		<div class="row col-md-12">
			<div id="Content">
				<div id="form">
					<form action="" method="post" name="form1">
						<div id="contentTop">
							<div class="row divrow1">
								<!-- row1 -->
								<div class="col-md-2 texthead">客户简称</div>
								<div class="col-md-3">
									<div class="ax_text_field">
										<input id="input_code" type="text" name="cust_code"
											value="GTW" />
									</div>
								</div>
								<div class="col-md-2 texthead">类型</div>
								<div class="col-md-5">
									<div class="ax_text_field">
										<input id="input_type" type="text" name="type" value="" />
									</div>
								</div>
							</div>
							<div class="row divrow1">
								<!-- row2 -->
								<div class="col-md-2 texthead">客户名称</div>
								<div class="col-md-3">
									<div class="ax_text_field">
										<input id="input_name" type="text" name="cust_name" value="" />
									</div>
								</div>
								<div class="col-md-2 texthead">启用状态</div>
								<div class="col-md-5">
									<div class="ax_text_field">
										<input id="start_status" type="text" name="activity"
											value="全部" />
									</div>
								</div>
							</div>
							<div class="row divrow1">
								<!-- row3 -->
								<div class="col-md-2 texthead">序号</div>
								<div class="col-md-3">
									<div class="ax_text_field">
										<input id="serial_number" type="text" name="serial_number"
											value="" />
									</div>
								</div>
								<div class="col-md-2 texthead">字段名称</div>
								<div class="col-md-5">
									<div class="ax_text_field">
										<input id="field_name" type="text" name="price_list_col"
											value="" />
									</div>
								</div>
							</div>
						</div>
						<br> <br>
						<div id="contentCentre">
							<div class="row">
								<div id="clickButton" class="ax_html_button">
									<table>
										<tr>
											<td width="200px"></td>
											<td><input class="longButton" type="submit"
												 value="查询/修改" onclick="firm()" /></td>
											<td width="20px"></td>
											<td><input class="longButton" type="button"
												value="保存" /></td>
											<td width="60px"></td>
											<td><input class="longButton" type="button" value="新增配置"
												onclick="testButtonConfi()" /></td>
										</tr>
									</table>
									<script type="text/javascript">
						
										function firm() {//利用对话框返回的值 （true 或者 false）
											document.form1.action="priceAllocationAction!list.action";
											document.form1.submit();
// 											if (confirm("你确定选择要查询？")) {//如果是true ，那么就响应价格表配置的 " 查询  "方法.否则,弹出下一个提示框
// 												document.form1.action="priceAllocationAction!list.action";
// 												document.form1.submit();
// 											}
// 											if (confirm("你确定选择修改吗?")) {//如果是true ，那么就响应价格表配置的 " 修改  "方法.否则,关闭提示框
// 												document.form1.action="";
// 											}
										}
										
										function testButtonConfi(){
											window.location="PriceConfigure.jsp";

											}
									</script>
								</div>
							</div>
						</div>

					</form>
				</div>
				<br>
				<div id="redline" class="row">
					<img class="img" src="images/redline.png" alt="" />
				</div>
				<div id="contentBottom">
					<div class="show">
              		<div id="tablesize">
						   <s:if test="#request.priceAllocations !=null">
							<table class="table table-bordered table-hover">
								<tr>
									<th class="info">序号</th>
									<th class="info">PL列名</th>
									<th class="info">显示名称</th>
									<th class="info">EXCEL列</th>
									<th class="info">启用</th>
								</tr>
								 <s:iterator value="#request.priceAllocations"> 
								<tr class="trheight">
									<td>${serial_number}</td>
									<td>${price_list_col}</td>
									<td></td>
									<td></td>
									<td>${activity}</td>
								</tr>
								</s:iterator> 
							</table>
							</s:if> 
						</div>
                             
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>