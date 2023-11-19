<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Dear ${NameAttribute}, you are welcome to our online meal shop.</h2>
<p>Please, choose the meal you wish!</p>

<%--@elvariable id="personAttribute" type="Project1.DataBase.Person"--%>
<form:form action="cartViewMethod" modelAttribute="personAttribute">
    <h3>Fruits</h3><br>
    Apple <form:checkbox path="mealList" value="apple"/><br><br>
    Banana <form:checkbox path="mealList" value="banana"/><br><br>
    Orange <form:checkbox path="mealList" value="orange"/><br><br><br>
    <input type="submit" value="choose">
</form:form>

<br>

<%--@elvariable id="mealListAttribute" type="Project1.DataBase.Person"--%>
<form:form action="showCartMethod" modelAttribute="mealListAttribute">
    <input type="submit" value="Press to see your cart">
</form:form>


</body>
</html>
