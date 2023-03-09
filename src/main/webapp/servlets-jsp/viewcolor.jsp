<% String favoriteColor = null; %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Color</title>
    <%@ include file="/partials/links.jsp" %>
<%--    <%@ include file="/partials/error.jsp" %>--%>
    <style>
        body {
            background-color: ${favoriteColor};
        }
    </style>
</head>
<body>
    <h1 class="p-3">View Color</h1>
    <h4 class="p-2">${favoriteColor}</h4>
    <%@ include file="/partials/scripts.jsp" %>
</body>
</html>
