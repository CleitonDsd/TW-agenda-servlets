<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar Contato</title>
</head>
<body>
	<h2>Editar Contato</h2>
	<form method="post"
		action="${pageContext.request.contextPath}/agenda/editar">
		<input type="hidden" name="id" value="${contato.id}">
		<p>Nome:</p>
		<p>
			<input type="text" name="nome" value="${contato.nome}">
		</p>

		<p>Idade:</p>
		<p>
			<input type="number" name="idade" value="${contato.idade}">
		</p>

		<p>Telefone:</p>
		<p>
			<input type="number" name="telefone" value="${contato.telefone}">
		</p>
		<button type="submit">Salvar!</button>


	</form>
</body>
</html>