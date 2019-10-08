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
	<h1>Welcome To Struts 2!</h1>

	<!-- TAG URL SEM PARAMETRO -->
	<p>
		<a href="<s:url action='hello'/>">Hello World</a>
	</p>

	<!-- TAG URL COM PARAMETRO -->
	<s:url action="hello" var="helloLink">
		<s:param name="userName">Bruce Phillips</s:param>
	</s:url>

	<p>
		<a href="${helloLink}">Hello Bruce Phillips</a>
	</p>

	<!-- FORM -->
	<p>Get your own personal hello by filling out and submitting this
		form.</p>

	<s:form action="hello">
		<s:textfield name="userName" label="Your name" />
		<s:submit value="Submit" />
	</s:form>
	
</body>
</html>