<%@ page import="com.web.springboot.controller.MyService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task 1 Results</title>
</head>
<body>
<p>Result: <%= new MyService().executeFirstTaskWeb(request.getParameter("a1"), request.getParameter("a2")) %>
</p>
</body>
</html>
