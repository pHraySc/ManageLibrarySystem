<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<link href="css/font_hover.css" rel="stylesheet" type="text/css">
	<title>图书管理系统-学生界面</title>
</head>
<body>
	<table id="tableBGcolor" align="center">
		<tr>
			<td colspan="2"><jsp:include page="headForStudent.jsp"/></td>
		</tr>
		<tr>
			<td height="400"><h1></td>
		</tr>
		<!-- 验证失败信息或错误信息在这里显示 -->
		<tr>
			<td align="center">
				<font color="red" size="10">这里显示学生-图书信息</font>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<font size="2">成都大学：成都市龙泉驿区十陵上街&nbsp;&nbsp;邮编：610106<br>	@学生界面</font>
			</td>
		</tr>
	</table>
</body>
</html>
