package decorator_alura;

import strategy_alura.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ISS() {
		super();
	}

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calcularOutroImposto(orcamento);
	}

}
