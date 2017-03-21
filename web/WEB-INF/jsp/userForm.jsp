<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form method="POST" action="user.htm" modelAttribute="user">
            <table>
                <tr>
                    <td>Subscibe to newsletter? :</td>
                    <td><form:checkbox path="receiveNewsletter"/></td>
                </tr>
                <tr>
                    <td>Favourite Web Frameworks:</td>
                    <td><form:checkboxes items="${webFrameworkList}" path="favFramework"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>

        </form:form>
    </body>
</html>
