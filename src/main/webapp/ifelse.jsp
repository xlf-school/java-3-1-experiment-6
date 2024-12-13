<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>字符串比较</title>
</head>
<body>
<c:set var="str1" value="apple" scope="request" />
<c:set var="str2" value="banana" scope="request" />

<h3>字符串比较结果：</h3>

<c:if test="${str1 > str2}">
  <p>较大的字符串是：${str1}</p>
</c:if>
<c:if test="${str1 <= str2}">
  <p>较大的字符串是：${str2}</p>
</c:if>

<c:choose>
  <c:when test="${str1 < str2}">
    <p>较小的字符串是：${str1}</p>
  </c:when>
  <c:otherwise>
    <p>较小的字符串是：${str2}</p>
  </c:otherwise>
</c:choose>
</body>
</html>
