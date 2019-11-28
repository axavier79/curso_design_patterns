package decorator_alura;

import strategy_alura.Orcamento;

public class ICPP extends Imposto {

	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICPP() {
		super();
	}

	@Override
	public double calcular(Orcamento orcamento) {
		double retorno;

		if (orcamento.getValor() < 1000) {
			retorno = orcamento.getValor() * 0.05 + calcularOutroImposto(orcamento);
		} else if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
			retorno = orcamento.getValor() * 0.07 + calcularOutroImposto(orcamento);
		} else {
			retorno = orcamento.getValor() * 0.08 + 30 + calcularOutroImposto(orcamento);
		}

		return retorno;
	}

}
