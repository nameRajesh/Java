<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h3><%=request.getAttribute("Message")%></h3>
	<img src="displayServlet?id=1" height="150px" width="150px"
		alt="ProfilePic">
</body>
</html>