<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User</title>
    </head>
    <body>
        Receive Newsletter: ${user.receiveNewsletter}
        <br><br>
        
        Favourite Web Frameworks:
        <c:forEach items="${user.favFramework}" var="currentUser">
            <br>${currentUser}
        </c:forEach>
    </body>
</html>
