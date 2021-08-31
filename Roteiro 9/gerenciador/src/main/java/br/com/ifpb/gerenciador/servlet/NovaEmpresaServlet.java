package br.com.ifpb.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
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

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeEmpresa = req.getParameter("nome");
		String cnpjEmpresa = req.getParameter("cnpj");
		String dataAbertura= req.getParameter("dataAbertura");
		
		Empresa emp = new Empresa();
		emp.setNome(nomeEmpresa);
		emp.setCnpj(cnpjEmpresa);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date data =null;
		try {
			data = sdf.parse(dataAbertura);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp.setDataAbertura(data);
		
		//Salvar no BD		
		Banco bd= new Banco();
		bd.adiciona(emp);
		
		//dispachar para novaEmpresaCriada.jsp passando a empresa
		RequestDispatcher rd= req.getRequestDispatcher("/novaEmpresaCriada.jsp");
		req.setAttribute("empresa", emp.getNome() );
		req.setAttribute("cnpj", emp.getCnpj());
		rd.forward(req, resp);
		
		PrintWriter out= resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("<Cadastro de uma empresa>");
		out.println("</title>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1> Cadastro de empresa</h1>");
		out.println("<p>Empresa " + emp.getNome() + " com CNPJ " + emp.getCnpj() + " na data " + emp.getDataAbertura() + " cadastrada com sucesso!!</p>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("Chamando NovaEmpresaServlet");
		System.out.println("Salvando a empresa " + nomeEmpresa + "no BD");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.getWriter().append("Served at: ").append(req.getContextPath());
		
		String nomeEmpresa = req.getParameter("nome");
		String cnpjEmpresa = req.getParameter("cnpj");
		String dataAbertura= req.getParameter("dataAbertura");
		
		Empresa emp = new Empresa();
		emp.setNome(nomeEmpresa);
		emp.setCnpj(cnpjEmpresa);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date data =null;
		try {
			data = sdf.parse(dataAbertura);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp.setDataAbertura(data);
		
		//Salvar no BD		
		Banco bd= new Banco();
		bd.adiciona(emp);
		
		//dispachar para novaEmpresaCriada.jsp passando a empresa
		RequestDispatcher rd= req.getRequestDispatcher("/novaEmpresaCriada.jsp");
		req.setAttribute("empresa", emp.getNome() );
		req.setAttribute("cnpj", emp.getCnpj());
		req.setAttribute("dataAbertura", emp.getDataAbertura());
		
		rd.forward(req, resp);
		
		System.out.println("Chamando NovaEmpresaServlet");
		System.out.println("Salvando a empresa " + emp.getNome() + "no BD");
	}
}


