<%@ page import="java.util.List, br.com.ifpb.gerenciador.servlet.Empresa"%>
<c:url value="/NovaEmpresa" var="linkServletNovaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de cadastro</title>
</head>
<body>
	<h1>Cadastro de empresa</h1>
	<form action="/gerenciador/NovaEmpresa" method="POST">
		Nome: <input type="text" name="nome" id="nome"/>
		<br>
		
		CNPJ: <input type="text" name="cnpj" id="cnpj"/>
		<br>
		Data: <input type="text" name="dataAbertura" id="dataAbertura"/>
		<br>
		
		<input type="submit" value="Enviar"/>
	</form>
</body>
</html>