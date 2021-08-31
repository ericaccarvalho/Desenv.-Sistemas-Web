<%
	String nomeEmpresa = (String)request.getAttribute("empresa");
	String cnpjEmpresa = (String)request.getAttribute("cnpj");
	System.out.println(nomeEmpresa);
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<title>Cadastro de empresa</title>
</head>
<body>
	<p>Empresa <%= (nomeEmpresa) %> com CNPJ <%= (cnpjEmpresa) %> cadastrada com sucesso!!</p>
</body>
</html>