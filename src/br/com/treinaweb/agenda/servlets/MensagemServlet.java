package br.com.treinaweb.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MensagemServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// GET = iremos recupar algo do servidor, pegar uma page e etc.
	// POST = Enviar/ inserir informa��es no server
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		//GET enviando informa��es ao USER

		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Nome do Usu�rio...</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("	<h1>Nome do Usu�rio</h1>");
		out.println("	<form action = \"/Tw-agenda-servlets/mensagem\" method=\"post\">");
		out.println("		<p>Digite seu nome:</p>");
		out.println("		<p><input type \"text\" name = \"nomeUsuario\"></p>");
		out.println("		<p><button type = \"submit\">Enviar</button></p>");
		out.println("	</form>");
		out.println("	</body>");
		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//POST recebendo informa��es do USER.
		
		// GetParameter = permite ler informa��es enviadas dentro do form
		String nomeUsuario = req.getParameter("nomeUsuario");

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Nome do Usu�rio></title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h1>Exibindo Nome do Usu�rio</h1>");
		out.println("		<p>Ol�, " + nomeUsuario + "</p>");
		out.println("	<body>");
		out.println("	</body>");
		out.println("</html>");
	}

}
