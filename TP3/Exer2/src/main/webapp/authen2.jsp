<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="p1.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean id="u" class="p1.user" scope="session"/>
		<jsp:setProperty property="mail" name="u" param="mail"/>
		<jsp:setProperty property="password" name="u" param="password"/>
		<jsp:forward page="affich2.jsp"/>
</body>
</html>