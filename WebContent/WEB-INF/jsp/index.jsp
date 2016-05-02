<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página de Inicio</title>
</head>
<body>
Hola ${msg} ^^!!!

<table border="1">
	<tr>
		<td>
			<select onchange="alert(this.value);">
				<c:forEach items="${paises}" var="pais">
					<option value="${pais.codigo}">${pais.descripcion}</option>
				</c:forEach>
			</select>
		</td>
		<td>
			<form:select path="paises" itemValue="Descripcion" itemLabel="Codigo"></form:select>
		</td>
	</tr>
</table>

</body>
</html>