<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Result</title>
</head>
<body>
    <h2>Registration Successful</h2>

    <%
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");

        if (name != null && email != null &&
            phone != null && password != null) {
    %>

    <p>Name: <%= name %></p>
    <p>Email: <%= email %></p>
    <p>Phone Number: <%= phone %></p>
    <p>Password: ********</p>

    <%
        } else {
    %>

    <p>Please submit the registration form correctly.</p>

    <%
        }
    %>

    <br>
    <a href="register.jsp">Back to Registration</a>
</body>
</html>