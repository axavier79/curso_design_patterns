package template_method_exercicio;

import java.util.List;

import chain_of_responsibility_exercicio.ContaBancaria;

public class DadosBanco {
	private String nomeBanco;
	private String telefoneBanco;
	private String enderecoBanco;
	private String emailBanco;
	private String agencia;
	private List<ContaBancaria> contas;
	
	public DadosBanco (
			String nomeBanco,
			String agencia,
			String enderecoBanco, 
			String telefoneBanco, 
			String emailBanco, 
			List<ContaBancaria> contas) {
		
		this.nomeBanco = nomeBanco;
		this.agencia = agencia;
		this.enderecoBanco = enderecoBanco;
		this.telefoneBanco = telefoneBanco;
		this.emailBanco = emailBanco;
		this.contas = contas;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public String getTelefoneBanco() {
		return telefoneBanco;
	}

	public String getEnderecoBanco() {
		return enderecoBanco;
	}

	public String getEmailBanco() {
		return emailBanco;
	}

	public String getAgencia() {
		return agencia;
	}

	public List<ContaBancaria> getContas() {
		return contas;
	}

}
