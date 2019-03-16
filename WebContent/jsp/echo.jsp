<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>EchoServletの入力</h2>

	<a href="../EchoServlet?message=hello">リンクでGET送信</a>
	<form action="../EchoServlet">
		<input type="text" name="message">
		<input type="submit" value="フォームでGET送信">
	</form>

	<form action="../EchoServlet" method="post">
		<input type="text" name="message">
		<input type="submit" value="フォームでGPOST送信">
	</form>
</body>
</html>