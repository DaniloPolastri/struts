<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>

<style>
.box-menu {
	height: 100vh;
	background-color: #000000;
}

.box-header {
	width: 100vh;
	height: 50px;
	background-color: #000000;
}
</style>
<body>
	<div class="row">
		<div class="col-sm-2 box-menu">
			<p class="text-white text-center mt-2"><s:property value="username" /></p>
			<div class="dropdown-divider"></div>
			
			<div>
				<tiles:insertAttribute name="menu"/>
		
			</div>
		</div>
		<div class="col-sm-10 box-header ">
			<div class="box-header">
				<h3 class="text-white ">DASHBOARD</h3>
				<div class="mt-3">
					<tiles:insertAttribute name="body" />
				</div>
			</div>
		</div>
	</div>
</body>
</html>