<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>

<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%--%>
<%--    String redirectURL = "login.jsp";--%>
<%--    response.sendRedirect(redirectURL);--%>
<%--%>--%>

<html>
<head>
    <title>Login Page</title>
    <%
        String errorMessage = (String) session.getAttribute("errorMessage");
        if (null !=errorMessage) { %>
    <h4> <%=errorMessage %></h4>
    <%}
    %>
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
    <input type="submit" value="submit">
</form>

<%--This form should submit a POST request to /login.jsp--%>

<%--Inside of login.jsp write some code to check the submmitted values. If the username submitted is "admin", and the password is "password", redirect the user to the profile page; otherwise, redirect back to the login form.--%>

<%--We will give our site's login page much more robust functionality in future lessons.--%>

<%--Build A Website Template--%>

<%--Create a directory inside webapp named partials--%>

<%--Create separate files for the common elements of your website that appear on every page inside the partials directory--%>

<%--For example, you might have a file named navbar.jsp that has your site's navbar, or a file named head.jsp that contains all the link elements to the the CSS stylesheets your site needs.--%>

<%--Include these files on your other pages, and any new files you create--%>

</body>
</html>
