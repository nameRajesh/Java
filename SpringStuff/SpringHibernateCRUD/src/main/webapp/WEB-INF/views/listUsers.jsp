<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Users</title>
</head>
<body>
	<center>
		<h1>Users List</h1>
		<h3>
			<a href="get">Add More User</a>
		</h3>
	</center>
	<c:if test="${!empty userList}">
		<table align="center" border="1">
			<tr style="background-color: gray;">
				<th>User ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>DOB</th>
				<th>Email</th>
				<th>Actions on Row</th>
			</tr>
			<c:forEach items="${userList}" var="user">
				<tr style="background-color: silver;">
					<td><c:out value="${user.userId}" /></td>
					<td><c:out value="${user.firstName}" /></td>
					<td><c:out value="${user.lastName}" /></td>
					<td><c:out value="${user.dob}" /></td>
					<td><c:out value="${user.email}" /></td>
					<td align="center">| <a href="edit?userId=${user.userId}">Edit</a>
						| <a href="delete?userId=${user.userId}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>
