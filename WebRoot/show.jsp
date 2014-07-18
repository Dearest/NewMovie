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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  这是搜索电影后的展示页面<p>
    <% List<AbstractMovieinfo> movielist = (List<AbstractMovieinfo>)request.getAttribute("movielist"); %>
   list的长度：<%=movielist.size() %><p>
    <% for (AbstractMovieinfo movie:movielist){ %>
    <%=movie.getMovieid() %><p>
    <%=movie.getTitle() %><p>
    <%=movie.getCountry() %>
    
    <%} %>
  </body>
</html>
