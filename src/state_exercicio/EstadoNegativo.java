package state_exercicio;

import chain_of_responsibility_exercicio.ContaBancaria;

public class EstadoNegativo implements EstadoDeUmaContaBancaria {

	@Override
	public void efetuarSaque(ContaBancaria conta, double valor) {
		throw new RuntimeException("A conta está Negativa e não é possível efetuar saque!");
	}

	@Override
	public void efetuarDeposito(ContaBancaria conta, double valor) {
		conta.setSaldo(conta.getSaldo() + (valor * 0.95));
		
		if(conta.getSaldo() > 0)
			conta.estadoDaConta = new EstadoPositivo();
	}

}
