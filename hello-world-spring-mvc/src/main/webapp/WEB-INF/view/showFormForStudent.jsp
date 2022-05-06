<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show form</title>
</head>
<body>
<form action="processForm" method="post">
<label>First Name</label><input type="text" name="firstName"/><br/>
<label>Last Name</label><input type="text" name="lastName"/><br/>
<label>Email</label><input type="text" name="email"/><br/>
<input type="submit" value="process form">
</form>
</body>
</html>