<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSP with JSTL</title>
</head>
<body>
<c:url var="url" value="/some/path" />
<a href="${url}">Go to path</a>
</body>
</html>
