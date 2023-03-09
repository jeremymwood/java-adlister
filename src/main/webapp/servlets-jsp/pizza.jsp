<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Pizza</title>
    <%@ include file="/partials/links.jsp" %>
<%--    <%@ include file="/partials/error.jsp" %>--%>
</head>
<body>
        <div class="row mt-4">
            <div class="col-md-6">
                <h1 class="p-3">Order Pizza</h1>
                <form class="p-3" method="post">
                    <div class="form-group">
                        <label for="crustSelection">Select Crust</label>
                        <select class="form-control" name="crustSelection" id="crustSelection">
                            <option>Regular</option>
                            <option>Thin</option>
                            <option>Pan</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Select Toppings</label>
                        <div class="form-check">
                            <input class="form-check-input" name="toppingSelection" type="checkbox" id="pepperoni" value="pepperoni">
                            <label class="form-check-label" for="pepperoni">
                                Pepperoni
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" name="toppingSelection" type="checkbox" id="sausage" value="sausage">
                            <label class="form-check-label" for="sausage">
                                Sausage
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" name="toppingSelection" type="checkbox" id="bacon" value="bacon">
                            <label class="form-check-label" for="bacon">
                                Bacon
                            </label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="name">Username</label>
                        <input type="text" name="name" id="name" class="form-control mt-2 mb-1" placeholder="Enter your name">
                    </div>

                    <div class="form-group row">
                        <div class="col-sm-10">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </div>
                </form>
            </div>

                    <%--            <div class="col-md-6">--%>

<%--                <div class="row mt-4">--%>
<%--                    <div class="col-md-11 mb-4">--%>
<%--                        <div class="card mb-4">--%>
<%--                            <div class="card-header py-3">--%>
<%--                                <h5 class="mb-0">Delivery Address</h5>--%>
<%--                            </div>--%>
<%--                            <div class="card-body">--%>
<%--                                <form>--%>
<%--                                    <!-- 2 column grid layout with text inputs for the first and last names -->--%>
<%--                                    <div class="row mb-4">--%>
<%--                                        <div class="col">--%>
<%--                                            <div class="form-outline">--%>
<%--                                                <input type="text" id="form7Example1" class="form-control" />--%>
<%--                                                <label class="form-label" for="form7Example1">First name</label>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                        <div class="col">--%>
<%--                                            <div class="form-outline">--%>
<%--                                                <input type="text" id="form7Example2" class="form-control" />--%>
<%--                                                <label class="form-label" for="form7Example2">Last name</label>--%>
<%--                                            </div>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>

<%--                                    <!-- Text input -->--%>
<%--                                    <div class="form-outline mb-4">--%>
<%--                                        <input type="text" id="form7Example4" class="form-control" />--%>
<%--                                        <label class="form-label" for="form7Example4">Address</label>--%>
<%--                                    </div>--%>

<%--                                    <!-- Email input -->--%>
<%--                                    <div class="form-outline mb-4">--%>
<%--                                        <input type="email" id="form7Example5" class="form-control" />--%>
<%--                                        <label class="form-label" for="form7Example5">Email</label>--%>
<%--                                    </div>--%>

<%--                                    <!-- Number input -->--%>
<%--                                    <div class="form-outline mb-4">--%>
<%--                                        <input type="number" id="form7Example6" class="form-control" />--%>
<%--                                        <label class="form-label" for="form7Example6">Phone</label>--%>
<%--                                    </div>--%>

<%--                                    <!-- Message input -->--%>
<%--                                    <div class="form-outline mb-4">--%>
<%--                                        <textarea class="form-control" id="form7Example7" rows="4"></textarea>--%>
<%--                                        <label class="form-label" for="form7Example7">Additional information</label>--%>
<%--                                    </div>--%>

<%--                                    <!-- Checkbox -->--%>
<%--                                    <div class="form-check d-flex justify-content-center mb-2">--%>
<%--                                        <input class="form-check-input me-2" type="checkbox" value="" id="form7Example8" checked />--%>
<%--                                        <label class="form-check-label" for="form7Example8">--%>
<%--                                            Create an account?--%>
<%--                                        </label>--%>
<%--                                    </div>--%>
<%--                                </form>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
        </div>

<%--<form class="p-2"  method="post">--%>
<%--    <div class="form-group">--%>
<%--        <label for="crustSelection">Username</label>--%>
<%--        <input type="text" name="crustSelection" id="crustSelection" class="form-control mt-2 mb-1 w-25" aria-describedby="emailHelp" placeholder="Enter username">--%>
<%--    </div>--%>
<%--    <button type="submit" class="btn btn-primary mt-3">Submit</button>--%>
<%--</form>--%>

<%@ include file="/partials/scripts.jsp" %>

</body>
</html>
