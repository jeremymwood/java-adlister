<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Ads DAO</title>
</head>
<body>
    <h4>Ads</h4>

    <c:forEach var="ad" items="${ads}">
            <p>${ad.title}</p>
            <p>(Post ID: ${ad.id}, User ID: ${ad.userId})</p>
            <p>${ad.description}</p>
    </c:forEach>


<%--    Right-click project -> properties -> Project Facets -> Runtimes -> checked "Apache Tomcat v9.0" -> Apply -> finish.--%>

<%--    Server tab -> Right-click "Tomcat v9.0..." -> properties -> switch location -> Choose "Use tomcat installation" on "Server locations" panel.--%>

</body>
</html>
