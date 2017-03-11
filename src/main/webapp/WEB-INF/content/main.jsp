<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/11 0011
  Time: 上午 1:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html; charset=UTF-8">
    <title>首页</title>
</head>
<body>
欢迎[${sessionScope.user.username}]访问
<br>
<table border="1">
    <tr>
        <th>书名</th><th>作者</th><th>价格</th>
    </tr>
    <c:forEach items="${requestScope.book_list}" var="book">
        <tr>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
