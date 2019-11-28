package template_method_alura;

import strategy_alura.Imposto;
import strategy_alura.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public  double calcular(Orcamento orcamento) {

		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);

}
