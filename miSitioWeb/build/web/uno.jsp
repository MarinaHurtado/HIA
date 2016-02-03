<%-- 
    Document   : uno
    Created on : 13/01/2016, 01:59:23 PM
    Author     : sdist
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String strOpA = request.getParameter("opA");
            String strOpB = request.getParameter("opB");
            int a = Integer.parseInt(strOpA);
            int b = Integer.parseInt(strOpB);
            int c = a + b;
            response.getWriter().println("<h1>La suma de "+a+" y "+b+" es "+c+"<h1>");
        %>
    </body>
</html>
