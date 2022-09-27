<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students Table</title>
</head>
<body>

	<div>
     <table>

       <tr>
         <th>ID</th>
         <th>First Name</th>
         <th>Last Name</th>
         <th>Delete</th>
         <th>Update</th>
       </tr>

       <c:forEach var = "student" items="${students}">
         <tr>
           <td>${student.id}</td>
           <td>${student.firstname}</td>
           <td>${student.lastname}</td>
           <td><a href="${pageContext.request.contextPath}/deleteStudent?id=${student.id}&fname=${student.firstname}&sname=${student.lastname}">Delete</a></td>
           <td><a href="${pageContext.request.contextPath}/jsps/studentupdate.jsp?id=${student.id}&fname=${student.firstname}&sname=${student.lastname}">Update</a></td>
         </tr>
       </c:forEach>

     </table>

  </div>

    <div>
        <c:if test="${deleteAPIError}">
            <p>Something went wrong with Delete</p>
        </c:if>  
    </div>

    <div>
        <c:if test="${updateAPIError}">
            <p>Something went wrong with Update</p>
        </c:if>  
    </div>

</body>
</html>