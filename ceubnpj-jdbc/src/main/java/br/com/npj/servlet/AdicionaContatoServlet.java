package br.com.npj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.npj.dao.PessoaDAO;
import br.com.npj.modelo.Pessoa;

/**
 * Servlet implementation class AdicionaContatoServlet
 */
//@WebServlet("/AdicionaContatoServlet")

//@WebServlet(name = "FormServlet", urlPatterns = "/AdicionaContatoServlet")
public class AdicionaContatoServlet extends HttpServlet	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
		
//		imprime	o	nome	do	contato	que	foi	adicionado
		PrintWriter	out	=	response.getWriter();
        Pessoa pse = new Pessoa();
        
        pse.setNmPessoa(request.getParameter("nome"));
        pse.setNuIdentidade(request.getParameter("rg"));
        pse.setNuCPF(request.getParameter("cpf"));
        pse.setDeLocalResidencia(request.getParameter("endereco"));
        pse.setIcAdministrador(0);
        pse.setIcAssistido(1);
        pse.setIcAtivo(1);
        pse.setCoSenha(request.getParameter("senha"));

		//	salva	o	contato
		PessoaDAO dao = null;
		try {
			dao = new	PessoaDAO();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao.adiciona(pse);
		
		out.println("<html>");
		out.println("<body>");
		out.println("Contato	"	+	pse.getNmPessoa()	+
										"	adicionado	com	sucesso");								
		out.println("</body>");
		out.println("</html>");
		
		out.println("<form class=\"adicionacontato\"  action=\"login.html\" method=\"POST\">"
				+ "<input	type='submit' value='Logar'/>");
		
	//super.doPost(req, resp);
	}
	
	
}
