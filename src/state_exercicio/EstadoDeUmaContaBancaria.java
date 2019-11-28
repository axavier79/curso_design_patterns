package state_exercicio;

import chain_of_responsibility_exercicio.ContaBancaria;

public interface EstadoDeUmaContaBancaria {

	void efetuarSaque(ContaBancaria conta, double valor);

	void efetuarDeposito(ContaBancaria conta, double valor);

}
