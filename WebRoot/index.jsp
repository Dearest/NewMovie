<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>电影天堂</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
   <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
   <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
  </head>
  
  <body>
  <p>&nbsp;
  <p>&nbsp;
  <p>&nbsp;
<div class="container" style="padding-top:10px">
  <div class="row">
    <div class="span6">
      <ul class="nav nav-tabs">
        <li class="active"><a href="movie/find" target="iframe">电影搜索</a></li> 
        <li><a href="getcoor.jsp" target="iframe">周边影院</a></li>
      </ul>
    </div>
  </div>
</div>
<div align="center">
<iframe name="iframe" src="movie/find" frameborder="0" scrolling="auto" height="580" width="960"></iframe>
  </div>
  </body>
</html>
