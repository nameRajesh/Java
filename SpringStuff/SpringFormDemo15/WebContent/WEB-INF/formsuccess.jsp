<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${mainMsg}</h1>
	<h3>Congratulation!!!You have successfully submitted the form.</h3>
	<h2>User Name</h2>
	<table>
		<tr>
			<td>First Name:</td>
			<td>${user.firstName}</td>
		</tr>
		<tr>
			<td>Last Name:</td>
			<td>${user.lastName}</td>
		</tr>
		<tr>
			<td>Mobile No:</td>
			<td>${user.mobileNo}</td>
		</tr>
		<tr>
			<td>Date of Birth:</td>
			<td>${user.dob}</td>
		</tr>
		<tr>
			<td>User Skills:</td>
			<td>${user.userSkills}</td>
		</tr>
		<tr>
			<td>User Address:</td>
			<td>city:${user.address.city} country: ${user.address.country}
				street:${user.address.street}</td>
		</tr>
	</table>
</body>
</html>