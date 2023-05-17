<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2">
<tr><th>Flight Number</th>
<th>Flight Name</th>
<th>Source</th>
<th>Destination</th>
<th>Flight Date</th>
<th>Flight price</th>
<th>LayOver Points</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach var="flight" items="${flights }">
<tr>
<td>${flight.flightNumber} </td>
<td>${flight.flightName}</td>
<td>${flight.flightSource}</td>
<td>${flight.flightDestination}</td>
<td>${flight.flightdate}</td>
<td>${flight.price}</td>
<td>${flight.layOvers }</td>
<td><a href="editFlight/${flight.flightNumber}">Edit</a></td>
<td><a href="deleteFlight/${flight.flightNumber}">Delete</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>