package chain_of_responsibility_alura;

import strategy_alura.Orcamento;

public class DescontoPorMaisDe500Reais implements Desconto {

	private Desconto proximoDesconto;

	@Override
	public double descontar(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			System.out.println("Desconto mais de R$ 500:");
			return orcamento.getValor() * 0.07;
		} else {
			return proximoDesconto.descontar(orcamento);
		}
	}

	@Override
	public void setProximoDesconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

}
