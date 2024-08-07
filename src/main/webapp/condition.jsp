<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSP with JSTL</title>
</head>
<body>
<c:if test="${not empty itemsList}">
    <p>There are items in the list.</p>
</c:if>
<c:if test="${empty itemsList}">
    <p>The list is empty.</p>
</c:if>
</body>
</html>
