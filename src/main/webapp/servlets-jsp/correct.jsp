<% String favoriteColor = null; %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>




<%-- this jsp will use jstl or jsp exressions to build style in this doc--%>
<html>
<head>
    <title>Correct</title>
    <%@ include file="/partials/links.jsp" %>
<%--    <%@ include file="/partials/error.jsp" %>--%>
    <style>
        body {
            background-color: greenyellow;
        }
    </style>
</head>
<body>
    <h1 class="p-3">Correct</h1>
    <h4 class="p-2">${userNumber}</h4>
    <%@ include file="/partials/scripts.jsp" %>
</body>
</html>
