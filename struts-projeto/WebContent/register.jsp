<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Register</title>
<head />
<body>
	<h3>Registre-se para um prêmio preenchendo este formulário.</h3>


	<s:form action="register">
		<s:textfield name="personBean.firstName" label="Primeiro nome" />
		<s:textfield name="personBean.lastName" label="Ultimo nome" />
		<s:textfield name="personBean.email" label="Email" />
		<s:textfield name="personBean.age" label="Idade" />
		<s:submit />
	</s:form>
</body>
<s:head /> 
</html>