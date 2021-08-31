package br.com.ifpb.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
		
		PrintWriter out= resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Lista de empresas");
		out.println("</title>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1> Lista de empresas cadastradas</h1>");
		out.println("<ul>");
		for(Empresa emp : listaEmpresas) {
			out.println("<li>" + emp.getNome() + "</li>");
		}
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}

}
