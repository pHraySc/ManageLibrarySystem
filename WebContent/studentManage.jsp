<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<link href="css/font_hover.css" rel="stylesheet" type="text/css">
<title>图书管理系统</title>
<style>
	.font1{font-size:13px;}
</style>
<script language="javascript">
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
			<td colspan="2"><jsp:include page="headForSysSystemer.jsp"/></td>
		</tr>
		<tr>
			<s:form id="f1" theme="simple" action="student" method="post" enctype="multipart/form-data" validate="true">
			<td><jsp:include page="studentSelect.jsp"/></td>
			<td><jsp:include page="studentInfo.jsp"/></td>
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
