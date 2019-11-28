package chain_of_responsibility_alura;

import strategy_alura.Orcamento;

public class CorrenteDeDescontos {

	public double calcular(Orcamento orcamento) {

		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDe500Reais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
		d1.setProximoDesconto(d2);
		d2.setProximoDesconto(d3);
		d3.setProximoDesconto(d4);
		
		return d1.descontar(orcamento);
	}
}
