package br.com.ifpb.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException{
			PrintWriter out= resp.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>");
			out.println("<Meu primeiro Servlet>");
			out.println("</title>");
			out.println("<head>");
			out.println("<body>");
			out.println("<h1> Oi mundo, meu primeiro Servlet!!!</h1>");
			out.println("</body>");
			out.println("</html>");
			System.out.println("o servlet OiMundoServlet foi chamado");
			
			
			
	}
}
