<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World!</title>
</head>
<body>
	<h2>
		<s:property value="messageStore.message" />
	</h2>
	<p>
		Hello
		<s:property value="helloCount" />
		Vezes!
	</p>
	<p>
		<s:property value="messageStore" />
	</p>
	<p>
		<a href="<s:url action='index'/>">Home </a>
	</p>
	<p>
		<a href="register.jsp">Registar</a>
	</p>
</body>
</html>