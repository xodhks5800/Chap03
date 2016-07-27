<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html">
<html>
<head>
<meta charset="UTF-8">
<title> redirect.jsp </title>
</head>
<body>


<%
	response.sendRedirect("http://www.google.com");
// 	response.sendRedirect("/deptList.jsp");
%>
<h1>Redirect 실습</h1>

</body>
</html>