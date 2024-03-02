<%@ page language="java" contentType="text/html; charset=UTF-8"
        	pageEncoding="UTF-8"%>
    <%@page import="java.util.Date" %>
    <%@page import="java.net.InetAddress" %>
<!DOCTYPE html>
<html>
<head>
  <title>My JSP Page</title>
  <meta charset="UTF-8">
</head>
<body>
  <p>Your machine name is:  <%= System.getProperty("user.name") %></p>
  <p>Nous sommes le <%out.println(new Date()); %></p>
  <p>Le nom de votre machine: <%out.println(System.getProperty("user.name")); %></p>
  <p>Votre adresse Ip est: <% out.println(InetAddress.getLocalHost().getHostAddress()); %></p>
  <p>Server name:  <%= request.getServerName() %></p>
</body>
</html>
