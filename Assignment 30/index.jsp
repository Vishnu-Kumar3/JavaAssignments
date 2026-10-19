<%@ page import="java.util.*" %>
<%
    Map<Integer, String[]> employees =
        (Map<Integer, String[]>) application.getAttribute("employees");

    if (employees == null) {
        employees = new LinkedHashMap<Integer, String[]>();
        application.setAttribute("employees", employees);
    }

    String action = request.getParameter("action");
    String message = "";

    if ("add".equals(action)) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String department = request.getParameter("department");
        double salary = Double.parseDouble(request.getParameter("salary"));

        if (employees.containsKey(id)) {
            message = "Employee ID already exists!";
        } else {
            employees.put(id, new String[]{
                name, department, String.valueOf(salary)
            });
            message = "Employee added successfully!";
        }
    }

    if ("update".equals(action)) {
        int id = Integer.parseInt(request.getParameter("id"));

        if (employees.containsKey(id)) {
            employees.put(id, new String[]{
                request.getParameter("name"),
                request.getParameter("department"),
                request.getParameter("salary")
            });
            message = "Employee updated successfully!";
        } else {
            message = "Employee not found!";
        }
    }

    if ("delete".equals(action)) {
        int id = Integer.parseInt(request.getParameter("id"));

        if (employees.remove(id) != null) {
            message = "Employee deleted successfully!";
        } else {
            message = "Employee not found!";
        }
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Management System</title>
</head>
<body>

<h2>Employee Management System</h2>

<p><b><%= message %></b></p>

<h3>Add Employee</h3>

<form method="post">
    <input type="hidden" name="action" value="add">

    Employee ID:
    <input type="number" name="id" required><br><br>

    Name:
    <input type="text" name="name" required><br><br>

    Department:
    <input type="text" name="department" required><br><br>

    Salary:
    <input type="number" step="0.01" name="salary" min="0" required><br><br>

    <input type="submit" value="Add Employee">
</form>

<hr>

<h3>Update Employee</h3>

<form method="post">
    <input type="hidden" name="action" value="update">

    Employee ID:
    <input type="number" name="id" required><br><br>

    New Name:
    <input type="text" name="name" required><br><br>

    New Department:
    <input type="text" name="department" required><br><br>

    New Salary:
    <input type="number" step="0.01" name="salary" min="0" required><br><br>

    <input type="submit" value="Update Employee">
</form>

<hr>

<h3>Delete Employee</h3>

<form method="post">
    <input type="hidden" name="action" value="delete">

    Employee ID:
    <input type="number" name="id" required><br><br>

    <input type="submit" value="Delete Employee">
</form>

<hr>

<h3>Employee Records</h3>

<table border="1" cellpadding="8">
    <tr>
        <th>Employee ID</th>
        <th>Name</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>

    <%
        for (Map.Entry<Integer, String[]> entry : employees.entrySet()) {
            String[] emp = entry.getValue();
    %>

    <tr>
        <td><%= entry.getKey() %></td>
        <td><%= emp[0] %></td>
        <td><%= emp[1] %></td>
        <td><%= emp[2] %></td>
    </tr>

    <% } %>
</table>

</body>
</html>