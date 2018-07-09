<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
<%!int i = 12;%>
</head>
<body>

	<h1>Hello JSP</h1>
	<br>
	<p>Learning JSP</p>

	<%
		String a = "Rajesh";
		out.println(a);
		
	%>
	<%=i %>
	<center>
	<%-- <jsp:include page="jsp.date" flash="true"></jsp:include> --%>
	
	<p>
	Today's date: <%= (new java.util.Date()).toLocaleString()%>
	</p>
	
	
	</center>

</body>
</html>