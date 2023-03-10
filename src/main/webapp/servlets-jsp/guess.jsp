<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick a number</title>
    <%@ include file="/partials/links.jsp" %>
<%--    <%@ include file="/partials/error.jsp" %>--%>
</head>
<body>
    <h1 class="p-3">Pick a number</h1>
    <form class="p-3" method="post">
        <div class="form-group">
            <label for="userNumber">Pick a number between 1 and 3</label>
            <input type="text" name="userNumber" id="userNumber" class="form-control mt-2 mb-1" placeholder="1 - 3">
        </div>

        <div class="form-group row">
            <div class="col-sm-10">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </div>
    </form>

<%@ include file="/partials/scripts.jsp" %>

</body>
</html>
