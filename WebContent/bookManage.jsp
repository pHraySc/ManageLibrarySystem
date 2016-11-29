<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<link href="css/font_hover.css" rel="stylesheet" type="text/css">
<title>图书管理系统</title>
<style>
	.font1{font-size:13px;}
</style>
<script language="javascript">
window.onload=function parseURL(){
	var url = location.href;
	var i = url.indexOf('?');
	if(i == -1) return;
	var arr1 = url.split('&');
	var arr2 = new Object();
	for(i in arr1){
			var t = arr1[i].split('=');
			arr2[t[0]] = t[1];
		}
	return arr2;
}
window.onload = function(){
	var v = parseURL();
	if(v['flag'] == 1){
		alert('图书添加成功！');
		}
}	
function check(thisObject){
	var sTmp="";
	sTmp=thisObject.value;
	if(isNaN(sTmp)){
		alert("请输入数字");
		thisObject.select();
	}
}
</script>
</head>
<body>
	<table id="tableBGcolor" align="center" class="font1">
		<tr>
			<td colspan="2"><jsp:include page="headForLibSystemer.jsp"/></td>
		</tr>
		<tr>
			<s:form id="f1" theme="simple" action="book" method="post" enctype="multipart/form-data" validate="true">
			<td><jsp:include page="bookSelect.jsp"/></td>
			<td><jsp:include page="bookInfo.jsp"/></td>
			</s:form>
		</tr>
		<tr>
			<td colspan="2" align="center">
				南京师范大学：南京市宁海路122号&nbsp;&nbsp;邮编：210097<br>师教教育研究中心版权所有2010-2015
			</td>
		</tr>
	</table>
</body>
</html>
