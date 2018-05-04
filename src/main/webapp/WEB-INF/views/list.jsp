<%--
  Created by IntelliJ IDEA.
  User: Chuck Norris
  Date: 2018-05-03
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>Imie</td>
        <td>Gatunek</td>
        <td>kup</td>
    </tr>
    <c:forEach items="${animals}" var="animal">
        <tr>
            <td>${animal.name}</td>
            <td>${animal.species}</td>
            <td>
                <form action="/store/remove/${animal.id}">
                    <input value="Buy :)" type="submit">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
