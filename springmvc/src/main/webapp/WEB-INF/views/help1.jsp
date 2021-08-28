<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!-- This way you can use JSP Expression language to easily print request objects without
actually invoking req obj or declaring POJOs.
Just insert the attribute name within ${} = ${<name>} -->

<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h1><%=request.getAttribute("name")%></h1> --%>
<h1>${name}</h1>
</body>
</html>