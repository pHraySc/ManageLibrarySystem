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
				<br><s:submit value="图书追加" method="addBook" id="submitbutton"/><br>
				<br><s:submit value="图书删除" method="deleteBook" id="submitbutton" /><br>
				<br><s:submit value="图书修改" method="updateBook" id="submitbutton" /><br>
				<br><s:submit value="图书查询" method="selectBook" id="submitbutton"/><br>
			</td>
		</tr>
	</table>
</body>
</html>