<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
	
<title>Students list</title>
</head>
<body>
	<center>
		<h1>Students Management</h1>	
	</center>
	
	<div class="container">

		<h3>Student List</h3>
		<a
							href="/Lab5-StudentManagement-SpringMVC/students/addStudent"
							class="btn btn-info btn-sm"> Add new student </a> 
		<hr>

		<!-- Add a search form -->


		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Department</th>
					<th>Country</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${Students}" var="tempStud">
					<tr>
						<td><c:out value="${tempStud.id}" /></td>
						<td><c:out value="${tempStud.name}" /></td>
						<td><c:out value="${tempStud.department}" /></td>
						<td><c:out value="${tempStud.country}" /></td>
						<td>
							<!-- Add "update" button/link --> <a
							href="/Lab5-StudentManagement-SpringMVC/students/updateStudent?id=${tempStud.id}"
							class="btn btn-info btn-sm"> Update </a> <!-- Add "delete" button/link -->
							<a href="/Lab5-StudentManagement-SpringMVC/students/delete?id=${tempStud.id}"
							class="btn btn-danger btn-sm"
							onclick="if (!(confirm('Are you sure you want to delete this student?'))) return false">
								Delete </a>

						</td>

					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>
	
	
</body>
</html>