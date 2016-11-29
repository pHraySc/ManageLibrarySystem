<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<link href="css/font_hover.css" rel="stylesheet" type="text/css">
<title>图书管理系统-图书管理员</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>
<body bgcolor="#FFFFFF" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<table id="__01" width="100%" height="120" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td rowspan="2">
			<img src="image/lock.png" width="100%" height="120" alt=""></td>
		<td colspan="7">
			<img src="image/LibraryTop.png" width="100%" height="120" alt=""></td>
	</tr>
	<tr id="nav">
		<td>
		&nbsp;<span id = "choose" onclick="location.href='bookQuery.jsp'">&nbsp;<font  size="4" style="width:105; text-align:center; height: 45; cursor: pointer; ">图书查询</font>&nbsp;</span></td>
		<td>
		&nbsp;<span id = "nochoose">&nbsp;<font size="4" style="width:105; height: 45;">借书查询</font>&nbsp;</span></td>
		<td>
		&nbsp;<span id = "choose" onclick="location.href='lendBook1.jsp'">&nbsp;<font size="4" style="width:105; height: 45; cursor: pointer; ">借书</font>&nbsp;</span></td>
		<td>
		&nbsp;<span id = "choose" onclick="location.href='returnBook.jsp'">&nbsp;<font size="4" style="width:105; height: 45; cursor: pointer; ">还书</font>&nbsp;</span></td>
		<td>
		&nbsp;<span id = "nochoose">&nbsp;<font size="4" style="width:105; height: 45;">读者管理</font>&nbsp;</span></td>
		<td>
		&nbsp;<span id = "choose" onclick="location.href='bookManage.jsp'">&nbsp;<font size="4" style="width:105; height: 45; cursor: pointer; ">图书管理</font>&nbsp;</span></td>
		<td>
		&nbsp;<span id = "choose" onclick="location.href='lendQuery.jsp'">&nbsp;<font size="4" style="width:105; height: 45; cursor: pointer; ">关于</font>&nbsp;</span></td>
	</tr>
	
</table>
</body>
</html>