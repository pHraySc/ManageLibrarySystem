<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<style>
	.font1{
	font-size:13px;
	margin-left: 160px;
	}
</style>
</head>
<body>
	<s:form action="queryLendBook" method="post" theme="simple">
		<table border="1" width="200" cellspacing=1 class="font1">
			<tr bgcolor="#E9EDF5">
				<td>功&nbsp;能&nbsp;选&nbsp;择&nbsp;：</td>
			</tr>
			<tr>
				<td align="left" valign="top" height="400">
					<br>借&nbsp;书&nbsp;证&nbsp;号&nbsp;：<br><br>
					<s:textfield name="student.Stu_Id" size="15"/>
					<s:submit value="查 询"/>
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>