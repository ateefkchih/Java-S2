<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean id="u" class="p1.user" scope="session"/>
		<h1>Votre Mail est: <jsp:getProperty name="u" property="mail"/></h1>
		<h1>Votre Password est: <jsp:getProperty name="u" property="password"/></h1>
</body>
</html>