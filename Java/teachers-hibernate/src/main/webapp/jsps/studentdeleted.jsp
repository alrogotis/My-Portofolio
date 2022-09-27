<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Επιτυχής Διαγραφή</title>
</head>
<body>
	 <p>Student: ${student.id} ${student.firstname} ${student.lastname}</p>
    <p>deleted successfully</p><br>
    
    <a href="${pageContext.request.contextPath}/jsps/studentsmenu.jsp">Επιστροφή</a>

</body>
</html>