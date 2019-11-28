package chain_of_responsibility_alura;

import strategy_alura.Orcamento;

public class DescontoPorCincoItens implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double descontar(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			System.out.println("Desconto 5 itens:");
			return orcamento.getValor() * 0.1;
		} else {
			return proximoDesconto.descontar(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

}
