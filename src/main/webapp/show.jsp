<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>显示数据</title>
</head>
<body>
<h3>从Servlet转发过来的request内置对象的数据如下：</h3>
<ul>
  <c:forEach var="name" items="${names}">
    <li>${name}</li>
  </c:forEach>
</ul>
</body>
</html>
