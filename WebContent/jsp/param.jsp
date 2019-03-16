<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>いろいろなパラメータの確認</title>
</head>
<body>
	<h2>いろんなパラーメータ</h2>

	<form action="../ParamListServlet">
		<p>テキストフィールド</p>
		<input type="text" name="text1" value="テキストフィールド">

		<p>テキストエリア</p>
		<textarea rows="5" cols="30" name="textarea1">テキストエリア</textarea>

		<p>ラジオボックス</p>
		<input type="radio" name="radio1" value="value1" checked>左
		<input type="radio" name="radio1" value="value2">右

		<p>チェックボックス</p>
		<input type="checkbox" name="check1">ゴルフ
		<input type="checkbox" name="check2">テニス
		<input type="checkbox" name="check3">サッカー

		<p>セレクト</p>
		<select name="lang" size="3" multiple>
			<option value="sel1">VB
			<option value="sel2">Java
			<option value="sel3">C
		</select>

		<p></p>

		<input type="submit">
		<input type="reset">
	</form>
</body>
</html>