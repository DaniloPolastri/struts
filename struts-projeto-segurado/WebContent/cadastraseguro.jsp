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
<meta charset="ISO-8859-1">
<title>Cadastra Seguro</title>
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
</style>

<body>
	<div class="card mx-auto mt-5" style="width: 30rem;">
		<div class="card-body">
			<h2 class="card-title text-center">Cadastra Seguro</h2>
			<div class="dropdown-divider"></div>
			<s:form action="cadastra-seguro.action" cssClass="form-horizontal" style="margin-left: 70px">
				<div class="form-row">
					<div class="mx-auto">
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="Seguro" name="seguro" key="label.seguro" size="20" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mx-auto"
								placeholder="Valor seguro" name="valor" key="label.valor"
								size="20" />
						</div>
					</div>
				</div>
				<div>
					<s:submit cssClass="btn btn-secondary mt-3" method="execute"
						key="label.cadastra" align="center" />
				</div>
			</s:form>
		</div>
	</div>
</body>
</html>