<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>周边影院</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
    html,body{margin:0;padding:0;}
    .iw_poi_title {color:#CC5522;font-size:14px;font-weight:bold;overflow:hidden;padding-right:13px;white-space:nowrap}
    .iw_poi_content {font:12px arial,sans-serif;overflow:visible;padding-top:4px;white-space:-moz-pre-wrap;word-wrap:break-word}
</style>
<script type="text/javascript" src="http://api.map.baidu.com/api?key=j57SOMl81fLsMAk2Wq6xYxGM&v=1.1&services=true"></script>
  </head>
  
 <body>
  <div algin="center" style="width:950px;height:520px;border:#ccc solid 1px;" id="dituContent"></div>
</body>
<script type="text/javascript">
    
    function initMap(){
        createMap();
        setMapEvent();
        addMapControl();
    }
    
    
    function createMap(){
        var map = new BMap.Map("dituContent");
        var point = new BMap.Point(<%=request.getAttribute("lng")%>,<%=request.getAttribute("lat")%>);
        map.centerAndZoom(point,17);
        window.map = map;
    }
    
  
    function setMapEvent(){
        map.enableDragging();
        map.enableScrollWheelZoom();
        map.enableDoubleClickZoom();
        map.enableKeyboard();
    }
    
   
    function addMapControl(){
       
	var ctrl_nav = new BMap.NavigationControl({anchor:BMAP_ANCHOR_TOP_LEFT,type:BMAP_NAVIGATION_CONTROL_LARGE});
	map.addControl(ctrl_nav);
        
	var ctrl_ove = new BMap.OverviewMapControl({anchor:BMAP_ANCHOR_BOTTOM_RIGHT,isOpen:1});
	map.addControl(ctrl_ove);
	var local = new BMap.LocalSearch(map, {
         renderOptions:{map: map}
            });
    local.searchInBounds("影院", map.getBounds());

    map.addEventListener("dragend",function(){
        map.clearOverlays();
    local.searchInBounds("影院", map.getBounds());
    });
        
	var ctrl_sca = new BMap.ScaleControl({anchor:BMAP_ANCHOR_BOTTOM_LEFT});
	map.addControl(ctrl_sca);
    }
    
    
    initMap();
</script>
</html>
