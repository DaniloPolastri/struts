<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List, br.com.ebix.action.SeguroAction"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="card mx-auto mt-5" style="width: 50rem;">
		<div class="card-body">
			<h2 class="card-title text-center">Cadastra Segurado</h2>
			<div class="dropdown-divider"></div>
			<s:form action="alterar-segurado" cssClass="form-horizontal"
				style="margin-left: 70px">
				<div class="form-row">
					<div class="mx-auto">
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="Nome" name="nome" key="label.nome" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="CPF" name="cpf" key="label.cpf" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mx-auto" placeholder="RG"
								name="rg" key="label.rg" size="20" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mt-2 mx-auto"
								placeholder="Data de nascimento" name="data_nasc"
								key="label.datanasc" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="Sexo" name="sexo" key="label.sexo" size="20" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="Correntista" name="correntista"
								key="label.correntista" />
						</div>
						
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="Dia de visita" name="diasVisita"
								key="label.diaVisita" size="50"/>
						</div>
					
							<s:hidden name="id" value="%{id}"/>
					</div>
				</div>
				<div>
					<s:submit cssClass="btn btn-secondary mt-3" method="update"
						key="label.cadastra" align="center" />
				</div>
			</s:form>
		</div>
	</div>
</body>
</html>