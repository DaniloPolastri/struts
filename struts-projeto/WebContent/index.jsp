<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
	<h1>Bem-vindo Struts 2!</h1>

	<!-- TAG URL SEM PARAMETRO -->
	<p>
		<a href="<s:url action='hello'/>">Hello World</a>
	</p>

	<!-- TAG URL COM PARAMETRO -->
	<s:url action="hello" var="helloLink">
		<s:param name="userName">Danilo Polastri</s:param>
	</s:url>

	<p>
		<a href="${helloLink}">Hello Danilo Polastri</a>
	</p>

	<!-- FORM -->
	<p>Obtenha seu próprio olá pessoal preenchendo e enviando este
		Formato.</p>

	<s:form action="hello">
		<s:textfield name="userName" label="Seu nome" />
		<s:submit value="Submit" />
	</s:form>

</body>
</html>