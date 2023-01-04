<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" errorPage="Error.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calcular Precio</title>
</head>
<body>
	<h2>Calcular Precio Final (21%)</h2>
	<c:choose>
		<c:when test="${!empty param.precio }">
			
				<c:set var="precioFinal" value="${param.precio * 0.21 + param.precio }"></c:set>
				El Precio con IVA es: ${precioFinal }

		</c:when>
		<c:otherwise>
			<form action="CalcularPrecioFinal.jsp" method="post">
				<p>Precio</p> <input type="text" name="precio">
					<input type="submit" value="Enviar">
			</form>
		</c:otherwise>
	</c:choose>

</body>
</html>