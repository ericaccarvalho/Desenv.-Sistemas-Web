package br.com.ifpb.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NovaEmpresa", urlPatterns = { "/NovaEmpresa" })
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NovaEmpresaServlet() {
        super();
    }
    
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nomeEmpresa = req.getParameter("nome");
		
		PrintWriter out= resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("<Cadastro de uma empresa>");
		out.println("</title>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1> Cadastro de empresa</h1>");
		out.println("<p>Empresa" + nomeEmpresa +" cadastrada com sucesso!!</p>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("Chamando NovaEmpresaServlet");
		System.out.println("Salvando a empresa " + nomeEmpresa + "no BD");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
