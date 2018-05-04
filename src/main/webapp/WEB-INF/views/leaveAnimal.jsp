<%--
  Created by IntelliJ IDEA.
  User: Chuck Norris
  Date: 2018-05-03
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="/store/leave" modelAttribute="pet">
    <table>
        <tr>
            <td><form:label path="name">Pet Name</form:label> </td>
            <td><form:input path="name"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="species">Species</form:label> </td>
            <td><form:input path="species"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="price">Price</form:label> </td>
            <td><form:input path="price"></form:input></td>
        </tr>
        <tr>
            <td><form:label path="color">Color</form:label> </td>
            <td><form:input path="color"></form:input></td>
        </tr>
        <tr>
            <input type="submit" value="Oddaj zwierzaka">
        </tr>
    </table>
</form:form>
</body>
</html>
