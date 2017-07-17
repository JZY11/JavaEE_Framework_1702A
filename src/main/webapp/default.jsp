<%--
  Created by IntelliJ IDEA.
  User: Tony.Jaa
  Date: 2017/7/4
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>default page</title>
</head>
<body>
<h1>首页</h1>
<form action="/user/query" method="post">
  <input type="text" name="username" placeholder="USERNAME" value="tom"><br>
  <input type="password" name="password" placeholder="PASSWORD" value="123"><br>
  <input type="submit" value="SIGN IN">
</form>
<p>${requestScope.message}</p>
<a href="/sign_up.jsp">SIGN UP</a>
</body>
</html>