<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<style>
	.font1{font-size:13px;}
</style>
</head>
<body>
<table  border="1" align="center" width="570" cellspacing="0"  bgcolor="#71CABF" class="font1">
	<tr bgcolor="#E9EDF5">
	<th>ISBN</th><th>书名</th><th>作者</th><th>出版社</th><th>内容简介</th><th>价格</th>
	<th>库存量</th></tr>
	<s:iterator value="#request.list" id="lend">
	<tr>
		<td><s:property value="#lend.Book_Isbn"/></td>
		<td><s:property value="#lend.Book_Name"/></td>
		<td><s:property value="#lend.Book_Editor"/></td>
		<td><s:property value="#lend.Book_Pushing"/></td>
		<td><s:property value="#lend.Book_Content"/></td>
		<td><s:property value="#lend.Book_Price"/></td>
		<td><s:property value="#lend.Book_Count"/></td>
	</tr>
	</s:iterator>
</table>

</body>
</html>