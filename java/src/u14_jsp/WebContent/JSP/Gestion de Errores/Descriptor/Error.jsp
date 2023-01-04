<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Error Encontrado</h3>
	<table border="1">
		<tr><td>Tipo de Error</td> <td>${pageContext.exception }</td></tr>
		<tr><td>URL Origen</td> <td>${pageContext.errorData.requestURI }</td></tr>
		<tr><td>Traza del Error</td> <td>${pageContext.exception.stackTrace }</td></tr>
	</table>
</body>
</html>