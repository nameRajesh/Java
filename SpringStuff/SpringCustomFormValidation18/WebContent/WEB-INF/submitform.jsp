<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${mainMsg}</h1>
	<h1>Form Submission Practice</h1>
	<form:errors path="user.*" />
	<form action="/SpringCustomFormValidation18/formsubmit" method="post">
		<table>
			<tr>
				<td>First Name:</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><input type="text" name="lastName" /></td>
			</tr>
			<tr>
				<td>Mobile No:</td>
				<td><input type="text" name="mobileNo" /></td>
			</tr>
			<tr>
				<td>Date of Birth:</td>
				<td><input type="text" name="dob" /></td>
			</tr>
			<tr>
				<td>User Interest:</td>
				<td><input type="text" name="userInterest" /></td>
			</tr>
			<tr>
				<td>User Skills:</td>
				<td><select name="userSkills">
						<option value="java">java</option>
						<option value="spring">spring</option>
						<option value="hibernate">hibernate</option>
				</select></td>
			</tr>
			<!-- <tr>
				<td><input type="submit" name="Submit" /></td>
			</tr> -->
		</table>
		<table>
			<tr>
				<td>User Address:</td>
			</tr>
			<tr>
				<td>City:<input type="text" name="address.city" /></td>
				<td>Country:<input type="text" name="address.country" /></td>
				<td>Street:<input type="text" name="address.street" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>