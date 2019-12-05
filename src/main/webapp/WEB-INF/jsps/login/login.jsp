<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login</title>
</head>
<body>
<h2>Login</h2>
    <form action="login" method="post">
           <pre>
            User Name:<input type="text" name="email">
            Password:<input type="password" name="password">
            <input type="submit" value="Login">
               ${msg}
            </pre>

    </form>


</body>
</html>
