<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Aluno</title>
</head>
<body>
	<form action="/MeuProjeto/cadastrarusuario" method="post">
		<h1>Formulário de Aluno</h1>
		Nome: <input type="text" name="nome"><br /> Idade:<input
			type="text" name="idade" maxlength="10"><br /> <input
			type="submit" value="Próxima">
	</form>
</body>
</html>