<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- importando JSTL -->
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="jstl" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mensagem</title>
</head>
<body>
	<h1>Exibindo o nome</h1>
	
	<p>Olá, ${param.nomeUsuario}</p>

</body>
</html>