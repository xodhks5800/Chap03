<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>HHeelllloo JJSSPP</h1>
 현재시간: <%=new Date() %><br>
 현재시간: <%=new Date() %><br>
 <br>
	name = <%= request.getParameter("name") %><br>
	addr = <%= request.getParameter("addr")%><br>
	HTTP METHOD = <%= request.getMethod() %><br>
<br>	
<h1>JSP는 호출시에 컴파일 된다.</h1> 
<br>	
</body>
</html>