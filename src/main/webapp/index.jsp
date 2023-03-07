<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1; %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>The current count is <%= counter %>.</h1>

View the page source!
<= 2 * 3 %>

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

<%--web app: living content, interactive, more functionality--%>
<%--web page: static content, will not depend on java to execute html--%>

</body>
</html>
