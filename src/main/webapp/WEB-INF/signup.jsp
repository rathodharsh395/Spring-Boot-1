<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="signupPage" method="post">
Enter Name:<input type="text" name="t1"><br>
Enter DOB :<input type="date" name="t2"><br>
Enter Email:<input type="email" name="t3"><br>
Enter Your city:<select name="t4">
<option value="pune">PUNE</option>
<option value="kol" >KOLKATA</option>
<option value="mas">CHENNAI</option>
<option value="bang">BANGLORE</option>
  </select><br>
Enter gender:<input type="radio" name="t5" value="male">MALE
             <input type="radio" name="t5" value="female">FEMALE<br>
Enter Course:<input type="checkbox" name="t6" value="JAVA">JAVA
             <input type="checkbox" name="t6" value="JEE">JEE
             <input type="checkbox" name="t6" value="FSD">FSD
             <input type="checkbox" name="t6" value="Angular">Angular
             <br>
            <input type="submit" value="SignUp">
</form>
</body>
</html>