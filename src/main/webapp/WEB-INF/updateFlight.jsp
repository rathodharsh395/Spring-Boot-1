<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
<form action="updateFlight">
Enter Flight Source:<input type="text" name="source" value="${flight.flightSource }"/><br> 
Enter Flight Destination:<input type="text" name="destination" value="${flight.flightDestination }"/><br>
<input type="submit" value="Update">
</form>
</body>
</html>