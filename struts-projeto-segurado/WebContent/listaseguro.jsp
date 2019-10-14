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
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.10.2/css/all.css"
	integrity="sha384-rtJEYb85SiYWgfpCr0jn174XgJTn4rptSOQsMroFBPQSGLdOC5IbubP6lJ35qoM9"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<style>
a:hover {
	text-decoration: none;
	color: black;
	background-color: white;
}

a {
	color: white;
}
#divscroll {
	overflow: scroll;
}
</style>
<body>
	<div class="container-fluid" >
		<h1 align="center" class="mt-2">Lista Seguro</h1>

		<div class="row" >
			<div class="col-sm-12" >
				<table class="table table-bordered" >
					<thead class="thead-dark" >
						<tr>
							<th scope="col">Seguro</th>
							<th scope="col">Valor</th>
							<th scope="col">Alteração</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="seguroLista">
							<tr>
								<td><s:property value="seguro" /></td>
								<td><s:property value="valor" /></td>
								<td><s:a href="#" cssClass="btn btn-danger text-white">
										<i class="far fa-trash-alt text-white"></i>
									</s:a> <s:a href="#" cssClass="btn btn-danger text-white">
										<i class="fas fa-pencil-alt text-white"></i>
									</s:a></td>
							</tr>
						</s:iterator>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>