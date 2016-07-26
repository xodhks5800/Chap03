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
 현재시간: <%=new Date() %>
 현재시간: <%=new Date() %>
<h1>JSP는 호출시에 컴파일 된다.</h1> 

<%
for(int i=0; i<100; i++) {
	out.println("i = " + i + "<br>");
}
%>
</body>
</html>