package state_alura;

import strategy_alura.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicarDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos Reprovados não podem ser Aprovados!");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já está Reprovado!");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
