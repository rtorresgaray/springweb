<%-- 
    Document   : index
    Created on : 06/09/2014, 12:13:39 PM
    Author     : SABADO-MANHANA
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${titulo}</title>
    </head>
    <body>
        <h1>${titulo}</h1>
        <p>${titulo}</p>
        <p>${programa.descripcion}</p>
    </body>
    
    <c:forEach var="i" items="${nombres}">
        <p><c:out value="${i}"/><p>
    </c:forEach>
    
</html>
