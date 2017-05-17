package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cadastrar_usuario", urlPatterns = { "/cadastrarusuario", "/cadastrar" })
public class BuscaAluno extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public BuscaAluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();

		String nome = request.getParameter("nome");
		int idade = Integer.parseInt(request.getParameter("idade"));

		writer.println("<html><body>");
		writer.println("Olá, sou " + nome + "<br />");
		writer.println("Tenho " + idade + " anos");
		writer.println("</body></html>");

	}


}
