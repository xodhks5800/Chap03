<%@page import="org.apache.catalina.connector.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>declaration.jsp</title>
</head>
<body>
<%! 

	int x = 99;

	int add(int a, int b) {
		return a + b;
	}

	int multiply(int a, int b){
		return a * b;
	}
%>
	<h1>10 * 20 = <%= multiply(10, 20) %></h1>
	<h1>10 + 20 = <%= add(10, 20) %></h1>
	<h1> x = <%= x %></h1>
	<h1>Port = <%=request.getRemotePort() %></h1>
</body>
</html>