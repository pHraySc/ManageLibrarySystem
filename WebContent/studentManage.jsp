<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<link href="css/font_hover.css" rel="stylesheet" type="text/css">
<title>ͼ�����ϵͳ</title>
<style>
	.font1{font-size:13px;}
</style>
<script language="javascript">
function check(thisObject){
	var sTmp="";
	sTmp=thisObject.value;
	if(isNaN(sTmp)){
		alert("����������");
		thisObject.select();
	}
}
</script>
</head>
<body>
	<table id="tableBGcolor" align="center" class="font1">
		<tr>
			<td colspan="2"><jsp:include page="headForSysSystemer.jsp"/></td>
		</tr>
		<tr>
			<s:form id="f1" theme="simple" action="student" method="post" enctype="multipart/form-data" validate="true">
			<td><jsp:include page="studentSelect.jsp"/></td>
			<td><jsp:include page="studentInfo.jsp"/></td>
			</s:form>
		</tr>
		<tr>
			<td colspan="2" align="center">
				�Ͼ�ʦ����ѧ���Ͼ�������·122��&nbsp;&nbsp;�ʱࣺ210097<br>ʦ�̽����о����İ�Ȩ����2010-2015
			</td>
		</tr>
	</table>
</body>
</html>
