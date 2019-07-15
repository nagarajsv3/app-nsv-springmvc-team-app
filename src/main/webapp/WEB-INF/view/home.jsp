<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<title>TeamApp</title>
<header>TeamApp</header>
<body>
<h1>TeamApp</h1>
<p>
    Message from create team = ${message}<br/>
    Context Path is <c:out value="${pageContext.request.contextPath}" /><br/>
    <a href="${pageContext.request.contextPath}/team/add">Add Team</a><br/>
    <a href="${pageContext.request.contextPath}/team/list">Team List</a><br/>
</p>
</body>
</html>
