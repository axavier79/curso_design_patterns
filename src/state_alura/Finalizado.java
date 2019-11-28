package state_alura;

import strategy_alura.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicarDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o recebem desconto extra!");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� Finalizado!");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� Finalizado!");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� Finalizado!");
	}
}
