<%-- 
    Document   : j3
    Created on : 12 Dec, 2023, 2:44:02 AM
    Author     : HP
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
        String s=request.getParameter("nm");
        int l=s.length();
        String s1;
        out.println("length of the string is:"+l);
        %>
        <br>
        <%
            s1=s.replace('c','r');
            out.println("new string is:"+s1);
            
            %>
            <br>
            <%
                out.println("new string:"+s1.toUpperCase());
                %>
                <br>
                <%
                 out.println("new string:"+s1.toLowerCase());
                %>
    </body>
</html>
