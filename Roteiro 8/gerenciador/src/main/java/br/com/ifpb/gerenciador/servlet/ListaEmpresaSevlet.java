package br.com.ifpb.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/ListaEmpresas"})
public class ListaEmpresaSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListaEmpresaSevlet() {
        super();

    }


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Banco bd= new Banco();
		List<Empresa> listaEmpresas = bd.getEmpresas();
		
		req.setAttribute("empresas", listaEmpresas);
		RequestDispatcher rd= req.getRequestDispatcher("/listaEmpresas.jsp");
		rd.forward(req, resp);
		
		System.out.println("Chamando a pagina listaEmpresas.jsp");
	}

}
