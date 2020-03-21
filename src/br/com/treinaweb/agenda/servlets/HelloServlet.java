package br.com.treinaweb.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// uma maneira de acessarmos o response e escrevermos um resultado a ele
		// parecido com sys.out.print

		PrintWriter out = response.getWriter();

		// como browser só aceitam HTML,CSS e JS, vamos devolver a response em HTML para
		// o browser

		out.println("<html>");
		out.println("<head>");
		out.println("<title>Olá, a partir do Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Olá, mundo!</h1>");
		out.println("<p>Eu sou uma response, vim do Servlet</p>");
		out.println("</body>");
		out.println("</html>");

	}

}
