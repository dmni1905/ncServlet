<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>INFO</title>
</head>
<body>
    <jsp:useBean id="user" class="com.netcracker.model.User" scope="application"/>
    Пользователь: <%= user.getLogin()%><br>
    Email: <%= user.getEmail()%><br>
</body>
</html>