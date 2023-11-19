<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Cart</title>
</head>
<body>
<h4>Here is your cart:</h4>

<ul>
    <c:forEach var="meal" items="${personAttribute.mealList}">
        <li>${meal}</li>
    </c:forEach>
</ul>
</body>
</html>
