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
window.onload=function parseURL(){
	var url = location.href;
	var i = url.indexOf('?');
	if(i == -1) return;
	var arr1 = url.split('&');
	var arr2 = new Object();
	for(i in arr1){
			var t = arr1[i].split('=');
			arr2[t[0]] = t[1];
		}
	return arr2;
}
window.onload = function(){
	var v = parseURL();
	if(v['flag'] == 1){
		alert('ͼ����ӳɹ���');
		}
}	
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
			<td colspan="2"><jsp:include page="headForLibSystemer.jsp"/></td>
		</tr>
		<tr>
			<s:form id="f1" theme="simple" action="book" method="post" enctype="multipart/form-data" validate="true">
			<td><jsp:include page="bookSelect.jsp"/></td>
			<td><jsp:include page="bookInfo.jsp"/></td>
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
