<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultados</title>
</head>
<body>
	Hola: ${param.nombre } <br><br>
	<c:choose>
		<c:when test="${empty param.colores }">No has elegido colores.</c:when>
		<c:otherwise>Tu color favorito es: ${param.colores } </c:otherwise>
	</c:choose>
	<br><br>
	<c:choose>
		<c:when test="${empty paramValues.aficiones }">No has elegido aficiones.<br></c:when>
		<c:otherwise>Tus aficiones son:  <ul>
			<c:forEach items="${paramValues.aficiones }" var="valor"><li> ${valor } </li></c:forEach>  <br>
		</ul> </c:otherwise>
		
	</c:choose>
	
</body>
</html>