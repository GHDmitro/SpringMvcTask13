<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Group</title>
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">--%>
    <%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>--%>
</head>
<body>
<div class="container">
    <form action="/userAdd" method="post">
        <h3>New contact</h3>
        <%--<c:when test="${Users ne null}">--%>
            <c:forEach items="${users}" var="user">
                <option value="${user.name}">${user.age}</option>
            </c:forEach>
        <%--</c:when>--%>

        Name of user : <input type="text" name="user"> <br>
        Age of user : <input type="text" name="age"> <br>
        <input type="submit" name="send">
    </form>
</div>
</body>
</html>