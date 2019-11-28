//Imposto Muito Alto

package decorator_exercicio;

import decorator_alura.Imposto;
import strategy_alura.Orcamento;

public class IMA extends Imposto {

	public IMA(Imposto outroImposto) {
		super(outroImposto);
	}

	public IMA() {
		super();
	}

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calcularOutroImposto(orcamento);
	}

}
