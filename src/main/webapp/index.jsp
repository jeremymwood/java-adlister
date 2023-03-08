<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<%--is the proper jsp workflow to develop the desired output in html first?
    and then construct the jsp with the desired logic?--%>
<%--should html be more of a prototyping environment and host static mark up?--%>
<%--can the same css and js work with the jsp?--%>
<%--separate repositories for the backend and front end.
    The back end provides the API that the front end uses.
    Keep these things completely separate.--%>

<c:if test="true">
    <h1>Variable names should be very descriptive</h1>
</c:if>
<c:if test="false">
    <h1>single letter variable names are good</h1>
</c:if>


</body>
</html>