<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--gilly solution--%>
<%--<%--%>
<%--    String uname = request.getParameter("uname");--%>
<%--    String pword = request.getParameter("pword");--%>

<%--        if(null!=uname && uname!="" && pword!=null && pword!=""){--%>
<%--//if(uname.equals("admin") && pword.equals("password")){--%>
<%--//HttpSession  session=request.getSession(true);--%>
<%--session.setAttribute("uname", uname);--%>
<%--session.setAttribute("pword", pword);--%>
<%--//            response.getWriter().append("Login SucessFully");--%>
<%--response.sendRedirect("profile.jsp"); //error--%>
<%--} else{--%>
<%--//response.sendRedirect("login.jsp"); //error--%>
<%--//HttpSession  session=request.getSession(true);--%>
<%--session.setAttribute("errorMessage", "Login Failed");--%>
<%--//refresh examples reset to false--%>
<%--}--%>

<%--%>--%>
<html>
<head>
    <title>Login Page</title>
    <%@ include file="partials/links.jsp" %>
    <%@ include file="partials/error.jsp" %>
</head>
<body class="m-2">
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
