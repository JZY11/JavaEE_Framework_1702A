<%--
  Created by IntelliJ IDEA.
  User: Tony.Jaa
  Date: 2017/7/11
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index page</title>
</head>
<body>
<h1>主页</h1>
${sessionScope.user.username}
<p><a href="/user/signOut">注销</a></p>
<hr>
<form action="/book/create" method="post">
    <input type="text" name="title" placeholder="书名"><br>
    <input type="text" name="author" placeholder="作者"><br>
    <input type="date" name="date" placeholder="出版日期"><br>
    <input type="text" name="price" placeholder="定价"><br>
    <input type="submit" value="添加">
</form>
</body>
</html>