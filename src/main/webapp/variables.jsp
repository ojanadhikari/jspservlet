<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSP with JSTL</title>
</head>
<body>
<c:set var="greeting" value="Hello, World!" />
<p>${greeting}</p>
</body>
</html>
