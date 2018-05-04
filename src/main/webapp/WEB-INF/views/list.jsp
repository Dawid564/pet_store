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
    <select id="food" name="fooditems">
        <table>
            <c:forEach items="${foods}" var="food">
            <tr>
                <td>${food.key}</td>
                <td>${food.value}</td>
            </tr>
            </c:forEach>
        </table>
    </select>
</table>
</body>
</html>
