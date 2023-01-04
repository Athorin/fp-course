<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!--  IMPORTAMOS LAS LIBRERIAS DE ACCIONES  -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<%@ include file="Cabecera.html" %>
<body>
	<h3>Scriptlet</h3>
	<% String name = request.getParameter("nombre"); %>
	<% String saludo = "Hola " + name; %>
	
	<%-- Muestra el contenido de la variable --%>
	<%=  saludo %>
	
	<h3>Acciones y Lenguaje EL</h3>
	
	<!--  USAMOS ACCIONES Y DENTRO DE ELLAS LENGUAJE EL -->
	<c:if test="${!empty param.nombre }">
		Hola ${param.nombre}
	</c:if>
	

</body>
</html>