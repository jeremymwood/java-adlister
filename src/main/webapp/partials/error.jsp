<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Error!!!</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1 class="error p-2">ERROR!!!!! ${errorMessage}</h1>--%>
<%--</body>--%>
<%--</html>--%>


<%
    String errorMessage = (String) session.getAttribute("errorMessage");
    if (null !=errorMessage) {
%>
<h4 class="error p-2"> <%=errorMessage %></h4>
<%
        session.removeAttribute("errorMessage");
    }
%>