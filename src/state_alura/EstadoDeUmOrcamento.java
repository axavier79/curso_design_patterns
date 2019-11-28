package state_alura;

import strategy_alura.Orcamento;

public interface EstadoDeUmOrcamento {

	void aplicarDescontoExtra(Orcamento orcamento);
	
	void aprovar(Orcamento orcamento);
	void reprovar(Orcamento orcamento);
	void finalizar(Orcamento orcamento);
}
