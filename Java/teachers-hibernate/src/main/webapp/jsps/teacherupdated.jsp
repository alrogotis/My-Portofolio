<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Επιτυχής Ανανεωσή</title>
</head>
<body>

    <h1>Νέα Στοιχεία Καθηγητή</h1>
    <p>${teacher.firstname}</p>
    <p>${teacher.lastname}</p>
    <a href="${pageContext.request.contextPath}/jsps/teachersmenu.jsp">Επιστροφή</a>

</body>
</html>