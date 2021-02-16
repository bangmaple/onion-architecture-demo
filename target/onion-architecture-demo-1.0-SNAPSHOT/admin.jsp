<%--
  Created by IntelliJ IDEA.
  User: bangmaple
  Date: 16/02/2021
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello Admin ${sessionScope.USER.fullname}</h1>
<h3><font color="green">${requestScope.STATUS}</font></h3>
<a href="Logout">Logout</a>
</body>
</html>
