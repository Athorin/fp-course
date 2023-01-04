<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consultar Usuarios</title>
</head>
<body>
	<h3>Datos de Usuarios</h3>
	
	<sql:query var="datosUsuario" dataSource="jdbc/BDUsuarios">
		SELECT * FROM usuarios
	</sql:query>
	
	<table border="1">
		<tr>
			<th>Nombre</th><th>Contraseña</th><th>E-mail</th>
		</tr>
		<c:forEach items="${datosUsuario.rows }" var="usuario">
			<tr>
				<td>${usuario.nombre }</td><td>${usuario.password }</td><td>${usuario.email }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>