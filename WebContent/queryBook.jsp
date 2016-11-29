<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<s:if test="#request.readerId111==null">
			<td colspan="2">
				图&nbsp;书&nbsp;信&nbsp;息&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
				ISBN<s:textfield name="lend.ISBN" size="15" disabled="true"></s:textfield>&nbsp;&nbsp;&nbsp;&nbsp;
			   图&nbsp;书&nbsp;ID<s:textfield name="lend.bookId" size="15" disabled="true"></s:textfield>
				<s:submit value="借书" disabled="true"/>
			</td>
		</s:if>
		<s:else>
			<td colspan="2">
				图书信息&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
				ISBN<s:textfield name="lend.ISBN" size="15"></s:textfield>&nbsp;&nbsp;&nbsp;&nbsp; 
				图书ID<s:textfield name="lend.bookId" size="15"></s:textfield>
				<input type="hidden" name="lend.readerId" value="<s:property value="#request.readerId"/>"/>
				<s:submit value="借书"/>
			</td>
		</s:else>
		</tr>
		</s:form>
		<tr align="left">
			<td height="340"  valign="top"><jsp:include page="queryBookInfo.jsp"/></td>
		</tr>
		
		<tr bgcolor="#E9EDF5" class="font1">
			<td align="right">
				<s:set name="page" value="#request.page3"></s:set>
				<a href="selectBook.action?pageNow=1&bookName=<s:property value="#request.bookName"/>">首页</a>
				<s:if test="#page.hasPre">
				<a href="selectBook.action?pageNow=<s:property value="#page.pageNow-1"/>&bookName=<s:property value="#request.bookName"/>">上一页</a>
				</s:if>
				<s:else>
					<a href="selectBook.action?pageNow=1&bookName=<s:property value="#request.bookName"/>">上一页</a>
				</s:else>
				<s:if test="#page.hasNext">
					<a href="selectBook.action?pageNow=<s:property value="#page.pageNow+1"/>&bookName=<s:property value="#request.bookName"/>">下一页</a>
				</s:if>
				<s:else>
					<a href="selectBook.action?pageNow=<s:property value="#page.totalPage"/>&bookName=<s:property value="#request.bookName"/>">下一页</a>
				</s:else>
				<a href="selectBook.action?pageNow=<s:property value="#page.totalPage"/>&bookName=<s:property value="#request.bookName"/>">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>