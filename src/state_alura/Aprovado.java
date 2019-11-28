package state_alura;

import strategy_alura.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {
	private boolean descontoAplicado = false;

	@Override
	public void aplicarDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.02));
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto j� aplicado!");
		}
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� aprovado!");

	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos Aprovados n�o podem ser Reprovados!");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
