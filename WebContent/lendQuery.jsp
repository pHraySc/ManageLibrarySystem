<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<link href="css/font_hover.css" rel="stylesheet" type="text/css">
<title>图书管理系统-借书查询</title>
<style>
.font1 {
	font-size: 13px;
}
</style>
</head>
<!-- 
		此界面为借书查询界面，使用者为图书管理员，其他角色一概不能使用
 -->
<body>
	<table id="tableBGcolor" align="center">
		<tr>
			<td colspan="2"><jsp:include page="headForLibSystemer.jsp" /></td>
		</tr>
		<tr>
			<td><jsp:include page="searchLendInfo.jsp" /></td>
			<td><jsp:include page="lendBook.jsp" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center" class="font1">
				成都大学：成都市龙泉驿区十陵上街&nbsp;&nbsp;邮编：610106<br> @图书管理员界面
			</td>
		</tr>
	</table>
</body>
</html>
