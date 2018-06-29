<%@ page import="nz.net.osnz.appengine.App" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AppEngine Java JSP Page</title>
</head>
<body>
    <h1>Hello From Appengine</h1>
    <p>This is <%= App.getInfo() %>.</p>

</body>
</html>
