<!DOCTYPE html>
<html>
<head>
    <title>Student Information</title>
</head>
<body>
    <h2>Student Information Form</h2>

    <form method="post">
        Name: <input type="text" name="name" required><br><br>
        PRN: <input type="text" name="prn" required><br><br>
        Class: <input type="text" name="studentClass" required><br><br>
        Email: <input type="email" name="email" required><br><br>

        <input type="submit" value="Submit">
    </form>

    <%
        String name = request.getParameter("name");
        String prn = request.getParameter("prn");
        String studentClass = request.getParameter("studentClass");
        String email = request.getParameter("email");

        if (name != null && prn != null &&
            studentClass != null && email != null) {
    %>

    <h2>Student Details</h2>
    <p>Name: <%= name %></p>
    <p>PRN: <%= prn %></p>
    <p>Class: <%= studentClass %></p>
    <p>Email: <%= email %></p>

    <%
        }
    %>
</body>
</html>