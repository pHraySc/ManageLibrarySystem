<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/font_hover.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生管理界面</title>
<style type="text/css">
#hreff {
	position: relative;
	top: 200px;
	left: 160px;
	height: 480px;
}

#secondDiv {
	position: absolute;
	top: 250px;
	left: 30%;
	border: 1px blue solid;
}

#showAllStudent {
	display: none;
}

#addStudent {
	display: none;
}

#deleteStudent {
	display: none;
}

#updateStudent {
	display: none;
}
</style>
</head>
<body onload="initAjax()">
	<table id="tableBGcolor" align="center">
		<tr>
			<td colspan="2"><jsp:include page="headForLibSystemer.jsp" /></td>
		</tr>
		<tr>
			<td>
				<div id="hreff">
					<a href="javascript:void(0)" onclick="showAllStudent()">所有学生信息</a><br>
					<a href="javascript:void(0)" onclick="addStudent()">添加学生信息</a><br>
					<a href="javascript:void(0)" onclick="deleteStudent()">删除学生信息</a><br>
				</div>
			</td>

			<td>
				<div id="secondDiv">
					<div id="showAllStudent"></div>
					<div id="addStudent">
						<jsp:include page="addStudent.jsp"></jsp:include>
					</div>
					<div id="deleteStudent"></div>
					<div id="updateStudent"></div>
				</div>
			</td>
		<tr>
			<td colspan="2" align="center">
				南京师范大学：南京市宁海路122号&nbsp;&nbsp;邮编：210097<br>师教教育研究中心版权所有2010-2015
			</td>
		</tr>
</body>
<script type="text/javascript"> var xmlHttp = false; function
initAjax() { if (window.XMLHttpRequest) { xmlHttp = new
XMLHttpRequest(); } else if (window.ActiveObject) { try { xmlHttp = new
ActiveXObject("Msxml2.XMLHTTP"); } catch (e) { try { xmlHttp = new
ActiveXObject("Microoft.XMLHTTP"); } catch (e) {
window.alert("您的浏览器不支持Ajax"); } } } } function showAllStudent() { var
divDisp = document.getElementById("showAllStudent").style.display; if
(divDisp == "block") {
document.getElementById("showAllStudent").style.display = "none"; } else
{ document.getElementById("showAllStudent").style.display = "block"; } }

function addStudent() { var divDisp =
document.getElementById("addStudent").style.display; if (divDisp ==
"block") { document.getElementById("addStudent").style.display = "none";
} else { document.getElementById("addStudent").style.display = "block";
} } </script>
</html>