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
<title>Login</title>

<style>
.medio {
	width: 50%;
}
</style>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="mx-auto col-sm-5" style="margin-top: 200px;">
				<div class="card shadow p-3 mb-5 rounded" style="max-width: 540px;">
					<div class="card-body">
						<div class="card-title text-center">
							<p style="font-size: 35px">Login</p>
						</div>
						<s:actionerror />
						<s:form class="form-signin" action="login.action" method="post">
							<div class="form-label-group mt-3">
								<s:textfield class="form-control rounded-pill"
									placeholder="Nome" name="username" key="label.username"
									size="20" />
							</div>
							<div class="form-label-group mt-3">
								<s:password class="form-control rounded-pill"
									placeholder="Senha" name="password" key="label.password"
									size="20" />
							</div>
							<div class="text-center mt-3">
								<s:submit class="btn btn-lg btn-secondary rounded-pill medio"
									method="execute" key="label.login" align="center" />
							</div>
						</s:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>