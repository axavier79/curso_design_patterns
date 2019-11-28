package chain_of_responsibility_alura;

import strategy_alura.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double descontar(Orcamento orcamento) {
		if (orcamento.contemItemDeNome("CANETA") && orcamento.contemItemDeNome("LAPIS")) {
			System.out.println("Desconto Venda Casada:");
			return orcamento.getValor() * 0.05;
		} else {
			return proximoDesconto.descontar(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

}
