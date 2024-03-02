<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@page import="web.ImcModel" %>
    <% ImcModel model = (ImcModel) request.getAttribute("ImcModel");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div>
			<form action="calculeIMC.do" method="post">
				Poids :<input type="text" name="poids" value="<%=model.getPoids()%>"/>
				Taille :<input type="text" name="taille" value="<%=model.getTaille()%>"/>
			</form>
		</div>

</body>
</html>