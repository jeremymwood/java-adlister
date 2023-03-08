<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Login Form</h3>
<%
    String profile_msg=(String)request.getAttribute("profile_msg");
    if(profile_msg!=null){
//        out.print(profile_msg);
        out.print("profile not null");
    }
    String login_msg=(String)request.getAttribute("login_msg");
    if(login_msg!=null){
//        out.print(login_msg);
        out.print("login not null");
    }
%>
<br/>
<form action="profile.jsp" method="post">
    Email:<input type="text" name="email"/><br/><br/>
    Password:<input type="password" name="password"/><br/><br/>
    <input type="submit" value="login"/>
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
