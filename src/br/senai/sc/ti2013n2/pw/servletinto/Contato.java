package br.senai.sc.ti2013n2.pw.servletinto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/contato")
public class Contato extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Contato</h1>");
		writer.println("<b>Email: </b>" + request.getParameter("email"));
		writer.println("<br />");
		writer.println("<b>Telefone: </b>" + request.getParameter("fone"));
		writer.println("<br />");
		if (!request.getParameter("estados").isEmpty()){
			writer.println("<b>Estado: </b>" + request.getParameter("estados"));
			writer.println("<br />");	
		}
		writer.println("<b>Mensagem: </b>" + request.getParameter("mensagem"));
		writer.println("<br />");
		if (!request.getParameter("novidades").isEmpty()) {
			writer.println("<br />");
			writer.println("<b>Span: </b>" + request.getParameter("novidades"));
		}
		writer.println("</body>");
		writer.println("</html>");
	}
}
