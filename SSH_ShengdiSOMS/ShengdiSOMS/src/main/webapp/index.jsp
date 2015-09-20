<%@page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
<title>销售订单管理系统</title>
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
    <script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<!--     <script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> -->
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <img src="images/logo.png">
    </div>

    <div id="title" class="container">
        <h2>销售订单管理系统</h2>
    </div>

    <div class="navbar nav-list" role="navigation">
        <div class="container">
            <div>
                <ul class="breadcrumb">
                    <li><a href="#">首页</a></li>
                </ul>
            </div>

            <div class="row">
                <div class="col-md-3">
                    <ul id="main-nav" class="nav nav-tabs nav-stacked">
                        <li class="active">
                            <a href="#welcome" data-toggle="tab">
                                <i class="glyphicon glyphicon-th-large"></i>
                                首页
                            </a>
                        </li>
                        <li>
                            <a href="#salesManagement" data-toggle="collapse" class="nav-header collapsed hasdown">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-credit-card"></i>
                                销售订单管理
                            </a>
                            <ul id="salesManagement" class="nav nav-list collapse secondmenu" style="height: 0px;padding-left: 30px">
                                 <li><a href="#salesManagement"><i class="glyphicon glyphicon-th-list"></i>Item 1.1</a></li>
                                <li><a href="#salesManagement"><i class="glyphicon glyphicon-th-list"></i>Item 1.2</a></li>
                                  <li><a href="#salesManagement"><i class="glyphicon glyphicon-th-list"></i>Item 1.3</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#invoiceManagement" data-toggle="collapse" class="nav-header collapsed hasdown">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-credit-card"></i>
                                发货单管理
                            </a>
                            <ul id="invoiceManagement" class="nav nav-list collapse secondmenu" style="height: 0px;padding-left: 30px">
                                 <li><a href="#invoiceManagement"><i class="glyphicon glyphicon-asterisk"></i>输入文本...</a></li>
                                 <li><a href="#invoiceManagement"><i class="glyphicon glyphicon-asterisk"></i>输入文本...</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#systemInterface" data-toggle="collapse" class="nav-header collapsed hasdown">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-credit-card"></i>
                                制单界面
                            </a>
                            <ul id="systemInterface" class="nav nav-list collapse secondmenu" style="height: 0px;padding-left: 30px">
                                 <li><a href="#systemInterface"><i class="glyphicon glyphicon-asterisk"></i>输入文本...</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#orderbaseMaintain" class="nav-header collapsed hasdown" data-toggle="collapse">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-credit-card"></i>
       Orderbase维护
                            </a>
                            <ul id="orderbaseMaintain" class="nav nav-list collapse secondmenu" style="height: 0px;padding-left: 30px">
                                 <li><a href="#orderbaseMaintain"><i class="glyphicon glyphicon-th-list"></i>Orderbase查询</a></li>
                                <li><a href="#orderbaseMaintain"><i class="glyphicon glyphicon-th-list"></i>Orderbase编辑</a></li>
                                  <li><a href="#orderbaseMaintain"><i class="glyphicon glyphicon-th-list"></i>Orderbase导入</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#mainDataList" class="nav-header collapsed hasdown" data-toggle="collapse">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-cog"></i>
                                主数据维护
                            </a>
                            <ul id="mainDataList" class="nav nav-list collapse secondmenu" style="height: 0px;padding-left: 30px">
                                <li><a href="#"><i class="glyphicon glyphicon-user"></i>客户管理</a></li>
                                <li><a href="#PriceQuery" data-toggle="tab"><i class="glyphicon glyphicon-th-list"></i>价格表管理</a></li>
                                <li>
                                    <a href="#discountManageList" class="nav-header collapsed hasdown" data-toggle="collapse">
                                        <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                        <i class="glyphicon glyphicon-asterisk"></i>折扣管理
                                    </a>
                                    <ul id="discountManageList" class="nav nav-list collapse thirdmenu" style="padding-left: 30px">
                                        <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>经常性折扣</a></li>
                                        <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>一次性折扣</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                     <li>
                            <a href="#systemSettings" class="nav-header collapsed hasdown" data-toggle="collapse">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-credit-card"></i>
                                系统设置
                            </a>
                             <ul id="systemSettings" class="nav nav-list collapse secondmenu" style="height: 0px;padding-left: 30px">
                                <li><a href="#"><i class="glyphicon glyphicon-user"></i>orderbase配置</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>客户订单配置</a></li>
                                 <li><a href="#PriceConfigure" data-toggle="tab"><i class="glyphicon glyphicon-asterisk"></i>价格表配置</a></li>
                                  <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>订单检测规则</a></li>
                            </ul>
                        </li>

                        <li>
                            <a href="#userManagement" class="nav-header collapsed hasdown" data-toggle="collapse">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-user"></i>
                                用户管理
                                <%--<span class="label label-warning pull-right">5</span>--%>
                            </a>
                            <ul id="userManagement" class="nav nav-list collapse secondmenu" style="height: 0px;padding-left: 30px">
                                <li><a href="#userManagement"><i class="glyphicon glyphicon-user"></i>用户管理</a></li>
                                <li><a href="#userManagement"><i class="glyphicon glyphicon-th-list"></i>修改密码</a></li>                                                          
                            </ul>
                        </li>

                        <li>
                            <a href="#authorityManagement" class="nav-header collapsed hasdown" data-toggle="collapse">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-calendar"></i>
                                权限管理
                            </a>
                            <ul id="authorityManagement" class="nav nav-list collapse secondmenu" style="height: 0px;padding-left: 30px">
                                <li><a href="#authorityManagement"><i class="glyphicon glyphicon-user"></i>角色维护</a></li>
                                <li><a href="#authorityManagement"><i class="glyphicon glyphicon-th-list"></i>权限分配</a></li>                                                          
                            </ul>
                        </li>
                        <li>
                            <a href="#reportManagement" class="nav-header collapsed hasdown" data-toggle="collapse">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-fire"></i>
                                报表管理
                            </a>
                            <ul id="reportManagement" class="nav nav-list collapse secondmenu" style="height: 0px;padding-left: 30px">
                                <li><a href="#reportManagement"><i class="glyphicon glyphicon-asterisk"></i>报表查询</a></li>
                                <li><a href="#reportManagement"><i class="glyphicon glyphicon-th-list"></i>报表配置</a></li>                                                          
                            </ul>
                        </li>
                    </ul>
                </div>

                <div id="right" class="tab-content col-md-9">
                    <div class="tab-pane active" id="welcome">
                        <h2>welcome</h2>
                    </div>
                    <div class="tab-pane" id="PriceConfigure">
                        <jsp:include page="PriceConfigure.jsp"></jsp:include>
                    </div>
                    <div class="tab-pane" id="PriceQuery">
                        <jsp:include page="PriceQuery.jsp"></jsp:include>
                    </div>
                </div>

            </div>

        </div>

    </div>

</body>
<script>
    $(".hasdown").click(function(){
        var obj = $(this).children("span");
        var breadcrumb = $(".breadcrumb");
        if(obj.hasClass("glyphicon-chevron-right")) {
            obj.removeClass().addClass("pull-right glyphicon glyphicon-chevron-down");
            breadcrumb.append('<li><a href="#">'+$(this).text()+'</a></li>')
        }
        else {
            obj.removeClass().addClass("pull-right glyphicon glyphicon-chevron-right");

        }

    })
</script>
</html>
