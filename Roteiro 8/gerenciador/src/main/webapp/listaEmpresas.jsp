<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ page import="java.util.List, br.com.ifpb.gerenciador.servlet.Empresa"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Empresas</title>
</head>
<body>

<%List<Empresa> listaEmpresas = (List<Empresa>)request.getAttribute("empresas");%>
<h1> Lista de empresas cadastradas</h1>
	<ul>

		<% for (Empresa emp : listaEmpresas) {%>
			<li><%= emp.getNome() %> </li>
		<%} %>
		
	</ul>
	
</body>
</html>