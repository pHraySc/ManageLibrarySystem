<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>loginInterface</title>
	<link rel="stylesheet" type="text/css" href="css/Login_style.css">
</head>
<!-- http://www.modelgoon.org/update   -->
<body>
	<img id="image_LibTop" src="image/LibraryTop.png" alt="图书信息管理系统">
	<div id="loginITC">
		<s:form action="login" method="post" theme="simple">
			<br>
  		帐&nbsp;&nbsp;号：<s:textfield name="username"></s:textfield>
			<br>
			<div id="ErrorMsg">&nbsp;&nbsp;&nbsp;<s:property value="#session.ErrorMsg" />
			</div>
			<br>
  		密&nbsp;&nbsp;码：<s:textfield name="password" type="password"></s:textfield>
			<br>
			<br>
			<s:radio id="roleList" list="#{'Student':'学生','Lib_Systemer':'图书管理员','Sys_Systemer':'系统管理员' }"
				name="role" value="1"></s:radio>
			<br>
			<br>
			<s:submit value="登  录" ></s:submit>&nbsp;&nbsp;
			<s:reset value="重  置"></s:reset>
		</s:form>
	</div>
</body>
</html>
