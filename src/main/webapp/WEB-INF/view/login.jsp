<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: JSMBABA
  Date: 7/18/2019
  Time: 10:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<c:url var="loginVal" value="/login" />
<form method="post" action="${loginVal}">
    <table>
        <tr>
            <td>UserName</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="hidden" value="{$_csrf.token}" name="{$_csrf.parameterName}"></td>
            <td><input type="submit" value="Login"></td>
        </tr>
    </table>
</form>

</body>
</html>
