package strategy_alura;

import strategy_alura.Orcamento;

public class ICPP implements Imposto{

	@Override
	public double calcular(Orcamento orcamento) {
		double retorno;
		
		if (orcamento.getValor() < 1000) {
			retorno = orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
			retorno = orcamento.getValor() * 0.07;
		} else {
			retorno = orcamento.getValor() * 0.08 + 30;
		}
		
		return retorno;
	}

}
