package decorator_alura;

import strategy_alura.Orcamento;

public class ICMS extends Imposto {

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICMS() {
		super();
	}

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calcularOutroImposto(orcamento);
	}

}
