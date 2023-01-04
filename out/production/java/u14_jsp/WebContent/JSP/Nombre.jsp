<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Nombre y Apellidos</title>
</head>

<body>	
	<c:set var="nombreApellidos" value="Juan QueHostia Sehadao"></c:set>
	<c:set var="nombreApellidos2" value="Jose Selapegao Bien"></c:set>
	<table border="1">
		<tr> <th>Nombre</th> <th>1er Apellido</th> <th>2º Apellido</th> </tr>
		<!--  SE RECORRE TODO EL STRING Y OBTIENE CADA UNO DE LOS DATOS ENTRE LA SEPARACION DADA -->
		<tr><c:forTokens items="${nombreApellidos }" delims=" " var="item">
				<td>${fn:toUpperCase(item)}</td>
		</c:forTokens></tr>
		<!--  CON SPLIT DEVUELVE UN ARRAY DE STRINGS Y LO RECORRO CON FOR EACH -->
		<tr>${fn:split(nombreApellidos2)}<td></td>
		</tr>
	</table>
	
</body>
</html>