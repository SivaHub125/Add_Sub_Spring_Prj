<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Result for addition is : <%= request.getAttribute("resultadd") %><br>
	Result for subtraction is : <%= request.getAttribute("resultsub") %>
</body>
</html>