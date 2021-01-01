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
		<h1>Info about <c:out value="${singleNinja.name}"/></h1>
			<div class="col-sm-4 mt-5">
				<label>Ninja ID:</label>
				<h4><c:out value="${singleNinja.id}"/></h4>
				<label>Ninja Name:</label>
				<h4><c:out value="${singleNinja.name}"/></h4>
				<label>Hometown:</label>
				<h4><c:out value="${singleNinja.hometown}"/></h4>
				<label>Level:</label>
				<h4><c:out value="${singleNinja.level}"/></h4>
			</div>
			<a href="/" class="btn btn-success mt-5">Home</a>
		</div>
	</div>
</body>
</html>