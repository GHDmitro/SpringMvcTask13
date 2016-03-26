<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Group</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
    <style>
        .container{
            align-content: center;
            background: antiquewhite center;
            
        }
    </style>
</head>
<body>
<div class="container">
    <form role="form" enctype="multipart/form-data" class="form-horizontal" action="/userAdd" method="post">
        <h3>New contact</h3>
        Name of user : <input type="text" name="name"> <br>
        Age of user : <input type="text" name="age"> <br>
        <input type="submit" name="send"><br>
        <%--<c:when test="${Users ne null}">--%>
            <c:forEach items="${users}" var="user">
                <option value="${user.id}">Name: ${user.name} , User age: ${user.age}</option>
            </c:forEach>
        <%--&lt;%&ndash;</c:when>&ndash;%&gt;--%>


    </form>
</div>
</body>
</html>