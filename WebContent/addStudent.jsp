<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生</title>
</head>
<body>
<s:form action="lxq" method="post">
<s:textfield label="学生学号:" name="student.Stu_Id"/>
<s:password label="学生密码:" name="student.Stu_Password"/>
<s:textfield label="学生姓名：" name="student.Stu_Name"/>
<s:radio list="#{'男':'boy' ,'女':'girl'}" label="请选择性别" name="student.Stu_Sex"/>
<s:textfield label="邮箱" name="student.Stu_Email"/>
<s:textfield label="请输入入学时间(yyyy-MM-dd):" name="student.Stu_Regist_Date"/>
<s:textfield label="请输入毕业时间(yyyy-MM-dd):" name="student.Stu_Graduate_Date"/>
<s:submit value="提交"/>
</s:form>
</body>
</html>