<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<link rel="stylesheet" href="css/Lend_style.css" type="text/css">
<title>lendBooks</title>
</head>
<body>
	<table id="table1" border="1" width="599">
		<s:form action="lendBook" method="post" theme="simple">
		<tr bgcolor="#E9EDF5" class="font1" align="center">
		<s:if test="#request.lendId == null">
			<td colspan="2">
				图&nbsp;书&nbsp;信&nbsp;息&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
				ISBN<s:textfield name="book.Book_Isbn" size="15" disabled="true"></s:textfield>&nbsp;&nbsp;&nbsp;&nbsp;
			   图&nbsp;书&nbsp;ID<s:textfield name="lendBook.LendBook_Id" size="15" disabled="true"></s:textfield>
				<s:submit value="借书" disabled="true"/>
			</td>
		</s:if>
		<s:else>
			<td colspan="2">
				图书信息&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
				ISBN<s:textfield name="book.Book_Isbn" size="15"></s:textfield>&nbsp;&nbsp;&nbsp;&nbsp; 
				图书ID<s:textfield name="lendBook.LendBook_Id" size="15"></s:textfield>
				<input type="hidden" name="student.Stu_Id" value="<s:property value="#request.lendId"/>"/>
				<s:submit value="借书"/>
			</td>
		</s:else>
		</tr>
		</s:form>
		<tr>
			<td height="340" align="left" valign="top"><jsp:include page="lendBookInfo.jsp"/></td>
		</tr>
		<tr>
			<td align="center">
				<font color="red"><s:property value="message"/></font>
			</td>
		</tr>
		<tr bgcolor="#E9EDF5" class="font1">
			<td align="right">
				<s:set name="page" value="#request.page"></s:set>
				<a href="queryLendBook.action?pageNow=1&student.Stu_Id=<s:property value="#request.lendId"/>">首页</a>
				<s:if test="#page.hasPre">
				<a href="queryLendBook.action?pageNow=<s:property value="#page.pageNow-1"/>&student.Stu_Id=<s:property value="#request.lendId"/>">上一页</a>
				</s:if>
				<s:else>
					<a href="queryLendBook.action?pageNow=1&student.Stu_Id=<s:property value="#request.lendId"/>">上一页</a>
				</s:else>
				<s:if test="#page.hasNext">
					<a href="queryLendBook.action?pageNow=<s:property value="#page.pageNow+1"/>&student.Stu_Id=<s:property value="#request.lendId"/>">下一页</a>
				</s:if>
				<s:else>
					<a href="queryLendBook.action?pageNow=<s:property value="#page.totalPage"/>&student.Stu_Id=<s:property value="#request.lendId"/>">下一页</a>
				</s:else>
				<a href="queryLendBook.action?pageNow=<s:property value="#page.totalPage"/>&student.Stu_Id=<s:property value="#request.lendId"/>">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>