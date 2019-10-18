<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Insert title here</title>


</head>
<style>
a:hover {
	text-decoration: none !important;
	color: black !important;
	background-color: white !important;
}

a {
	text-decoration: none !important;
	color: white !important;
}
</style>

<body>
	<div>
		<s:a href="cadastra-segurado-tiles" cssClass="text-decoration-none">CADASTRA SEGURADO</s:a>
		<br>
	</div>

	<div class="dropdown-divider"></div>
	<s:a href="cadastra-seguro-tiles" cssClass="text-decoration-none">CADASTRA SEGURO</s:a>
	<br>
	<div class="dropdown-divider"></div>
	<s:a href="lista-segurado" cssClass="text-decoration-none">LISTA SEGURADO</s:a>
	<br>
	<div class="dropdown-divider"></div>
	<s:a href="lista-seguro" cssClass="text-decoration-none">LISTA SEGURO</s:a>
	<br>
</body>
</html>