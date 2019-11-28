package decorator_alura;

import strategy_alura.Orcamento;

public abstract class Imposto {

	protected Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
		outroImposto = null;
	}

	public abstract double calcular(Orcamento orcamento);

	protected double calcularOutroImposto(Orcamento orcamento) {
		if (outroImposto == null)
			return 0;
		return outroImposto.calcular(orcamento);
	}

}
