package state_exercicio;

import chain_of_responsibility_exercicio.ContaBancaria;

public class EstadoPositivo implements EstadoDeUmaContaBancaria {

	@Override
	public void efetuarSaque(ContaBancaria conta, double valor) {
		conta.setSaldo(conta.getSaldo() - valor);
		
		if(conta.getSaldo() <= 0 ) 
			conta.estadoDaConta = new EstadoNegativo();
	}

	@Override
	public void efetuarDeposito(ContaBancaria conta, double valor) {
		conta.setSaldo(conta.getSaldo() + (valor * 0.98));
	}

}
