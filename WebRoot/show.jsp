<%@ page language="java" import="java.util.*,com.movie.entity.AbstractMovieinfo" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<!--  <link href="css/bootstrap.css" rel="stylesheet"> 
<script type="text/javascript" src="js/jquery-1.7.3.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>-->
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
   <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
   <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
  </head>
  
  <body>
    <% List<AbstractMovieinfo> movielist = (List<AbstractMovieinfo>)request.getAttribute("movielist"); %>
    <table class="table table-hover">
   
    <thead>
      <tr>
         <th>名称</th>
         <th>演员</th>
         <th>导演</th>
         <th>分类</th>
         <th>年代</th>
       
        
      </tr>
   </thead>
   <tbody>
    <% for (AbstractMovieinfo movie:movielist){ %>
    <tr>
    	<td><%=movie.getTitle() %></td>
  <td><%=movie.getActors() %></td>
  <td><%=movie.getDirectors() %></td>
    <td><%=movie.getGenres() %></td>
    <td><%=movie.getYear() %></td>
    <%} %>
    </tbody>
    </table>
    <div align="center"><a href="index.jsp" target="blank">返回前页</a></div>
  </body>
</html>
