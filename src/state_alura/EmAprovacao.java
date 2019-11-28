package state_alura;

import strategy_alura.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {
	private boolean descontoAplicado = false;

	@Override
	public void aplicarDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.setValor(orcamento.getValor() - (orcamento.getValor() * 0.05));
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto j� aplicado!");
		}
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos em Aprova��o n�o podem ir direto para finalizado!");
	}
}
