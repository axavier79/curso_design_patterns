package state_alura;

import strategy_alura.Orcamento;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicarDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos reprovados n�o recebem desconto extra!");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos Reprovados n�o podem ser Aprovados!");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� Reprovado!");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
