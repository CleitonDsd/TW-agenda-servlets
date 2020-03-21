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
	// POST = Enviar/ inserir informações no server
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		//GET enviando informações ao USER

		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Nome do Usuário...</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("	<h1>Nome do Usuário</h1>");
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
		
		//POST recebendo informações do USER.
		
		// GetParameter = permite ler informações enviadas dentro do form
		String nomeUsuario = req.getParameter("nomeUsuario");

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Nome do Usuário></title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h1>Exibindo Nome do Usuário</h1>");
		out.println("		<p>Olá, " + nomeUsuario + "</p>");
		out.println("	<body>");
		out.println("	</body>");
		out.println("</html>");
	}

}
