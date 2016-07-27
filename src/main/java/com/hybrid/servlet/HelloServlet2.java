package com.hybrid.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello2")
public class HelloServlet2 extends HttpServlet {
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      System.out.println("#######################");
      System.out.println("HelloServlet.doGet()...");
      System.out.println("#######################");
      
      response.setContentType("text/html; charset=utf-8");
      PrintWriter out = response.getWriter();
      
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>HelloServlet</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<header>");
      out.println("<nav>");
      out.println("<ul>");
      out.println("<li><a href=\"http://localhost:8080/deptList.jsp\">deptList</a></li>");
      out.println("<li><a href=\"http://localhost:8080/directive.jsp\">directive</a></li>");
      out.println("<li><a href=\"http://localhost:8080/Hello.jsp\">Hello(jsp)</a></li>");
      out.println("<li><a href=\"http://localhost:8080/Hello.html\">Hello(html)</a></li>");
      out.println("</ul>");
      out.println("</nav>");
      out.println("</header>");
      out.println("</body>");
      out.println("</html>");
      
   }
   
}