package state_alura;

import strategy_alura.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicarDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já Finalizado!");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já Finalizado!");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já Finalizado!");
	}
}
