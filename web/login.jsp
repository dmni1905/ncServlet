<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <style type="text/css">
        .paddingBtm {
            padding-bottom: 12px;
        }
    </style>
</head>
<body>

<div style="text-align: center;">
    <h2>Login Example</h2>
    <form id="loginFormId" name="loginForm" method="post" action="login">
        <div id="usernameDiv" class="paddingBtm">
            <span id="user">Username: </span><input type="text" name="username" />
        </div>
        <div id="passwordDiv" class="paddingBtm">
            <span id="pass">Password: </span><input type="password" name="password" />
        </div>
        <div id="loginBtn">
            <input id="btn" type="submit" value="Login" />
        </div>
    </form>
</div>
<div>
    <% if (request.getAttribute("error_msg") != null) {%>
        <p color="red">Error: <%=request.getAttribute("error_msg")%> </p>
    <%}%>
</div>
</body>
</html>