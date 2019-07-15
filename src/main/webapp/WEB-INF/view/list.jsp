<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<title>TeamApp</title>
<header>TeamApp-List Teams</header>
<body>
<h1>TeamApp-List Teams</h1>

<form:form commandName="teams" method="post" action="${pageContext.request.contextPath}/list">
<table>
    <thead>
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Ranking</td>
        <td>Action</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${teams}" var="team">
        <tr>
            <td>${team.id}</td>
            <td>${team.name}</td>
            <td>${team.rating}</td>
            <td>
                <a href="${pageContext.request.contextPath}/team/edit/${team.id}">Edit</a><br/>
                <a href="${pageContext.request.contextPath}/team/delete?teamId=${team.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</form:form>
<a href="${pageContext.request.contextPath}/">Go Back to TeamApp Home Page</a>
</body>
</html>
