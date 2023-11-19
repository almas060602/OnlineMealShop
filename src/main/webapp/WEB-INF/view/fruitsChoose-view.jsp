<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@elvariable id="mealListAttribute" type="Project1.DataBase.Person"--%>
<html>
<head>
    <title>Fruits</title>
</head>
<body>
<h2>Choose the fruits you wish</h2>
<form:form action="showCartMethod" modelAttribute="mealListAttribute">
    Apple <form:checkbox path="mealList" value="apple"/><br><br>
    Banana <form:checkbox path="mealList" value="banana"/><br><br>
    Orange <form:checkbox path="mealList" value="orange"/><br><br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
