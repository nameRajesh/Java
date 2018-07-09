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
	<h1>Form Submission Practice</h1>
	<form action="/SpringFormDemo14/formsubmit" method="post">
		<p>
			First Name: <input type="text" name="firstName" />
		</p>
		<p>
			Last Name: <input type="text" name="lastName" />
		</p>
		<input type="submit" name="Submit" />
	</form>
</body>
</html>