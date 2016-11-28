<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<style>
	.font1{font-size:13px;
	}
	#font1{
		margin-left: 160px;
	}
	#submitbutton:HOVER{
		background-color: #00FFFF;
	}
</style>
</head>
<body>
	<table border="1" width="200" cellspacing=1 class="font1" id="font1">
		<tr bgcolor="#E9EDF5">
			<td>功能选择：</td>
		</tr>
		<tr>
			<td align="center" valign="top" height="400">
				<br><s:submit value="学生信息显示" method="displayAllStudents" id="submitbutton"/><br>
				<br><s:submit value="添加学生信息" method="addStudentInfo" id="submitbutton" /><br>
				<br><s:submit value="删除学生信息" method="deleteStudentInfo" id="submitbutton" /><br>
				<br><s:submit value="（备用button）" method="" id="submitbutton"/><br>
			</td>
		</tr>
	</table>
</body>
</html>