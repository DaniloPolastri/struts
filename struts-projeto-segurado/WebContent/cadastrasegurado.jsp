<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="s" uri="/struts-tags"%>
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
			<s:form action="cadastra-segurado.action" cssClass="form-horizontal" style="margin-left: 70px">
				<div class="form-row">
					<div class="mx-auto">
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="Nome" name="nome" key="label.nome" size="20" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="CPF" name="cpf" key="label.cpf" size="20" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mx-auto"
								placeholder="RG" name="rg" key="label.rg"
								size="20" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mt-2 mx-auto"
								placeholder="Data de nascimento" name="data_nasc" key="label.datanasc" size="20" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="Sexo" name="sexo" key="label.sexo" size="20" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="Correntista" name="correntista" key="label.correntista" size="20" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="Dia de visita" name="diasVisita" key="label.diaVisita" size="20" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="Data de Alteração" name="dataDeAlteracao" key="label.dataAlter" size="20" />
						</div>
						<div class="form-group col-md-12 ">
							<s:textfield cssClass="form-control mb-2 mx-auto"
								placeholder="Dada de Cadastro" name="dataDeCadastro" key="label.dataCadastro" size="20" />
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