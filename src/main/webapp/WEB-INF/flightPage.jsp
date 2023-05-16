<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addFlight">
Enter Flight Number: <input type="text" name="flightNumber"><br>
Enter Flight Name  : <input type="text" name="flightName"><br> 
Enter   Source     : <input type="text" name="flightSource"><br>
Enter  Destination : <input type="text" name="flightDestination"><br>
Enter   Price      : <input type="text" name="price"><br> 
Enter Flight Date  : <input type="date" name="flightdate"><br>
Enter LayOvers     : <input type="text" name="layOvers"> <br>

 <input type="submit" value="AddFlight">
 
</form>
<a href="/viewFlightInTable">View All Flights</a>
</body>
</html>