<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Baja de Usuario en BD</title>
</head>
<body>

	<h3>Formulario de Baja para Usuario</h3>
	
	<c:choose>
		<c:when test="${!empty param.usuario }">
		
					
			<sql:update dataSource="jdbc/BDUsuarios" var="numAfectados">
				DELETE FROM usuarios WHERE nombre = (?)
				<sql:param value="${param.usuario }"/>
			</sql:update>
			
			<c:choose>
				<c:when test="${numAfectados > 0 }">
					<p>Usuario dado de baja</p>
				</c:when>	
				<c:otherwise>
					<p>Usuario NO encontrado</p>
				</c:otherwise>
			</c:choose>
			
	
			
		
		</c:when>
		
		<c:otherwise>
			<table>
				<form action="Baja.jsp" method="post">
					<tr><th>Usuario</th><td><input type="text" name="usuario"></td></tr>
					<tr><td><br></td></tr>
					<tr><td><input type="submit" value="Enviar"></td><td><input type="reset" value="Reset"></td></tr>
				</form>
			</table>
		</c:otherwise>
		
	</c:choose>
	
</body>
</html>