<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>干支計算</title>
</head>
<body>
	<h2>干支計算</h2>

	生まれた年を入力してください。
	<form action="../EtoServlet">
		西暦<input type="text" name="year">年
		<input type="submit" value="計算">
	</form>
</body>
</html>