package decorator_exercicio;

import chain_of_responsibility_alura.Item;
import decorator_alura.Imposto;
import decorator_alura.TemplateDeImpostoCondicional;
import strategy_alura.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {

	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}

	public IHIT() {
		super();
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return tem2ItensComMesmoNome(orcamento);
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (orcamento.getItens().size() * 0.01);
	}

	public boolean tem2ItensComMesmoNome(Orcamento orcamento) {
		String nomeItem = "";
		for (Item item : orcamento.getItens()) {
			if (nomeItem.isEmpty()) {
				nomeItem = item.getNome();
			} else {
				if (nomeItem.equals(item.getNome())) {
					return true;
				}
			}
		}

		return false;
	}

}
