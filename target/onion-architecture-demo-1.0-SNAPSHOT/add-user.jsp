<%--
  Created by IntelliJ IDEA.
  User: bangmaple
  Date: 16/02/2021
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <h1>Add new user</h1>
<form action="Users">
    Username: <input name="txtUsername"/><br/>
    Password: <input name="txtPassword"/><br/>
    Role: <input name="txtRole"/><br/>
    Description: <input name="txtDescription"/><br/>
    Fullname: <input name="txtFullname"/><br/>
    <input type="submit" name="btnAction" value="Add"/>
</form>
</body>
</html>
