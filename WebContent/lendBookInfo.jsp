<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<th>借书ID</th><th>书名</th><th>出版社</th><th>价格</th><th>借书时间</th><th>还书时间</th>
	<th>ISBN</th></tr>
	<s:iterator value="#request.queryList1" id="lend">
	<tr>
		<td><s:property value="#lend.LendBook_Id"/></td>
		<td><s:property value="#lend.LendBook_Name"/></td>
		<td><s:property value="#lend.LendBook_Pushing"/></td>
		<td><s:property value="#lend.LendBook_Price"/></td>
		<td><s:date name="#lend.LendBook_Time" format="yyyy-MM-dd"/></td>
		<td><s:date name="#lend.LendBook_Return" format="yyyy-MM-dd"/></td>
		<td><s:property value="#lend.book.Book_Isbn" /></td>
	</tr>
	</s:iterator>
</table>

</body>
</html>