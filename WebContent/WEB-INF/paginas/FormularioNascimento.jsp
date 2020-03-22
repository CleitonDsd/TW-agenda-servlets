<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Digite a data de nascimento</title>
</head>
<body>
	<form method="post" action="/Tw-agenda-servlets/nascimento">
		<p>Digite seu nascimento:</p>
		<p>
			<input type="text" name="dataNascimento">
		</p>
		<button type="submit">Enviar!</button>
	</form>
</body>
</html>