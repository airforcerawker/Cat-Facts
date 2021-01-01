<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri ="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<title>Ninjas</title>
</head>
<body>
	<div class="container">
		<h1>Edit Ninja Info</h1>
			<div class="col-sm-4">
				<form:form action="/ninjas/${singleNinja.id}/update" method="post" modelAttribute="singleNinja">
					<div class="form-group">
						<label>Name:</label>
						<form:input path="name" class="form-control"/>
						<form:errors path="name" class="text-danger"/>
					</div>
					<div class="form-group">
						<label>Hometown:</label>
						<input type="text" name="hometown" class="form-control"/>
						<form:errors path="hometown" class="text-danger"/>
					</div>
					<div class="form-group">
						<label>Level:</label>
						<select name="level" class="form-control">
							<option>Apprentice</option>
							<option>Master</option>
							<option>Junior</option>
							<option>Senior</option>
						</select>
					</div>
					<input type="submit" value="Edit Ninja" class="btn btn-secondary mt-2">
				</form:form>
				<a href="/" class="btn btn-success mt-5">Home</a>
			</div>
		</div>
	</div>
</body>
</html>