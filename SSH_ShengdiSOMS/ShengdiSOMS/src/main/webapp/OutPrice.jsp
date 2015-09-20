<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>价格表导出</title>
<link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="css/ImportPrice.css" type="text/css" rel="stylesheet" />
<script src="js/jquery-1.11.3.min.js"></script>
<!-- <script src="js/bootstrap.min.js"></script> -->
</head>
<body>
	<div class="">
		<div id="rightdiv" class="">
			<div id="Content">
				<h4>导出EXCEL表</h4>
				<br> <br>
				<div id="contentCentre1">
					<div class="row4">
					     <div id="formOut">
					        <form action=""  method="post"
							name="pOuport">
						<div id="clickButton" class="ax_html_button">
							<table>
								<tr>
									<td width="200px"></td>
									<td><input class="longButton" type="button" value="查询" onclick="toQury()" />
									</td>
									<td width="50px"></td>
									<td><input class="longButton" type="submit"
										value="导出EXCEL" onclick="OutEX()" /></td>
									<td width="10px"></td>
									<td><input class="showbutton" type="button"
										value="导入EXCEL" disabled="disabled" /></td>
								</tr>
							</table>
							<script type="text/javascript">
							
							 function toQury(){
			                	 location.href ='PriceQuery.jsp';
			                 }
							 function OutEX(){
									
									document.pOuport.action="generateUserExcel!execute.action";
									document.pOuport.submit();
				
							}
							</script>
						</div>
						
						</form>
					     </div>
					</div>
				</div>
				<br>
				<div class="redline" class="row5">
					<img class="img" src="images/redline.png" alt="" />
				</div>
				<br>
			
				<br>
				<div class="redline" class="row9">
					<img class="img" src="images/redline.png" alt="" />
				</div>
				<br>
				<div id="contentBottom">
					<div class="row10">
					   <form action="" name="firmOutPutEx" method="post">
							<input class="longButton" type="submit" value="查看导出明细"
								onclick="firmOutShow()" />
						</form>
						<script type="text/javascript">
							function firmOutShow() {

								document.firmOutPutEx.action = "priceManagementAction!QuryOut.action";
								document.firmOutPutEx.submit();
							}
						</script>		
					</div>
					<br>
					<div class="show">

						<div id="tablesize">
						   <s:if test="#request.list !=null">
							<table class="table table-bordered table-hover">
								<tr>
									<th class="info">No.</th>
									<th class="info">YH NO.</th>
									<th class="info">有效日期从</th>
									<th class="info">有效日期至</th>
									<th class="info">基础价</th>
									<th class="info">加螺钉</th>
									<th class="info">加喷漆</th>
									<th class="info">导出状态</th>
									<th class="info">备注</th>
								</tr>
								<s:iterator value="#request.list" status="st">
								<tr class="trheight">							
									<td><s:property value='#st.index+1'/></td>
									<td>${PL_YH_ITEM}</td>
									<td>${effective_date_from}</td>
									<td>${effective_date_to}</td>
									<td>${Base_price}</td>
									<td>${Screw}</td>
									<td>${Spray_coating}</td>
									<td>成功</td>
									<td></td>
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