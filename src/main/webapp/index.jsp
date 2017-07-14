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
</body>
</html>