<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.*,dao.AlunoDAO,vo.AlunoVO"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Alunos</title>
</head>
<body>
	<table>
		<%
			AlunoDAO alunoDAO = new AlunoDAO();
			ArrayList<AlunoVO> alunos = alunoDAO.getLista();
			for (AlunoVO aluno : alunos) {
		%>
		<tr>
			<td><%=aluno.getNome()%></td>
			<td><%=aluno.getEmail()%></td>
			<td><%=aluno.getEndereco()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>