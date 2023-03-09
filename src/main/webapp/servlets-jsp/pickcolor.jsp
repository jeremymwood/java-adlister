<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
    <%@ include file="/partials/links.jsp" %>
<%--    <%@ include file="/partials/error.jsp" %>--%>
</head>
<body>
    <h1 class="p-3">Pick Color</h1>
    <form class="p-3" method="post">
        <div class="form-group">
            <label for="favoriteColor">Favorite Color</label>
            <input type="text" name="favoriteColor" id="favoriteColor" class="form-control mt-2 mb-1" placeholder="Enter your favorite color">
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
