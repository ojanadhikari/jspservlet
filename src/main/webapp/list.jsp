<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSP with JSTL</title>
</head>
<body>
<h2>Items List</h2>
<ul>
    <c:forEach var="item" items="${itemsList}">
        <li>${item}</li>
    </c:forEach>
</ul>
</body>
</html>
