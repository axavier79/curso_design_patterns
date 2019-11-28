package chain_of_responsibility_alura;

import strategy_alura.Orcamento;

public interface Desconto {
	double descontar(Orcamento orcamento);
	void setProximoDesconto(Desconto proximoDesconto);
}
