<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="uploadHttpOneServlet" method="post" enctype="multipart/form-data">
    <p>文件描述：<input type="text" name="description" /></p>
    <p>请选择文件：<input type="file" name="file" /></p>
    <input type="reset" value="重填" />
    <input type="submit" value="上传" />
</form>
</body>
</html>
