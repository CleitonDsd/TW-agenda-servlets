package br.com.treinaweb.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReceberMensagemServlets extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// informa��es da requisi��es para o nosso Servlets(input, etc)
		// GetParameter = permite ler informa��es enviadas dentro do form
		String nomeUsuario = request.getParameter("nomeUsuario");

		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Nome do Usu�rio></title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h1>Exibindo Nome do Usu�rio</h1>");
		out.println("		<p>Ol�, "+ nomeUsuario + "</p>");
		out.println("	<body>");
		out.println("	</body>");
		out.println("</html>");
	}

}
