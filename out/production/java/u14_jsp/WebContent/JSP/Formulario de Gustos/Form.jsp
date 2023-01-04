<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Formulario</title>
</head>

<body>

<c:if test="${!empty param.nombre}"> <jsp:forward page="Resultados.jsp"></jsp:forward> </c:if>
	
	<form method="post" action="Form.jsp">
		<h3>Mis Datos</h3>
		Nombre: <input type="text" name="nombre">
		<br><br>
		Color Favorito: <br>
		<input type="radio" value="Rojo" name="colores"> Rojo <br>
		<input type="radio" value="Azul" name="colores"> Azul <br>
		<input type="radio" value="Verde" name="colores"> Verde <br>
		<br>
		Aficiones: <br>
		<input type="checkbox" value="Lectura" name="aficiones"> Lectura <br>
		<input type="checkbox" value="Cine" name="aficiones"> Cine <br>
		<input type="checkbox" value="Musica" name="aficiones"> Musica <br>
		<input type="checkbox" value="Deporte" name="aficiones"> Deporte <br>
		<input type="checkbox" value="Juegos" name="aficiones"> Juegos <br>
		<br><br>
		<input type="submit" value="Enviar">
	</form>
	
	
	
</body>

</html>