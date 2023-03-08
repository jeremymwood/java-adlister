<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <%@ include file="partials/links.jsp" %>
    <%@ include file="partials/error.jsp" %>
</head>
<body>
    <form action="LoginServlet"  method="post" >
        Please enter your username
        <br>
        <input type="text" name="uname" id="uname" />
        <br>
        <br>
        Please enter your password
        <br>
        <input type="text" name="pword" id="pword" />
        <br>
        <br>
        <input type="submit" value="submit">
    </form>

    <%@ include file="partials/scripts.jsp" %>
</body>
</html>
