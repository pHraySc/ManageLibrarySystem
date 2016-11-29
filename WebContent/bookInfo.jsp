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
	<table border="1" width="599" cellspacing="1" class="font1">
		<tr bgcolor="#E9EDF5">
			<td>图书信息</td>
		</tr>
		<tr>
			<td height="400" valign="top"><br>
				<s:if test="#request.selectedBook==null">
				<table class="font1">
					<tr>
						<td width="100">ISBN:</td>
						<td><s:textfield name="book.Book_Isbn" value=""/></td>
						<td width="100">价格:</td>
						<td><s:textfield name="Book_Price" value="" onblur="check(this)"/></td>
					</tr>
					<tr>
						<td width="100">书名:</td>
						<td><s:textfield name="book.Book_Name" value=""/></td>
						<td width="100">复本量:</td>
						<td><s:textfield name="BookCount" value="" onblur="check(this)"/></td>
					</tr>
					<tr>
						<td width="100">出版社:</td>
						<td><s:textfield name="book.Book_Pushing" value=""/></td>
						<td width="100">库存量:</td>
						<td><s:textfield name="Book_Count" value="" disabled=""/></td>
					</tr>
					<tr>
						<td width="100">作译者:</td>
						<td><s:textfield name="book.Book_Editor" value=""/></td>
					</tr>
					<tr>
						<td valign="top">内容提要:</td>
						<td><s:textarea cols="20" rows="6" value="" name="book.Book_Content"/></td>
						<td colspan="2" align="center">
							<img id="image" src="" width="100" height="120"/>
						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td colspan="1" align="right">封面图片:</td>
						<td colspan="2">
						<!-- accept为限制接收数据的类型
								all表示页面中所有该类标签的src全部为此标签中的value值，也就是选择的这张图片
						 -->
							<s:file name="photo" accept="image/*" onchange="document.all['image'].src=this.value;"/>
						</td>
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
						<td width="100">ISBN:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Isbn"/>" name="book.Book_Isbn" readonly/>
						</td>
						<td width="100">价格:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Price"/>" name="Book_Price" onblur="check(this)"/>
						</td>
					</tr>
					<tr>
						<td width="100">书名:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Name"/>" name="book.Book_Name"/>
						</td>
						<td width="100">复本量:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Count"/>" name="" onblur="check(this)"/>
						</td>
					</tr>
					<tr>
						<td width="100">出版社:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Pushing"/>" name="book.Book_Pushing"/>
						</td>
						<td width="100">库存量:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Count"/>" name="Book_Count" onblur="check(this)"/>
						</td>
					</tr>
					<tr>
						<td width="100">作译者:</td>
						<td>
							<input type="text" value="<s:property value="#selectedBook.Book_Editor"/>" name="book.Book_Editor"/>
						</td>
					</tr>
					<tr>
						<td valign="top">内容提要:</td>
						<td>
							<textarea rows="6" cols="20" name="book.Book_Content">
								<s:property value="#selectedBook.Book_Content"/>
							</textarea>
						</td>
						 <td colspan="2" align="center">
							<img id="image" src="getImage.action?book.Book_Isbn=<s:property value="#selectedBook.Book_Isbn"/>" width="100" height="120">
						</td>	
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td colspan="1" align="right">封面图片:</td>
						<td colspan="2">
							<s:file name="photo"  accept="image/*" onchange="document.all['image'].src=this.value;"/>
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