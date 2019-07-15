<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<title>TeamApp</title>
<header>TeamApp-AddTeam</header>
<body>
<h1>TeamApp-Add Team</h1>
<form:form commandName="team" method="post" action="${pageContext.request.contextPath}/team/create">
    <table>
        <tbody>
        <tr>
            <td>Name</td>
            <td><form:input path="name"></form:input></td>
        </tr>
        <tr>
            <td>Rating</td>
            <td><form:input path="rating"></form:input></td>
        </tr>
        </tbody>
    </table>
    <<input type="submit" name="Add Team" id="Add Team">
</form:form>

<a href="${pageContext.request.contextPath}/">Go Back to TeamApp Home Page</a>
</body>

</html>
