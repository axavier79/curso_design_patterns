package decorator_exercicio;

import chain_of_responsibility_alura.Item;
import decorator_alura.Imposto;
import decorator_alura.TemplateDeImpostoCondicional;
import strategy_alura.Orcamento;

public class IKCP extends TemplateDeImpostoCondicional {

	public IKCP(Imposto outroImposto) {
		super(outroImposto);
	}

	public IKCP() {
		super();
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100)
				return true;
		}

		return false;
	}

}
