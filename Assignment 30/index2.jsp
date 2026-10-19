<%@ page import="java.util.*" %>
<%
    Map<Integer, String[]> patients =
        (Map<Integer, String[]>) application.getAttribute("patients");

    if (patients == null) {
        patients = new LinkedHashMap<Integer, String[]>();
        application.setAttribute("patients", patients);
    }

    String action = request.getParameter("action");
    String message = "";

    if ("add".equals(action)) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String disease = request.getParameter("disease");
        String status = request.getParameter("status");

        if (patients.containsKey(id)) {
            message = "Patient ID already exists!";
        } else {
            patients.put(id, new String[]{
                name, String.valueOf(age), disease, status
            });
            message = "Patient added successfully!";
        }
    }

    if ("update".equals(action)) {
        int id = Integer.parseInt(request.getParameter("id"));

        if (patients.containsKey(id)) {
            patients.put(id, new String[]{
                request.getParameter("name"),
                request.getParameter("age"),
                request.getParameter("disease"),
                request.getParameter("status")
            });
            message = "Patient record updated successfully!";
        } else {
            message = "Patient not found!";
        }
    }

    if ("delete".equals(action)) {
        int id = Integer.parseInt(request.getParameter("id"));

        if (patients.remove(id) != null) {
            message = "Patient record deleted successfully!";
        } else {
            message = "Patient not found!";
        }
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Patient Record Management System</title>
</head>
<body>

<h2>Patient Record Management System</h2>

<p><b><%= message %></b></p>

<h3>Add Patient</h3>

<form method="post">
    <input type="hidden" name="action" value="add">

    Patient ID:
    <input type="number" name="id" required><br><br>

    Patient Name:
    <input type="text" name="name" required><br><br>

    Age:
    <input type="number" name="age" min="0" required><br><br>

    Disease:
    <input type="text" name="disease" required><br><br>

    Treatment Status:
    <select name="status" required>
        <option value="Under Treatment">Under Treatment</option>
        <option value="Recovered">Recovered</option>
        <option value="Discharged">Discharged</option>
    </select><br><br>

    <input type="submit" value="Add Patient">
</form>

<hr>

<h3>Update Patient</h3>

<form method="post">
    <input type="hidden" name="action" value="update">

    Patient ID:
    <input type="number" name="id" required><br><br>

    Patient Name:
    <input type="text" name="name" required><br><br>

    Age:
    <input type="number" name="age" min="0" required><br><br>

    Disease:
    <input type="text" name="disease" required><br><br>

    Treatment Status:
    <select name="status" required>
        <option value="Under Treatment">Under Treatment</option>
        <option value="Recovered">Recovered</option>
        <option value="Discharged">Discharged</option>
    </select><br><br>

    <input type="submit" value="Update Patient">
</form>

<hr>

<h3>Delete Patient</h3>

<form method="post">
    <input type="hidden" name="action" value="delete">

    Patient ID:
    <input type="number" name="id" required><br><br>

    <input type="submit" value="Delete Patient">
</form>

<hr>

<h3>Patient Records</h3>

<table border="1" cellpadding="8">
    <tr>
        <th>Patient ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Disease</th>
        <th>Treatment Status</th>
    </tr>

    <%
        for (Map.Entry<Integer, String[]> entry : patients.entrySet()) {
            String[] p = entry.getValue();
    %>

    <tr>
        <td><%= entry.getKey() %></td>
        <td><%= p[0] %></td>
        <td><%= p[1] %></td>
        <td><%= p[2] %></td>
        <td><%= p[3] %></td>
    </tr>

    <% } %>
</table>

</body>
</html>