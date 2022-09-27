<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student Form</title>
</head>
<body>
	 <div>
        <form method="GET" action="${pageContext.request.contextPath}/updateStudent">
            <input type="text" name="id" value="${param.id}" readonly><br>
            <input type="text" name="fname" value="${param.fname}"><br>
            <input type="text" name="sname" value="${param.sname}"><br><br>
            <button type="submit">Update Student</button>
        </form>
    </div>

</body>
</html>