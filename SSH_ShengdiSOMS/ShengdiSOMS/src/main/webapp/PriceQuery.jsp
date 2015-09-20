<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>价格表查询</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="css/PriceQuery.css" type="text/css" rel="stylesheet" />
<script src="js/jquery-1.11.3.min.js"></script>
<!-- <script src="js/bootstrap.min.js"></script> -->
</head>
<body>
	<div class="container-fruid">
		<div class="row col-md-12">
			<div id="Content">
				<div id="formdiv3">
					<form action="" method="post" name="pQuery">
						<div id="contentTop">
							<div class="row divrow1">
								<!-- row1 -->
								<div class="col-md-2 texthead">客户简称</div>
								<div class="col-md-3">
									<div class="ax_text_field">
										<input id="input_code" type="text" name="customer_code"
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
								<div class="col-md-2 texthead">工厂型号</div>
								<div class="col-md-10">
									<div class="ax_text_field">
										<input id="Factory_model" type="text" name="Factory_model"
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
												value="查询/编辑" onclick="firm()" /></td>
											<td width="10px"></td>
											<td><input class="longButton" type="button" value="新增" onclick="funurNew()"/>
											</td>
											<td width="10px"></td>
											<td><input class="longButton" type="button" value="保存" />
											</td>
											<td width="50px"></td>
											<td><input class="longButton" type="button"
												name="ExportEXCEL" value="导出EXCEL" onclick="funur2()" /></td>
											<td width="10px"></td>
											<td><input class="longButton" type="button"
												name="ImportEXCEL" value="导入EXCEL" onclick="funurl()" /></td>
										</tr>
									</table>
									<script type="text/javascript">
										function funurl() {
											location.href = 'ImportPrice.jsp';
										}
										function funurNew() {
											alert("尚未开通此功能 !!!");
										}
										function firm() {

											document.pQuery.action = "priceManagementAction!listAll.action";
											document.pQuery.submit();

										}
										function funur2() {
											location.href = 'OutPrice.jsp';
										}
									</script>
								</div>
					</form>
				</div>

			</div>
		</div>
		<br>
		<div id="redline" class="row5">
			<img class="img" src="images/redline.png" alt="" />
		</div>
		<div id="contentBottom">
			<div class="show">

				<div id="tablesize">
					<s:if test="#request.list !=null">
						<table class="table table-bordered table-hover">
							<tr>
								<th class="info">No.</th>
								<th class="info">工厂型号</th>
								<th class="info">有效日期从</th>
								<th class="info">有效日期至</th>
								<th class="info">基础价</th>
								<th class="info">加喷漆</th>
								<th class="info">加螺钉</th>
								<th class="info">螺钉价格</th>
							</tr>
							<s:iterator value="#request.list" status="st">
								<tr class="trheight">
									<td><s:property value='#st.index+1' /></td>
									<td>${PL_YH_ITEM}</td>
									<td>${effective_date_from}</td>
									<td>${effective_date_to}</td>
									<td>${Base_price}</td>
									<td>${Spray_coating}</td>
									<td>${Screw}</td>
									<td>${Screw_price}</td>
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