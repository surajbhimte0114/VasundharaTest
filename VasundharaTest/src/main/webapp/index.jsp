<%@page import="com.entities.User"%>
<%@page import="com.servlets.UserLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<html>
<head>
    <meta charset="UTF-8">
    <title>User Login</title>

	<%@include file="all_js_boot.jsp"%>
</head>
<body>
    <div class="container">
        <div class="card shadow  mb-5 bg-body rounded p-4 mt-5"
			style="width: 800px; margin-left: 17%">
                <form action="UserLogin" method="post">
                    <div class="form-group">
                        <label for="userId" style="padding-top: 20px">Username : </label>
                        <input type="text" id="userId" name="userId" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Password :</label>
                        <input type="password" id="password" name="password" class="form-control" required>
                    </div>
                    <div class="form-group">
                    <button type="submit" class="btn btn-primary">Login</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <!-- Add Bootstrap JavaScript -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>