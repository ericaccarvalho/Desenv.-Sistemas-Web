<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="UTF-8">
<title>Cadastro de empresa</title>
</head>
<body>
	<c:if test="${not empty empresa}">
		<p>Empresa ${empresa} com CNPJ ${cnpj} na data <fmt:formatDate value="${dataAbertura}" pattern="dd/MM/yyyy"/> cadastrada com sucesso!!</p>
	</c:if>
	
	<c:if test="${empty empresa}">
		<p>Nenhuma empresa cadastrada!!</p>
	</c:if>
	
</body>
</html>