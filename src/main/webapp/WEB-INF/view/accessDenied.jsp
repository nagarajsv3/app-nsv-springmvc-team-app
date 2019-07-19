
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>AccessDenied</title>
</head>
<body>
<c:url value="/login" var="login" />
<h2>You Dont have access to the app</h2>
<a href="${login}">Go back to Login</a>
</body>
</html>
