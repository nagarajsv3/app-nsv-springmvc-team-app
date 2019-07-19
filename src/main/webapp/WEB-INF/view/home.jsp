<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<title>TeamApp</title>
<header>TeamApp</header>
<body>
<h1>Welcome <security:authentication property="name"/> to TeamApp</h1>
<c:url var="logoutvar" value="/logout"/>
<h3><a href="${logoutvar}">Logout</a></h3>
<p>
    Message from create team = ${message}<br/>
    Context Path is <c:out value="${pageContext.request.contextPath}"/><br/>
    <security:authorize access="hasRole('ROLE_ADMIN')">
        <a href="${pageContext.request.contextPath}/team/add">Add Team</a><br/>
    </security:authorize>
    <a href="${pageContext.request.contextPath}/team/list">Team List</a><br/>
</p>
</body>
</html>
