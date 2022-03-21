<%@ page import="com.hcl.model2.User" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

       User u=(User) request.getAttribute("abc");
        out.println("Welcome "+u.getUsername());

%>

</body>
</html>