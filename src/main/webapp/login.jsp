<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <%@ include file="partials/links.jsp" %>
    <%@ include file="partials/error.jsp" %>
</head>
<body class="m-2">
<%--<form>--%>
<%--    <label for="fname">First name:</label><br>--%>
<%--    <input type="text" id="fname" name="fname"><br>--%>
<%--    <label for="lname">Last name:</label><br>--%>
<%--    <input type="text" id="lname" name="lname">--%>
<%--</form>--%>

<form action="LoginServlet" class="p-2"  method="post">
    <div class="form-group">
        <label for="uname">Username</label>
        <input type="text" name="uname" id="uname" class="form-control mt-2 mb-1 w-25" aria-describedby="emailHelp" placeholder="Enter username">
    </div>
    <div class="form-group mt-4">
        <label for="pword">Password</label>
        <input type="text" name="pword" id="pword" class="form-control my-2 w-25" placeholder="Password">
        <small id="emailHelp" class="form-text text-muted">We'll never share your password with anyone.</small>
    </div>
<%--    <div class="form-check">--%>
<%--        <input type="checkbox" class="form-check-input" id="exampleCheck1">--%>
<%--        <label class="form-check-label" for="exampleCheck1">Check me out</label>--%>
<%--    </div>--%>
    <button type="submit" class="btn btn-primary mt-3">Submit</button>
</form>

    <%@ include file="partials/scripts.jsp" %>
</body>
</html>
