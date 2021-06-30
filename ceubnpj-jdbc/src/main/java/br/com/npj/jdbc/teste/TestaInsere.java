package br.com.npj.jdbc.teste;

import java.io.IOException;
import br.com.npj.dao.PessoaDAO;
import br.com.npj.modelo.Pessoa;

public class TestaInsere {
	
	public static void main (String args[]) throws IOException, ClassNotFoundException {
		Pessoa pessoa = new Pessoa();
		//pessoa.setIdPessoa(1);
		pessoa.setNmPessoa("Julie2");
		pessoa.setNuIdentidade("E4324");
		pessoa.setNuCPF("432432");
		pessoa.setDeLocalResidencia("Lugar tranquilo de paz aqui");
		pessoa.setIcAdministrador(0);
		pessoa.setIcAssistido(1);
		pessoa.setIcAtivo(1);
		pessoa.setCoSenha("01928374");
		
		PessoaDAO dao =  new PessoaDAO();
		
		dao.adiciona(pessoa);
		
		

		
		
		System.out.println("Gravado!");
	}

}
