package br.com.npj.modelo;

public class Pessoa {
	
	private int idPessoa;
	private String nmPessoa;
	private String nuIdentidade;
	private String nuCPF;
	private String deLocalResidencia;
	private int icAdministrador;
	private int icAtivo;
	private int icAssistido;
	private String coSenha;
	public boolean valid;
	
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNmPessoa() {
		return nmPessoa;
	}
	public void setNmPessoa(String nmPessoa) {
		this.nmPessoa = nmPessoa;
	}
	public String getNuIdentidade() {
		return nuIdentidade;
	}
	public int getIcAdministrador() {
		return icAdministrador;
	}
	public void setIcAdministrador(int icAdministrador) {
		this.icAdministrador = icAdministrador;
	}
	public int getIcAtivo() {
		return icAtivo;
	}
	public void setIcAtivo(int icAtivo) {
		this.icAtivo = icAtivo;
	}
	public int getIcAssistido() {
		return icAssistido;
	}
	public void setIcAssistido(int icAssistido) {
		this.icAssistido = icAssistido;
	}
	public String getCoSenha() {
		return coSenha;
	}
	public void setCoSenha(String coSenha) {
		this.coSenha = coSenha;
	}
	public void setNuIdentidade(String nuIdentidade) {
		this.nuIdentidade = nuIdentidade;
	}
	public String getNuCPF() {
		return nuCPF;
	}
	public void setNuCPF(String nuCPF) {
		this.nuCPF = nuCPF;
	}
	public String getDeLocalResidencia() {
		return deLocalResidencia;
	}
	public void setDeLocalResidencia(String deLocalResidencia) {
		this.deLocalResidencia = deLocalResidencia;
	}
 
}
