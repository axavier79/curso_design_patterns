package chain_of_responsibility_exercicio;

import state_exercicio.EstadoDeUmaContaBancaria;
import state_exercicio.EstadoNegativo;
import state_exercicio.EstadoPositivo;

public class ContaBancaria {

	private String numeroConta;
	private String titular;
	private double saldo;
	private String dataAberturaDaConta;
	public EstadoDeUmaContaBancaria estadoDaConta;

	public ContaBancaria(String numeroConta, String titular, double saldo, String dataAberturaDaConta) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.dataAberturaDaConta = dataAberturaDaConta;
		if (this.saldo > 0)
			estadoDaConta = new EstadoPositivo();
		else
			estadoDaConta = new EstadoNegativo();
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getMesAberturaDaConta() {
		return dataAberturaDaConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar (double valor) {
		estadoDaConta.efetuarSaque(this, valor);
	}

	public void depositar (double valor) {
		estadoDaConta.efetuarDeposito(this, valor);
	}
}
