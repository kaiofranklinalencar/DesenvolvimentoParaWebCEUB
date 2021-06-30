package br.com.npj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.npj.dao.PessoaDAO;
import br.com.npj.dao.LogarDAO;
import br.com.npj.modelo.Pessoa;

/**
 * Servlet implementation class Loguin
 */
@WebServlet("/Loguin")

//@WebServlet(name = "FormServlet", urlPatterns = "/Loguin")
public class RealizaLoguin extends HttpServlet	{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             
		//Pessoa pselogin = new Pessoa();
		//pselogin.setNuCPF(request.getParameter("email")); 
		//pselogin.setCoSenha(request.getParameter("senha"));
		
		Pessoa pselogin = new Pessoa();
		LogarDAO objteste = null;
		try {
			objteste = new LogarDAO();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pselogin.setNuCPF(request.getParameter("email")); 
		pselogin.setCoSenha(request.getParameter("senha"));
		
		pselogin = objteste.logindois(pselogin);

	
		if (pselogin.isValid())
		{
		    
		     HttpSession session = request.getSession(true);	    
		     session.setAttribute("currentSessionUser",pselogin); 
		     response.sendRedirect("tela-agendamento2.html"); //logged-in page      		
		}
		    
		else 
		     response.sendRedirect("invalidLogin.html"); //error page 
		
	//	out.println("<html>");
	//	out.println("<body>");
	//	out.println("Contato	"	+	pse.getNmPessoa()	+
	//									"	adicionado	com	sucesso");								
	//	out.println("</body>");
	//	out.println("</html>");
		
	}
	
	
}
