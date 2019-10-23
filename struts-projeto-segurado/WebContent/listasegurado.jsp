<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

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

</style>
<body>
	<div class="container-fluid">
		<h1 align="center">Lista Segurado</h1>

		<div class="row">
			<div class="col-sm-12">
				<table class="table table-bordered">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">NOME</th>
							<th scope="col">CPF</th>
							<th scope="col">RG</th>
							<th scope="col">SEXO</th>
							<th scope="col">CORRENTISTA</th>
							<th scope="col">DATA DE NASCIMENTO</th>
							<th scope="col">DIA VISITA</th>
							<th scope="col">DATA DE CADASTRO</th>
							<th scope="col">DATA DE ALTERAÇÃO</th>
							<th scope="col">ALTERAÇÃO</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="seguradoLista">
							<tr>
								<td><s:property value="id" /></td>
								<td><s:property value="nome" /></td>
								<td><s:property value="cpf" /></td>
								<td><s:property value="rg" /></td>
								<td><s:property value="sexo" /></td>
								<td><s:property value="correntista" /></td>
								<td><s:property value="data_nasc" /></td>
								<td><s:property value="diasVisita" /></td>
								<td><s:date name="DataCadastro" format="dd-MM-yyyy HH:mm:ss"/></td>
								<td><s:date name="dataDeAlteracao" format="dd-MM-yyyy HH:mm:ss" /></td>

								<s:url action="deleta-segurado" var="del">
									<s:param name="id" value="id"></s:param>
								</s:url>

								<s:url action="carrega-segurado" var="alt">
									<s:param name="id" value="id"></s:param>
								</s:url>


								<td><a href="<s:property value="del"/>"
									class="btn btn-danger text-white"><i
										class="far fa-trash-alt text-white"></i></a> 
								<a href="<s:property value="alt"/>"
									Class="btn btn-warning text-white"><i
										class="fas fa-pencil-alt text-white"></i></a></td>

							</tr>
						</s:iterator>


					</tbody>
				</table>
			</div>
		</div>
	</div>


</body>
</html>