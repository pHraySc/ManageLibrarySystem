<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有学生信息</title>
</head>
<body>
<table border="1">
<s:iterator value="#session.allStudents" var="students">
<tr>
<td><s:property value="#students.Stu_Id"/></td><td></td><td></td><td></td>
</tr>
</s:iterator>
</table>
</body>
</html>