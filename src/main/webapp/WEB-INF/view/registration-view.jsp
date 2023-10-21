<%--
  Created by IntelliJ IDEA.
  User: UserPS
  Date: 15.10.2023
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h2>Registration</h2>
<form action="registrationPage" method="get">

    <label for="name">Name:</label>
    <input type="text" id="name" name="name" placeholder="Enter your name.."><br><br>

    <label for="lastName">LastName:</label>
    <input type="text" id="lastName" name="lastName" placeholder="Enter your surname.."><br><br>


    <label for="login">Login:</label>
    <input type="text" id="login" name="login" placeholder="Enter your login.."><br><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" placeholder="Write new password"><br><br>

    <label for="password">Password:</label>
    <input type="password" id="passwordAgain" name="passwordAgain" placeholder="Rewrite your password"><br><br>

    <input type="submit" value="Submit">

</form>
</body>
</html>
