<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<style>
	.font1{font-size:13px;}
</style>
</head>
<body>
	<table border="1" width="599" cellspacing="1" class="font1">
		<tr bgcolor="#E9EDF5">
			<td>图书信息</td>
		</tr>
		<tr>
			<td height="400" valign="top"><br>
				<s:if test="#request.selectedBook==null">
				<table class="font1">
					<tr>
						<td width="100">学号:</td>
						<td><s:textfield name="book.Book_Isbn" value=""/></td>
						<td width="100">姓名:</td>
						<td><s:textfield name="Book_Price" value="" onblur="check(this)"/></td>
					</tr>
					<tr>
						<td width="100">性别:</td>
						<td><s:textfield name="book.Book_Name" value=""/></td>
						<td width="100">邮箱:</td>
						<td><s:textfield name="BookCount" value="" onblur="check(this)"/></td>
					</tr>
					<tr>
						<td width="100">入学时间:</td>
						<td><s:textfield name="book.Book_Pushing" value=""/></td>
						<td width="100">毕业时间:</td>
						<td><s:textfield name="Book_Count" value="" disabled=""/></td>
					</tr>
					<%-- <tr>
						<td colspan="4" align="center">
						<!-- 错误信息在这里 -->
							<font color="red"><s:property value="message"/></font>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<font color="red"><s:fielderror/></font>
						</td>
					</tr> --%>
				</table>
				</s:if>
				<s:else>
				<s:set name="selectedBook" value="#request.selectedBook"/>
				<table>
					<tr>
						<td width="100">学号:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Isbn"/>" name="book.Book_Isbn" readonly/>
						</td>
						<td width="100">姓名:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Price"/>" name="Book_Price" onblur="check(this)"/>
						</td>
					</tr>
					<tr>
						<td width="100">性别:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Name"/>" name="book.Book_Name"/>
						</td>
						<td width="100">邮箱:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Count"/>" name="" onblur="check(this)"/>
						</td>
					</tr>
					<tr>
						<td width="100">入学时间:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Pushing"/>" name="book.Book_Pushing"/>
						</td>
						<td width="100">毕业时间:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Count"/>" name="Book_Count" onblur="check(this)"/>
						</td>
					</tr>
					<%--<tr>
						<td colspan="4" align="center">
							<s:property value="message"/>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<font color="red"><s:fielderror/></font>
						</td>
					</tr>--%>
				</table>
				</s:else> 
			</td>
		</tr>
	</table>
</body>
</html>