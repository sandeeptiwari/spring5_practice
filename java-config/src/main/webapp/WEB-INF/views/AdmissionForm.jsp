<%--
  Created by IntelliJ IDEA.
  User: Sandeep
  Date: 26-08-2018
  Time: 10:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admssion Form</title>
</head>
<body>

<h1>Student admission form for engineering course</h1>

<form action="/submitAdmissionForm.html" method="post">
   <p>Student's name <input type="text" name="studentName" /></p>
    <p>Student's hobby <input type="text" name="studentHobby" /></p>

    <input type="submit" value="submit this form" />
</form>

</body>
</html>
