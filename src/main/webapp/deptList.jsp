<%@page import="com.hybrid.domain.Dept"%>
<%@page import="java.util.List"%>
<%@page import="com.hybrid.mapper.DeptMapper"%>
<%@page import="com.hybrid.fx.MainApplication"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	

	DeptMapper mapper = MainApplication.ctx.getBean(DeptMapper.class);
 	
	List<Dept> depts = mapper.readAll();
	
	for (Dept dept : depts) {
		System.out.println(dept.getDeptno() + " " + dept.getDName() + " " + dept.getLoc());
		
		out.println(dept.getDeptno() + " " + dept.getDName() + " " + dept.getLoc()+ "<br>");
		
	}
	

%>
</body>
</html>