<%@ page import="com.web.springboot.controller.MyService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task 2 Results</title>
</head>
<body>
<p>Result: <%= new MyService().executeSecondTask(request.getParameter("number")) %>
</p>
</body>
</html>
