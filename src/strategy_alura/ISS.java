package strategy_alura;

import strategy_alura.Orcamento;

public class ISS implements Imposto{

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
