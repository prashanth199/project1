<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Create Customer</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<div class="card">
					<div class="card-header">Create Customer</div>
					<div class="card-body">
						<form:form
							action="${pageContext.request.contextPath }/customer/save"
							modelAttribute="customer"
							method="POST">
							<div class="form-group">
								<label for="firstName" class="form-label">First Name</label>
								<form:input path="firstName" cssClass="form-control" cssErrorClass="invalid-feedback" id="firstName"/>
							</div>
							<div class="form-group">
								<label for="lastName" class="form-label">Last Name</label>
								<form:input path="lastName" cssClass="form-control" cssErrorClass="invalid-feedback" id="lastName"/>
							</div>
							<div class="form-group">
								<label for="firstName" class="form-label">Email</label>
								<form:input path="email" cssClass="form-control" cssErrorClass="invalid-feedback" id="email"/>
							</div>
							<div class="mt-2">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>

						</form:form>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8"
	crossorigin="anonymous"></script>
</html>