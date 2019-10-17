<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Welcome</title>
</head>

<body>
	<div>
		<h2 class="text-center">
			BEM-VINDO
			<s:property value="username" />
		</h2>
	</div>
	<div>
		<p class="text-center size-100">Aplicação feita para estudo de
			Struts</p>
	</div>


</body>
</html>
