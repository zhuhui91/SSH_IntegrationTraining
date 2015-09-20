<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.hand.action.priceAllocationAction"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>价格表配置(新增)</title>
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
											<td><input class="longButton" type="button"
												 value="查询/修改" onclick="testButtonQuery()" /></td>
											<td width="20px"></td>
											<td><input class="longButton" type="button"
												value="保存" /></td>
											<td width="60px"></td>
											<td><input class="longButton" type="submit" value="新增配置"
												onclick="newconfi()" /></td>
										</tr>
									</table>
									<script type="text/javascript">
									function testButtonQuery(){
										window.location="PriceConfigureQuery.jsp";

										}
										function newconfi() {
											document.form1.action="priceAllocationAction!newcofig.action";
											document.form1.submit();
											                                                
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
						<%
                
			     String activity=request.getParameter("activity");
			     String price_list_col=request.getParameter("price_list_col");
			     String serial_number=request.getParameter("serial_number");
			     
			     
               %>
						<div id="tablesize">
							<table class="table table-bordered table-hover">
								<tr>
									<th class="info">序号</th>
									<th class="info">PL列名</th>
									<th class="info">显示名称</th>
									<th class="info">EXCEL列</th>
									<th class="info">启用</th>
								</tr>
								<tr class="trheight">
									<td><%=serial_number %></td>
									<td><%=price_list_col %></td>
									<td></td>
									<td></td>
									<td><%=activity %></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="trheight">
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
							</table>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>